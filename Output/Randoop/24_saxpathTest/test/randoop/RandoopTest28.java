package randoop;

import junit.framework.*;

public class RandoopTest28 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test1");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.endEqualityExpr(1);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startPredicate();
    var0.endPathExpr();
    var0.variableReference("^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) endRelativeLocationPath()\n");
    var0.endAbsoluteLocationPath();
    var0.endAndExpr(false);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test2");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n");
    var0.startEqualityExpr();
    var0.startPathExpr();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test3");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var3 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test4");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr(100);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n");
    var0.endMultiplicativeExpr((-1));
    var0.endAllNodeStep();

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test5");


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
    var7.startAdditiveExpr();
    var7.startRelativeLocationPath();
    var7.startXPath();
    var7.endFunction();
    var7.startRelationalExpr();
    var7.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test6");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep(1);
    var0.startTextNodeStep((-1));
    var0.startAdditiveExpr();
    var0.endPredicate();
    var0.startCommentNodeStep(10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test7");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.endUnionExpr(false);
    var0.startUnionExpr();
    var0.endPathExpr();

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test8");


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
    var0.endUnaryExpr((-1));
    var0.endAllNodeStep();
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.endTextNodeStep();

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test9");


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
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) endXPath()\n(6) number(1)\n(7) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test10");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.endRelativeLocationPath();
    var0.endFunction();
    var0.literal("org.saxpath.SAXPathException: ");
    var0.number(100);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n");

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test11");


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
    var0.endTextNodeStep();

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test12");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.endAndExpr(true);
    var0.endTextNodeStep();
    var0.startPathExpr();

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test13");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.startMultiplicativeExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.startCommentNodeStep(1);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startCommentNodeStep(0);
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^");

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test14");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(true);
    var0.endPathExpr();
    var0.endPredicate();
    var0.endEqualityExpr(1);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test15");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endAbsoluteLocationPath();
    var0.startTextNodeStep((-1));
    var0.endUnaryExpr((-1));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test16");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getPosition();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getXPath();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var16 = var15.getMultilineMessage();
    java.lang.String var17 = var15.getPositionMarker();
    org.saxpath.SAXPathParseException var19 = new org.saxpath.SAXPathParseException("");
    java.lang.String var20 = var19.toString();
    org.saxpath.SAXPathException var22 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var19.addSuppressed((java.lang.Throwable)var22);
    java.lang.String var24 = var19.toString();
    org.saxpath.SAXPathException var25 = new org.saxpath.SAXPathException((java.lang.Throwable)var19);
    var15.addSuppressed((java.lang.Throwable)var19);
    var3.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var28 = var3.getPositionMarker();
    int var29 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "^"+ "'", var17.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var20.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var24.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test17");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.number(10.0d);
    var0.endFunction();
    var0.endFunction();
    var0.endAdditiveExpr(10);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test18");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.startRelativeLocationPath();
    var0.number(100);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test19");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.endRelationalExpr(0);
    var0.startEqualityExpr();
    var0.startXPath();
    var0.literal("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) startEqualityExpr()\n(7) startXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test20");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.startRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test21");


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
    com.werken.saxpath.XPathReader var17 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var18 = new org.saxpath.conformance.ConformanceXPathHandler();
    var18.startAbsoluteLocationPath();
    var18.endTextNodeStep();
    var18.endUnionExpr(true);
    var17.setXPathHandler((org.saxpath.XPathHandler)var18);
    var18.startOrExpr();
    var18.startUnaryExpr();
    var18.startUnaryExpr();
    var18.endAbsoluteLocationPath();
    var18.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    org.saxpath.helpers.DefaultXPathHandler var30 = new org.saxpath.helpers.DefaultXPathHandler();
    var30.endXPath();
    var30.endRelationalExpr(1);
    var30.endProcessingInstructionNodeStep();
    var30.literal("org.saxpath.SAXPathParseException: ");
    var30.endFilterExpr();
    var30.startAllNodeStep((-1));
    var30.startUnaryExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var30);
    org.saxpath.XPathHandler var42 = var0.getXPathHandler();
    org.saxpath.XPathHandler var43 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test22");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.startFilterExpr();
    var0.endFunction();
    var0.startXPath();

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test23");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep((-1));
    var0.startAdditiveExpr();

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test24");


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
    org.saxpath.SAXPathException var18 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var19 = var3.getXPath();
    java.lang.String var20 = var3.toString();
    java.lang.String var21 = var3.toString();
    
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
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var20.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test25");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.startRelationalExpr();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(true);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test26");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.startFilterExpr();
    var0.endMultiplicativeExpr((-1));
    var0.endAllNodeStep();
    var0.endFunction();
    var0.endFilterExpr();
    var0.endOrExpr(false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test27");


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
    var0.endNameStep();
    var0.startTextNodeStep(1);
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test28");


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
    java.lang.String var15 = var0.toString();
    var0.startPredicate();
    var0.endFilterExpr();
    var0.endPathExpr();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n(7) startPredicate()\n(8) endFilterExpr()\n(9) endPathExpr()\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n(7) startPredicate()\n(8) endFilterExpr()\n(9) endPathExpr()\n"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test29");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(1);
    var0.startAndExpr();
    var0.endAndExpr(false);
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(0);
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.startXPath();

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test30");


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
    var0.startOrExpr();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test31");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.endAdditiveExpr((-1));
    var0.startNameStep(100, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test32");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.endAndExpr(false);
    var0.endFilterExpr();
    var0.startPathExpr();
    var0.startXPath();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test33");


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
    var0.startUnionExpr();
    var0.endTextNodeStep();

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test34");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startPredicate();
    var0.startEqualityExpr();
    var0.endFunction();
    var0.startXPath();

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test35");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endCommentNodeStep();
    var0.startXPath();
    var0.endAbsoluteLocationPath();

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test36");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAbsoluteLocationPath()\n(5) startAdditiveExpr()\n");

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test37");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(0);
    var0.endTextNodeStep();
    var0.endAndExpr(true);
    var0.endPredicate();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    java.lang.String var15 = var0.toString();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) endTextNodeStep()\n(6) endAndExpr(true)\n(7) endPredicate()\n(8) literal(\"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(9) startUnionExpr()\n"+ "'", var15.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) endTextNodeStep()\n(6) endAndExpr(true)\n(7) endPredicate()\n(8) literal(\"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(9) startUnionExpr()\n"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test38");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(1);
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endAdditiveExpr(1);
    var0.endUnaryExpr(10);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test39");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    java.lang.String var4 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "^"+ "'", var4.equals("^"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test40");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endUnionExpr(true);
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 100:  ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endPredicate();
    var0.endCommentNodeStep();
    var0.startEqualityExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n(9) variableReference(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(10) endProcessingInstructionNodeStep()\n");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test41");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startAbsoluteLocationPath();
    var0.startTextNodeStep(10);
    var0.endUnionExpr(true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test42");


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
    var0.startMultiplicativeExpr();
    var0.endCommentNodeStep();
    var0.startAdditiveExpr();

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test43");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startXPath();
    var0.endXPath();
    var0.endPredicate();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test44");


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
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test45");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endAllNodeStep();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test46");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n\norg.saxpath.SAXPathException:  ^\n ^");

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test47");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n");
    var0.startRelativeLocationPath();
    var0.endFunction();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test48");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endCommentNodeStep();
    var0.literal("");
    var0.endRelationalExpr(100);
    var0.startAndExpr();
    var0.startAbsoluteLocationPath();
    var0.endAdditiveExpr(10);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test49");


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
    var0.number(0);
    var0.startAdditiveExpr();

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test50");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startAndExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) number(100.0)\n(7) endAllNodeStep()\n");
    var0.endAdditiveExpr((-1));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test51");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(1);
    var0.endRelationalExpr((-1));
    var0.startPathExpr();
    var0.startEqualityExpr();
    var0.endAndExpr(false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test52");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test53");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(100);
    var0.endRelativeLocationPath();
    var0.endFunction();
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test54");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endOrExpr(false);
    var0.number(10.0d);
    var0.endAbsoluteLocationPath();
    var0.endXPath();
    var0.startPredicate();
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n          ^");
    var0.startUnaryExpr();
    var0.number(1);
    var0.endPathExpr();
    var0.endRelationalExpr((-1));
    var0.number(100);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test55");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    java.lang.String var7 = var0.toString();
    var0.startPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test56");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n(7) startFilterExpr()\n(8) startRelationalExpr()\n(9) startRelativeLocationPath()\n", (-1), "com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n\n ^");

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test57");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endMultiplicativeExpr((-1));
    var0.endAdditiveExpr(100);
    var0.endPathExpr();

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test58");


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
    var0.startPathExpr();

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test59");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(1);
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.startEqualityExpr();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(10);
    var0.endFilterExpr();

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test60");


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
    var0.number(100.0d);
    var0.endProcessingInstructionNodeStep();
    var0.endFilterExpr();

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test61");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endNameStep();
    var0.endUnionExpr(true);
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test62");


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
    var1.number((-1));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test63");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endNameStep();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) startXPath()\n");
    var0.endPathExpr();

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test64");


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
    var0.endPathExpr();
    var0.endAdditiveExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test65");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startCommentNodeStep(10);
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    var0.startRelativeLocationPath();
    var0.endPathExpr();

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test66");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n", 10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var5 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n\n          ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n\n          ^"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test67");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test68");


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
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test69");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.endAllNodeStep();
    var0.endPredicate();
    var0.startMultiplicativeExpr();
    var0.endMultiplicativeExpr(10);
    var0.startAllNodeStep(0);
    var0.startNameStep(1, "org.saxpath.SAXPathException: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test70");


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
    var0.number(1);
    var0.endFunction();
    var0.startAllNodeStep((-1));
    var0.endEqualityExpr(100);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test71");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.endCommentNodeStep();
    var0.startAdditiveExpr();
    var0.startAllNodeStep(0);
    var0.startMultiplicativeExpr();

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test72");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();
    var0.number(1);
    var0.endUnaryExpr((-1));
    var0.endFilterExpr();
    var0.startNameStep((-1), "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endAbsoluteLocationPath()\n");

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test73");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startXPath();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startPathExpr();
    var0.endAdditiveExpr(0);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test74");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n");
    var0.startUnionExpr();
    var0.startFilterExpr();

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test75");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endNameStep();
    var0.number(0);
    var0.endAdditiveExpr(0);
    var0.endFunction();
    var0.startUnionExpr();
    var0.endAdditiveExpr(1);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test76");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test77");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("namespace", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, " ^");
    int var8 = var7.getPosition();
    java.lang.Throwable[] var9 = var7.getSuppressed();
    org.saxpath.SAXPathParseException var11 = new org.saxpath.SAXPathParseException(" ^");
    var7.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var7.toString();
    java.lang.String var14 = var7.toString();
    java.lang.String var15 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test78");


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
    var0.endCommentNodeStep();
    var0.endOrExpr(true);
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test79");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endUnaryExpr((-1));
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startOrExpr();

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test80");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(10);
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n");

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test81");


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
    var17.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test82");


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
    var0.startXPath();

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test83");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endOrExpr(false);
    var1.startAndExpr();
    var1.startEqualityExpr();
    var1.startFilterExpr();
    var1.startOrExpr();
    var1.endEqualityExpr(0);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test84");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(true);
    var0.endTextNodeStep();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test85");


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
    var0.startPredicate();
    var0.endMultiplicativeExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test86");


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
    var1.endUnaryExpr((-1));
    var1.startXPath();
    var1.endRelationalExpr(1);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test87");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endNameStep();
    var0.endNameStep();
    var0.endFilterExpr();
    var0.startTextNodeStep(10);
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n\")\n(6) startPredicate()\n(7) startRelativeLocationPath()\n(8) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n\", \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: hi!\")\n(9) number(1.0)\n(10) endUnaryExpr(100)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test88");


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
    var0.endAllNodeStep();
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.endRelativeLocationPath();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test89");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("hi!", " ^");
    var0.endRelationalExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number((-1.0d));
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test90");


    int var1 = org.saxpath.Axis.lookup("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endFilterExpr()\n(3) startRelationalExpr()\n(4) startAdditiveExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test91");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startAdditiveExpr();
    var0.endOrExpr(false);
    var0.startPredicate();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");
    var0.endOrExpr(false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test92");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endUnionExpr(true);
    var0.endFilterExpr();
    var0.startAndExpr();

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test93");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test94");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.endProcessingInstructionNodeStep();
    var0.endRelationalExpr(100);
    var0.startAdditiveExpr();

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test95");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test96");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n", 10, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    java.lang.String var4 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n\n          ^"+ "'", var4.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n\n          ^"));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test97");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", " ^");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test98");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.startMultiplicativeExpr();
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endAndExpr(true)\n(7) startEqualityExpr()\n(8) startOrExpr()\n(9) endAdditiveExpr(10)\n(10) startProcessingInstructionNodeStep(0, \"(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^\")\n");
    var0.startOrExpr();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test99");


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
    var1.endUnaryExpr(1);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test100");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    var0.endRelationalExpr(10);
    var0.startAllNodeStep(10);
    var0.startAndExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startFilterExpr()\n(5) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) endAdditiveExpr(-1)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) startEqualityExpr()\n(6) startAdditiveExpr()\n(7) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: :(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n\")\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) number(-1.0)\n(8) endXPath()\n(9) endUnionExpr(true)\n");

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test101");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.endAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startUnionExpr();
    var0.startAdditiveExpr();

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test102");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", (-1), "hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.getXPath();
    int var7 = var3.getPosition();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test103");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startXPath();
    var0.endOrExpr(false);
    var0.endEqualityExpr((-1));
    var0.endCommentNodeStep();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endXPath();
    var0.startRelationalExpr();

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test104");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startMultiplicativeExpr();
    var0.startRelationalExpr();
    var0.endFilterExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test105");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n", "          ^");

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test106");


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
    var0.startXPath();
    var0.endUnaryExpr((-1));
    var0.endUnaryExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test107");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAndExpr();

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test108");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startXPath()\n(8) endFilterExpr()\n");

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test109");


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
    var0.endRelationalExpr(100);
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var0.startEqualityExpr();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test110");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var8 = var7.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getMultilineMessage();
    java.lang.String var12 = var3.getXPath();
    java.lang.String var13 = var3.getPositionMarker();
    java.lang.Throwable[] var14 = var3.getSuppressed();
    java.lang.String var15 = var3.toString();
    java.lang.String var16 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "          ^"+ "'", var10.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^"+ "'", var12.equals(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "          ^"+ "'", var13.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var16.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test111");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) startCommentNodeStep(-1)\n(7) startRelativeLocationPath()\n(8) startAdditiveExpr()\n(9) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(10) endProcessingInstructionNodeStep()\n");

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test112");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.endNameStep();
    var0.startAdditiveExpr();
    var0.number(0);
    var0.endMultiplicativeExpr(0);
    var0.startRelationalExpr();
    var0.endFilterExpr();

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test113");


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
    var0.endRelationalExpr(1);
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test114");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) endAdditiveExpr(10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test115");


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
    var16.endOrExpr(true);
    java.lang.String var27 = var16.toString();
    var16.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endFilterExpr()\n(4) startMultiplicativeExpr()\n(5) startRelationalExpr()\n(6) endOrExpr(true)\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endFilterExpr()\n(4) startMultiplicativeExpr()\n(5) startRelationalExpr()\n(6) endOrExpr(true)\n"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test116");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.startEqualityExpr();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.number(10.0d);
    var0.endRelativeLocationPath();

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test117");


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
    var8.startPathExpr();
    var8.startCommentNodeStep(10);
    var8.startAbsoluteLocationPath();
    var8.startAbsoluteLocationPath();
    var8.endUnionExpr(true);
    var8.startPredicate();
    var8.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test118");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.startFilterExpr();
    var0.endFunction();
    var0.startCommentNodeStep(10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test119");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endFunction();
    var0.startRelativeLocationPath();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) startAllNodeStep(1)\n(10) endProcessingInstructionNodeStep()\n(11) startOrExpr()\n(12) startAllNodeStep(-1)\n");

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test120");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "\n ^\n ^");
    var0.endAbsoluteLocationPath();
    var0.startFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var0.startTextNodeStep(1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test121");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test122");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("");
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var11 = var3.getSuppressed();
    java.lang.String var12 = var3.getXPath();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.getXPath();
    java.lang.String var15 = var3.getPositionMarker();
    java.lang.String var16 = var3.getXPath();
    
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
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + " ^"+ "'", var15.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test123");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "");
    var0.endMultiplicativeExpr(10);
    var0.startEqualityExpr();
    var0.endAllNodeStep();
    var0.endAndExpr(true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test124");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.endUnaryExpr(10);
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endMultiplicativeExpr(0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test125");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endEqualityExpr(1);
    org.saxpath.conformance.ConformanceXPathHandler var6 = new org.saxpath.conformance.ConformanceXPathHandler();
    var6.startAbsoluteLocationPath();
    var6.endUnaryExpr(10);
    var6.number(1);
    var6.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var6.startMultiplicativeExpr();
    var6.startFilterExpr();
    boolean var17 = var0.equals((java.lang.Object)var6);
    var6.startUnionExpr();
    var6.startEqualityExpr();
    var6.endEqualityExpr(1);
    var6.startFilterExpr();
    var6.endOrExpr(true);
    var6.startPredicate();
    var6.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test126");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n\")\n", 1, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n ^");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test127");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.endRelativeLocationPath();
    var18.endFilterExpr();
    var18.endUnionExpr(false);
    var18.startRelativeLocationPath();
    var18.startFilterExpr();
    var18.endXPath();
    var18.endFunction();
    var18.startAndExpr();
    boolean var28 = var0.equals((java.lang.Object)var18);
    var18.number(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test128");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var14 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"+ "'", var12.equals("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test129");


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
    var8.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test130");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(0, "hi!");
    var0.endXPath();
    var0.endAndExpr(true);
    var0.startFilterExpr();
    var0.startAllNodeStep(0);
    var0.startMultiplicativeExpr();

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test131");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.startEqualityExpr();
    var0.startUnaryExpr();
    var0.endUnaryExpr(100);
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test132");


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
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    com.werken.saxpath.XPathReader var28 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endTextNodeStep();
    var29.endUnionExpr(true);
    var28.setXPathHandler((org.saxpath.XPathHandler)var29);
    org.saxpath.XPathHandler var35 = var28.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var36 = new org.saxpath.helpers.DefaultXPathHandler();
    var36.number(10.0d);
    var36.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var36.startUnionExpr();
    var36.startUnionExpr();
    var28.setXPathHandler((org.saxpath.XPathHandler)var36);
    org.saxpath.conformance.ConformanceXPathHandler var45 = new org.saxpath.conformance.ConformanceXPathHandler();
    var45.startAbsoluteLocationPath();
    var45.endUnaryExpr(10);
    var45.number(1);
    boolean var52 = var45.equals((java.lang.Object)10L);
    var45.startCommentNodeStep(100);
    var45.startUnionExpr();
    var45.endTextNodeStep();
    var45.endNameStep();
    var28.setXPathHandler((org.saxpath.XPathHandler)var45);
    org.saxpath.conformance.ConformanceXPathHandler var59 = new org.saxpath.conformance.ConformanceXPathHandler();
    var59.startAbsoluteLocationPath();
    var59.endAndExpr(true);
    var59.endPathExpr();
    var59.endTextNodeStep();
    var59.startUnaryExpr();
    var59.endAbsoluteLocationPath();
    var28.setXPathHandler((org.saxpath.XPathHandler)var59);
    var59.startXPath();
    var59.endAllNodeStep();
    var59.startPathExpr();
    var59.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    var59.startAllNodeStep(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test133");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    java.lang.String var9 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.saxpath.SAXPathException: "+ "'", var9.equals("org.saxpath.SAXPathException: "));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test134");


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
    var0.startRelationalExpr();
    var0.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test135");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(0);
    var0.number((-1.0d));
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.number((-1));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test136");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");
    var0.endRelationalExpr(10);
    var0.startCommentNodeStep(1);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test137");


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
    var8.endAndExpr(false);
    var8.endFilterExpr();
    var8.startCommentNodeStep(1);
    var8.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"+ "'", var19.equals("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test138");


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
    var0.endUnionExpr(false);
    var0.endRelationalExpr(1);
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test139");


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
    var13.startXPath();
    var13.startAdditiveExpr();
    var13.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    var13.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test140");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", 100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test141");


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
    var0.startAdditiveExpr();
    var0.endUnionExpr(true);
    var0.endPredicate();
    var0.endUnaryExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test142");


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
    var0.startRelationalExpr();
    var0.endRelativeLocationPath();
    var0.startAbsoluteLocationPath();

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test143");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startPathExpr();
    var0.startAndExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnaryExpr();
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.endEqualityExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test144");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test145");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(true)\n(5) endEqualityExpr(1)\n(6) startCommentNodeStep(0)\n(7) endPathExpr()\n(8) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\")\n(9) endFunction()\n(10) startPredicate()\n(11) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test146");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.number(100.0d);
    var0.startProcessingInstructionNodeStep((-1), "hi!");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \n                                                                                                    ^");
    var0.startAllNodeStep(0);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test147");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var17 = var16.getSuppressed();
    var12.addSuppressed((java.lang.Throwable)var16);
    java.lang.String var19 = var12.toString();
    var3.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var21 = var12.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "          ^"+ "'", var21.equals("          ^"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test148");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(100);
    var0.endNameStep();
    var0.startFilterExpr();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n");
    var0.startRelativeLocationPath();

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test149");


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
    var0.startRelationalExpr();
    var0.endAndExpr(false);
    var0.startNameStep(0, "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test150");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startAndExpr();
    var0.startXPath();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) startProcessingInstructionNodeStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(8) endOrExpr(true)\n(9) startEqualityExpr()\n(10) endCommentNodeStep()\n(11) endRelationalExpr(0)\n(12) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n\")\n(13) endProcessingInstructionNodeStep()\n(14) endMultiplicativeExpr(-1)\n");

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test151");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.number(10);
    var0.endFunction();
    var0.endCommentNodeStep();
    java.lang.String var8 = var0.toString();
    var0.startAllNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n"+ "'", var8.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test152");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.number(10.0d);
    var0.endAllNodeStep();

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test153");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getXPath();
    java.lang.String var8 = var3.getMultilineMessage();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var12);
    java.lang.Throwable[] var14 = var12.getSuppressed();
    java.lang.Throwable[] var15 = var12.getSuppressed();
    int var16 = var12.getPosition();
    java.lang.String var17 = var12.toString();
    var3.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var19 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "\n ^\n ^"+ "'", var5.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "\n ^\n ^"+ "'", var6.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "\n ^\n ^"+ "'", var8.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + " ^"+ "'", var19.equals(" ^"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test154");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.startAllNodeStep(10);
    var0.endXPath();
    var0.startOrExpr();
    var0.endFilterExpr();
    var0.endRelationalExpr(100);
    var0.startOrExpr();

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test155");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.startAllNodeStep((-1));
    var0.endProcessingInstructionNodeStep();
    var0.endFunction();

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test156");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.startPathExpr();
    var0.startRelationalExpr();

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test157");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.startCommentNodeStep(0);
    var0.startAdditiveExpr();

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test158");


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
    var7.startCommentNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test159");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(100);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test160");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test161");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startAdditiveExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startAllNodeStep(0);
    var0.startEqualityExpr();

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test162");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(10);
    org.saxpath.helpers.DefaultXPathHandler var9 = new org.saxpath.helpers.DefaultXPathHandler();
    var9.number(10.0d);
    var9.endNameStep();
    var9.endPathExpr();
    boolean var14 = var0.equals((java.lang.Object)var9);
    var0.endUnaryExpr(100);
    var0.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test163");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var11 = var7.getSuppressed();
    int var12 = var7.getPosition();
    java.lang.String var13 = var7.getXPath();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    org.saxpath.SAXPathException var16 = new org.saxpath.SAXPathException("");
    org.saxpath.SAXPathParseException var18 = new org.saxpath.SAXPathParseException("");
    java.lang.String var19 = var18.toString();
    var16.addSuppressed((java.lang.Throwable)var18);
    var14.addSuppressed((java.lang.Throwable)var18);
    org.saxpath.SAXPathException var22 = new org.saxpath.SAXPathException((java.lang.Throwable)var18);
    org.saxpath.XPathSyntaxException var26 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var27 = var26.toString();
    org.saxpath.SAXPathException var28 = new org.saxpath.SAXPathException((java.lang.Throwable)var26);
    java.lang.String var29 = var26.getMultilineMessage();
    var22.addSuppressed((java.lang.Throwable)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var19.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var27.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"+ "'", var29.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test164");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endOrExpr(false);
    var1.startAndExpr();
    var1.endFilterExpr();
    var1.endCommentNodeStep();
    java.lang.String var16 = var1.toString();
    var1.endFunction();
    var1.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test165");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endFilterExpr();
    var0.endEqualityExpr(10);
    var0.endCommentNodeStep();
    var0.startCommentNodeStep(1);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test166");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n(8) startPredicate()\n");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getXPath();
    java.lang.String var7 = var5.getPositionMarker();
    int var8 = var5.getPosition();
    java.lang.Throwable[] var9 = var5.getSuppressed();
    int var10 = var5.getPosition();
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var14);
    java.lang.String var16 = var14.getPositionMarker();
    var5.addSuppressed((java.lang.Throwable)var14);
    int var18 = var5.getPosition();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var20 = var5.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "^"+ "'", var16.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test167");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "org.saxpath.SAXPathException: ");
    var0.endUnionExpr(true);
    var0.startUnionExpr();
    var0.endPathExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test168");


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
    var0.startPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) endMultiplicativeExpr(1)\n(7) endOrExpr(false)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) startAdditiveExpr()\n(7) startFunction(\" ^:org.saxpath.SAXPathException: \")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test169");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endFilterExpr();
    var0.endEqualityExpr(10);
    var0.endCommentNodeStep();
    var0.endFunction();
    var0.number(1);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test170");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.endCommentNodeStep();
    var0.endAndExpr(false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test171");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endFunction();
    var0.startAllNodeStep(100);
    var0.startPathExpr();
    var0.startFilterExpr();
    var0.startFilterExpr();

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test172");


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
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) startAllNodeStep(-1)\n(7) startEqualityExpr()\n(8) startUnionExpr()\n(9) literal(\"          ^\")\n(10) endFunction()\n");

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test173");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endAdditiveExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endTextNodeStep();

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test174");


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
    var14.endAndExpr(false);
    var14.endNameStep();
    var14.endUnionExpr(false);
    var14.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test175");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    java.lang.String var7 = var0.toString();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "com.werken.saxpath.XPathSyntaxException: 100: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test176");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endPredicate();
    var0.endAdditiveExpr(10);
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n");
    var0.endNameStep();
    var0.endFunction();

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test177");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endNameStep();

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test178");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.startOrExpr();

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test179");


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
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAllNodeStep();

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test180");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.endOrExpr(true);
    var0.startXPath();
    var0.endPredicate();
    var0.startOrExpr();

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test181");


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
    var0.endFilterExpr();
    var0.startRelativeLocationPath();

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test182");


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
    var0.endUnaryExpr(100);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test183");


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
    var0.endNameStep();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test184");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.endNameStep();
    var0.endPathExpr();
    var0.endPathExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endAndExpr(true);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test185");


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
    var0.endPredicate();
    var0.endFilterExpr();

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test186");


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
    var11.endEqualityExpr(1);
    var11.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test187");


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
    var0.startFilterExpr();
    var0.endFilterExpr();

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test188");


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
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.number(0.0d);
    var0.startMultiplicativeExpr();

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test189");


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
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.startMultiplicativeExpr();
    var0.endNameStep();
    var0.endUnaryExpr(100);
    var0.endFunction();

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test190");


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
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.endAllNodeStep();
    var27.endAllNodeStep();
    var27.startFilterExpr();
    var27.endPathExpr();
    var27.startAdditiveExpr();
    var27.startUnionExpr();
    var27.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var27);
    org.saxpath.conformance.ConformanceXPathHandler var36 = new org.saxpath.conformance.ConformanceXPathHandler();
    var36.startAbsoluteLocationPath();
    var36.endTextNodeStep();
    var36.endAdditiveExpr(1);
    java.lang.String var41 = var36.toString();
    var36.startTextNodeStep(0);
    var36.number((-1.0d));
    var36.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var36.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
    var36.endNameStep();
    var36.startCommentNodeStep(100);
    var36.number(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var41.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test191");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test192");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("");
    org.saxpath.SAXPathParseException var3 = new org.saxpath.SAXPathParseException("");
    java.lang.String var4 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var6 = var1.getSuppressed();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    java.lang.String var8 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var4.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.saxpath.SAXPathException: "+ "'", var8.equals("org.saxpath.SAXPathException: "));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test193");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.number(1);
    var0.number(100);
    var0.number((-1));
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startFilterExpr();

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test194");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1.0d));
    var0.startAndExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startAndExpr();
    var0.endAbsoluteLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startAdditiveExpr()\n(5) startEqualityExpr()\n(6) literal(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\")\n(7) startAllNodeStep(100)\n(8) endMultiplicativeExpr(-1)\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAdditiveExpr(-1)\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test195");


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
    var18.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test196");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endAdditiveExpr(1);
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endAdditiveExpr(1)\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endAdditiveExpr(1)\n"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test197");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(true);
    var0.endMultiplicativeExpr((-1));
    var0.endAllNodeStep();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) endOrExpr(false)\n(6) startAbsoluteLocationPath()\n(7) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n:com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(8) endAllNodeStep()\n(9) endPathExpr()\n(10) endUnaryExpr(1)\n");

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test198");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelationalExpr(1);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n");
    var0.number(10.0d);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test199");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1.0d));
    var0.startAndExpr();
    var0.startFunction(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startPredicate();
    var0.startOrExpr();
    var0.number(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test200");


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
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test201");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test202");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(100);
    var0.endUnionExpr(true);
    var0.endAndExpr(false);
    var0.startTextNodeStep(0);
    var0.endNameStep();

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test203");


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
    var37.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endNameStep()\n(8) endRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var37.endTextNodeStep();
    
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

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test204");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getPosition();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getMultilineMessage();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "\n ^\n ^"+ "'", var11.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test205");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    java.lang.String var9 = var3.getPositionMarker();
    java.lang.String var10 = var3.getMultilineMessage();
    int var11 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test206");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startAndExpr();
    var0.startXPath();
    var0.endFunction();
    var0.startTextNodeStep(1);
    var0.startAdditiveExpr();

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test207");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    java.lang.String var4 = var3.toString();
    int var5 = var3.getPosition();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test208");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(0);
    var0.endRelativeLocationPath();
    var0.endNameStep();
    var0.endXPath();
    var0.endNameStep();
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test209");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.startAllNodeStep(100);
    var0.startAdditiveExpr();
    var0.startAndExpr();
    var0.startUnionExpr();

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test210");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.startPathExpr();
    var0.endRelativeLocationPath();

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test211");


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
    var0.endRelativeLocationPath();

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test212");


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
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^");

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test213");


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
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) startTextNodeStep(100)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n");
    var0.startXPath();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test214");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endRelationalExpr(-1)\n(11) endPathExpr()\n(12) startUnionExpr()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) startAdditiveExpr()\n(7) startFunction(\" ^:org.saxpath.SAXPathException: \")\n");

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test215");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endAndExpr(false);
    var0.startTextNodeStep(1);
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test216");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep(100);
    var0.endEqualityExpr((-1));
    var0.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test217");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", 10, "^");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.XPathSyntaxException var9 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n");
    java.lang.String var10 = var9.getXPath();
    java.lang.String var11 = var9.getXPath();
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getPosition();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "          ^"+ "'", var4.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 10: ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"+ "'", var10.equals("org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"+ "'", var11.equals("org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: ^"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 10: ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: ^"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 10: ^"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test218");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAndExpr(false);
    var0.endFilterExpr();
    var0.startAllNodeStep(1);
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test219");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.literal("child");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endTextNodeStep();
    var0.startXPath();

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test220");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.endEqualityExpr(1);
    var0.startRelationalExpr();
    var0.startCommentNodeStep(0);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test221");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endTextNodeStep();

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test222");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^", "org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.endEqualityExpr((-1));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test223");


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
    var0.startRelationalExpr();
    var0.endRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test224");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(0);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test225");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endXPath();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test226");


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
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endAdditiveExpr(100);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test227");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr((-1));
    var0.endAllNodeStep();
    var0.startAndExpr();

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test228");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(100);
    var0.endUnaryExpr((-1));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test229");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFunction("org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endNameStep();
    var0.endPredicate();
    var0.endCommentNodeStep();
    var0.startUnionExpr();
    var0.startUnaryExpr();

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test230");


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
    var0.endEqualityExpr(10);
    var0.endUnaryExpr((-1));
    var0.startPathExpr();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test231");


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
    org.saxpath.conformance.ConformanceXPathHandler var48 = new org.saxpath.conformance.ConformanceXPathHandler();
    var48.startAbsoluteLocationPath();
    var48.endUnaryExpr(10);
    var48.number(1);
    var48.startAllNodeStep((-1));
    var48.endOrExpr(true);
    var48.variableReference("child", "                                                                                                    ^");
    var48.startRelativeLocationPath();
    var48.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test232");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startOrExpr()\n(7) endPathExpr()\n(8) endUnaryExpr(0)\n");

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test233");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endUnaryExpr(100);
    var0.startXPath();

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test234");


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
    var0.endNameStep();

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test235");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startTextNodeStep(0);
    var0.endOrExpr(true);
    var0.startCommentNodeStep((-1));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test236");


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
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test237");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startCommentNodeStep(0);
    var0.startPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endMultiplicativeExpr(-1)\n(7) endMultiplicativeExpr(-1)\n(8) literal(\"^\")\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test238");


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
    var8.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test239");


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
    var0.endRelativeLocationPath();
    var0.startAndExpr();

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test240");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.startAbsoluteLocationPath();
    java.lang.String var10 = var0.toString();
    var0.startAdditiveExpr();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) endFilterExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: ^:(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\")\n(5) startAbsoluteLocationPath()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) endFilterExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: ^:(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\")\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test241");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endCommentNodeStep();
    var0.endFunction();
    var0.startAndExpr();
    var0.startFunction("org.saxpath.SAXPathParseException: \nhi!\n^", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n");
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test242");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endXPath();
    var0.endFunction();
    var0.endProcessingInstructionNodeStep();

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test243");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startPathExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep((-1));
    var0.startUnaryExpr();
    var0.startFilterExpr();

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test244");


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
    var0.startFilterExpr();
    var0.endUnionExpr(true);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test245");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.endNameStep();
    var0.startRelationalExpr();
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);
    var0.endMultiplicativeExpr((-1));
    var0.number((-1.0d));
    var0.endTextNodeStep();

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test246");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 1, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var9 = var8.toString();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var8);
    org.saxpath.SAXPathException var11 = new org.saxpath.SAXPathException((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var9.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test247");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test248");


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
    var0.endAllNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var17 = new org.saxpath.conformance.ConformanceXPathHandler();
    var17.startRelativeLocationPath();
    var17.endMultiplicativeExpr((-1));
    boolean var21 = var0.equals((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test249");


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
    var22.endRelativeLocationPath();
    var22.endFunction();
    var22.endUnionExpr(true);
    var22.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test250");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endUnaryExpr((-1));
    var0.endOrExpr(false);
    var0.startAllNodeStep(0);
    var0.endXPath();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n", (-1), "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var16 = var15.getPositionMarker();
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException((java.lang.Throwable)var15);
    java.lang.String var18 = var15.getPositionMarker();
    java.lang.String var19 = var15.getPositionMarker();
    var11.addSuppressed((java.lang.Throwable)var15);
    boolean var21 = var0.equals((java.lang.Object)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + " ^"+ "'", var19.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test251");


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
    var0.startPathExpr();
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test252");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endFilterExpr();
    var0.startAndExpr();

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test253");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endRelationalExpr((-1));
    var0.number(100);
    var0.endAndExpr(false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test254");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.literal("(0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) startAdditiveExpr()\n(2) startPredicate()\n(3) startAllNodeStep(-1)\n");
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endEqualityExpr((-1));
    var10.endTextNodeStep();
    var10.endAdditiveExpr(1);
    var10.startAdditiveExpr();
    var10.startNameStep(100, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var10.startAdditiveExpr();
    var10.endMultiplicativeExpr((-1));
    boolean var25 = var0.equals((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test255");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");
    var0.startAllNodeStep(0);
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endRelativeLocationPath()\n(8) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\")\n(9) startAllNodeStep(0)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endRelativeLocationPath()\n(8) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\")\n(9) startAllNodeStep(0)\n"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test256");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.number(10.0d);
    var0.endPredicate();
    var0.endOrExpr(false);
    var0.endEqualityExpr((-1));
    var0.endAllNodeStep();
    var0.startPathExpr();
    var0.endFunction();

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test257");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.Throwable[] var12 = var3.getSuppressed();
    java.lang.Throwable[] var13 = var3.getSuppressed();
    
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
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test258");


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
    var0.startAllNodeStep((-1));
    var0.number(100.0d);
    var0.startRelationalExpr();

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test259");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endEqualityExpr(10);
    var0.startFunction("child", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.endUnaryExpr(1);
    var0.startRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test260");


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
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    var20.endRelationalExpr(0);
    var20.endFilterExpr();
    var20.endOrExpr(true);
    var20.endXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    java.lang.String var31 = var20.toString();
    var20.endRelationalExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endXPath()\n"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endXPath()\n"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test261");


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
    var0.startEqualityExpr();

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test262");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startTextNodeStep(0);
    var0.endOrExpr(true);
    var0.endFunction();
    var0.startAdditiveExpr();
    var0.endUnionExpr(true);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test263");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endMultiplicativeExpr(10);
    var1.number(1.0d);
    var1.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n");
    var1.startPredicate();
    var1.startFunction("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var1.endAbsoluteLocationPath();

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test264");


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
    var0.endProcessingInstructionNodeStep();
    var0.endNameStep();

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test265");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.startUnionExpr();

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test266");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.endUnionExpr(false);
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");
    var0.startOrExpr();

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test267");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endCommentNodeStep();
    var0.endRelationalExpr(0);
    var0.startPredicate();
    var0.endOrExpr(false);
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test268");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endOrExpr(true);
    var0.variableReference("child", "                                                                                                    ^");
    var0.endAllNodeStep();

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test269");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endNameStep();
    org.saxpath.helpers.DefaultXPathHandler var11 = new org.saxpath.helpers.DefaultXPathHandler();
    var11.number(10.0d);
    var11.endPathExpr();
    var11.startOrExpr();
    var11.startEqualityExpr();
    var11.startEqualityExpr();
    var11.endUnaryExpr(10);
    var11.startAbsoluteLocationPath();
    boolean var21 = var0.equals((java.lang.Object)var11);
    var0.startUnaryExpr();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test270");


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
    var9.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test271");


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
    var0.endCommentNodeStep();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test272");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endAndExpr(false);
    var0.startTextNodeStep(10);
    var0.startFunction("          ^", "");
    var0.literal("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.endUnionExpr(false);
    var0.endMultiplicativeExpr((-1));
    var0.endUnaryExpr((-1));
    var0.startXPath();
    var0.startAndExpr();

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test273");


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
    var0.endFilterExpr();

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test274");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test275");


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
    var0.endPathExpr();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test276");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startAdditiveExpr();
    var0.startRelativeLocationPath();

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test277");


    int var1 = org.saxpath.Axis.lookup("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) endPredicate()\n(4) endProcessingInstructionNodeStep()\n(5) startAdditiveExpr()\n(6) startFilterExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test278");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endAllNodeStep();
    var0.startMultiplicativeExpr();
    var0.endRelationalExpr((-1));
    var0.endRelativeLocationPath();

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test279");


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
    var0.startRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.startRelationalExpr();
    var0.endRelationalExpr(1);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test280");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startMultiplicativeExpr();
    var0.startRelationalExpr();
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test281");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endUnaryExpr(10);
    var0.endRelationalExpr(100);
    var0.endAdditiveExpr(10);
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test282");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    org.saxpath.XPathHandler var9 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endAndExpr(true);
    boolean var15 = var10.equals((java.lang.Object)'a');
    var10.startAbsoluteLocationPath();
    var10.endMultiplicativeExpr((-1));
    var10.endEqualityExpr((-1));
    var10.startAbsoluteLocationPath();
    var10.startRelationalExpr();
    var10.startAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var10);
    var10.endUnaryExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test283");


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
    var0.startMultiplicativeExpr();
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test284");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test285");


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
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endUnionExpr(true);
    var0.endOrExpr(false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test286");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.startPredicate();

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test287");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getXPath();
    java.lang.String var8 = var3.toString();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    java.lang.String var13 = var12.getXPath();
    var3.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var15 = var12.getSuppressed();
    int var16 = var12.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test288");


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
    var8.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test289");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.endEqualityExpr(0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test290");


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
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test291");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endMultiplicativeExpr(0);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test292");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.literal("child");
    var0.startAdditiveExpr();
    var0.endAndExpr(true);
    var0.number((-1));
    var0.startXPath();
    var0.number(10);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test293");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test294");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) number(10)\n");
    var0.endPathExpr();

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test295");


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
    var0.number((-1.0d));
    var0.startEqualityExpr();
    var0.endPredicate();

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test296");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startEqualityExpr();
    var0.startTextNodeStep(0);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startMultiplicativeExpr()\n(5) startRelativeLocationPath()\n(6) endRelativeLocationPath()\n(7) startRelationalExpr()\n(8) startPredicate()\n");
    var0.endFunction();
    var0.endAbsoluteLocationPath();

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test297");


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
    var0.endTextNodeStep();
    var0.endPredicate();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) endAdditiveExpr(10)\n");

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test298");


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
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test299");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) endXPath()\n(6) number(1)\n(7) endRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
    var0.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test300");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test301");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endProcessingInstructionNodeStep()\n(4) startUnionExpr()\n(5) endOrExpr(true)\n(6) startPredicate()\n");

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test302");


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
    var7.endProcessingInstructionNodeStep();
    var7.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var7.endAllNodeStep();
    var7.startFunction("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test303");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();
    var0.endAdditiveExpr(100);
    var0.startUnionExpr();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test304");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) endCommentNodeStep()\n(7) number(10)\n(8) endPathExpr()\n(9) endFunction()\n(10) startCommentNodeStep(100)\n(11) endMultiplicativeExpr(100)\n(12) endFunction()\n");
    var0.startFilterExpr();

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test305");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startUnionExpr();
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFilterExpr();

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test306");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startAbsoluteLocationPath();
    boolean var12 = var0.equals((java.lang.Object)'4');
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test307");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.startFilterExpr();
    var0.endMultiplicativeExpr((-1));
    var0.endAllNodeStep();
    var0.endFunction();
    var0.endFilterExpr();
    var0.endRelationalExpr(100);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test308");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.endRelationalExpr((-1));
    var0.startCommentNodeStep((-1));
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n\n^");
    var0.endEqualityExpr(10);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test309");


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
    var0.startPredicate();
    var0.endAbsoluteLocationPath();

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test310");


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
    var7.endAllNodeStep();
    var7.endPredicate();
    var7.startAndExpr();
    var7.endOrExpr(false);
    var7.startEqualityExpr();
    var7.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test311");


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
    var7.endFilterExpr();
    var7.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test312");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.endNameStep();
    var0.startEqualityExpr();
    var0.startTextNodeStep(10);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^", "com.werken.saxpath.XPathSyntaxException: 1: \norg.saxpath.SAXPathParseException: \n ^");

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test313");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(10);
    var0.endAndExpr(true);
    var0.startAllNodeStep(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(true);
    var0.endEqualityExpr(100);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test314");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) endRelativeLocationPath()\n(5) endAdditiveExpr(0)\n(6) endRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test315");


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
    var41.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var41.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var41);
    var41.startPathExpr();
    var41.startUnionExpr();
    var41.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var47.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test316");


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
    var0.endUnionExpr(true);
    var0.endNameStep();

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test317");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.startEqualityExpr();
    var0.variableReference("hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endAllNodeStep()\n(7) endAllNodeStep()\n(8) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(9) endFilterExpr()\n(10) startFilterExpr()\n(11) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n");
    var0.startPredicate();
    var0.number(1.0d);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test318");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.startUnaryExpr();
    var0.startTextNodeStep((-1));
    var0.startAdditiveExpr();

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test319");


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
    var0.parse("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test320");


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
    var12.startRelationalExpr();
    var12.endAndExpr(false);
    var12.endOrExpr(true);
    var12.startPathExpr();
    var12.startEqualityExpr();
    var12.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test321");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^", 0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) endRelationalExpr(10)\n");

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test322");


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
    var0.startOrExpr();
    var0.endRelationalExpr(100);
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test323");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.number((-1.0d));
    var0.endPathExpr();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.startPathExpr();
    var0.endPredicate();
    var0.endFilterExpr();

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test324");


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
    var7.endUnaryExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test325");


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
    var0.number(0.0d);
    var0.startEqualityExpr();
    var0.endMultiplicativeExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test326");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(true);
    var0.variableReference("child", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startPredicate();

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test327");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startPredicate();
    var0.endRelationalExpr(100);
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test328");


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
    var8.endFilterExpr();
    var8.endUnaryExpr((-1));
    var8.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test329");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test330");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\n ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.Throwable[] var7 = var5.getSuppressed();
    java.lang.Throwable[] var8 = var5.getSuppressed();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.toString();
    java.lang.String var18 = var16.getPositionMarker();
    var12.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var20 = var16.getSuppressed();
    int var21 = var16.getPosition();
    java.lang.String var22 = var16.getXPath();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    java.lang.String var24 = var16.toString();
    var5.addSuppressed((java.lang.Throwable)var16);
    java.lang.String var26 = var5.getPositionMarker();
    org.saxpath.SAXPathException var27 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    org.saxpath.SAXPathException var28 = new org.saxpath.SAXPathException((java.lang.Throwable)var27);
    var1.addSuppressed((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + " ^"+ "'", var26.equals(" ^"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test331");


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
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(false);
    var0.startMultiplicativeExpr();
    var0.endCommentNodeStep();

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test332");


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
    var18.endMultiplicativeExpr((-1));
    var18.endUnionExpr(true);
    var18.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test333");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startNameStep(0, "^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.endFunction();
    var0.startFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) startUnaryExpr()\n(6) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endFilterExpr()\n(3) startRelationalExpr()\n(4) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n");

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test334");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    var0.endUnaryExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test335");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startEqualityExpr();
    var0.startAllNodeStep(100);
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) endOrExpr(false)\n(6) startAbsoluteLocationPath()\n(7) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n:com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(8) endAllNodeStep()\n(9) endPathExpr()\n(10) endUnaryExpr(1)\n");

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test336");


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
    var0.startRelationalExpr();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test337");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAdditiveExpr(10);
    var0.number(100);
    var0.number((-1));
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endPredicate()\n(8) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\")\n(9) endAllNodeStep()\n(10) startAdditiveExpr()\n");
    var0.startAndExpr();
    var0.number(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test338");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    java.lang.String var7 = var0.toString();
    var0.endMultiplicativeExpr(10);
    var0.endFilterExpr();
    var0.number(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test339");


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
    var0.endPathExpr();
    var0.endAdditiveExpr(100);
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startEqualityExpr()\n(6) startTextNodeStep(0)\n(7) endFilterExpr()\n(8) endAbsoluteLocationPath()\n(9) startAdditiveExpr()\n");

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test340");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.startPredicate();

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test341");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.endOrExpr(false);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startRelationalExpr();
    var0.endAdditiveExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test342");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startPathExpr();
    var0.startAndExpr();
    org.saxpath.helpers.DefaultXPathHandler var9 = new org.saxpath.helpers.DefaultXPathHandler();
    var9.number(10.0d);
    var9.endRelativeLocationPath();
    var9.number(10);
    var9.startOrExpr();
    var9.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var9.startFilterExpr();
    var9.endPathExpr();
    var9.startUnaryExpr();
    boolean var22 = var0.equals((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test343");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.startXPath();
    var0.endXPath();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    var0.endRelationalExpr(1);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test344");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startAndExpr();
    var0.startCommentNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test345");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endFunction();
    var0.endCommentNodeStep();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startOrExpr();

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test346");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startPredicate();
    var0.endRelationalExpr(100);
    var0.number(10.0d);
    var0.startAdditiveExpr();
    var0.endUnaryExpr((-1));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test347");


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
    java.lang.String var14 = var3.toString();
    java.lang.Throwable[] var15 = var3.getSuppressed();
    org.saxpath.SAXPathException var16 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var17 = var3.getSuppressed();
    java.lang.String var18 = var3.getMultilineMessage();
    java.lang.String var19 = var3.getMultilineMessage();
    
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
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test348");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAndExpr();
    var0.endUnaryExpr(0);
    var0.startXPath();
    var0.startFilterExpr();
    var0.startAndExpr();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAndExpr()\n(6) endUnaryExpr(0)\n(7) startXPath()\n(8) startFilterExpr()\n(9) startAndExpr()\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAndExpr()\n(6) endUnaryExpr(0)\n(7) startXPath()\n(8) startFilterExpr()\n(9) startAndExpr()\n"));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test349");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAndExpr(false);
    var0.endRelationalExpr(0);
    var0.startXPath();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test350");


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
    var0.endOrExpr(true);
    var0.number(1.0d);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test351");


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
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startXPath()\n(6) startPredicate()\n(7) endAndExpr(true)\n(8) endRelativeLocationPath()\n(9) startProcessingInstructionNodeStep(10, \"com.werken.saxpath.XPathSyntaxException: 0: hi!\")\n(10) endMultiplicativeExpr(-1)\n(11) endTextNodeStep()\n");
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test352");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startProcessingInstructionNodeStep((-1), " ^");
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.endRelativeLocationPath();

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test353");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.startTextNodeStep(100);
    var0.literal("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^");
    var0.startTextNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test354");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) endNameStep()\n(11) startFunction(\"(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test355");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.number(1);
    var0.number(100);
    var0.number((-1));
    var0.startTextNodeStep(0);
    var0.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var23 = new org.saxpath.conformance.ConformanceXPathHandler();
    var23.startAbsoluteLocationPath();
    var23.endAndExpr(true);
    boolean var28 = var23.equals((java.lang.Object)'a');
    java.lang.String var29 = var23.toString();
    var23.startXPath();
    var23.startPathExpr();
    var23.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var23.startXPath();
    var23.endAndExpr(true);
    var23.startOrExpr();
    var23.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    boolean var44 = var0.equals((java.lang.Object)1);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test356");


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
    var0.endXPath();
    var0.endNameStep();
    var0.endPredicate();
    var0.startFilterExpr();

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test357");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.endUnionExpr(false);
    var0.startAllNodeStep(100);
    var0.endNameStep();
    var0.endAllNodeStep();

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test358");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.startFilterExpr();
    var0.endUnionExpr(true);
    var0.endOrExpr(false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test359");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.endRelationalExpr((-1));
    var0.endUnionExpr(true);
    var0.endMultiplicativeExpr(1);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test360");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.endFunction();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test361");


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
    var0.endNameStep();
    org.saxpath.conformance.ConformanceXPathHandler var34 = new org.saxpath.conformance.ConformanceXPathHandler();
    var34.startAbsoluteLocationPath();
    var34.endAndExpr(true);
    boolean var39 = var34.equals((java.lang.Object)'a');
    java.lang.String var40 = var34.toString();
    var34.startXPath();
    var34.endAllNodeStep();
    var34.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var34.endAbsoluteLocationPath();
    var34.endCommentNodeStep();
    var34.number(10);
    var34.endPathExpr();
    var34.endFunction();
    boolean var52 = var0.equals((java.lang.Object)var34);
    var0.endMultiplicativeExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var40.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test362");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startPredicate();
    var0.endOrExpr(false);
    var0.startRelationalExpr();
    var0.startFilterExpr();

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test363");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endXPath();
    var0.endCommentNodeStep();
    var0.endPredicate();
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test364");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test365");


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
    org.saxpath.helpers.DefaultXPathHandler var45 = new org.saxpath.helpers.DefaultXPathHandler();
    var45.endRelativeLocationPath();
    var45.endFilterExpr();
    var45.endMultiplicativeExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    org.saxpath.conformance.ConformanceXPathHandler var51 = new org.saxpath.conformance.ConformanceXPathHandler();
    var51.startAbsoluteLocationPath();
    var51.endAndExpr(true);
    boolean var56 = var51.equals((java.lang.Object)'a');
    java.lang.String var57 = var51.toString();
    var51.endEqualityExpr(1);
    var51.endAbsoluteLocationPath();
    var51.endAllNodeStep();
    var51.startAdditiveExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var51);
    org.saxpath.helpers.DefaultXPathHandler var64 = new org.saxpath.helpers.DefaultXPathHandler();
    var64.number(10.0d);
    var64.endRelativeLocationPath();
    var64.startRelativeLocationPath();
    var64.endFilterExpr();
    var64.endAdditiveExpr(100);
    var64.endRelationalExpr((-1));
    var64.startRelationalExpr();
    var64.endOrExpr(true);
    var64.endRelationalExpr((-1));
    var64.startNameStep(100, "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var64.startXPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var64);
    var64.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var57.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test366");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", 1, "^");
    int var4 = var3.getPosition();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: \nhi!\n^", 0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    java.lang.String var9 = var8.toString();
    int var10 = var8.getPosition();
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: ^"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: ^"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test367");


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
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();
    var0.endNameStep();
    var0.startAndExpr();
    var0.number(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test368");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endEqualityExpr(1);
    org.saxpath.conformance.ConformanceXPathHandler var6 = new org.saxpath.conformance.ConformanceXPathHandler();
    var6.startAbsoluteLocationPath();
    var6.endUnaryExpr(10);
    var6.number(1);
    var6.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var6.startMultiplicativeExpr();
    var6.startFilterExpr();
    boolean var17 = var0.equals((java.lang.Object)var6);
    var0.number((-1.0d));
    var0.startAndExpr();
    var0.startAllNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test369");


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
    var7.endEqualityExpr((-1));
    var7.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test370");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.startAndExpr();
    var0.startPathExpr();
    var0.endPredicate();
    var0.endRelationalExpr(10);
    var0.startAllNodeStep(1);
    var0.endNameStep();
    var0.endUnaryExpr(100);
    var0.endMultiplicativeExpr(10);
    var0.endRelativeLocationPath();

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test371");


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
    org.saxpath.conformance.ConformanceXPathHandler var74 = new org.saxpath.conformance.ConformanceXPathHandler();
    var74.startAbsoluteLocationPath();
    var74.endEqualityExpr((-1));
    var74.endTextNodeStep();
    var74.endAdditiveExpr(1);
    var74.endAndExpr(false);
    var74.endAbsoluteLocationPath();
    var74.startUnaryExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var74);
    
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

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test372");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "child", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAdditiveExpr(1);
    var0.startMultiplicativeExpr();
    var0.startFunction("\n ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startEqualityExpr();
    var0.startOrExpr();

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test373");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\n ^\n ^"+ "'", var9.equals("\n ^\n ^"));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test374");


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
    var0.endTextNodeStep();

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test375");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", (-1), "hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    java.lang.String var10 = var7.getXPath();
    java.lang.Throwable[] var11 = var7.getSuppressed();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var16 = var15.getPositionMarker();
    int var17 = var15.getPosition();
    java.lang.String var18 = var15.getXPath();
    var7.addSuppressed((java.lang.Throwable)var15);
    var3.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var21 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test376");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endOrExpr(true);
    var0.endRelationalExpr((-1));
    var0.startTextNodeStep(100);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n");
    var0.endAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test377");


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
    var1.endOrExpr(false);
    var1.number(0);
    var1.startRelationalExpr();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test378");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.endAdditiveExpr(1);
    var0.endNameStep();
    var0.endAllNodeStep();
    var0.endNameStep();

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test379");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endNameStep();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) startOrExpr()\n(5) endUnionExpr(true)\n(6) number(10.0)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n(7) startEqualityExpr()\n");
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) endPredicate()\n(6) startAbsoluteLocationPath()\n(7) startAdditiveExpr()\n");
    var0.endCommentNodeStep();

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test380");


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
    var0.endPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endNameStep();
    org.saxpath.conformance.ConformanceXPathHandler var17 = new org.saxpath.conformance.ConformanceXPathHandler();
    var17.startAbsoluteLocationPath();
    var17.endUnaryExpr(10);
    var17.number(1);
    boolean var24 = var17.equals((java.lang.Object)10L);
    var17.startCommentNodeStep(100);
    var17.startUnionExpr();
    var17.endProcessingInstructionNodeStep();
    var17.startEqualityExpr();
    var17.startAdditiveExpr();
    var17.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) endAbsoluteLocationPath()\n(3) endEqualityExpr(100)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    boolean var34 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test381");


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
    var32.startUnaryExpr();
    var32.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n");
    var32.endPathExpr();
    var32.startAbsoluteLocationPath();
    var32.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test382");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();
    var0.startRelationalExpr();

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test383");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.endNameStep();

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test384");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAdditiveExpr(1);
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test385");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endFilterExpr();
    var0.startTextNodeStep(1);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test386");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test387");


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
    var0.startUnionExpr();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startOrExpr();
    var0.startPredicate();
    var0.startAbsoluteLocationPath();

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test388");


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
    var0.endOrExpr(false);
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test389");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startTextNodeStep(100)\n(5) endRelativeLocationPath()\n");
    var0.endXPath();

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test390");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endUnaryExpr(1);
    var1.endOrExpr(false);
    var1.endUnaryExpr((-1));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test391");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) startTextNodeStep(10)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test392");


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
    var0.number((-1.0d));
    var0.endPredicate();
    java.lang.String var23 = var0.toString();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n(7) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\", \"(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(8) startUnaryExpr()\n(9) endProcessingInstructionNodeStep()\n(10) number(-1.0)\n(11) endPredicate()\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n(7) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\", \"(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(8) startUnaryExpr()\n(9) endProcessingInstructionNodeStep()\n(10) number(-1.0)\n(11) endPredicate()\n"));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test393");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.startNameStep(100, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.startOrExpr();
    java.lang.String var16 = var0.toString();
    var0.startPathExpr();
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test394");


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
    var0.endPredicate();
    var0.endPredicate();
    var0.startCommentNodeStep(10);
    var0.endProcessingInstructionNodeStep();

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test395");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.number(0);
    var0.endAbsoluteLocationPath();
    var0.startPathExpr();

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test396");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.endUnionExpr(false);
    var0.endRelativeLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n");
    var0.startOrExpr();

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test397");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n", (-1), "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test398");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endUnaryExpr(10);
    var0.startFilterExpr();
    var0.endOrExpr(false);
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test399");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startXPath();
    var0.startProcessingInstructionNodeStep((-1), "");
    var0.startRelationalExpr();
    var0.number((-1.0d));
    var0.endXPath();

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test400");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var0.endUnionExpr(true);
    var0.endPathExpr();

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test401");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startOrExpr();
    var0.endAllNodeStep();
    var0.startRelativeLocationPath();
    com.werken.saxpath.XPathReader var11 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endTextNodeStep();
    var12.endUnionExpr(true);
    var11.setXPathHandler((org.saxpath.XPathHandler)var12);
    org.saxpath.XPathHandler var18 = var11.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var19 = new org.saxpath.conformance.ConformanceXPathHandler();
    var19.startAbsoluteLocationPath();
    var19.endAndExpr(true);
    boolean var24 = var19.equals((java.lang.Object)'a');
    var19.startAbsoluteLocationPath();
    var19.startRelativeLocationPath();
    var19.startAbsoluteLocationPath();
    var19.number((-1.0d));
    var19.number(100.0d);
    var11.setXPathHandler((org.saxpath.XPathHandler)var19);
    org.saxpath.conformance.ConformanceXPathHandler var33 = new org.saxpath.conformance.ConformanceXPathHandler();
    var33.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var33.endEqualityExpr(1);
    org.saxpath.conformance.ConformanceXPathHandler var39 = new org.saxpath.conformance.ConformanceXPathHandler();
    var39.startAbsoluteLocationPath();
    var39.endUnaryExpr(10);
    var39.number(1);
    var39.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var39.startMultiplicativeExpr();
    var39.startFilterExpr();
    boolean var50 = var33.equals((java.lang.Object)var39);
    var39.startUnionExpr();
    var39.startEqualityExpr();
    var39.endEqualityExpr(1);
    var11.setXPathHandler((org.saxpath.XPathHandler)var39);
    boolean var56 = var0.equals((java.lang.Object)var39);
    var39.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test402");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    com.werken.saxpath.XPathReader var13 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endTextNodeStep();
    var14.endUnionExpr(true);
    var13.setXPathHandler((org.saxpath.XPathHandler)var14);
    org.saxpath.XPathHandler var20 = var13.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var21 = new org.saxpath.helpers.DefaultXPathHandler();
    var21.number(10.0d);
    var21.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var21.startUnionExpr();
    var21.startUnionExpr();
    var13.setXPathHandler((org.saxpath.XPathHandler)var21);
    org.saxpath.XPathHandler var30 = var13.getXPathHandler();
    boolean var31 = var0.equals((java.lang.Object)var30);
    var0.endPathExpr();
    var0.number((-1));
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) startTextNodeStep(100)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test403");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endFilterExpr();
    var0.endEqualityExpr(10);
    var0.endCommentNodeStep();
    var0.startAdditiveExpr();

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test404");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startAllNodeStep(0);
    var0.startOrExpr();
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "org.saxpath.SAXPathException: ");
    var0.startAndExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 10: hi!");
    var0.endEqualityExpr(100);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test405");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^\ncom.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", (-1), "com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    int var4 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test406");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.endAdditiveExpr(100);
    var0.startAllNodeStep(100);
    var0.endUnaryExpr(10);
    var0.startTextNodeStep(100);
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test407");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.startRelationalExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test408");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.endMultiplicativeExpr(10);
    var1.number(1.0d);
    var1.endMultiplicativeExpr(1);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test409");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startTextNodeStep(100);
    var0.endEqualityExpr(1);
    var0.startEqualityExpr();
    var0.startAllNodeStep((-1));
    var0.endMultiplicativeExpr(1);
    var0.endPredicate();

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test410");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getXPath();
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test411");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endPathExpr();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.startAllNodeStep(100);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test412");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endAdditiveExpr(100);
    var0.endMultiplicativeExpr(100);
    var0.endEqualityExpr(100);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test413");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1.0d));
    var0.startAndExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endAdditiveExpr(100);
    org.saxpath.conformance.ConformanceXPathHandler var16 = new org.saxpath.conformance.ConformanceXPathHandler();
    var16.startAbsoluteLocationPath();
    var16.endAndExpr(true);
    boolean var21 = var16.equals((java.lang.Object)'a');
    java.lang.String var22 = var16.toString();
    var16.endEqualityExpr(1);
    var16.endOrExpr(true);
    boolean var27 = var0.equals((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test414");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endFilterExpr();
    var0.number(0);
    var0.number((-1));
    var0.endEqualityExpr(0);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test415");


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
    var0.startXPath();
    var0.startXPath();
    var0.number(1.0d);
    var0.endAllNodeStep();
    var0.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test416");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);
    var0.startRelationalExpr();
    var0.number(100.0d);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test417");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.number(1);
    var0.number(100);
    var0.number((-1));
    var0.startTextNodeStep(0);
    var0.startXPath();
    var0.endAbsoluteLocationPath();
    var0.startPredicate();

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test418");


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
    var0.endFunction();
    var0.endPredicate();

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test419");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endPredicate();

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test420");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test421");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endUnionExpr(false);
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) startEqualityExpr()\n(7) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n");
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test422");


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
    var17.endCommentNodeStep();
    var17.endRelationalExpr(0);
    var17.endTextNodeStep();
    var17.startUnaryExpr();
    var17.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startNameStep(0, \" ^\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startEqualityExpr()\n(8) startPredicate()\n(9) startNameStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) startRelationalExpr()\n(11) endMultiplicativeExpr(-1)\n(12) number(-1)\n(13) endXPath()\n(14) startAbsoluteLocationPath()\n(15) endRelationalExpr(-1)\n(16) startOrExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test423");


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
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");
    var0.number(100.0d);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test424");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep((-1));
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n");
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test425");


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
    var14.endNameStep();

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test426");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "");
    var0.endAndExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test427");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.startAndExpr();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test428");


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
    var0.endProcessingInstructionNodeStep();

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test429");


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
    var0.endOrExpr(false);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var0.startFunction(" ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.startRelationalExpr();
    var0.endCommentNodeStep();

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test430");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endRelationalExpr(1);
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startXPath()\n(8) endFilterExpr()\n");
    var0.endTextNodeStep();

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test431");


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
    var8.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    var8.startMultiplicativeExpr();
    var8.startAbsoluteLocationPath();
    var8.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test432");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(10);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test434");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.number(1.0d);
    var0.startCommentNodeStep(1);
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test435");


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
    var0.startAllNodeStep(10);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test436");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endXPath();
    var0.number(0.0d);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test437");


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
    var0.startRelationalExpr();
    var0.literal("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test438");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startCommentNodeStep((-1));
    var0.endCommentNodeStep();
    var0.number(10);
    var0.endFunction();
    var0.startTextNodeStep(100);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test439");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.number((-1));
    var0.endUnaryExpr(10);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test440");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var1.toString();
    org.saxpath.XPathSyntaxException var13 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var14 = var13.getPositionMarker();
    java.lang.String var15 = var13.toString();
    org.saxpath.SAXPathException var16 = new org.saxpath.SAXPathException((java.lang.Throwable)var13);
    java.lang.String var17 = var13.getMultilineMessage();
    java.lang.String var18 = var13.getMultilineMessage();
    java.lang.String var19 = var13.toString();
    java.lang.String var20 = var13.getPositionMarker();
    java.lang.String var21 = var13.getPositionMarker();
    org.saxpath.XPathSyntaxException var25 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var26 = var25.getXPath();
    java.lang.String var27 = var25.getPositionMarker();
    int var28 = var25.getPosition();
    java.lang.Throwable[] var29 = var25.getSuppressed();
    int var30 = var25.getPosition();
    var13.addSuppressed((java.lang.Throwable)var25);
    java.lang.String var32 = var13.toString();
    int var33 = var13.getPosition();
    java.lang.String var34 = var13.toString();
    java.lang.String var35 = var13.toString();
    var1.addSuppressed((java.lang.Throwable)var13);
    int var37 = var13.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var9.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + " ^"+ "'", var20.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + " ^"+ "'", var21.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + " ^"+ "'", var27.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var32.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var34.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var35.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test441");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.String var12 = var3.getXPath();
    java.lang.String var13 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "                                                                                                    ^"+ "'", var11.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "                                                                                                    ^"+ "'", var13.equals("                                                                                                    ^"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test442");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endMultiplicativeExpr(10);
    var0.startCommentNodeStep(100);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test443");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endCommentNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.endFunction();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endCommentNodeStep()\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(6) endFunction()\n"+ "'", var12.equals("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endCommentNodeStep()\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(6) endFunction()\n"));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test444");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.startAllNodeStep(100);
    var0.endFunction();
    org.saxpath.conformance.ConformanceXPathHandler var10 = new org.saxpath.conformance.ConformanceXPathHandler();
    var10.startAbsoluteLocationPath();
    var10.endPathExpr();
    var10.endAbsoluteLocationPath();
    var10.endEqualityExpr(100);
    var10.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    var10.endAllNodeStep();
    var10.startCommentNodeStep(10);
    var10.number((-1.0d));
    boolean var24 = var0.equals((java.lang.Object)(-1.0d));
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test445");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) startAbsoluteLocationPath()\n(5) number(-1.0)\n(6) startEqualityExpr()\n(7) endAllNodeStep()\n", 0, "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n");

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test446");


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
    org.saxpath.XPathHandler var34 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var35 = new org.saxpath.helpers.DefaultXPathHandler();
    var35.number(10.0d);
    var35.endRelativeLocationPath();
    var35.startRelativeLocationPath();
    var35.endFilterExpr();
    var35.endXPath();
    var35.startUnionExpr();
    var35.endMultiplicativeExpr(100);
    var35.startMultiplicativeExpr();
    var35.number(1.0d);
    var35.startAdditiveExpr();
    var35.startOrExpr();
    var35.startAdditiveExpr();
    var35.startAllNodeStep(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test447");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.startEqualityExpr();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startFilterExpr();
    var0.endXPath();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test448");


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
    var0.startOrExpr();

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test449");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.startRelativeLocationPath();

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test450");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\n ^");

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test451");


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
    var0.startAbsoluteLocationPath();

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test452");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.startAllNodeStep(10);
    var0.endAllNodeStep();

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test453");


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
    var0.startNameStep(0, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.number(1.0d);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test454");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.endNameStep();
    var0.startRelationalExpr();
    var0.startRelationalExpr();
    var0.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test455");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test456");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endXPath();
    var0.startAndExpr();
    var0.startRelativeLocationPath();
    var0.startXPath();
    var0.endTextNodeStep();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endXPath()\n(4) startAndExpr()\n(5) startRelativeLocationPath()\n(6) startXPath()\n(7) endTextNodeStep()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endXPath()\n(4) startAndExpr()\n(5) startRelativeLocationPath()\n(6) startXPath()\n(7) endTextNodeStep()\n"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test457");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.startFilterExpr();
    var0.startAndExpr();
    var0.startRelativeLocationPath();

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test458");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startTextNodeStep(100);
    var0.endUnionExpr(false);
    var0.endMultiplicativeExpr(100);
    var0.startFilterExpr();
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endOrExpr(false)\n(9) endFunction()\n");

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test459");


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
    var31.endUnionExpr(true);
    var31.endXPath();
    var31.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test460");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endRelationalExpr(0)\n(8) endPredicate()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test461");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endNameStep();
    var0.endMultiplicativeExpr(100);
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr((-1));
    var0.variableReference("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    var0.startAbsoluteLocationPath();

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test462");


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
    var0.startPredicate();
    var0.endUnionExpr(false);
    var0.startUnionExpr();
    var0.endTextNodeStep();

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test463");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test464");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    java.lang.String var3 = var1.toString();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n"+ "'", var3.equals("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test465");


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
    var8.startXPath();
    var8.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test466");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.endCommentNodeStep();
    var0.startAllNodeStep((-1));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test467");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startAndExpr();
    var0.endPredicate();
    var0.endFunction();

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test468");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");
    var0.endFunction();
    var0.startRelativeLocationPath();

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test469");


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
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test470");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.endNameStep();

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test471");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startAllNodeStep((-1));
    var0.endEqualityExpr(10);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test472");


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
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test473");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var4 = var3.getPosition();
    int var5 = var3.getPosition();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var11 = var10.getMultilineMessage();
    int var12 = var10.getPosition();
    java.lang.String var13 = var10.getXPath();
    var3.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var15 = var3.toString();
    java.lang.String var16 = var3.getXPath();
    java.lang.Throwable[] var17 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "\n ^\n ^"+ "'", var11.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test474");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) startUnionExpr()\n(8) endRelativeLocationPath()\n(9) endOrExpr(false)\n");

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test475");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.endOrExpr(true);
    var0.endNameStep();

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test476");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.getPositionMarker();
    java.lang.String var13 = var3.toString();
    java.lang.Throwable[] var14 = var3.getSuppressed();
    
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
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test477");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.startOrExpr();
    var0.endRelationalExpr((-1));
    var0.endPredicate();
    var0.endAllNodeStep();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test478");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endProcessingInstructionNodeStep();
    var0.startPathExpr();
    var0.endAndExpr(true);
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n");

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test479");


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
    var0.endAdditiveExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test480");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.endUnaryExpr(1);
    var0.endRelativeLocationPath();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test481");


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
    var0.startTextNodeStep(1);
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(false);
    var0.startMultiplicativeExpr();

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test482");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.number(10.0d);
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test483");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.startUnaryExpr();
    var0.startXPath();
    var0.startTextNodeStep(10);
    var0.endFunction();

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test484");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep(100);
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathParseException: \nhi!\n^", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    var0.endAdditiveExpr(100);
    var0.endAdditiveExpr(10);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test485");


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
    var0.startXPath();
    var0.startTextNodeStep((-1));
    var0.endAbsoluteLocationPath();

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test486");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.XPathHandler var8 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    org.saxpath.XPathHandler var11 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endTextNodeStep();
    var12.endAdditiveExpr(1);
    java.lang.String var17 = var12.toString();
    var12.startMultiplicativeExpr();
    var12.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var12.startAllNodeStep((-1));
    var12.endCommentNodeStep();
    var12.endAdditiveExpr(1);
    var12.startAndExpr();
    var12.startPredicate();
    var12.startCommentNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var12);
    org.saxpath.XPathHandler var32 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test487");


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
    var7.startAdditiveExpr();
    var7.endRelationalExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test488");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.endAllNodeStep();
    var0.endUnaryExpr(100);
    var0.endXPath();
    var0.startRelationalExpr();
    var0.number(0);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test489");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startMultiplicativeExpr();

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test490");


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
    var13.startXPath();
    var13.endFunction();
    var13.endOrExpr(true);
    var13.startAndExpr();
    var13.startNameStep(0, "(0) endAllNodeStep()\n(1) endAbsoluteLocationPath()\n(2) startXPath()\n(3) endFilterExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^:(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\")\n(5) endOrExpr(false)\n(6) startPathExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endAndExpr(true)\n(6) startPredicate()\n(7) endAndExpr(true)\n(8) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test491");


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
    var0.endAndExpr(false);
    var0.endFilterExpr();

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test492");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(1);
    var0.endAndExpr(false);
    var0.endFilterExpr();

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test493");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endAndExpr(true);
    boolean var16 = var11.equals((java.lang.Object)'a');
    var11.startAbsoluteLocationPath();
    var11.endMultiplicativeExpr((-1));
    var11.endEqualityExpr((-1));
    var11.startAbsoluteLocationPath();
    var11.startTextNodeStep(10);
    var11.startAndExpr();
    var11.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.startAbsoluteLocationPath();
    var27.endAndExpr(true);
    boolean var32 = var27.equals((java.lang.Object)'a');
    java.lang.String var33 = var27.toString();
    var27.startXPath();
    var27.endAllNodeStep();
    var27.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var27.number(100.0d);
    var27.endMultiplicativeExpr((-1));
    var27.endPathExpr();
    var27.startNameStep((-1), "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    boolean var48 = var11.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    var11.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var33.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test494");


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
    var0.endAdditiveExpr(10);
    var0.endUnionExpr(true);
    var0.startUnionExpr();

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test495");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFunction("org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.number(0);
    var0.variableReference("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startMultiplicativeExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startPathExpr()\n");

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test496");


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
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) startOrExpr()\n(5) endUnionExpr(true)\n(6) number(10.0)\n");
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test497");


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
    var0.number(1.0d);
    var0.endMultiplicativeExpr(0);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test498");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startTextNodeStep(100);
    var0.startUnionExpr();
    var0.startAndExpr();
    var0.startAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.number(100.0d);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test499");


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
    var9.endUnaryExpr(0);
    var9.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var9.endMultiplicativeExpr(0);
    var9.startXPath();
    org.saxpath.conformance.ConformanceXPathHandler var33 = new org.saxpath.conformance.ConformanceXPathHandler();
    var33.startAbsoluteLocationPath();
    var33.endAndExpr(true);
    boolean var38 = var33.equals((java.lang.Object)'a');
    var33.startAbsoluteLocationPath();
    var33.endMultiplicativeExpr((-1));
    var33.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var33.startAndExpr();
    var33.endUnaryExpr(0);
    var33.startXPath();
    var33.startFilterExpr();
    boolean var49 = var9.equals((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest28.test500");


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
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

}
