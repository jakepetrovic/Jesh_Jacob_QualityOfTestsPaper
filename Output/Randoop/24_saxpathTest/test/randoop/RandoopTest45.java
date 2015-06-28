package randoop;

import junit.framework.*;

public class RandoopTest45 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test1");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endFunction();
    var0.startAndExpr();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.startXPath();
    var0.endXPath();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test2");


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
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.startPathExpr();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test3");


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
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test4");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.endUnaryExpr(1);
    var0.startUnaryExpr();
    var0.startCommentNodeStep((-1));
    var0.endUnaryExpr(100);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test5");


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
    var17.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test6");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endAdditiveExpr((-1));
    var0.startPredicate();
    var0.startAllNodeStep(1);
    var0.endUnaryExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test7");


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
    var33.startTextNodeStep(1);
    var33.endCommentNodeStep();
    var33.startAbsoluteLocationPath();
    var33.startRelativeLocationPath();
    var33.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test8");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test9");


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
    var0.endNameStep();
    var0.startCommentNodeStep(10);
    var0.startOrExpr();

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test10");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", 0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n(5) endPredicate()\n(6) number(100.0)\n(7) startUnaryExpr()\n(8) endCommentNodeStep()\n");
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n(5) endPredicate()\n(6) number(100.0)\n(7) startUnaryExpr()\n(8) endCommentNodeStep()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n(5) endPredicate()\n(6) number(100.0)\n(7) startUnaryExpr()\n(8) endCommentNodeStep()\n"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test11");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endNameStep();
    var0.startEqualityExpr();
    java.lang.String var13 = var0.toString();
    var0.endEqualityExpr((-1));
    var0.startRelationalExpr();
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test12");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test13");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endUnaryExpr(10);
    var0.startAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.startPathExpr();
    var0.startFilterExpr();

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test14");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.literal("child");
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) endProcessingInstructionNodeStep()\n(7) endAllNodeStep()\n(8) endMultiplicativeExpr(-1)\n(9) startOrExpr()\n(10) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) startAllNodeStep(10)\n(7) startRelativeLocationPath()\n(8) startAllNodeStep(100)\n");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test15");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var16 = var15.getXPath();
    var11.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var18 = var15.toString();
    var3.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var20 = var15.getSuppressed();
    int var21 = var15.getPosition();
    int var22 = var15.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test16");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startEqualityExpr();
    var0.endUnionExpr(true);
    var0.endProcessingInstructionNodeStep();
    var0.endFilterExpr();
    var0.startFilterExpr();

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test17");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.startPathExpr();
    var0.endAndExpr(true);
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.startXPath();

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test18");


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
    var0.literal("org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.number(10);
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test19");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) endPredicate()\n(4) endProcessingInstructionNodeStep()\n(5) startAdditiveExpr()\n(6) startFilterExpr()\n");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    java.lang.Throwable[] var3 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test20");


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
    var15.endNameStep();
    var15.startTextNodeStep(1);
    var15.endNameStep();
    var15.startTextNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test21");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startEqualityExpr();

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test22");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.endEqualityExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);
    var0.startFilterExpr();

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test23");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n");
    var0.endNameStep();
    var0.endAndExpr(false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test24");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getPositionMarker();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getPositionMarker();
    int var11 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test25");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    boolean var6 = var0.equals((java.lang.Object)"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.number(100.0d);
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test26");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.startTextNodeStep(100);
    var0.endCommentNodeStep();
    var0.endOrExpr(false);
    var0.number(0);
    var0.endFilterExpr();

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test27");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.endRelationalExpr(0);
    var0.startFilterExpr();
    var0.endXPath();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test28");


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
    var8.endOrExpr(false);
    var8.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test29");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endAndExpr(true);
    var0.startAdditiveExpr();
    var0.startRelativeLocationPath();

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test30");


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
    var0.endFilterExpr();

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test31");


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
    var0.startAllNodeStep(0);
    var0.endAllNodeStep();
    var0.endRelationalExpr(1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test32");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.endUnionExpr(false);
    var0.endRelationalExpr(10);
    var0.endAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test33");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.startXPath();
    var0.startOrExpr();
    var0.startPredicate();
    var0.endAndExpr(false);
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.number(1.0d);
    var0.startRelativeLocationPath();
    var0.endUnionExpr(false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test34");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAndExpr();
    var0.startPathExpr();
    var0.endUnaryExpr((-1));
    var0.endCommentNodeStep();
    var0.startTextNodeStep(1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test35");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelationalExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test36");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endUnaryExpr((-1));
    var0.endOrExpr(false);
    org.saxpath.helpers.DefaultXPathHandler var5 = new org.saxpath.helpers.DefaultXPathHandler();
    var5.number(10.0d);
    var5.endRelativeLocationPath();
    var5.number(10);
    var5.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var5.literal("org.saxpath.SAXPathException:  ^");
    var5.startOrExpr();
    boolean var17 = var0.equals((java.lang.Object)var5);
    var0.endTextNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test37");


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
    var0.startAdditiveExpr();

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test38");


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
    var0.parse("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    org.saxpath.XPathHandler var28 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var29 = new org.saxpath.helpers.DefaultXPathHandler();
    var29.number(10.0d);
    var29.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var29.startAdditiveExpr();
    var29.endXPath();
    var29.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var29.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var29.endXPath();
    var29.startTextNodeStep(1);
    var29.startAllNodeStep(0);
    var29.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var29);
    org.saxpath.helpers.DefaultXPathHandler var49 = new org.saxpath.helpers.DefaultXPathHandler();
    var49.number(10.0d);
    var49.endRelativeLocationPath();
    var49.number(10);
    var49.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var49.startUnionExpr();
    var49.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var49.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "^");
    var49.endEqualityExpr(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var49);
    var49.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test39");


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
    var18.number((-1.0d));
    var18.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test40");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.endOrExpr(false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test41");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", 10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var9 = var8.getPositionMarker();
    org.saxpath.SAXPathParseException var11 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    org.saxpath.SAXPathException var12 = new org.saxpath.SAXPathException((java.lang.Throwable)var11);
    var8.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var14 = var11.toString();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var11);
    var4.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var17 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var14.equals("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test42");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test43");


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
    var0.startEqualityExpr();
    org.saxpath.conformance.ConformanceXPathHandler var37 = new org.saxpath.conformance.ConformanceXPathHandler();
    var37.startAbsoluteLocationPath();
    var37.endAndExpr(true);
    boolean var42 = var37.equals((java.lang.Object)'a');
    java.lang.String var43 = var37.toString();
    var37.startPathExpr();
    var37.startAndExpr();
    var37.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var37.startXPath();
    boolean var50 = var0.equals((java.lang.Object)var37);
    java.lang.String var51 = var0.toString();
    var0.endNameStep();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var43.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) startProcessingInstructionNodeStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(8) endOrExpr(true)\n(9) startEqualityExpr()\n"+ "'", var51.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n(7) startProcessingInstructionNodeStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(8) endOrExpr(true)\n(9) startEqualityExpr()\n"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test44");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endUnaryExpr(10);
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endPathExpr();
    var12.startUnionExpr();
    var12.startEqualityExpr();
    var12.startFilterExpr();
    var12.startUnionExpr();
    var12.startAllNodeStep(1);
    org.saxpath.conformance.ConformanceXPathHandler var21 = new org.saxpath.conformance.ConformanceXPathHandler();
    var21.startAbsoluteLocationPath();
    var21.startNameStep(100, " ^", " ^");
    var21.endUnionExpr(false);
    boolean var29 = var12.equals((java.lang.Object)var21);
    var12.endAbsoluteLocationPath();
    boolean var31 = var0.equals((java.lang.Object)var12);
    var12.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test45");


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
    var7.endRelativeLocationPath();
    var7.number(100);
    var7.startRelationalExpr();
    var7.endRelationalExpr(10);
    var7.startPathExpr();
    var7.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test46");


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
    var0.number((-1.0d));
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAdditiveExpr()\n(10) startAndExpr()\n(11) variableReference(\"org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n\")\n(12) startNameStep(100, \" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\", \"org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\")\n(13) startAndExpr()\n", "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\n ^");
    var0.startAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test47");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.endMultiplicativeExpr(0);
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.endEqualityExpr(10);
    var0.number(10);
    var0.startTextNodeStep(1);
    var0.endXPath();
    var0.startAbsoluteLocationPath();
    var0.endPredicate();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test48");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException(" ^");
    java.lang.Throwable[] var8 = var7.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var7);
    org.saxpath.XPathSyntaxException var13 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n", 0, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");
    java.lang.String var14 = var13.getPositionMarker();
    var7.addSuppressed((java.lang.Throwable)var13);
    java.lang.Throwable[] var16 = var13.getSuppressed();
    java.lang.Throwable[] var17 = var13.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "^"+ "'", var14.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test49");


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
    var0.startPredicate();
    var0.startEqualityExpr();
    var0.number(1);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test50");


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
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test51");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.endPathExpr();
    var0.endRelationalExpr((-1));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test52");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr(1);
    var0.endRelationalExpr((-1));
    var0.endRelativeLocationPath();
    var0.startMultiplicativeExpr();

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test53");


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
    var7.endMultiplicativeExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test54");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var14 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.getPositionMarker();
    var10.addSuppressed((java.lang.Throwable)var14);
    java.lang.Throwable[] var18 = var14.getSuppressed();
    int var19 = var14.getPosition();
    java.lang.String var20 = var14.getXPath();
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException((java.lang.Throwable)var14);
    java.lang.String var22 = var14.toString();
    var3.addSuppressed((java.lang.Throwable)var14);
    java.lang.String var24 = var3.getMultilineMessage();
    java.lang.String var25 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var15.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test55");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\n ^", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\n ^\n^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\n ^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test56");


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
    var0.endPredicate();
    var0.endUnionExpr(false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test57");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getXPath();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getXPath();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    java.lang.String var9 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test58");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n");
    var0.startPathExpr();

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test59");


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
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test60");


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
    var7.endRelationalExpr(1);
    var7.endRelationalExpr(100);
    var7.startRelationalExpr();
    var7.endRelativeLocationPath();
    var7.endUnaryExpr((-1));
    var7.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test61");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.endEqualityExpr(1);
    var0.startCommentNodeStep(0);
    var0.endPathExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(100);
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startAllNodeStep(0);
    var0.endXPath();

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test62");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test63");


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
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var18.startAdditiveExpr();
    var18.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var18.startFilterExpr();
    boolean var29 = var0.equals((java.lang.Object)var18);
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test64");


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
    var7.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var7.startOrExpr();
    var7.startEqualityExpr();
    var7.endRelationalExpr(1);
    var7.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test65");


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
    var0.endPredicate();
    var0.startFilterExpr();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test66");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.endFilterExpr();
    var0.startRelativeLocationPath();
    var0.startMultiplicativeExpr();

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test67");


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
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.startTextNodeStep(1);
    var0.startProcessingInstructionNodeStep((-1), "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) endEqualityExpr(1)\n(5) endFilterExpr()\n(6) startEqualityExpr()\n");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test68");


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
    var0.number((-1));
    var0.endAdditiveExpr(100);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test69");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();
    var0.startRelationalExpr();
    var0.startPredicate();
    var0.endXPath();
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test70");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAdditiveExpr();
    var0.startNameStep(100, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var0.startAdditiveExpr();
    var0.endMultiplicativeExpr((-1));
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) endUnionExpr(false)\n(5) endRelativeLocationPath()\n(6) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\")\n(7) endXPath()\n(8) startAndExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n");

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test71");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.startPathExpr();
    var0.startAllNodeStep(100);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) endRelativeLocationPath()\n(7) endXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endFilterExpr()\n(3) endEqualityExpr(10)\n(4) startAbsoluteLocationPath()\n");

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test72");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.XPathHandler var10 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    org.saxpath.conformance.ConformanceXPathHandler var13 = new org.saxpath.conformance.ConformanceXPathHandler();
    var13.startAbsoluteLocationPath();
    var13.endUnaryExpr(10);
    var13.number(1);
    var13.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var13.endFilterExpr();
    var13.startCommentNodeStep(0);
    var13.endCommentNodeStep();
    java.lang.String var26 = var13.toString();
    var13.endPathExpr();
    var13.startOrExpr();
    var13.endTextNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var13);
    org.saxpath.helpers.DefaultXPathHandler var31 = new org.saxpath.helpers.DefaultXPathHandler();
    var31.number(10.0d);
    var31.endRelativeLocationPath();
    var31.startRelativeLocationPath();
    var31.endFilterExpr();
    var31.endXPath();
    var31.startUnionExpr();
    var31.endPredicate();
    var31.startPathExpr();
    var31.startAllNodeStep((-1));
    var31.endAdditiveExpr((-1));
    var31.endCommentNodeStep();
    var31.endPathExpr();
    var31.endAndExpr(false);
    var31.endOrExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    var31.endAdditiveExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test73");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.XPathHandler var7 = var0.getXPathHandler();
    org.saxpath.XPathHandler var8 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var11 = new org.saxpath.helpers.DefaultXPathHandler();
    var11.number(10.0d);
    var11.endPathExpr();
    var11.startOrExpr();
    var11.endProcessingInstructionNodeStep();
    var11.startAbsoluteLocationPath();
    var11.startOrExpr();
    var11.startRelationalExpr();
    var11.startAllNodeStep(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var11);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    org.saxpath.helpers.DefaultXPathHandler var25 = new org.saxpath.helpers.DefaultXPathHandler();
    var25.number(10.0d);
    var25.endRelativeLocationPath();
    var25.startRelativeLocationPath();
    var25.endFilterExpr();
    var25.endXPath();
    var25.startUnionExpr();
    var25.endMultiplicativeExpr(100);
    var25.startMultiplicativeExpr();
    var25.number(1.0d);
    var25.endOrExpr(false);
    var25.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var25);
    var25.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test74");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.startTextNodeStep(10);
    var0.endRelativeLocationPath();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.endNameStep();
    var0.startPredicate();

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test75");


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
    var0.startEqualityExpr();
    java.lang.String var20 = var0.toString();
    var0.endFilterExpr();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endUnionExpr(false)\n(8) startNameStep(-1, \"                                                                                                    ^\", \"\n ^\n ^\")\n(9) endAllNodeStep()\n(10) startEqualityExpr()\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endUnionExpr(false)\n(8) startNameStep(-1, \"                                                                                                    ^\", \"\n ^\n ^\")\n(9) endAllNodeStep()\n(10) startEqualityExpr()\n"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test76");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 1, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test77");


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
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.endAndExpr(true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test78");


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
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(0);
    var0.endFunction();

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test79");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.getMultilineMessage();
    java.lang.String var10 = var3.getXPath();
    java.lang.String var11 = var3.getPositionMarker();
    int var12 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test80");


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
    var0.startFilterExpr();
    var0.startOrExpr();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test81");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.endFilterExpr();
    var0.startXPath();

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test82");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endXPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startAllNodeStep((-1));
    var0.number(0.0d);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test83");


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
    var0.startAndExpr();

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test84");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endNameStep();

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test85");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endRelationalExpr((-1));
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var0.endPredicate();

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test86");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endPredicate();
    var0.startPathExpr();
    var0.endRelationalExpr(1);
    var0.startAdditiveExpr();
    var0.number(0.0d);
    var0.endAdditiveExpr(1);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test87");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.endAllNodeStep();
    var0.endMultiplicativeExpr(100);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test88");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.startPredicate();
    var0.endEqualityExpr(10);
    var0.endXPath();
    var0.endAbsoluteLocationPath();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test89");


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
    var0.endOrExpr(false);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n\")\n(6) startPredicate()\n(7) startRelativeLocationPath()\n(8) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n\", \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: hi!\")\n(9) number(1.0)\n(10) endUnaryExpr(100)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startAbsoluteLocationPath()\n(5) startAdditiveExpr()\n(6) startAbsoluteLocationPath()\n(7) startXPath()\n");
    var0.startNameStep(10, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n\n                                                                                                    ^", "^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test90");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test91");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(10);
    var0.endPredicate();
    var0.endUnionExpr(false);
    var0.endPathExpr();

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test92");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();
    var0.startRelationalExpr();
    var0.startPredicate();
    var0.endXPath();
    var0.endUnionExpr(true);
    var0.startAbsoluteLocationPath();

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test93");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.startPathExpr();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test94");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.number(10.0d);
    var0.endProcessingInstructionNodeStep();
    var0.startAdditiveExpr();
    var0.startFunction("          ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) endPredicate()\n(3) endCommentNodeStep()\n(4) startAbsoluteLocationPath()\n(5) startFilterExpr()\n");

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test95");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(10);
    var0.endAndExpr(true);
    var0.startUnionExpr();
    var0.endNameStep();

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test96");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endFunction();
    var0.startPredicate();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endTextNodeStep()\n(7) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFunction();

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test97");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endUnionExpr(false);
    var0.startXPath();
    var0.startAndExpr();

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test98");


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
    var0.endPredicate();
    var0.startOrExpr();

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test99");


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
    var0.number(10);
    var0.endAdditiveExpr(100);
    var0.endUnaryExpr((-1));
    var0.endFunction();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");
    var0.endAbsoluteLocationPath();
    var0.endFunction();
    var0.endMultiplicativeExpr((-1));
    var0.startPathExpr();
    var0.endMultiplicativeExpr(10);
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test100");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.number(100);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", " ^");
    var0.startEqualityExpr();

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test101");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endPredicate();
    var0.endRelationalExpr((-1));
    var0.startCommentNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test102");


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
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endTextNodeStep();

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test103");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test104");


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
    var0.endProcessingInstructionNodeStep();
    java.lang.String var14 = var0.toString();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n(7) endTextNodeStep()\n(8) endProcessingInstructionNodeStep()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n(7) endTextNodeStep()\n(8) endProcessingInstructionNodeStep()\n"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test105");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.endNameStep();
    var0.startTextNodeStep(1);
    var0.endAdditiveExpr(100);
    var0.startXPath();

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test106");


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
    var0.endAndExpr(false);
    var0.endRelativeLocationPath();
    var0.startUnionExpr();
    var0.endAndExpr(false);
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 100:  ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test107");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.startUnaryExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n\norg.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n\n ^");

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test108");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startPathExpr();
    var0.endAdditiveExpr(0);
    var0.endAndExpr(true);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.startAdditiveExpr();

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test109");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startUnaryExpr();

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test110");


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
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");
    var0.number(0.0d);
    var0.endUnionExpr(true);
    var0.startAdditiveExpr();
    var0.startPathExpr();

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test111");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.number((-1));
    var0.endAbsoluteLocationPath();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test112");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.endUnionExpr(true);
    var0.endMultiplicativeExpr(1);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test113");


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
    var0.startOrExpr();

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test114");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endAndExpr(false);
    var0.endEqualityExpr(0);
    var0.number(100);
    var0.startXPath();

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test115");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n");
    org.saxpath.XPathHandler var59 = var0.getXPathHandler();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test116");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startAdditiveExpr()\n(5) startEqualityExpr()\n(6) startRelationalExpr()\n(7) endCommentNodeStep()\n(8) endFilterExpr()\n(9) number(-1.0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test117");


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
    var8.startPathExpr();
    var8.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n"+ "'", var27.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test118");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(10);
    var0.endAllNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.literal("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endXPath();
    var0.endRelationalExpr(10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test119");


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
    var20.startUnionExpr();
    var20.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test120");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getXPath();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.getMultilineMessage();
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test121");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    var0.startTextNodeStep(100);
    var0.startCommentNodeStep(0);
    var0.startUnaryExpr();
    var0.startFilterExpr();

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test122");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.getXPath();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.getPositionMarker();
    java.lang.String var9 = var3.getMultilineMessage();
    java.lang.String var10 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test123");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test124");


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
    var0.endUnaryExpr(10);
    var0.startAllNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test125");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: ", 1, "com.werken.saxpath.XPathSyntaxException: 10: ^");
    var1.addSuppressed((java.lang.Throwable)var5);
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var11 = var10.getSuppressed();
    java.lang.String var12 = var10.getMultilineMessage();
    java.lang.String var13 = var10.getMultilineMessage();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var10);
    java.lang.String var15 = var10.getMultilineMessage();
    org.saxpath.SAXPathException var16 = new org.saxpath.SAXPathException((java.lang.Throwable)var10);
    var1.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var18 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test126");


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
    var15.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test127");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.endXPath();
    var0.startPathExpr();

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test128");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.endCommentNodeStep();
    var0.startEqualityExpr();
    var0.endRelationalExpr(1);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test129");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startOrExpr();
    var0.startRelationalExpr();
    var0.startAndExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n");

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test130");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();
    var0.startCommentNodeStep((-1));
    var0.endAdditiveExpr((-1));
    var0.startUnionExpr();
    var0.startAdditiveExpr();

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test131");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getMultilineMessage();
    java.lang.String var11 = var3.getXPath();
    int var12 = var3.getPosition();
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var14 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\n ^\n ^"+ "'", var10.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test132");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var0.startPredicate();
    var0.endCommentNodeStep();
    var0.startAndExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n(8) startProcessingInstructionNodeStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: hi!\")\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test133");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n(4) number(0)\n(5) number(1.0)\n(6) endPredicate()\n");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test134");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(false);
    var0.startEqualityExpr();

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test135");


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
    var0.endXPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.endCommentNodeStep();
    var0.endXPath();
    var0.endXPath();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test136");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n");

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test137");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep((-1));
    var0.startPredicate();
    var0.startPredicate();
    var0.endXPath();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test138");


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
    var0.endAndExpr(true);
    var0.startEqualityExpr();
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test139");


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
    var0.endEqualityExpr((-1));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test140");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.startEqualityExpr();
    var0.endTextNodeStep();
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^");
    var0.variableReference("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    var0.endMultiplicativeExpr(0);
    var0.startAllNodeStep(0);
    var0.endProcessingInstructionNodeStep();

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test141");


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
    var0.endUnionExpr(false);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endXPath()\n(4) startAndExpr()\n(5) startRelativeLocationPath()\n(6) startXPath()\n(7) endTextNodeStep()\n");
    var0.variableReference("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test142");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.startRelationalExpr();
    var0.endUnionExpr(false);
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.startCommentNodeStep(1);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test143");


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
    var0.endUnaryExpr(100);
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test144");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: ^", "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n");
    var0.endFunction();
    var0.endFunction();
    var0.startAdditiveExpr();
    java.lang.String var12 = var0.toString();
    var0.startCommentNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) endFilterExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: ^:(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\")\n(5) endFunction()\n(6) endFunction()\n(7) startAdditiveExpr()\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) endFilterExpr()\n(4) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: ^:(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\")\n(5) endFunction()\n(6) endFunction()\n(7) startAdditiveExpr()\n"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test145");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startNameStep(0, "", "");
    var0.endFilterExpr();
    var0.endEqualityExpr((-1));
    var0.endUnaryExpr((-1));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test146");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startAndExpr();
    var0.startRelationalExpr();
    var0.endTextNodeStep();

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test147");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startAllNodeStep(1);
    var0.endRelationalExpr(0);
    var0.startMultiplicativeExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) startAbsoluteLocationPath()\n(5) number(-1.0)\n(6) startEqualityExpr()\n(7) endAllNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n");
    var0.startPathExpr();
    var0.endAdditiveExpr(10);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test148");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    var0.number((-1.0d));
    var0.endAbsoluteLocationPath();

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test149");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endPredicate();
    var0.endAndExpr(false);
    var0.endMultiplicativeExpr(100);
    var0.number(100.0d);
    var0.startRelationalExpr();

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test150");


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
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var0.endXPath();
    var0.endUnionExpr(false);
    var0.startUnionExpr();

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test151");


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
    var9.startRelativeLocationPath();
    var9.startAbsoluteLocationPath();
    var9.endEqualityExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test152");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n", (-1), "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var5 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endFunction()\n(8) endAllNodeStep()\n(9) endAbsoluteLocationPath()\n(10) endAndExpr(true)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test154");


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
    java.lang.String var14 = var0.toString();
    var0.startPredicate();
    var0.endEqualityExpr((-1));
    var0.startPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startMultiplicativeExpr()\n(5) startFilterExpr()\n(6) startAndExpr()\n(7) startTextNodeStep(100)\n(8) startUnionExpr()\n(9) endUnaryExpr(0)\n(10) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startXPath()\n(7) startMultiplicativeExpr()\n(8) endCommentNodeStep()\n(9) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test155");


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
    var7.number(10);
    var7.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) startXPath()\n");
    var7.endMultiplicativeExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test156");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "org.saxpath.SAXPathException: ");
    var0.endUnionExpr(true);
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endFunction();

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test157");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endFunction();
    var0.endXPath();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endProcessingInstructionNodeStep();
    var0.endRelationalExpr((-1));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test158");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.startAllNodeStep((-1));
    var0.startEqualityExpr();
    var0.number(1);
    var0.startOrExpr();

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test159");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.endMultiplicativeExpr(0);
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.endEqualityExpr(10);
    var0.number(10);
    var0.startAllNodeStep((-1));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test160");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) endProcessingInstructionNodeStep()\n(7) endAllNodeStep()\n(8) endMultiplicativeExpr(-1)\n(9) startOrExpr()\n(10) startAdditiveExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test161");


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
    org.saxpath.helpers.DefaultXPathHandler var17 = new org.saxpath.helpers.DefaultXPathHandler();
    var17.number(10.0d);
    var17.endRelativeLocationPath();
    var17.number(10);
    var17.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var17.literal("org.saxpath.SAXPathException:  ^");
    var17.startOrExpr();
    var17.endUnionExpr(false);
    boolean var31 = var0.equals((java.lang.Object)var17);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAbsoluteLocationPath()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test162");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.endAbsoluteLocationPath();
    var0.endTextNodeStep();

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test163");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\n ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test164");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) endEqualityExpr(1)\n(10) endFilterExpr()\n(11) startPathExpr()\n", 100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) startAbsoluteLocationPath()\n");

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test165");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startOrExpr();
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();
    var0.endOrExpr(true);
    var0.endAbsoluteLocationPath();
    var0.endFunction();
    var0.startAllNodeStep(0);
    var0.endEqualityExpr((-1));
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.number(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test166");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getPosition();
    int var8 = var3.getPosition();
    int var9 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test167");


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
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.number(1.0d);
    java.lang.String var23 = var0.toString();
    var0.startXPath();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) endCommentNodeStep()\n(7) number(10)\n(8) endPathExpr()\n(9) endProcessingInstructionNodeStep()\n(10) startAdditiveExpr()\n(11) startUnaryExpr()\n(12) startAdditiveExpr()\n(13) number(1.0)\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) endCommentNodeStep()\n(7) number(10)\n(8) endPathExpr()\n(9) endProcessingInstructionNodeStep()\n(10) startAdditiveExpr()\n(11) startUnaryExpr()\n(12) startAdditiveExpr()\n(13) number(1.0)\n"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test168");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep((-1));
    var0.endPathExpr();
    var0.startPathExpr();
    org.saxpath.XPathSyntaxException var17 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    java.lang.String var18 = var17.toString();
    boolean var19 = var0.equals((java.lang.Object)var18);
    var0.endUnaryExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test169");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endFunction()\n(8) startEqualityExpr()\n(9) startTextNodeStep(100)\n(10) number(10.0)\n(11) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n\")\n");

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test170");


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
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test171");


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
    var7.startUnaryExpr();
    var7.startUnaryExpr();
    var7.endOrExpr(true);
    var7.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test172");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endNameStep();
    var0.endAndExpr(false);
    var0.endCommentNodeStep();
    var0.endOrExpr(true);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test173");


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
    var0.startFilterExpr();
    java.lang.String var18 = var0.toString();
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) startMultiplicativeExpr()\n(9) startAndExpr()\n(10) startFilterExpr()\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) startMultiplicativeExpr()\n(9) startAndExpr()\n(10) startFilterExpr()\n"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test174");


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
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr(10);
    var0.endCommentNodeStep();
    var0.endCommentNodeStep();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test175");


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
    var9.endUnionExpr(true);
    var9.endAllNodeStep();
    var9.startCommentNodeStep(100);
    var9.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) startUnionExpr()\n(8) endTextNodeStep()\n(9) literal(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(10) startRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test176");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startXPath();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var7.endPredicate();
    var7.startAdditiveExpr();
    var7.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var7.endAllNodeStep();
    var7.endUnaryExpr(0);
    boolean var21 = var0.equals((java.lang.Object)0);
    var0.endAndExpr(true);
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test177");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFilterExpr();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startUnionExpr();
    var0.endAllNodeStep();
    var0.startMultiplicativeExpr();
    var0.startXPath();
    var0.endAbsoluteLocationPath();

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test178");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endRelativeLocationPath();
    var0.endAbsoluteLocationPath();

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test179");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startMultiplicativeExpr();
    var0.number(100.0d);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.startCommentNodeStep((-1));
    var0.startRelativeLocationPath();

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test180");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAdditiveExpr(0);
    var0.startPredicate();
    var0.endAllNodeStep();

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test181");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test182");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test183");


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
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test184");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 10, "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test185");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endRelationalExpr(100);
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test186");


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
    var19.endEqualityExpr((-1));
    var19.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test187");


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
    var0.startFunction("org.saxpath.SAXPathParseException: ", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n");
    var0.endNameStep();
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test188");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endFilterExpr();
    var0.startXPath();
    var0.startFilterExpr();
    var0.endAndExpr(true);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test189");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endRelationalExpr(0);
    var0.startTextNodeStep(1);
    var0.endMultiplicativeExpr(10);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test190");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.startTextNodeStep(1);
    var0.startPredicate();

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test191");


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
    var0.endPredicate();
    var0.endEqualityExpr(1);
    var0.startCommentNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test192");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endCommentNodeStep();
    var0.startFilterExpr();
    var0.endFunction();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) endAdditiveExpr(10)\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n");

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test193");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endAllNodeStep();

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test194");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.startAllNodeStep(10);
    var0.endCommentNodeStep();

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test195");


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
    var15.startXPath();
    var15.startOrExpr();
    var15.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test196");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startOrExpr();
    var0.endAdditiveExpr(10);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n^", "          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test197");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startPathExpr();
    var0.startTextNodeStep(10);
    var0.startXPath();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^");

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test198");


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
    org.saxpath.XPathHandler var23 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n");
    org.saxpath.helpers.DefaultXPathHandler var26 = new org.saxpath.helpers.DefaultXPathHandler();
    var26.number(10.0d);
    var26.endRelativeLocationPath();
    var26.startRelativeLocationPath();
    var26.endFilterExpr();
    var26.endXPath();
    var26.startUnionExpr();
    var26.startXPath();
    var26.endPredicate();
    var26.startProcessingInstructionNodeStep(10, "          ^");
    var26.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var26);
    org.saxpath.conformance.ConformanceXPathHandler var41 = new org.saxpath.conformance.ConformanceXPathHandler();
    var41.startAbsoluteLocationPath();
    var41.endAndExpr(true);
    var41.endPathExpr();
    var41.endTextNodeStep();
    var41.startUnaryExpr();
    var41.endUnionExpr(true);
    var41.startProcessingInstructionNodeStep(100, "hi!");
    var41.number((-1.0d));
    var41.endXPath();
    var41.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var41);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) endMultiplicativeExpr(1)\n(7) endOrExpr(false)\n");
    org.saxpath.conformance.ConformanceXPathHandler var61 = new org.saxpath.conformance.ConformanceXPathHandler();
    var61.startAbsoluteLocationPath();
    var61.endEqualityExpr((-1));
    var61.endTextNodeStep();
    var61.endCommentNodeStep();
    var61.endRelativeLocationPath();
    boolean var69 = var61.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var61.endMultiplicativeExpr((-1));
    var61.endNameStep();
    var61.endCommentNodeStep();
    org.saxpath.conformance.ConformanceXPathHandler var74 = new org.saxpath.conformance.ConformanceXPathHandler();
    var74.startAbsoluteLocationPath();
    var74.endAndExpr(true);
    var74.endPathExpr();
    var74.endTextNodeStep();
    var74.startUnaryExpr();
    var74.endUnionExpr(true);
    var74.startProcessingInstructionNodeStep(100, "hi!");
    boolean var86 = var61.equals((java.lang.Object)var74);
    var74.endPredicate();
    var74.startPathExpr();
    var74.startXPath();
    var74.startAdditiveExpr();
    var74.startUnaryExpr();
    var74.endAbsoluteLocationPath();
    var74.endUnionExpr(true);
    var74.literal("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test199");


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
    var0.endRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startTextNodeStep((-1));
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) startProcessingInstructionNodeStep(0, \"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test200");


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
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) number(-1)\n(7) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.endRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^");

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test201");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startXPath();
    var0.startTextNodeStep(1);
    var0.endPathExpr();

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test202");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.endRelationalExpr(0);
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endRelativeLocationPath();

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test203");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.startOrExpr();
    var0.startRelativeLocationPath();

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test204");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endTextNodeStep();
    var0.startAdditiveExpr();
    var0.variableReference("(0) startRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
    var0.endOrExpr(true);
    var0.endRelationalExpr((-1));
    var0.endEqualityExpr(10);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) endAdditiveExpr(10)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\n ^");

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test205");


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
    var0.startXPath();
    var0.startAllNodeStep(1);
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test206");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) endRelativeLocationPath()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test207");


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
    org.saxpath.XPathHandler var34 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var35 = new org.saxpath.conformance.ConformanceXPathHandler();
    var35.startRelativeLocationPath();
    var35.endOrExpr(false);
    var35.endNameStep();
    var35.startPathExpr();
    var35.startOrExpr();
    var35.endUnionExpr(true);
    var35.number(10.0d);
    java.lang.String var46 = var35.toString();
    org.saxpath.helpers.DefaultXPathHandler var47 = new org.saxpath.helpers.DefaultXPathHandler();
    var47.number(10.0d);
    var47.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var47.startAdditiveExpr();
    var47.endXPath();
    var47.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var47.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var47.endAdditiveExpr(10);
    var47.startUnionExpr();
    boolean var63 = var35.equals((java.lang.Object)var47);
    var0.setXPathHandler((org.saxpath.XPathHandler)var35);
    org.saxpath.conformance.ConformanceXPathHandler var65 = new org.saxpath.conformance.ConformanceXPathHandler();
    var65.startAbsoluteLocationPath();
    var65.endEqualityExpr((-1));
    var65.endTextNodeStep();
    var65.startAllNodeStep(0);
    var65.endOrExpr(false);
    var65.endAllNodeStep();
    var65.literal("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    var65.number(10);
    java.lang.String var79 = var65.toString();
    var0.setXPathHandler((org.saxpath.XPathHandler)var65);
    var65.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endAbsoluteLocationPath()\n(6) startProcessingInstructionNodeStep(100, \"(0) endAllNodeStep()\n(1) endTextNodeStep()\n\")\n(7) endTextNodeStep()\n(8) startXPath()\n(9) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^:org.saxpath.SAXPathException: child\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n(9) variableReference(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(10) endProcessingInstructionNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) startOrExpr()\n(5) endUnionExpr(true)\n(6) number(10.0)\n"+ "'", var46.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) startOrExpr()\n(5) endUnionExpr(true)\n(6) number(10.0)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endAllNodeStep()\n(6) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n(7) number(10)\n"+ "'", var79.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endAllNodeStep()\n(6) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n(7) number(10)\n"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test208");


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
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n");
    var0.endAndExpr(true);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.endUnionExpr(false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test209");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAdditiveExpr(1);
    var0.endUnaryExpr(100);
    var0.startAndExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test210");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endEqualityExpr(1);
    var0.startOrExpr();
    var0.startCommentNodeStep(100);
    var0.startCommentNodeStep(10);
    var0.startAbsoluteLocationPath();

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test211");


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
    var0.endTextNodeStep();

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test212");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endOrExpr(true);
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr(10);
    var0.startUnaryExpr();

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test213");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.number(10);
    var0.endXPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnaryExpr((-1));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test214");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n(6) startNameStep(100, \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \", \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \")\n(7) startOrExpr()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n          ^");

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test215");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endPredicate();
    var0.startTextNodeStep(0);
    var0.startFunction("namespace", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");
    var0.startTextNodeStep(100);
    var0.endUnaryExpr(0);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test216");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var3 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.toString();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var2.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test217");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.startXPath();
    var0.startCommentNodeStep(100);
    var0.endOrExpr(false);
    var0.endNameStep();

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test218");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endXPath();
    var0.startAndExpr();
    var0.startRelativeLocationPath();
    var0.startXPath();
    var0.startPredicate();

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test219");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    var0.endFilterExpr();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test220");


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
    var0.endFunction();
    var0.literal("          ^");
    var0.number(10);
    var0.endCommentNodeStep();
    var0.endAndExpr(true);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test221");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(false);
    var0.endPathExpr();
    var0.endNameStep();
    var0.endOrExpr(false);
    var0.startAbsoluteLocationPath();

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test222");


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
    var0.endRelationalExpr(1);
    var0.number(100.0d);
    var0.endUnaryExpr(100);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endRelationalExpr(1)\n(9) endMultiplicativeExpr(0)\n(10) endFunction()\n(11) startCommentNodeStep(-1)\n(12) endNameStep()\n(13) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) endAdditiveExpr(-1)\n(11) endAdditiveExpr(100)\n(12) endPathExpr()\n");
    var0.endTextNodeStep();
    var0.endRelationalExpr(10);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test223");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) endUnaryExpr(1)\n(6) number(-1.0)\n(7) endUnionExpr(false)\n(8) startNameStep(-1, \"                                                                                                    ^\", \"\n ^\n ^\")\n(9) endAllNodeStep()\n(10) startEqualityExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test224");


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
    var13.endEqualityExpr(0);
    var13.endCommentNodeStep();
    var13.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) number(10)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n\n          ^");
    var13.startProcessingInstructionNodeStep(1, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^");
    var13.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test225");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.endAllNodeStep();

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test226");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", 100, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getMultilineMessage();
    int var7 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "                                                                                                    ^"+ "'", var5.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n                                                                                                    ^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test227");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endRelationalExpr(1);
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startUnionExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    var0.endFilterExpr();
    var0.endRelationalExpr((-1));
    var0.endEqualityExpr(10);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test228");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endFilterExpr();
    var0.startOrExpr();
    var0.endPredicate();
    var0.startTextNodeStep(0);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test229");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(100, "hi!");
    var0.endAndExpr(false);
    var0.startCommentNodeStep((-1));
    var0.endRelativeLocationPath();
    var0.endPathExpr();
    var0.startRelationalExpr();
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAbsoluteLocationPath()\n(10) endMultiplicativeExpr(10)\n(11) endAndExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test230");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endFilterExpr();
    var0.endUnaryExpr(100);
    var0.endFunction();
    var0.endUnaryExpr(1);
    var0.endXPath();
    var0.startAllNodeStep(0);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test231");


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
    var0.startEqualityExpr();
    var0.startAndExpr();

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test232");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.endOrExpr(true);
    var0.endOrExpr(true);
    var0.startUnionExpr();
    var0.endEqualityExpr((-1));
    var0.endUnionExpr(false);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");
    var0.endRelationalExpr(100);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test233");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getPositionMarker();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    int var8 = var3.getPosition();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.toString();
    java.lang.String var18 = var16.getPositionMarker();
    var12.addSuppressed((java.lang.Throwable)var16);
    java.lang.String var20 = var12.toString();
    java.lang.String var21 = var12.toString();
    var3.addSuppressed((java.lang.Throwable)var12);
    java.lang.String var23 = var12.getMultilineMessage();
    java.lang.String var24 = var12.getPositionMarker();
    org.saxpath.XPathSyntaxException var28 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var29 = var28.getXPath();
    java.lang.String var30 = var28.getXPath();
    org.saxpath.SAXPathException var31 = new org.saxpath.SAXPathException((java.lang.Throwable)var28);
    java.lang.String var32 = var28.toString();
    org.saxpath.SAXPathException var33 = new org.saxpath.SAXPathException((java.lang.Throwable)var28);
    java.lang.String var34 = var28.getPositionMarker();
    var12.addSuppressed((java.lang.Throwable)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var20.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "+ "'", var21.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "org.saxpath.SAXPathParseException: \nhi!\n^"+ "'", var23.equals("org.saxpath.SAXPathParseException: \nhi!\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "^"+ "'", var24.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var29.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var32.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + " ^"+ "'", var34.equals(" ^"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test234");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endFunction()\n(8) startEqualityExpr()\n(9) startAndExpr()\n");

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test235");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.variableReference("(0) endAllNodeStep()\n(1) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n");
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endProcessingInstructionNodeStep()\n(4) startUnionExpr()\n(5) endOrExpr(true)\n(6) startPredicate()\n");
    var0.endProcessingInstructionNodeStep();

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test236");


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
    var0.endTextNodeStep();
    var0.startAndExpr();

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test237");


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
    var0.endPathExpr();
    var0.number(0.0d);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test238");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.endFilterExpr();
    var0.startCommentNodeStep(0);
    var0.endCommentNodeStep();
    com.werken.saxpath.XPathReader var13 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endTextNodeStep();
    var14.endUnionExpr(true);
    var13.setXPathHandler((org.saxpath.XPathHandler)var14);
    org.saxpath.XPathHandler var20 = var13.getXPathHandler();
    var13.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var13.parse("child\norg.saxpath.SAXPathException:  ^\n^");
    boolean var25 = var0.equals((java.lang.Object)var13);
    var0.endUnaryExpr(0);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test239");


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
    var0.startRelationalExpr();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test240");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.number(10.0d);
    var0.endProcessingInstructionNodeStep();
    var0.endEqualityExpr(0);
    var0.startUnaryExpr();

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test241");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startTextNodeStep(10);
    var0.startRelativeLocationPath();

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test242");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    org.saxpath.XPathSyntaxException var6 = new org.saxpath.XPathSyntaxException("hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", (-1), "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var1.addSuppressed((java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test243");


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
    var0.startUnionExpr();
    var0.startOrExpr();

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test244");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endFunction();
    var0.startTextNodeStep(1);
    var0.startPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^");
    var0.endNameStep();
    var0.endCommentNodeStep();

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test245");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startAndExpr();
    var0.startUnionExpr();
    var0.endCommentNodeStep();
    var0.startTextNodeStep((-1));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test246");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.startAllNodeStep(0);
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();
    var0.startPathExpr();
    var0.endRelativeLocationPath();
    var0.number(10);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test247");


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
    var0.endFunction();

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test248");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startProcessingInstructionNodeStep(1, " ^");
    var0.startFilterExpr();
    var0.endRelationalExpr(100);
    var0.endCommentNodeStep();
    var0.number((-1.0d));
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startOrExpr();
    var0.endUnionExpr(false);
    var0.endAndExpr(true);
    var0.literal("org.saxpath.SAXPathException: child");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test249");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.startNameStep(1, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n(4) endPathExpr()\n(5) number(-1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startFunction(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:child\")\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(4) endAbsoluteLocationPath()\n(5) endPredicate()\n(6) startFilterExpr()\n(7) startCommentNodeStep(0)\n");

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test250");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endFilterExpr();
    var0.endNameStep();
    var0.startCommentNodeStep(10);
    var0.startAndExpr();
    var0.number(10);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test251");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(1);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var0.endUnionExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endRelationalExpr(100);
    var0.endNameStep();

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test252");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test253");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.startFilterExpr();
    var0.endAndExpr(false);
    org.saxpath.conformance.ConformanceXPathHandler var6 = new org.saxpath.conformance.ConformanceXPathHandler();
    var6.startAbsoluteLocationPath();
    var6.endAndExpr(true);
    boolean var11 = var6.equals((java.lang.Object)'a');
    var6.startAbsoluteLocationPath();
    var6.endMultiplicativeExpr((-1));
    var6.endEqualityExpr((-1));
    var6.startAbsoluteLocationPath();
    var6.startTextNodeStep(10);
    var6.startAndExpr();
    var6.startRelationalExpr();
    org.saxpath.conformance.ConformanceXPathHandler var22 = new org.saxpath.conformance.ConformanceXPathHandler();
    var22.startAbsoluteLocationPath();
    var22.endAndExpr(true);
    boolean var27 = var22.equals((java.lang.Object)'a');
    java.lang.String var28 = var22.toString();
    var22.startXPath();
    var22.endAllNodeStep();
    var22.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var22.number(100.0d);
    var22.endMultiplicativeExpr((-1));
    var22.endPathExpr();
    var22.startNameStep((-1), "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    boolean var43 = var6.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var6.endUnionExpr(false);
    var6.startAbsoluteLocationPath();
    boolean var47 = var0.equals((java.lang.Object)var6);
    var6.endUnaryExpr(0);
    var6.startNameStep(10, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endCommentNodeStep()\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(6) endFunction()\n", "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var28.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test254");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startFunction("(0) endAllNodeStep()\n(1) endTextNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");
    var0.startMultiplicativeExpr();
    var0.endUnionExpr(false);
    var0.endUnionExpr(false);
    var0.startFilterExpr();
    var0.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endFilterExpr()\n(3) startRelationalExpr()\n(4) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) literal(\"\")\n(7) startOrExpr()\n");

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test255");


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
    var7.endProcessingInstructionNodeStep();
    var7.endMultiplicativeExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test256");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startMultiplicativeExpr();
    var0.endAndExpr(false);
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.startXPath();

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test257");


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
    var0.endRelationalExpr(0);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test258");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.endOrExpr(true);
    var0.startEqualityExpr();
    var0.endAllNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^");
    var0.endMultiplicativeExpr(10);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\nhi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\n^");
    var0.number((-1));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test259");


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
    var0.endRelationalExpr(0);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test260");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endProcessingInstructionNodeStep();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endAdditiveExpr(-1)\n(6) startPathExpr()\n(7) startRelativeLocationPath()\n(8) startNameStep(1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: child\")\n(9) startAdditiveExpr()\n(10) endFilterExpr()\n");
    var0.endMultiplicativeExpr(100);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test261");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.startNameStep(100, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.startMultiplicativeExpr();
    var0.endRelativeLocationPath();

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test262");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) endEqualityExpr(-1)\n(5) startAbsoluteLocationPath()\n(6) startTextNodeStep(10)\n(7) endFunction()\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\", \"(0) startRelativeLocationPath()\n\")\n(9) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) endProcessingInstructionNodeStep()\n:com.werken.saxpath.XPathSyntaxException: 1: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\n          ^\")\n", 10, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: \n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n\n          ^");

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test263");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.startUnionExpr();

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test264");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();
    var0.startXPath();
    var0.number(0);
    var0.endMultiplicativeExpr(10);
    var0.startUnaryExpr();

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test265");


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
    var0.endProcessingInstructionNodeStep();
    var0.startXPath();
    var0.startOrExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var0.endPathExpr();
    var0.startAdditiveExpr();

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test266");


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
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test267");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", 0, "com.werken.saxpath.XPathSyntaxException: 10: ^");

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test268");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endPredicate();
    var0.startPredicate();
    var0.endRelationalExpr((-1));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test269");


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
    org.saxpath.helpers.DefaultXPathHandler var13 = new org.saxpath.helpers.DefaultXPathHandler();
    var13.number(10.0d);
    var13.endRelativeLocationPath();
    var13.startRelativeLocationPath();
    var13.endFilterExpr();
    var13.endXPath();
    var13.startUnionExpr();
    var13.startTextNodeStep(10);
    var13.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: ");
    var13.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var13.startTextNodeStep(10);
    boolean var30 = var0.equals((java.lang.Object)var13);
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(false);
    var0.endFunction();
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test270");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    org.saxpath.conformance.ConformanceXPathHandler var7 = new org.saxpath.conformance.ConformanceXPathHandler();
    var7.startAbsoluteLocationPath();
    var7.endAndExpr(true);
    var7.endPathExpr();
    var7.endTextNodeStep();
    var7.startUnaryExpr();
    var7.endAbsoluteLocationPath();
    var7.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var7.endUnionExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var7);
    var7.endRelativeLocationPath();
    var7.endUnaryExpr((-1));
    var7.startAllNodeStep(1);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test271");


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
    var0.endAbsoluteLocationPath();

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test272");


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
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.endAndExpr(true);
    var0.startProcessingInstructionNodeStep(1, "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startAllNodeStep(1);
    var0.startAndExpr();

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test273");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.literal(" ^");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.endEqualityExpr(10);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test274");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startXPath();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");
    var0.endAllNodeStep();
    var0.startUnionExpr();

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test275");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.number(100.0d);
    var0.endAndExpr(false);
    var0.endAdditiveExpr(10);
    var0.endFunction();

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test276");


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
    var0.startUnaryExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\n ^\n^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) endMultiplicativeExpr(10)\n(4) number(1.0)\n(5) variableReference(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n\")\n(6) startPredicate()\n(7) startRelativeLocationPath()\n(8) startNameStep(100, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n\", \"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: hi!\")\n(9) number(1.0)\n(10) endUnaryExpr(100)\n");

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test277");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.startRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) variableReference(\"hi!: ^\")\n(6) startUnaryExpr()\n(7) startFunction(\":(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\")\n(8) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    var0.endFunction();

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test278");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n(3) endOrExpr(false)\n(4) endFilterExpr()\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.endRelationalExpr(100);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test279");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    org.saxpath.XPathHandler var47 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n(4) endPathExpr()\n\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test280");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endRelationalExpr(100)\n(7) endCommentNodeStep()\n(8) number(-1.0)\n(9) startRelativeLocationPath()\n(10) endAdditiveExpr(1)\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startXPath()\n(4) endCommentNodeStep()\n(5) endUnaryExpr(10)\n");
    java.lang.String var4 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endRelationalExpr(100)\n(7) endCommentNodeStep()\n(8) number(-1.0)\n(9) startRelativeLocationPath()\n(10) endAdditiveExpr(1)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endRelationalExpr(100)\n(7) endCommentNodeStep()\n(8) number(-1.0)\n(9) startRelativeLocationPath()\n(10) endAdditiveExpr(1)\n"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test281");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "namespace");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test282");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endUnaryExpr(10);
    var0.endFunction();
    var0.startFilterExpr();
    var0.endRelationalExpr(10);
    var0.startAndExpr();

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test283");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.startAndExpr();
    var0.startPathExpr();
    var0.number(10.0d);
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n", "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n(4) number(0)\n(5) number(1.0)\n(6) endPredicate()\n");
    var0.endAdditiveExpr(100);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test284");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(100);
    var0.startAndExpr();

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test285");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.toString();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test286");


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
    var0.endUnaryExpr((-1));
    var0.endFunction();
    var0.startPathExpr();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test287");


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
    var0.endPredicate();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test288");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(10);
    var0.endRelationalExpr((-1));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test289");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endAllNodeStep();
    var0.startMultiplicativeExpr();
    var0.startUnionExpr();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n");
    var0.endNameStep();
    var0.endUnaryExpr(0);
    var0.startMultiplicativeExpr();

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test290");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getXPath();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getXPath();
    int var9 = var3.getPosition();
    
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
    assertTrue(var9 == 1);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test291");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startXPath();
    var0.startRelativeLocationPath();
    var0.endAndExpr(true);
    var0.endAndExpr(true);
    var0.startPredicate();
    var0.endPredicate();

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test292");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endEqualityExpr(10);
    var0.startOrExpr();

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test293");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    java.lang.String var4 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test294");


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
    var20.endEqualityExpr((-1));
    var20.endTextNodeStep();
    var20.endAdditiveExpr(1);
    var20.endAndExpr(false);
    var0.setXPathHandler((org.saxpath.XPathHandler)var20);
    var20.startAbsoluteLocationPath();
    var20.startRelationalExpr();
    var20.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test295");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.number(0.0d);
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(0);
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n");

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test296");


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
    var0.number(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test297");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startAdditiveExpr();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr(0);
    var0.startPathExpr();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 1: ");
    var0.endPathExpr();

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test298");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();
    var0.endOrExpr(true);
    var0.endRelationalExpr((-1));
    var0.endPredicate();
    var0.number(0.0d);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test299");


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
    var34.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test300");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endUnaryExpr(0);
    var0.startAndExpr();
    var0.startTextNodeStep(10);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test301");


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
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endRelativeLocationPath();
    var18.startRelativeLocationPath();
    var18.endFilterExpr();
    var18.endAdditiveExpr(100);
    var18.startRelativeLocationPath();
    var18.endCommentNodeStep();
    var18.endOrExpr(false);
    var18.endRelativeLocationPath();
    var18.endAbsoluteLocationPath();
    var18.endXPath();
    boolean var33 = var0.equals((java.lang.Object)var18);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) number(100.0)\n(6) startOrExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endOrExpr(false)\n(9) endFunction()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test302");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startXPath();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.number(10.0d);
    var7.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var7.endPredicate();
    var7.startAdditiveExpr();
    var7.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var7.endAllNodeStep();
    var7.endUnaryExpr(0);
    boolean var21 = var0.equals((java.lang.Object)0);
    var0.endAndExpr(true);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n");
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test303");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test304");


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
    var0.endEqualityExpr(1);
    var0.endEqualityExpr(0);
    var0.endRelativeLocationPath();
    var0.startEqualityExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^", "org.saxpath.SAXPathException: hi!");
    var0.endCommentNodeStep();

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test305");


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
    var0.endTextNodeStep();
    var0.startTextNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test306");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(100);
    var0.variableReference("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n");
    var0.endCommentNodeStep();

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test307");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.number(1.0d);
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.endRelationalExpr((-1));
    var0.number(100.0d);
    var0.endPathExpr();
    var0.endPathExpr();

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test308");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.startTextNodeStep((-1));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test309");


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
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathParseException: ");
    var0.startProcessingInstructionNodeStep((-1), " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.endAllNodeStep();
    var0.endAndExpr(false);
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test310");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.number(0.0d);
    java.lang.String var8 = var0.toString();
    org.saxpath.helpers.DefaultXPathHandler var9 = new org.saxpath.helpers.DefaultXPathHandler();
    var9.number(10.0d);
    var9.endRelativeLocationPath();
    var9.number(10);
    var9.startOrExpr();
    var9.startPathExpr();
    var9.startAllNodeStep(10);
    var9.startAndExpr();
    var9.startXPath();
    var9.endFunction();
    boolean var22 = var0.equals((java.lang.Object)var9);
    var0.endAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.startPathExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test311");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.number(1);
    var0.number(10.0d);
    var0.endFilterExpr();
    var0.startUnionExpr();

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test312");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startRelationalExpr();
    var0.startCommentNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test313");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.endFilterExpr();
    var0.endOrExpr(false);
    var0.endEqualityExpr(0);
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.number(10.0d);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test314");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endFunction();
    var0.endOrExpr(true);
    var0.startRelationalExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endRelationalExpr(1)\n(9) endMultiplicativeExpr(0)\n(10) endFunction()\n(11) startCommentNodeStep(-1)\n(12) endNameStep()\n(13) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startEqualityExpr()\n(6) number(-1)\n(7) endFunction()\n");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test315");


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
    var0.startRelativeLocationPath();
    var0.startPathExpr();
    var0.endAdditiveExpr((-1));
    var0.endXPath();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test316");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.endXPath();
    var0.endFunction();
    var0.endUnionExpr(false);
    var0.endFunction();
    var0.startFilterExpr();
    org.saxpath.helpers.DefaultXPathHandler var17 = new org.saxpath.helpers.DefaultXPathHandler();
    var17.number(10.0d);
    var17.endRelativeLocationPath();
    var17.startRelativeLocationPath();
    var17.endFilterExpr();
    var17.endAdditiveExpr(100);
    var17.endRelationalExpr((-1));
    var17.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var17.endEqualityExpr((-1));
    var17.startPathExpr();
    boolean var33 = var0.equals((java.lang.Object)var17);
    var17.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test317");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n", (-1), "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var8 = var7.getPositionMarker();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    java.lang.String var10 = var7.getPositionMarker();
    java.lang.String var11 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var13 = var3.toString();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.Throwable[] var15 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + " ^"+ "'", var10.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test318");


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
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^");

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test319");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();
    var0.number(100.0d);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test320");


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
    var0.endUnionExpr(true);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test321");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startFilterExpr();

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startXPath()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test323");


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
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    var0.endMultiplicativeExpr(10);
    var0.endUnionExpr(true);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test324");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) startAbsoluteLocationPath()\n(5) number(-1.0)\n(6) startEqualityExpr()\n(7) endAllNodeStep()\n");

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test325");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("namespace", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "child\norg.saxpath.SAXPathException:  ^\n^");
    var0.endCommentNodeStep();

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test326");


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
    var0.startNameStep((-1), "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) number(1.0)\n(6) startPathExpr()\n");
    var0.endProcessingInstructionNodeStep();
    java.lang.String var29 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startEqualityExpr()\n(7) startCommentNodeStep(100)\n(8) startNameStep(-1, \"org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\", \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) number(1.0)\n(6) startPathExpr()\n\")\n(9) endProcessingInstructionNodeStep()\n"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startEqualityExpr()\n(7) startCommentNodeStep(100)\n(8) startNameStep(-1, \"org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\", \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) number(1.0)\n(6) startPathExpr()\n\")\n(9) endProcessingInstructionNodeStep()\n"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test327");


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
    java.lang.String var16 = var0.toString();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endMultiplicativeExpr(0)\n(7) startMultiplicativeExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) endMultiplicativeExpr(0)\n(7) startMultiplicativeExpr()\n"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test328");


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
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    com.werken.saxpath.XPathReader var16 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var17 = new org.saxpath.conformance.ConformanceXPathHandler();
    var17.startAbsoluteLocationPath();
    var17.endTextNodeStep();
    var17.endUnionExpr(true);
    var16.setXPathHandler((org.saxpath.XPathHandler)var17);
    org.saxpath.conformance.ConformanceXPathHandler var23 = new org.saxpath.conformance.ConformanceXPathHandler();
    var23.startAbsoluteLocationPath();
    var23.endAndExpr(true);
    var23.endPathExpr();
    var23.endTextNodeStep();
    var23.startUnaryExpr();
    var23.endAbsoluteLocationPath();
    var23.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var23.endUnionExpr(false);
    var16.setXPathHandler((org.saxpath.XPathHandler)var23);
    var23.endRelativeLocationPath();
    var23.startPathExpr();
    var23.startFilterExpr();
    boolean var40 = var0.equals((java.lang.Object)var23);
    var23.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test329");


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
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    var0.startPredicate();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test330");


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
    var0.number(0.0d);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test331");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.endNameStep();
    var0.startTextNodeStep(1);
    var0.startMultiplicativeExpr();
    var0.startAndExpr();
    var0.endPredicate();

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test332");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: (0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n"+ "'", var2.equals("org.saxpath.SAXPathParseException: (0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test333");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.startAllNodeStep((-1));
    var0.startXPath();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endEqualityExpr((-1));
    var14.endTextNodeStep();
    var14.endTextNodeStep();
    var14.startTextNodeStep(10);
    var14.endProcessingInstructionNodeStep();
    var14.endXPath();
    var14.startUnionExpr();
    boolean var25 = var0.equals((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test334");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n(2) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n\")\n(3) endXPath()\n(4) endRelativeLocationPath()\n");

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test335");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endOrExpr(true);
    var0.variableReference("child", "                                                                                                    ^");
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startEqualityExpr();

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test336");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.endRelationalExpr(10);
    var0.endPathExpr();
    var0.startFilterExpr();
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.endUnionExpr(false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test337");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startNameStep(0, "^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.number(1);
    var0.endMultiplicativeExpr(1);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startOrExpr()\n(5) startFilterExpr()\n(6) endAllNodeStep()\n(7) endUnaryExpr(100)\n");

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test338");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.endRelationalExpr((-1));
    var0.endXPath();
    var0.startNameStep((-1), "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endFunction()\n(8) startEqualityExpr()\n(9) startTextNodeStep(100)\n(10) number(10.0)\n(11) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n\")\n");

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test339");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startPathExpr();
    var0.startOrExpr();
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.startMultiplicativeExpr();
    var0.startCommentNodeStep(0);
    var0.startUnaryExpr();
    var0.endFilterExpr();
    var0.endFunction();

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test340");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.startFunction("org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startMultiplicativeExpr();
    var0.endNameStep();

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test341");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endRelationalExpr(100);
    var0.endAbsoluteLocationPath();

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test342");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    var0.startAdditiveExpr();
    var0.startEqualityExpr();
    var0.startXPath();
    var0.endRelationalExpr(10);
    var0.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n", "          ^");
    var0.endRelationalExpr((-1));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test343");


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
    var0.startAdditiveExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) endFunction()\n", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n(4) variableReference(\"hi!:(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n");
    var0.endPathExpr();
    var0.number((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test344");


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
    var0.endXPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) startEqualityExpr()\n(7) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) startMultiplicativeExpr()\n");

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test345");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endOrExpr(true);
    var0.variableReference("child", "                                                                                                    ^");
    var0.startRelationalExpr();
    var0.startOrExpr();
    java.lang.String var15 = var0.toString();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) endMultiplicativeExpr(1)\n(7) endOrExpr(false)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) endOrExpr(true)\n(5) variableReference(\"child:                                                                                                    ^\")\n(6) startRelationalExpr()\n(7) startOrExpr()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) endOrExpr(true)\n(5) variableReference(\"child:                                                                                                    ^\")\n(6) startRelationalExpr()\n(7) startOrExpr()\n"));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test346");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 100:  ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var6 = var5.getPositionMarker();
    java.lang.String var7 = var5.getPositionMarker();
    java.lang.Throwable[] var8 = var5.getSuppressed();
    java.lang.String var9 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var11 = var5.toString();
    java.lang.String var12 = var5.getPositionMarker();
    java.lang.String var13 = var5.getXPath();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.String var15 = var5.getXPath();
    java.lang.Throwable[] var16 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "\n ^\n ^"+ "'", var9.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + " ^"+ "'", var15.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test347");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.endOrExpr(true);
    var0.startTextNodeStep(10);
    var0.startOrExpr();
    var0.endAndExpr(false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test348");


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
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(0);
    var0.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test349");


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
    var0.startEqualityExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\n ^\n^");

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test350");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.endUnionExpr(false);
    var0.startFilterExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endProcessingInstructionNodeStep()\n(4) startUnionExpr()\n(5) endOrExpr(true)\n(6) startPredicate()\n", "com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n\n ^");
    org.saxpath.XPathSyntaxException var19 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 100:  ^", 0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    boolean var20 = var0.equals((java.lang.Object)0);
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test351");


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
    var0.endFilterExpr();

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test352");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.startOrExpr();
    var0.startAndExpr();
    var0.startRelationalExpr();

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test353");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startOrExpr();
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "          ^");
    var0.startPredicate();
    var0.startEqualityExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    var0.endAndExpr(false);
    var0.startAllNodeStep(0);
    var0.startCommentNodeStep((-1));
    var0.startUnionExpr();
    var0.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test354");


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
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");
    var0.startTextNodeStep(100);
    var0.startAllNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test355");


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
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endTextNodeStep();
    var14.endAdditiveExpr(1);
    java.lang.String var19 = var14.toString();
    var14.startRelativeLocationPath();
    var14.startUnaryExpr();
    var14.endRelativeLocationPath();
    var14.endProcessingInstructionNodeStep();
    var14.endAllNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var14);
    org.saxpath.XPathHandler var26 = var0.getXPathHandler();
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var28 = new org.saxpath.conformance.ConformanceXPathHandler();
    var28.startAbsoluteLocationPath();
    var28.endAndExpr(true);
    boolean var33 = var28.equals((java.lang.Object)'a');
    java.lang.String var34 = var28.toString();
    var28.startXPath();
    var28.startXPath();
    var28.endAllNodeStep();
    var28.endFilterExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var28);
    var28.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) number(1.0)\n(7) startUnaryExpr()\n(8) startAndExpr()\n(9) number(0.0)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var34.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test356");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    var0.endPredicate();
    var0.startCommentNodeStep(0);
    var0.endAdditiveExpr(0);
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test357");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test358");


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
    var0.startPredicate();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test359");


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
    var9.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test360");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAllNodeStep(100);
    var0.endOrExpr(false);
    var0.number(10);
    var0.endUnaryExpr(10);
    var0.endXPath();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test361");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(false);
    var0.startAllNodeStep(100);
    var0.endXPath();

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test362");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.literal("child");
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr(0);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test363");


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
    var11.endNameStep();
    var11.number((-1));
    var11.startAndExpr();

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test364");


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
    var60.startAllNodeStep((-1));
    var60.endAdditiveExpr((-1));
    var60.endCommentNodeStep();
    var60.startRelativeLocationPath();
    var60.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var60);
    var60.endRelativeLocationPath();
    
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

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test365");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.number(10);
    var0.startAdditiveExpr();
    var0.endRelationalExpr(10);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test366");


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
    var23.startXPath();
    var23.startAndExpr();
    var23.startUnionExpr();
    var23.startNameStep(10, "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var23.number(0);
    var23.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test367");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endUnionExpr(true);
    var0.endCommentNodeStep();
    var0.endFilterExpr();

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test368");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test369");


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
    var8.startRelationalExpr();
    var8.endUnionExpr(true);
    var8.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n(7) startMultiplicativeExpr()\n(8) endAllNodeStep()\n(9) startXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test370");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endFunction();
    var0.endXPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "hi!");
    var0.number(1);
    var0.endNameStep();
    var0.endPathExpr();

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test371");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endMultiplicativeExpr(1);
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathParseException: ");
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endRelativeLocationPath();
    var0.startAllNodeStep(10);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test372");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endAndExpr(true);
    var0.endAdditiveExpr(10);
    var0.endAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startRelationalExpr();

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test373");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.endEqualityExpr(1);
    var0.endAndExpr(true);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test374");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.number((-1));
    var0.startUnaryExpr();
    var0.startAllNodeStep(0);
    var0.startEqualityExpr();
    var0.number(100);
    var0.endMultiplicativeExpr(10);
    var0.number(1.0d);
    var0.endOrExpr(false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test375");


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
    var0.endPathExpr();
    var0.endUnaryExpr(1);
    var0.endUnaryExpr(0);
    var0.endTextNodeStep();

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test376");


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
    var0.endCommentNodeStep();
    var0.startEqualityExpr();
    var0.endTextNodeStep();
    var0.endOrExpr(true);
    var0.endTextNodeStep();

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test377");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var0.endFilterExpr();
    var0.number(100);
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.endCommentNodeStep();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test378");


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
    var0.endFilterExpr();
    var0.startOrExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test379");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr(100);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    var0.startRelativeLocationPath();
    var0.endXPath();
    var0.endAndExpr(false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test380");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.startNameStep(0, " ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.endCommentNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.endEqualityExpr(100);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test381");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var4 = var3.getPosition();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^"+ "'", var7.equals("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test382");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.startAbsoluteLocationPath();
    var8.endUnaryExpr(10);
    var8.number(1);
    org.saxpath.helpers.DefaultXPathHandler var14 = new org.saxpath.helpers.DefaultXPathHandler();
    var14.number(10.0d);
    var14.endPathExpr();
    var14.endPredicate();
    var14.endAndExpr(true);
    boolean var21 = var8.equals((java.lang.Object)var14);
    var8.number(0.0d);
    var8.endCommentNodeStep();
    var8.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");
    var8.number(0);
    boolean var29 = var0.equals((java.lang.Object)var8);
    var8.literal("com.werken.saxpath.XPathSyntaxException: 10: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test383");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.endAdditiveExpr((-1));
    var0.startUnaryExpr();

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test384");


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
    var0.endRelationalExpr((-1));
    var0.startAndExpr();

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test385");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.getXPath();
    
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
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test386");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endPredicate();
    var0.endUnaryExpr(100);
    var0.startFilterExpr();
    var0.endAndExpr(false);
    var0.startTextNodeStep(0);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) endXPath()\n(6) number(1)\n(7) endRelativeLocationPath()\n");
    var0.number(10);
    var0.startPathExpr();

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test387");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.startUnaryExpr();

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test388");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var16 = var15.getXPath();
    java.lang.String var17 = var15.getPositionMarker();
    int var18 = var15.getPosition();
    java.lang.Throwable[] var19 = var15.getSuppressed();
    int var20 = var15.getPosition();
    var3.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var22 = var3.toString();
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.XPathSyntaxException var27 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var28 = var27.getPositionMarker();
    int var29 = var27.getPosition();
    var3.addSuppressed((java.lang.Throwable)var27);
    java.lang.String var31 = var3.toString();
    org.saxpath.XPathSyntaxException var35 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var36 = var35.getMultilineMessage();
    java.lang.String var37 = var35.getPositionMarker();
    java.lang.String var38 = var35.toString();
    var3.addSuppressed((java.lang.Throwable)var35);
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + " ^"+ "'", var17.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + " ^"+ "'", var28.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var31.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var36.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "^"+ "'", var37.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var38.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test389");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.endNameStep();
    var0.startOrExpr();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.endMultiplicativeExpr(1);
    var0.endPredicate();
    var0.startCommentNodeStep(0);
    var0.endMultiplicativeExpr(0);
    var0.number(1);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test390");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n", 1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test391");


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
    var0.endAdditiveExpr(0);
    var0.endMultiplicativeExpr((-1));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test392");


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
    var0.startTextNodeStep(100);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test393");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endFilterExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.startOrExpr();
    var0.endAndExpr(true);
    var0.startOrExpr();
    var0.startCommentNodeStep((-1));
    var0.startPathExpr();

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test394");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.startTextNodeStep(100);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test395");


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
    var0.startPathExpr();
    org.saxpath.conformance.ConformanceXPathHandler var14 = new org.saxpath.conformance.ConformanceXPathHandler();
    var14.startAbsoluteLocationPath();
    var14.endTextNodeStep();
    var14.endAdditiveExpr(1);
    java.lang.String var19 = var14.toString();
    var14.startMultiplicativeExpr();
    var14.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var14.variableReference("hi!", " ^");
    var14.endNameStep();
    var14.startCommentNodeStep(100);
    var14.startAdditiveExpr();
    boolean var31 = var0.equals((java.lang.Object)var14);
    var14.startFunction("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var14.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test396");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startAdditiveExpr();
    var0.endAllNodeStep();
    var0.endFilterExpr();
    var0.endPathExpr();
    var0.endRelativeLocationPath();
    var0.endNameStep();

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test397");


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
    var0.startTextNodeStep(1);
    var0.startOrExpr();
    var0.startAdditiveExpr();
    var0.number(100);
    var0.endEqualityExpr((-1));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test398");


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
    var8.startAdditiveExpr();
    var8.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test399");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.startUnionExpr();
    var0.endRelationalExpr(0);
    var0.startRelationalExpr();
    var0.startUnaryExpr();
    var0.startAllNodeStep(1);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test400");


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
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n");

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test401");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.endFunction();
    var0.startAndExpr();
    var0.endAdditiveExpr(100);
    var0.endNameStep();
    var0.startPathExpr();
    var0.startPredicate();

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test402");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endXPath();
    var0.endUnionExpr(true);
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.endAbsoluteLocationPath();

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test403");


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
    java.lang.String var17 = var15.getMultilineMessage();
    java.lang.String var18 = var15.toString();
    org.saxpath.XPathSyntaxException var22 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^", 0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n");
    var15.addSuppressed((java.lang.Throwable)var22);
    org.saxpath.SAXPathException var24 = new org.saxpath.SAXPathException((java.lang.Throwable)var22);
    java.lang.String var25 = var22.getPositionMarker();
    
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
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "^"+ "'", var25.equals("^"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test404");


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
    var0.endNameStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) endRelativeLocationPath()\n(5) startAndExpr()\n(6) variableReference(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n\")\n");
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startPathExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startAbsoluteLocationPath()\n");
    var0.endRelativeLocationPath();

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test405");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) number(1.0)\n(7) startXPath()\n(8) endAndExpr(true)\n(9) startCommentNodeStep(1)\n(10) endAdditiveExpr(10)\n(11) endUnionExpr(true)\n(12) endProcessingInstructionNodeStep()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test406");


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
    var0.endRelationalExpr((-1));
    var0.number((-1.0d));
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test407");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(0);
    var0.startFilterExpr();
    var0.endAdditiveExpr((-1));
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n");
    var0.startUnionExpr();
    var0.endRelativeLocationPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) endRelativeLocationPath()\n(6) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n(9) endAdditiveExpr(100)\n");

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test408");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endUnaryExpr((-1));
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.startOrExpr();
    var0.endEqualityExpr(100);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test409");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.endRelationalExpr((-1));
    var0.startPredicate();
    var0.endPathExpr();
    var0.startAdditiveExpr();

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test410");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) endCommentNodeStep()\n", 100, "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n");
    var3.addSuppressed((java.lang.Throwable)var8);
    org.saxpath.XPathSyntaxException var13 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", 100, "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var14 = var13.toString();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var13);
    java.lang.String var16 = var13.getXPath();
    var3.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var18 = var13.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var16.equals("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var18.equals("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test411");


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
    org.saxpath.conformance.ConformanceXPathHandler var37 = new org.saxpath.conformance.ConformanceXPathHandler();
    var37.startAbsoluteLocationPath();
    var37.endAndExpr(true);
    boolean var42 = var37.equals((java.lang.Object)'a');
    java.lang.String var43 = var37.toString();
    var37.startXPath();
    var37.startPathExpr();
    var37.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var37.startXPath();
    var37.endAndExpr(true);
    var37.endFilterExpr();
    var37.endCommentNodeStep();
    var37.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "org.saxpath.SAXPathParseException: ");
    var37.startProcessingInstructionNodeStep((-1), " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var37.endMultiplicativeExpr(100);
    var37.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var37);
    var37.endUnaryExpr(0);
    var37.startXPath();
    var37.endPredicate();
    var37.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var43.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test412");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endAllNodeStep();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endXPath();

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test413");


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
    var0.endPathExpr();
    var0.endPredicate();
    var0.startAllNodeStep(0);
    var0.endUnionExpr(true);
    var0.startOrExpr();

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test414");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startXPath()\n(4) endAllNodeStep()\n(5) endRelationalExpr(1)\n(6) endAllNodeStep()\n");
    org.saxpath.SAXPathParseException var3 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 1: ");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.SAXPathParseException var6 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    org.saxpath.SAXPathParseException var8 = new org.saxpath.SAXPathParseException("");
    java.lang.String var9 = var8.toString();
    org.saxpath.SAXPathException var11 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var8.addSuppressed((java.lang.Throwable)var11);
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException((java.lang.Throwable)var8);
    org.saxpath.XPathSyntaxException var17 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var18 = var17.getPositionMarker();
    org.saxpath.SAXPathException var19 = new org.saxpath.SAXPathException((java.lang.Throwable)var17);
    java.lang.String var20 = var17.toString();
    int var21 = var17.getPosition();
    int var22 = var17.getPosition();
    java.lang.String var23 = var17.toString();
    var13.addSuppressed((java.lang.Throwable)var17);
    org.saxpath.SAXPathException var25 = new org.saxpath.SAXPathException((java.lang.Throwable)var13);
    var6.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var6);
    var1.addSuppressed((java.lang.Throwable)var3);
    org.saxpath.XPathSyntaxException var32 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    int var33 = var32.getPosition();
    java.lang.String var34 = var32.getXPath();
    java.lang.String var35 = var32.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var32);
    java.lang.String var37 = var32.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var9.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var20.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var23.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var34.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "                                                                                                    ^"+ "'", var35.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"+ "'", var37.equals("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test415");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test416");


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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test417");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.startEqualityExpr();

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test418");


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
    var0.endAllNodeStep();
    var0.endCommentNodeStep();
    var0.startAndExpr();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test419");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test420");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startRelationalExpr();
    var0.startPathExpr();
    var0.startUnaryExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test421");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n");
    var0.startProcessingInstructionNodeStep((-1), "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n");
    var0.endXPath();
    var0.startFilterExpr();

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test422");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getPositionMarker();
    java.lang.String var9 = var7.toString();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    java.lang.String var11 = var7.getMultilineMessage();
    org.saxpath.SAXPathException var13 = new org.saxpath.SAXPathException("");
    var7.addSuppressed((java.lang.Throwable)var13);
    var3.addSuppressed((java.lang.Throwable)var13);
    java.lang.Throwable[] var16 = var3.getSuppressed();
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    int var18 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var9.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test423");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.endAdditiveExpr(0);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test424");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endAllNodeStep();

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test425");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(true);
    var0.endEqualityExpr(1);
    var0.startAllNodeStep(10);
    var0.endFunction();
    var0.endCommentNodeStep();

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test426");


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
    var7.startPathExpr();
    var7.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startEqualityExpr()\n(6) startTextNodeStep(0)\n(7) endFilterExpr()\n(8) endAbsoluteLocationPath()\n(9) startAdditiveExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n");
    var7.startAllNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test427");


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
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startOrExpr();

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test428");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.endAdditiveExpr(100);
    var0.endFunction();
    var0.endCommentNodeStep();
    var0.endUnaryExpr(0);
    var0.endMultiplicativeExpr(100);
    var0.startOrExpr();

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test429");


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
    var0.endRelationalExpr(10);
    var0.endUnaryExpr((-1));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test430");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.startRelativeLocationPath();
    var0.startOrExpr();

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test431");


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
    var7.endProcessingInstructionNodeStep();
    var7.startAdditiveExpr();
    var7.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startNameStep(-1, \"\", \"org.saxpath.SAXPathParseException: \")\n(4) endTextNodeStep()\n");
    var7.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test432");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    org.saxpath.helpers.DefaultXPathHandler var9 = new org.saxpath.helpers.DefaultXPathHandler();
    var9.number(10.0d);
    var9.endNameStep();
    var9.startUnaryExpr();
    var9.endPredicate();
    var9.endFunction();
    var9.endPredicate();
    var9.startTextNodeStep((-1));
    boolean var19 = var0.equals((java.lang.Object)(-1));
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test433");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, " ^");
    int var4 = var3.getPosition();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.toString();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "                                                                                                    ^"+ "'", var8.equals("                                                                                                    ^"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test434");


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
    var45.number(10.0d);
    var45.startCommentNodeStep(10);
    var45.endFunction();
    var45.startProcessingInstructionNodeStep((-1), "^");
    var45.startEqualityExpr();
    var45.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    var45.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    var45.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test435");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n", 1, "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^");
    java.lang.String var4 = var3.getPositionMarker();
    int var5 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test436");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.startTextNodeStep(10);
    var0.startAbsoluteLocationPath();

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test437");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startAbsoluteLocationPath();

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test438");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endOrExpr(false);
    var0.endFilterExpr();
    var0.endAbsoluteLocationPath();
    var0.startPredicate();
    var0.endRelationalExpr(1);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test439");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.literal("child");
    var0.endFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");
    var0.startFilterExpr();

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test440");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endRelationalExpr(1);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test441");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    org.saxpath.XPathHandler var28 = var0.getXPathHandler();
    org.saxpath.XPathHandler var29 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test442");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.endFunction();
    var0.endRelationalExpr(0);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test443");


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
    var1.startPathExpr();
    var1.startFilterExpr();
    var1.endMultiplicativeExpr((-1));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test444");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.startCommentNodeStep(1);
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.endTextNodeStep();
    var0.endFunction();
    var0.endAndExpr(false);
    var0.startCommentNodeStep(100);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test445");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endAndExpr(true)\n(7) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \", \" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(8) startRelationalExpr()\n(9) endUnionExpr(true)\n(10) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^:com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n\")\n", 0, "com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var4);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test446");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endAndExpr(true);
    var0.startCommentNodeStep(100);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n", "org.saxpath.SAXPathException: org.saxpath.SAXPathParseException: ");

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test447");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPathExpr();
    var0.number((-1));
    var0.startUnionExpr();
    var0.endAdditiveExpr((-1));
    var0.startXPath();
    var0.startFilterExpr();
    var0.endEqualityExpr(1);
    var0.startProcessingInstructionNodeStep(0, "^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n\n          ^");
    var0.startProcessingInstructionNodeStep(1, "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startMultiplicativeExpr()\n");

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test448");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endNameStep();
    java.lang.String var10 = var0.toString();
    var0.endPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.startUnaryExpr();
    var0.startTextNodeStep(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test449");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.startUnionExpr();
    var0.endAndExpr(false);
    var0.startPathExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test450");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endOrExpr(false);
    var0.number(10.0d);
    var0.endUnaryExpr(100);
    var0.endRelationalExpr(100);
    var0.variableReference("org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startPredicate();
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test451");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startUnionExpr();
    var0.startFilterExpr();

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test452");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.endEqualityExpr(1);
    var0.startCommentNodeStep(10);
    var0.number(0);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test453");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startUnionExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startUnionExpr();

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test454");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPathExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startUnionExpr();
    var0.startNameStep(1, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test455");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endNameStep();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endCommentNodeStep();
    var0.startAdditiveExpr();

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test456");


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
    var0.startAbsoluteLocationPath();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test457");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^", " ^");
    var0.endNameStep();
    var0.endNameStep();

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test458");


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
    var0.endCommentNodeStep();
    var0.endAdditiveExpr(0);
    var0.startAdditiveExpr();
    var0.endAdditiveExpr(0);
    var0.startRelationalExpr();

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test459");


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
    var18.startXPath();
    var18.endNameStep();
    var18.startRelationalExpr();
    var18.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var34 = new org.saxpath.helpers.DefaultXPathHandler();
    var34.number(10.0d);
    var34.endRelativeLocationPath();
    var34.startRelativeLocationPath();
    var34.endFilterExpr();
    var34.endAdditiveExpr(100);
    var34.startRelativeLocationPath();
    var34.number(10.0d);
    var34.endProcessingInstructionNodeStep();
    var34.endXPath();
    var34.startFilterExpr();
    var34.startTextNodeStep(100);
    boolean var50 = var18.equals((java.lang.Object)100);
    var18.variableReference("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test460");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.endUnionExpr(true);
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var1.startOrExpr();
    var1.startUnaryExpr();
    var1.startUnaryExpr();
    var1.endAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var1.startAdditiveExpr();

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test461");


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
    var0.startOrExpr();
    var0.startAdditiveExpr();
    java.lang.String var15 = var0.toString();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) endProcessingInstructionNodeStep()\n(7) endAllNodeStep()\n(8) endMultiplicativeExpr(-1)\n(9) startOrExpr()\n(10) startAdditiveExpr()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) endProcessingInstructionNodeStep()\n(7) endAllNodeStep()\n(8) endMultiplicativeExpr(-1)\n(9) startOrExpr()\n(10) startAdditiveExpr()\n"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test462");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endFunction();
    var0.startUnionExpr();
    var0.startMultiplicativeExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) startUnionExpr()\n(6) endFunction()\n(7) endAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endNameStep()\n(5) endTextNodeStep()\n");
    var0.endAndExpr(true);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test463");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.endPredicate();
    var0.number((-1.0d));
    var0.endRelationalExpr(0);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test464");


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
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test465");


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
    var0.endFilterExpr();
    var0.endXPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) endMultiplicativeExpr(1)\n(7) endOrExpr(false)\n");

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test466");


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
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test467");


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
    var0.literal("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test468");


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
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endOrExpr(false);
    var0.endAndExpr(true);
    var0.startAdditiveExpr();

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test469");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.endPathExpr();
    var0.endUnaryExpr(1);
    var0.endAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.number(100.0d);
    var0.endNameStep();

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test470");


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
    var0.endUnionExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test471");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.startTextNodeStep((-1));
    var0.endOrExpr(true);
    var0.endCommentNodeStep();

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test472");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(false);
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test473");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(1);
    var0.number((-1.0d));
    var0.endRelationalExpr(0);
    var0.endCommentNodeStep();
    var0.number(1);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startNameStep(1, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) endProcessingInstructionNodeStep()\n(7) endAllNodeStep()\n(8) endMultiplicativeExpr(-1)\n(9) startOrExpr()\n(10) startAdditiveExpr()\n");

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test474");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endPathExpr();
    var0.startAndExpr();
    var0.endAllNodeStep();
    var0.startRelationalExpr();
    var0.endAndExpr(true);
    var0.endCommentNodeStep();

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test475");


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
    var0.endPathExpr();
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test476");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startAndExpr();
    var0.endUnionExpr(true);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test477");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endRelationalExpr(0);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.startXPath();
    var0.endXPath();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test478");


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
    var13.startPredicate();
    var13.startAbsoluteLocationPath();
    var13.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test479");


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
    var8.literal("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");
    java.lang.String var29 = var8.toString();
    var8.endAllNodeStep();
    var8.endNameStep();
    var8.endMultiplicativeExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n(11) literal(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^\")\n"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) endAndExpr(false)\n(8) endPathExpr()\n(9) startOrExpr()\n(10) startFilterExpr()\n(11) literal(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^\")\n"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test480");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endAndExpr(true)\n(5) endProcessingInstructionNodeStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) endAbsoluteLocationPath()\n(3) endEqualityExpr(100)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\")\n");
    java.lang.String var4 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endAndExpr(true)\n(5) endProcessingInstructionNodeStep()\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endAndExpr(true)\n(5) endProcessingInstructionNodeStep()\n"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test481");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endAllNodeStep();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test482");


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
    var0.endUnionExpr(true);
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test483");


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
    var0.startRelationalExpr();
    var0.startPredicate();
    var0.startAdditiveExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startFunction(\" ^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(3) endFilterExpr()\n");
    var0.startUnaryExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) startCommentNodeStep(-1)\n(7) startRelativeLocationPath()\n(8) endXPath()\n(9) endRelativeLocationPath()\n(10) endOrExpr(true)\n(11) endAndExpr(false)\n(12) number(100)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test484");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endUnionExpr(true)\n(7) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n:child\")\n");
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test485");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    org.saxpath.XPathHandler var29 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var30 = new org.saxpath.helpers.DefaultXPathHandler();
    var30.startAndExpr();
    var30.endRelationalExpr(1);
    var30.endOrExpr(true);
    var30.endAllNodeStep();
    var30.startCommentNodeStep(100);
    var30.endUnaryExpr(10);
    var30.startNameStep(1, "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startXPath()\n(4) endXPath()\n");
    var30.endAbsoluteLocationPath();
    var30.endNameStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var30);
    org.saxpath.helpers.DefaultXPathHandler var48 = new org.saxpath.helpers.DefaultXPathHandler();
    var48.number(10.0d);
    var48.endPathExpr();
    var48.endUnionExpr(false);
    var48.startPathExpr();
    var48.startEqualityExpr();
    var48.startPredicate();
    var48.endRelationalExpr(10);
    var48.number(0);
    var48.startAllNodeStep(10);
    var48.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endTextNodeStep()\n(7) endOrExpr(true)\n", "");
    var0.setXPathHandler((org.saxpath.XPathHandler)var48);
    var48.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelationalExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test486");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(true);
    var0.number((-1.0d));
    var0.startRelationalExpr();
    var0.startCommentNodeStep(100);
    var0.startAdditiveExpr();

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test487");


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
    var1.endUnaryExpr(100);
    var1.endProcessingInstructionNodeStep();
    var1.endAbsoluteLocationPath();
    var1.endPredicate();

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test488");


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
    var29.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test489");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", 100, "com.werken.saxpath.XPathSyntaxException: 10: ^");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test490");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    org.saxpath.conformance.ConformanceXPathHandler var5 = new org.saxpath.conformance.ConformanceXPathHandler();
    var5.startRelativeLocationPath();
    var5.endOrExpr(false);
    var5.startUnaryExpr();
    java.lang.String var10 = var5.toString();
    boolean var11 = var0.equals((java.lang.Object)var5);
    var5.startAbsoluteLocationPath();
    var5.startTextNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"+ "'", var10.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test491");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startPredicate();
    var0.startAdditiveExpr();

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test492");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelativeLocationPath()\n(8) endOrExpr(false)\n(9) endAdditiveExpr(100)\n(10) startProcessingInstructionNodeStep(100, \"org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\")\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test493");


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
    var0.startTextNodeStep(1);
    var0.startPredicate();
    var0.endRelativeLocationPath();

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test494");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startPathExpr();
    var0.endPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: ^");
    var0.startUnaryExpr();

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test495");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startCommentNodeStep(0);
    var0.number(100.0d);
    var0.endAllNodeStep();

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test496");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endEqualityExpr(0);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test497");


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
    var1.endAbsoluteLocationPath();
    var1.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) endXPath()\n(6) number(1)\n(7) endRelativeLocationPath()\n");

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test498");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.endFunction();
    var0.endAbsoluteLocationPath();

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test499");


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
    var22.startTextNodeStep(100);
    var22.startUnionExpr();
    var22.endUnionExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest45.test500");


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
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.startNameStep((-1), "hi!", "hi!");
    var20.startFilterExpr();
    var20.startAbsoluteLocationPath();
    var20.endOrExpr(false);
    var20.startXPath();
    var20.endAllNodeStep();
    var20.startOrExpr();
    boolean var32 = var0.equals((java.lang.Object)var20);
    var20.startUnionExpr();
    var20.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

}
