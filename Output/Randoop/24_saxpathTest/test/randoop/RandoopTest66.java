package randoop;

import junit.framework.*;

public class RandoopTest66 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test1");


    int var1 = org.saxpath.Axis.lookup("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startAndExpr()\n(5) startAdditiveExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test2");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.endUnionExpr(false);
    var0.endAdditiveExpr((-1));
    var0.startAndExpr();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test3");


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
    var0.startFilterExpr();
    var0.endEqualityExpr((-1));
    var0.startPredicate();

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test4");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(100);
    var0.endRelativeLocationPath();
    java.lang.String var5 = var0.toString();
    org.saxpath.conformance.ConformanceXPathHandler var6 = new org.saxpath.conformance.ConformanceXPathHandler();
    var6.startAbsoluteLocationPath();
    var6.startNameStep(100, " ^", " ^");
    var6.endUnionExpr(false);
    var6.startRelationalExpr();
    var6.endXPath();
    boolean var16 = var0.equals((java.lang.Object)var6);
    var6.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startNameStep(0, \" ^\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startEqualityExpr()\n(8) startPredicate()\n(9) startNameStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) startRelationalExpr()\n(11) endMultiplicativeExpr(-1)\n(12) number(-1)\n(13) endXPath()\n(14) startAbsoluteLocationPath()\n(15) endRelationalExpr(-1)\n(16) startOrExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n(9) endMultiplicativeExpr(-1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test5");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endRelationalExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test6");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endCommentNodeStep();
    var0.endCommentNodeStep();

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test7");


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
    var15.startPathExpr();
    var15.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test8");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.startPredicate();
    var0.startOrExpr();
    var0.endAndExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endFunction();
    var0.startTextNodeStep(100);
    var0.endRelationalExpr(0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test9");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getXPath();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.getPositionMarker();
    
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
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test10");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "\n ^\n ^");
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.startTextNodeStep((-1));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test11");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(0);
    var0.number(10);
    var0.endEqualityExpr(1);
    var0.startAdditiveExpr();
    var0.startMultiplicativeExpr();
    var0.startPredicate();

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test12");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endCommentNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.startCommentNodeStep(1);
    var0.endRelationalExpr(0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test13");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startPathExpr();
    var0.endNameStep();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startFilterExpr()\n(6) startAllNodeStep(0)\n(7) endXPath()\n");
    var0.endUnaryExpr((-1));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startUnaryExpr()\n(7) endFilterExpr()\n(8) endFunction()\n(9) startXPath()\n(10) endRelationalExpr(0)\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endAdditiveExpr(-1)\n(6) startPathExpr()\n(7) startRelativeLocationPath()\n(8) startNameStep(1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: child\")\n(9) startAdditiveExpr()\n(10) endFilterExpr()\n");

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test14");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var0.endCommentNodeStep();
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test15");


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
    var0.endAdditiveExpr((-1));
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test16");


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
    var0.startOrExpr();

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test17");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    var0.variableReference("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endCommentNodeStep()\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n");

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test18");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");
    org.saxpath.conformance.ConformanceXPathHandler var32 = new org.saxpath.conformance.ConformanceXPathHandler();
    var32.startAbsoluteLocationPath();
    var32.endEqualityExpr((-1));
    var32.endTextNodeStep();
    var32.endAdditiveExpr(1);
    var32.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    org.saxpath.XPathHandler var43 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var44 = new org.saxpath.helpers.DefaultXPathHandler();
    var44.number(10.0d);
    var44.endPathExpr();
    var44.endUnionExpr(false);
    var44.startNameStep(0, "", "");
    var44.endOrExpr(false);
    var44.endEqualityExpr(100);
    var44.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startXPath()\n(4) endAllNodeStep()\n(5) endRelationalExpr(1)\n(6) endAllNodeStep()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var44);
    org.saxpath.conformance.ConformanceXPathHandler var62 = new org.saxpath.conformance.ConformanceXPathHandler();
    var62.startAbsoluteLocationPath();
    var62.endEqualityExpr((-1));
    var62.endTextNodeStep();
    var62.endAdditiveExpr(1);
    var62.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var62.endPathExpr();
    var62.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var62.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var62.startAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var62);
    var62.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test19");


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
    var22.endRelativeLocationPath();
    var22.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test20");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var12 = var11.getPositionMarker();
    java.lang.Throwable[] var13 = var11.getSuppressed();
    int var14 = var11.getPosition();
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var16 = var11.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "                                                                                                    ^"+ "'", var12.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test21");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.endXPath();
    var0.startAndExpr();
    var0.startPathExpr();

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test22");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.startAllNodeStep(0);
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startUnionExpr();
    var0.endFunction();
    var0.startTextNodeStep(10);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test23");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.endXPath();
    var0.endFunction();
    var0.number((-1));
    var0.startCommentNodeStep(10);
    var0.startPathExpr();
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test24");


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
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr(10);
    var0.startAllNodeStep(0);
    org.saxpath.helpers.DefaultXPathHandler var21 = new org.saxpath.helpers.DefaultXPathHandler();
    var21.number(10.0d);
    var21.endRelativeLocationPath();
    var21.startRelativeLocationPath();
    var21.endFilterExpr();
    var21.endXPath();
    var21.number(1);
    var21.endRelationalExpr(1);
    var21.endEqualityExpr(10);
    var21.endNameStep();
    var21.startEqualityExpr();
    boolean var36 = var0.equals((java.lang.Object)var21);
    var21.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) endAdditiveExpr(10)\n(4) startProcessingInstructionNodeStep(100, \"com.werken.saxpath.XPathSyntaxException: 10: ^\")\n(5) startPredicate()\n(6) startTextNodeStep(100)\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startTextNodeStep(100)\n(5) endUnionExpr(true)\n(6) endProcessingInstructionNodeStep()\n(7) endXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test25");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.literal("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n\n ^");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test26");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endPredicate();
    var0.startRelativeLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startFunction(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:child\")\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(4) endAbsoluteLocationPath()\n(5) endPredicate()\n(6) startFilterExpr()\n(7) startCommentNodeStep(0)\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n");
    var0.endNameStep();
    var0.endAndExpr(true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test27");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(10);
    var0.endXPath();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test28");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endFunction();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", " ^");
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startRelationalExpr();
    var0.endFilterExpr();
    var0.startEqualityExpr();

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test29");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endMultiplicativeExpr(1);
    var0.endFunction();
    var0.number(1);
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.endUnaryExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test30");


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
    var0.endFilterExpr();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test31");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endTextNodeStep();
    var0.endNameStep();

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test32");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n", 1, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test33");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endOrExpr(true);
    var0.endUnionExpr(true);
    var0.endFunction();

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test34");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep((-1));
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endRelationalExpr(1);
    var0.startAllNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test35");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.endCommentNodeStep();
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.startXPath();
    var0.startPredicate();

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test36");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endFunction();
    var0.startTextNodeStep(1);
    var0.startPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^");
    var0.startAndExpr();
    var0.startAdditiveExpr();

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test37");


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
    var25.endFunction();
    var25.startUnaryExpr();
    var25.endTextNodeStep();
    var25.startPredicate();
    var25.endTextNodeStep();
    var25.startMultiplicativeExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var25);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) endUnionExpr(false)\n(6) endPredicate()\n");
    org.saxpath.conformance.ConformanceXPathHandler var35 = new org.saxpath.conformance.ConformanceXPathHandler();
    var35.startAbsoluteLocationPath();
    var35.endPathExpr();
    var35.startUnionExpr();
    var35.literal(" ^");
    var35.startAndExpr();
    var35.startPathExpr();
    var35.number(10.0d);
    var0.setXPathHandler((org.saxpath.XPathHandler)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("\n ^\n ^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test38");


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
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startAllNodeStep((-1));
    var0.startEqualityExpr();
    var0.endXPath();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test39");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.endRelationalExpr((-1));
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.endFilterExpr();
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    var16.endPathExpr();
    var16.endTextNodeStep();
    var16.startUnaryExpr();
    var16.startUnionExpr();
    org.saxpath.conformance.ConformanceXPathHandler var24 = new org.saxpath.conformance.ConformanceXPathHandler();
    var24.startAbsoluteLocationPath();
    var24.endUnaryExpr(10);
    var24.number(1);
    boolean var31 = var24.equals((java.lang.Object)10L);
    var24.startCommentNodeStep(100);
    var24.startUnionExpr();
    var24.endTextNodeStep();
    var24.startFilterExpr();
    boolean var37 = var16.equals((java.lang.Object)var24);
    var24.endRelationalExpr((-1));
    var24.startAndExpr();
    var24.endFilterExpr();
    boolean var42 = var0.equals((java.lang.Object)var24);
    var24.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test40");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endTextNodeStep();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \ncom.werken.saxpath.XPathSyntaxException: -1: child\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test41");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.number(10);
    var0.endAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.endOrExpr(false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test42");


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
    var1.startEqualityExpr();

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test43");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.number(0.0d);
    var0.endOrExpr(false);
    var0.startFilterExpr();
    var0.startRelationalExpr();
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test44");


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
    var0.endRelationalExpr((-1));
    var0.endAllNodeStep();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test45");


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
    var7.number(10);
    var7.endAndExpr(false);
    var7.endProcessingInstructionNodeStep();
    var7.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test46");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.startUnionExpr();
    var0.endPathExpr();
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var17 = var16.getPositionMarker();
    org.saxpath.SAXPathException var18 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    java.lang.String var19 = var16.toString();
    int var20 = var16.getPosition();
    int var21 = var16.getPosition();
    java.lang.String var22 = var16.getXPath();
    java.lang.String var23 = var16.toString();
    java.lang.String var24 = var16.getPositionMarker();
    java.lang.String var25 = var16.getMultilineMessage();
    java.lang.String var26 = var16.toString();
    boolean var27 = var0.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + " ^"+ "'", var17.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var19.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + " ^"+ "'", var22.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + " ^"+ "'", var24.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "\n ^\n ^"+ "'", var25.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test47");


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
    var9.startRelationalExpr();
    var9.endXPath();
    var9.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test48");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    var0.number((-1.0d));
    var0.endAbsoluteLocationPath();
    var0.endNameStep();

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test49");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n");
    var0.endFunction();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startTextNodeStep(100)\n(3) startUnionExpr()\n(4) startAndExpr()\n(5) startAbsoluteLocationPath()\n", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n");
    var0.startFilterExpr();

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test50");


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
    var0.startMultiplicativeExpr();
    var0.startPredicate();

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test51");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(100);
    var0.startPathExpr();
    var0.endUnionExpr(true);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test52");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(true);
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test53");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endPathExpr();
    var0.endOrExpr(false);
    var0.endXPath();
    var0.startPathExpr();
    var0.endUnaryExpr(100);
    var0.startOrExpr();

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test54");


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
    org.saxpath.conformance.ConformanceXPathHandler var36 = new org.saxpath.conformance.ConformanceXPathHandler();
    var36.startRelativeLocationPath();
    var36.endUnaryExpr(10);
    var36.startNameStep((-1), "", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
    var36.endFilterExpr();
    var36.startAndExpr();
    var36.startPathExpr();
    var36.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test55");


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
    var7.startPathExpr();
    var7.startRelativeLocationPath();
    var7.startTextNodeStep(10);
    var7.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test56");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(100);
    var0.endNameStep();
    var0.startFilterExpr();
    var0.endUnaryExpr((-1));
    var0.endTextNodeStep();

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test57");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getXPath();
    java.lang.String var8 = var3.toString();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var13 = var12.getPositionMarker();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var12);
    java.lang.Throwable[] var16 = var12.getSuppressed();
    java.lang.String var17 = var12.getXPath();
    var3.addSuppressed((java.lang.Throwable)var12);
    int var19 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "                                                                                                    ^"+ "'", var13.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test58");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endRelationalExpr(-1)\n(11) endPathExpr()\n(12) startUnionExpr()\n");
    var0.endRelationalExpr(1);
    var0.startUnaryExpr();
    var0.endFilterExpr();

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test59");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endOrExpr(false);
    var0.number(10.0d);
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test60");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endEqualityExpr((-1));
    var0.endPredicate();
    var0.startMultiplicativeExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startPathExpr();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test61");


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
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test62");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var6 = new org.saxpath.helpers.DefaultXPathHandler();
    var6.number(10.0d);
    var6.endNameStep();
    var6.endAbsoluteLocationPath();
    var6.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var6.startUnionExpr();
    var6.endAbsoluteLocationPath();
    boolean var16 = var0.equals((java.lang.Object)var6);
    var6.startEqualityExpr();
    var6.startAbsoluteLocationPath();
    var6.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test63");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endRelationalExpr((-1));
    var0.endAllNodeStep();
    var0.number(1.0d);
    var0.endProcessingInstructionNodeStep();
    var0.endUnionExpr(false);
    var0.endPathExpr();

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test64");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(0);
    var0.endTextNodeStep();
    var0.endPathExpr();
    var0.endPredicate();
    var0.startPredicate();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endTextNodeStep();
    var12.endAdditiveExpr(1);
    java.lang.String var17 = var12.toString();
    var12.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endRelativeLocationPath();
    var19.startRelativeLocationPath();
    var19.endFilterExpr();
    var19.endAdditiveExpr(100);
    boolean var27 = var12.equals((java.lang.Object)var19);
    var12.endXPath();
    var12.startUnaryExpr();
    var12.startUnionExpr();
    var12.startUnaryExpr();
    var12.endOrExpr(false);
    boolean var34 = var0.equals((java.lang.Object)false);
    var0.startMultiplicativeExpr();
    var0.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test65");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startUnionExpr();
    var0.startFilterExpr();
    var0.endXPath();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "org.saxpath.SAXPathException: ");
    var0.startRelativeLocationPath();
    var0.endAbsoluteLocationPath();
    var0.number(100);
    var0.endOrExpr(false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test66");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.endTextNodeStep();
    var0.startEqualityExpr();
    var0.endUnionExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(10, "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n");
    var0.endRelationalExpr(10);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test67");


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
    var17.endFunction();
    var17.endCommentNodeStep();
    var17.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var34 = new org.saxpath.conformance.ConformanceXPathHandler();
    var34.startAbsoluteLocationPath();
    var34.endTextNodeStep();
    var34.endAdditiveExpr(1);
    java.lang.String var39 = var34.toString();
    var34.startRelativeLocationPath();
    var34.startUnaryExpr();
    var34.endXPath();
    var34.endAndExpr(true);
    var34.startAbsoluteLocationPath();
    var34.endMultiplicativeExpr(10);
    var34.startRelativeLocationPath();
    boolean var49 = var17.equals((java.lang.Object)var34);
    var17.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var39.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test68");


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
    var14.endXPath();
    var14.endAdditiveExpr(0);
    var14.endAllNodeStep();
    var14.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test69");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endFunction();
    var0.startOrExpr();

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test70");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAndExpr(false);
    var0.number((-1));
    var0.endXPath();

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test71");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.endRelationalExpr((-1));
    var0.startTextNodeStep(100);
    var0.endEqualityExpr((-1));
    var0.startOrExpr();
    var0.endAdditiveExpr(100);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test72");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endNameStep();
    var0.startFilterExpr();
    var0.endEqualityExpr(10);
    var0.endXPath();

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test73");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.endRelationalExpr(1);
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) endPredicate()\n(4) endProcessingInstructionNodeStep()\n(5) startAdditiveExpr()\n(6) startFilterExpr()\n");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n(3) endOrExpr(false)\n(4) endFilterExpr()\n(5) literal(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) endUnaryExpr(1)\n(7) endFunction()\n(8) endAndExpr(true)\n");
    var0.endAllNodeStep();
    var0.startUnionExpr();
    var0.startXPath();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test74");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endOrExpr(false);
    var0.endEqualityExpr(0);
    var0.endAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.endFilterExpr();

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test75");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", 100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test76");


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
    var0.startRelationalExpr();
    java.lang.String var17 = var0.toString();
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n"+ "'", var17.equals("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test77");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("^", 0, "hi!");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var6.getSuppressed();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", 10, "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var12 = var11.getMultilineMessage();
    var6.addSuppressed((java.lang.Throwable)var11);
    org.saxpath.XPathSyntaxException var17 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var18 = var17.getXPath();
    java.lang.String var19 = var17.getPositionMarker();
    org.saxpath.SAXPathException var20 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    java.lang.String var21 = var17.getXPath();
    java.lang.String var22 = var17.getMultilineMessage();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    org.saxpath.SAXPathException var24 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    var6.addSuppressed((java.lang.Throwable)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \n          ^"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + " ^"+ "'", var19.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test78");


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
    var70.startOrExpr();
    
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

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test79");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(100);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test80");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.startTextNodeStep(0);
    var0.endPathExpr();
    var0.startAbsoluteLocationPath();
    var0.literal("org.saxpath.SAXPathParseException: ");

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test81");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.number(1);
    var0.endCommentNodeStep();
    var0.endPathExpr();

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test82");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endUnaryExpr(1);
    var0.endMultiplicativeExpr(10);
    var0.endAdditiveExpr(10);
    var0.endOrExpr(false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test83");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.number((-1));
    var0.endRelationalExpr(1);
    var0.startCommentNodeStep(0);
    var0.startAbsoluteLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var22 = new org.saxpath.helpers.DefaultXPathHandler();
    var22.number(10.0d);
    var22.endNameStep();
    var22.number(0);
    var22.endFunction();
    var22.endRelationalExpr(0);
    var22.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var22.startXPath();
    var22.endAllNodeStep();
    boolean var35 = var0.equals((java.lang.Object)var22);
    var22.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n");
    var22.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test84");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.endRelativeLocationPath();
    var7.startRelativeLocationPath();
    var7.endFilterExpr();
    var7.endXPath();
    var7.startUnionExpr();
    var7.startTextNodeStep(10);
    var7.startAndExpr();
    boolean var18 = var0.equals((java.lang.Object)var7);
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test85");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var6 = var4.getSuppressed();
    org.saxpath.SAXPathParseException var8 = new org.saxpath.SAXPathParseException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    var8.addSuppressed((java.lang.Throwable)var10);
    var4.addSuppressed((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test86");


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
    var0.endRelativeLocationPath();
    var0.number(1);
    var0.endPathExpr();
    var0.endRelativeLocationPath();
    var0.startOrExpr();

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test87");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startNameStep(0, " ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.endXPath();
    var0.startAndExpr();
    var0.startFilterExpr();

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test88");


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
    var0.endUnaryExpr((-1));
    var0.startAllNodeStep(0);
    var0.endUnaryExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test89");


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
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.startAllNodeStep(0);
    var0.number(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test90");


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
    var36.endProcessingInstructionNodeStep();
    var36.startAbsoluteLocationPath();
    java.lang.String var47 = var36.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startAndExpr()\n(4) startUnaryExpr()\n(5) endPathExpr()\n(6) endProcessingInstructionNodeStep()\n(7) startAbsoluteLocationPath()\n"+ "'", var47.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startAndExpr()\n(4) startUnaryExpr()\n(5) endPathExpr()\n(6) endProcessingInstructionNodeStep()\n(7) startAbsoluteLocationPath()\n"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test91");


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
    var8.endCommentNodeStep();
    var8.endRelationalExpr(0);
    var8.startXPath();
    var8.number(10);
    var8.startOrExpr();
    var8.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test92");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.startFilterExpr();
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.endMultiplicativeExpr((-1));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test93");


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
    var0.endAllNodeStep();
    var0.endEqualityExpr(100);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n(7) endTextNodeStep()\n(8) endProcessingInstructionNodeStep()\n");
    var0.startFunction("org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.endAndExpr(false);
    var0.variableReference("org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n");
    var0.endAdditiveExpr(1);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test94");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.endUnaryExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.endAdditiveExpr(0);
    var0.startUnaryExpr();
    var0.startRelationalExpr();
    var0.startFilterExpr();
    var0.endUnaryExpr(0);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test95");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.startPredicate();
    var0.endRelationalExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test96");


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
    var0.startFilterExpr();
    var0.startAllNodeStep(10);
    var0.endAdditiveExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test97");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.literal("child");
    var0.startUnaryExpr();
    var0.endAdditiveExpr(100);
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep((-1));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test98");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", 0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    int var5 = var3.getPosition();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.String var7 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test99");


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
    var9.endOrExpr(false);
    var9.startRelationalExpr();
    var9.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test100");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endXPath();
    var0.endAndExpr(true);
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr(10);
    var0.startRelativeLocationPath();
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test101");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endOrExpr(true);
    var0.endProcessingInstructionNodeStep();
    var0.endAndExpr(false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test102");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "com.werken.saxpath.XPathSyntaxException: 100:  ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n"));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test103");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.endNameStep();

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test104");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 100:  ^", 10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    var6.addSuppressed((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test105");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.startTextNodeStep(100);
    var0.endCommentNodeStep();
    var0.startCommentNodeStep(100);
    var0.number(0);
    var0.startAllNodeStep(0);
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.endAbsoluteLocationPath();
    var0.endOrExpr(true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test106");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endAdditiveExpr(10);
    var0.startAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test107");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endRelationalExpr(1);
    var0.startRelationalExpr();
    var0.startAndExpr();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test108");


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
    var0.number(1.0d);
    var0.startFilterExpr();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test109");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.endCommentNodeStep();
    var0.endMultiplicativeExpr(1);
    var0.startPathExpr();
    var0.startXPath();
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test110");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.number((-1));
    var0.endOrExpr(false);
    var0.startEqualityExpr();

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test111");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.startTextNodeStep((-1));
    var0.endPathExpr();
    var0.startEqualityExpr();

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test112");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, "com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^");
    java.lang.String var4 = var3.getPositionMarker();
    int var5 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test113");


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
    var0.startRelationalExpr();
    java.lang.String var17 = var0.toString();
    var0.startEqualityExpr();
    var0.endFunction();
    var0.endAbsoluteLocationPath();
    var0.endAdditiveExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n"+ "'", var17.equals("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test114");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.startPathExpr();
    var0.startRelationalExpr();
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startOrExpr();

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test115");


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
    var1.startAndExpr();
    var1.startAdditiveExpr();
    var1.endPredicate();
    var1.startEqualityExpr();
    var1.startRelativeLocationPath();
    var1.endFunction();
    var1.startEqualityExpr();
    var1.startPredicate();
    java.lang.String var23 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(1)\n(6) endRelationalExpr(10)\n(7) startAndExpr()\n(8) startAdditiveExpr()\n(9) endPredicate()\n(10) startEqualityExpr()\n(11) startRelativeLocationPath()\n(12) endFunction()\n(13) startEqualityExpr()\n(14) startPredicate()\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(1)\n(6) endRelationalExpr(10)\n(7) startAndExpr()\n(8) startAdditiveExpr()\n(9) endPredicate()\n(10) startEqualityExpr()\n(11) startRelativeLocationPath()\n(12) endFunction()\n(13) startEqualityExpr()\n(14) startPredicate()\n"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test116");


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
    var0.endAdditiveExpr(100);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) endOrExpr(false)\n(6) startAbsoluteLocationPath()\n(7) startAllNodeStep(100)\n(8) endAdditiveExpr(-1)\n(9) startEqualityExpr()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endFilterExpr()\n");
    var0.endAllNodeStep();
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test117");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var14 = var3.getXPath();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"+ "'", var12.equals("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test118");


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
    var0.startEqualityExpr();
    var0.number((-1));
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test119");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endAdditiveExpr(0);
    var0.endNameStep();
    var0.endUnaryExpr(100);
    var0.endCommentNodeStep();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test120");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.endEqualityExpr(1);
    var0.endOrExpr(true);
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var0.endXPath();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test121");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endPredicate();
    var0.endUnionExpr(false);
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startAdditiveExpr()\n(8) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n\", \"org.saxpath.SAXPathParseException: \")\n(9) endRelativeLocationPath()\n(10) startTextNodeStep(0)\n(11) endAdditiveExpr(100)\n(12) startProcessingInstructionNodeStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\")\n(13) endRelationalExpr(0)\n(14) startUnaryExpr()\n");

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test122");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.endRelationalExpr(1);
    var0.startFilterExpr();
    var0.startFilterExpr();
    var0.endCommentNodeStep();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test123");


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
    var0.startAdditiveExpr();
    var0.number((-1));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test124");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) startProcessingInstructionNodeStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) number(-1.0)\n(8) endAdditiveExpr(1)\n(9) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n:org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test125");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.number((-1));
    var0.endXPath();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr(0);
    var0.startPathExpr();

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test126");


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
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endMultiplicativeExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test127");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endAdditiveExpr(1)\n");

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test128");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.startTextNodeStep(10);
    var0.startXPath();
    var0.endRelationalExpr((-1));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test129");


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
    var0.startXPath();
    var0.startCommentNodeStep(1);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test130");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.startMultiplicativeExpr();
    var0.startRelationalExpr();

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test131");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startRelationalExpr()\n(7) endOrExpr(false)\n");
    org.saxpath.helpers.DefaultXPathHandler var31 = new org.saxpath.helpers.DefaultXPathHandler();
    var31.number(10.0d);
    var31.endRelativeLocationPath();
    var31.startRelativeLocationPath();
    var31.endFilterExpr();
    var31.endXPath();
    var31.startUnionExpr();
    var31.endPredicate();
    var31.startPathExpr();
    var31.startTextNodeStep(1);
    var31.endTextNodeStep();
    var31.endPredicate();
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test132");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.endRelationalExpr(1);
    var0.endAllNodeStep();
    var0.number(0);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test133");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(1);
    var0.endNameStep();
    var0.startCommentNodeStep(10);
    var0.endAdditiveExpr(0);
    java.lang.String var13 = var0.toString();
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n(5) startCommentNodeStep(10)\n(6) endAdditiveExpr(0)\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n(5) startCommentNodeStep(10)\n(6) endAdditiveExpr(0)\n"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test134");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.number(1.0d);
    var0.endRelationalExpr(10);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test135");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.number(10);
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");
    var0.endUnionExpr(true);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test136");


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
    var0.endAllNodeStep();
    var0.endPredicate();

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test137");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test138");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.endCommentNodeStep();
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test139");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endCommentNodeStep();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n");
    var0.endNameStep();

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test140");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep(100);
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n");

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test141");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.number(0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test142");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test143");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(1, " ^");
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(0);
    var0.endProcessingInstructionNodeStep();
    org.saxpath.SAXPathParseException var17 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");
    boolean var18 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test144");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.SAXPathParseException var8 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    java.lang.String var9 = var8.toString();
    org.saxpath.XPathSyntaxException var13 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var14 = var13.getMultilineMessage();
    java.lang.String var15 = var13.getPositionMarker();
    org.saxpath.SAXPathParseException var17 = new org.saxpath.SAXPathParseException("");
    java.lang.String var18 = var17.toString();
    org.saxpath.SAXPathException var20 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var17.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var22 = var17.toString();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    var13.addSuppressed((java.lang.Throwable)var17);
    var8.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var9.equals("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "^"+ "'", var15.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var18.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var22.equals("org.saxpath.SAXPathParseException: "));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test145");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endPredicate();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr(10);
    var0.startOrExpr();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.startPredicate();

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test146");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.startUnaryExpr();
    var0.startEqualityExpr();
    var0.startAbsoluteLocationPath();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var16 = var15.getPositionMarker();
    java.lang.String var17 = var15.toString();
    int var18 = var15.getPosition();
    org.saxpath.SAXPathException var19 = new org.saxpath.SAXPathException((java.lang.Throwable)var15);
    org.saxpath.SAXPathException var20 = new org.saxpath.SAXPathException((java.lang.Throwable)var19);
    boolean var21 = var0.equals((java.lang.Object)var20);
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test147");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.endFunction();
    var0.startPredicate();
    var0.endOrExpr(true);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test148");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endTextNodeStep();
    var13.endAdditiveExpr(1);
    var13.startCommentNodeStep((-1));
    var13.endTextNodeStep();
    var13.startCommentNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var13);
    org.saxpath.XPathHandler var24 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) number(0.0)\n(8) startEqualityExpr()\n(9) startEqualityExpr()\n");
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.startAbsoluteLocationPath();
    var27.startAdditiveExpr();
    var27.endCommentNodeStep();
    var27.startUnaryExpr();
    var27.endXPath();
    var27.startUnionExpr();
    var27.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var27);
    var0.parse("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) startAbsoluteLocationPath()\n(6) endOrExpr(false)\n(7) startRelativeLocationPath()\n(8) endPathExpr()\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: 10: (0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n(8) startNameStep(1, \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) endCommentNodeStep()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n\")\n(9) endMultiplicativeExpr(10)\n");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test149");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.startUnaryExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endUnaryExpr(100);
    var0.endEqualityExpr(0);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test150");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startNameStep(10, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startProcessingInstructionNodeStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n\")\n(8) endUnionExpr(false)\n(9) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) endTextNodeStep()\n(5) startCommentNodeStep(100)\n(6) endPathExpr()\n(7) startMultiplicativeExpr()\n");

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test151");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    var0.startProcessingInstructionNodeStep(1, "child\norg.saxpath.SAXPathException:  ^\n^");
    var0.number(100.0d);
    var0.number(10);
    var0.endAdditiveExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test152");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endFilterExpr();
    var0.endEqualityExpr(10);
    var0.startAbsoluteLocationPath();

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test153");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startXPath();
    var0.startXPath();
    var0.endAndExpr(true);
    var0.endFilterExpr();
    var0.endAdditiveExpr((-1));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test154");


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
    var0.endAbsoluteLocationPath();
    var0.endNameStep();
    var0.startEqualityExpr();

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test155");


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
    var0.startPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test156");


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
    var0.startPathExpr();

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test157");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endAndExpr(true);
    var1.startPredicate();
    var1.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) endPredicate()\n(4) endProcessingInstructionNodeStep()\n(5) startAdditiveExpr()\n(6) startFilterExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var1.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n");
    var1.startCommentNodeStep(100);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test158");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startCommentNodeStep(1);
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startRelativeLocationPath()\n(6) endAllNodeStep()\n(7) startAllNodeStep(1)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endUnionExpr(false)\n(8) startNameStep(-1, \"                                                                                                    ^\", \"\n ^\n ^\")\n(9) endAllNodeStep()\n(10) startEqualityExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test159");


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
    var7.endUnionExpr(true);
    var7.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n");
    var7.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test160");


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
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startMultiplicativeExpr();

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test161");


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
    com.werken.saxpath.XPathReader var36 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var37 = new org.saxpath.conformance.ConformanceXPathHandler();
    var37.startAbsoluteLocationPath();
    var37.endUnaryExpr(10);
    var37.number(1);
    var37.startAllNodeStep((-1));
    var37.startOrExpr();
    var36.setXPathHandler((org.saxpath.XPathHandler)var37);
    var37.endUnaryExpr(1);
    var37.startEqualityExpr();
    var37.endPredicate();
    var37.endOrExpr(false);
    boolean var53 = var17.equals((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test162");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startCommentNodeStep((-1));
    var0.endCommentNodeStep();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test163");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "org.saxpath.SAXPathException: ");
    var0.endUnionExpr(true);
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n");
    var0.endAllNodeStep();
    var0.endPathExpr();
    var0.endNameStep();
    var0.endXPath();
    var0.startXPath();

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test164");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.number(1.0d);
    var0.startCommentNodeStep((-1));
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(10);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test165");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.number(1.0d);
    var0.startUnaryExpr();
    var0.startAndExpr();
    var0.number(0.0d);
    var0.startPathExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test166");


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
    org.saxpath.conformance.ConformanceXPathHandler var32 = new org.saxpath.conformance.ConformanceXPathHandler();
    var32.startAbsoluteLocationPath();
    var32.endAndExpr(true);
    boolean var37 = var32.equals((java.lang.Object)'a');
    var32.startAbsoluteLocationPath();
    var32.endMultiplicativeExpr((-1));
    var32.startProcessingInstructionNodeStep(1, " ^");
    var32.startFilterExpr();
    var32.endRelationalExpr(100);
    var32.endCommentNodeStep();
    var32.number((-1.0d));
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    var32.endAllNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var52 = new org.saxpath.conformance.ConformanceXPathHandler();
    var52.endAllNodeStep();
    var52.startFilterExpr();
    var52.endAdditiveExpr(0);
    var52.endPredicate();
    boolean var58 = var32.equals((java.lang.Object)var52);
    var52.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n");
    java.lang.String var63 = var52.toString();
    var52.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "(0) endAllNodeStep()\n(1) startFilterExpr()\n(2) endAdditiveExpr(0)\n(3) endPredicate()\n(4) startNameStep(100, \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n\", \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n\")\n"+ "'", var63.equals("(0) endAllNodeStep()\n(1) startFilterExpr()\n(2) endAdditiveExpr(0)\n(3) endPredicate()\n(4) startNameStep(100, \"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n\", \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n\")\n"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test167");


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
    var8.startEqualityExpr();
    var8.endCommentNodeStep();
    var8.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endAllNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test168");


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
    var0.endUnaryExpr(10);
    var0.startFilterExpr();
    var0.startOrExpr();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test169");


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
    java.lang.String var19 = var8.toString();
    var8.endUnionExpr(false);
    var8.startAndExpr();
    var8.startFunction("com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var8.startPredicate();
    var8.startMultiplicativeExpr();
    var8.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"+ "'", var19.equals("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test170");


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
    var0.startPathExpr();
    var0.endEqualityExpr(10);
    var0.startRelationalExpr();
    var0.endPredicate();
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test171");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.startPathExpr();
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.endFunction();
    var0.endAndExpr(true);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test172");


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
    var0.startFunction("          ^", "hi!");
    var0.startFilterExpr();
    var0.endAdditiveExpr((-1));
    var0.endMultiplicativeExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test173");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.startOrExpr();
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startAllNodeStep(100);
    var0.endAndExpr(false);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endOrExpr(false)\n(9) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^");
    var0.startUnaryExpr();

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test174");


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
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endProcessingInstructionNodeStep();
    var0.startUnaryExpr();
    var0.number(10.0d);
    org.saxpath.XPathSyntaxException var27 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var28 = var27.getPositionMarker();
    java.lang.String var29 = var27.toString();
    org.saxpath.SAXPathException var30 = new org.saxpath.SAXPathException((java.lang.Throwable)var27);
    java.lang.String var31 = var27.getMultilineMessage();
    java.lang.String var32 = var27.getMultilineMessage();
    java.lang.String var33 = var27.toString();
    org.saxpath.SAXPathException var34 = new org.saxpath.SAXPathException((java.lang.Throwable)var27);
    java.lang.String var35 = var27.getXPath();
    java.lang.String var36 = var27.getXPath();
    java.lang.String var37 = var27.toString();
    java.lang.String var38 = var27.getXPath();
    org.saxpath.XPathSyntaxException var42 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var46 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var47 = var46.getXPath();
    var42.addSuppressed((java.lang.Throwable)var46);
    java.lang.String var49 = var42.toString();
    java.lang.String var50 = var42.toString();
    java.lang.String var51 = var42.getPositionMarker();
    var27.addSuppressed((java.lang.Throwable)var42);
    boolean var53 = var0.equals((java.lang.Object)var42);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var29.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var32.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var33.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var37.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var49.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var50.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "                                                                                                    ^"+ "'", var51.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test175");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startPredicate();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test176");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n\n          ^");

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test177");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.number(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startPathExpr()\n(5) endPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    var0.startUnionExpr();
    var0.endOrExpr(true);
    var0.startTextNodeStep((-1));
    var0.startFilterExpr();

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test178");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(1, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException:  ^");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test179");


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
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.startCommentNodeStep(0);
    var20.startOrExpr();
    var20.startAndExpr();
    var20.endAdditiveExpr(100);
    var20.startPredicate();
    var20.startOrExpr();
    var20.startOrExpr();
    boolean var32 = var0.equals((java.lang.Object)var20);
    var0.endUnionExpr(false);
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test180");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.startOrExpr();
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.startXPath();
    var0.endUnaryExpr(100);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test181");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.startRelativeLocationPath();
    var0.endFunction();
    var0.startFilterExpr();
    var0.number(100);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test182");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAllNodeStep(100);
    var0.startFilterExpr();
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.endRelationalExpr(10);
    var0.endOrExpr(true);
    var0.endAndExpr(false);
    var0.startUnaryExpr();
    var0.startMultiplicativeExpr();
    var0.startNameStep(10, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) startFilterExpr()\n(6) startRelationalExpr()\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n(4) endUnionExpr(false)\n(5) startAndExpr()\n(6) endAndExpr(false)\n(7) startEqualityExpr()\n(8) startAndExpr()\n(9) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startAbsoluteLocationPath()\n(5) startAdditiveExpr()\n(6) startAbsoluteLocationPath()\n(7) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test183");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.startAllNodeStep(10);
    var0.endFunction();
    var0.endAllNodeStep();
    var0.startFilterExpr();

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test184");


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
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startRelationalExpr();
    var0.endAllNodeStep();

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test185");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.startCommentNodeStep(100);
    var0.endUnaryExpr(10);
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test186");


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
    var8.startOrExpr();
    var8.startCommentNodeStep(10);
    var8.endFilterExpr();
    var8.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test187");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endProcessingInstructionNodeStep()\n\n          ^\n                                                                                                    ^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test188");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();
    var0.endFilterExpr();
    var0.endTextNodeStep();

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test189");


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
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test190");


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
    var20.startTextNodeStep(100);
    var20.startPathExpr();
    var20.startUnaryExpr();
    var20.startRelationalExpr();
    var20.startMultiplicativeExpr();
    var20.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test191");


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
    var0.startPredicate();
    var0.endAdditiveExpr(100);
    var0.startUnionExpr();
    var0.endRelativeLocationPath();
    var0.startEqualityExpr();
    var0.endAllNodeStep();
    var0.endUnionExpr(true);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test192");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    int var10 = var7.getPosition();
    int var11 = var7.getPosition();
    java.lang.String var12 = var7.getXPath();
    int var13 = var7.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test193");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.startOrExpr();
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.number((-1.0d));
    var0.startAbsoluteLocationPath();

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test194");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endUnionExpr(false)\n(8) startNameStep(-1, \"                                                                                                    ^\", \"\n ^\n ^\")\n(9) endAllNodeStep()\n(10) startEqualityExpr()\n");

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test195");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.startRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n(4) endPathExpr()\n");
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test196");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnionExpr();
    var0.startAllNodeStep((-1));
    var0.startAbsoluteLocationPath();

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test197");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.startAllNodeStep((-1));
    var0.startEqualityExpr();
    var0.endCommentNodeStep();
    var0.endFunction();
    var0.endAbsoluteLocationPath();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) startAllNodeStep(-1)\n(7) startEqualityExpr()\n(8) endCommentNodeStep()\n(9) endFunction()\n(10) endAbsoluteLocationPath()\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) startAllNodeStep(-1)\n(7) startEqualityExpr()\n(8) endCommentNodeStep()\n(9) endFunction()\n(10) endAbsoluteLocationPath()\n"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test198");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.startAndExpr();
    var0.endMultiplicativeExpr(10);
    var0.endRelationalExpr(0);
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) endFilterExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: ^:(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\")\n(5) startAbsoluteLocationPath()\n");
    var0.number(100);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test199");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("\n ^\n ^", (-1), "(0) startXPath()\n");
    java.lang.String var4 = var3.toString();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test200");


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
    var0.endAndExpr(false);
    var0.number(100);
    org.saxpath.XPathSyntaxException var27 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var28 = var27.getPositionMarker();
    java.lang.String var29 = var27.toString();
    org.saxpath.SAXPathException var30 = new org.saxpath.SAXPathException((java.lang.Throwable)var27);
    java.lang.String var31 = var27.getMultilineMessage();
    java.lang.String var32 = var27.getMultilineMessage();
    java.lang.String var33 = var27.toString();
    java.lang.String var34 = var27.getXPath();
    java.lang.Throwable[] var35 = var27.getSuppressed();
    org.saxpath.XPathSyntaxException var39 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var27.addSuppressed((java.lang.Throwable)var39);
    java.lang.String var41 = var27.toString();
    boolean var42 = var0.equals((java.lang.Object)var27);
    java.lang.String var43 = var27.toString();
    java.lang.String var44 = var27.getPositionMarker();
    java.lang.String var45 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var29.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var32.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var33.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var41.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var43.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + " ^"+ "'", var44.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var45.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test201");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startCommentNodeStep(1);
    var0.endOrExpr(false);
    var0.endAllNodeStep();
    var0.endUnionExpr(true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test202");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endFunction();
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endTextNodeStep();

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test203");


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
    var17.endFunction();
    var17.endCommentNodeStep();
    var17.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var34 = new org.saxpath.conformance.ConformanceXPathHandler();
    var34.startAbsoluteLocationPath();
    var34.endTextNodeStep();
    var34.endAdditiveExpr(1);
    java.lang.String var39 = var34.toString();
    var34.startRelativeLocationPath();
    var34.startUnaryExpr();
    var34.endXPath();
    var34.endAndExpr(true);
    var34.startAbsoluteLocationPath();
    var34.endMultiplicativeExpr(10);
    var34.startRelativeLocationPath();
    boolean var49 = var17.equals((java.lang.Object)var34);
    var34.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var39.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test204");


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
    var0.endUnionExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();
    var0.endUnionExpr(false);
    var0.literal("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test205");


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
    com.werken.saxpath.XPathReader var17 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var18 = new org.saxpath.conformance.ConformanceXPathHandler();
    var18.startAbsoluteLocationPath();
    var18.endUnaryExpr(10);
    var18.number(1);
    var18.startAllNodeStep((-1));
    var18.startOrExpr();
    var17.setXPathHandler((org.saxpath.XPathHandler)var18);
    var17.parse("org.saxpath.SAXPathException: ");
    org.saxpath.conformance.ConformanceXPathHandler var30 = new org.saxpath.conformance.ConformanceXPathHandler();
    var30.startAbsoluteLocationPath();
    var30.endUnaryExpr(10);
    var30.startMultiplicativeExpr();
    var30.startEqualityExpr();
    var17.setXPathHandler((org.saxpath.XPathHandler)var30);
    org.saxpath.XPathHandler var37 = var17.getXPathHandler();
    org.saxpath.XPathHandler var38 = var17.getXPathHandler();
    var0.setXPathHandler(var38);
    org.saxpath.conformance.ConformanceXPathHandler var40 = new org.saxpath.conformance.ConformanceXPathHandler();
    var40.endAllNodeStep();
    var40.endAllNodeStep();
    var40.startFilterExpr();
    var40.endPathExpr();
    var40.startAdditiveExpr();
    var40.startUnionExpr();
    org.saxpath.helpers.DefaultXPathHandler var47 = new org.saxpath.helpers.DefaultXPathHandler();
    var47.number(10.0d);
    var47.startCommentNodeStep(0);
    var47.endCommentNodeStep();
    var47.endPathExpr();
    boolean var54 = var40.equals((java.lang.Object)var47);
    var40.number(100.0d);
    var0.setXPathHandler((org.saxpath.XPathHandler)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test206");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.endRelationalExpr(100);
    var0.startRelationalExpr();

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test207");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getXPath();
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var11 = var10.getXPath();
    int var12 = var10.getPosition();
    int var13 = var10.getPosition();
    int var14 = var10.getPosition();
    java.lang.String var15 = var10.getMultilineMessage();
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
    var10.addSuppressed((java.lang.Throwable)var17);
    org.saxpath.XPathSyntaxException var22 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: \nhi!\n^", 0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    java.lang.String var23 = var22.toString();
    int var24 = var22.getPosition();
    org.saxpath.SAXPathException var25 = new org.saxpath.SAXPathException((java.lang.Throwable)var22);
    int var26 = var22.getPosition();
    var17.addSuppressed((java.lang.Throwable)var22);
    var3.addSuppressed((java.lang.Throwable)var17);
    org.saxpath.SAXPathException var29 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    org.saxpath.SAXPathException var31 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n");
    java.lang.Throwable[] var32 = var31.getSuppressed();
    var17.addSuppressed((java.lang.Throwable)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n"+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test208");


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
    var13.endUnionExpr(false);
    var13.startEqualityExpr();
    var13.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test209");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startPredicate();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.number(10.0d);
    var0.endMultiplicativeExpr(0);
    var0.endAndExpr(true);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test210");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endCommentNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test211");


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
    var0.startFilterExpr();
    var0.startMultiplicativeExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endEqualityExpr(0)\n(6) endAbsoluteLocationPath()\n(7) startTextNodeStep(-1)\n(8) literal(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(9) endUnionExpr(false)\n");
    var0.startAndExpr();

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test212");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startFilterExpr();
    var0.endOrExpr(true);
    var0.endCommentNodeStep();
    var0.startCommentNodeStep(0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test213");


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
    var0.endFilterExpr();
    var0.startOrExpr();
    var0.endUnaryExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test214");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test215");


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
    org.saxpath.conformance.ConformanceXPathHandler var41 = new org.saxpath.conformance.ConformanceXPathHandler();
    var41.startAbsoluteLocationPath();
    var41.endAndExpr(true);
    boolean var46 = var41.equals((java.lang.Object)'a');
    java.lang.String var47 = var41.toString();
    var41.startXPath();
    var41.endAllNodeStep();
    var41.startOrExpr();
    var41.endRelationalExpr((-1));
    var41.startRelationalExpr();
    var41.startMultiplicativeExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var41);
    var41.endCommentNodeStep();
    var41.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var47.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test216");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", 10, "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "          ^"+ "'", var6.equals("          ^"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test217");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.startOrExpr();
    var1.startUnaryExpr();
    var1.endAbsoluteLocationPath();
    var1.endAbsoluteLocationPath();
    var1.endMultiplicativeExpr(100);
    var1.endOrExpr(true);
    var1.startPredicate();

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test218");


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
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endOrExpr(true);
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test219");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test220");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.endFilterExpr();
    var0.startXPath();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:org.saxpath.SAXPathException:  ^\")\n(5) endCommentNodeStep()\n(6) endAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) startCommentNodeStep(1)\n(7) startAbsoluteLocationPath()\n");

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test221");


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
    var8.endAbsoluteLocationPath();
    var8.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test222");


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
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test223");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.endAndExpr(true);
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test224");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startCommentNodeStep(10);
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    var0.endNameStep();
    var0.endRelationalExpr(100);
    var0.startFilterExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endProcessingInstructionNodeStep()\n(5) endXPath()\n");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test225");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.endRelationalExpr(1);
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test226");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.number((-1.0d));
    var0.number(1.0d);
    var0.startRelationalExpr();
    var0.startFilterExpr();
    var0.startPathExpr();
    var0.endAllNodeStep();

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test227");


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
    var0.startAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endMultiplicativeExpr(100);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test228");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.startRelativeLocationPath();
    var0.startCommentNodeStep(100);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test229");


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
    var9.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test230");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startRelationalExpr();

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test231");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: child", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endAbsoluteLocationPath()\n");

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test232");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.endUnaryExpr(10);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test233");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "");
    var0.endMultiplicativeExpr(10);
    var0.endUnaryExpr(100);
    var0.endPathExpr();
    var0.endRelativeLocationPath();

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test234");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(false);
    var0.endAdditiveExpr(1);
    var0.endUnionExpr(true);
    var0.endNameStep();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endFilterExpr()\n(3) endEqualityExpr(10)\n(4) startAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test235");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.startUnionExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startPathExpr();
    var0.startFilterExpr();

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test236");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.number(10);
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.endXPath();

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test237");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(1);
    var0.startPathExpr();
    var0.endAllNodeStep();
    var0.startMultiplicativeExpr();

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test238");


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
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    var0.endFunction();
    var0.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test239");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.startRelativeLocationPath();
    var0.startCommentNodeStep(0);
    var0.startAdditiveExpr();
    var0.endOrExpr(false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test240");


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
    var7.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test241");


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
    var1.endAdditiveExpr((-1));
    var1.endAdditiveExpr(100);
    var1.endPathExpr();
    var1.startXPath();
    var1.startAndExpr();
    var1.endAndExpr(true);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test242");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    org.saxpath.conformance.ConformanceXPathHandler var3 = new org.saxpath.conformance.ConformanceXPathHandler();
    var3.startAbsoluteLocationPath();
    var3.endUnaryExpr(10);
    var3.endFunction();
    var3.startAllNodeStep(100);
    var3.startRelativeLocationPath();
    boolean var11 = var0.equals((java.lang.Object)var3);
    var3.startAndExpr();
    var3.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test243");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endFunction();
    var0.endUnionExpr(true);
    org.saxpath.conformance.ConformanceXPathHandler var7 = new org.saxpath.conformance.ConformanceXPathHandler();
    var7.endAllNodeStep();
    var7.endAllNodeStep();
    var7.startFilterExpr();
    var7.endAdditiveExpr(0);
    var7.endAdditiveExpr(0);
    var7.startXPath();
    var7.endPredicate();
    boolean var17 = var0.equals((java.lang.Object)var7);
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test244");


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
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var20.endPredicate();
    var20.startAdditiveExpr();
    var20.startCommentNodeStep(1);
    var20.startProcessingInstructionNodeStep(1, "hi!");
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var36 = new org.saxpath.helpers.DefaultXPathHandler();
    var36.number(10.0d);
    var36.endRelativeLocationPath();
    var36.startRelativeLocationPath();
    var36.endFilterExpr();
    var36.startRelationalExpr();
    var36.endUnionExpr(false);
    var36.startAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    org.saxpath.XPathHandler var49 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test245");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startXPath();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startCommentNodeStep(100);
    var0.endPredicate();
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    var0.endMultiplicativeExpr(0);
    var0.number(0);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test246");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endFunction();
    var0.endAdditiveExpr((-1));
    var0.endOrExpr(true);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startRelationalExpr()\n(3) endAndExpr(false)\n(4) endXPath()\n");

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test247");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.endUnaryExpr(100);
    var0.startAdditiveExpr();
    var0.startXPath();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) startProcessingInstructionNodeStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(8) endOrExpr(true)\n(9) startEqualityExpr()\n(10) endCommentNodeStep()\n(11) endRelationalExpr(0)\n");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test248");


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
    var0.startMultiplicativeExpr();
    var0.endRelativeLocationPath();
    var0.endNameStep();
    var0.startAndExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) startXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test249");


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
    var0.endNameStep();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test250");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endEqualityExpr(0);
    var0.startRelativeLocationPath();

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test251");


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
    var31.endAllNodeStep();
    var31.startPredicate();
    var31.endUnionExpr(true);
    var31.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test252");


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
    var0.startAllNodeStep(0);
    var0.number(1);
    var0.endAndExpr(false);
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endPredicate()\n(8) startAllNodeStep(0)\n(9) number(1)\n(10) endAndExpr(false)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endPredicate()\n(8) startAllNodeStep(0)\n(9) number(1)\n(10) endAndExpr(false)\n"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test253");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");
    var0.startUnaryExpr();
    var0.endAdditiveExpr((-1));
    var0.startFunction("org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endRelationalExpr(1)\n(9) endMultiplicativeExpr(0)\n(10) endFunction()\n(11) startCommentNodeStep(-1)\n(12) endNameStep()\n(13) endCommentNodeStep()\n");
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startMultiplicativeExpr()\n(6) startMultiplicativeExpr()\n(7) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\")\n(8) startUnaryExpr()\n(9) endAdditiveExpr(-1)\n(10) startFunction(\"org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endRelationalExpr(1)\n(9) endMultiplicativeExpr(0)\n(10) endFunction()\n(11) startCommentNodeStep(-1)\n(12) endNameStep()\n(13) endCommentNodeStep()\n\")\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startMultiplicativeExpr()\n(6) startMultiplicativeExpr()\n(7) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\")\n(8) startUnaryExpr()\n(9) endAdditiveExpr(-1)\n(10) startFunction(\"org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endRelationalExpr(1)\n(9) endMultiplicativeExpr(0)\n(10) endFunction()\n(11) startCommentNodeStep(-1)\n(12) endNameStep()\n(13) endCommentNodeStep()\n\")\n"));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test254");


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
    var0.number(100);
    var0.endRelativeLocationPath();
    
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

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test255");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endPredicate();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAndExpr(false);
    var0.startAbsoluteLocationPath();
    var0.startAllNodeStep(100);
    var0.variableReference("org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: \nhi!\n^", "child\norg.saxpath.SAXPathException:  ^\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test256");


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
    var0.startFunction("          ^", "hi!");
    var0.startFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endRelationalExpr((-1));
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startAndExpr();
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endRelationalExpr(-1)\n(11) endPathExpr()\n(12) startUnionExpr()\n(13) startAndExpr()\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endRelationalExpr(-1)\n(11) endPathExpr()\n(12) startUnionExpr()\n(13) startAndExpr()\n"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test257");


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
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n", "org.saxpath.SAXPathException: hi!");
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test258");


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
    var0.startCommentNodeStep(100);
    var0.startCommentNodeStep((-1));
    var0.startFilterExpr();

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test259");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endAndExpr(false);
    var0.endEqualityExpr(0);
    var0.startRelationalExpr();
    var0.endMultiplicativeExpr(10);
    var0.endNameStep();
    var0.number(0.0d);
    var0.endAdditiveExpr(0);
    var0.endMultiplicativeExpr((-1));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test260");


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
    var0.startAndExpr();
    var0.startRelativeLocationPath();

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test261");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.endXPath();
    var0.endFunction();
    var0.endAllNodeStep();
    var0.endAndExpr(true);
    org.saxpath.SAXPathParseException var17 = new org.saxpath.SAXPathParseException("");
    java.lang.String var18 = var17.toString();
    org.saxpath.SAXPathException var20 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var17.addSuppressed((java.lang.Throwable)var20);
    org.saxpath.SAXPathParseException var23 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var17.addSuppressed((java.lang.Throwable)var23);
    boolean var25 = var0.equals((java.lang.Object)var17);
    var0.startCommentNodeStep((-1));
    var0.endFunction();
    var0.endUnaryExpr(100);
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var18.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test262");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.startTextNodeStep(100);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n");
    var0.number(0);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test263");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var1.startPathExpr();
    var1.number((-1.0d));
    var1.endFilterExpr();
    var1.startFilterExpr();

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test264");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startAllNodeStep((-1));
    var0.startProcessingInstructionNodeStep(10, "hi!");
    var0.startAllNodeStep((-1));
    var0.startAndExpr();
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) endPredicate()\n(6) startAbsoluteLocationPath()\n(7) endFilterExpr()\n", "(0) startRelativeLocationPath()\n");

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test265");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endNameStep();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.endUnaryExpr(1);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test266");


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
    var0.number(100);
    var0.endFunction();
    var0.startEqualityExpr();
    var0.endFunction();

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test267");


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
    var46.endRelativeLocationPath();
    var46.endXPath();
    var46.endProcessingInstructionNodeStep();
    var46.endPredicate();
    var46.endUnionExpr(true);
    var46.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");
    org.saxpath.XPathHandler var59 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var60 = new org.saxpath.helpers.DefaultXPathHandler();
    var60.number(10.0d);
    var60.endRelativeLocationPath();
    var60.startRelativeLocationPath();
    var60.endFilterExpr();
    var60.endXPath();
    var60.startUnionExpr();
    var60.endPredicate();
    var60.startPathExpr();
    var60.startMultiplicativeExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var60);
    org.saxpath.conformance.ConformanceXPathHandler var72 = new org.saxpath.conformance.ConformanceXPathHandler();
    var72.startAbsoluteLocationPath();
    var72.endEqualityExpr((-1));
    var72.endTextNodeStep();
    var72.startAllNodeStep(0);
    var72.endOrExpr(false);
    var72.endAllNodeStep();
    var72.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    var72.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test268");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: ", 0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.toString();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var12 = var11.getPositionMarker();
    java.lang.String var13 = var11.toString();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var11);
    java.lang.String var15 = var11.getMultilineMessage();
    java.lang.String var16 = var11.getMultilineMessage();
    java.lang.String var17 = var11.toString();
    java.lang.String var18 = var11.getXPath();
    java.lang.Throwable[] var19 = var11.getSuppressed();
    org.saxpath.XPathSyntaxException var23 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var11.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var25 = var11.toString();
    org.saxpath.SAXPathException var26 = new org.saxpath.SAXPathException((java.lang.Throwable)var11);
    java.lang.String var27 = var11.toString();
    java.lang.String var28 = var11.toString();
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var30 = var11.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var27.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var28.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var30.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test269");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getXPath();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\n ^\n ^"+ "'", var9.equals("\n ^\n ^"));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test270");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.endXPath();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.startUnaryExpr();

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test271");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("");
    var0.endRelationalExpr(1);
    var0.endAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test272");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startOrExpr();
    var0.startAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startXPath()\n(7) startMultiplicativeExpr()\n(8) endCommentNodeStep()\n(9) endNameStep()\n");
    var0.startPathExpr();
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \nhi!\n^");

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test273");


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
    var13.number(1);
    var13.startAllNodeStep((-1));
    var13.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var22 = new org.saxpath.conformance.ConformanceXPathHandler();
    var22.startAbsoluteLocationPath();
    var22.endAndExpr(true);
    var22.startUnionExpr();
    boolean var27 = var13.equals((java.lang.Object)var22);
    var22.endAdditiveExpr(0);
    var22.startRelativeLocationPath();
    var22.startMultiplicativeExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var22);
    org.saxpath.helpers.DefaultXPathHandler var33 = new org.saxpath.helpers.DefaultXPathHandler();
    var33.number(10.0d);
    var33.endRelativeLocationPath();
    var33.startRelativeLocationPath();
    var33.endAllNodeStep();
    var33.endRelativeLocationPath();
    var33.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var33.startTextNodeStep((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var33);
    var0.parse("(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^");
    var0.parse("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var50 = new org.saxpath.helpers.DefaultXPathHandler();
    var50.endFunction();
    var50.startUnaryExpr();
    var50.endTextNodeStep();
    var50.startPredicate();
    var50.startAdditiveExpr();
    var50.endAllNodeStep();
    var50.endFilterExpr();
    var50.endPathExpr();
    var50.startPathExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test274");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.startOrExpr();
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(100);
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n");
    var0.startAbsoluteLocationPath();

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test275");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endXPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startAllNodeStep((-1));
    var0.startUnaryExpr();
    var0.startEqualityExpr();

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test276");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.startAndExpr();
    var0.startAllNodeStep(1);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelationalExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) startAllNodeStep(-1)\n(7) startEqualityExpr()\n(8) startUnionExpr()\n(9) literal(\"          ^\")\n(10) endPathExpr()\n(11) startTextNodeStep(100)\n(12) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) endAdditiveExpr(-1)\n(11) endAdditiveExpr(100)\n(12) endPathExpr()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n");

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test277");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.endAndExpr(false);
    var0.endUnaryExpr(1);
    var0.startAbsoluteLocationPath();
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: -1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test278");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.endOrExpr(true);
    var0.endAdditiveExpr(1);
    var0.startPathExpr();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(10, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n");
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test279");


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
    org.saxpath.conformance.ConformanceXPathHandler var18 = new org.saxpath.conformance.ConformanceXPathHandler();
    var18.startAbsoluteLocationPath();
    var18.endAndExpr(true);
    boolean var23 = var18.equals((java.lang.Object)'a');
    java.lang.String var24 = var18.toString();
    var18.startXPath();
    var18.startPathExpr();
    var18.startAdditiveExpr();
    var18.startEqualityExpr();
    var18.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var18.startAllNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    org.saxpath.XPathHandler var36 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var37 = new org.saxpath.conformance.ConformanceXPathHandler();
    var37.startAbsoluteLocationPath();
    var37.endUnaryExpr(10);
    var37.number(1);
    boolean var44 = var37.equals((java.lang.Object)10L);
    var37.startCommentNodeStep(100);
    var37.startUnionExpr();
    var37.endTextNodeStep();
    var37.endNameStep();
    var37.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.setXPathHandler((org.saxpath.XPathHandler)var37);
    var37.startFilterExpr();
    var37.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test280");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startRelationalExpr();
    var0.startAllNodeStep(1);
    var0.endPredicate();
    var0.variableReference("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n(6) endUnaryExpr(10)\n");
    var0.endCommentNodeStep();

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test281");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endMultiplicativeExpr(0);
    var0.endAdditiveExpr(10);
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.startAdditiveExpr();
    var0.startEqualityExpr();

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test282");


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
    var7.endUnionExpr(true);
    var7.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^");
    var7.endRelativeLocationPath();
    var7.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test283");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startXPath();
    var0.startPathExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test284");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startTextNodeStep(100);
    var0.startUnionExpr();
    var0.startAndExpr();
    var0.startXPath();
    var0.endUnionExpr(false);
    var0.startProcessingInstructionNodeStep(1, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n(6) endOrExpr(false)\n");
    var0.endAndExpr(true);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test285");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n(3) endOrExpr(false)\n(4) number(10)\n(5) endPathExpr()\n(6) startAdditiveExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.endEqualityExpr((-1));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test286");


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
    var1.endUnaryExpr(100);
    var1.startEqualityExpr();
    var1.endPathExpr();
    com.werken.saxpath.XPathReader var18 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var19 = new org.saxpath.conformance.ConformanceXPathHandler();
    var19.startAbsoluteLocationPath();
    var19.endTextNodeStep();
    var19.endUnionExpr(true);
    var18.setXPathHandler((org.saxpath.XPathHandler)var19);
    org.saxpath.XPathHandler var25 = var18.getXPathHandler();
    org.saxpath.XPathHandler var26 = var18.getXPathHandler();
    var18.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endTextNodeStep();
    var29.endAdditiveExpr(1);
    java.lang.String var34 = var29.toString();
    var29.startTextNodeStep(1);
    var29.endNameStep();
    var29.startOrExpr();
    var18.setXPathHandler((org.saxpath.XPathHandler)var29);
    boolean var40 = var1.equals((java.lang.Object)var18);
    var18.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startTextNodeStep(100)\n(5) endRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var34.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test287");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startPathExpr();
    var0.endOrExpr(true);
    var0.endAdditiveExpr((-1));
    var0.endAbsoluteLocationPath();

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test288");


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
    var0.startFunction("org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test289");


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
    var18.endFunction();
    var18.number(100);
    var18.endNameStep();
    var18.endXPath();
    var18.endRelationalExpr((-1));
    var18.startAbsoluteLocationPath();
    var18.endTextNodeStep();
    var18.endProcessingInstructionNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    org.saxpath.XPathHandler var30 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var31 = new org.saxpath.helpers.DefaultXPathHandler();
    var31.number(10.0d);
    var31.endRelativeLocationPath();
    var31.startRelativeLocationPath();
    var31.endFilterExpr();
    var31.endXPath();
    var31.startUnionExpr();
    var31.startTextNodeStep(10);
    var31.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    org.saxpath.XPathHandler var45 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var46 = new org.saxpath.conformance.ConformanceXPathHandler();
    var46.startAbsoluteLocationPath();
    var46.endAndExpr(true);
    var46.endPathExpr();
    var46.endTextNodeStep();
    var46.startUnaryExpr();
    var46.endAbsoluteLocationPath();
    var46.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var46.startAllNodeStep(10);
    var46.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    org.saxpath.conformance.ConformanceXPathHandler var62 = new org.saxpath.conformance.ConformanceXPathHandler();
    var62.endAllNodeStep();
    var62.endAllNodeStep();
    var62.startFilterExpr();
    var62.endAdditiveExpr(0);
    var62.endAdditiveExpr(0);
    var62.startXPath();
    java.lang.String var71 = var62.toString();
    boolean var72 = var46.equals((java.lang.Object)var71);
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var46.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n"+ "'", var71.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test290");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^", (-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^\n^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var5.equals("org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^\n^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^\n^"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^\n^"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test291");


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
    var0.startAdditiveExpr();

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test292");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.endAdditiveExpr(0);
    var0.endUnionExpr(false);
    var0.endNameStep();

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test293");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startPredicate();
    var0.endRelationalExpr(100);
    var0.startCommentNodeStep((-1));
    var0.endFilterExpr();

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test294");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var11 = var3.toString();
    int var12 = var3.getPosition();
    java.lang.String var13 = var3.getMultilineMessage();
    java.lang.String var14 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var18 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var19 = var18.getXPath();
    int var20 = var18.getPosition();
    int var21 = var18.getPosition();
    java.lang.String var22 = var18.toString();
    java.lang.String var23 = var18.getXPath();
    java.lang.Throwable[] var24 = var18.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var18);
    java.lang.String var26 = var3.getXPath();
    org.saxpath.XPathSyntaxException var30 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.String var31 = var30.toString();
    java.lang.Throwable[] var32 = var30.getSuppressed();
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.getPositionMarker();
    org.saxpath.SAXPathException var36 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var30.addSuppressed((java.lang.Throwable)var36);
    java.lang.Throwable[] var38 = var36.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var36);
    org.saxpath.SAXPathException var40 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var41 = var40.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var13.equals("org.saxpath.SAXPathParseException: \nhi!\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "^"+ "'", var14.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var31.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var33.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + " ^"+ "'", var34.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: "+ "'", var41.equals("org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: "));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test295");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endEqualityExpr(0);
    var0.endFilterExpr();
    var0.endAndExpr(true);
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endUnaryExpr(10);
    var14.number(1);
    var14.startAllNodeStep((-1));
    var14.startAllNodeStep(0);
    var14.endNameStep();
    java.lang.String var25 = var14.toString();
    var14.endAndExpr(true);
    var14.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var14.startRelationalExpr();
    var14.endUnionExpr(true);
    var14.endRelativeLocationPath();
    boolean var36 = var0.equals((java.lang.Object)var14);
    var14.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test296");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endAdditiveExpr(100);
    var0.startPredicate();
    var0.endAdditiveExpr(10);
    var0.startPredicate();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test297");


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
    var14.endCommentNodeStep();
    var14.startUnaryExpr();
    var14.endEqualityExpr(1);
    var14.startAndExpr();
    var14.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test298");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.number(0.0d);
    var0.endUnionExpr(true);
    var0.number(10.0d);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endRelativeLocationPath();

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test299");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(1);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.startOrExpr();

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test300");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.startEqualityExpr();
    var0.endFunction();
    var0.endOrExpr(true);
    var0.endAndExpr(false);
    var0.startRelativeLocationPath();
    var0.endAndExpr(true);
    var0.endAndExpr(true);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test301");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startFilterExpr()\n(5) endOrExpr(true)\n(6) endRelationalExpr(10)\n(7) endAllNodeStep()\n(8) startXPath()\n(9) startProcessingInstructionNodeStep(1, \" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(10) endUnionExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) endUnionExpr(true)\n");
    int var4 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test302");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startCommentNodeStep((-1));
    var0.endCommentNodeStep();
    var0.startCommentNodeStep(0);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test303");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) endEqualityExpr(-1)\n(5) endCommentNodeStep()\n(6) endMultiplicativeExpr(1)\n(7) startPathExpr()\n(8) startXPath()\n(9) startRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test304");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.number(1.0d);
    var0.startUnaryExpr();
    var0.startTextNodeStep(100);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test305");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startXPath();
    var0.startRelationalExpr();
    var0.endXPath();

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test306");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("hi!", " ^");
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test307");


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
    var0.startPredicate();
    var0.endAndExpr(false);
    var0.endEqualityExpr(0);
    var0.startAbsoluteLocationPath();

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test308");


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
    var0.endEqualityExpr((-1));
    var0.endRelativeLocationPath();
    java.lang.String var21 = var0.toString();
    var0.startXPath();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test309");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endRelationalExpr((-1));
    var0.number(100);
    var0.endOrExpr(true);
    var0.endUnaryExpr(1);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test310");


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
    var8.endNameStep();
    var8.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathException: ");
    var8.endAndExpr(false);
    var8.endTextNodeStep();
    var8.startRelativeLocationPath();
    var8.startAbsoluteLocationPath();
    var8.endProcessingInstructionNodeStep();
    var8.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \n          ^", "(0) startXPath()\n");
    var8.startMultiplicativeExpr();
    var8.startTextNodeStep(100);
    var8.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test311");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(100);
    var0.endUnionExpr(true);
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var0.startAbsoluteLocationPath();

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test312");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test313");


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
    var9.endXPath();
    var9.startCommentNodeStep((-1));
    var9.endTextNodeStep();
    var9.startUnionExpr();
    var9.startRelativeLocationPath();
    var9.endAllNodeStep();
    var9.endAllNodeStep();
    var9.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test314");


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
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    var0.startFilterExpr();
    var0.startFunction("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \ncom.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test315");


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
    var7.startAllNodeStep(10);
    var7.startEqualityExpr();
    var7.startAbsoluteLocationPath();
    var7.number(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test316");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endXPath();
    var0.number(10);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test317");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startXPath();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: -1: child", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startFunction("namespace", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var0.startMultiplicativeExpr();
    var0.endRelationalExpr(10);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test318");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAndExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var0.number(10);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test319");


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
    var0.endEqualityExpr((-1));
    
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

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test320");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.endRelationalExpr(10);
    var0.startRelativeLocationPath();

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test321");


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
    var7.startAndExpr();
    var7.startMultiplicativeExpr();
    var7.startTextNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test322");


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
    var0.startFunction("\n ^\n ^", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");
    var0.endCommentNodeStep();
    var0.endAndExpr(false);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test323");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.startRelativeLocationPath();
    var0.endPredicate();
    var0.startAndExpr();
    var0.startTextNodeStep(10);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test324");


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
    var0.endProcessingInstructionNodeStep();
    var0.startOrExpr();
    var0.startXPath();
    var0.startTextNodeStep((-1));
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endFunction();
    var0.endTextNodeStep();
    var0.endAndExpr(true);
    var0.startOrExpr();
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test325");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    java.lang.String var11 = var3.getMultilineMessage();
    java.lang.String var12 = var3.toString();
    java.lang.Throwable[] var13 = var3.getSuppressed();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.getPositionMarker();
    
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
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + " ^"+ "'", var15.equals(" ^"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test326");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAdditiveExpr(-1)\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", 10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n");
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test327");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.startEqualityExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAdditiveExpr(-1)\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n");
    var0.startMultiplicativeExpr();

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test328");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n", 10, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "          ^"+ "'", var5.equals("          ^"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test329");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endFunction();
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endPredicate();

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test330");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test331");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.number(1.0d);
    var0.startXPath();
    var0.endAndExpr(true);
    var0.startCommentNodeStep(1);
    var0.endAdditiveExpr(10);
    var0.endUnionExpr(true);
    var0.endProcessingInstructionNodeStep();
    var0.startAdditiveExpr();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test332");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", 100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test333");


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
    var0.number(10);
    var0.endAllNodeStep();
    var0.endEqualityExpr(100);
    var0.startCommentNodeStep(10);
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test334");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n");
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAndExpr(false);
    var0.startAbsoluteLocationPath();

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test335");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.endNameStep();
    var0.endRelationalExpr((-1));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startPathExpr()\n(6) startPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) startUnionExpr()\n(8) startPathExpr()\n(9) endProcessingInstructionNodeStep()\n(10) endAllNodeStep()\n");
    var0.endXPath();
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test336");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(10);
    var0.endPredicate();
    var0.startFilterExpr();

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test337");


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
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n");
    var0.endAndExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) endRelativeLocationPath()\n(7) endFunction()\n(8) endTextNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) endNameStep()\n");

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test338");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endPathExpr();
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endPathExpr();
    var19.endPredicate();
    boolean var24 = var0.equals((java.lang.Object)var19);
    var0.endPathExpr();
    var0.startEqualityExpr();
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.startAbsoluteLocationPath();
    var27.endUnaryExpr(10);
    var27.number(1);
    var27.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var27.startMultiplicativeExpr();
    var27.startRelativeLocationPath();
    var27.endRelativeLocationPath();
    var27.endNameStep();
    var27.startFilterExpr();
    boolean var41 = var0.equals((java.lang.Object)var27);
    var27.startRelativeLocationPath();
    var27.endCommentNodeStep();
    var27.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test339");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr((-1));
    var0.startAndExpr();
    var0.literal("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n");
    var0.endUnaryExpr(10);
    var0.startPathExpr();

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test340");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.endUnaryExpr(0);
    var0.endFilterExpr();
    var0.startPredicate();
    var0.startOrExpr();
    var0.startTextNodeStep(1);
    var0.startPredicate();

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test341");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr((-1));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test342");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: child", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    int var9 = var7.getPosition();
    int var10 = var7.getPosition();
    int var11 = var7.getPosition();
    java.lang.String var12 = var7.getMultilineMessage();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
    var7.addSuppressed((java.lang.Throwable)var14);
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var17 = var3.getSuppressed();
    java.lang.String var18 = var3.getXPath();
    java.lang.String var19 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "          ^"+ "'", var19.equals("          ^"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test343");


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
    var1.endAndExpr(false);
    var1.startAndExpr();
    var1.startAdditiveExpr();
    var1.endXPath();
    var1.endAllNodeStep();

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test344");


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
    org.saxpath.conformance.ConformanceXPathHandler var18 = new org.saxpath.conformance.ConformanceXPathHandler();
    var18.startAbsoluteLocationPath();
    var18.endAndExpr(true);
    boolean var23 = var18.equals((java.lang.Object)'a');
    java.lang.String var24 = var18.toString();
    var18.startXPath();
    var18.startPathExpr();
    var18.startAdditiveExpr();
    var18.startEqualityExpr();
    var18.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var18.startAllNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    org.saxpath.XPathHandler var36 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endTextNodeStep()\n(7) endOrExpr(true)\n");
    org.saxpath.conformance.ConformanceXPathHandler var41 = new org.saxpath.conformance.ConformanceXPathHandler();
    var41.startAbsoluteLocationPath();
    var41.endPathExpr();
    var41.startUnionExpr();
    var41.startEqualityExpr();
    var41.startFilterExpr();
    var41.startUnionExpr();
    var41.startAllNodeStep(1);
    var41.startAbsoluteLocationPath();
    var41.endEqualityExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var41);
    var41.number((-1));
    var41.number(100.0d);
    var41.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test345");


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
    var1.endPredicate();
    var1.startMultiplicativeExpr();
    java.lang.String var16 = var1.toString();
    var1.startMultiplicativeExpr();
    var1.endAdditiveExpr(0);
    var1.number(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(1)\n(6) startEqualityExpr()\n(7) endPredicate()\n(8) startMultiplicativeExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(1)\n(6) startEqualityExpr()\n(7) endPredicate()\n(8) startMultiplicativeExpr()\n"));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test346");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var1.endRelativeLocationPath();
    var1.endNameStep();

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test347");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endFilterExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) number(1.0)\n(7) startUnaryExpr()\n(8) startAndExpr()\n(9) number(0.0)\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^");

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test348");


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
    var0.startEqualityExpr();
    var0.number((-1));
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startPathExpr();
    var0.endEqualityExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test349");


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
    var0.endTextNodeStep();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test350");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1.0d));
    var0.number(100.0d);
    var0.startFilterExpr();
    var0.startCommentNodeStep(1);
    var0.startXPath();
    var0.endUnionExpr(true);
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test351");


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
    java.lang.String var18 = var3.getMultilineMessage();
    java.lang.String var19 = var3.getXPath();
    java.lang.String var20 = var3.getPositionMarker();
    java.lang.String var21 = var3.getMultilineMessage();
    int var22 = var3.getPosition();
    java.lang.String var23 = var3.getPositionMarker();
    
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
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + " ^"+ "'", var20.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + " ^"+ "'", var23.equals(" ^"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test352");


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
    var7.variableReference("\n ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var7.endMultiplicativeExpr(10);
    var7.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test353");


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
    var0.startRelationalExpr();
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.endPathExpr();

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test354");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.startXPath();
    var0.startUnaryExpr();
    var0.number(0.0d);
    var0.endFilterExpr();

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test355");


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
    var9.startAllNodeStep(1);
    var9.startTextNodeStep(100);
    var9.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test356");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.number(0);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n");
    var0.startAndExpr();

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test357");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.endTextNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n(7) startPredicate()\n");
    var0.endUnionExpr(false);
    var0.startUnaryExpr();

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test358");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endXPath();

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test359");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.endAdditiveExpr(100);
    var0.endOrExpr(false);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.endPredicate();
    var0.endOrExpr(true);
    var0.startPredicate();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test360");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    java.lang.String var11 = var3.getMultilineMessage();
    java.lang.String var12 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var14 = var3.getSuppressed();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.SAXPathException var16 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
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
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test361");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    int var10 = var3.getPosition();
    java.lang.Throwable[] var11 = var3.getSuppressed();
    int var12 = var3.getPosition();
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.getPositionMarker();
    java.lang.String var18 = var16.toString();
    org.saxpath.SAXPathException var19 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    java.lang.String var20 = var16.getMultilineMessage();
    org.saxpath.SAXPathException var22 = new org.saxpath.SAXPathException("");
    var16.addSuppressed((java.lang.Throwable)var22);
    org.saxpath.SAXPathException var24 = new org.saxpath.SAXPathException((java.lang.Throwable)var22);
    var3.addSuppressed((java.lang.Throwable)var24);
    java.lang.String var26 = var3.getPositionMarker();
    
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
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + " ^"+ "'", var17.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + " ^"+ "'", var26.equals(" ^"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test362");


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
    var23.startPredicate();
    var23.startFilterExpr();
    var23.startCommentNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test363");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endFunction();
    var0.endAbsoluteLocationPath();
    var0.startPathExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startRelativeLocationPath()\n(8) startFilterExpr()\n");

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test364");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.startAbsoluteLocationPath();
    var0.number((-1));
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endOrExpr(true);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test365");


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
    var0.endOrExpr(false);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.endOrExpr(true);
    var0.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test366");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) endCommentNodeStep()\n");
    var0.startAndExpr();
    var0.startFilterExpr();
    var0.startPredicate();
    var0.startPredicate();

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test367");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.startAllNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr((-1));
    var0.endRelationalExpr(10);
    var0.startMultiplicativeExpr();
    var0.endRelationalExpr(10);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test368");


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
    var31.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test369");


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
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\n^");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n");

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test370");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();
    var0.number((-1.0d));
    var0.startNameStep(0, "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endAndExpr(true)\n(9) endPredicate()\n");

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test371");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startTextNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.startOrExpr();
    var0.endFunction();
    var0.endFunction();
    var0.startCommentNodeStep(10);
    var0.startUnionExpr();
    var0.endAndExpr(true);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test372");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endEqualityExpr(1);
    var0.startOrExpr();
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.endOrExpr(false);
    var0.endFilterExpr();

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test373");


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
    var8.endNameStep();
    var8.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathException: ");
    var8.startPathExpr();
    var8.startXPath();
    var8.endMultiplicativeExpr(0);
    var8.startPathExpr();
    var8.endRelationalExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test374");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endFilterExpr();
    var0.number(0);
    var0.endRelationalExpr(0);
    var0.startTextNodeStep(10);
    var0.endRelativeLocationPath();

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test375");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.startAbsoluteLocationPath();
    var0.number((-1));
    var0.endAdditiveExpr(10);
    var0.endProcessingInstructionNodeStep();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.endProcessingInstructionNodeStep();

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test376");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.getXPath();
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.getPositionMarker();
    var10.addSuppressed((java.lang.Throwable)var14);
    java.lang.String var18 = var10.toString();
    int var19 = var10.getPosition();
    java.lang.String var20 = var10.getMultilineMessage();
    java.lang.String var21 = var10.getPositionMarker();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException("");
    org.saxpath.SAXPathParseException var25 = new org.saxpath.SAXPathParseException("");
    java.lang.String var26 = var25.toString();
    var23.addSuppressed((java.lang.Throwable)var25);
    java.lang.Throwable[] var28 = var23.getSuppressed();
    var10.addSuppressed((java.lang.Throwable)var23);
    java.lang.Throwable[] var30 = var10.getSuppressed();
    java.lang.String var31 = var10.toString();
    org.saxpath.XPathSyntaxException var35 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var36 = var35.getXPath();
    java.lang.String var37 = var35.getXPath();
    org.saxpath.SAXPathException var38 = new org.saxpath.SAXPathException((java.lang.Throwable)var35);
    java.lang.String var39 = var35.toString();
    int var40 = var35.getPosition();
    org.saxpath.XPathSyntaxException var44 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var45 = var44.getXPath();
    java.lang.String var46 = var44.getXPath();
    java.lang.String var47 = var44.toString();
    var35.addSuppressed((java.lang.Throwable)var44);
    java.lang.String var49 = var44.getXPath();
    var10.addSuppressed((java.lang.Throwable)var44);
    var3.addSuppressed((java.lang.Throwable)var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var20.equals("org.saxpath.SAXPathParseException: \nhi!\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "^"+ "'", var21.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var26.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var31.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var36.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var37.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var39.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var45.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var46.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var47.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var49.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test377");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.endAndExpr(false);
    var0.endPathExpr();
    var0.startRelationalExpr();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test378");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.startPathExpr();
    var0.startPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startNameStep(0, \" ^\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startEqualityExpr()\n(8) startPredicate()\n(9) startNameStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endAdditiveExpr(10)\n(11) endRelationalExpr(0)\n(12) endUnionExpr(false)\n(13) startEqualityExpr()\n(14) endTextNodeStep()\n(15) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n\n^");

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test379");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.startFilterExpr();
    org.saxpath.helpers.DefaultXPathHandler var16 = new org.saxpath.helpers.DefaultXPathHandler();
    var16.number(10.0d);
    var16.endPathExpr();
    var16.endUnionExpr(false);
    var16.endEqualityExpr(1);
    var16.endFilterExpr();
    var16.startUnaryExpr();
    var16.startRelativeLocationPath();
    var16.startAllNodeStep(100);
    var16.endOrExpr(false);
    boolean var31 = var0.equals((java.lang.Object)false);
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test380");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endAndExpr(false);
    var0.endXPath();
    var0.startRelationalExpr();

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test381");


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
    var8.endCommentNodeStep();
    var8.endRelationalExpr(0);
    var8.startXPath();
    var8.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test382");


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
    var0.number((-1));
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n(8) number(-1)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n(8) number(-1)\n"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test383");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", 0, "          ^");
    java.lang.String var4 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test384");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    java.lang.String var11 = var3.getMultilineMessage();
    java.lang.String var12 = var3.getMultilineMessage();
    int var13 = var3.getPosition();
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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test385");


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
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test386");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endOrExpr(false);
    var0.endMultiplicativeExpr(10);
    var0.endProcessingInstructionNodeStep();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.endAllNodeStep();

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test387");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.endOrExpr(false);
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep(0);
    var0.endAdditiveExpr(10);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test388");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endEqualityExpr(1);
    var0.endOrExpr(true);
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.endFunction();

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test389");


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
    var0.endAdditiveExpr(10);
    var0.startAllNodeStep(100);
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test390");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("\n ^\n ^", "org.saxpath.SAXPathException:  ^");
    var0.endUnionExpr(true);
    var0.startPredicate();
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startPredicate();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startRelativeLocationPath()\n(8) startXPath()\n(9) startXPath()\n(10) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startAndExpr()\n(6) startOrExpr()\n(7) startAllNodeStep(10)\n(8) startFilterExpr()\n");

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test391");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) startTextNodeStep(10)\n");

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test392");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.startUnaryExpr();
    var0.number(100.0d);
    var0.endXPath();
    var0.endNameStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startEqualityExpr()\n(6) startTextNodeStep(0)\n(7) endFilterExpr()\n(8) endAbsoluteLocationPath()\n(9) startAdditiveExpr()\n");

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test393");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endAdditiveExpr(1);
    var0.endNameStep();
    var0.startAdditiveExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.endXPath();

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test394");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.endUnionExpr(false);
    var0.endRelationalExpr(10);
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startXPath()\n(6) startPredicate()\n(7) endAndExpr(true)\n(8) endRelativeLocationPath()\n(9) startProcessingInstructionNodeStep(10, \"com.werken.saxpath.XPathSyntaxException: 0: hi!\")\n(10) endMultiplicativeExpr(-1)\n(11) endTextNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test395");


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
    var0.startUnionExpr();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test396");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    int var5 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test397");


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
    var0.endFunction();

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test398");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test399");


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
    org.saxpath.helpers.DefaultXPathHandler var22 = new org.saxpath.helpers.DefaultXPathHandler();
    var22.number(10.0d);
    var22.endPathExpr();
    var22.endUnionExpr(false);
    var22.startPathExpr();
    var22.endAdditiveExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test400");


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
    var7.startAbsoluteLocationPath();
    var7.startFilterExpr();
    var7.startXPath();
    var7.startAbsoluteLocationPath();
    var7.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test401");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endPredicate();
    var0.startUnionExpr();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) endPredicate()\n(6) startAbsoluteLocationPath()\n(7) endFilterExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n");

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test402");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startAllNodeStep((-1));
    var0.endPathExpr();
    var0.endRelationalExpr(1);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test403");


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
    var1.endFunction();
    var1.variableReference("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) endFilterExpr()\n(7) startUnaryExpr()\n(8) number(1)\n");

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test404");


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
    var0.startRelationalExpr();
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep((-1));
    var0.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test405");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.startPathExpr();

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test406");


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
    var20.endRelativeLocationPath();
    var20.number(10);
    var20.endRelativeLocationPath();
    var20.startAndExpr();
    var20.startOrExpr();
    var20.endMultiplicativeExpr(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    org.saxpath.XPathHandler var32 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");
    org.saxpath.helpers.DefaultXPathHandler var35 = new org.saxpath.helpers.DefaultXPathHandler();
    var35.endFunction();
    var35.startUnaryExpr();
    var35.endTextNodeStep();
    var35.startPredicate();
    var35.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var35.startRelationalExpr();
    var35.endRelationalExpr(10);
    var35.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var35.startTextNodeStep((-1));
    var35.number(100.0d);
    var0.setXPathHandler((org.saxpath.XPathHandler)var35);
    org.saxpath.XPathHandler var54 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test407");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startPathExpr();
    var0.startCommentNodeStep(0);
    var0.endNameStep();
    var0.startTextNodeStep(100);
    var0.number(100.0d);
    var0.endFunction();

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test408");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startAllNodeStep(10);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endFilterExpr();
    var0.endFilterExpr();

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test409");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endXPath();
    var0.startAndExpr();
    var0.literal("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.startUnaryExpr();
    var0.startEqualityExpr();

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test410");


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
    var0.endUnionExpr(false);
    var0.startCommentNodeStep((-1));
    var0.endPathExpr();

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test411");


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
    var0.endAdditiveExpr((-1));
    var0.startPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:org.saxpath.SAXPathException:  ^\")\n(5) number(10)\n(6) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(-1)\n(4) endAdditiveExpr(-1)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n:com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(6) startEqualityExpr()\n");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) number(10)\n(11) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) startProcessingInstructionNodeStep(100, \"namespace\")\n(9) endXPath()\n(10) endRelationalExpr(100)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test412");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n(5) startCommentNodeStep(10)\n(6) endAdditiveExpr(0)\n");

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test413");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test414");


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
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endProcessingInstructionNodeStep();

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test415");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.String var5 = var3.getPositionMarker();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("");
    java.lang.String var8 = var7.toString();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var7.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var12 = var7.toString();
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    var3.addSuppressed((java.lang.Throwable)var7);
    int var15 = var3.getPosition();
    java.lang.Throwable[] var16 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var20 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var21 = var20.getPositionMarker();
    java.lang.String var22 = var20.toString();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException((java.lang.Throwable)var20);
    java.lang.String var24 = var20.getMultilineMessage();
    java.lang.String var25 = var20.getMultilineMessage();
    java.lang.String var26 = var20.toString();
    java.lang.String var27 = var20.getPositionMarker();
    java.lang.String var28 = var20.getPositionMarker();
    org.saxpath.XPathSyntaxException var32 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var33 = var32.getXPath();
    java.lang.String var34 = var32.getPositionMarker();
    int var35 = var32.getPosition();
    java.lang.Throwable[] var36 = var32.getSuppressed();
    int var37 = var32.getPosition();
    var20.addSuppressed((java.lang.Throwable)var32);
    java.lang.String var39 = var20.toString();
    int var40 = var20.getPosition();
    java.lang.String var41 = var20.getPositionMarker();
    org.saxpath.XPathSyntaxException var45 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var46 = var45.getMultilineMessage();
    int var47 = var45.getPosition();
    org.saxpath.SAXPathParseException var49 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var45.addSuppressed((java.lang.Throwable)var49);
    java.lang.String var51 = var45.toString();
    java.lang.String var52 = var45.toString();
    var20.addSuppressed((java.lang.Throwable)var45);
    java.lang.String var54 = var45.toString();
    var3.addSuppressed((java.lang.Throwable)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var8.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var12.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + " ^"+ "'", var21.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + " ^"+ "'", var27.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + " ^"+ "'", var34.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var39.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + " ^"+ "'", var41.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "\n ^\n ^"+ "'", var46.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var51.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var52.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var54.equals("com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test416");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test417");


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
    var0.endEqualityExpr((-1));
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endEqualityExpr((-1));
    var20.endTextNodeStep();
    var20.endCommentNodeStep();
    var20.endRelativeLocationPath();
    boolean var28 = var20.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var20.endMultiplicativeExpr((-1));
    var20.endNameStep();
    var20.endCommentNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var33 = new org.saxpath.conformance.ConformanceXPathHandler();
    var33.startAbsoluteLocationPath();
    var33.endAndExpr(true);
    var33.endPathExpr();
    var33.endTextNodeStep();
    var33.startUnaryExpr();
    var33.endUnionExpr(true);
    var33.startProcessingInstructionNodeStep(100, "hi!");
    boolean var45 = var20.equals((java.lang.Object)var33);
    var33.endPredicate();
    var33.endUnaryExpr(1);
    boolean var49 = var0.equals((java.lang.Object)var33);
    var0.number(0.0d);
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n ^");
    var0.endAllNodeStep();
    var0.endRelationalExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test418");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getXPath();
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    int var9 = var3.getPosition();
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test419");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n", 100, "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n\n                                                                                                    ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "                                                                                                    ^"+ "'", var6.equals("                                                                                                    ^"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test420");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();
    var0.endRelativeLocationPath();
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endAndExpr(true);
    boolean var18 = var13.equals((java.lang.Object)'a');
    java.lang.String var19 = var13.toString();
    var13.startXPath();
    var13.endAllNodeStep();
    var13.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var13.number(100.0d);
    var13.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var28 = new org.saxpath.conformance.ConformanceXPathHandler();
    var28.startAbsoluteLocationPath();
    var28.endAndExpr(true);
    boolean var33 = var28.equals((java.lang.Object)'a');
    var28.startAbsoluteLocationPath();
    var28.startRelativeLocationPath();
    var28.endRelationalExpr(10);
    var28.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var28.startCommentNodeStep((-1));
    boolean var43 = var13.equals((java.lang.Object)(-1));
    var13.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var13.endOrExpr(true);
    var13.startEqualityExpr();
    org.saxpath.conformance.ConformanceXPathHandler var50 = new org.saxpath.conformance.ConformanceXPathHandler();
    var50.startAbsoluteLocationPath();
    var50.endAndExpr(true);
    boolean var55 = var50.equals((java.lang.Object)'a');
    java.lang.String var56 = var50.toString();
    var50.startPathExpr();
    var50.startAndExpr();
    var50.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var50.startXPath();
    boolean var63 = var13.equals((java.lang.Object)var50);
    var13.endCommentNodeStep();
    var13.endRelationalExpr(0);
    var13.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    var13.endProcessingInstructionNodeStep();
    boolean var71 = var0.equals((java.lang.Object)var13);
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var56.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test421");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.endUnionExpr(true);
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.endAndExpr(false);
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();
    var0.endAdditiveExpr(0);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test422");


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
    var0.endAdditiveExpr((-1));
    var0.startOrExpr();
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test423");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);
    var0.startAndExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) startTextNodeStep(100)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endCommentNodeStep();
    var0.startEqualityExpr();

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test424");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startAllNodeStep(0);
    var0.endAbsoluteLocationPath();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    var0.endAbsoluteLocationPath();

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test425");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.endRelativeLocationPath();
    var0.number(100);
    var0.endTextNodeStep();

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test426");


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
    var0.endPredicate();
    var0.number(0.0d);
    var0.startAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test427");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endNameStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(1);
    var0.startNameStep(10, "child", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n");
    var0.endAbsoluteLocationPath();

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test428");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.startFunction("org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.number((-1.0d));
    var0.endXPath();

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test429");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(false);
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.endAdditiveExpr(100);
    var0.endUnionExpr(true);
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test430");


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
    var1.number(1);
    var1.startRelativeLocationPath();

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test431");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.startTextNodeStep(0);
    var0.endPathExpr();
    var0.number(1);
    var0.endTextNodeStep();

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test432");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.endUnionExpr(true);
    var0.endPredicate();
    var0.startOrExpr();
    var0.endAndExpr(false);
    var0.startPathExpr();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test433");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.endAdditiveExpr((-1));
    var0.endUnaryExpr(0);
    var0.endOrExpr(false);
    var0.startTextNodeStep(1);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test434");


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
    var14.startTextNodeStep(0);
    var14.startCommentNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test435");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n");
    var0.startFilterExpr();
    var0.endPredicate();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test436");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.endAdditiveExpr(100);
    var0.endOrExpr(false);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endNameStep();
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test437");


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
    var0.endTextNodeStep();

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test438");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.number((-1));
    var0.endRelationalExpr(1);
    var0.startCommentNodeStep(0);
    var0.startAbsoluteLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var22 = new org.saxpath.helpers.DefaultXPathHandler();
    var22.number(10.0d);
    var22.endNameStep();
    var22.number(0);
    var22.endFunction();
    var22.endRelationalExpr(0);
    var22.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var22.startXPath();
    var22.endAllNodeStep();
    boolean var35 = var0.equals((java.lang.Object)var22);
    var22.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test439");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startNameStep(0, " ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.number(10);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test440");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endUnionExpr(true);
    var0.startFilterExpr();

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test441");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.startMultiplicativeExpr();
    var0.number(1);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test442");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startAllNodeStep(10);
    var0.endPredicate();
    var0.endPathExpr();
    var0.endNameStep();

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test443");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.endXPath();
    var0.startRelativeLocationPath();
    var0.number(100);
    var0.startFilterExpr();
    var0.number(100.0d);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n");
    var0.endCommentNodeStep();
    var0.endTextNodeStep();

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test444");


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
    var0.startRelationalExpr();
    var0.literal("\n ^\n ^");
    var0.startTextNodeStep(0);
    var0.startXPath();
    var0.endFunction();
    var0.startUnionExpr();

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test445");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.startXPath();
    var0.endAdditiveExpr((-1));
    var0.endTextNodeStep();

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test446");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.startCommentNodeStep((-1));
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n(4) endPathExpr()\n");
    var0.number(100.0d);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test447");


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
    var0.startXPath();
    org.saxpath.SAXPathParseException var23 = new org.saxpath.SAXPathParseException("");
    java.lang.String var24 = var23.toString();
    org.saxpath.SAXPathException var26 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var23.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var28 = var23.toString();
    org.saxpath.XPathSyntaxException var32 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var33 = var32.getXPath();
    int var34 = var32.getPosition();
    int var35 = var32.getPosition();
    int var36 = var32.getPosition();
    int var37 = var32.getPosition();
    var23.addSuppressed((java.lang.Throwable)var32);
    org.saxpath.SAXPathException var39 = new org.saxpath.SAXPathException((java.lang.Throwable)var23);
    boolean var40 = var0.equals((java.lang.Object)var23);
    var0.endMultiplicativeExpr((-1));
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var24.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var28.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test448");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(10);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test449");


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
    var0.startUnaryExpr();
    var0.endFunction();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) endAdditiveExpr(10)\n(8) endRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test450");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.endTextNodeStep();
    var0.startCommentNodeStep(100);
    var0.startAndExpr();
    var0.endNameStep();

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test451");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.endUnionExpr(false);
    var0.endRelativeLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endAbsoluteLocationPath();
    var0.startCommentNodeStep(0);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test452");


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
    var1.endFunction();
    var1.endFilterExpr();
    var1.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) number(-1)\n(7) endFunction()\n");
    var1.endAllNodeStep();
    var1.startAbsoluteLocationPath();

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test453");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.endRelationalExpr(1);
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr((-1));
    var0.endUnaryExpr((-1));
    var0.endFunction();

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test454");


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
    org.saxpath.conformance.ConformanceXPathHandler var15 = new org.saxpath.conformance.ConformanceXPathHandler();
    var15.startAbsoluteLocationPath();
    var15.endEqualityExpr((-1));
    var15.endTextNodeStep();
    var15.endAdditiveExpr(1);
    var15.startAndExpr();
    var15.endUnaryExpr(1);
    var15.number((-1.0d));
    var15.endRelationalExpr(0);
    var15.endCommentNodeStep();
    var15.number(1);
    boolean var32 = var0.equals((java.lang.Object)var15);
    var15.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");
    var15.variableReference("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n(4) variableReference(\"hi!:(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n");
    var15.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endUnionExpr(true)\n(5) endAdditiveExpr(10)\n(6) endProcessingInstructionNodeStep()\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startFunction(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(4) endPathExpr()\n(5) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: :com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endFunction()\n(7) endEqualityExpr(1)\n(8) endFunction()\n(9) startTextNodeStep(1)\n(10) endRelativeLocationPath()\n(11) endUnionExpr(false)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test455");


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
    var0.startPredicate();
    var0.endAdditiveExpr(100);
    var0.startUnionExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) number(-1)\n(7) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.startPathExpr();
    var0.startAndExpr();

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test456");


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
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n", "com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr(1);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test457");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.endOrExpr(false);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test458");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endUnaryExpr(10);
    var0.startAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.endAndExpr(false);
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();
    var0.startMultiplicativeExpr();

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test459");


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
    var0.endEqualityExpr((-1));
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endEqualityExpr((-1));
    var20.endTextNodeStep();
    var20.endCommentNodeStep();
    var20.endRelativeLocationPath();
    boolean var28 = var20.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var20.endMultiplicativeExpr((-1));
    var20.endNameStep();
    var20.endCommentNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var33 = new org.saxpath.conformance.ConformanceXPathHandler();
    var33.startAbsoluteLocationPath();
    var33.endAndExpr(true);
    var33.endPathExpr();
    var33.endTextNodeStep();
    var33.startUnaryExpr();
    var33.endUnionExpr(true);
    var33.startProcessingInstructionNodeStep(100, "hi!");
    boolean var45 = var20.equals((java.lang.Object)var33);
    var33.endPredicate();
    var33.endUnaryExpr(1);
    boolean var49 = var0.equals((java.lang.Object)var33);
    var33.endRelativeLocationPath();
    var33.startAdditiveExpr();
    var33.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test460");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr((-1));
    var0.startFilterExpr();
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.endPathExpr();
    var0.endTextNodeStep();

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test461");


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
    var0.endFilterExpr();
    var0.startAllNodeStep(1);
    var0.startRelativeLocationPath();

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test462");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "\n ^\n ^");
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(100);
    var0.endMultiplicativeExpr(10);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test463");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startAdditiveExpr();
    var0.endRelativeLocationPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) endUnionExpr(false)\n(5) endRelativeLocationPath()\n(6) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\")\n(7) startOrExpr()\n\norg.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n\n ^");

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test464");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var1.startRelationalExpr();
    var1.endXPath();
    var1.endPredicate();
    var1.endProcessingInstructionNodeStep();

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test465");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100:  ^", "");
    var0.startTextNodeStep(1);
    var0.literal("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n");
    var0.startRelationalExpr();

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test466");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.endMultiplicativeExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test467");


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
    var0.endAllNodeStep();
    var0.startAdditiveExpr();
    var0.startOrExpr();

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test468");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test469");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n(5) endPredicate()\n(6) number(100.0)\n(7) startUnaryExpr()\n(8) endCommentNodeStep()\n");

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test470");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.endOrExpr(false);
    var0.startEqualityExpr();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAbsoluteLocationPath()\n");
    var0.startUnaryExpr();
    var0.endAdditiveExpr(0);
    var0.endAbsoluteLocationPath();

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test471");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.startAndExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", "");
    var0.endOrExpr(true);
    java.lang.String var15 = var0.toString();
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startTextNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test472");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.number(0.0d);
    var0.endAdditiveExpr(0);
    var0.startProcessingInstructionNodeStep(1, "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\n ^");
    var0.endPredicate();

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test473");


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
    var0.endAdditiveExpr(10);
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr(10);
    java.lang.String var21 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n(9) endNameStep()\n(10) endAdditiveExpr(10)\n(11) startUnaryExpr()\n(12) startRelativeLocationPath()\n(13) endAdditiveExpr(10)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n(9) endNameStep()\n(10) endAdditiveExpr(10)\n(11) startUnaryExpr()\n(12) startRelativeLocationPath()\n(13) endAdditiveExpr(10)\n"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test474");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.endRelationalExpr(1);
    var0.endEqualityExpr(10);
    var0.endNameStep();
    var0.endXPath();

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test475");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startTextNodeStep(100);
    var0.startUnionExpr();
    var0.startAndExpr();
    var0.startAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();
    var0.endAdditiveExpr(0);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n          ^");

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test476");


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
    var0.endRelationalExpr(1);
    var0.endFunction();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.endNameStep();

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test477");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var11 = var7.toString();
    java.lang.String var12 = var7.getXPath();
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    int var17 = var16.getPosition();
    java.lang.String var18 = var16.toString();
    var7.addSuppressed((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test478");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test479");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.endCommentNodeStep();
    var0.number(0.0d);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test480");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.startFilterExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test481");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startAbsoluteLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var11 = new org.saxpath.helpers.DefaultXPathHandler();
    var11.number(10.0d);
    var11.endNameStep();
    var11.endAbsoluteLocationPath();
    var11.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    boolean var19 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    java.lang.String var20 = var0.toString();
    var0.endMultiplicativeExpr((-1));
    var0.number(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startAbsoluteLocationPath()\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test482");


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
    var0.startCommentNodeStep(0);
    var0.startFilterExpr();
    var0.endRelativeLocationPath();
    var0.endPredicate();
    var0.startPredicate();

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test483");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.endAbsoluteLocationPath();
    var0.number(10);
    var0.startCommentNodeStep(100);
    var0.endUnionExpr(true);
    var0.startEqualityExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test484");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "");
    var0.endMultiplicativeExpr(10);
    var0.endUnaryExpr(100);
    var0.startFilterExpr();
    var0.startMultiplicativeExpr();

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test485");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) endAdditiveExpr(-1)\n(11) endAdditiveExpr(100)\n(12) endPathExpr()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) endNameStep()\n(11) startFunction(\"(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n");

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test486");


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
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var20.endPredicate();
    var20.startAdditiveExpr();
    var20.startCommentNodeStep(1);
    var20.startProcessingInstructionNodeStep(1, "hi!");
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    var20.startTextNodeStep(10);
    var20.endXPath();
    var20.endAdditiveExpr(0);
    var20.startOrExpr();
    var20.endPredicate();
    var20.endAllNodeStep();
    var20.startCommentNodeStep(0);
    var20.startCommentNodeStep(10);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test487");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) endTextNodeStep()\n(5) startCommentNodeStep(100)\n(6) endPathExpr()\n(7) startMultiplicativeExpr()\n");

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test488");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n");
    var0.number(1.0d);
    var0.endOrExpr(true);
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test489");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test490");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("\n ^\n ^", "org.saxpath.SAXPathException:  ^");
    var0.endRelationalExpr(1);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startNameStep(0, \" ^\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startMultiplicativeExpr()\n(8) endOrExpr(false)\n(9) endMultiplicativeExpr(10)\n(10) startFilterExpr()\n(11) endAllNodeStep()\n(12) endProcessingInstructionNodeStep()\n");
    var0.startCommentNodeStep(100);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test491");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startUnionExpr();
    var0.endXPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    var0.endAdditiveExpr(1);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n");
    var0.endProcessingInstructionNodeStep();

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test492");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPathExpr();
    var0.number((-1));
    var0.startUnionExpr();
    var0.startXPath();
    var0.startTextNodeStep((-1));
    var0.startUnaryExpr();
    var0.endFunction();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n");
    var0.startUnaryExpr();
    var0.endEqualityExpr((-1));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test493");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.endXPath();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endMultiplicativeExpr(1);
    var0.startEqualityExpr();
    var0.number(100);
    var0.literal("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n(9) variableReference(\"com.werken.saxpath.XPathSyntaxException: 1: :org.saxpath.SAXPathParseException: \")\n(10) startXPath()\n");

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test494");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endEqualityExpr(0);
    var0.startAndExpr();
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 1: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startUnionExpr()\n(6) startXPath()\n(7) startPathExpr()\n(8) endUnionExpr(true)\n(9) startXPath()\n(10) endUnaryExpr(-1)\n");

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test495");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startTextNodeStep(100);
    var0.endUnionExpr(false);
    var0.endAndExpr(false);
    var0.endOrExpr(true);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test496");


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
    org.saxpath.XPathHandler var17 = var0.getXPathHandler();
    com.werken.saxpath.XPathReader var18 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var19 = new org.saxpath.conformance.ConformanceXPathHandler();
    var19.startAbsoluteLocationPath();
    var19.endTextNodeStep();
    var19.endUnionExpr(true);
    var18.setXPathHandler((org.saxpath.XPathHandler)var19);
    org.saxpath.XPathHandler var25 = var18.getXPathHandler();
    var18.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.conformance.ConformanceXPathHandler var28 = new org.saxpath.conformance.ConformanceXPathHandler();
    var28.startAbsoluteLocationPath();
    var28.endUnaryExpr(10);
    var28.startMultiplicativeExpr();
    var28.startEqualityExpr();
    var28.startAdditiveExpr();
    var28.startAllNodeStep(1);
    var18.setXPathHandler((org.saxpath.XPathHandler)var28);
    org.saxpath.conformance.ConformanceXPathHandler var38 = new org.saxpath.conformance.ConformanceXPathHandler();
    var38.startAbsoluteLocationPath();
    var38.endAndExpr(true);
    boolean var43 = var38.equals((java.lang.Object)'a');
    java.lang.String var44 = var38.toString();
    var38.startXPath();
    var38.endAllNodeStep();
    var38.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var38.endAbsoluteLocationPath();
    var18.setXPathHandler((org.saxpath.XPathHandler)var38);
    org.saxpath.helpers.DefaultXPathHandler var52 = new org.saxpath.helpers.DefaultXPathHandler();
    var52.number(10.0d);
    var52.endRelativeLocationPath();
    var52.number(10);
    var52.endRelativeLocationPath();
    var52.number(10);
    var52.startUnionExpr();
    var18.setXPathHandler((org.saxpath.XPathHandler)var52);
    org.saxpath.XPathHandler var63 = var18.getXPathHandler();
    org.saxpath.XPathHandler var64 = var18.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var65 = new org.saxpath.helpers.DefaultXPathHandler();
    var65.number(10.0d);
    var65.endRelativeLocationPath();
    var65.startRelativeLocationPath();
    var65.endFilterExpr();
    var65.endXPath();
    var65.startUnionExpr();
    var65.startXPath();
    var65.endPredicate();
    var65.startTextNodeStep(10);
    var18.setXPathHandler((org.saxpath.XPathHandler)var65);
    var0.setXPathHandler((org.saxpath.XPathHandler)var65);
    var65.endUnionExpr(false);
    var65.endFilterExpr();
    var65.endAdditiveExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var44.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test497");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.endAndExpr(true);
    var0.startCommentNodeStep((-1));
    var0.endEqualityExpr(10);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test498");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endRelationalExpr(10);
    java.lang.String var15 = var0.toString();
    var0.startEqualityExpr();
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test499");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endFilterExpr();
    var0.number(100);
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    var0.startPathExpr();
    var0.startCommentNodeStep(10);
    var0.endFilterExpr();

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest66.test500");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.startPathExpr();
    var0.endAdditiveExpr(1);
    var0.startNameStep(1, "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelationalExpr()\n");
    var0.endAdditiveExpr((-1));

  }

}
