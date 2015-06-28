package randoop;

import junit.framework.*;

public class RandoopTest52 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test1");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startAbsoluteLocationPath();
    var0.startAllNodeStep(100);
    var0.endAdditiveExpr(0);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.startPredicate();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test2");


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
    var0.endMultiplicativeExpr(1);
    var0.endAdditiveExpr((-1));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test3");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.endAndExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n");
    var0.endOrExpr(false);
    var0.startAndExpr();

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test4");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) number(0.0)\n(8) startAdditiveExpr()\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n");
    var0.startMultiplicativeExpr();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test5");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.startEqualityExpr();

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test6");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.number((-1.0d));
    var0.endAllNodeStep();
    var0.startMultiplicativeExpr();
    var0.startAndExpr();
    var0.startUnionExpr();
    var0.startTextNodeStep((-1));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test7");


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
    var8.endUnaryExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test8");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startAndExpr();
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endAndExpr(true);
    boolean var16 = var11.equals((java.lang.Object)'a');
    java.lang.String var17 = var11.toString();
    var11.startXPath();
    var11.startPathExpr();
    var11.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var11.startXPath();
    var11.endAndExpr(true);
    java.lang.String var27 = var11.toString();
    var11.endPredicate();
    var11.literal("hi!");
    var11.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    boolean var34 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endUnaryExpr(10);
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) endRelativeLocationPath()\n(7) endFunction()\n(8) endTextNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n\n          ^", "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test9");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endRelationalExpr(100);
    var0.endTextNodeStep();
    var0.startPredicate();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endAndExpr(true);
    boolean var17 = var12.equals((java.lang.Object)'a');
    java.lang.String var18 = var12.toString();
    var12.startXPath();
    var12.endAllNodeStep();
    var12.number(1);
    boolean var23 = var0.equals((java.lang.Object)var12);
    var12.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test10");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "^"+ "'", var8.equals("^"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test11");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.number(10.0d);
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startTextNodeStep(100);
    var0.number(100);
    var0.startUnaryExpr();

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test12");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.number(100);
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    var0.endAndExpr(true);
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n");
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startMultiplicativeExpr();

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test13");


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
    var0.endAllNodeStep();
    var0.endAdditiveExpr((-1));
    var0.endCommentNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endTextNodeStep();
    var20.endAdditiveExpr(1);
    var20.startCommentNodeStep((-1));
    var20.startCommentNodeStep(100);
    var20.endNameStep();
    var20.startEqualityExpr();
    var20.endUnaryExpr(10);
    var20.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    boolean var36 = var0.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test14");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.endNameStep();
    var0.endPathExpr();
    var0.endUnionExpr(true);
    var0.startPredicate();
    var0.startAndExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test15");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.number(10.0d);
    var0.endMultiplicativeExpr(10);
    var0.startAllNodeStep(10);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test16");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.number(100.0d);
    var0.endCommentNodeStep();

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test17");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(0);
    var0.endOrExpr(true);
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(100);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test18");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.number(100);
    var0.endRelationalExpr(100);
    var0.endUnaryExpr(1);
    var0.endCommentNodeStep();

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test19");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startXPath();
    var0.endPredicate();
    var0.number((-1));
    var0.endUnaryExpr(0);
    var0.endPathExpr();
    var0.startUnaryExpr();

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test20");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.variableReference("org.saxpath.SAXPathParseException: ", "org.saxpath.SAXPathException:  ^");
    var0.startFilterExpr();
    var0.endNameStep();
    var0.startXPath();
    var0.startCommentNodeStep(10);
    org.saxpath.conformance.ConformanceXPathHandler var18 = new org.saxpath.conformance.ConformanceXPathHandler();
    var18.startAbsoluteLocationPath();
    var18.endAndExpr(true);
    var18.endPathExpr();
    var18.endTextNodeStep();
    var18.startUnaryExpr();
    boolean var25 = var0.equals((java.lang.Object)var18);
    var0.number(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test21");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endMultiplicativeExpr((-1));
    var0.endCommentNodeStep();
    var0.literal("");
    var0.endRelationalExpr(1);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test22");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startAndExpr();
    org.saxpath.helpers.DefaultXPathHandler var4 = new org.saxpath.helpers.DefaultXPathHandler();
    var4.endFunction();
    var4.startUnaryExpr();
    var4.startPredicate();
    var4.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var4.startXPath();
    var4.endNameStep();
    var4.startTextNodeStep(1);
    var4.endCommentNodeStep();
    var4.endRelativeLocationPath();
    var4.startRelativeLocationPath();
    boolean var17 = var0.equals((java.lang.Object)var4);
    var4.variableReference("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n");
    var4.endAndExpr(false);
    var4.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test23");


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
    var8.endRelationalExpr(1);
    var8.startPredicate();
    var8.number(100);
    var8.startXPath();
    var8.endUnaryExpr(100);
    var8.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) endRelationalExpr(-1)\n(4) endAllNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endEqualityExpr(0)\n(6) startNameStep(100, \"\", \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(7) startUnaryExpr()\n");
    var8.startAllNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test24");


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
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endRelativeLocationPath();
    var18.endXPath();
    var18.startXPath();
    boolean var24 = var9.equals((java.lang.Object)var18);
    java.lang.String var25 = var9.toString();
    var9.startUnaryExpr();
    var9.startTextNodeStep(100);
    var9.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) endCommentNodeStep()\n(7) number(10)\n(8) endPathExpr()\n(9) endProcessingInstructionNodeStep()\n(10) startAdditiveExpr()\n(11) endAllNodeStep()\n(12) endMultiplicativeExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathParseException: \n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test25");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.endPathExpr();
    var0.endFunction();
    var0.startUnionExpr();
    var0.endPathExpr();
    var0.startCommentNodeStep(1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test26");


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
    org.saxpath.conformance.ConformanceXPathHandler var54 = new org.saxpath.conformance.ConformanceXPathHandler();
    var54.startAbsoluteLocationPath();
    var54.endAndExpr(true);
    var54.endPathExpr();
    var54.endTextNodeStep();
    var54.endRelativeLocationPath();
    var54.endPathExpr();
    var54.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var54);
    var54.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n(7) startPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n");
    var54.endTextNodeStep();
    var54.startAllNodeStep(1);
    var54.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test27");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startFilterExpr();
    var0.startPredicate();
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    var0.startTextNodeStep(1);
    var0.endXPath();
    var0.number((-1.0d));
    var0.startPredicate();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test28");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(1);
    var0.startPathExpr();
    var0.endOrExpr(false);
    var0.startCommentNodeStep(0);
    var0.endFilterExpr();
    var0.endRelationalExpr(100);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test29");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.endEqualityExpr(1);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test30");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endAndExpr(true);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.startXPath();
    com.werken.saxpath.XPathReader var11 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endTextNodeStep();
    var12.endUnionExpr(true);
    var11.setXPathHandler((org.saxpath.XPathHandler)var12);
    var12.endMultiplicativeExpr(10);
    boolean var20 = var0.equals((java.lang.Object)var12);
    var0.endFunction();
    var0.startTextNodeStep((-1));
    var0.startEqualityExpr();
    var0.startAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endAndExpr(true)\n(6) startPredicate()\n(7) endAndExpr(true)\n(8) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test31");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(0);
    var0.endTextNodeStep();
    var0.endAndExpr(true);
    var0.endPredicate();
    var0.endPredicate();
    var0.startPredicate();

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test32");


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
    var7.endXPath();
    var7.startOrExpr();
    var7.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test33");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startXPath();
    var0.startAllNodeStep(1);
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();
    var0.startAndExpr();
    var0.endRelationalExpr(100);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test34");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.endOrExpr(false);
    var0.number(10);
    var0.endPathExpr();
    var0.startAdditiveExpr();
    java.lang.String var14 = var0.toString();
    var0.startCommentNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n(3) endOrExpr(false)\n(4) number(10)\n(5) endPathExpr()\n(6) startAdditiveExpr()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n(3) endOrExpr(false)\n(4) number(10)\n(5) endPathExpr()\n(6) startAdditiveExpr()\n"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test35");


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
    var0.endOrExpr(false);
    var0.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test36");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n"+ "'", var2.equals("org.saxpath.SAXPathParseException: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test37");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startUnionExpr();
    var0.startTextNodeStep(10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test38");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startPredicate();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.endUnionExpr(true);
    var0.endPredicate();
    var0.endAndExpr(false);
    var0.endNameStep();

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test39");


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
    var0.endRelativeLocationPath();
    var0.startTextNodeStep(0);
    var0.endAdditiveExpr(100);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    var0.endProcessingInstructionNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n(9) endNameStep()\n(10) endAdditiveExpr(10)\n(11) startUnaryExpr()\n(12) startRelativeLocationPath()\n(13) endAdditiveExpr(10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test40");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test41");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.endRelationalExpr(0);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test42");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endPathExpr();
    var0.number(10.0d);
    var0.startAndExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n");
    var0.startCommentNodeStep(10);
    var0.startRelationalExpr();

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test43");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.startPathExpr();
    var0.endOrExpr(true);
    var0.startPredicate();
    var0.endPathExpr();
    var0.startAdditiveExpr();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test44");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endEqualityExpr(0);
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.startAndExpr();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test45");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.endXPath();
    var0.endEqualityExpr((-1));
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.startXPath();
    var0.endRelationalExpr(0);
    var0.endAbsoluteLocationPath();
    var0.startTextNodeStep(1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test46");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startCommentNodeStep((-1));
    var0.startAdditiveExpr();

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test47");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endRelationalExpr(100);
    var0.startRelationalExpr();
    var0.startPathExpr();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test48");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endFunction();
    var0.startMultiplicativeExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n");
    var0.endNameStep();

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test49");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startFunction("(0) endAllNodeStep()\n(1) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");
    var0.variableReference("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.number(100.0d);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test50");


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
    var0.endRelativeLocationPath();
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endTextNodeStep();
    var20.endAdditiveExpr(1);
    java.lang.String var25 = var20.toString();
    var20.startMultiplicativeExpr();
    var20.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var20.endAdditiveExpr(10);
    java.lang.String var32 = var20.toString();
    var20.endTextNodeStep();
    var20.endXPath();
    var20.number(10);
    boolean var37 = var0.equals((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"+ "'", var32.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test51");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: ^");
    var0.endRelationalExpr((-1));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test52");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startUnionExpr();
    var0.startXPath();
    var0.startOrExpr();
    var0.number(0.0d);
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test53");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAndExpr(true);
    var0.startProcessingInstructionNodeStep((-1), "(0) endAllNodeStep()\n(1) endXPath()\n(2) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(3) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(4) endAndExpr(false)\n");

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test54");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.startMultiplicativeExpr();
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.endUnaryExpr(0);
    var0.endPredicate();

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test55");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test56");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.endCommentNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n");
    var0.endAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test57");


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
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test58");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.startPathExpr();
    var0.endMultiplicativeExpr(1);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test59");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.endMultiplicativeExpr((-1));
    var0.endMultiplicativeExpr((-1));
    var0.literal("^");
    var0.endMultiplicativeExpr(0);
    var0.endRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    var20.endPathExpr();
    var20.endTextNodeStep();
    var20.startMultiplicativeExpr();
    var20.endFilterExpr();
    var20.endAdditiveExpr(1);
    var20.startAndExpr();
    boolean var31 = var0.equals((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test60");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startFilterExpr();
    var0.startXPath();
    var0.number(100.0d);
    var0.endFunction();
    var0.endRelativeLocationPath();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test61");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("hi!", " ^");
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.endRelationalExpr(0);
    var0.startCommentNodeStep(1);
    java.lang.String var19 = var0.toString();
    var0.number(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startAdditiveExpr()\n(8) endRelationalExpr(0)\n(9) startCommentNodeStep(1)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startAdditiveExpr()\n(8) endRelationalExpr(0)\n(9) startCommentNodeStep(1)\n"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test62");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.startPredicate();
    var0.endAllNodeStep();
    var0.endUnionExpr(true);
    var0.number(1);
    var0.endNameStep();
    var0.endNameStep();
    var0.endTextNodeStep();

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test63");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test64");


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
    org.saxpath.helpers.DefaultXPathHandler var52 = new org.saxpath.helpers.DefaultXPathHandler();
    var52.number(10.0d);
    var52.endPathExpr();
    var52.startOrExpr();
    var52.endProcessingInstructionNodeStep();
    var52.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var52);
    org.saxpath.conformance.ConformanceXPathHandler var60 = new org.saxpath.conformance.ConformanceXPathHandler();
    var60.startAbsoluteLocationPath();
    var60.endAndExpr(true);
    var60.endPathExpr();
    var60.endTextNodeStep();
    var60.startUnaryExpr();
    var60.endAbsoluteLocationPath();
    var60.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var60.startAllNodeStep(10);
    var60.endCommentNodeStep();
    var60.startUnaryExpr();
    var60.endCommentNodeStep();
    org.saxpath.helpers.DefaultXPathHandler var76 = new org.saxpath.helpers.DefaultXPathHandler();
    var76.number(10.0d);
    var76.endNameStep();
    var76.startAndExpr();
    var76.endRelativeLocationPath();
    var76.startFilterExpr();
    boolean var83 = var60.equals((java.lang.Object)var76);
    var60.endOrExpr(false);
    var60.endFunction();
    var0.setXPathHandler((org.saxpath.XPathHandler)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: 10: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test65");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.startEqualityExpr();
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.number(10.0d);
    var15.endRelativeLocationPath();
    var15.startRelativeLocationPath();
    var15.endFilterExpr();
    var15.endAdditiveExpr(100);
    var15.endRelationalExpr((-1));
    var15.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var15.endEqualityExpr((-1));
    var15.endOrExpr(true);
    var15.endRelationalExpr(1);
    boolean var34 = var0.equals((java.lang.Object)var15);
    var0.endAdditiveExpr((-1));
    var0.number(1.0d);
    var0.endAndExpr(false);
    var0.startRelativeLocationPath();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test66");


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
    var1.endUnionExpr(false);
    var1.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n");
    var1.startAndExpr();
    java.lang.String var20 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) endPredicate()\n(7) endUnionExpr(false)\n(8) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n\")\n(9) startAndExpr()\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) endPredicate()\n(7) endUnionExpr(false)\n(8) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n\")\n(9) startAndExpr()\n"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test67");


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
    var0.endAndExpr(false);
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(1);
    var0.startXPath();

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test68");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.number(1.0d);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test69");


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
    org.saxpath.helpers.DefaultXPathHandler var70 = new org.saxpath.helpers.DefaultXPathHandler();
    var70.endXPath();
    var70.endRelationalExpr(1);
    var70.endFilterExpr();
    var70.startCommentNodeStep(1);
    var70.startCommentNodeStep(1);
    var70.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var70);
    var70.startMultiplicativeExpr();
    
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

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test70");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endFunction();
    var0.startAdditiveExpr();
    var0.startPathExpr();
    var0.endUnionExpr(false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test71");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAllNodeStep(100);
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n\n          ^");

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test72");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.endUnionExpr(false);
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n\n                                                                                                    ^");
    var0.startAndExpr();
    var0.endTextNodeStep();

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test73");


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
    var0.startAbsoluteLocationPath();
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endPredicate()\n(8) endFilterExpr()\n(9) endUnionExpr(false)\n(10) endPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) startAndExpr()\n(8) startAbsoluteLocationPath()\n(9) startPathExpr()\n");
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test74");


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
    org.saxpath.conformance.ConformanceXPathHandler var70 = new org.saxpath.conformance.ConformanceXPathHandler();
    var70.startAbsoluteLocationPath();
    var70.endEqualityExpr((-1));
    var70.endTextNodeStep();
    var70.endCommentNodeStep();
    var70.startOrExpr();
    var70.startFilterExpr();
    var70.startFilterExpr();
    var70.endProcessingInstructionNodeStep();
    var70.endAdditiveExpr(1);
    var70.startXPath();
    var70.endFilterExpr();
    var70.endFunction();
    var70.startCommentNodeStep(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var70);
    var70.startPathExpr();
    
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

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test75");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var0.startUnionExpr();
    var0.startCommentNodeStep(1);
    var0.startRelativeLocationPath();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n(6) endUnaryExpr(10)\n");
    var0.startPredicate();
    var0.endUnionExpr(true);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test76");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("\n ^\n ^", "org.saxpath.SAXPathException:  ^");
    var0.endRelationalExpr(1);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endOrExpr(true);
    var0.endAllNodeStep();

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test77");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test78");


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
    var0.endAllNodeStep();
    var0.endFilterExpr();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test79");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.endEqualityExpr(1);
    var0.startMultiplicativeExpr();
    var0.endOrExpr(false);
    var0.startAllNodeStep(10);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test80");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.startAllNodeStep(0);
    var0.startXPath();
    var0.endAbsoluteLocationPath();
    var0.startXPath();

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test81");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.endNameStep();
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(100);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test82");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.getXPath();
    java.lang.String var8 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test83");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.literal("child");
    var0.startXPath();
    var0.startAndExpr();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(1);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test84");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var6 = var1.toString();
    java.lang.String var7 = var1.toString();
    java.lang.String var8 = var1.toString();
    java.lang.Throwable[] var9 = var1.getSuppressed();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var6.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var7.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var8.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test85");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    var0.number(100.0d);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startOrExpr();
    var0.endEqualityExpr(0);
    var0.endAdditiveExpr(1);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test86");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endOrExpr(false);
    var0.endAdditiveExpr(1);
    var0.startUnaryExpr();
    var0.startTextNodeStep((-1));
    var0.endAdditiveExpr(1);
    var0.startAbsoluteLocationPath();

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test87");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^");

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test88");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.endFilterExpr();
    var0.endRelationalExpr((-1));
    var0.endTextNodeStep();
    var0.literal("                                                                                                    ^");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "org.saxpath.SAXPathException:  ^");
    var0.startOrExpr();
    var0.startAndExpr();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test89");


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
    var0.startPredicate();
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test90");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    org.saxpath.conformance.ConformanceXPathHandler var9 = new org.saxpath.conformance.ConformanceXPathHandler();
    var9.startAbsoluteLocationPath();
    var9.startNameStep(100, " ^", " ^");
    var9.endUnionExpr(false);
    boolean var17 = var0.equals((java.lang.Object)var9);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endXPath();
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test91");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endMultiplicativeExpr(0);
    var0.endRelationalExpr(1);
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.number(10.0d);
    var15.startCommentNodeStep(0);
    var15.startOrExpr();
    var15.startUnionExpr();
    var15.startAbsoluteLocationPath();
    var15.endNameStep();
    var15.number(0.0d);
    boolean var26 = var0.equals((java.lang.Object)var15);
    var0.endMultiplicativeExpr(0);
    var0.startXPath();
    var0.endUnionExpr(false);
    var0.startTextNodeStep(1);
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test92");


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
    var8.number(0);
    var8.number(1.0d);
    var8.endPredicate();
    var8.endOrExpr(true);
    var8.startPredicate();
    var8.startPredicate();
    var8.endAdditiveExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test93");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.endXPath();
    var0.endPathExpr();
    var0.endXPath();
    var0.endOrExpr(false);
    var0.endAndExpr(true);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) startUnionExpr()\n(8) startPathExpr()\n(9) endProcessingInstructionNodeStep()\n(10) endAllNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endMultiplicativeExpr((-1));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test94");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.number(10);
    var0.endAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endUnionExpr(true);
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test95");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startAbsoluteLocationPath();
    var0.number(1);
    var0.endPathExpr();
    var0.number(0);
    var0.startPredicate();
    var0.endRelativeLocationPath();

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test96");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.startTextNodeStep(10);
    var0.startPathExpr();

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test97");


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
    var0.startXPath();
    var0.startTextNodeStep(0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test98");


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
    var6.endCommentNodeStep();
    var6.startAdditiveExpr();
    var6.startAllNodeStep(0);
    var6.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test99");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endPathExpr();
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startCommentNodeStep((-1));
    var0.startPredicate();
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test100");


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
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endRelativeLocationPath();
    var18.endXPath();
    var18.startXPath();
    boolean var24 = var9.equals((java.lang.Object)var18);
    java.lang.String var25 = var9.toString();
    var9.startUnaryExpr();
    var9.startTextNodeStep(100);
    var9.startAllNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test101");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n"+ "'", var2.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test102");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test103");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n", 0, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) endCommentNodeStep()\n");

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test104");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.startTextNodeStep(10);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test105");


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
    org.saxpath.XPathHandler var18 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endRelativeLocationPath();
    var19.startRelativeLocationPath();
    var19.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var19.endRelationalExpr(1);
    var19.endPredicate();
    var19.endEqualityExpr(10);
    var19.startTextNodeStep((-1));
    var19.endPathExpr();
    var19.startEqualityExpr();
    var19.startFilterExpr();
    var19.startTextNodeStep(10);
    var19.startFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var19);
    var19.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test106");


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
    var8.number(10);
    var8.endAndExpr(false);
    var8.startMultiplicativeExpr();
    var8.startUnionExpr();
    var8.number((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test107");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(1);
    var0.startAndExpr();
    var0.endAndExpr(false);
    var0.endAndExpr(false);
    var0.endAdditiveExpr(0);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test108");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr((-1));
    var0.startFilterExpr();
    var0.variableReference(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endAndExpr(false);
    var0.startPathExpr();

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test109");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.endCommentNodeStep();
    var0.startEqualityExpr();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.endPathExpr();

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test110");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\n ^");

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test111");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.toString();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.toString();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    int var11 = var3.getPosition();
    int var12 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test112");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "\n ^\n ^");
    var0.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test113");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", 100, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test114");


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
    var0.startCommentNodeStep(100);
    var0.number(1.0d);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test115");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(1);
    var0.endNameStep();
    var0.startCommentNodeStep(10);
    var0.endAdditiveExpr(0);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endNameStep()\n(8) endNameStep()\n(9) endOrExpr(true)\n(10) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test116");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.endFunction();
    var0.endEqualityExpr(1);
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n");
    var0.endPredicate();

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test117");


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
    var8.startTextNodeStep((-1));
    var8.startRelativeLocationPath();
    var8.startAbsoluteLocationPath();
    var8.startRelativeLocationPath();
    var8.startAbsoluteLocationPath();
    var8.literal("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var8.startAllNodeStep(1);
    var8.endOrExpr(true);
    var8.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test118");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", (-1), "org.saxpath.SAXPathException: ^");
    org.saxpath.SAXPathParseException var5 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startFunction(\" ^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(3) variableReference(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:child\")\n(4) number(0.0)\n(5) endEqualityExpr(100)\n(6) endUnaryExpr(0)\n(7) endFilterExpr()\n(8) endRelativeLocationPath()\n(9) endFilterExpr()\n");
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test119");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(100);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n");
    var0.startTextNodeStep(10);
    var0.endXPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(true)\n(5) endEqualityExpr(1)\n(6) startCommentNodeStep(0)\n(7) endPathExpr()\n(8) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\")\n(9) endFunction()\n(10) startPredicate()\n");
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test120");


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
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endXPath();
    var0.endAndExpr(false);
    var0.endAllNodeStep();

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test121");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.startFilterExpr();
    var0.endXPath();
    var0.startPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test122");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startAllNodeStep(0);
    var0.startPredicate();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endAdditiveExpr(10);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) startAbsoluteLocationPath()\n(11) startAndExpr()\n(12) startPathExpr()\n");

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test123");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.startAndExpr();
    var0.startAllNodeStep(1);
    var0.startUnaryExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.endPredicate();
    var0.startEqualityExpr();

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test124");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.XPathSyntaxException var9 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var10 = var9.getPositionMarker();
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var15 = var14.getMultilineMessage();
    int var16 = var14.getPosition();
    org.saxpath.SAXPathParseException var18 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var14.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var20 = var14.getXPath();
    var9.addSuppressed((java.lang.Throwable)var14);
    java.lang.String var22 = var9.getPositionMarker();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException((java.lang.Throwable)var9);
    org.saxpath.XPathSyntaxException var27 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var28 = var27.toString();
    org.saxpath.SAXPathException var29 = new org.saxpath.SAXPathException((java.lang.Throwable)var27);
    java.lang.Throwable[] var30 = var29.getSuppressed();
    org.saxpath.SAXPathException var31 = new org.saxpath.SAXPathException((java.lang.Throwable)var29);
    var9.addSuppressed((java.lang.Throwable)var31);
    var3.addSuppressed((java.lang.Throwable)var9);
    int var34 = var9.getPosition();
    int var35 = var9.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "^"+ "'", var4.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "                                                                                                    ^"+ "'", var10.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "\n ^\n ^"+ "'", var15.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + " ^"+ "'", var20.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "                                                                                                    ^"+ "'", var22.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var28.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test125");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.endOrExpr(false);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAllNodeStep(100);
    var0.endXPath();
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test126");


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
    var8.number(10);
    var8.startXPath();
    var8.startAllNodeStep(10);
    var8.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test127");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(0, "hi!");
    var0.endTextNodeStep();
    var0.endFunction();
    var0.startCommentNodeStep((-1));
    var0.startOrExpr();
    var0.number(1);
    var0.endCommentNodeStep();

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test128");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endAdditiveExpr(100)\n(5) startRelationalExpr()\n(6) endProcessingInstructionNodeStep()\n(7) startNameStep(-1, \"org.saxpath.SAXPathException: child\", \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:org.saxpath.SAXPathException:  ^\")\n(5) number(10)\n(6) endTextNodeStep()\n");

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test129");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n");
    org.saxpath.XPathHandler var46 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var47 = new org.saxpath.helpers.DefaultXPathHandler();
    var47.number(10.0d);
    var47.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var47.startUnionExpr();
    var47.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var47.endEqualityExpr(10);
    var47.endMultiplicativeExpr((-1));
    var47.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var47);
    org.saxpath.helpers.DefaultXPathHandler var64 = new org.saxpath.helpers.DefaultXPathHandler();
    var64.number(10.0d);
    var64.endPathExpr();
    var64.endUnionExpr(false);
    var64.endEqualityExpr(1);
    var64.endXPath();
    var64.endMultiplicativeExpr(0);
    var64.startAndExpr();
    var64.endCommentNodeStep();
    var64.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.setXPathHandler((org.saxpath.XPathHandler)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test130");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    int var10 = var3.getPosition();
    java.lang.Throwable[] var11 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var19 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.getPositionMarker();
    var15.addSuppressed((java.lang.Throwable)var19);
    java.lang.Throwable[] var23 = var19.getSuppressed();
    java.lang.String var24 = var19.toString();
    var3.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var26 = var3.getXPath();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var20.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + " ^"+ "'", var21.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test131");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n", 100, "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n\n                                                                                                    ^"+ "'", var5.equals("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "                                                                                                    ^"+ "'", var6.equals("                                                                                                    ^"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test132");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.startPredicate();
    var0.endAllNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAndExpr()\n(6) endUnaryExpr(0)\n(7) startXPath()\n(8) startFilterExpr()\n(9) startNameStep(1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\")\n(10) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n(7) startFilterExpr()\n(8) endFilterExpr()\n(9) startRelativeLocationPath()\n(10) startPathExpr()\n(11) endAdditiveExpr(-1)\n(12) startEqualityExpr()\n(13) endMultiplicativeExpr(10)\n(14) endOrExpr(false)\n");

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test133");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", 10, "child\norg.saxpath.SAXPathException:  ^\n^");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.toString();
    int var8 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "child\norg.saxpath.SAXPathException:  ^\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n          ^"+ "'", var5.equals("child\norg.saxpath.SAXPathException:  ^\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "child\norg.saxpath.SAXPathException:  ^\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n          ^"+ "'", var6.equals("child\norg.saxpath.SAXPathException:  ^\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: child\norg.saxpath.SAXPathException:  ^\n^"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 10: child\norg.saxpath.SAXPathException:  ^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test134");


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
    org.saxpath.helpers.DefaultXPathHandler var24 = new org.saxpath.helpers.DefaultXPathHandler();
    var24.endRelativeLocationPath();
    var24.startUnaryExpr();
    var24.startAndExpr();
    var24.endAndExpr(true);
    var24.startTextNodeStep(0);
    boolean var32 = var8.equals((java.lang.Object)var24);
    var8.startAllNodeStep(0);
    var8.endUnaryExpr(10);
    var8.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test135");


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
    var20.endNameStep();
    var20.endFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.helpers.DefaultXPathHandler var26 = new org.saxpath.helpers.DefaultXPathHandler();
    var26.number(10.0d);
    var26.endRelativeLocationPath();
    var26.number(10);
    var26.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var26.literal("org.saxpath.SAXPathException:  ^");
    var26.startOrExpr();
    var26.startRelationalExpr();
    var26.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var26);
    var26.endAdditiveExpr((-1));
    var26.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test136");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endRelationalExpr(1);
    var0.startXPath();
    var0.endFunction();

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test137");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr((-1));
    var0.startAndExpr();

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test138");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.startMultiplicativeExpr();
    var0.startUnionExpr();
    var0.startOrExpr();

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test139");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.startTextNodeStep(10);
    var0.startAndExpr();
    var0.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    boolean var21 = var16.equals((java.lang.Object)'a');
    java.lang.String var22 = var16.toString();
    var16.startXPath();
    var16.endAllNodeStep();
    var16.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var16.number(100.0d);
    var16.endMultiplicativeExpr((-1));
    var16.endPathExpr();
    var16.startNameStep((-1), "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    boolean var37 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.endUnionExpr(false);
    var0.startNameStep(0, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) number(100)\n(7) endAndExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startUnionExpr()\n(6) endPredicate()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test140");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endAdditiveExpr(10);
    var0.endFilterExpr();
    var0.startNameStep(0, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^");
    var0.startFilterExpr();
    var0.endAllNodeStep();

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test141");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", 0, "org.saxpath.SAXPathParseException: ");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.saxpath.SAXPathParseException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n^"+ "'", var7.equals("org.saxpath.SAXPathParseException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n^"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test142");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.startAllNodeStep(0);
    var0.startPredicate();
    var0.endCommentNodeStep();
    var0.endAdditiveExpr((-1));
    var0.startAdditiveExpr();

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test143");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endAdditiveExpr((-1));
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endAdditiveExpr(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAbsoluteLocationPath()\n(10) endMultiplicativeExpr(10)\n(11) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test144");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(true);
    java.lang.String var12 = var0.toString();
    var0.startAndExpr();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startOrExpr();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test145");


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
    var9.startPathExpr();
    com.werken.saxpath.XPathReader var20 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var21 = new org.saxpath.conformance.ConformanceXPathHandler();
    var21.startAbsoluteLocationPath();
    var21.endUnaryExpr(10);
    var21.number(1);
    var21.startAllNodeStep((-1));
    var21.startOrExpr();
    var20.setXPathHandler((org.saxpath.XPathHandler)var21);
    var21.endAndExpr(true);
    var21.number(0.0d);
    boolean var35 = var9.equals((java.lang.Object)0.0d);
    var9.endAllNodeStep();
    var9.endOrExpr(false);
    var9.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test146");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.toString();
    java.lang.String var18 = var16.getPositionMarker();
    var12.addSuppressed((java.lang.Throwable)var16);
    org.saxpath.XPathSyntaxException var23 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var24 = var23.getXPath();
    java.lang.String var25 = var23.getXPath();
    int var26 = var23.getPosition();
    java.lang.String var27 = var23.getMultilineMessage();
    java.lang.String var28 = var23.toString();
    var16.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var30 = var23.toString();
    var6.addSuppressed((java.lang.Throwable)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var28.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test147");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\norg.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n\n                                                                                                    ^");

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test148");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.endAbsoluteLocationPath();
    var0.startFilterExpr();
    var0.endAllNodeStep();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startPathExpr()\n(5) endPredicate()\n");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var0.endUnaryExpr(0);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test149");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.endRelationalExpr(1);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test150");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) startCommentNodeStep(-1)\n(7) startAbsoluteLocationPath()\n(8) endAndExpr(true)\n(9) startNameStep(10, \"namespace\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n(10) endMultiplicativeExpr(-1)\n(11) endFunction()\n(12) startUnaryExpr()\n(13) startRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test151");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.endEqualityExpr(0);
    var0.number((-1));
    var0.endAdditiveExpr((-1));
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.startRelativeLocationPath();

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test152");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.startUnionExpr();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.variableReference("hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.endCommentNodeStep();
    var0.number(0.0d);
    var0.startXPath();
    var0.startOrExpr();

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test153");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAllNodeStep(100);
    var0.endAndExpr(true);
    java.lang.String var17 = var0.toString();
    var0.endMultiplicativeExpr(1);
    var0.startTextNodeStep(0);
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test154");


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
    var0.startAndExpr();
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test155");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(0);
    var0.endTextNodeStep();
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.number(100.0d);
    var0.endAllNodeStep();
    var0.startRelativeLocationPath();
    var0.endUnionExpr(true);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test156");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.startPathExpr();
    var0.endRelationalExpr((-1));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test157");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startNameStep(1, "^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endTextNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startAllNodeStep(1);
    var0.endUnionExpr(true);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test158");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startProcessingInstructionNodeStep(100, "hi!");
    var0.startXPath();
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.startAllNodeStep(100);
    var0.startAllNodeStep((-1));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test159");


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
    var0.startAbsoluteLocationPath();
    var0.startUnionExpr();
    var0.endRelationalExpr(1);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test160");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endRelationalExpr(1);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startFilterExpr();

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test161");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var0.endMultiplicativeExpr(1);
    var0.endRelativeLocationPath();
    var0.startUnionExpr();
    var0.startTextNodeStep((-1));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test162");


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
    var9.startMultiplicativeExpr();
    var9.startAllNodeStep(10);
    var9.startFilterExpr();
    var9.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test163");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endUnaryExpr(100);
    var0.endTextNodeStep();
    var0.endFilterExpr();
    var0.startOrExpr();
    var0.startAllNodeStep((-1));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test164");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.endAdditiveExpr(100);
    var0.startAllNodeStep(100);
    var0.startAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test165");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) endUnionExpr(false)\n(6) endPredicate()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.startAbsoluteLocationPath();

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test166");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.endNameStep();
    var0.endMultiplicativeExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startPathExpr();
    var0.endNameStep();
    var0.endPredicate();
    var0.startCommentNodeStep(10);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test167");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startPredicate();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.number(100);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test168");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endFunction();
    var0.endTextNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endEqualityExpr((-1));
    var13.endTextNodeStep();
    var13.endTextNodeStep();
    var13.endAllNodeStep();
    var13.startTextNodeStep(100);
    var13.endPredicate();
    boolean var23 = var0.equals((java.lang.Object)var13);
    var13.endTextNodeStep();
    var13.startUnionExpr();
    var13.number(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test169");


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
    org.saxpath.helpers.DefaultXPathHandler var22 = new org.saxpath.helpers.DefaultXPathHandler();
    var22.number(10.0d);
    var22.endRelativeLocationPath();
    var22.number(10);
    var22.startOrExpr();
    var22.startPathExpr();
    var22.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var22);
    org.saxpath.XPathHandler var32 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var33 = new org.saxpath.conformance.ConformanceXPathHandler();
    var33.startAbsoluteLocationPath();
    var33.endAndExpr(true);
    boolean var38 = var33.equals((java.lang.Object)'a');
    var33.startAbsoluteLocationPath();
    var33.startRelativeLocationPath();
    var33.endTextNodeStep();
    java.lang.String var42 = var33.toString();
    var33.endAndExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var33);
    org.saxpath.XPathHandler var46 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var47 = new org.saxpath.helpers.DefaultXPathHandler();
    var47.number(10.0d);
    var47.endRelativeLocationPath();
    var47.endXPath();
    var47.endProcessingInstructionNodeStep();
    var47.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n");
    var47.startProcessingInstructionNodeStep((-1), "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var47);
    var47.number(10.0d);
    var47.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n"+ "'", var42.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test170");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.number(1);
    var0.startAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test171");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endPredicate();
    var0.startTextNodeStep(10);
    var0.startUnionExpr();
    var0.endRelativeLocationPath();

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test172");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.number(0);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test173");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n\")\n(5) startAllNodeStep(0)\n");
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n");
    java.lang.String var15 = var0.toString();
    var0.endAdditiveExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endUnionExpr(false)\n(6) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n\")\n(5) startAllNodeStep(0)\n\")\n(7) startFunction(\"com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n\")\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endUnionExpr(false)\n(6) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n\")\n(5) startAllNodeStep(0)\n\")\n(7) startFunction(\"com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n\")\n"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test174");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startAndExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test175");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.endRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.startXPath();
    var0.endAndExpr(true);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test176");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startPredicate();
    var0.number((-1));
    var0.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test177");


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
    var8.variableReference("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var8.startAndExpr();
    var8.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test178");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("\n ^\n ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getPositionMarker();
    java.lang.String var7 = var5.toString();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.String var9 = var5.getMultilineMessage();
    java.lang.String var10 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    org.saxpath.SAXPathException var12 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.String var13 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test179");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    java.lang.String var7 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test180");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startMultiplicativeExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n(7) startFilterExpr()\n(8) startRelationalExpr()\n(9) startRelativeLocationPath()\n");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test181");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endFunction();
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startOrExpr();
    var0.endRelationalExpr(1);
    var0.startOrExpr();

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test182");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getXPath();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getXPath();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var13 = var12.getPositionMarker();
    java.lang.String var14 = var12.toString();
    java.lang.String var15 = var12.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var17 = var12.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + " ^"+ "'", var15.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test183");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 10: ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test184");


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
    var0.endEqualityExpr(10);
    org.saxpath.helpers.DefaultXPathHandler var13 = new org.saxpath.helpers.DefaultXPathHandler();
    var13.number(10.0d);
    var13.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var13.startAdditiveExpr();
    var13.endXPath();
    var13.endRelativeLocationPath();
    var13.endEqualityExpr(10);
    var13.endEqualityExpr(100);
    boolean var26 = var0.equals((java.lang.Object)var13);
    var13.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test185");


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
    var0.parse("child\norg.saxpath.SAXPathException:  ^\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n          ^");
    org.saxpath.conformance.ConformanceXPathHandler var19 = new org.saxpath.conformance.ConformanceXPathHandler();
    var19.startAbsoluteLocationPath();
    var19.endAndExpr(true);
    boolean var24 = var19.equals((java.lang.Object)'a');
    var19.startAbsoluteLocationPath();
    var19.startRelativeLocationPath();
    var19.endRelationalExpr(10);
    var19.endAdditiveExpr(100);
    var19.endOrExpr(false);
    java.lang.String var33 = var19.toString();
    var19.endFunction();
    var0.setXPathHandler((org.saxpath.XPathHandler)var19);
    org.saxpath.conformance.ConformanceXPathHandler var36 = new org.saxpath.conformance.ConformanceXPathHandler();
    var36.startAbsoluteLocationPath();
    var36.endPathExpr();
    var36.startUnionExpr();
    var36.startEqualityExpr();
    var36.startFilterExpr();
    var36.startUnionExpr();
    var36.startAllNodeStep(1);
    var36.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var36.startRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n"+ "'", var33.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test186");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.endAndExpr(true);
    var0.endEqualityExpr(100);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startAbsoluteLocationPath();
    var0.endXPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startRelationalExpr()\n");

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test187");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    java.lang.String var2 = var0.toString();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "(0) startRelativeLocationPath()\n"+ "'", var2.equals("(0) startRelativeLocationPath()\n"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test188");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(true);
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(false);
    var0.startUnaryExpr();
    var0.endAllNodeStep();

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test189");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.startRelationalExpr();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "org.saxpath.SAXPathParseException: ");
    var0.endRelationalExpr(10);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test190");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) startTextNodeStep(10)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n(9) variableReference(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(10) endProcessingInstructionNodeStep()\n");

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test191");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(1);
    var0.startProcessingInstructionNodeStep(1, "hi!");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelationalExpr()\n");
    var0.startUnaryExpr();
    var0.startTextNodeStep(1);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test192");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endFunction();
    var0.startRelativeLocationPath();
    var0.number(1);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test193");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var11 = var3.getXPath();
    java.lang.String var12 = var3.getMultilineMessage();
    java.lang.String var13 = var3.toString();
    int var14 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var12.equals("org.saxpath.SAXPathParseException: \nhi!\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test194");


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
    var8.startOrExpr();
    var8.endUnionExpr(true);
    var8.endFunction();
    var8.endAndExpr(true);
    var8.endRelationalExpr(1);
    var8.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n");
    var8.number(10);
    var8.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test195");


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
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    var0.startPredicate();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) endPredicate()\n(6) startAbsoluteLocationPath()\n(7) endFilterExpr()\n", "child\norg.saxpath.SAXPathException:  ^\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n          ^");
    var0.startXPath();

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test196");


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
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endRelativeLocationPath();
    var18.endXPath();
    var18.startXPath();
    boolean var24 = var9.equals((java.lang.Object)var18);
    var9.endUnionExpr(false);
    var9.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test197");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endCommentNodeStep();
    var0.literal("");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAndExpr(true);
    var0.startTextNodeStep((-1));
    var0.startEqualityExpr();
    var0.number(1);
    var0.endAndExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test198");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endFilterExpr();
    var0.number((-1));
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endOrExpr(true);
    var0.endOrExpr(true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test199");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startTextNodeStep(1);
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test200");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endMultiplicativeExpr(10)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test201");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(1);
    var0.endOrExpr(false);
    var0.endFunction();
    var0.endUnaryExpr(100);
    var0.startUnaryExpr();
    java.lang.String var15 = var0.toString();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n"));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test202");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.endTextNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");
    var0.startUnaryExpr();
    var0.endNameStep();
    var0.number(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test203");


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
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n", "org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.endPathExpr();
    var0.endEqualityExpr(100);
    var0.number(0);
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test204");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.startAllNodeStep((-1));
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.endNameStep();
    var0.endFilterExpr();
    var0.endNameStep();
    var0.startAndExpr();
    var0.endEqualityExpr(10);
    var0.endUnionExpr(true);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test205");


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
    var14.startAllNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test206");


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
    var51.startXPath();
    var51.startUnaryExpr();
    var51.endTextNodeStep();
    
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

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test207");


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
    var8.endTextNodeStep();
    var8.startAndExpr();
    var8.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test208");


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
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: ^\ncom.werken.saxpath.XPathSyntaxException: 1: \n ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endOrExpr(true);
    var0.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test209");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) startAllNodeStep(10)\n(5) endPathExpr()\n(6) endRelativeLocationPath()\n");

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test210");


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
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    boolean var25 = var20.equals((java.lang.Object)'a');
    java.lang.String var26 = var20.toString();
    var20.startXPath();
    var20.startPathExpr();
    var20.startAdditiveExpr();
    var20.startEqualityExpr();
    var20.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var20.startAllNodeStep(100);
    var20.endPathExpr();
    var20.startRelativeLocationPath();
    var20.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var20.startNameStep(1, "namespace", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.helpers.DefaultXPathHandler var45 = new org.saxpath.helpers.DefaultXPathHandler();
    var45.endXPath();
    var45.endFilterExpr();
    var45.endRelativeLocationPath();
    var45.number(100.0d);
    var45.number(100);
    var45.number(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    org.saxpath.helpers.DefaultXPathHandler var56 = new org.saxpath.helpers.DefaultXPathHandler();
    var56.number(10.0d);
    var56.endRelativeLocationPath();
    var56.startRelativeLocationPath();
    var56.endFilterExpr();
    var56.endAdditiveExpr(100);
    var56.startRelativeLocationPath();
    var56.number(10.0d);
    var56.endPredicate();
    var56.startFilterExpr();
    var56.startXPath();
    var56.endXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test211");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endAbsoluteLocationPath();
    var0.endFunction();
    var0.startTextNodeStep(0);
    var0.endFilterExpr();
    com.werken.saxpath.XPathReader var12 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endTextNodeStep();
    var13.endUnionExpr(true);
    var12.setXPathHandler((org.saxpath.XPathHandler)var13);
    var12.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    org.saxpath.XPathHandler var21 = var12.getXPathHandler();
    var12.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");
    org.saxpath.conformance.ConformanceXPathHandler var24 = new org.saxpath.conformance.ConformanceXPathHandler();
    var24.startAbsoluteLocationPath();
    var24.endPathExpr();
    var24.startUnionExpr();
    var24.startEqualityExpr();
    java.lang.String var29 = var24.toString();
    var24.startUnaryExpr();
    var24.startAdditiveExpr();
    var24.endPredicate();
    var24.endProcessingInstructionNodeStep();
    var24.startRelativeLocationPath();
    var12.setXPathHandler((org.saxpath.XPathHandler)var24);
    org.saxpath.helpers.DefaultXPathHandler var36 = new org.saxpath.helpers.DefaultXPathHandler();
    var36.endRelativeLocationPath();
    var36.endFilterExpr();
    var36.endUnionExpr(false);
    var36.endCommentNodeStep();
    var36.startTextNodeStep(1);
    var36.startTextNodeStep(10);
    var12.setXPathHandler((org.saxpath.XPathHandler)var36);
    boolean var47 = var0.equals((java.lang.Object)var12);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n^", "com.werken.saxpath.XPathSyntaxException: 100: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test212");


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
    var7.endFunction();
    var7.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n(9) startCommentNodeStep(-1)\n(10) startFilterExpr()\n");
    var7.startFilterExpr();
    var7.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test213");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endEqualityExpr(10);
    var0.startEqualityExpr();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.endPathExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endRelationalExpr(100)\n(7) endCommentNodeStep()\n(8) number(-1.0)\n(9) startRelativeLocationPath()\n(10) endAdditiveExpr(1)\n(11) startOrExpr()\n");

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test214");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var11 = var3.getXPath();
    java.lang.String var12 = var3.getXPath();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.getXPath();
    org.saxpath.XPathSyntaxException var18 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var22 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var23 = var22.getXPath();
    var18.addSuppressed((java.lang.Throwable)var22);
    java.lang.String var25 = var18.toString();
    java.lang.String var26 = var18.toString();
    java.lang.String var27 = var18.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var29 = var18.toString();
    java.lang.String var30 = var18.getMultilineMessage();
    
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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "                                                                                                    ^"+ "'", var27.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var29.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"+ "'", var30.equals("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test215");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.endEqualityExpr((-1));
    var0.startTextNodeStep(0);
    var0.endMultiplicativeExpr(1);
    var0.number(10.0d);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test216");


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
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    org.saxpath.conformance.ConformanceXPathHandler var21 = new org.saxpath.conformance.ConformanceXPathHandler();
    var21.startAbsoluteLocationPath();
    var21.endUnaryExpr(10);
    var21.number(1);
    boolean var28 = var21.equals((java.lang.Object)10L);
    var21.startCommentNodeStep(100);
    var21.startUnionExpr();
    boolean var32 = var0.equals((java.lang.Object)var21);
    var21.startAllNodeStep((-1));
    org.saxpath.conformance.ConformanceXPathHandler var35 = new org.saxpath.conformance.ConformanceXPathHandler();
    var35.startAbsoluteLocationPath();
    var35.endAndExpr(true);
    var35.endPathExpr();
    var35.endTextNodeStep();
    var35.endRelativeLocationPath();
    var35.endPathExpr();
    var35.number((-1.0d));
    var35.endFunction();
    var35.endRelationalExpr((-1));
    var35.number(0.0d);
    boolean var50 = var21.equals((java.lang.Object)var35);
    var35.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test217");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("^\norg.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\n ^", (-1), "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n");

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test218");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startXPath();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) endRelationalExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) startRelativeLocationPath()\n(3) startTextNodeStep(10)\n(4) endXPath()\n(5) endUnionExpr(false)\n", "com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 100:  ^");

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test219");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(0);
    var0.endAllNodeStep();
    var0.startRelativeLocationPath();
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test220");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var7 = new org.saxpath.conformance.ConformanceXPathHandler();
    var7.startAbsoluteLocationPath();
    var7.endAndExpr(true);
    boolean var12 = var7.equals((java.lang.Object)'a');
    var7.startAllNodeStep(100);
    var7.endOrExpr(false);
    var7.number(10);
    boolean var19 = var0.equals((java.lang.Object)var7);
    var7.endNameStep();
    var7.endUnaryExpr(100);
    var7.startTextNodeStep(1);
    var7.endOrExpr(true);
    var7.startAllNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test221");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endUnaryExpr((-1));
    var0.endOrExpr(false);
    var0.endXPath();
    var0.startAbsoluteLocationPath();

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test222");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr((-1));
    var0.endAdditiveExpr((-1));
    var0.startRelationalExpr();
    var0.endXPath();
    var0.endXPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endXPath()\n");
    var0.startAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test223");


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
    var0.endXPath();
    var0.endAbsoluteLocationPath();
    var0.number(10.0d);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endMultiplicativeExpr(1)\n(3) endFunction()\n(4) endAndExpr(true)\n(5) startProcessingInstructionNodeStep(100, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n\")\n(6) startFilterExpr()\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n(4) number(0)\n(5) number(1.0)\n(6) endPredicate()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test224");


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
    var0.endPathExpr();
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test225");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "^");
    var0.startRelativeLocationPath();
    var0.endAbsoluteLocationPath();
    var0.endAndExpr(true);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test226");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep((-1));
    var0.startRelativeLocationPath();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.endXPath();
    var0.literal("(0) endAllNodeStep()\n(1) endAbsoluteLocationPath()\n(2) startXPath()\n(3) endFilterExpr()\n(4) startFilterExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test227");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("\n ^\n ^");
    java.lang.String var2 = var1.toString();
    org.saxpath.XPathSyntaxException var6 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: child", 0, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.String var7 = var6.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var9 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: \n ^\n ^"+ "'", var2.equals("org.saxpath.SAXPathParseException: \n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \ncom.werken.saxpath.XPathSyntaxException: -1: child\n^"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \ncom.werken.saxpath.XPathSyntaxException: -1: child\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test228");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", (-1), "org.saxpath.SAXPathException: ");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathException: \ncom.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^"+ "'", var6.equals("org.saxpath.SAXPathException: \ncom.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test229");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test230");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endRelativeLocationPath();
    var0.endPredicate();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.endAbsoluteLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endPathExpr();
    var10.startUnionExpr();
    var10.startEqualityExpr();
    var10.startFilterExpr();
    var10.startAbsoluteLocationPath();
    java.lang.String var17 = var10.toString();
    var10.startPredicate();
    var10.endAndExpr(false);
    org.saxpath.conformance.ConformanceXPathHandler var21 = new org.saxpath.conformance.ConformanceXPathHandler();
    var21.startAbsoluteLocationPath();
    var21.endAndExpr(true);
    boolean var26 = var21.equals((java.lang.Object)'a');
    var21.startAbsoluteLocationPath();
    var21.startRelativeLocationPath();
    var21.endRelationalExpr(10);
    var21.endAdditiveExpr(100);
    var21.startAllNodeStep(100);
    var21.endUnaryExpr(10);
    var21.startTextNodeStep(100);
    boolean var39 = var10.equals((java.lang.Object)var21);
    var21.variableReference("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var21.endCommentNodeStep();
    var21.endPathExpr();
    boolean var45 = var0.equals((java.lang.Object)var21);
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test231");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.startPathExpr();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test232");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "org.saxpath.SAXPathException:  ^");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) endRelativeLocationPath()\n(5) endPathExpr()\n(6) startRelationalExpr()\n(7) endAbsoluteLocationPath()\n(8) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) startPathExpr()\n(7) startMultiplicativeExpr()\n(8) number(-1.0)\n:com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\")\n");

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test233");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endFunction();
    var0.startAllNodeStep(0);
    var0.startXPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endProcessingInstructionNodeStep()\n(4) startUnionExpr()\n(5) endOrExpr(true)\n(6) startPredicate()\n", "com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startRelationalExpr();

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test234");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endRelativeLocationPath();
    var0.endPredicate();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.endAbsoluteLocationPath();
    var0.startFunction("(0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) endAdditiveExpr(1)\n(2) startMultiplicativeExpr()\n(3) endTextNodeStep()\n(4) number(0.0)\n", "");
    var0.endAdditiveExpr(1);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test235");


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
    var0.endPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();
    var0.startRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.endAllNodeStep();
    var20.endAllNodeStep();
    boolean var23 = var0.equals((java.lang.Object)var20);
    var20.endRelativeLocationPath();
    var20.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test236");


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
    var16.endXPath();
    var16.startAndExpr();
    var16.startPredicate();
    var16.endProcessingInstructionNodeStep();
    var16.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endUnionExpr(true)\n(10) endAndExpr(true)\n(11) endRelationalExpr(-1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test237");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    var0.endFilterExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(10);
    var0.endAndExpr(false);
    var0.startPredicate();
    var0.endOrExpr(false);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startProcessingInstructionNodeStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n\")\n(8) endUnionExpr(false)\n(9) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) startRelativeLocationPath()\n(9) endPredicate()\n(10) endOrExpr(false)\n\")\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) endRelativeLocationPath()\n(4) endPredicate()\n(5) startCommentNodeStep(1)\n");

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test238");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(0, "hi!");
    var0.endXPath();
    var0.startMultiplicativeExpr();
    var0.startAllNodeStep(100);
    var0.startXPath();
    var0.startTextNodeStep(1);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test239");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var15 = var14.getPositionMarker();
    java.lang.String var16 = var14.toString();
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException((java.lang.Throwable)var14);
    org.saxpath.SAXPathException var18 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    org.saxpath.SAXPathException var20 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: -1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n");
    org.saxpath.XPathSyntaxException var24 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var25 = var24.toString();
    java.lang.String var26 = var24.getMultilineMessage();
    int var27 = var24.getPosition();
    java.lang.String var28 = var24.getPositionMarker();
    org.saxpath.XPathSyntaxException var32 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var33 = var32.getPositionMarker();
    java.lang.String var34 = var32.toString();
    org.saxpath.SAXPathException var35 = new org.saxpath.SAXPathException((java.lang.Throwable)var32);
    java.lang.String var36 = var32.getMultilineMessage();
    java.lang.String var37 = var32.getMultilineMessage();
    java.lang.String var38 = var32.toString();
    java.lang.String var39 = var32.getPositionMarker();
    java.lang.String var40 = var32.getPositionMarker();
    org.saxpath.XPathSyntaxException var44 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var45 = var44.getXPath();
    java.lang.String var46 = var44.getPositionMarker();
    int var47 = var44.getPosition();
    java.lang.Throwable[] var48 = var44.getSuppressed();
    int var49 = var44.getPosition();
    var32.addSuppressed((java.lang.Throwable)var44);
    java.lang.String var51 = var32.toString();
    var24.addSuppressed((java.lang.Throwable)var32);
    var20.addSuppressed((java.lang.Throwable)var24);
    org.saxpath.SAXPathParseException var55 = new org.saxpath.SAXPathParseException("");
    java.lang.String var56 = var55.toString();
    org.saxpath.SAXPathException var58 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var55.addSuppressed((java.lang.Throwable)var58);
    java.lang.String var60 = var55.toString();
    org.saxpath.SAXPathException var61 = new org.saxpath.SAXPathException((java.lang.Throwable)var55);
    org.saxpath.SAXPathException var62 = new org.saxpath.SAXPathException((java.lang.Throwable)var55);
    var24.addSuppressed((java.lang.Throwable)var55);
    var17.addSuppressed((java.lang.Throwable)var24);
    var3.addSuppressed((java.lang.Throwable)var17);
    java.lang.String var66 = var3.getMultilineMessage();
    java.lang.String var67 = var3.toString();
    java.lang.String var68 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + " ^"+ "'", var15.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var16.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "^"+ "'", var28.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + " ^"+ "'", var33.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var34.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var36.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var37.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var38.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + " ^"+ "'", var39.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + " ^"+ "'", var40.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + " ^"+ "'", var46.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var51.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var56.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var60.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "\n ^\n ^"+ "'", var66.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var67.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "\n ^\n ^"+ "'", var68.equals("\n ^\n ^"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test240");


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
    var0.endNameStep();
    var0.endPathExpr();
    var0.endFunction();
    var0.endUnaryExpr((-1));
    var0.endEqualityExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test241");


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
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var30 = new org.saxpath.helpers.DefaultXPathHandler();
    var30.number(10.0d);
    var30.endRelativeLocationPath();
    var30.startRelativeLocationPath();
    var30.endFilterExpr();
    var30.endXPath();
    var30.startUnionExpr();
    var30.endMultiplicativeExpr(100);
    var30.startMultiplicativeExpr();
    var30.startMultiplicativeExpr();
    var30.startAndExpr();
    var30.endRelationalExpr(1);
    var30.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var30);
    var30.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test242");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) endNameStep()\n(5) startFilterExpr()\n(6) endTextNodeStep()\n");

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test243");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endUnaryExpr(10);
    var0.number(0.0d);
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.endPredicate();

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test244");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endAndExpr(true);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.startXPath();
    com.werken.saxpath.XPathReader var11 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endTextNodeStep();
    var12.endUnionExpr(true);
    var11.setXPathHandler((org.saxpath.XPathHandler)var12);
    var12.endMultiplicativeExpr(10);
    boolean var20 = var0.equals((java.lang.Object)var12);
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test245");


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
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    boolean var21 = var16.equals((java.lang.Object)'a');
    java.lang.String var22 = var16.toString();
    var16.startXPath();
    var16.endAllNodeStep();
    var16.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var16.number(100.0d);
    var16.startOrExpr();
    var16.endOrExpr(false);
    var16.startCommentNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var16);
    var16.startRelativeLocationPath();
    var16.startEqualityExpr();
    var16.endCommentNodeStep();
    var16.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test246");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.startAllNodeStep((-1));
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.literal("          ^");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endUnaryExpr(10);
    var20.startMultiplicativeExpr();
    var20.startEqualityExpr();
    var20.startAdditiveExpr();
    var20.endEqualityExpr(1);
    var20.startTextNodeStep(1);
    org.saxpath.conformance.ConformanceXPathHandler var31 = new org.saxpath.conformance.ConformanceXPathHandler();
    var31.startAbsoluteLocationPath();
    var31.endTextNodeStep();
    var31.endAdditiveExpr(1);
    java.lang.String var36 = var31.toString();
    var31.startMultiplicativeExpr();
    var31.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var31.startAllNodeStep((-1));
    var31.endPathExpr();
    var31.endPredicate();
    var31.endPathExpr();
    boolean var46 = var20.equals((java.lang.Object)var31);
    var31.startPathExpr();
    var31.endUnaryExpr(0);
    boolean var50 = var0.equals((java.lang.Object)var31);
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var36.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test247");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.literal(" ^");
    var0.startPathExpr();
    var0.startFilterExpr();
    var0.endFunction();

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test248");


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
    var0.endPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    var0.startUnaryExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    var0.endUnionExpr(false);
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test249");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.endAdditiveExpr(100);
    var0.startAllNodeStep(100);
    var0.startAbsoluteLocationPath();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test250");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endTextNodeStep();
    var0.endFilterExpr();
    var0.number(1.0d);
    var0.startTextNodeStep(0);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    var0.startXPath();
    org.saxpath.helpers.DefaultXPathHandler var16 = new org.saxpath.helpers.DefaultXPathHandler();
    var16.endFunction();
    var16.startRelationalExpr();
    var16.startAllNodeStep(0);
    var16.startAbsoluteLocationPath();
    var16.endTextNodeStep();
    var16.startUnionExpr();
    boolean var24 = var0.equals((java.lang.Object)var16);
    var16.endProcessingInstructionNodeStep();
    var16.endMultiplicativeExpr(1);
    var16.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test251");


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
    var0.startPathExpr();
    var0.startFilterExpr();

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test252");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endEqualityExpr((-1));
    var0.endPredicate();
    var0.startAllNodeStep(10);
    var0.endCommentNodeStep();
    var0.endXPath();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test253");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test254");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endOrExpr(false);
    var0.endAdditiveExpr(1);
    var0.startXPath();

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test255");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.number(1.0d);
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test256");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endPredicate();
    var0.startPathExpr();
    var0.startAllNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.number(10.0d);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test257");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endEqualityExpr((-1));
    var0.endOrExpr(true);
    var0.startMultiplicativeExpr();
    var0.startFunction("hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n");
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.endUnaryExpr(1);
    var0.startAllNodeStep(1);
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(100);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test258");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", 10, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^"+ "'", var5.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test259");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n");
    var0.startUnaryExpr();

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test260");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endAdditiveExpr(1);
    var0.startXPath();
    var0.startEqualityExpr();

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test261");


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
    org.saxpath.conformance.ConformanceXPathHandler var17 = new org.saxpath.conformance.ConformanceXPathHandler();
    var17.startAbsoluteLocationPath();
    var17.startNameStep(100, " ^", " ^");
    var17.endUnionExpr(false);
    var17.startRelationalExpr();
    var17.startAbsoluteLocationPath();
    var17.endAbsoluteLocationPath();
    boolean var28 = var0.equals((java.lang.Object)var17);
    var0.endAbsoluteLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var30 = new org.saxpath.conformance.ConformanceXPathHandler();
    var30.startAbsoluteLocationPath();
    var30.endAndExpr(true);
    boolean var35 = var30.equals((java.lang.Object)'a');
    var30.startAbsoluteLocationPath();
    var30.startRelativeLocationPath();
    var30.endRelationalExpr(10);
    var30.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var30.startCommentNodeStep((-1));
    var30.startAbsoluteLocationPath();
    var30.endAndExpr(true);
    var30.startPredicate();
    var30.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n");
    var30.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    boolean var54 = var0.equals((java.lang.Object)var30);
    var30.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test262");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endPredicate();
    var0.startPathExpr();
    var0.startAllNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endCommentNodeStep();

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test263");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(false);
    var0.endAllNodeStep();
    var0.endEqualityExpr(0);
    var0.startNameStep(10, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n\norg.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) startTextNodeStep(100)\n");
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test264");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.startFunction(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", "^");
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.endUnaryExpr(100);
    var0.endTextNodeStep();
    var0.endAndExpr(true);
    var0.startAdditiveExpr();
    var0.literal("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test265");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test266");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.startFilterExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test267");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();
    var0.endOrExpr(true);
    var0.number(100);
    var0.startAdditiveExpr();
    var0.endEqualityExpr(100);
    var0.endOrExpr(true);
    var0.startMultiplicativeExpr();
    var0.endRelativeLocationPath();

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test268");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.startOrExpr();
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.endPredicate();
    var0.endXPath();
    var0.startOrExpr();
    var0.endMultiplicativeExpr(1);
    var0.endOrExpr(true);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test269");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.variableReference("(0) endAllNodeStep()\n(1) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.endMultiplicativeExpr((-1));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test270");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.endAndExpr(true);
    var0.endAllNodeStep();
    var0.startAndExpr();
    var0.endRelationalExpr(0);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test271");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.endUnaryExpr(100);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test272");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.startPredicate();
    var0.startFilterExpr();

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test273");


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
    var32.endFilterExpr();
    var32.endEqualityExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test274");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.endUnaryExpr(0);
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAllNodeStep(1)\n");

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test275");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.endOrExpr(true);
    java.lang.String var13 = var0.toString();
    var0.startPathExpr();
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endTextNodeStep()\n(7) endOrExpr(true)\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endTextNodeStep()\n(7) endOrExpr(true)\n"));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test276");


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
    var8.startOrExpr();
    var8.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) startXPath()\n(6) number(1)\n");
    var8.variableReference("com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) endTextNodeStep()\n(5) startCommentNodeStep(100)\n(6) endPathExpr()\n(7) startMultiplicativeExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test277");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.endNameStep();
    var0.endPathExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startRelationalExpr();
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(10);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test278");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();
    var0.number(10.0d);
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endPathExpr();

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test279");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endPredicate();
    var0.endRelationalExpr((-1));
    var0.endFilterExpr();
    var0.number((-1));
    var0.number(100);
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test280");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.number(10.0d);
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.endNameStep();
    var0.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test281");


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
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    org.saxpath.helpers.DefaultXPathHandler var32 = new org.saxpath.helpers.DefaultXPathHandler();
    var32.number(10.0d);
    var32.endRelativeLocationPath();
    var32.startRelativeLocationPath();
    var32.endFilterExpr();
    var32.endAdditiveExpr(100);
    var32.endRelativeLocationPath();
    var32.literal("child");
    var32.endProcessingInstructionNodeStep();
    var32.endPredicate();
    var32.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    var32.endUnaryExpr(10);
    var32.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test282");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("");
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var11 = var3.getSuppressed();
    java.lang.String var12 = var3.getXPath();
    java.lang.Throwable[] var13 = var3.getSuppressed();
    java.lang.String var14 = var3.getPositionMarker();
    java.lang.String var15 = var3.getXPath();
    java.lang.String var16 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test283");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startAllNodeStep((-1));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test284");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("namespace", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.getXPath();
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "namespace"+ "'", var6.equals("namespace"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\nnamespace\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\nnamespace\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test285");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n", (-1), "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test286");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var0.startUnaryExpr();

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test287");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep(1);
    var0.endProcessingInstructionNodeStep();
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) startEqualityExpr()\n(6) startAdditiveExpr()\n(7) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: :(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n\")\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test288");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) endTextNodeStep()\n(5) startCommentNodeStep(100)\n(6) endPathExpr()\n(7) startMultiplicativeExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test289");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test290");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep((-1));
    var0.startRelativeLocationPath();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(10, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test291");


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
    var0.startXPath();
    var0.endAdditiveExpr(0);
    var0.number(100.0d);
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test292");


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
    var0.endPathExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test293");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.startNameStep(100, " ^", " ^");
    var13.endUnionExpr(false);
    var13.startMultiplicativeExpr();
    boolean var22 = var0.equals((java.lang.Object)var13);
    var13.number(1.0d);
    var13.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n(4) endPathExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n");
    var13.number(10.0d);
    var13.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test294");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep((-1));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test295");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startEqualityExpr();
    var0.endRelationalExpr(10);
    var0.number(1);
    var0.number(1);
    var0.startPredicate();
    var0.startUnionExpr();
    var0.number(10);
    var0.startMultiplicativeExpr();

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test296");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.endFunction();
    var0.startCommentNodeStep(100);
    var0.startOrExpr();

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test297");


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
    var8.number(0);
    var8.startRelationalExpr();
    var8.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test298");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endMultiplicativeExpr((-1));
    var0.startPathExpr();
    var0.endMultiplicativeExpr(0);
    var0.startPredicate();
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endAdditiveExpr(1);
    var0.startPathExpr();

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test299");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endEqualityExpr((-1));
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(1);
    var0.startXPath();

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test300");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPathExpr();
    var0.endAndExpr(true);
    var0.endAndExpr(true);
    var0.variableReference("(0) endAllNodeStep()\n(1) endXPath()\n(2) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(3) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(4) endAndExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\")\n(8) endOrExpr(true)\n");

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test301");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.startOrExpr();
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startAllNodeStep(100);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endRelationalExpr(100)\n(7) endCommentNodeStep()\n(8) number(-1.0)\n(9) startRelativeLocationPath()\n(10) endAdditiveExpr(1)\n(11) startOrExpr()\n", "(0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) endEqualityExpr(1)\n(2) endAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endAdditiveExpr(100)\n(5) startRelationalExpr()\n(6) endProcessingInstructionNodeStep()\n(7) startNameStep(-1, \"org.saxpath.SAXPathException: child\", \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n\")\n\n^");

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test302");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.startXPath();
    var0.endXPath();
    var0.startCommentNodeStep(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endFunction()\n(8) startEqualityExpr()\n(9) startAndExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startEqualityExpr()\n(7) startCommentNodeStep(100)\n(8) startNameStep(-1, \"org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\", \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) number(1.0)\n(6) startPathExpr()\n\")\n(9) endProcessingInstructionNodeStep()\n");

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test303");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.endAllNodeStep();
    var0.endAdditiveExpr(10);
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.endPathExpr();
    var0.startNameStep(1, "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^", "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test304");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();
    var0.startCommentNodeStep((-1));
    var0.number(1);
    var0.endPathExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "child\norg.saxpath.SAXPathException:  ^\n^");
    var0.startMultiplicativeExpr();
    var0.startPredicate();

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test305");


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
    var11.endMultiplicativeExpr(10);
    var11.number(10.0d);
    var11.number(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test306");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.number((-1));
    var0.startFilterExpr();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startXPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n\n                                                                                                    ^");
    var0.startOrExpr();
    var0.startRelationalExpr();

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test307");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startXPath();
    var0.endPredicate();
    var0.endAndExpr(false);
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startPredicate();

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test308");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: \nhi!\n^", 0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) endUnionExpr(true)\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", 0, "");
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) endUnionExpr(true)\n"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) endUnionExpr(true)\n"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test309");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.endAllNodeStep();
    var0.startTextNodeStep(10);
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test310");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startPathExpr();
    var0.endUnionExpr(true);
    var0.startEqualityExpr();

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test311");


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
    var0.startTextNodeStep(10);
    var0.startEqualityExpr();
    var0.startPathExpr();
    var0.endPredicate();
    var0.endPathExpr();
    var0.endUnaryExpr(1);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test312");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.endCommentNodeStep();
    var0.startCommentNodeStep(10);
    org.saxpath.conformance.ConformanceXPathHandler var19 = new org.saxpath.conformance.ConformanceXPathHandler();
    var19.startAbsoluteLocationPath();
    var19.endAndExpr(true);
    boolean var24 = var19.equals((java.lang.Object)'a');
    var19.startPathExpr();
    var19.startMultiplicativeExpr();
    var19.endAllNodeStep();
    var19.startAbsoluteLocationPath();
    var19.endNameStep();
    var19.endFunction();
    boolean var31 = var0.equals((java.lang.Object)var19);
    var19.startMultiplicativeExpr();
    var19.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test313");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr((-1));
    var0.endMultiplicativeExpr((-1));
    var0.endRelationalExpr((-1));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test314");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) endAbsoluteLocationPath()\n(3) endEqualityExpr(100)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\")\n");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test315");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.startAbsoluteLocationPath();
    var8.endAndExpr(true);
    boolean var13 = var8.equals((java.lang.Object)'a');
    var8.startAbsoluteLocationPath();
    var8.startRelativeLocationPath();
    var8.startAbsoluteLocationPath();
    var8.number((-1.0d));
    var8.number(100.0d);
    var0.setXPathHandler((org.saxpath.XPathHandler)var8);
    var8.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test316");


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
    var7.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var7.endAdditiveExpr(0);
    var7.endPredicate();
    var7.startUnaryExpr();
    var7.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var7.endFilterExpr();
    var7.startAllNodeStep(100);
    var7.endUnaryExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test317");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.startMultiplicativeExpr();
    var0.endNameStep();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n");
    var0.endXPath();

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test318");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^"+ "'", var2.equals("org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test319");


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
    java.lang.String var17 = var3.getMultilineMessage();
    org.saxpath.XPathSyntaxException var21 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var22 = var21.getPositionMarker();
    java.lang.String var23 = var21.toString();
    org.saxpath.SAXPathException var24 = new org.saxpath.SAXPathException((java.lang.Throwable)var21);
    java.lang.String var25 = var21.getMultilineMessage();
    java.lang.String var26 = var21.toString();
    int var27 = var21.getPosition();
    var3.addSuppressed((java.lang.Throwable)var21);
    java.lang.String var29 = var21.getMultilineMessage();
    java.lang.String var30 = var21.toString();
    java.lang.Throwable[] var31 = var21.getSuppressed();
    java.lang.String var32 = var21.getXPath();
    
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
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + " ^"+ "'", var22.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test320");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startAbsoluteLocationPath();
    boolean var12 = var0.equals((java.lang.Object)'4');
    var0.number(100);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.startXPath();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endMultiplicativeExpr(0)\n(7) startMultiplicativeExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) endOrExpr(false)\n(6) startAbsoluteLocationPath()\n(7) startAllNodeStep(100)\n(8) endAdditiveExpr(-1)\n(9) startEqualityExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test321");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endAllNodeStep();

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test322");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var3 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var2.equals("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test323");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.startPathExpr();
    var0.startPathExpr();

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test324");


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
    org.saxpath.helpers.DefaultXPathHandler var39 = new org.saxpath.helpers.DefaultXPathHandler();
    var39.number(10.0d);
    var39.endRelativeLocationPath();
    var39.startRelativeLocationPath();
    var39.endFilterExpr();
    var39.endProcessingInstructionNodeStep();
    var39.endMultiplicativeExpr(0);
    var39.startTextNodeStep(10);
    var39.endProcessingInstructionNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var39);
    org.saxpath.conformance.ConformanceXPathHandler var52 = new org.saxpath.conformance.ConformanceXPathHandler();
    var52.startAbsoluteLocationPath();
    var52.endPathExpr();
    var52.startUnionExpr();
    var52.endRelationalExpr(10);
    var52.endPathExpr();
    var52.startRelationalExpr();
    var52.endAllNodeStep();
    var52.startMultiplicativeExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var52);
    org.saxpath.helpers.DefaultXPathHandler var63 = new org.saxpath.helpers.DefaultXPathHandler();
    var63.number(10.0d);
    var63.endRelativeLocationPath();
    var63.startRelativeLocationPath();
    var63.endFilterExpr();
    var63.endAdditiveExpr(100);
    var63.endRelationalExpr((-1));
    var63.endProcessingInstructionNodeStep();
    var63.startAbsoluteLocationPath();
    var63.startRelativeLocationPath();
    var63.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "                                                                                                    ^");
    var63.startNameStep((-1), "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    boolean var83 = var52.equals((java.lang.Object)"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    
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
    assertTrue(var83 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test325");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.number(10.0d);
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test326");


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
    var0.endAndExpr(false);
    var0.startTextNodeStep((-1));
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test327");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("\n ^\n ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getPositionMarker();
    java.lang.String var7 = var5.toString();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.String var9 = var5.getMultilineMessage();
    java.lang.String var10 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException("");
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var13);
    java.lang.String var15 = var13.toString();
    org.saxpath.XPathSyntaxException var19 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.XPathSyntaxException var23 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var24 = var23.getSuppressed();
    var19.addSuppressed((java.lang.Throwable)var23);
    var13.addSuppressed((java.lang.Throwable)var23);
    java.lang.Throwable[] var27 = var13.getSuppressed();
    var5.addSuppressed((java.lang.Throwable)var13);
    org.saxpath.SAXPathParseException var30 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    org.saxpath.SAXPathException var31 = new org.saxpath.SAXPathException((java.lang.Throwable)var30);
    java.lang.String var32 = var31.toString();
    var13.addSuppressed((java.lang.Throwable)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "org.saxpath.SAXPathException: "+ "'", var15.equals("org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n"+ "'", var32.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test328");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startFunction("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test329");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPathExpr();
    var0.number((-1));
    var0.startUnionExpr();
    var0.startXPath();
    var0.startTextNodeStep((-1));
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr((-1));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test330");


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
    var0.endFilterExpr();
    var0.endUnionExpr(true);
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test331");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(1);
    var0.endPathExpr();
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test332");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.endNameStep();
    var0.startProcessingInstructionNodeStep(1, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n");
    var0.startPathExpr();
    var0.endCommentNodeStep();

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test333");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.endFilterExpr();
    var0.endRelationalExpr((-1));
    var0.endTextNodeStep();
    var0.literal("                                                                                                    ^");
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endAdditiveExpr(100)\n(5) startRelationalExpr()\n(6) endProcessingInstructionNodeStep()\n(7) startNameStep(-1, \"org.saxpath.SAXPathException: child\", \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n\")\n");
    var0.endOrExpr(true);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test334");


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
    var8.startOrExpr();
    var8.endUnionExpr(true);
    var8.endFunction();
    var8.endAndExpr(true);
    var8.endRelationalExpr(1);
    var8.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n");
    var8.number(10);
    var8.endMultiplicativeExpr((-1));
    var8.endEqualityExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test335");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startPathExpr();

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test336");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.helpers.DefaultXPathHandler var11 = new org.saxpath.helpers.DefaultXPathHandler();
    var11.number(10.0d);
    var11.endPathExpr();
    var11.startOrExpr();
    var11.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var11.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var11.startUnionExpr();
    var11.startCommentNodeStep(1);
    var11.startRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.startAbsoluteLocationPath();
    var27.endEqualityExpr((-1));
    var27.endTextNodeStep();
    var27.endCommentNodeStep();
    var27.endRelativeLocationPath();
    var27.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var27.endAllNodeStep();
    var27.endAllNodeStep();
    var27.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var27.endAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var27);
    var27.startCommentNodeStep(100);
    var27.endFunction();

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test337");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.endFunction();
    var0.endAndExpr(true);
    var0.endXPath();
    var0.endPredicate();
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    var16.endPathExpr();
    var16.endFilterExpr();
    var16.startMultiplicativeExpr();
    var16.startRelationalExpr();
    boolean var24 = var0.equals((java.lang.Object)var16);
    var0.endCommentNodeStep();
    var0.endAdditiveExpr(10);
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test338");


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
    var0.endPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test339");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    int var7 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test340");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endEqualityExpr(10);
    var0.endRelativeLocationPath();

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test341");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n\ncom.werken.saxpath.XPathSyntaxException: -1: child\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test342");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", 10, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^"+ "'", var6.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "          ^"+ "'", var7.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test343");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endProcessingInstructionNodeStep()\n(5) endXPath()\n"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endProcessingInstructionNodeStep()\n(5) endXPath()\n"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test344");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endOrExpr(true);
    var0.endFunction();
    var0.startPathExpr();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test345");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test346");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.startUnionExpr();
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endNameStep();
    var0.endEqualityExpr(1);
    var0.startMultiplicativeExpr();

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test347");


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
    var0.number(1);
    var0.startTextNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test348");


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
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n(10) endFilterExpr()\n(11) startRelationalExpr()\n(12) endUnionExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAdditiveExpr()\n(10) startAndExpr()\n(11) variableReference(\"org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n\")\n(12) startNameStep(100, \" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\", \"org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\")\n(13) startAndExpr()\n");
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test349");


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
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endRelativeLocationPath();
    var18.startRelativeLocationPath();
    var18.endFilterExpr();
    var18.endXPath();
    var18.startUnionExpr();
    var18.startTextNodeStep(10);
    var18.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var18.startAllNodeStep(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    org.saxpath.XPathHandler var38 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var39 = new org.saxpath.helpers.DefaultXPathHandler();
    var39.number(10.0d);
    var39.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var39.endPredicate();
    var39.startAbsoluteLocationPath();
    var39.startAdditiveExpr();
    var39.endAndExpr(true);
    var39.startCommentNodeStep(100);
    var39.startMultiplicativeExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var39);
    org.saxpath.conformance.ConformanceXPathHandler var54 = new org.saxpath.conformance.ConformanceXPathHandler();
    var54.startAbsoluteLocationPath();
    var54.endEqualityExpr((-1));
    var54.endTextNodeStep();
    var54.endTextNodeStep();
    var54.endAllNodeStep();
    var54.startTextNodeStep(100);
    var54.endCommentNodeStep();
    var54.startCommentNodeStep(100);
    var54.number(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var54);
    org.saxpath.helpers.DefaultXPathHandler var69 = new org.saxpath.helpers.DefaultXPathHandler();
    var69.startAndExpr();
    var69.endRelationalExpr(1);
    var69.endOrExpr(true);
    var69.endAllNodeStep();
    var69.startCommentNodeStep(100);
    var69.endRelationalExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var69);
    var69.endPredicate();
    var69.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test350");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.startFilterExpr();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test351");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", 1, "^");
    int var4 = var3.getPosition();
    int var5 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test352");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "          ^");
    var0.startAdditiveExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) startProcessingInstructionNodeStep(100, \"namespace\")\n(9) endXPath()\n(10) endRelationalExpr(100)\n");
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startNameStep(-1, \"\", \"org.saxpath.SAXPathParseException: \")\n(4) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAndExpr(false)\n(5) startTextNodeStep(10)\n(6) startFunction(\"          ^:\")\n(7) literal(\"(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n\")\n(8) endFunction()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test353");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endPredicate();

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test354");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.startXPath();
    var0.startUnionExpr();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.endOrExpr(true);
    var0.endPredicate();
    var0.endAndExpr(true);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test355");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, " ^");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.String var8 = var3.getPositionMarker();
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "                                                                                                    ^"+ "'", var7.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "                                                                                                    ^"+ "'", var8.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test356");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.startXPath();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test357");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(0);
    var0.endAndExpr(false);
    var0.endNameStep();
    var0.endMultiplicativeExpr(1);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test358");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endOrExpr(true);
    var0.endFunction();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test359");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.endRelationalExpr((-1));
    var0.endXPath();
    var0.endAllNodeStep();
    var0.endOrExpr(true);
    var0.endEqualityExpr((-1));
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test360");


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
    var7.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var7.startAndExpr();
    var7.startOrExpr();
    var7.endMultiplicativeExpr(1);
    var7.number(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test361");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startPathExpr();
    var0.endAdditiveExpr(10);
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 10: ^");
    var0.startPredicate();
    var0.startTextNodeStep(100);
    var0.endFunction();
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test362");


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
    var1.startOrExpr();
    var1.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var1.startOrExpr();
    var1.endTextNodeStep();
    java.lang.String var24 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endAllNodeStep()\n(10) startOrExpr()\n(11) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^:(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n\")\n(12) startOrExpr()\n(13) endTextNodeStep()\n"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endAllNodeStep()\n(10) startOrExpr()\n(11) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^:(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n\")\n(12) startOrExpr()\n(13) endTextNodeStep()\n"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test363");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.startEqualityExpr();
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.number(10.0d);
    var15.endRelativeLocationPath();
    var15.startRelativeLocationPath();
    var15.endFilterExpr();
    var15.endAdditiveExpr(100);
    var15.endRelationalExpr((-1));
    var15.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var15.endEqualityExpr((-1));
    var15.endOrExpr(true);
    var15.endRelationalExpr(1);
    boolean var34 = var0.equals((java.lang.Object)var15);
    var15.startFilterExpr();
    var15.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test364");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test365");


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
    var29.endOrExpr(false);
    var29.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endPredicate()\n(8) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\")\n(9) endAllNodeStep()\n(10) startAdditiveExpr()\n");
    var29.startCommentNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test366");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "hi!");
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.startAndExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startPredicate();
    var0.endAdditiveExpr(10);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test367");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep((-1), "(0) startXPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.endAbsoluteLocationPath();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test368");


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
    var0.endUnionExpr(true);
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test369");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test370");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(1, " ^");
    var0.startFilterExpr();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var0.endAllNodeStep();
    var0.endAndExpr(true);
    var0.startPredicate();
    var0.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test371");


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
    var0.endFunction();
    var0.startCommentNodeStep((-1));
    var0.endXPath();
    var0.endFunction();
    var0.endAdditiveExpr(0);
    org.saxpath.conformance.ConformanceXPathHandler var21 = new org.saxpath.conformance.ConformanceXPathHandler();
    var21.startAbsoluteLocationPath();
    var21.endAndExpr(true);
    var21.endPathExpr();
    var21.endTextNodeStep();
    var21.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "org.saxpath.SAXPathException:  ^");
    var21.endCommentNodeStep();
    var21.endPathExpr();
    var21.endRelativeLocationPath();
    var21.number((-1));
    var21.endProcessingInstructionNodeStep();
    var21.endAdditiveExpr(0);
    boolean var38 = var0.equals((java.lang.Object)var21);
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test372");


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
    var17.endFilterExpr();
    var17.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var17.startCommentNodeStep((-1));
    var17.startRelationalExpr();
    var17.startTextNodeStep((-1));
    var17.startMultiplicativeExpr();
    var17.literal("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test373");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.endOrExpr(false);
    var0.endOrExpr(true);
    var0.startXPath();
    var0.startPathExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n");
    var0.startFilterExpr();
    var0.startRelationalExpr();

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test374");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(10);
    var0.startOrExpr();
    var0.startPredicate();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test375");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startProcessingInstructionNodeStep((-1), "child");
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.endNameStep();

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test376");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAdditiveExpr(10);
    var0.endOrExpr(true);
    var0.endAndExpr(true);
    var0.startAllNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test377");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.endMultiplicativeExpr(1);
    var0.endUnaryExpr(10);
    var0.variableReference("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n(6) endUnaryExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n");
    var0.startUnaryExpr();
    var0.startOrExpr();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test378");


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
    org.saxpath.XPathHandler var15 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    boolean var21 = var16.equals((java.lang.Object)'a');
    java.lang.String var22 = var16.toString();
    var16.startXPath();
    var16.startPathExpr();
    var16.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var16.startXPath();
    var16.startEqualityExpr();
    var16.endAdditiveExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var16);
    org.saxpath.XPathHandler var34 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var35 = new org.saxpath.helpers.DefaultXPathHandler();
    var35.number(10.0d);
    var35.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var35.startUnionExpr();
    var35.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var35.endEqualityExpr(10);
    var35.endFilterExpr();
    var35.endAndExpr(true);
    var35.startRelationalExpr();
    var35.startAllNodeStep(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test379");


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
    var0.endFilterExpr();
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.endFunction();
    var15.startRelationalExpr();
    var15.endAllNodeStep();
    var15.endOrExpr(false);
    var15.startCommentNodeStep(100);
    var15.startRelationalExpr();
    boolean var24 = var0.equals((java.lang.Object)var15);
    var0.startProcessingInstructionNodeStep(10, "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n                                                                                                    ^");
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test380");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    var0.endEqualityExpr(10);
    var0.number(10.0d);
    var0.endNameStep();
    var0.startAllNodeStep(100);
    var0.endEqualityExpr((-1));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test381");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startFilterExpr();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.endUnionExpr(true);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test382");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startRelationalExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\")\n(5) startUnaryExpr()\n(6) startUnaryExpr()\n(7) startRelativeLocationPath()\n(8) startPredicate()\n");

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test383");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "");
    var0.endCommentNodeStep();

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test384");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.endXPath();
    var0.endAdditiveExpr((-1));
    var0.startEqualityExpr();
    var0.number(0);
    var0.endPredicate();

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test385");


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
    var0.endNameStep();
    var0.endEqualityExpr(100);
    var0.startEqualityExpr();

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test386");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.endXPath();
    var0.endEqualityExpr((-1));
    var0.startUnionExpr();
    var0.endPathExpr();

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test387");


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
    var0.endFunction();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test388");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.endNameStep();
    var0.endMultiplicativeExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAndExpr(true);
    var0.startOrExpr();
    var0.endEqualityExpr(10);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test389");


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
    var0.endProcessingInstructionNodeStep();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) endMultiplicativeExpr(100)\n(9) endProcessingInstructionNodeStep()\n"+ "'", var16.equals("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) endMultiplicativeExpr(100)\n(9) endProcessingInstructionNodeStep()\n"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test390");


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
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endAdditiveExpr(10);
    var0.endRelationalExpr(0);
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 100:  ^");
    var0.endXPath();
    var0.endRelationalExpr(0);
    var0.endXPath();

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test391");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.startAdditiveExpr();

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test392");


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
    org.saxpath.XPathHandler var25 = var0.getXPathHandler();
    org.saxpath.XPathHandler var26 = var0.getXPathHandler();
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    org.saxpath.XPathHandler var30 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test393");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test394");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startCommentNodeStep(10);
    var0.endOrExpr(true);
    var0.startAllNodeStep((-1));
    var0.startAndExpr();

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test395");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) endMultiplicativeExpr(10)\n(8) startOrExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n");
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test396");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startAllNodeStep(0);
    var0.endXPath();
    var0.endAndExpr(true);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test397");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startTextNodeStep(100);
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startTextNodeStep(0);
    var0.startAllNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test398");


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
    var0.startAndExpr();
    org.saxpath.helpers.DefaultXPathHandler var17 = new org.saxpath.helpers.DefaultXPathHandler();
    var17.number(10.0d);
    var17.endNameStep();
    var17.startUnaryExpr();
    var17.endTextNodeStep();
    var17.endRelativeLocationPath();
    var17.endUnaryExpr(0);
    boolean var26 = var0.equals((java.lang.Object)var17);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n(6) number(100)\n(7) endFunction()\n");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endUnionExpr(true)\n(3) startOrExpr()\n(4) startAllNodeStep(-1)\n(5) startPathExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test399");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.endAndExpr(false);
    var0.startFilterExpr();
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test400");


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
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test401");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endOrExpr(false);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.startFilterExpr();
    var0.endXPath();
    var0.startPredicate();
    var0.number(10.0d);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test402");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFunction();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test403");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endEqualityExpr((-1));
    var0.endOrExpr(true);
    var0.startPredicate();
    var0.number(0);
    var0.endRelationalExpr(10);
    var0.endMultiplicativeExpr(1);
    var0.startOrExpr();
    var0.endUnaryExpr(100);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test404");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startAllNodeStep(0);
    var0.startPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.number(0);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test405");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endNameStep()\n(5) endTextNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test406");


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
    org.saxpath.XPathHandler var22 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var23 = new org.saxpath.helpers.DefaultXPathHandler();
    var23.number(10.0d);
    var23.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var23.startAdditiveExpr();
    var23.endXPath();
    var23.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var23.startAndExpr();
    var23.startXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var23);
    org.saxpath.XPathHandler var36 = var0.getXPathHandler();
    org.saxpath.XPathHandler var37 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test407");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(true);
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endAdditiveExpr((-1));
    var0.endMultiplicativeExpr(10);
    var0.endUnaryExpr(0);
    var0.endEqualityExpr(10);
    var0.endOrExpr(true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test408");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(false);
    var0.endOrExpr(false);
    var0.endFunction();
    var0.startRelationalExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n");
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test409");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test410");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endEqualityExpr(0);
    var0.endFilterExpr();
    var0.number(1);
    var0.startAllNodeStep((-1));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test411");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(true);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n", " ^");
    var0.startEqualityExpr();
    var0.startAdditiveExpr();

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test412");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test413");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n");
    var0.endPathExpr();
    var0.startRelationalExpr();

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test414");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    java.lang.String var7 = var0.toString();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test415");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endOrExpr(false);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    var0.number(10.0d);
    var0.endPathExpr();

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test416");


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
    var0.number(0.0d);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test417");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endMultiplicativeExpr(0);
    var0.endRelationalExpr(1);
    org.saxpath.helpers.DefaultXPathHandler var15 = new org.saxpath.helpers.DefaultXPathHandler();
    var15.number(10.0d);
    var15.startCommentNodeStep(0);
    var15.startOrExpr();
    var15.startUnionExpr();
    var15.startAbsoluteLocationPath();
    var15.endNameStep();
    var15.number(0.0d);
    boolean var26 = var0.equals((java.lang.Object)var15);
    var15.endAbsoluteLocationPath();
    var15.startOrExpr();
    var15.startEqualityExpr();
    var15.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test418");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.startAndExpr();
    var0.startCommentNodeStep(1);
    var0.startPredicate();
    var0.number(1);
    var0.startXPath();
    var0.endFilterExpr();

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test419");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n");

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test420");


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
    var7.endRelationalExpr(0);
    var7.endPredicate();
    var7.endOrExpr(true);
    var7.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test421");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startFunction(\" ^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(3) endFilterExpr()\n");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test422");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.startTextNodeStep(0);
    var0.startFilterExpr();

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test423");


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
    var0.endPathExpr();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) endFilterExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: ^:(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\")\n(5) startAbsoluteLocationPath()\n");
    var0.endUnionExpr(true);
    var0.startUnaryExpr();
    var0.number(1);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test424");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(10);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startUnaryExpr()\n(7) endFilterExpr()\n(8) endFunction()\n(9) startXPath()\n(10) endRelationalExpr(0)\n");
    var0.endFunction();
    var0.endFilterExpr();

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test425");


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
    org.saxpath.XPathHandler var31 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test426");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startXPath();
    var0.endOrExpr(false);
    var0.endAllNodeStep();

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test427");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(true);
    var0.startUnaryExpr();

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test428");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.number(10);
    var0.endFunction();
    var0.endNameStep();
    org.saxpath.helpers.DefaultXPathHandler var8 = new org.saxpath.helpers.DefaultXPathHandler();
    var8.startNameStep((-1), "hi!", "hi!");
    var8.startFilterExpr();
    var8.startUnaryExpr();
    boolean var15 = var0.equals((java.lang.Object)var8);
    var8.startPathExpr();
    var8.startAndExpr();
    var8.number((-1));
    var8.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test429");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(10);
    var0.number(10.0d);
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.endUnionExpr(true);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test430");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.startCommentNodeStep(0);
    var7.endCommentNodeStep();
    var7.endPathExpr();
    boolean var14 = var0.equals((java.lang.Object)var7);
    var7.endFilterExpr();
    var7.startPredicate();
    var7.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test431");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.startFilterExpr();
    var0.endAndExpr(true);
    var0.endAndExpr(true);
    var0.endMultiplicativeExpr((-1));
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test432");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endNameStep();
    var0.endNameStep();
    var0.literal("org.saxpath.SAXPathException: (0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) startAdditiveExpr()\n(2) startPredicate()\n(3) startAllNodeStep(-1)\n");
    var0.endFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) startProcessingInstructionNodeStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) number(-1.0)\n(8) endAdditiveExpr(1)\n(9) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n:org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n\")\n");

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test433");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startXPath();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endMultiplicativeExpr(1);
    var0.endUnionExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test434");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) startFilterExpr()\n(6) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    var0.startTextNodeStep(10);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test435");


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
    var0.startAndExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAdditiveExpr(-1)\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startXPath()\n(8) startFilterExpr()\n(9) startProcessingInstructionNodeStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\")\n(10) endAdditiveExpr(100)\n(11) endRelationalExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test436");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test437");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endOrExpr(false);
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("^", 0, "hi!");
    java.lang.String var17 = var16.toString();
    java.lang.String var18 = var16.toString();
    boolean var19 = var1.equals((java.lang.Object)var16);
    java.lang.String var20 = var16.getMultilineMessage();
    int var21 = var16.getPosition();
    org.saxpath.SAXPathException var22 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    java.lang.Throwable[] var23 = var22.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!\n^\n^"+ "'", var20.equals("hi!\n^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test438");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startAndExpr();
    var0.startTextNodeStep(100);
    var0.startUnionExpr();
    var0.startTextNodeStep(100);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) endRelativeLocationPath()\n(5) endAdditiveExpr(0)\n(6) startCommentNodeStep(0)\n(7) endNameStep()\n(8) variableReference(\"child\norg.saxpath.SAXPathException:  ^\n^:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^\")\n(9) startPathExpr()\n", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.endRelationalExpr(0);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test439");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.startXPath();
    var0.endEqualityExpr(100);
    var0.startOrExpr();
    var0.endUnionExpr(false);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test440");


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
    var1.startOrExpr();
    var1.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n");
    var1.number(100.0d);
    var1.endTextNodeStep();

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test441");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep((-1));
    var0.startRelativeLocationPath();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.endXPath();
    var0.literal("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    com.werken.saxpath.XPathReader var23 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var24 = new org.saxpath.conformance.ConformanceXPathHandler();
    var24.startAbsoluteLocationPath();
    var24.endUnaryExpr(10);
    var24.number(1);
    var24.startAllNodeStep((-1));
    var24.startOrExpr();
    var23.setXPathHandler((org.saxpath.XPathHandler)var24);
    var23.parse("org.saxpath.SAXPathException: ");
    org.saxpath.conformance.ConformanceXPathHandler var36 = new org.saxpath.conformance.ConformanceXPathHandler();
    var36.startAbsoluteLocationPath();
    var36.endUnaryExpr(10);
    var36.startMultiplicativeExpr();
    var36.startEqualityExpr();
    var23.setXPathHandler((org.saxpath.XPathHandler)var36);
    org.saxpath.helpers.DefaultXPathHandler var43 = new org.saxpath.helpers.DefaultXPathHandler();
    var43.number(10.0d);
    var43.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var43.endPredicate();
    var43.startAdditiveExpr();
    var43.startCommentNodeStep(1);
    var43.startProcessingInstructionNodeStep(1, "hi!");
    var23.setXPathHandler((org.saxpath.XPathHandler)var43);
    var43.startTextNodeStep(10);
    var43.endXPath();
    var43.endAdditiveExpr(0);
    boolean var62 = var0.equals((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test442");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endAdditiveExpr(100);
    var0.startPredicate();
    var0.startOrExpr();
    var0.startOrExpr();
    var0.endMultiplicativeExpr(10);
    var0.startEqualityExpr();

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test443");


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
    org.saxpath.XPathHandler var45 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var46 = new org.saxpath.helpers.DefaultXPathHandler();
    var46.number(10.0d);
    var46.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var46.startAdditiveExpr();
    var46.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var46.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var46.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var46.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathException:  ^");
    var46.endAbsoluteLocationPath();
    var46.startAndExpr();
    var46.startXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var46.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test444");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.getPositionMarker();
    java.lang.String var13 = var3.getPositionMarker();
    java.lang.String var14 = var3.toString();
    
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
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test445");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.number((-1.0d));
    var0.endTextNodeStep();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr(1);
    var0.endNameStep();
    var0.startUnaryExpr();

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test446");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.helpers.DefaultXPathHandler var11 = new org.saxpath.helpers.DefaultXPathHandler();
    var11.number(10.0d);
    var11.endPathExpr();
    var11.startOrExpr();
    var11.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var11.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var11.startUnionExpr();
    var11.startCommentNodeStep(1);
    var11.startRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    var11.startTextNodeStep(100);
    var11.startPathExpr();
    var11.endFunction();

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test447");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 10: ^");
    var0.endEqualityExpr(0);
    var0.startPredicate();
    var0.endTextNodeStep();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test448");


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
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(100);
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.startMultiplicativeExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var0.startRelativeLocationPath();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test449");


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
    var9.endUnionExpr(false);
    var9.startProcessingInstructionNodeStep(10, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var9.endRelativeLocationPath();
    var9.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\")\n(8) endOrExpr(true)\n");
    var9.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test450");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n          ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n          ^"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test451");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endFunction();
    var0.endAllNodeStep();
    var0.endProcessingInstructionNodeStep();

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test452");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.startPredicate();
    var0.endAllNodeStep();
    var0.endUnionExpr(true);
    var0.startCommentNodeStep(1);
    var0.endUnionExpr(false);
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test453");


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
    var17.endFilterExpr();
    var17.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var17.startCommentNodeStep((-1));
    var17.startRelationalExpr();
    var17.endPathExpr();
    var17.literal("org.saxpath.SAXPathException: hi!");
    var17.endEqualityExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test454");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endUnaryExpr(100);
    var0.number(100.0d);
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.endUnionExpr(false);
    var0.startNameStep(1, "(0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) endEqualityExpr(1)\n(2) endAbsoluteLocationPath()\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");
    var0.endPathExpr();

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test455");


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
    org.saxpath.XPathSyntaxException var30 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startTextNodeStep(100)\n(5) endRelativeLocationPath()\n", 10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) endOrExpr(false)\n(6) startAbsoluteLocationPath()\n(7) startAllNodeStep(100)\n(8) endAdditiveExpr(-1)\n");
    org.saxpath.SAXPathException var32 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var30.addSuppressed((java.lang.Throwable)var32);
    boolean var34 = var1.equals((java.lang.Object)var32);
    var1.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test456");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.endAndExpr(true);
    var0.startRelationalExpr();
    var0.endUnionExpr(true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test457");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startAbsoluteLocationPath();
    var0.number(1);
    var0.startFilterExpr();
    var0.endAndExpr(true);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test458");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.startMultiplicativeExpr();
    var0.startAllNodeStep(1);
    var0.startEqualityExpr();

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test459");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startFilterExpr();
    var0.endAllNodeStep();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n");
    var0.endAbsoluteLocationPath();
    var0.number(100);
    var0.number((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test460");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endFunction();
    var0.startTextNodeStep(1);
    var0.startMultiplicativeExpr();
    var0.startAndExpr();

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test461");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endAbsoluteLocationPath();
    var0.startTextNodeStep(100);
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^", "org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n", "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n\n ^");

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test462");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test463");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test464");


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
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test465");


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
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endAndExpr(true);
    boolean var34 = var29.equals((java.lang.Object)'a');
    var29.startPathExpr();
    var29.startMultiplicativeExpr();
    var29.endAllNodeStep();
    var29.startAbsoluteLocationPath();
    var29.endNameStep();
    var29.endProcessingInstructionNodeStep();
    var29.startFunction("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "          ^");
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    org.saxpath.XPathHandler var45 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var46 = new org.saxpath.helpers.DefaultXPathHandler();
    var46.endRelativeLocationPath();
    var46.endAdditiveExpr(1);
    var46.endAllNodeStep();
    var46.endXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    org.saxpath.helpers.DefaultXPathHandler var53 = new org.saxpath.helpers.DefaultXPathHandler();
    var53.number(10.0d);
    var53.endPathExpr();
    var53.endPathExpr();
    var53.number((-1));
    var53.endXPath();
    var53.number(10.0d);
    var53.endAdditiveExpr(100);
    var53.endRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var53);
    var53.endTextNodeStep();
    var53.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test466");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.number(1.0d);
    var0.startXPath();
    var0.startMultiplicativeExpr();

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test467");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endFunction();
    var0.endPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endAndExpr(true)\n(6) startPredicate()\n(7) endAndExpr(true)\n(8) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) startEqualityExpr()\n(7) startAdditiveExpr()\n");
    var0.startFilterExpr();

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test468");


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
    var0.endAllNodeStep();
    var0.endMultiplicativeExpr(1);
    var0.endMultiplicativeExpr(1);
    var0.startUnionExpr();
    var0.endFunction();
    var0.startCommentNodeStep((-1));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test469");


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
    var7.startAllNodeStep(10);
    var7.startMultiplicativeExpr();
    var7.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test470");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAdditiveExpr(1);
    var0.startAllNodeStep((-1));
    var0.endNameStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) number(10)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n\n          ^");

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test471");


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
    var0.endEqualityExpr(0);
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.endXPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startRelativeLocationPath()\n(8) startFilterExpr()\n");

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test472");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endMultiplicativeExpr(10);
    var0.endPredicate();
    var0.endUnaryExpr(100);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startRelationalExpr()\n(7) endOrExpr(false)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test473");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endUnaryExpr(1);
    var1.endRelationalExpr(10);
    com.werken.saxpath.XPathReader var15 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endUnaryExpr(10);
    var16.number(1);
    var16.startAllNodeStep((-1));
    var16.startOrExpr();
    var15.setXPathHandler((org.saxpath.XPathHandler)var16);
    var15.parse("org.saxpath.SAXPathException: ");
    org.saxpath.helpers.DefaultXPathHandler var28 = new org.saxpath.helpers.DefaultXPathHandler();
    var28.number(10.0d);
    var28.startCommentNodeStep(10);
    var28.endFunction();
    var28.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var28.endFilterExpr();
    var15.setXPathHandler((org.saxpath.XPathHandler)var28);
    org.saxpath.helpers.DefaultXPathHandler var40 = new org.saxpath.helpers.DefaultXPathHandler();
    var40.number(10.0d);
    var40.endRelativeLocationPath();
    var40.startRelativeLocationPath();
    var40.endFilterExpr();
    var40.endAdditiveExpr(100);
    var40.endRelationalExpr((-1));
    var40.endProcessingInstructionNodeStep();
    var40.endXPath();
    var15.setXPathHandler((org.saxpath.XPathHandler)var40);
    var15.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n                                                                                                    ^");
    org.saxpath.helpers.DefaultXPathHandler var55 = new org.saxpath.helpers.DefaultXPathHandler();
    var55.number(10.0d);
    var55.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var55.startAdditiveExpr();
    var55.endXPath();
    var55.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var55.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var55.endXPath();
    var55.startPredicate();
    var15.setXPathHandler((org.saxpath.XPathHandler)var55);
    org.saxpath.XPathHandler var71 = var15.getXPathHandler();
    boolean var72 = var1.equals((java.lang.Object)var15);
    org.saxpath.XPathHandler var73 = var15.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var74 = new org.saxpath.conformance.ConformanceXPathHandler();
    var74.startAbsoluteLocationPath();
    var74.endPathExpr();
    var74.endAbsoluteLocationPath();
    var74.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var74.endNameStep();
    var74.endCommentNodeStep();
    org.saxpath.helpers.DefaultXPathHandler var83 = new org.saxpath.helpers.DefaultXPathHandler();
    var83.endFunction();
    var83.startUnaryExpr();
    var83.endTextNodeStep();
    var83.startPredicate();
    var83.number(0.0d);
    var83.startCommentNodeStep(0);
    var83.endTextNodeStep();
    var83.startAdditiveExpr();
    boolean var94 = var74.equals((java.lang.Object)var83);
    var15.setXPathHandler((org.saxpath.XPathHandler)var74);
    org.saxpath.XPathHandler var96 = var15.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test474");


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
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endMultiplicativeExpr((-1));
    var0.number((-1));
    var0.endUnaryExpr(100);
    var0.startPredicate();
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endRelativeLocationPath();

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test475");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startAdditiveExpr();
    var0.endOrExpr(false);
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.endNameStep();
    var0.startUnionExpr();
    var0.endFilterExpr();

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test476");


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
    var9.endAllNodeStep();
    var9.startAbsoluteLocationPath();
    var9.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test477");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.endPredicate();
    var0.endMultiplicativeExpr(10);
    var0.startAndExpr();
    var0.startXPath();
    var0.startUnionExpr();
    var0.startUnaryExpr();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test478");


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
    var0.endAndExpr(false);
    var0.startAbsoluteLocationPath();
    var0.startFilterExpr();
    var0.endFilterExpr();

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test479");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.endTextNodeStep();
    java.lang.String var13 = var0.toString();
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startNameStep(-1, \"\", \"org.saxpath.SAXPathParseException: \")\n(4) endTextNodeStep()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startNameStep(-1, \"\", \"org.saxpath.SAXPathParseException: \")\n(4) endTextNodeStep()\n"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test480");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    java.lang.String var7 = var0.toString();
    var0.startPredicate();
    var0.startAllNodeStep(0);
    var0.endTextNodeStep();
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test481");


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
    var8.startUnaryExpr();
    var8.startXPath();
    var8.endOrExpr(false);
    var8.startRelativeLocationPath();
    var8.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test482");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startRelationalExpr();
    var0.startRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.endAndExpr(true);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test483");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.endUnionExpr(true);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.endAdditiveExpr(100);
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startXPath()\n(8) endFilterExpr()\n(9) endProcessingInstructionNodeStep()\n(10) endRelativeLocationPath()\n(11) endAndExpr(false)\n(12) endUnionExpr(true)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n(6) endOrExpr(false)\n");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test484");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startPredicate();
    var0.endUnaryExpr(100);
    var0.endRelationalExpr(100);
    var0.endRelativeLocationPath();

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test485");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.endOrExpr(false);
    var0.endCommentNodeStep();
    var0.endEqualityExpr(1);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startFilterExpr();
    var0.endEqualityExpr((-1));
    var0.startOrExpr();

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test486");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n");
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startXPath()\n", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test487");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "hi!");
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endCommentNodeStep();
    var0.number(0);
    var0.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endFilterExpr()\n(3) startRelationalExpr()\n(4) startAdditiveExpr()\n");
    var0.endProcessingInstructionNodeStep();

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test488");


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
    var23.endAdditiveExpr(10);
    var23.endAndExpr(false);
    
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

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test489");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) endAdditiveExpr(-1)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    java.lang.String var4 = var3.getXPath();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) endAdditiveExpr(-1)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) endAdditiveExpr(-1)\n"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test490");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.startCommentNodeStep(100);
    var0.endUnaryExpr(10);
    var0.startAndExpr();
    var0.endOrExpr(true);
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) endProcessingInstructionNodeStep()\n(7) endAllNodeStep()\n(8) endMultiplicativeExpr(-1)\n(9) startOrExpr()\n(10) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endProcessingInstructionNodeStep()\n(5) endMultiplicativeExpr(1)\n(6) endFilterExpr()\n(7) endPredicate()\n(8) endUnaryExpr(1)\n(9) startAllNodeStep(1)\n");
    var0.number(0);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test491");


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
    var0.startMultiplicativeExpr();
    var0.endNameStep();
    var0.endOrExpr(false);
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test492");


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
    var20.endNameStep();
    var20.endFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.XPathHandler var26 = var0.getXPathHandler();
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    org.saxpath.XPathHandler var28 = var0.getXPathHandler();
    org.saxpath.XPathHandler var29 = var0.getXPathHandler();
    org.saxpath.XPathHandler var30 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var31 = new org.saxpath.conformance.ConformanceXPathHandler();
    var31.startAbsoluteLocationPath();
    var31.endPathExpr();
    var31.startUnionExpr();
    var31.startEqualityExpr();
    var31.startFilterExpr();
    var31.startUnionExpr();
    var31.startXPath();
    var31.startRelativeLocationPath();
    var31.startRelationalExpr();
    var31.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    org.saxpath.XPathHandler var43 = var0.getXPathHandler();
    org.saxpath.XPathHandler var44 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test493");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");
    org.saxpath.SAXPathParseException var3 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var4);
    java.lang.Throwable[] var7 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test494");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) endRelativeLocationPath()\n(5) endAdditiveExpr(0)\n(6) endRelativeLocationPath()\n");

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test495");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var7 = new org.saxpath.conformance.ConformanceXPathHandler();
    var7.startAbsoluteLocationPath();
    var7.endAndExpr(true);
    boolean var12 = var7.equals((java.lang.Object)'a');
    var7.startAllNodeStep(100);
    var7.endOrExpr(false);
    var7.number(10);
    boolean var19 = var0.equals((java.lang.Object)var7);
    var7.startMultiplicativeExpr();
    var7.startPathExpr();
    var7.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var7.endAdditiveExpr(0);
    var7.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test496");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endEqualityExpr((-1));
    var0.startRelationalExpr();
    var0.number(0.0d);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test497");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.number(0);
    var0.startEqualityExpr();
    var0.number(1);
    var0.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test498");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(1);
    var0.startAndExpr();
    var0.startCommentNodeStep((-1));
    var0.endXPath();
    com.werken.saxpath.XPathReader var13 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endTextNodeStep();
    var14.endUnionExpr(true);
    var13.setXPathHandler((org.saxpath.XPathHandler)var14);
    org.saxpath.XPathHandler var20 = var13.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var21 = new org.saxpath.conformance.ConformanceXPathHandler();
    var21.endUnaryExpr((-1));
    var21.endOrExpr(false);
    var13.setXPathHandler((org.saxpath.XPathHandler)var21);
    var13.parse("org.saxpath.SAXPathException:  ^");
    var13.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var13.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var33 = new org.saxpath.conformance.ConformanceXPathHandler();
    var33.startAbsoluteLocationPath();
    var33.endEqualityExpr((-1));
    var33.endTextNodeStep();
    var33.endAdditiveExpr(1);
    var33.endAndExpr(false);
    var13.setXPathHandler((org.saxpath.XPathHandler)var33);
    org.saxpath.XPathHandler var43 = var13.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var44 = new org.saxpath.helpers.DefaultXPathHandler();
    var44.number(10.0d);
    var44.endNameStep();
    var44.number(0);
    var44.endFunction();
    var44.endPredicate();
    var44.startEqualityExpr();
    var44.endTextNodeStep();
    var44.endCommentNodeStep();
    var44.endNameStep();
    var44.startUnaryExpr();
    var44.startTextNodeStep(1);
    var44.startOrExpr();
    var13.setXPathHandler((org.saxpath.XPathHandler)var44);
    org.saxpath.conformance.ConformanceXPathHandler var61 = new org.saxpath.conformance.ConformanceXPathHandler();
    var61.startAbsoluteLocationPath();
    var61.endEqualityExpr((-1));
    var61.endTextNodeStep();
    var61.endTextNodeStep();
    var61.endAllNodeStep();
    var61.startTextNodeStep(100);
    var61.endCommentNodeStep();
    var61.endEqualityExpr(100);
    var61.startFilterExpr();
    var13.setXPathHandler((org.saxpath.XPathHandler)var61);
    boolean var75 = var0.equals((java.lang.Object)var61);
    var0.number(10);
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test499");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endUnionExpr(false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest52.test500");


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
    var20.endNameStep();
    var20.endFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.XPathHandler var26 = var0.getXPathHandler();
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    org.saxpath.XPathHandler var28 = var0.getXPathHandler();
    org.saxpath.XPathHandler var29 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var30 = new org.saxpath.conformance.ConformanceXPathHandler();
    var30.startAbsoluteLocationPath();
    var30.endUnaryExpr(10);
    var30.startMultiplicativeExpr();
    var30.startEqualityExpr();
    var30.startAdditiveExpr();
    var30.endEqualityExpr(1);
    var30.endOrExpr(false);
    var30.endFunction();
    var30.endUnaryExpr(100);
    var30.startUnaryExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var30);
    org.saxpath.helpers.DefaultXPathHandler var46 = new org.saxpath.helpers.DefaultXPathHandler();
    var46.endXPath();
    var46.startFilterExpr();
    var46.startXPath();
    var46.startCommentNodeStep(10);
    var46.endUnionExpr(false);
    var46.startRelationalExpr();
    var46.endAllNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    org.saxpath.conformance.ConformanceXPathHandler var57 = new org.saxpath.conformance.ConformanceXPathHandler();
    var57.startAbsoluteLocationPath();
    var57.endAndExpr(true);
    boolean var62 = var57.equals((java.lang.Object)'a');
    var57.startAbsoluteLocationPath();
    var57.endMultiplicativeExpr((-1));
    var57.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var57.startAndExpr();
    var57.endUnionExpr(true);
    var57.startEqualityExpr();
    var57.endOrExpr(false);
    var57.startAndExpr();
    var57.endXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var57);
    org.saxpath.conformance.ConformanceXPathHandler var77 = new org.saxpath.conformance.ConformanceXPathHandler();
    var77.startAbsoluteLocationPath();
    var77.endEqualityExpr((-1));
    var77.endTextNodeStep();
    var77.endAdditiveExpr(1);
    var77.endOrExpr(false);
    var77.number(10.0d);
    var77.startOrExpr();
    var77.endPathExpr();
    var77.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

}
