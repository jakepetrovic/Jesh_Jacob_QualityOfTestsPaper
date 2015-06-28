package randoop;

import junit.framework.*;

public class RandoopTest54 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test1");


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
    var8.startRelativeLocationPath();
    var8.startXPath();
    var8.number(100);
    var8.endNameStep();
    var8.endRelationalExpr(10);
    var8.endAdditiveExpr(1);
    var8.endUnaryExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test2");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.endEqualityExpr(1);
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.startAdditiveExpr();
    var0.number((-1));
    var0.endTextNodeStep();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test3");


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
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test4");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test5");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.getMultilineMessage();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("\n ^\n ^", (-1), "(0) startXPath()\n");
    java.lang.String var13 = var12.toString();
    java.lang.String var14 = var12.getXPath();
    var3.addSuppressed((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n"+ "'", var13.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "\n ^\n ^"+ "'", var14.equals("\n ^\n ^"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test6");


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
    var0.endMultiplicativeExpr(0);
    var0.endAdditiveExpr(100);
    var0.startTextNodeStep((-1));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test7");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.startRelationalExpr();
    var0.endFunction();
    var0.endUnionExpr(false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test8");


    int var1 = org.saxpath.Axis.lookup("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test9");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    int var4 = var3.getPosition();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.getPositionMarker();
    java.lang.String var9 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var13 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var14 = var13.getXPath();
    int var15 = var13.getPosition();
    int var16 = var13.getPosition();
    int var17 = var13.getPosition();
    int var18 = var13.getPosition();
    java.lang.String var19 = var13.getMultilineMessage();
    var3.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var21 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "child\norg.saxpath.SAXPathException:  ^\n^"+ "'", var6.equals("child\norg.saxpath.SAXPathException:  ^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "^"+ "'", var8.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "^"+ "'", var9.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test10");


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
    var0.startPathExpr();
    var0.endNameStep();
    var0.endAndExpr(false);
    var0.endProcessingInstructionNodeStep();

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test11");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("\n ^\n ^", "org.saxpath.SAXPathException:  ^");
    var0.endUnionExpr(true);
    var0.endPredicate();
    var0.endNameStep();
    var0.startFilterExpr();
    var0.startFilterExpr();

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test12");


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
    var0.number(1);
    var0.startRelativeLocationPath();

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test13");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endUnaryExpr(10);
    var0.startCommentNodeStep(0);
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startFilterExpr();
    var0.number(10);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test14");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.endCommentNodeStep();
    var0.startPredicate();
    var0.startRelativeLocationPath();

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test15");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n", 1, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) endNameStep()\n(5) startFilterExpr()\n(6) endTextNodeStep()\n");

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test16");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var12 = var11.getPositionMarker();
    java.lang.String var13 = var11.toString();
    org.saxpath.SAXPathException var14 = new org.saxpath.SAXPathException((java.lang.Throwable)var11);
    java.lang.String var15 = var11.getMultilineMessage();
    java.lang.String var16 = var11.getMultilineMessage();
    java.lang.String var17 = var11.toString();
    java.lang.String var18 = var11.getPositionMarker();
    java.lang.String var19 = var11.getPositionMarker();
    org.saxpath.XPathSyntaxException var23 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var24 = var23.getXPath();
    java.lang.String var25 = var23.getPositionMarker();
    int var26 = var23.getPosition();
    java.lang.Throwable[] var27 = var23.getSuppressed();
    int var28 = var23.getPosition();
    var11.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var30 = var11.toString();
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var32 = var3.getSuppressed();
    java.lang.String var33 = var3.getXPath();
    org.saxpath.XPathSyntaxException var37 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.SAXPathException var38 = new org.saxpath.SAXPathException((java.lang.Throwable)var37);
    java.lang.String var39 = var38.toString();
    var3.addSuppressed((java.lang.Throwable)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "^"+ "'", var7.equals("^"));
    
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
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + " ^"+ "'", var19.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + " ^"+ "'", var25.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var33.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var39.equals("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test17");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endMultiplicativeExpr(10);
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) startMultiplicativeExpr()\n");
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n(7) endTextNodeStep()\n(8) endProcessingInstructionNodeStep()\n");
    var0.startAdditiveExpr();

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test18");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startAllNodeStep(10);
    var0.startAndExpr();
    var0.endOrExpr(false);
    var0.number(1.0d);
    var0.startOrExpr();

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test19");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n");
    org.saxpath.XPathHandler var26 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var27 = new org.saxpath.conformance.ConformanceXPathHandler();
    var27.startAbsoluteLocationPath();
    var27.endTextNodeStep();
    var27.endAdditiveExpr(1);
    java.lang.String var32 = var27.toString();
    var27.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var34 = new org.saxpath.helpers.DefaultXPathHandler();
    var34.number(10.0d);
    var34.endRelativeLocationPath();
    var34.startRelativeLocationPath();
    var34.endFilterExpr();
    var34.endAdditiveExpr(100);
    boolean var42 = var27.equals((java.lang.Object)var34);
    var34.startXPath();
    var34.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var34.endAdditiveExpr(0);
    var34.endPredicate();
    var34.startUnaryExpr();
    var34.startAbsoluteLocationPath();
    var34.variableReference("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");
    var34.endUnaryExpr(10);
    var34.startPathExpr();
    var34.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var34);
    var0.parse("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var32.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test20");


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
    var0.endAndExpr(false);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n\n^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) endRelationalExpr(10)\n", "com.werken.saxpath.XPathSyntaxException: 100: com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.startAndExpr();

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test21");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startTextNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test22");


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
    var0.number(10.0d);
    org.saxpath.conformance.ConformanceXPathHandler var24 = new org.saxpath.conformance.ConformanceXPathHandler();
    var24.startAbsoluteLocationPath();
    var24.endAndExpr(true);
    boolean var29 = var24.equals((java.lang.Object)'a');
    java.lang.String var30 = var24.toString();
    var24.startXPath();
    var24.endAllNodeStep();
    var24.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var24.endAbsoluteLocationPath();
    var24.endCommentNodeStep();
    var24.number(10);
    var24.endPathExpr();
    var24.endProcessingInstructionNodeStep();
    var24.startOrExpr();
    boolean var43 = var0.equals((java.lang.Object)var24);
    var24.startMultiplicativeExpr();
    var24.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var30.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test23");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endUnionExpr(false);
    var0.endAndExpr(false);
    var0.endAndExpr(true);
    var0.endTextNodeStep();

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test24");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.endFilterExpr();
    var0.endRelationalExpr((-1));
    var0.startRelationalExpr();
    var0.endCommentNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    var0.startMultiplicativeExpr();

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test25");


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
    var11.variableReference("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var11.endCommentNodeStep();
    var11.endPathExpr();
    var11.startXPath();
    var11.endPredicate();
    var11.number(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test26");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endXPath();
    var0.startTextNodeStep(10);
    var0.startMultiplicativeExpr();
    var0.startPathExpr();

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test27");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) endOrExpr(false)\n(7) endFunction()\n(8) endUnaryExpr(100)\n(9) startUnaryExpr()\n");
    var0.endUnaryExpr(100);
    var0.startAdditiveExpr();
    var0.endRelationalExpr(10);
    var0.endFilterExpr();

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test28");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endNameStep();
    var0.endFilterExpr();
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endAndExpr(true);
    var12.endPathExpr();
    var12.endTextNodeStep();
    var12.startUnaryExpr();
    var12.endUnionExpr(true);
    var12.startNameStep(0, " ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var12.startMultiplicativeExpr();
    var12.endOrExpr(false);
    boolean var28 = var0.equals((java.lang.Object)var12);
    var0.startUnaryExpr();
    var0.startMultiplicativeExpr();
    var0.startUnionExpr();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test29");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endMultiplicativeExpr(10);
    var0.startPathExpr();
    var0.startAndExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endTextNodeStep()\n(4) endAllNodeStep()\n(5) startTextNodeStep(100)\n(6) endCommentNodeStep()\n(7) endEqualityExpr(100)\n", "com.werken.saxpath.XPathSyntaxException: 1: \norg.saxpath.SAXPathParseException: \n ^");

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test30");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startNameStep(0, \" ^\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startEqualityExpr()\n(8) startPredicate()\n(9) startNameStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endAdditiveExpr(10)\n(11) endRelationalExpr(0)\n(12) endUnionExpr(false)\n(13) startEqualityExpr()\n(14) endTextNodeStep()\n(15) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startAndExpr()\n(4) startUnaryExpr()\n(5) endPathExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test31");


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
    var32.endPathExpr();
    var32.endUnionExpr(false);
    var32.endEqualityExpr(1);
    var32.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var32.startAbsoluteLocationPath();
    var32.startEqualityExpr();
    var32.endMultiplicativeExpr(1);
    var32.startXPath();
    var32.startPathExpr();
    var32.endAbsoluteLocationPath();
    var32.endXPath();
    var32.startRelationalExpr();
    var32.endRelationalExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    org.saxpath.conformance.ConformanceXPathHandler var56 = new org.saxpath.conformance.ConformanceXPathHandler();
    var56.startAbsoluteLocationPath();
    var56.endAndExpr(true);
    boolean var61 = var56.equals((java.lang.Object)'a');
    java.lang.String var62 = var56.toString();
    var56.startXPath();
    var56.endAllNodeStep();
    var56.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var56.endAbsoluteLocationPath();
    var56.endProcessingInstructionNodeStep();
    var56.endUnaryExpr(1);
    var56.startRelationalExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var62.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test32");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep(100);
    var0.endFilterExpr();
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test33");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test34");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.getXPath();
    java.lang.String var9 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test35");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.number(100.0d);
    var0.startUnaryExpr();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test36");


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
    var18.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var18.startAdditiveExpr();
    var18.endXPath();
    var18.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var18.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var18.endFilterExpr();
    var18.endRelationalExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    var18.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test37");


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
    var0.startAllNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test38");


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
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startRelationalExpr()\n(7) endMultiplicativeExpr(100)\n(8) endMultiplicativeExpr(100)\n(9) endAbsoluteLocationPath()\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(6) startRelationalExpr()\n(7) endMultiplicativeExpr(100)\n(8) endMultiplicativeExpr(100)\n(9) endAbsoluteLocationPath()\n"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test39");


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
    var0.startAndExpr();
    var0.endPredicate();

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test40");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.endProcessingInstructionNodeStep();
    var0.endRelationalExpr(100);
    var0.endPredicate();
    var0.endAdditiveExpr((-1));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test41");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startFilterExpr()\n(6) endAllNodeStep()\n(7) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n\", \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n\")\n(8) endAbsoluteLocationPath()\n(9) number(100)\n");

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test42");


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
    var0.startAndExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endRelationalExpr(100);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test43");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test44");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.endNameStep();
    var0.startEqualityExpr();
    var0.endTextNodeStep();
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test45");


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
    var0.endPathExpr();
    var0.startTextNodeStep(10);
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test46");


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
    var0.startRelativeLocationPath();
    org.saxpath.helpers.DefaultXPathHandler var23 = new org.saxpath.helpers.DefaultXPathHandler();
    var23.endFunction();
    var23.startUnaryExpr();
    var23.endTextNodeStep();
    var23.startPredicate();
    var23.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var23.startRelationalExpr();
    var23.startUnionExpr();
    var23.startAdditiveExpr();
    var23.startAndExpr();
    var23.startRelativeLocationPath();
    var23.startEqualityExpr();
    boolean var37 = var0.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test47");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startAllNodeStep((-1));
    var0.literal("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endProcessingInstructionNodeStep();
    var0.endPathExpr();
    var0.startXPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test48");


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
    var0.startAllNodeStep(0);
    var0.endFilterExpr();
    var0.endAbsoluteLocationPath();
    var0.startUnionExpr();
    var0.startAdditiveExpr();

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test49");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", 100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\n          ^");

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test50");


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
    var0.endMultiplicativeExpr(10);
    var0.endMultiplicativeExpr(10);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test51");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test52");


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
    var0.number(100);
    var0.endFilterExpr();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endEqualityExpr(0)\n(6) startNameStep(100, \"\", \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\")\n(7) startUnaryExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test54");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startNameStep((-1), "", "org.saxpath.SAXPathParseException: ");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startXPath();
    var0.startEqualityExpr();
    var0.startUnaryExpr();
    var0.endOrExpr(true);
    var0.startOrExpr();

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test55");


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
    var0.endCommentNodeStep();
    var0.startAndExpr();

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test56");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endAdditiveExpr(0);
    var0.startFilterExpr();
    var0.startAllNodeStep((-1));
    var0.startPathExpr();

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test57");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.endMultiplicativeExpr(0);
    var0.endProcessingInstructionNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test58");


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
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test59");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endFilterExpr();
    var0.number(100);
    var0.endXPath();
    var0.endFunction();
    var0.endAdditiveExpr(10);
    var0.startXPath();

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test60");


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
    var0.startAndExpr();
    var0.number(10.0d);
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test61");


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
    var0.endNameStep();

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test62");


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
    org.saxpath.conformance.ConformanceXPathHandler var32 = new org.saxpath.conformance.ConformanceXPathHandler();
    var32.startAbsoluteLocationPath();
    var32.endEqualityExpr((-1));
    var32.endTextNodeStep();
    var32.startAllNodeStep(0);
    var32.endOrExpr(false);
    var32.startMultiplicativeExpr();
    var32.startMultiplicativeExpr();
    var32.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");
    var32.startUnaryExpr();
    var32.endAdditiveExpr((-1));
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    org.saxpath.conformance.ConformanceXPathHandler var50 = new org.saxpath.conformance.ConformanceXPathHandler();
    var50.startAbsoluteLocationPath();
    var50.endUnaryExpr(10);
    var50.number(1);
    var50.startAllNodeStep((-1));
    var50.startOrExpr();
    var50.endFunction();
    var50.startRelativeLocationPath();
    var50.endAdditiveExpr(1);
    var50.endRelationalExpr(10);
    var50.startTextNodeStep(0);
    var0.setXPathHandler((org.saxpath.XPathHandler)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test63");


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
    var0.startFilterExpr();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test64");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endAllNodeStep();
    var0.startUnaryExpr();
    var0.number(1);
    var0.startAdditiveExpr();

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test65");


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
    var0.number(0.0d);
    var0.endAndExpr(true);
    var0.endOrExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test66");


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
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endNameStep();
    var19.number(0);
    var19.startProcessingInstructionNodeStep((-1), " ^");
    var19.endRelativeLocationPath();
    var19.startCommentNodeStep((-1));
    var19.startUnionExpr();
    var19.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    boolean var34 = var0.equals((java.lang.Object)var19);
    var19.endRelativeLocationPath();
    var19.endRelativeLocationPath();
    var19.endFilterExpr();
    var19.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test67");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("^", 0, "hi!");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getXPath();
    int var8 = var3.getPosition();
    java.lang.String var9 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "^"+ "'", var7.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "^"+ "'", var9.equals("^"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test68");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endCommentNodeStep();
    var0.literal("");
    var0.endRelationalExpr(100);
    var0.startAndExpr();
    var0.startAbsoluteLocationPath();
    var0.endRelationalExpr((-1));
    var0.endAndExpr(false);
    var0.endUnaryExpr(100);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test69");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.endAndExpr(true);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n", " ^");
    var0.endFilterExpr();
    var0.number(100);
    var0.endAdditiveExpr((-1));
    var0.startAdditiveExpr();

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test70");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    com.werken.saxpath.XPathReader var7 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var8 = new org.saxpath.conformance.ConformanceXPathHandler();
    var8.startAbsoluteLocationPath();
    var8.endUnaryExpr(10);
    var8.number(1);
    var8.startAllNodeStep((-1));
    var8.startOrExpr();
    var7.setXPathHandler((org.saxpath.XPathHandler)var8);
    var7.parse("org.saxpath.SAXPathException: ");
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endUnaryExpr(10);
    var20.number(1);
    var20.startAllNodeStep((-1));
    var20.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endAndExpr(true);
    var29.startUnionExpr();
    boolean var34 = var20.equals((java.lang.Object)var29);
    var29.endAdditiveExpr(0);
    var29.startRelativeLocationPath();
    var29.startMultiplicativeExpr();
    var7.setXPathHandler((org.saxpath.XPathHandler)var29);
    var29.endRelativeLocationPath();
    var29.endFunction();
    var29.startMultiplicativeExpr();
    boolean var43 = var0.equals((java.lang.Object)var29);
    var29.startXPath();
    var29.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test71");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.number((-1.0d));
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endCommentNodeStep();
    var0.startRelationalExpr();
    var0.endEqualityExpr(10);
    var0.startFilterExpr();

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test72");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    boolean var8 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAndExpr(false);
    var0.endUnaryExpr((-1));
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test73");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAndExpr(true);
    var0.startXPath();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.startMultiplicativeExpr();
    var0.startTextNodeStep(0);
    var0.endOrExpr(true);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test74");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 100: (0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) startAdditiveExpr()\n(2) startPredicate()\n(3) startAllNodeStep(-1)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) startAllNodeStep(-1)\n(7) endAdditiveExpr(-1)\n(8) number(-1)\n(9) endRelationalExpr(1)\n(10) startCommentNodeStep(0)\n(11) startAbsoluteLocationPath()\n");

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test75");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startNameStep(1, "^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endOrExpr(true);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test76");


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
    var0.startTextNodeStep(100);
    var0.startUnaryExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var0.startAndExpr();
    var0.startCommentNodeStep(10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test77");


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
    var0.endCommentNodeStep();

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test78");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.startAllNodeStep(100);
    var0.startFunction("org.saxpath.SAXPathException: ", " ^");
    var0.startAndExpr();
    var0.endAndExpr(true);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test79");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: ^\n          ^");

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test80");


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
    var0.endAllNodeStep();
    var0.startTextNodeStep(100);
    var0.endTextNodeStep();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test81");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.startXPath();
    var0.endUnaryExpr(1);
    var0.endProcessingInstructionNodeStep();

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test82");


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
    var0.endEqualityExpr(100);
    var0.endUnaryExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test83");


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
    var0.endUnionExpr(true);
    var0.startFunction("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n\n                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test84");


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
    var0.endEqualityExpr((-1));
    var0.startEqualityExpr();

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test85");


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
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endMultiplicativeExpr((-1));
    var0.number((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test86");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startMultiplicativeExpr()\n(4) endFilterExpr()\n(5) startCommentNodeStep(100)\n(6) endNameStep()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startMultiplicativeExpr()\n(4) endFilterExpr()\n(5) startCommentNodeStep(100)\n(6) endNameStep()\n"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test87");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n");
    var0.number(100);
    var0.startAbsoluteLocationPath();
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) endUnionExpr(false)\n(6) endPredicate()\n");
    var0.startCommentNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test88");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("");
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var11 = var3.getSuppressed();
    java.lang.String var12 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.getPositionMarker();
    java.lang.String var18 = var16.toString();
    org.saxpath.SAXPathException var19 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    java.lang.String var20 = var16.getMultilineMessage();
    java.lang.String var21 = var16.getMultilineMessage();
    java.lang.String var22 = var16.toString();
    java.lang.String var23 = var16.getXPath();
    java.lang.Throwable[] var24 = var16.getSuppressed();
    org.saxpath.XPathSyntaxException var28 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var16.addSuppressed((java.lang.Throwable)var28);
    java.lang.String var30 = var28.getMultilineMessage();
    java.lang.String var31 = var28.toString();
    java.lang.Throwable[] var32 = var28.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + " ^"+ "'", var17.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var22.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"+ "'", var30.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var31.equals("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test89");


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

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test90");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.endAllNodeStep();

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test91");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endFilterExpr();
    var0.endAndExpr(false);
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.startRelativeLocationPath();
    var0.endCommentNodeStep();
    var0.startFunction("(0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) startAdditiveExpr()\n(2) startPredicate()\n(3) startAllNodeStep(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n");
    var0.endUnaryExpr(100);
    var0.endXPath();
    var0.endPathExpr();

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test92");


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
    var70.startAllNodeStep(100);
    var70.endRelativeLocationPath();
    
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test93");


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
    var0.endEqualityExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test94");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.number((-1.0d));
    var0.startEqualityExpr();
    var0.endAllNodeStep();
    var0.number(0.0d);
    var0.endXPath();
    var0.endCommentNodeStep();
    var0.endRelationalExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test95");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.endPathExpr();
    var0.endAndExpr(true);
    var0.endMultiplicativeExpr(100);
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);
    var0.number(10.0d);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test96");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.endFilterExpr();
    var0.startAndExpr();
    var0.number(10.0d);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test97");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("^", 0, "hi!");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.getXPath();
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "^"+ "'", var9.equals("^"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test98");


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
    var18.startXPath();
    var18.endFilterExpr();
    var18.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test99");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.startFilterExpr();
    var0.endAbsoluteLocationPath();
    var0.endAllNodeStep();

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test100");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.startRelationalExpr();
    var0.endCommentNodeStep();
    var0.endUnionExpr(true);
    var0.endAllNodeStep();

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test101");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endEqualityExpr((-1));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test102");


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
    var20.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var20.startFilterExpr();
    var20.endFunction();
    var20.startOrExpr();
    var20.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test103");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAllNodeStep(1)\n");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getXPath();
    int var7 = var5.getPosition();
    int var8 = var5.getPosition();
    int var9 = var5.getPosition();
    int var10 = var5.getPosition();
    java.lang.String var11 = var5.getMultilineMessage();
    java.lang.String var12 = var5.toString();
    java.lang.String var13 = var5.getMultilineMessage();
    java.lang.String var14 = var5.getMultilineMessage();
    java.lang.String var15 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test104");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endFilterExpr();
    var0.endPathExpr();
    var0.startPredicate();

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test105");


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
    var33.endProcessingInstructionNodeStep();
    var33.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test106");


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
    var0.number((-1.0d));
    var0.startEqualityExpr();
    var0.startUnaryExpr();

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test107");


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
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endAndExpr(true);
    var11.endRelationalExpr(0);
    var11.endFilterExpr();
    var11.endOrExpr(true);
    var11.endNameStep();
    var11.startEqualityExpr();
    var11.startPathExpr();
    var11.endXPath();
    boolean var24 = var0.equals((java.lang.Object)var11);
    var0.startXPath();
    var0.number((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test108");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    var0.startXPath();
    var0.startAndExpr();
    var0.endFunction();
    var0.endEqualityExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test109");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("\n ^\n ^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getPositionMarker();
    java.lang.String var7 = var5.toString();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var5);
    java.lang.String var9 = var5.getMultilineMessage();
    java.lang.String var10 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    org.saxpath.XPathSyntaxException var15 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    var1.addSuppressed((java.lang.Throwable)var15);
    org.saxpath.XPathSyntaxException var22 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", 1, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    java.lang.String var23 = var22.getPositionMarker();
    java.lang.String var24 = var22.toString();
    java.lang.String var25 = var22.toString();
    java.lang.Throwable[] var26 = var22.getSuppressed();
    org.saxpath.SAXPathException var27 = new org.saxpath.SAXPathException((java.lang.Throwable)var22);
    org.saxpath.SAXPathException var28 = new org.saxpath.SAXPathException((java.lang.Throwable)var27);
    var1.addSuppressed((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + " ^"+ "'", var6.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var16.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + " ^"+ "'", var23.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n"+ "'", var24.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n"+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test110");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "");
    var0.endMultiplicativeExpr(10);
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n");
    var0.endOrExpr(true);
    var0.startEqualityExpr();
    var0.number(100.0d);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test111");


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
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test112");


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
    var27.startProcessingInstructionNodeStep(0, "^");
    var27.endRelativeLocationPath();
    var27.endAdditiveExpr(100);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test113");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: ", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(100);
    var0.startTextNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n:org.saxpath.SAXPathException:  ^\")\n(5) endCommentNodeStep()\n(6) startEqualityExpr()\n(7) startRelationalExpr()\n(8) endFunction()\n");
    var0.endRelativeLocationPath();

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test114");


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
    var0.literal("");
    var0.endRelationalExpr(1);
    var0.startXPath();
    var0.startAndExpr();
    var0.startAndExpr();

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test115");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startUnaryExpr();
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.startUnaryExpr();

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test116");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startAllNodeStep(1);
    var0.endCommentNodeStep();

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test117");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) number(100.0)\n(7) endAllNodeStep()\n");

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test118");


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
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endNameStep();
    var19.number(0);
    var19.startProcessingInstructionNodeStep((-1), " ^");
    var19.endRelativeLocationPath();
    var19.startCommentNodeStep((-1));
    var19.startUnionExpr();
    var19.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    boolean var34 = var0.equals((java.lang.Object)var19);
    var19.endRelativeLocationPath();
    var19.endRelativeLocationPath();
    var19.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test119");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test120");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endAdditiveExpr(100);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^");
    java.lang.String var19 = var0.toString();
    var0.number(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelativeLocationPath()\n(8) endOrExpr(false)\n(9) endAdditiveExpr(100)\n(10) startProcessingInstructionNodeStep(100, \"org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\")\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) startRelativeLocationPath()\n(8) endOrExpr(false)\n(9) endAdditiveExpr(100)\n(10) startProcessingInstructionNodeStep(100, \"org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^\")\n"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test121");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startFilterExpr();
    var0.startXPath();
    var0.number(100.0d);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.endTextNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endTextNodeStep()\n(7) endFilterExpr()\n(8) startUnionExpr()\n(9) endProcessingInstructionNodeStep()\n");
    var0.endFunction();

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test122");


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
    var0.endXPath();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test123");


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
    var0.endUnionExpr(false);
    var0.endEqualityExpr(100);
    var0.number((-1));
    var0.startEqualityExpr();

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test124");


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
    var0.startEqualityExpr();
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test125");


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
    java.lang.String var26 = var17.getPositionMarker();
    
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
    assertTrue("'" + var26 + "' != '" + " ^"+ "'", var26.equals(" ^"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test126");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endTextNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startTextNodeStep(10);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test127");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr((-1));
    var0.startAdditiveExpr();

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test128");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startAdditiveExpr();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.endTextNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endUnionExpr(false)\n");

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test129");


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
    var0.endXPath();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.startNameStep(0, "org.saxpath.SAXPathException: \n ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test130");


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
    var0.number(1);
    var0.endUnaryExpr(0);
    var0.endProcessingInstructionNodeStep();

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test131");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAdditiveExpr(1);
    var0.startAllNodeStep((-1));
    var0.endAllNodeStep();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\ncom.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\n          ^", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n(4) variableReference(\"hi!:(0) endAllNodeStep()\n(1) endAllNodeStep()\n\")\n");

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test132");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test133");


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
    var0.number(1);
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();
    var0.endTextNodeStep();

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test134");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startEqualityExpr();
    var0.endPathExpr();

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test135");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(1);
    var0.number(0.0d);
    var0.startPredicate();

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test136");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endFunction();
    var0.endXPath();
    var0.startPredicate();
    var0.startOrExpr();

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test137");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startPathExpr();
    var0.endAdditiveExpr(10);
    var0.endProcessingInstructionNodeStep();
    var0.endUnionExpr(true);
    var0.number(10);
    var0.startCommentNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test138");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startPathExpr();
    var0.startAndExpr();
    var0.startRelativeLocationPath();

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test139");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startEqualityExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(100);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test140");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startCommentNodeStep(1)\n(4) startUnionExpr()\n", 10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endPredicate()\n(8) endFilterExpr()\n(9) endUnionExpr(false)\n(10) endPredicate()\n");

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test141");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startAllNodeStep(10);
    var0.endRelationalExpr((-1));
    var0.endXPath();
    var0.endUnionExpr(false);
    var0.endAndExpr(true);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test142");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.endAllNodeStep();
    var0.startNameStep(0, "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n");
    var0.endAllNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) startFunction(\" ^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n\")\n(3) variableReference(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:child\")\n(4) endRelativeLocationPath()\n(5) startPathExpr()\n(6) endAllNodeStep()\n(7) startPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n(8) endCommentNodeStep()\n(9) startPredicate()\n(10) endRelationalExpr(0)\n(11) endFilterExpr()\n");
    var0.startUnionExpr();

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test143");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("hi!", " ^");
    var0.endRelationalExpr(100);
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endTextNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) startFunction(\"org.saxpath.SAXPathException:  ^: ^\")\n(5) endAbsoluteLocationPath()\n(6) endCommentNodeStep()\n(7) number(10)\n(8) endPathExpr()\n(9) endFunction()\n(10) startCommentNodeStep(100)\n(11) endMultiplicativeExpr(100)\n(12) endFunction()\n");
    var0.endEqualityExpr((-1));
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test144");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.number((-1));
    var0.endFilterExpr();

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test145");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.endAdditiveExpr(100);
    var0.endOrExpr(false);
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test146");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.endRelationalExpr((-1));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test147");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startPathExpr();
    var0.startXPath();

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test148");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startNameStep(0, "child", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startRelationalExpr();
    var0.startCommentNodeStep(10);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test149");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endFunction();
    var0.startAndExpr();

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test150");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep(10, "          ^");
    var0.endAndExpr(true);
    var0.startOrExpr();

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test151");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.literal("org.saxpath.SAXPathException:  ^");
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(100, "child");
    var0.startAllNodeStep(10);
    var0.endPredicate();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startRelativeLocationPath()\n(8) startFilterExpr()\n", "org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test152");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test153");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startAndExpr();
    var0.startAllNodeStep(1);
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test154");


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
    var51.startAllNodeStep(0);
    var51.startFunction("^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\norg.saxpath.SAXPathException: child\n                                                                                                    ^");
    var51.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var57.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test155");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startAdditiveExpr();
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep(10);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test156");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var0.endCommentNodeStep();
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.endAndExpr(true);
    var0.endUnionExpr(true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test157");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var11 = var7.getSuppressed();
    int var12 = var7.getPosition();
    java.lang.String var13 = var7.getXPath();
    int var14 = var7.getPosition();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var7);
    
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
    assertTrue(var14 == 1);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test158");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.number(10.0d);
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^");

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test159");


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
    var0.startFilterExpr();
    var0.startEqualityExpr();

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test160");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endFunction();
    var0.startRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.endPredicate();

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test161");


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
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    java.lang.String var15 = var0.toString();
    var0.startCommentNodeStep(0);
    var0.startAndExpr();
    var0.endMultiplicativeExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test162");


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
    var0.endNameStep();
    java.lang.String var19 = var0.toString();
    var0.endUnionExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.startNameStep((-1), "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endAdditiveExpr(-1)\n(6) startPathExpr()\n(7) startRelativeLocationPath()\n(8) startNameStep(1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: child\")\n(9) startAdditiveExpr()\n(10) endFilterExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startXPath()\n(7) startMultiplicativeExpr()\n(8) endCommentNodeStep()\n(9) endNameStep()\n");
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test163");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test164");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.endAndExpr(false);
    var0.endAndExpr(true);
    var0.endRelationalExpr(10);
    var0.endFunction();

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test165");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.endAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(100, "(0) endAllNodeStep()\n(1) endTextNodeStep()\n");
    var0.endEqualityExpr(0);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n");
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endAbsoluteLocationPath()\n(6) startProcessingInstructionNodeStep(100, \"(0) endAllNodeStep()\n(1) endTextNodeStep()\n\")\n(7) endEqualityExpr(0)\n(8) literal(\"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n\")\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endAbsoluteLocationPath()\n(6) startProcessingInstructionNodeStep(100, \"(0) endAllNodeStep()\n(1) endTextNodeStep()\n\")\n(7) endEqualityExpr(0)\n(8) literal(\"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n\")\n"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test166");


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
    var1.startAllNodeStep(100);
    var1.startAdditiveExpr();

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test167");


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
    java.lang.String var16 = var0.toString();
    var0.startCommentNodeStep(0);
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) number(1.0)\n(7) startUnaryExpr()\n(8) startAndExpr()\n(9) number(0.0)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) number(1.0)\n(7) startUnaryExpr()\n(8) startAndExpr()\n(9) number(0.0)\n"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test168");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test169");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startEqualityExpr();
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endRelativeLocationPath();
    var0.startPredicate();
    var0.startPathExpr();
    var0.endMultiplicativeExpr(0);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test170");


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
    var8.endTextNodeStep();
    var8.endRelationalExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test171");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endAdditiveExpr(0);
    var0.endFilterExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n");
    var0.startAndExpr();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endTextNodeStep();
    var0.endEqualityExpr(0);
    var0.startOrExpr();

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test172");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\nhi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\n^");

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test173");


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
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n ^");

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test174");


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
    var0.endCommentNodeStep();
    var0.endAllNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n");
    var0.endFunction();

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test175");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endOrExpr(false);
    var0.endMultiplicativeExpr(10);
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.startPredicate();
    var0.endAdditiveExpr(10);
    var0.startMultiplicativeExpr();

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test176");


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
    var0.endOrExpr(true);
    var0.endProcessingInstructionNodeStep();

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) startXPath()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test178");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n", "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep(100);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test179");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();
    var0.endRelationalExpr((-1));
    var0.number(1.0d);
    var0.startEqualityExpr();

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test180");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startTextNodeStep(100);
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startAllNodeStep(100);
    var0.startTextNodeStep(10);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test181");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "child", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAdditiveExpr(1);
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test182");


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
    var0.startCommentNodeStep(0);
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(true)\n(5) endEqualityExpr(1)\n(6) startCommentNodeStep(0)\n(7) endPathExpr()\n(8) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\n                                                                                                    ^\")\n(9) endFunction()\n(10) startPredicate()\n(11) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^:(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^\")\n");
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test183");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.endRelativeLocationPath();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.number((-1));
    var0.startFilterExpr();
    var0.endOrExpr(false);
    var0.endMultiplicativeExpr(10);
    var0.number(0);
    var0.endPredicate();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test184");


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
    var0.endOrExpr(false);
    var0.startXPath();
    var0.startRelationalExpr();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test185");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n", (-1), "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "^"+ "'", var4.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^"+ "'", var5.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^"+ "'", var6.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test186");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    var0.startMultiplicativeExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test187");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^", (-1), "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) startUnaryExpr()\n(5) endRelativeLocationPath()\n(6) literal(\"\")\n(7) startOrExpr()\n");
    int var4 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test188");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startPredicate();
    var0.endFilterExpr();
    var0.endXPath();

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test189");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.literal(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startPredicate();
    var0.startTextNodeStep(100);
    var0.startAllNodeStep((-1));
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.startCommentNodeStep(10);
    var19.endFunction();
    var19.startNameStep(0, "org.saxpath.SAXPathException:  ^", "");
    var19.endFilterExpr();
    var19.number(100);
    var19.endAbsoluteLocationPath();
    var19.startCommentNodeStep(1);
    boolean var35 = var0.equals((java.lang.Object)var19);
    var19.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test190");


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
    var8.startEqualityExpr();
    var8.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"+ "'", var19.equals("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test191");


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
    java.lang.String var15 = var3.getXPath();
    java.lang.String var16 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var8.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var12.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test192");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep(10, "          ^");
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: child", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    var0.startAdditiveExpr();
    var0.startPredicate();

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test193");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startAndExpr();
    var0.endFilterExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n");
    var0.number(100);
    var0.endMultiplicativeExpr((-1));
    var0.endOrExpr(true);
    var0.startFilterExpr();
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test194");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) startFilterExpr()\n(7) startCommentNodeStep(10)\n(8) endEqualityExpr(10)\n(9) startAbsoluteLocationPath()\n(10) endRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test195");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    var0.endEqualityExpr(0);
    var0.startRelationalExpr();
    var0.startUnaryExpr();

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test196");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startPathExpr();
    var0.endAdditiveExpr(10);
    var0.endProcessingInstructionNodeStep();
    var0.endUnionExpr(true);
    var0.number(10);
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test197");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.literal(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startPredicate();
    var0.startAndExpr();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.endTextNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test198");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endMultiplicativeExpr(0);
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.endNameStep();
    var0.endUnionExpr(true);
    var0.startOrExpr();
    var0.endTextNodeStep();
    var0.startRelationalExpr();
    var0.endCommentNodeStep();

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test199");


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
    var0.endUnionExpr(true);
    var0.startPredicate();
    var0.endAndExpr(true);
    var0.endAdditiveExpr(1);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test200");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endAndExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test201");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.endFunction();
    var0.startUnionExpr();
    var0.endNameStep();
    var0.startTextNodeStep(10);
    var0.startTextNodeStep(0);
    var0.startOrExpr();

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test202");


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
    var1.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startRelativeLocationPath()\n(6) endAllNodeStep()\n(7) startAllNodeStep(1)\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    var1.startUnionExpr();

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test203");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.endEqualityExpr(0);
    var0.startProcessingInstructionNodeStep(0, "^");
    var0.endUnaryExpr(10);
    var0.endMultiplicativeExpr((-1));
    var0.endOrExpr(true);
    var0.endAndExpr(true);
    var0.endTextNodeStep();
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test204");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.literal("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startRelationalExpr();

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test205");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) endFilterExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startXPath()\n(4) endTextNodeStep()\n(5) startPredicate()\n");

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test206");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.endFilterExpr();
    var0.endTextNodeStep();
    var0.startFilterExpr();

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test207");


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
    var0.startRelativeLocationPath();
    var0.startFilterExpr();
    java.lang.String var15 = var0.toString();
    var0.startCommentNodeStep(0);
    var0.startAndExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n\n                                                                                                    ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test208");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startOrExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endFunction();
    var0.endAdditiveExpr((-1));
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endAdditiveExpr(-1)\n(6) startPathExpr()\n(7) startRelativeLocationPath()\n(8) startNameStep(1, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n\", \"com.werken.saxpath.XPathSyntaxException: -1: child\")\n(9) startAdditiveExpr()\n(10) endFilterExpr()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var0.endOrExpr(true);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test209");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.endAdditiveExpr((-1));
    var0.endUnaryExpr(0);
    var0.endOrExpr(false);
    var0.startPredicate();

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test210");


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
    var0.endFunction();
    var0.startCommentNodeStep(100);
    var0.endMultiplicativeExpr(100);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(100, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(8) startFilterExpr()\n");
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test211");


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
    var0.endUnaryExpr(1);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test212");


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
    var0.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test213");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();
    var0.variableReference("", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.number(0);
    var0.endRelationalExpr(1);
    var0.endAdditiveExpr(100);
    var0.endUnaryExpr(100);
    var0.number((-1.0d));
    var0.endRelationalExpr(100);
    var0.endTextNodeStep();

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test214");


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
    var0.startPredicate();
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test215");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startUnaryExpr();
    var0.endPredicate();

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test216");


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
    var0.endEqualityExpr(100);
    var0.startFilterExpr();

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test217");


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
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test218");


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
    var13.endXPath();
    var13.startAbsoluteLocationPath();
    var13.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test219");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.startUnaryExpr();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.startAdditiveExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var0.startPredicate();
    var0.startRelativeLocationPath();
    var0.number(10.0d);
    var0.startXPath();
    var0.endPredicate();

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test220");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.literal("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startUnionExpr();
    var0.endFilterExpr();
    var0.endXPath();

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test221");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(1);
    var0.endMultiplicativeExpr((-1));
    var0.endCommentNodeStep();
    var0.endOrExpr(true);
    var0.endRelationalExpr(0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test222");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startTextNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.endRelationalExpr(0);
    var0.endRelativeLocationPath();

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test223");


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
    var0.startUnionExpr();
    var0.endNameStep();
    var0.endOrExpr(false);
    var0.endAllNodeStep();

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test224");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "namespace");
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(100);
    var0.startAndExpr();
    var0.endXPath();
    var0.endXPath();

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test225");


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
    var0.startAllNodeStep(100);
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.endUnaryExpr((-1));
    var0.endAndExpr(false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test226");


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
    var0.endOrExpr(false);
    var0.startRelationalExpr();

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test227");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endTextNodeStep();
    var0.endPredicate();
    var0.endFilterExpr();

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test228");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.endNameStep();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endFilterExpr()\n(7) startAdditiveExpr()\n(8) endNameStep()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endFilterExpr()\n(7) startAdditiveExpr()\n(8) endNameStep()\n"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test229");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startAdditiveExpr();
    var0.startRelativeLocationPath();
    var0.endEqualityExpr(0);
    var0.startPredicate();
    var0.endAllNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test230");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.startFilterExpr();
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.number(100.0d);
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) endXPath()\n(7) endTextNodeStep()\n");
    var0.startPathExpr();

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test231");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "^"+ "'", var4.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "^"+ "'", var7.equals("^"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test232");


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
    var0.startPathExpr();
    var0.startRelativeLocationPath();

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test233");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.endUnionExpr(true);
    var0.startPathExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endAllNodeStep()\n(8) startUnionExpr()\n");
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test234");


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
    var0.startAllNodeStep(10);
    var0.startOrExpr();
    java.lang.String var18 = var0.toString();
    var0.endCommentNodeStep();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test235");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.number(1);
    var0.number(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test236");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.endPathExpr();

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test237");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.startAllNodeStep((-1));
    var0.endPredicate();
    var0.endAndExpr(false);
    var0.startUnaryExpr();

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test238");


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
    var0.startRelativeLocationPath();
    var0.startOrExpr();
    var0.startAllNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test239");


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
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test240");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.literal(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) endPredicate()\n(6) startAbsoluteLocationPath()\n(7) startAdditiveExpr()\n(8) literal(\" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(9) endFilterExpr()\n(10) endUnionExpr(false)\n"+ "'", var17.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n(3) literal(\"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(4) endUnionExpr(false)\n(5) endPredicate()\n(6) startAbsoluteLocationPath()\n(7) startAdditiveExpr()\n(8) literal(\" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(9) endFilterExpr()\n(10) endUnionExpr(false)\n"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test241");


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
    var0.startFilterExpr();
    var0.startRelationalExpr();
    var0.number(1);
    var0.startXPath();

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test242");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.startUnaryExpr();
    var0.endNameStep();
    var0.startFilterExpr();
    var0.startXPath();

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test243");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endRelationalExpr(1);
    var0.endFilterExpr();
    var0.endEqualityExpr(0);
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.number(1);
    var0.endCommentNodeStep();

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test244");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n(7) startEqualityExpr()\n");

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test245");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getPosition();
    int var10 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test246");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endRelationalExpr(1);
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endFilterExpr();
    var0.startPredicate();
    var0.endUnionExpr(false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test247");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startNameStep(0, "org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.number(1.0d);
    var0.endAdditiveExpr((-1));
    var0.startPredicate();
    var0.startAbsoluteLocationPath();

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test248");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(10);
    var0.endEqualityExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);
    var0.startFilterExpr();
    var0.endUnionExpr(true);
    var0.endOrExpr(false);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test249");


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
    var0.startPathExpr();
    var0.startXPath();

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test250");


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
    org.saxpath.helpers.DefaultXPathHandler var20 = new org.saxpath.helpers.DefaultXPathHandler();
    var20.number(10.0d);
    var20.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var20.endPredicate();
    var20.startAdditiveExpr();
    var20.endAbsoluteLocationPath();
    var20.startAdditiveExpr();
    var20.startProcessingInstructionNodeStep(1, "hi!");
    boolean var33 = var0.equals((java.lang.Object)"hi!");
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.startUnaryExpr();
    var0.endEqualityExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test251");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endEqualityExpr((-1));
    var0.startRelationalExpr();
    var0.endAdditiveExpr(100);
    java.lang.String var12 = var0.toString();
    var0.endMultiplicativeExpr((-1));
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(-1)\n(6) startRelationalExpr()\n(7) endAdditiveExpr(100)\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(-1)\n(6) startRelationalExpr()\n(7) endAdditiveExpr(100)\n"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test252");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.startFilterExpr();
    var0.startCommentNodeStep(0);
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test253");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAllNodeStep(10);
    var0.endEqualityExpr(0);
    var0.startXPath();
    var0.startXPath();
    var0.endUnionExpr(false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test254");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test255");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.endAdditiveExpr(10);
    var0.endUnaryExpr(100);
    var0.number(100.0d);
    var0.endPredicate();

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test256");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endFilterExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.startOrExpr();
    var0.number((-1.0d));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test257");


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
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test258");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endAbsoluteLocationPath();
    var0.endUnionExpr(false);
    var0.startRelationalExpr();

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test259");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    java.lang.String var5 = var0.toString();
    var0.startUnaryExpr();
    var0.startAndExpr();
    var0.startAllNodeStep(0);
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startRelativeLocationPath()\n(8) startXPath()\n(9) startXPath()\n(10) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endAndExpr(true)\n(7) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \", \" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(8) startRelationalExpr()\n(9) endUnionExpr(true)\n(10) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n ^:com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test260");


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
    var7.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) endPredicate()\n(4) endProcessingInstructionNodeStep()\n(5) startAdditiveExpr()\n(6) startFilterExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) endUnaryExpr(0)\n");
    var7.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test261");


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
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.endRelationalExpr((-1));
    var0.endTextNodeStep();

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test262");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endNameStep();
    var0.endFilterExpr();
    var0.endMultiplicativeExpr(10);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test263");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startAdditiveExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startRelativeLocationPath();
    var0.endTextNodeStep();
    var0.startUnaryExpr();

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test264");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    org.saxpath.XPathSyntaxException var6 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.getPositionMarker();
    var6.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var14 = var10.toString();
    var1.addSuppressed((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var11.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + " ^"+ "'", var12.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test265");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endXPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endOrExpr(false);
    var0.endTextNodeStep();

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test266");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endAllNodeStep();
    var0.startAllNodeStep(1);
    var0.startTextNodeStep(0);
    var0.endPathExpr();

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test267");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endUnaryExpr(100);
    var0.startAdditiveExpr();
    var0.endFilterExpr();

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test268");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAndExpr()\n(6) endUnaryExpr(0)\n(7) startXPath()\n(8) startFilterExpr()\n(9) startAndExpr()\n");

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test269");


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
    var6.endPredicate();
    var6.startAndExpr();
    var6.startFilterExpr();
    var6.endEqualityExpr(1);
    var6.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test270");


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
    var0.endEqualityExpr(1);
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startAbsoluteLocationPath()\n(5) startAdditiveExpr()\n(6) startAbsoluteLocationPath()\n(7) startXPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test271");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\norg.saxpath.SAXPathParseException: \nhi!\n^\n^");

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test272");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("hi!", " ^");
    var0.endRelationalExpr(100);
    var0.startOrExpr();
    var0.startAndExpr();
    var0.endTextNodeStep();
    var0.startXPath();
    var0.endPredicate();
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.endCommentNodeStep();
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test273");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) startUnionExpr()\n(6) endFunction()\n(7) endAbsoluteLocationPath()\n");
    var0.startAdditiveExpr();

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test274");


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
    var5.startUnaryExpr();
    var5.endFilterExpr();
    var5.startFilterExpr();
    var5.startUnaryExpr();
    var5.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) number(10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"+ "'", var10.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test275");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endPathExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ", "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endFunction();
    var0.startXPath();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) startUnaryExpr()\n(6) number(1.0)\n(7) endOrExpr(true)\n");
    var0.startTextNodeStep(10);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test276");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endNameStep();
    java.lang.String var10 = var0.toString();
    var0.startEqualityExpr();
    var0.startOrExpr();
    var0.endAdditiveExpr(0);
    var0.endAbsoluteLocationPath();
    var0.number(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test277");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr(0);
    var0.startRelationalExpr();
    var0.startEqualityExpr();

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test278");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^", (-1), "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\norg.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^\n^"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\norg.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^\n^"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test279");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.endAllNodeStep();
    var0.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endPathExpr()\n(4) startAdditiveExpr()\n(5) startUnionExpr()\n(6) startAdditiveExpr()\n(7) startMultiplicativeExpr()\n(8) endRelativeLocationPath()\n(9) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) startNameStep(100, \" ^\", \" ^\")\n(2) number(0.0)\n\", \"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n\")\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test280");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startFilterExpr();
    var0.startPredicate();
    var0.startPredicate();
    var0.startAllNodeStep(0);
    var0.endProcessingInstructionNodeStep();
    var0.startUnionExpr();
    var0.startNameStep(0, "hi!\n^\n^", "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\norg.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: \n          ^");
    var0.endAdditiveExpr(0);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test281");


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
    var0.endTextNodeStep();
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.number((-1.0d));
    var0.endAdditiveExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test282");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startOrExpr();
    var0.startRelationalExpr();
    var0.startAllNodeStep(100);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test283");


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
    var0.endCommentNodeStep();
    var0.endAdditiveExpr((-1));
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test284");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startCommentNodeStep(1);
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test285");


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
    var0.endAllNodeStep();
    var0.endXPath();

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test286");


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
    var0.startMultiplicativeExpr();
    var0.startAllNodeStep(100);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: (0) variableReference(\"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(1) startAdditiveExpr()\n(2) startPredicate()\n(3) startAllNodeStep(-1)\n");
    var0.endFunction();

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test287");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.endRelativeLocationPath();
    var0.startPathExpr();
    var0.startOrExpr();

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test288");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getXPath();
    java.lang.String var6 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"+ "'", var6.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test289");


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
    boolean var18 = var0.equals((java.lang.Object)"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endXPath();
    var0.endUnaryExpr((-1));
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test290");


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
    var45.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test291");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.endMultiplicativeExpr(100);
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.startMultiplicativeExpr();

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test292");


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
    var0.endNameStep();
    var0.startAdditiveExpr();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n\n          ^", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test293");


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
    var0.parse("namespace");
    org.saxpath.XPathHandler var40 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    org.saxpath.XPathHandler var43 = var0.getXPathHandler();
    org.saxpath.XPathHandler var44 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test294");


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
    var22.endAndExpr(false);
    var22.startUnionExpr();
    var22.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test295");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(0);
    var0.startPathExpr();
    var0.endPathExpr();
    var0.startEqualityExpr();

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test296");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startXPath();
    var0.startFunction("child", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n");
    var0.startAllNodeStep(0);
    var0.endMultiplicativeExpr(100);
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) number(-1.0)\n(7) variableReference(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startAbsoluteLocationPath()\n(5) startAdditiveExpr()\n(6) startAbsoluteLocationPath()\n(7) startXPath()\n\")\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test297");


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
    var8.endFilterExpr();
    var8.startTextNodeStep(100);
    var8.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test298");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(100);
    var0.startUnaryExpr();
    var0.startTextNodeStep(10);
    var0.number(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test299");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endFilterExpr();
    org.saxpath.helpers.DefaultXPathHandler var7 = new org.saxpath.helpers.DefaultXPathHandler();
    var7.endFunction();
    var7.number(100);
    var7.endNameStep();
    var7.endXPath();
    var7.endAndExpr(false);
    var7.endEqualityExpr(100);
    var7.endPathExpr();
    var7.startXPath();
    var7.startPredicate();
    boolean var20 = var0.equals((java.lang.Object)var7);
    var7.endRelationalExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test300");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n(5) startMultiplicativeExpr()\n(6) endTextNodeStep()\n(7) endAllNodeStep()\n(8) endTextNodeStep()\n(9) startFilterExpr()\n(10) startPredicate()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n(8) endCommentNodeStep()\n(9) startRelationalExpr()\n");
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: -1: (0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) endTextNodeStep()\n(5) startCommentNodeStep(100)\n(6) endPathExpr()\n(7) startMultiplicativeExpr()\n");

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test301");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.endPredicate();
    var0.number((-1));
    var0.startPathExpr();
    var0.endXPath();
    var0.endMultiplicativeExpr(1);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test302");


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
    var0.endPathExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test303");


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
    var9.endOrExpr(false);
    var9.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test304");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.literal("child");
    var0.startAdditiveExpr();
    var0.startRelationalExpr();
    var0.endFilterExpr();

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test305");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", 10, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n\n          ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n\n          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "          ^"+ "'", var6.equals("          ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "          ^"+ "'", var7.equals("          ^"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test306");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n", 100, "hi!");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n", (-1), "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var7);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test307");


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
    var7.startXPath();
    var7.startAndExpr();
    var7.startAbsoluteLocationPath();
    var7.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test308");


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
    var0.endMultiplicativeExpr(10);
    var0.endEqualityExpr(10);
    var0.endTextNodeStep();
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test309");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startOrExpr();
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.endFilterExpr();
    var0.startFilterExpr();
    var0.endMultiplicativeExpr(10);
    var0.startFilterExpr();

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test310");


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
    var21.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test311");


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
    var0.startAllNodeStep(1);
    var0.endNameStep();
    var0.number(1.0d);
    var0.endXPath();
    var0.startTextNodeStep(100);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test312");


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
    var0.startPredicate();
    var0.startRelativeLocationPath();

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test313");


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
    var18.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test314");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.startXPath();
    var0.startOrExpr();
    var0.startPredicate();
    var0.endAndExpr(false);
    var0.startRelationalExpr();
    var0.endPathExpr();

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test315");


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
    var18.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) endFunction()\n(5) startUnaryExpr()\n(6) endUnaryExpr(-1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startCommentNodeStep(100)\n(6) endFilterExpr()\n(7) endPredicate()\n(8) endFilterExpr()\n(9) endUnionExpr(false)\n(10) endPredicate()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test316");


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
    var0.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test317");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.endRelationalExpr(100);
    var0.startCommentNodeStep(100);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) number(10)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test319");


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
    var15.startPredicate();
    var15.endRelativeLocationPath();
    var15.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test320");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.variableReference("", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.endPathExpr();
    var0.endUnaryExpr(10);
    var0.startUnaryExpr();

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test321");


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
    var0.startRelativeLocationPath();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startPathExpr()\n");

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test322");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.literal("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test323");


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
    var0.endMultiplicativeExpr((-1));
    var0.endOrExpr(true);
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test324");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endXPath();
    var0.endRelationalExpr(0);
    var0.endEqualityExpr((-1));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test325");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endAndExpr(false);
    var0.endNameStep();
    var0.endAndExpr(true);
    var0.number(100);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test326");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(0, "hi!");
    var0.endPredicate();
    var0.endAdditiveExpr(100);
    var0.startPathExpr();
    var0.literal("hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n\n^");

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test327");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.endNameStep();
    var0.startFilterExpr();
    var0.endRelationalExpr(0);
    var0.number(1.0d);
    var0.endOrExpr(true);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startUnaryExpr()\n(7) endFilterExpr()\n(8) endFunction()\n(9) startXPath()\n(10) endRelationalExpr(0)\n");
    var0.startUnionExpr();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) endNameStep()\n(5) startFilterExpr()\n(6) endRelationalExpr(0)\n(7) number(1.0)\n(8) endOrExpr(true)\n(9) startProcessingInstructionNodeStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startUnaryExpr()\n(7) endFilterExpr()\n(8) endFunction()\n(9) startXPath()\n(10) endRelationalExpr(0)\n\")\n(10) startUnionExpr()\n"+ "'", var17.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) endNameStep()\n(5) startFilterExpr()\n(6) endRelationalExpr(0)\n(7) number(1.0)\n(8) endOrExpr(true)\n(9) startProcessingInstructionNodeStep(-1, \"(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startUnaryExpr()\n(7) endFilterExpr()\n(8) endFunction()\n(9) startXPath()\n(10) endRelationalExpr(0)\n\")\n(10) startUnionExpr()\n"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test328");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) endAndExpr(true)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n");
    var0.endNameStep();
    org.saxpath.helpers.DefaultXPathHandler var19 = new org.saxpath.helpers.DefaultXPathHandler();
    var19.number(10.0d);
    var19.endRelativeLocationPath();
    var19.startRelativeLocationPath();
    var19.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var19.endRelationalExpr(1);
    var19.endAndExpr(false);
    var19.startTextNodeStep(100);
    var19.startUnaryExpr();
    boolean var34 = var0.equals((java.lang.Object)var19);
    var19.endAdditiveExpr(0);
    var19.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test329");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startTextNodeStep(100);
    var0.startAbsoluteLocationPath();

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test330");


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
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.endPathExpr();

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test331");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startPathExpr();
    var0.endPredicate();
    var0.startUnionExpr();
    var0.endUnaryExpr(1);
    var0.endMultiplicativeExpr(100);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test332");


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
    var0.endPredicate();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test333");


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
    var7.endAbsoluteLocationPath();
    var7.endAndExpr(false);
    var7.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test334");


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
    var0.endXPath();
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test335");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endFilterExpr();
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr(10);
    var0.startCommentNodeStep(100);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test336");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAdditiveExpr()\n(4) endPathExpr()\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(1)\n(6) startEqualityExpr()\n(7) endPredicate()\n(8) startMultiplicativeExpr()\n");
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr(10);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test337");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.startXPath();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test338");


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
    var9.endUnaryExpr(100);
    var9.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test339");


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
    var18.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test340");


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
    var13.number(100);
    var13.number(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test341");


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
    var7.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n", "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n");
    var7.startEqualityExpr();
    var7.startAndExpr();
    var7.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n", "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endFunction()\n(7) startRelationalExpr()\n");
    var7.startMultiplicativeExpr();
    var7.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test342");


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
    var0.startFunction("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) startUnionExpr()\n(6) startOrExpr()\n(7) startPathExpr()\n(8) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathParseException: \")\n(9) startRelationalExpr()\n(10) startProcessingInstructionNodeStep(10, \"com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n");
    var0.endPredicate();

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test343");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endRelationalExpr((-1));
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.endAllNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n(8) startTextNodeStep(1)\n");

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test344");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAdditiveExpr(-1)\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");
    var0.startPredicate();
    var0.endAndExpr(false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test345");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.number(100.0d);
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(0);
    var0.endAdditiveExpr(10);
    var0.endPathExpr();

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test346");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.number(10.0d);
    var0.endPredicate();
    var0.startFilterExpr();
    var0.startXPath();
    var0.endTextNodeStep();

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test347");


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
    var0.endRelationalExpr(10);
    var0.endFilterExpr();

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test348");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endUnionExpr(true)\n(3) startFilterExpr()\n(4) startAdditiveExpr()\n", 0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endUnionExpr(true)\n(10) endAndExpr(true)\n(11) endRelationalExpr(-1)\n(12) startRelationalExpr()\n(13) startFilterExpr()\n");

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test349");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endOrExpr(true);
    java.lang.String var12 = var0.toString();
    var0.startPathExpr();
    var0.startEqualityExpr();
    var0.endEqualityExpr(10);
    var0.endNameStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) endRelativeLocationPath()\n(5) endAdditiveExpr(0)\n(6) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startProcessingInstructionNodeStep(1, \" ^\")\n(5) startFilterExpr()\n(6) startNameStep(0, \"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n\")\n(7) endAllNodeStep()\n(8) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test350");


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
    var0.number(10);
    java.lang.String var14 = var0.toString();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) number(10)\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) startXPath()\n(6) endFunction()\n(7) number(10)\n"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test351");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();
    var0.number((-1.0d));
    var0.endUnaryExpr(0);
    var0.endMultiplicativeExpr((-1));
    var0.startEqualityExpr();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(1);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test352");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test353");


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
    var0.startPredicate();
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test354");


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
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test355");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startXPath();
    var0.startCommentNodeStep(10);
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endFunction();

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test356");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startAllNodeStep((-1));
    var0.literal("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep((-1));
    var0.endFilterExpr();
    var0.endAdditiveExpr(10);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test357");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endPathExpr();
    var0.endNameStep();
    var0.startAndExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n(9) variableReference(\"com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(10) endProcessingInstructionNodeStep()\n");
    var0.endPredicate();

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test358");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startMultiplicativeExpr();
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr(10);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test359");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n\n          ^");

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test360");


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
    var0.endAllNodeStep();
    var0.number(10.0d);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test361");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.endRelationalExpr((-1));
    var0.endFilterExpr();
    var0.startAbsoluteLocationPath();

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test362");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) endRelativeLocationPath()\n(5) endAdditiveExpr(0)\n(6) endRelativeLocationPath()\n");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var6 = var5.getXPath();
    java.lang.String var7 = var5.getMultilineMessage();
    int var8 = var5.getPosition();
    java.lang.String var9 = var5.getMultilineMessage();
    java.lang.String var10 = var5.getMultilineMessage();
    java.lang.String var11 = var5.getMultilineMessage();
    java.lang.String var12 = var5.getMultilineMessage();
    var1.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test363");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\ncom.werken.saxpath.XPathSyntaxException: 100:  ^\n          ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) literal(\" ^\")\n(4) startAndExpr()\n(5) startAllNodeStep(1)\n(6) startUnaryExpr()\n");
    var0.endOrExpr(false);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test364");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    java.lang.String var5 = var0.toString();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n"+ "'", var5.equals("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test365");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.number(0.0d);
    var0.endOrExpr(false);
    var0.startEqualityExpr();
    var0.endXPath();

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test366");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.endFilterExpr();
    var0.endPredicate();
    var0.startAndExpr();

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test367");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endAllNodeStep();
    var0.startFunction("org.saxpath.SAXPathException:  ^", " ^");
    var0.number(100.0d);
    var0.endMultiplicativeExpr((-1));
    var0.endPathExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\n          ^");
    var0.number(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test368");


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
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endFilterExpr();

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test369");


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
    var0.endFunction();
    var0.startRelativeLocationPath();

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test370");


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
    var0.startCommentNodeStep(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test371");


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
    var0.endEqualityExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startFilterExpr()\n(6) startAllNodeStep(0)\n(7) endXPath()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startFilterExpr()\n(6) startAllNodeStep(0)\n(7) endXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test372");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endXPath();
    var0.endAndExpr(true);
    org.saxpath.helpers.DefaultXPathHandler var11 = new org.saxpath.helpers.DefaultXPathHandler();
    var11.number(10.0d);
    var11.endNameStep();
    var11.endUnionExpr(false);
    var11.endNameStep();
    var11.endProcessingInstructionNodeStep();
    boolean var19 = var0.equals((java.lang.Object)var11);
    var0.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test373");


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
    var7.endAdditiveExpr((-1));
    var7.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test374");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.number(1.0d);
    var0.endPathExpr();
    var0.startPredicate();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n");
    var0.startAbsoluteLocationPath();

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test375");


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
    var0.endOrExpr(false);
    var0.startOrExpr();
    var0.literal("(0) startXPath()\n");

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test376");


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
    org.saxpath.conformance.ConformanceXPathHandler var31 = new org.saxpath.conformance.ConformanceXPathHandler();
    var31.endAllNodeStep();
    var31.endTextNodeStep();
    var31.startFilterExpr();
    var31.endProcessingInstructionNodeStep();
    var31.variableReference("hi!", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var31.startPathExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n(9) startAllNodeStep(1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test377");


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
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test378");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n\norg.saxpath.SAXPathException:  ^\n ^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n\norg.saxpath.SAXPathException:  ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathException:  ^"+ "'", var6.equals("org.saxpath.SAXPathException:  ^"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test379");


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
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endPredicate();
    var0.endMultiplicativeExpr(1);
    var0.endPathExpr();
    var0.endRelationalExpr(1);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test380");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.number((-1.0d));
    var0.endPathExpr();
    var0.endPathExpr();
    var0.startUnaryExpr();
    var0.startFilterExpr();

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test381");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startOrExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startXPath();
    var0.startUnaryExpr();
    var0.endOrExpr(false);
    var0.startAndExpr();

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test382");


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
    int var15 = var3.getPosition();
    java.lang.String var16 = var3.getPositionMarker();
    
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
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " ^"+ "'", var16.equals(" ^"));

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test383");


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
    var0.endAdditiveExpr(10);
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test384");


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
    var25.startRelationalExpr();
    var25.startPathExpr();
    var25.startRelativeLocationPath();
    var25.endAdditiveExpr(0);
    var25.startCommentNodeStep(100);
    var25.startOrExpr();

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test385");


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
    var0.endMultiplicativeExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test386");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.endXPath();
    var0.endUnionExpr(false);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");
    var0.startMultiplicativeExpr();

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test387");


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
    org.saxpath.XPathHandler var26 = var0.getXPathHandler();
    org.saxpath.XPathHandler var27 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var28 = new org.saxpath.helpers.DefaultXPathHandler();
    var28.number(10.0d);
    var28.endPathExpr();
    var28.startOrExpr();
    var28.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var28.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var28.startUnionExpr();
    var28.startCommentNodeStep(1);
    var28.startRelativeLocationPath();
    var28.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n(6) endUnaryExpr(10)\n");
    var28.startPredicate();
    var28.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endAllNodeStep()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test388");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startProcessingInstructionNodeStep(0, "hi!");
    var0.endXPath();
    var0.endCommentNodeStep();
    var0.startAbsoluteLocationPath();

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test389");


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
    var7.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) startAbsoluteLocationPath()\n(11) startAndExpr()\n(12) startPathExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) startUnionExpr()\n(6) endFunction()\n(7) endAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test390");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endAdditiveExpr(10);
    var0.endRelativeLocationPath();
    var0.startFilterExpr();
    var0.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test391");


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
    var9.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n(7) endAbsoluteLocationPath()\n(8) endEqualityExpr(1)\n(9) endRelationalExpr(10)\n");
    var9.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) endFilterExpr()\n(8) startAdditiveExpr()\n(9) endPathExpr()\n(10) startAllNodeStep(10)\n(11) startOrExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) endFunction()\n\n^");
    var9.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n"+ "'", var25.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n"));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test392");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endNameStep()\n(6) endMultiplicativeExpr(1)\n(7) endOrExpr(false)\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startTextNodeStep(0)\n(4) endAndExpr(true)\n(5) endProcessingInstructionNodeStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) endAbsoluteLocationPath()\n(3) endEqualityExpr(100)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n:(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n\")\n");
    var3.addSuppressed((java.lang.Throwable)var7);
    int var9 = var3.getPosition();
    org.saxpath.XPathSyntaxException var13 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: -1: child", 10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var3.addSuppressed((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test393");


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
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startFunction(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endEqualityExpr(10)\n(6) startAllNodeStep(-1)\n(7) startEqualityExpr()\n(8) startUnionExpr()\n(9) literal(\"          ^\")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) startRelativeLocationPath()\n(3) startTextNodeStep(10)\n(4) endXPath()\n(5) endUnionExpr(false)\n");
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test394");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startAllNodeStep(10);
    var0.endMultiplicativeExpr((-1));
    var0.startFilterExpr();
    var0.variableReference(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endRelativeLocationPath();

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test395");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAllNodeStep(10);
    var0.startUnaryExpr();
    var0.endPredicate();
    var0.endFilterExpr();
    var0.endXPath();

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test396");


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
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startPredicate();
    var0.startAbsoluteLocationPath();
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.startPathExpr();

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test397");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endUnaryExpr(100);
    var0.startMultiplicativeExpr();

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test398");


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
    var0.endXPath();

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test399");


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
    var0.startOrExpr();
    var0.endAdditiveExpr(10);
    var0.startAndExpr();
    var0.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test400");


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
    var17.endFunction();
    var17.number(100);
    var17.endNameStep();
    var17.endXPath();
    var17.endRelationalExpr((-1));
    var17.startAbsoluteLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var17);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) endRelativeLocationPath()\n(5) endAdditiveExpr(0)\n(6) endRelativeLocationPath()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n");
    org.saxpath.XPathHandler var31 = var0.getXPathHandler();
    org.saxpath.conformance.ConformanceXPathHandler var32 = new org.saxpath.conformance.ConformanceXPathHandler();
    var32.startAbsoluteLocationPath();
    var32.endUnaryExpr(10);
    var32.number(1);
    var32.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var32.startAbsoluteLocationPath();
    var32.startCommentNodeStep(1);
    var32.endFilterExpr();
    var32.endTextNodeStep();
    var32.endTextNodeStep();
    var32.number(100.0d);
    var32.startPredicate();
    var0.setXPathHandler((org.saxpath.XPathHandler)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test401");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n");

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test402");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n");
    org.saxpath.SAXPathParseException var3 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n"+ "'", var5.equals("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test403");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startCommentNodeStep(1);
    var0.startRelationalExpr();
    var0.endPredicate();

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test404");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n");
    var0.endCommentNodeStep();
    var0.endAbsoluteLocationPath();

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test405");


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
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n", "(0) endAllNodeStep()\n(1) endTextNodeStep()\n");
    var0.startEqualityExpr();

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test406");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) startFilterExpr()\n(7) literal(\"child\")\n(8) startUnaryExpr()\n(9) endAdditiveExpr(100)\n");
    var0.endCommentNodeStep();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endPathExpr()\n");
    var0.startAdditiveExpr();

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test407");


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
    var0.startXPath();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endUnaryExpr(-1)\n(3) startUnionExpr()\n(4) startRelativeLocationPath()\n(5) startTextNodeStep(10)\n(6) startPredicate()\n(7) endPathExpr()\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^");

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test408");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endAbsoluteLocationPath()\n(6) variableReference(\" ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(7) endUnionExpr(false)\n(8) number(100)\n(9) startUnaryExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test409");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endPredicate();
    var0.endMultiplicativeExpr(10);
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.startPredicate();

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test410");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n", 1, "com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.XPathSyntaxException var8 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    int var9 = var8.getPosition();
    java.lang.Throwable[] var10 = var8.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var12 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n"+ "'", var12.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test411");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.startFilterExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startOrExpr();
    var0.number(100.0d);
    var0.startAbsoluteLocationPath();

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test412");


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
    var0.endUnaryExpr((-1));
    var0.endFilterExpr();
    var0.startPredicate();
    var0.startTextNodeStep((-1));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test413");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.endFunction();
    var0.literal("org.saxpath.SAXPathException: ");
    var0.startPathExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endMultiplicativeExpr(1);
    var0.startTextNodeStep(10);
    var0.endRelationalExpr(100);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test414");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.number(0.0d);
    var0.number((-1));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test415");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.endFunction();
    var0.startMultiplicativeExpr();
    org.saxpath.helpers.DefaultXPathHandler var6 = new org.saxpath.helpers.DefaultXPathHandler();
    var6.number(10.0d);
    var6.endPathExpr();
    var6.startOrExpr();
    var6.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var6.endFilterExpr();
    var6.startAllNodeStep(10);
    var6.number(1.0d);
    var6.startCommentNodeStep((-1));
    var6.startFilterExpr();
    var6.startAbsoluteLocationPath();
    var6.startFunction("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endUnionExpr(true)\n(10) endAndExpr(true)\n(11) endRelationalExpr(-1)\n");
    boolean var26 = var0.equals((java.lang.Object)"com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test416");


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
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAllNodeStep(100)\n(3) endOrExpr(false)\n(4) number(10)\n(5) endPathExpr()\n(6) startAdditiveExpr()\n", "com.werken.saxpath.XPathSyntaxException: 100: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    var0.endRelationalExpr(0);
    var0.endFilterExpr();

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test417");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startEqualityExpr();
    var0.endAdditiveExpr(0);
    var0.endTextNodeStep();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) startEqualityExpr()\n");
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n");
    var0.number(10.0d);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test418");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "org.saxpath.SAXPathException: ");
    var0.variableReference("          ^", "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endProcessingInstructionNodeStep();
    var0.endUnaryExpr(1);
    var0.startFilterExpr();

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test419");


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
    var8.startCommentNodeStep(100);
    var8.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) endOrExpr(false)\n");
    var8.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endAllNodeStep()\n(10) endRelationalExpr(0)\n(11) endRelativeLocationPath()\n(12) endAllNodeStep()\n(13) startNameStep(1, \"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^\", \"org.saxpath.SAXPathException: \n ^\n ^\")\n(14) startRelativeLocationPath()\n", "(0) endAllNodeStep()\n(1) endXPath()\n(2) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n\")\n(3) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(4) endAndExpr(false)\n");
    var8.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startPathExpr()\n(4) endUnionExpr(false)\n(5) endRelativeLocationPath()\n(6) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\")\n(7) endXPath()\n(8) startAndExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) startFilterExpr()\n(8) endXPath()\n(9) startOrExpr()\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test420");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPathExpr();
    var0.number((-1));
    var0.startUnionExpr();
    var0.endAdditiveExpr((-1));
    var0.endUnaryExpr(1);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test421");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "org.saxpath.SAXPathException: ");
    var0.endAndExpr(true);
    var0.endRelationalExpr(10);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test422");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    java.lang.Throwable[] var3 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test423");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endFunction();
    var0.startTextNodeStep(1);
    var0.startMultiplicativeExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) endOrExpr(false)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n");
    var0.number(10);
    var0.startAdditiveExpr();

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test424");


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
    var0.startUnaryExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.startAbsoluteLocationPath();

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test425");


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
    var0.endAllNodeStep();

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test426");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep((-1));
    var0.endCommentNodeStep();
    var0.endAdditiveExpr(1);
    var0.startRelativeLocationPath();
    var0.startXPath();
    var0.startCommentNodeStep(100);
    var0.startXPath();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test427");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.startTextNodeStep(1);
    var0.startCommentNodeStep(100);
    var0.startFilterExpr();
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n\n                                                                                                    ^");

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test428");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.number(100.0d);
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test429");


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
    var0.literal("org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) startAbsoluteLocationPath()\n(5) number(-1.0)\n(6) startEqualityExpr()\n(7) endAllNodeStep()\n");
    var0.endProcessingInstructionNodeStep();

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test430");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endEqualityExpr((-1));
    var0.endUnaryExpr(1);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test431");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endPredicate();
    var0.startEqualityExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test432");


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
    org.saxpath.helpers.DefaultXPathHandler var64 = new org.saxpath.helpers.DefaultXPathHandler();
    var64.number(10.0d);
    var64.endNameStep();
    var64.number(0);
    var64.endFunction();
    var64.endPredicate();
    var64.startEqualityExpr();
    var64.endTextNodeStep();
    var64.endAdditiveExpr(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var64);
    var64.number(0);
    var64.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var31.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test433");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    java.lang.String var9 = var0.toString();
    var0.endNameStep();
    var0.startAndExpr();
    var0.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n"));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test434");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    java.lang.String var5 = var0.toString();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n"+ "'", var5.equals("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test435");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(100);
    var0.endAndExpr(true);
    var0.endNameStep();
    var0.endPredicate();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test436");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAdditiveExpr(10);
    var0.startPredicate();
    var0.startUnionExpr();
    var0.endUnaryExpr(1);
    var0.startUnaryExpr();
    var0.endMultiplicativeExpr(1);
    var0.endCommentNodeStep();
    var0.startAdditiveExpr();
    var0.endUnionExpr(true);
    var0.endTextNodeStep();

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test437");


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
    var23.startCommentNodeStep(0);
    var23.startOrExpr();
    var23.startUnionExpr();
    var23.startAbsoluteLocationPath();
    var23.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "org.saxpath.SAXPathException: ");
    var23.endUnionExpr(true);
    var23.endRelationalExpr(1);
    var23.endAbsoluteLocationPath();
    var23.startCommentNodeStep(10);
    var23.literal("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n");
    var0.setXPathHandler((org.saxpath.XPathHandler)var23);
    var23.startUnaryExpr();
    var23.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test438");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    java.lang.String var9 = var3.getXPath();
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "^"+ "'", var7.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test439");


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
    java.lang.String var20 = var15.getXPath();
    org.saxpath.SAXPathException var21 = new org.saxpath.SAXPathException((java.lang.Throwable)var15);
    org.saxpath.SAXPathException var23 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    org.saxpath.XPathSyntaxException var27 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endUnionExpr(true)\n(10) endAndExpr(true)\n(11) endRelationalExpr(-1)\n", 100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n");
    var23.addSuppressed((java.lang.Throwable)var27);
    var21.addSuppressed((java.lang.Throwable)var27);
    
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
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test440");


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
    var13.variableReference("com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 1: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n\n          ^");
    var13.startPathExpr();
    org.saxpath.conformance.ConformanceXPathHandler var29 = new org.saxpath.conformance.ConformanceXPathHandler();
    var29.startAbsoluteLocationPath();
    var29.endTextNodeStep();
    var29.endAdditiveExpr(1);
    java.lang.String var34 = var29.toString();
    var29.startRelativeLocationPath();
    var29.startUnaryExpr();
    var29.endRelativeLocationPath();
    var29.literal("");
    var29.endRelationalExpr(1);
    var29.startFilterExpr();
    var29.endRelationalExpr(1);
    var29.startAdditiveExpr();
    var29.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endRelativeLocationPath()\n(7) startFilterExpr()\n(8) endPredicate()\n(9) startEqualityExpr()\n");
    boolean var48 = var13.equals((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var34.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test441");


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
    var27.startPathExpr();
    var27.endPathExpr();
    var27.endFunction();
    var27.startRelativeLocationPath();
    var27.startFilterExpr();
    var27.endOrExpr(true);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test442");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endCommentNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");
    var0.endRelativeLocationPath();

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test443");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.variableReference("hi!", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var0.startPathExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.startXPath();
    var0.endFunction();
    var0.endAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endPathExpr()\n(5) startXPath()\n", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test444");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endMultiplicativeExpr(0);
    var0.endMultiplicativeExpr(10);
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startXPath()\n(4) endXPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n(7) endXPath()\n(8) startRelativeLocationPath()\n(9) number(100)\n(10) startRelativeLocationPath()\n(11) startFilterExpr()\n");
    var0.startAbsoluteLocationPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) number(100)\n(5) endUnaryExpr(10)\n");
    var0.endFunction();

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test445");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.startPathExpr();
    var0.endFunction();

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test446");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startMultiplicativeExpr();
    var0.endAbsoluteLocationPath();
    var0.endMultiplicativeExpr(100);
    var0.endAllNodeStep();
    var0.startPathExpr();

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test447");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(0);
    var0.startPathExpr();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.endCommentNodeStep();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test448");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endUnionExpr(true);
    var0.endProcessingInstructionNodeStep();
    var0.endFilterExpr();
    var0.endUnionExpr(true);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test449");


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
    var0.startXPath();
    var0.endPredicate();
    var0.endUnionExpr(false);
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test450");


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
    org.saxpath.conformance.ConformanceXPathHandler var46 = new org.saxpath.conformance.ConformanceXPathHandler();
    var46.startRelativeLocationPath();
    var46.endOrExpr(false);
    var46.endNameStep();
    var46.startPathExpr();
    var46.startOrExpr();
    var46.endAbsoluteLocationPath();
    var46.endTextNodeStep();
    var46.startAllNodeStep(100);
    var0.setXPathHandler((org.saxpath.XPathHandler)var46);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) startAllNodeStep(1)\n(10) endProcessingInstructionNodeStep()\n(11) startOrExpr()\n(12) startAllNodeStep(-1)\n");
    org.saxpath.helpers.DefaultXPathHandler var60 = new org.saxpath.helpers.DefaultXPathHandler();
    var60.number(10.0d);
    var60.endRelativeLocationPath();
    var60.startRelativeLocationPath();
    var60.endFilterExpr();
    var60.endProcessingInstructionNodeStep();
    var60.endMultiplicativeExpr(0);
    var60.startRelationalExpr();
    var60.variableReference("org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var60.startRelationalExpr();
    var60.startMultiplicativeExpr();
    var60.endPathExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var60);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test451");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endMultiplicativeExpr(100)\n(4) endAndExpr(false)\n(5) startTextNodeStep(10)\n(6) startFunction(\"          ^:\")\n(7) literal(\"(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n\")\n(8) endFunction()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test452");


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
    java.lang.String var14 = var1.toString();
    var1.endPathExpr();
    var1.startAbsoluteLocationPath();
    var1.endTextNodeStep();
    var1.startPathExpr();
    var1.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test453");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.startUnionExpr();
    var0.endUnionExpr(true);
    var0.endXPath();
    var0.endAdditiveExpr(0);
    var0.endXPath();
    var0.startRelativeLocationPath();
    var0.number(100);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test454");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.variableReference("org.saxpath.SAXPathException:  ^", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("hi!", " ^");
    var0.endNameStep();
    var0.endRelativeLocationPath();
    var0.endAbsoluteLocationPath();
    var0.endAdditiveExpr((-1));
    var0.endAdditiveExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test455");


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
    var0.startAllNodeStep(1);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test456");


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
    var0.endRelativeLocationPath();
    var0.startOrExpr();

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test457");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.endOrExpr(true);
    var0.number(100.0d);
    var0.endProcessingInstructionNodeStep();
    var0.endRelativeLocationPath();
    var0.startTextNodeStep((-1));
    var0.endAbsoluteLocationPath();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep((-1), "          ^");
    var0.endTextNodeStep();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\norg.saxpath.SAXPathException:  ^\n                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test458");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.startAdditiveExpr();
    var0.startRelationalExpr();
    var0.startPredicate();
    var0.endMultiplicativeExpr((-1));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test459");


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
    var14.startAllNodeStep(1);
    var14.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test460");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endFilterExpr();
    var0.endPathExpr();
    var0.startTextNodeStep(1);
    var0.startAndExpr();
    var0.startUnaryExpr();

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test461");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.startNameStep(10, "child", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n");
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.startPredicate();

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test462");


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
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n");
    org.saxpath.helpers.DefaultXPathHandler var48 = new org.saxpath.helpers.DefaultXPathHandler();
    var48.number(10.0d);
    var48.endRelativeLocationPath();
    var48.startRelativeLocationPath();
    var48.endFilterExpr();
    var48.endProcessingInstructionNodeStep();
    var48.endNameStep();
    var48.startRelativeLocationPath();
    var0.setXPathHandler((org.saxpath.XPathHandler)var48);
    var48.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endAndExpr(false)\n(5) startUnaryExpr()\n(6) number(1.0)\n(7) endOrExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test463");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAdditiveExpr(1);
    var0.startRelationalExpr();
    var0.startMultiplicativeExpr();
    var0.endUnaryExpr((-1));
    var0.endRelationalExpr(10);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test464");


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
    var0.startTextNodeStep(100);
    var0.number(10.0d);
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endUnionExpr(true)\n(3) startAndExpr()\n(4) startNameStep(-1, \"com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"com.werken.saxpath.XPathSyntaxException: 1: (0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n\")\n");
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test465");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startAndExpr();
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.startOrExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test466");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(0);
    var0.endRelativeLocationPath();
    var0.startRelationalExpr();
    var0.startAbsoluteLocationPath();
    var0.startFilterExpr();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test467");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test468");


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
    var13.endFunction();
    var13.endUnionExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test469");


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
    var0.endAndExpr(false);
    var0.number(1.0d);
    var0.startAndExpr();

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test470");


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
    var0.endUnionExpr(true);
    var0.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test471");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: child\norg.saxpath.SAXPathException:  ^\n^");

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test472");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.number(100);
    var0.endAdditiveExpr((-1));
    var0.endRelativeLocationPath();

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test473");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endPathExpr();
    var0.endEqualityExpr((-1));
    var0.endPredicate();
    var0.number((-1.0d));
    var0.endNameStep();

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test474");


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
    var0.startUnionExpr();
    var0.startTextNodeStep(100);
    var0.startEqualityExpr();
    var0.startTextNodeStep(0);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test475");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.startUnionExpr();
    var0.startOrExpr();
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endAndExpr(false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test476");


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
    var0.endRelationalExpr(10);
    var0.endPathExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test477");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.endRelativeLocationPath();
    var0.endPredicate();
    var0.endUnionExpr(true);
    var0.startRelativeLocationPath();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test478");


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
    var11.endUnionExpr(false);
    var11.number(1);
    var11.endCommentNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test479");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startOrExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endFunction();
    var0.startAllNodeStep(1);
    var0.startRelationalExpr();
    var0.startTextNodeStep(100);
    var0.startAllNodeStep(10);
    var0.endNameStep();

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test480");


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
    var17.endAbsoluteLocationPath();
    var17.endUnionExpr(true);
    var17.endNameStep();
    var17.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test481");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endUnaryExpr(10);
    var0.endFilterExpr();
    var0.endAndExpr(true);
    var0.startRelativeLocationPath();
    var0.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test482");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endXPath();
    var0.startRelationalExpr();
    var0.startTextNodeStep(1);
    var0.endEqualityExpr(1);
    var0.number(10);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test483");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.number(100);
    var0.startUnaryExpr();
    var0.endFunction();
    var0.startAdditiveExpr();
    var0.startPathExpr();
    var0.endAndExpr(true);
    var0.startPredicate();
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) startEqualityExpr()\n(7) startAdditiveExpr()\n(8) endAndExpr(false)\n(9) endEqualityExpr(0)\n(10) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test484");


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
    var0.number(1);
    var0.endProcessingInstructionNodeStep();
    var0.startAllNodeStep(10);
    var0.endOrExpr(false);
    var0.number(1);
    var0.startRelativeLocationPath();
    var0.startFunction("(0) endAllNodeStep()\n(1) endAllNodeStep()\n", "com.werken.saxpath.XPathSyntaxException: -1: child");

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test485");


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
    var9.number(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test486");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.number(100);
    var0.endNameStep();
    var0.endXPath();
    var0.endRelationalExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.number(10);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test487");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startEqualityExpr();
    var0.startUnaryExpr();
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    var0.endAdditiveExpr((-1));
    var0.endOrExpr(true);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test488");


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
    var0.startAdditiveExpr();
    var0.startAdditiveExpr();

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test489");


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
    var0.number(0);
    var0.endAdditiveExpr(0);
    var0.endCommentNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) startMultiplicativeExpr()\n(6) endRelativeLocationPath()\n(7) endFunction()\n(8) endTextNodeStep()\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) startAbsoluteLocationPath()\n(5) startCommentNodeStep(1)\n(6) endUnaryExpr(10)\n(7) number(0.0)\n(8) endXPath()\n");
    var0.startFilterExpr();
    var0.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test490");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startCommentNodeStep(10);
    var0.number(1.0d);
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endUnaryExpr(10);
    var0.endUnionExpr(false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test491");


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
    var0.endRelativeLocationPath();
    var0.endEqualityExpr(1);
    org.saxpath.helpers.DefaultXPathHandler var26 = new org.saxpath.helpers.DefaultXPathHandler();
    var26.endUnaryExpr(100);
    var26.endXPath();
    var26.startNameStep(0, "\n ^\n ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    boolean var34 = var0.equals((java.lang.Object)"\n ^\n ^");
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test492");


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
    var0.endEqualityExpr(1);
    var0.endFilterExpr();

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test493");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endNameStep();
    var0.endEqualityExpr(1);
    var0.number(100.0d);
    var0.startCommentNodeStep(100);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test494");


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
    var8.startCommentNodeStep(100);
    var8.startEqualityExpr();
    var8.endRelativeLocationPath();
    var8.endMultiplicativeExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test495");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.endUnaryExpr(10);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.startUnaryExpr();
    var0.startOrExpr();
    var0.startTextNodeStep(100);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test496");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startAdditiveExpr();
    var0.startMultiplicativeExpr();
    var0.endPredicate();
    var0.number((-1.0d));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test497");


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
    java.lang.String var15 = var0.toString();
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n(5) startMultiplicativeExpr()\n(6) endTextNodeStep()\n(7) endAllNodeStep()\n(8) endTextNodeStep()\n(9) startFilterExpr()\n(10) startPredicate()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n(5) startMultiplicativeExpr()\n(6) endTextNodeStep()\n(7) endAllNodeStep()\n(8) endTextNodeStep()\n(9) startFilterExpr()\n(10) startPredicate()\n"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test498");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endCommentNodeStep();
    var0.literal("");
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.endCommentNodeStep();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startUnionExpr()\n(6) startXPath()\n(7) startPathExpr()\n(8) endUnionExpr(true)\n(9) startXPath()\n(10) endUnaryExpr(-1)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endTextNodeStep()\n(3) startAndExpr()\n(4) variableReference(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\")\n(5) endCommentNodeStep()\n");
    var0.startOrExpr();

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test499");


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
    org.saxpath.helpers.DefaultXPathHandler var12 = new org.saxpath.helpers.DefaultXPathHandler();
    var12.number(10.0d);
    var12.endPathExpr();
    var12.endUnionExpr(false);
    var12.endEqualityExpr(1);
    var12.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var12.startAbsoluteLocationPath();
    var12.startXPath();
    var12.endMultiplicativeExpr(0);
    var12.endFilterExpr();
    var12.endTextNodeStep();
    var12.endEqualityExpr(10);
    var12.startAdditiveExpr();
    boolean var33 = var0.equals((java.lang.Object)var12);
    var12.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest54.test500");


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
    var8.startRelativeLocationPath();
    var8.startXPath();
    var8.startPathExpr();
    var8.endUnionExpr(true);
    var8.startTextNodeStep(10);
    var8.endXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
