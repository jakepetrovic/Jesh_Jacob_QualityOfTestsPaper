package randoop;

import junit.framework.*;

public class RandoopTest3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test1");


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
    var0.number(100);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test2");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endUnionExpr(true);
    var0.endUnionExpr(true);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "child");
    var0.startRelationalExpr();
    var0.endAdditiveExpr(1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test3");


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
    var0.startCommentNodeStep(100);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test4");


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
    org.saxpath.helpers.DefaultXPathHandler var34 = new org.saxpath.helpers.DefaultXPathHandler();
    var34.number(10.0d);
    var34.endNameStep();
    var34.number(0);
    var34.endFunction();
    var34.endPredicate();
    var34.startEqualityExpr();
    var34.startUnionExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var34);
    org.saxpath.conformance.ConformanceXPathHandler var45 = new org.saxpath.conformance.ConformanceXPathHandler();
    var45.startAbsoluteLocationPath();
    var45.endUnaryExpr(10);
    var45.number(1);
    var45.startAllNodeStep((-1));
    var45.startAllNodeStep(0);
    var45.endNameStep();
    java.lang.String var56 = var45.toString();
    var45.endAndExpr(true);
    var45.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    var45.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var24.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var56.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test5");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var6 = var1.toString();
    org.saxpath.XPathSyntaxException var10 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var11 = var10.getXPath();
    int var12 = var10.getPosition();
    int var13 = var10.getPosition();
    int var14 = var10.getPosition();
    int var15 = var10.getPosition();
    var1.addSuppressed((java.lang.Throwable)var10);
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException((java.lang.Throwable)var10);
    org.saxpath.XPathSyntaxException var21 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    int var22 = var21.getPosition();
    int var23 = var21.getPosition();
    java.lang.String var24 = var21.getMultilineMessage();
    java.lang.Throwable[] var25 = var21.getSuppressed();
    java.lang.String var26 = var21.toString();
    var17.addSuppressed((java.lang.Throwable)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var6.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "child\norg.saxpath.SAXPathException:  ^\n^"+ "'", var24.equals("child\norg.saxpath.SAXPathException:  ^\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var26.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test6");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endMultiplicativeExpr(1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test7");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(0)\n(4) number(-1.0)\n(5) startUnionExpr()\n(6) endFilterExpr()\n(7) endTextNodeStep()\n(8) endProcessingInstructionNodeStep()\n");
    var3.addSuppressed((java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test9");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^");
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var11 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "\n ^\n ^"+ "'", var7.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "\n ^\n ^"+ "'", var11.equals("\n ^\n ^"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test10");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.startUnionExpr();
    var0.endXPath();

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test11");


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
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test12");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    java.lang.String var5 = var0.toString();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n", "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test14");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.endRelationalExpr(1);
    var0.endAndExpr(false);
    var0.startTextNodeStep(100);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n", "org.saxpath.SAXPathParseException: ");
    var0.startOrExpr();

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test15");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test16");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startOrExpr()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test17");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.number((-1.0d));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test18");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    java.lang.Throwable[] var8 = var6.getSuppressed();
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "org.saxpath.SAXPathException: "+ "'", var9.equals("org.saxpath.SAXPathException: "));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test19");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAllNodeStep(1);
    var0.startProcessingInstructionNodeStep(100, "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startEqualityExpr();
    var0.endAdditiveExpr(1);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test20");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.startRelativeLocationPath();
    var0.endPathExpr();
    var0.endOrExpr(true);
    var0.startCommentNodeStep(0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test21");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endCommentNodeStep();
    var0.endUnionExpr(true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test22");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.number(10);
    var0.endXPath();
    var0.endTextNodeStep();

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test23");


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
    int var14 = var3.getPosition();
    
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
    assertTrue(var14 == 1);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test24");


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
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test25");


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
    org.saxpath.helpers.DefaultXPathHandler var45 = new org.saxpath.helpers.DefaultXPathHandler();
    var45.endRelativeLocationPath();
    var45.startUnaryExpr();
    var45.startAbsoluteLocationPath();
    var45.startUnaryExpr();
    var45.endAndExpr(false);
    var45.endOrExpr(true);
    var45.number(100.0d);
    var45.endProcessingInstructionNodeStep();
    var0.setXPathHandler((org.saxpath.XPathHandler)var45);
    var45.endEqualityExpr(10);
    var45.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test26");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test27");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n", 100, "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    int var4 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test28");


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
    var0.number(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test29");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endMultiplicativeExpr((-1));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test30");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test31");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(100);
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startFilterExpr();
    var0.endTextNodeStep();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n\n(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\n^");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test32");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startOrExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startNameStep(1, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endUnaryExpr(10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test33");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test34");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    org.saxpath.XPathSyntaxException var11 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var12 = var11.getXPath();
    int var13 = var11.getPosition();
    int var14 = var11.getPosition();
    int var15 = var11.getPosition();
    java.lang.String var16 = var11.getMultilineMessage();
    java.lang.String var17 = var11.getMultilineMessage();
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var19 = var11.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var17.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test35");


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
    var7.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test36");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.endUnionExpr(true);
    var0.startAllNodeStep((-1));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test37");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endMultiplicativeExpr(10);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.startPredicate();

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test38");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.endNameStep();
    var0.endTextNodeStep();
    var0.startPathExpr();
    var0.startPredicate();
    var0.startAbsoluteLocationPath();

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test39");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endRelationalExpr((-1));
    var0.startAdditiveExpr();
    var0.number(0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test40");


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
    var0.endPathExpr();
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n", "org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^");
    var0.startEqualityExpr();
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test41");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathParseException: ", 100, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test42");


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
    var10.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test43");


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
    var8.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    var8.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test44");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "hi!");
    var0.startTextNodeStep(1);
    var0.endAbsoluteLocationPath();
    var0.endUnaryExpr(0);
    var0.startFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");
    var0.endOrExpr(false);
    var0.endAllNodeStep();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test45");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: -1: child");

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test46");


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
    var7.startAllNodeStep((-1));
    var7.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test47");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.literal(" ^");
    var0.startAndExpr();
    var0.startRelationalExpr();
    var0.startUnionExpr();
    var0.startUnaryExpr();
    var0.startUnionExpr();

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test48");


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
    var0.literal("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startRelativeLocationPath();

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test49");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test50");


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
    var0.endOrExpr(false);
    var0.number((-1));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test51");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.startMultiplicativeExpr();
    var0.startAndExpr();

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test52");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.startPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.endNameStep();
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test53");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPathExpr();
    var0.endAndExpr(true);
    var0.startAdditiveExpr();

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test54");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endTextNodeStep()\n(4) endAllNodeStep()\n(5) startTextNodeStep(100)\n(6) endCommentNodeStep()\n(7) endEqualityExpr(100)\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test55");


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
    var0.endPathExpr();
    var0.startEqualityExpr();
    var0.number(100.0d);
    var0.startTextNodeStep(100);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test56");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startAllNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelationalExpr();

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test57");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", 100, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    java.lang.Throwable[] var6 = var5.getSuppressed();
    java.lang.String var7 = var5.getPositionMarker();
    var1.addSuppressed((java.lang.Throwable)var5);
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var13 = var12.getPositionMarker();
    java.lang.String var14 = var12.toString();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var12);
    java.lang.Throwable[] var16 = var12.getSuppressed();
    java.lang.String var17 = var12.toString();
    java.lang.String var18 = var12.getPositionMarker();
    var1.addSuppressed((java.lang.Throwable)var12);
    org.saxpath.SAXPathException var20 = new org.saxpath.SAXPathException((java.lang.Throwable)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "                                                                                                    ^"+ "'", var7.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var14.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var17.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + " ^"+ "'", var18.equals(" ^"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test58");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startOrExpr();
    var0.endAbsoluteLocationPath();
    var0.startMultiplicativeExpr();
    var0.endXPath();
    var0.endAndExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test59");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.getMultilineMessage();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.String var12 = var3.toString();
    
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
    assertTrue("'" + var10 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var10.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test60");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endEqualityExpr((-1));
    var0.endEqualityExpr(100);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test61");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endCommentNodeStep();
    var0.endTextNodeStep();
    var0.endPathExpr();
    var0.endCommentNodeStep();
    var0.startPathExpr();

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test62");


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
    var0.endAbsoluteLocationPath();
    var0.endNameStep();
    var0.startXPath();

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test63");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.number(1.0d);
    var0.startTextNodeStep(1);
    var0.endOrExpr(true);
    var0.startRelativeLocationPath();
    var0.endNameStep();
    var0.number(1);
    var0.startOrExpr();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endXPath()\n(2) number(1.0)\n(3) startTextNodeStep(1)\n(4) endOrExpr(true)\n(5) startRelativeLocationPath()\n(6) endNameStep()\n(7) number(1)\n(8) startOrExpr()\n"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test64");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endUnaryExpr(100);
    var0.startUnaryExpr();
    var0.startTextNodeStep(0);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test65");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test67");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endXPath()\n(6) startFunction(\"com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: : ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\")\n(7) startAllNodeStep(-1)\n(8) endRelationalExpr(0)\n");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test68");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startRelationalExpr();
    var0.endRelationalExpr(10);
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.startTextNodeStep((-1));
    var0.startXPath();

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test69");


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
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test70");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endRelationalExpr((-1));
    var0.endCommentNodeStep();
    var0.number(100.0d);
    var0.endProcessingInstructionNodeStep();

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test71");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.endAndExpr(true);
    var0.endTextNodeStep();
    var0.endOrExpr(false);
    var0.startXPath();

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test72");


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
    var0.endPredicate();
    var0.number(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test73");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.startCommentNodeStep((-1));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test74");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endNameStep();

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test75");


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
    var0.number(0.0d);
    var0.endProcessingInstructionNodeStep();

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test76");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.String var5 = var3.getMultilineMessage();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test77");


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
    var27.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var19.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test78");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    java.lang.String var5 = var0.toString();
    var0.startUnaryExpr();
    var0.startAndExpr();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test79");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test80");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.startPredicate();
    var0.endFilterExpr();
    var0.endAbsoluteLocationPath();

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test81");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("\n ^\n ^", (-1), "(0) startXPath()\n");
    java.lang.String var4 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test82");


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
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test83");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test84");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.startAndExpr();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n", "");
    var0.startProcessingInstructionNodeStep(10, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.endOrExpr(true);
    var0.endFilterExpr();

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test85");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep(10);
    var0.startAdditiveExpr();
    var0.endPredicate();

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test86");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test87");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startFilterExpr();
    var0.startXPath();

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test89");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getXPath();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test90");


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
    var0.startPredicate();

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test91");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.endPredicate();
    var0.endAllNodeStep();
    var0.startPathExpr();
    var0.startCommentNodeStep((-1));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test92");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startAdditiveExpr();
    var0.startAdditiveExpr();
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) endAdditiveExpr(100)\n(6) startAllNodeStep(100)\n(7) endUnaryExpr(10)\n(8) startTextNodeStep(100)\n(9) startXPath()\n");
    var0.startUnionExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep(10);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test93");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.endEqualityExpr(10);
    var0.endPathExpr();
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test94");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startAllNodeStep((-1));
    var0.literal("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startEqualityExpr();

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test95");


    com.werken.saxpath.XPathReader var0 = new com.werken.saxpath.XPathReader();
    org.saxpath.conformance.ConformanceXPathHandler var1 = new org.saxpath.conformance.ConformanceXPathHandler();
    var1.startAbsoluteLocationPath();
    var1.endUnaryExpr(10);
    var1.number(1);
    var1.startAllNodeStep((-1));
    var1.startOrExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var1);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    org.saxpath.XPathHandler var15 = var0.getXPathHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test96");


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
    var0.startAbsoluteLocationPath();

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test97");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startCommentNodeStep((-1));
    var0.endMultiplicativeExpr(10);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test98");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test99");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.endTextNodeStep();
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n");
    var0.startMultiplicativeExpr();

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test100");


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
    var0.startPredicate();

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test101");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.endAllNodeStep();
    var0.endUnaryExpr(0);
    var0.startAbsoluteLocationPath();

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test102");


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
    var11.endEqualityExpr(0);
    var11.startAbsoluteLocationPath();
    var11.endAllNodeStep();
    var11.number((-1.0d));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test103");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.endUnaryExpr(100);
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) endEqualityExpr(100)\n(9) endUnaryExpr(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test104");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.endFunction();
    var0.startRelationalExpr();

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test105");


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
    var0.number((-1));
    var0.startUnaryExpr();
    var0.endFilterExpr();

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test106");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.endXPath();
    var0.endAdditiveExpr((-1));
    var0.startEqualityExpr();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n");
    var0.endXPath();

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test107");


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
    var0.startAbsoluteLocationPath();

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test108");


    int var1 = org.saxpath.Axis.lookup("org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test109");


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
    var22.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test110");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    var0.startCommentNodeStep(100);
    var0.startMultiplicativeExpr();

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test111");


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
    var0.endCommentNodeStep();
    var0.endMultiplicativeExpr(100);
    var0.startAllNodeStep(100);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test112");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test113");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.endEqualityExpr(1);
    var0.endOrExpr(true);
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n");
    var0.startXPath();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test114");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test115");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.startAllNodeStep(100);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test116");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startPredicate();
    var0.startAdditiveExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) startAbsoluteLocationPath()\n(6) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test117");


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
    var0.startTextNodeStep(10);
    var0.endEqualityExpr((-1));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test119");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endXPath();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.number((-1));
    var0.endEqualityExpr(100);
    var0.endProcessingInstructionNodeStep();

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test120");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.endTextNodeStep();
    var0.endFunction();
    var0.endMultiplicativeExpr(0);
    var0.number(10);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test121");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(1);
    var0.startTextNodeStep(10);
    var0.endAndExpr(true);
    var0.startAllNodeStep(10);
    var0.startTextNodeStep((-1));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test122");


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
    var8.number(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"+ "'", var19.equals("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test123");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test124");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\")\n(8) endOrExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test125");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.endRelationalExpr((-1));
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n");

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test126");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endCommentNodeStep();

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test127");


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
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n", "org.saxpath.SAXPathParseException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test128");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endAllNodeStep();
    var0.startTextNodeStep(100);
    var0.endCommentNodeStep();
    var0.endEqualityExpr(100);
    org.saxpath.conformance.ConformanceXPathHandler var12 = new org.saxpath.conformance.ConformanceXPathHandler();
    var12.startAbsoluteLocationPath();
    var12.endUnaryExpr(10);
    var12.number(1);
    var12.startAllNodeStep((-1));
    var12.startOrExpr();
    var12.endAdditiveExpr((-1));
    var12.endPathExpr();
    var12.endRelationalExpr(1);
    var12.endUnaryExpr(0);
    boolean var28 = var0.equals((java.lang.Object)var12);
    java.lang.String var29 = var0.toString();
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endTextNodeStep()\n(4) endAllNodeStep()\n(5) startTextNodeStep(100)\n(6) endCommentNodeStep()\n(7) endEqualityExpr(100)\n"+ "'", var29.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endTextNodeStep()\n(4) endAllNodeStep()\n(5) startTextNodeStep(100)\n(6) endCommentNodeStep()\n(7) endEqualityExpr(100)\n"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test129");


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
    var11.endCommentNodeStep();
    org.saxpath.helpers.DefaultXPathHandler var23 = new org.saxpath.helpers.DefaultXPathHandler();
    var23.number(10.0d);
    var23.endPathExpr();
    var23.startOrExpr();
    var23.endUnionExpr(true);
    var23.endAllNodeStep();
    boolean var31 = var11.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test130");


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
    var9.endAdditiveExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test131");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startPathExpr();
    var0.startXPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test132");


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
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test133");


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
    var9.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test134");


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
    var0.endPathExpr();
    var0.startFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test135");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startOrExpr();
    var0.startUnionExpr();
    var0.startAbsoluteLocationPath();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", "org.saxpath.SAXPathException: ");
    var0.endPathExpr();

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test136");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test137");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endFilterExpr();
    var0.startPathExpr();

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test138");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "^");
    var0.endEqualityExpr(0);
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endRelationalExpr(1);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test139");


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
    var0.endPathExpr();
    var0.endTextNodeStep();

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test140");


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
    var0.endEqualityExpr((-1));
    var0.startPredicate();

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test141");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.getXPath();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var10 = var3.getPositionMarker();
    java.lang.String var11 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "                                                                                                    ^"+ "'", var10.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "                                                                                                    ^"+ "'", var11.equals("                                                                                                    ^"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test142");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
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

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test143");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.endRelativeLocationPath();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endUnaryExpr((-1));
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: -1: (0) startXPath()\n");

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test144");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endOrExpr(false);
    var0.endMultiplicativeExpr(10);
    var0.startCommentNodeStep((-1));
    var0.number(1);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test145");


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
    var0.startUnaryExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endEqualityExpr(1)\n(6) startAndExpr()\n(7) endCommentNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n(7) startRelationalExpr()\n"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test146");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test147");


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
    org.saxpath.helpers.DefaultXPathHandler var36 = new org.saxpath.helpers.DefaultXPathHandler();
    var36.number(10.0d);
    var36.endNameStep();
    var36.startUnaryExpr();
    var36.endFunction();
    var0.setXPathHandler((org.saxpath.XPathHandler)var36);
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
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test148");


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
    java.lang.String var16 = var3.getPositionMarker();
    
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
    assertTrue("'" + var16 + "' != '" + "                                                                                                    ^"+ "'", var16.equals("                                                                                                    ^"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test149");


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
    var0.startTextNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test150");


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
    var17.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test151");


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
    var0.startCommentNodeStep(10);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test152");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 1, "com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.String var4 = var3.toString();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.toString();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var8 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test153");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "child");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.endEqualityExpr((-1));
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) startAbsoluteLocationPath()\n");

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test154");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr((-1));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test155");


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
    var0.startUnionExpr();

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test156");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: -1: hi!\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test157");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.number(100.0d);
    var0.startProcessingInstructionNodeStep((-1), "hi!");
    var0.endMultiplicativeExpr(10);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test158");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("          ^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test159");


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
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"+ "'", var12.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) startAndExpr()\n(8) startAbsoluteLocationPath()\n(9) startPathExpr()\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n(7) startAndExpr()\n(8) startAbsoluteLocationPath()\n(9) startPathExpr()\n"));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test160");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^"+ "'", var5.equals("org.saxpath.SAXPathException:  ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^\n                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "                                                                                                    ^"+ "'", var7.equals("                                                                                                    ^"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test161");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endOrExpr(true);
    var0.startRelationalExpr();

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test162");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(true);
    var0.endPathExpr();
    var0.endEqualityExpr(0);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test163");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelationalExpr(1);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n");
    var0.startProcessingInstructionNodeStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var0.endUnionExpr(false);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test164");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.number(1);
    var0.endTextNodeStep();
    var0.startUnaryExpr();

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test165");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    org.saxpath.XPathSyntaxException var5 = new org.saxpath.XPathSyntaxException("com.werken.saxpath.XPathSyntaxException: 1: ", 1, "com.werken.saxpath.XPathSyntaxException: 10: ^");
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n"+ "'", var7.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test166");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^", "hi!");

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test167");


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
    var0.endAllNodeStep();

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test168");


    int var1 = org.saxpath.Axis.lookup("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test169");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    java.lang.String var8 = var3.getMultilineMessage();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.getXPath();
    org.saxpath.SAXPathException var12 = new org.saxpath.SAXPathException("\n ^\n ^");
    org.saxpath.XPathSyntaxException var16 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var17 = var16.getPositionMarker();
    java.lang.String var18 = var16.toString();
    org.saxpath.SAXPathException var19 = new org.saxpath.SAXPathException((java.lang.Throwable)var16);
    java.lang.String var20 = var16.getMultilineMessage();
    java.lang.String var21 = var16.getMultilineMessage();
    var12.addSuppressed((java.lang.Throwable)var16);
    var3.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var24 = var16.getSuppressed();
    
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
    assertTrue("'" + var17 + "' != '" + " ^"+ "'", var17.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var20.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test170");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test171");


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
    var1.endCommentNodeStep();
    var1.endAbsoluteLocationPath();

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test172");


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
    var12.endMultiplicativeExpr(10);
    var12.startFilterExpr();
    var12.endAllNodeStep();
    var12.startRelativeLocationPath();
    var12.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var12.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test173");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getXPath();
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test174");


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
    var0.startAbsoluteLocationPath();
    var0.startPathExpr();

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test175");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(10);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 10: ^", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.number(1.0d);
    var0.endXPath();

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test176");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n", 10, "child\norg.saxpath.SAXPathException:  ^\n^");
    java.lang.String var4 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test177");


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
    var7.endUnaryExpr(100);
    var7.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test178");


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
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test179");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endMultiplicativeExpr(1);
    var0.endFunction();
    var0.endAndExpr(true);
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test180");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) endAdditiveExpr(-1)\n");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test181");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("hi!", 0, "org.saxpath.SAXPathParseException: ");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var11 = var7.getSuppressed();
    java.lang.String var12 = var7.toString();
    java.lang.String var13 = var7.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test182");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(0);
    var0.startXPath();
    var0.startXPath();
    var0.startRelationalExpr();

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test183");


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
    var0.startTextNodeStep((-1));
    var0.endAdditiveExpr(10);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test184");


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
    org.saxpath.XPathHandler var16 = var0.getXPathHandler();
    org.saxpath.XPathHandler var17 = var0.getXPathHandler();
    org.saxpath.helpers.DefaultXPathHandler var18 = new org.saxpath.helpers.DefaultXPathHandler();
    var18.number(10.0d);
    var18.endRelativeLocationPath();
    var18.startRelativeLocationPath();
    var18.endFilterExpr();
    var18.endAdditiveExpr(100);
    var18.endRelationalExpr((-1));
    var18.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var18.endEqualityExpr((-1));
    var18.endOrExpr(true);
    var18.endRelationalExpr(1);
    var18.endFunction();
    var18.endXPath();
    var18.startPredicate();
    var0.setXPathHandler((org.saxpath.XPathHandler)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test185");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test186");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.startFunction("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endProcessingInstructionNodeStep();
    var0.endTextNodeStep();
    var0.startAdditiveExpr();
    var0.endAndExpr(true);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test187");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();
    var0.startTextNodeStep(1);
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endAllNodeStep();
    var0.endCommentNodeStep();

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test188");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test189");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.endXPath();
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test190");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n");

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test191");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.startOrExpr();
    var0.startXPath();
    var0.startNameStep(10, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.endCommentNodeStep();
    org.saxpath.SAXPathException var17 = new org.saxpath.SAXPathException("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var18 = var17.getSuppressed();
    boolean var19 = var0.equals((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test192");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr((-1));
    var0.startAndExpr();
    var0.literal("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n");
    var0.endUnaryExpr(10);
    var0.endEqualityExpr(1);
    var0.endAndExpr(true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test193");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", 0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.getPositionMarker();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var7.equals("com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"+ "'", var8.equals("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test194");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("");
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.String var12 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test195");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startPathExpr()\n(3) startMultiplicativeExpr()\n(4) endAllNodeStep()\n(5) startAbsoluteLocationPath()\n(6) endNameStep()\n(7) endProcessingInstructionNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test196");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startAndExpr();
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);
    var0.endAllNodeStep();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startEqualityExpr();

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test197");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test198");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endProcessingInstructionNodeStep();
    var0.endAndExpr(true);
    var0.endRelationalExpr(1);
    var0.endOrExpr(true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test199");


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
    java.lang.String var18 = var0.toString();
    var0.endNameStep();
    var0.endRelativeLocationPath();
    java.lang.String var21 = var0.toString();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"+ "'", var18.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endNameStep()\n(8) endRelativeLocationPath()\n"+ "'", var21.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endNameStep()\n(8) endRelativeLocationPath()\n"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test200");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startEqualityExpr();
    var0.startAllNodeStep(100);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test201");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endAndExpr(false);
    var0.startTextNodeStep(1);
    var0.endAllNodeStep();

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test202");


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
    var0.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test203");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endUnaryExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test204");


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
    var7.endUnaryExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test205");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr((-1));
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.endPredicate();
    var0.startUnaryExpr();
    var0.number((-1));
    var0.endUnionExpr(true);
    var0.endAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test206");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n(7) endAdditiveExpr(-1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test207");


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
    var0.literal("com.werken.saxpath.XPathSyntaxException: -1: child");
    var0.startTextNodeStep((-1));
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n", "hi!");
    var0.endFunction();
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test208");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startAllNodeStep(0);
    var0.endFunction();
    var0.startRelativeLocationPath();
    var0.endXPath();
    var0.startOrExpr();

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test209");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathParseException: (0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test210");


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
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test211");


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
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.startAbsoluteLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test212");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.startTextNodeStep(100);
    var0.startRelativeLocationPath();
    var0.startUnionExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test213");


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
    var8.startNameStep(0, "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: hi!", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var8.number(0.0d);
    var8.endAndExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test214");


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
    var0.startPredicate();
    var0.endOrExpr(true);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test215");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endUnionExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test216");


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
    var0.startEqualityExpr();

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test217");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(1);
    org.saxpath.helpers.DefaultXPathHandler var12 = new org.saxpath.helpers.DefaultXPathHandler();
    var12.number(10.0d);
    var12.endPathExpr();
    var12.startOrExpr();
    var12.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var12.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var12.startUnionExpr();
    var12.startCommentNodeStep(1);
    var12.endCommentNodeStep();
    var12.startTextNodeStep(0);
    var12.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "org.saxpath.SAXPathParseException: \nhi!\n^");
    var12.startUnionExpr();
    boolean var33 = var0.equals((java.lang.Object)var12);
    var12.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test218");


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
    var0.endPathExpr();
    var0.endEqualityExpr(1);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test219");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.number((-1));
    var0.endOrExpr(true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test220");


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
    var0.number(10.0d);
    var0.endAndExpr(true);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test221");


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
    var0.startAdditiveExpr();
    var0.startOrExpr();
    var0.endFunction();

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test222");


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
    var0.endCommentNodeStep();

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test223");


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
    var7.variableReference("(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    var7.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endRelationalExpr(10)\n(5) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(6) endUnaryExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n");
    var7.endRelationalExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test224");


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
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test225");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test226");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endUnaryExpr((-1));
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.startProcessingInstructionNodeStep(100, "com.werken.saxpath.XPathSyntaxException: -1: child");

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test227");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test228");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", 100, "org.saxpath.SAXPathException: ");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test229");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startOrExpr();
    var0.endPredicate();

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test230");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.startRelativeLocationPath();
    var0.startAdditiveExpr();
    var0.startTextNodeStep(100);
    var0.number(0);
    var0.endUnionExpr(true);
    var0.startFilterExpr();
    var0.startOrExpr();
    var0.startUnionExpr();

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test231");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startCommentNodeStep(0);
    var0.startMultiplicativeExpr();
    var0.startFilterExpr();

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test232");


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
    var20.endProcessingInstructionNodeStep();
    var20.endAllNodeStep();
    var20.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var26.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test233");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endEqualityExpr(10);
    var0.endMultiplicativeExpr((-1));
    var0.endMultiplicativeExpr((-1));
    var0.endRelativeLocationPath();
    var0.startFilterExpr();

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test234");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.endUnionExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test235");


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
    var0.startAdditiveExpr();
    var0.number(10);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test236");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.startAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.endUnaryExpr(10);
    var0.startRelationalExpr();
    var0.endPredicate();

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test237");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test238");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endUnaryExpr(1);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test239");


    int var1 = org.saxpath.Axis.lookup("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test240");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test241");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.startTextNodeStep(100);
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test242");


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
    var0.startCommentNodeStep(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test243");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startMultiplicativeExpr();
    var0.startMultiplicativeExpr();
    java.lang.String var8 = var0.toString();
    var0.endMultiplicativeExpr(10);
    var0.endAllNodeStep();
    var0.startTextNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) startMultiplicativeExpr()\n"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test244");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(false);
    var0.startFilterExpr();
    var0.variableReference("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");
    var0.number(100.0d);
    var0.endProcessingInstructionNodeStep();

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test245");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    var0.startProcessingInstructionNodeStep((-1), "org.saxpath.SAXPathException:  ^");
    var0.startAdditiveExpr();

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test246");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n", 1, "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n");
    java.lang.String var4 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\n ^"+ "'", var4.equals("(0) startRelativeLocationPath()\n(1) endMultiplicativeExpr(-1)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n\n ^"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test248");


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
    var37.startMultiplicativeExpr();
    var37.endPathExpr();
    
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

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test249");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(false);
    var0.startCommentNodeStep(0);
    var0.endUnionExpr(true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test250");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) endXPath()\n(6) number(1)\n(7) endRelativeLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test251");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startUnionExpr();
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endUnaryExpr(10);
    var11.number(1);
    var11.startAllNodeStep((-1));
    var11.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    var20.startUnionExpr();
    boolean var25 = var11.equals((java.lang.Object)var20);
    var20.endAdditiveExpr(0);
    var20.startRelativeLocationPath();
    var20.endXPath();
    boolean var30 = var0.equals((java.lang.Object)var20);
    var0.endNameStep();
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n\n^");
    var0.endFunction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test252");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var7 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var9 = new org.saxpath.SAXPathException("");
    var3.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var11 = var3.getPositionMarker();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + " ^"+ "'", var11.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var12.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test253");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.startMultiplicativeExpr();
    var0.endAdditiveExpr(0);
    var0.endUnionExpr(true);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test254");


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
    var0.startPathExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) startAllNodeStep(-1)\n(5) literal(\"org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(6) endProcessingInstructionNodeStep()\n(7) literal(\"(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n\")\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test255");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.startFilterExpr();
    var0.endProcessingInstructionNodeStep();
    java.lang.String var5 = var0.toString();
    var0.endAllNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n"+ "'", var5.equals("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) startFilterExpr()\n(3) endProcessingInstructionNodeStep()\n"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test256");


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
    var0.endTextNodeStep();

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test257");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startTextNodeStep(0);
    var0.endAndExpr(true);
    var0.endTextNodeStep();
    var0.endRelationalExpr(100);
    var0.startAllNodeStep(10);
    var0.endUnionExpr(false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test258");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n");

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test259");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endRelativeLocationPath();
    var0.endUnionExpr(false);
    var0.endUnaryExpr(0);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test260");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endRelativeLocationPath();
    var0.number(0);
    var0.startProcessingInstructionNodeStep(10, "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test261");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", 10, "com.werken.saxpath.XPathSyntaxException: 1: ");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test262");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endTextNodeStep();
    var0.startMultiplicativeExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startUnionExpr();
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test263");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.endProcessingInstructionNodeStep();
    var0.endPredicate();
    var0.number(0);
    var0.endAndExpr(true);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test264");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endMultiplicativeExpr((-1));
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test265");


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
    var0.startProcessingInstructionNodeStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) startTextNodeStep(0)\n");
    var0.startAdditiveExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test266");


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
    var0.startTextNodeStep(10);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test267");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: "));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test268");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.endAbsoluteLocationPath();
    var0.startCommentNodeStep(1);
    var0.startXPath();
    var0.startUnionExpr();
    var0.endEqualityExpr(10);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test269");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    int var6 = var3.getPosition();
    java.lang.String var7 = var3.getPositionMarker();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test270");


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
    var0.startAdditiveExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n");
    var0.startAllNodeStep(10);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test271");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    org.saxpath.SAXPathException var5 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var6 = var3.toString();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: 1: "));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test272");


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
    var0.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test273");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endAllNodeStep();
    var0.endXPath();

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test274");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startUnionExpr();
    org.saxpath.conformance.ConformanceXPathHandler var11 = new org.saxpath.conformance.ConformanceXPathHandler();
    var11.startAbsoluteLocationPath();
    var11.endUnaryExpr(10);
    var11.number(1);
    var11.startAllNodeStep((-1));
    var11.startOrExpr();
    org.saxpath.conformance.ConformanceXPathHandler var20 = new org.saxpath.conformance.ConformanceXPathHandler();
    var20.startAbsoluteLocationPath();
    var20.endAndExpr(true);
    var20.startUnionExpr();
    boolean var25 = var11.equals((java.lang.Object)var20);
    var20.endAdditiveExpr(0);
    var20.startRelativeLocationPath();
    var20.endXPath();
    boolean var30 = var0.equals((java.lang.Object)var20);
    var20.literal("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) startCommentNodeStep(100)\n(5) endNameStep()\n(6) endPathExpr()\n(7) endMultiplicativeExpr(0)\n(8) endMultiplicativeExpr(10)\n(9) startAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test275");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 100, " ^");
    int var4 = var3.getPosition();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getPosition();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var8 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 100:  ^"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 100:  ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test276");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.startPathExpr();
    var0.startRelativeLocationPath();
    var0.startAllNodeStep(0);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test277");


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
    var33.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test278");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("\n ^\n ^");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "org.saxpath.SAXPathException: \n ^\n ^"+ "'", var3.equals("org.saxpath.SAXPathException: \n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "org.saxpath.SAXPathException: \n ^\n ^"+ "'", var4.equals("org.saxpath.SAXPathException: \n ^\n ^"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test279");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test280");


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
    var0.endEqualityExpr(100);
    var0.number(0.0d);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test281");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endFilterExpr();
    var0.endUnaryExpr(1);
    var0.startXPath();
    var0.endAndExpr(true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test282");


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
    var0.literal("org.saxpath.SAXPathException: ^");
    var0.endAbsoluteLocationPath();

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test283");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getXPath();
    int var5 = var3.getPosition();
    java.lang.String var6 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test284");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endXPath()\n");

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test285");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endUnaryExpr(100);
    var0.startOrExpr();
    var0.startFilterExpr();
    var0.startRelativeLocationPath();

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test286");


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
    var0.startMultiplicativeExpr();

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test287");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 1: ");
    org.saxpath.SAXPathException var2 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test288");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test289");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.endRelationalExpr(10);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startCommentNodeStep((-1));
    var0.endUnionExpr(true);
    var0.variableReference("org.saxpath.SAXPathException: ^", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test290");


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
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) endPredicate()\n(8) startProcessingInstructionNodeStep(1, \"(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n\")\n(9) endAllNodeStep()\n(10) startAdditiveExpr()\n");

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test291");


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
    var0.endEqualityExpr(0);
    var0.endPathExpr();
    var0.endOrExpr(true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test292");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startProcessingInstructionNodeStep(0, "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startUnionExpr();
    var0.startProcessingInstructionNodeStep((-1), "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "^");
    var0.startRelativeLocationPath();
    var0.endMultiplicativeExpr(100);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test293");


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
    org.saxpath.helpers.DefaultXPathHandler var38 = new org.saxpath.helpers.DefaultXPathHandler();
    var38.number(10.0d);
    var38.endRelativeLocationPath();
    var38.startRelativeLocationPath();
    var38.endFilterExpr();
    var38.endXPath();
    var38.startUnionExpr();
    var38.startXPath();
    var38.endPredicate();
    var38.startTextNodeStep(10);
    var38.endMultiplicativeExpr(10);
    var0.setXPathHandler((org.saxpath.XPathHandler)var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test294");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getPositionMarker();
    int var6 = var3.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "^"+ "'", var5.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test295");


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
    var11.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startAllNodeStep(100)\n(6) startFilterExpr()\n");
    var11.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n(6) endFunction()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endOrExpr(false)\n(6) startAndExpr()\n(7) endFilterExpr()\n(8) endCommentNodeStep()\n");

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test296");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: 1: com.werken.saxpath.XPathSyntaxException: 1: ");

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test297");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endXPath();
    var0.endFilterExpr();
    var0.startAdditiveExpr();
    var0.endUnionExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test298");


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
    var0.startMultiplicativeExpr();
    var0.number(0);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test299");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test300");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startRelativeLocationPath()\n(4) endXPath()\n(5) startUnaryExpr()\n(6) startRelationalExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test301");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: \n^", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");
    var0.startAllNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test302");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endEqualityExpr(10)\n(6) startFunction(\"child:(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n\")\n(7) endUnaryExpr(1)\n(8) startRelativeLocationPath()\n(9) endPredicate()\n(10) endOrExpr(false)\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test303");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("");
    java.lang.String var2 = var1.toString();
    org.saxpath.SAXPathException var4 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var1.addSuppressed((java.lang.Throwable)var4);
    org.saxpath.SAXPathException var6 = new org.saxpath.SAXPathException((java.lang.Throwable)var1);
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var6);
    java.lang.String var8 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathParseException: "+ "'", var2.equals("org.saxpath.SAXPathParseException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "org.saxpath.SAXPathException: "+ "'", var8.equals("org.saxpath.SAXPathException: "));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test304");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startFilterExpr();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n\")\n(8) endOrExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n");

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test305");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endRelationalExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.endAllNodeStep();
    var0.endPredicate();
    var0.startProcessingInstructionNodeStep((-1), "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test306");


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
    var0.endCommentNodeStep();
    var0.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test307");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endNameStep();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) variableReference(\"org.saxpath.SAXPathParseException: :org.saxpath.SAXPathException:  ^\")\n(8) startFilterExpr()\n", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test308");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endXPath();
    var0.endXPath();
    var0.startUnionExpr();

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test309");


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
    var0.startRelativeLocationPath();
    var0.startCommentNodeStep(100);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test310");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.endUnaryExpr(1);
    var0.startPathExpr();
    var0.endRelativeLocationPath();
    var0.endAdditiveExpr(10);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test311");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.endPathExpr();
    var0.startMultiplicativeExpr();
    var0.startAndExpr();

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test312");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startNameStep(100, "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endAbsoluteLocationPath()\n(7) endRelationalExpr(10)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test313");


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
    var0.startAdditiveExpr();
    
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

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test314");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endPredicate();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test315");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.startNameStep(10, "org.saxpath.SAXPathException: ", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n");
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();
    var0.startEqualityExpr();
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test316");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endMultiplicativeExpr(0);
    var0.startTextNodeStep(10);
    var0.endOrExpr(false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test317");


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
    var0.endAbsoluteLocationPath();

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test318");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    java.lang.String var5 = var0.toString();
    var0.startTextNodeStep(0);
    var0.number((-1.0d));
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endRelativeLocationPath();
    var0.endXPath();
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test319");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startCommentNodeStep(10);
    var0.endMultiplicativeExpr(10);
    var0.endRelativeLocationPath();

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test320");


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
    var0.endNameStep();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test321");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.startAdditiveExpr();
    var0.startTextNodeStep((-1));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test322");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endTextNodeStep()\n(4) endAllNodeStep()\n(5) startTextNodeStep(100)\n(6) endCommentNodeStep()\n(7) endEqualityExpr(100)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test323");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.endFunction();

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test324");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startAdditiveExpr();
    var0.startAllNodeStep(10);
    var0.number(0);
    var0.startEqualityExpr();
    var0.startEqualityExpr();

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test325");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("org.saxpath.SAXPathException:  ^", (-1), "child");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    org.saxpath.XPathSyntaxException var9 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var10 = var9.getXPath();
    int var11 = var9.getPosition();
    int var12 = var9.getPosition();
    java.lang.String var13 = var9.getPositionMarker();
    var3.addSuppressed((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: child"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: -1: child"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + " ^"+ "'", var13.equals(" ^"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test326");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.endTextNodeStep();
    var0.startCommentNodeStep(100);
    var0.endPathExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n");
    var0.endEqualityExpr((-1));
    var0.literal("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test327");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.startUnaryExpr();
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startAllNodeStep(0);
    var0.endUnionExpr(false);
    var0.endRelativeLocationPath();

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test328");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.number(100.0d);
    var0.startProcessingInstructionNodeStep((-1), "hi!");
    var0.startCommentNodeStep(10);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test329");


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
    var0.startMultiplicativeExpr();
    var0.literal(" ^");

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test330");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(true);
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: ", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endMultiplicativeExpr(0);
    var0.startOrExpr();

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test331");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endRelationalExpr(0);
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.endAdditiveExpr(0);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test332");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "hi!");
    var0.number(1.0d);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test333");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endNameStep()\n(8) endRelativeLocationPath()\n");

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test334");


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
    var18.endOrExpr(true);
    var18.endTextNodeStep();
    var18.endFunction();
    var18.startCommentNodeStep(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test335");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var0.endFilterExpr();
    var0.startCommentNodeStep(0);
    var0.endCommentNodeStep();
    java.lang.String var13 = var0.toString();
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endXPath();
    var0.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n"+ "'", var13.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startFunction(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n:\")\n(4) endFilterExpr()\n(5) startCommentNodeStep(0)\n(6) endCommentNodeStep()\n"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test336");


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
    var0.startRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test337");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.startUnionExpr();
    var0.startRelativeLocationPath();
    var0.startTextNodeStep(10);
    var0.endAdditiveExpr(1);
    var0.startFilterExpr();
    var0.endMultiplicativeExpr((-1));
    var0.endFilterExpr();

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test338");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n", 0, "org.saxpath.SAXPathParseException: \nhi!\n^");
    java.lang.String var4 = var3.getXPath();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n"+ "'", var4.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n(5) startXPath()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test339");


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
    var0.startTextNodeStep((-1));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test340");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startRelativeLocationPath();
    var0.number((-1));
    var0.startMultiplicativeExpr();

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test341");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endPathExpr();
    var0.endFilterExpr();
    var0.startRelativeLocationPath();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: -1: org.saxpath.SAXPathException:  ^", "com.werken.saxpath.XPathSyntaxException: 10: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test342");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.endUnionExpr(true);
    var0.startOrExpr();
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test343");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.endRelativeLocationPath();
    var0.startAndExpr();
    var0.startOrExpr();
    var0.number(1.0d);
    var0.startFilterExpr();

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test344");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep((-1));
    var0.startNameStep(1, "org.saxpath.SAXPathException:  ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test345");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPredicate();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endFunction();
    var0.startOrExpr();

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("(0) startRelativeLocationPath()\n");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test347");


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
    var11.startOrExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test348");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.startAbsoluteLocationPath();
    var0.startRelationalExpr();

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test349");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.startNameStep((-1), "hi!", "hi!");
    var0.startFilterExpr();
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(false);
    var0.startFunction(" ^", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n");
    var0.startUnionExpr();
    var0.endAndExpr(false);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test350");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endCommentNodeStep();
    var0.endAbsoluteLocationPath();

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test351");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startXPath();
    var0.startPathExpr();
    var0.startFunction("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ", "          ^");
    var0.endMultiplicativeExpr(1);
    var0.endFilterExpr();
    var0.endOrExpr(true);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test352");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endPathExpr();
    var0.endPredicate();

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test353");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.startNameStep(100, " ^", " ^");
    var0.endUnionExpr(false);
    var0.startRelationalExpr();
    org.saxpath.XPathSyntaxException var12 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var13 = var12.getXPath();
    java.lang.String var14 = var12.getPositionMarker();
    org.saxpath.SAXPathException var15 = new org.saxpath.SAXPathException((java.lang.Throwable)var12);
    java.lang.Throwable[] var16 = var15.getSuppressed();
    boolean var17 = var0.equals((java.lang.Object)var15);
    java.lang.String var18 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + " ^"+ "'", var14.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var18.equals("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test354");


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
    var0.endXPath();
    var0.number(1);
    var0.startRelationalExpr();

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test355");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.endTextNodeStep();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startCommentNodeStep(100)\n(4) startUnionExpr()\n(5) endTextNodeStep()\n(6) endNameStep()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) endAllNodeStep()\n(4) endEqualityExpr(0)\n");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) startRelativeLocationPath()\n(4) endTextNodeStep()\n", "(0) startXPath()\n");

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test356");


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
    var3.endRelationalExpr(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test357");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endRelationalExpr(0);
    var0.endFilterExpr();
    var0.endOrExpr(true);
    var0.endNameStep();
    java.lang.String var10 = var0.toString();
    var0.endPredicate();
    var0.startRelationalExpr();
    var0.endOrExpr(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n"+ "'", var10.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test358");


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
    org.saxpath.XPathHandler var41 = var0.getXPathHandler();
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test359");


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
    var0.endFilterExpr();

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test360");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n", 0, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "^"+ "'", var4.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test361");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var7);
    org.saxpath.SAXPathException var10 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException:  ^");
    var3.addSuppressed((java.lang.Throwable)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test362");


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
    var0.endEqualityExpr(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test363");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.endAdditiveExpr((-1));
    var0.endXPath();
    var0.startUnionExpr();
    var0.number(1.0d);
    var0.endOrExpr(true);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test364");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) startAndExpr()\n(5) startAndExpr()\n(6) startNameStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n\", \"\")\n(7) endOrExpr(true)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test365");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    java.lang.String var4 = var0.toString();
    var0.endUnionExpr(true);
    var0.startOrExpr();
    var0.startAllNodeStep((-1));
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test366");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.startPathExpr();
    var0.endAbsoluteLocationPath();
    var0.endFunction();
    var0.endAllNodeStep();
    var0.startRelativeLocationPath();
    var0.endFunction();
    java.lang.String var14 = var0.toString();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n"+ "'", var14.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) endAbsoluteLocationPath()\n(5) endFunction()\n(6) endAllNodeStep()\n(7) startRelativeLocationPath()\n(8) endFunction()\n"));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test367");


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
    var0.endPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test368");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test369");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startCommentNodeStep(10);
    var0.endNameStep();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.startAllNodeStep((-1));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test370");


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
    var20.startFunction("com.werken.saxpath.XPathSyntaxException: -1: child", "com.werken.saxpath.XPathSyntaxException: -1: child");

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test371");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.startRelativeLocationPath();

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test372");


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
    var0.endMultiplicativeExpr(100);
    var0.endAbsoluteLocationPath();
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test373");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.variableReference("                                                                                                    ^", "com.werken.saxpath.XPathSyntaxException: 0: hi!");
    var0.endAllNodeStep();
    var0.endUnaryExpr(0);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) startMultiplicativeExpr()\n(3) startEqualityExpr()\n(4) startAdditiveExpr()\n(5) endFilterExpr()\n(6) endCommentNodeStep()\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n(4) endCommentNodeStep()\n");
    var0.startAbsoluteLocationPath();

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test374");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) startAbsoluteLocationPath()\n(5) startRelativeLocationPath()\n(6) endAllNodeStep()\n(7) startAllNodeStep(1)\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) number(0.0)\n(4) endPathExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endXPath()\n(7) startRelativeLocationPath()\n(8) startXPath()\n(9) startXPath()\n");

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test375");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("^", 0, "hi!");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: hi!"+ "'", var5.equals("com.werken.saxpath.XPathSyntaxException: 0: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "^"+ "'", var6.equals("^"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test376");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.endPathExpr();
    var0.endTextNodeStep();
    var0.startUnaryExpr();
    var0.endAbsoluteLocationPath();
    var0.variableReference(" ^", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.endCommentNodeStep();
    var0.startPathExpr();

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test377");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endMultiplicativeExpr(0);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) startNameStep(100, \"org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n(6) endNameStep()\n(7) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startTextNodeStep(1)\n(4) endNameStep()\n");
    var0.startRelativeLocationPath();
    var0.number(100);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test378");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.startRelativeLocationPath();
    var0.endAndExpr(false);
    var0.endAndExpr(false);
    var0.endTextNodeStep();
    var0.endUnaryExpr(1);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test379");


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
    var0.startAdditiveExpr();
    var0.startUnaryExpr();
    var0.endAdditiveExpr(10);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test380");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test381");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.saxpath.XPathReader var1 = org.saxpath.helpers.XPathReaderFactory.createReader("com.werken.saxpath.XPathSyntaxException: 10: ^\ncom.werken.saxpath.XPathSyntaxException: 1: \n ^");
      fail("Expected exception of type org.saxpath.SAXPathException");
    } catch (org.saxpath.SAXPathException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test382");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(true);
    var0.endMultiplicativeExpr((-1));
    var0.endEqualityExpr(0);
    var0.endXPath();

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test383");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endNameStep();
    var0.endNameStep();
    var0.endXPath();
    var0.endUnionExpr(true);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test384");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 10: ^");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test385");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endXPath();
    var0.startTextNodeStep(1);
    var0.startEqualityExpr();

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test386");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endMultiplicativeExpr(100)\n(10) startAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test387");


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
    var11.startPathExpr();
    var11.endUnaryExpr(0);
    var11.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var16.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test388");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endUnionExpr(false);
    var0.startOrExpr();
    var0.startPredicate();

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test389");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) endPredicate()\n(8) endUnaryExpr(1)\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test390");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.endOrExpr(false);
    var0.literal("org.saxpath.SAXPathException: \n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n                                                                                                    ^");
    var0.startProcessingInstructionNodeStep(0, "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) endAllNodeStep()\n(3) startProcessingInstructionNodeStep(0, \"                                                                                                    ^\")\n");
    var0.startOrExpr();

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test391");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.startNameStep(0, "child", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n");
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n          ^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) variableReference(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^:(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\")\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test392");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.endPredicate();

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test393");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startXPath();
    var0.endPredicate();
    var0.endTextNodeStep();
    var0.endXPath();
    var0.endFunction();
    var0.endFunction();

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test394");


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
    var0.startAndExpr();

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test395");


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
    var0.endProcessingInstructionNodeStep();
    var0.startOrExpr();
    var0.startAllNodeStep((-1));
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) startAllNodeStep(1)\n(10) endProcessingInstructionNodeStep()\n(11) startOrExpr()\n(12) startAllNodeStep(-1)\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) startOrExpr()\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(7) startNameStep(1, \"(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\", \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(8) endFunction()\n(9) startAllNodeStep(1)\n(10) endProcessingInstructionNodeStep()\n(11) startOrExpr()\n(12) startAllNodeStep(-1)\n"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test396");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startCommentNodeStep(-1)\n(4) endTextNodeStep()\n(5) endUnionExpr(false)\n");

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test397");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startXPath();
    var0.endFilterExpr();
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^\n          ^", "(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n");
    var0.endOrExpr(false);
    var0.endProcessingInstructionNodeStep();
    var0.endFunction();
    var0.startCommentNodeStep(0);
    org.saxpath.XPathSyntaxException var17 = new org.saxpath.XPathSyntaxException("", 1, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var18 = var17.getXPath();
    int var19 = var17.getPosition();
    int var20 = var17.getPosition();
    java.lang.String var21 = var17.toString();
    boolean var22 = var0.equals((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var21.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test398");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endXPath();
    var0.startUnionExpr();
    var0.startTextNodeStep(10);
    var0.startNameStep(1, "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n", " ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^");
    var0.startNameStep(100, "child\norg.saxpath.SAXPathException:  ^\n^", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.number(0.0d);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test399");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAbsoluteLocationPath();
    var0.startRelativeLocationPath();
    var0.number(1);
    var0.endProcessingInstructionNodeStep();

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test400");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.number(10);
    var0.startOrExpr();
    var0.startMultiplicativeExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^", "com.werken.saxpath.XPathSyntaxException: 10: ^");
    var0.endEqualityExpr(1);
    var0.startUnaryExpr();

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test401");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.startPathExpr();
    var0.startMultiplicativeExpr();
    var0.endAllNodeStep();
    var0.endRelativeLocationPath();

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test402");


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
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test403");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endEqualityExpr(1);
    var0.startUnionExpr();
    var0.startRelationalExpr();
    var0.startEqualityExpr();

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test404");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endAbsoluteLocationPath();
    var0.endPredicate();
    var0.endTextNodeStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var0.startOrExpr();

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test405");


    int var1 = org.saxpath.Axis.lookup("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endRelationalExpr(0)\n(3) endFilterExpr()\n(4) endOrExpr(true)\n(5) endNameStep()\n(6) endPredicate()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test406");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.startAllNodeStep((-1));
    var0.startPathExpr();
    var0.startAdditiveExpr();

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test407");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endXPath();
    var0.endAndExpr(true);
    var0.startRelationalExpr();
    var0.number(1.0d);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test408");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endOrExpr(true);
    var0.variableReference("child", "com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.number(1.0d);
    var0.endUnionExpr(true);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test409");


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
    var0.startOrExpr();
    var0.startRelativeLocationPath();
    var0.endProcessingInstructionNodeStep();

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test410");


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
    var0.endAllNodeStep();
    var0.startAndExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test411");


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
    var0.startCommentNodeStep(0);
    var0.variableReference("(0) endAllNodeStep()\n(1) endTextNodeStep()\n(2) endUnaryExpr(1)\n(3) startUnaryExpr()\n(4) endOrExpr(true)\n(5) number(-1)\n(6) endUnaryExpr(10)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAdditiveExpr(-1)\n(6) literal(\"com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n");

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test412");


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
    var7.startAdditiveExpr();
    var7.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test413");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    boolean var7 = var0.equals((java.lang.Object)10L);
    var0.startCommentNodeStep(100);
    var0.startUnionExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^");
    var0.endEqualityExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test414");


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
    org.saxpath.SAXPathException var24 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var25 = var3.toString();
    
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
    assertTrue("'" + var25 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var25.equals("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test415");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endProcessingInstructionNodeStep();
    var0.startFunction("org.saxpath.SAXPathParseException: ", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endNameStep();
    var0.startRelationalExpr();
    var0.endXPath();
    var0.startTextNodeStep(0);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test416");


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
    var0.number(0.0d);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test417");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endRelativeLocationPath();
    var0.endFilterExpr();
    var0.endMultiplicativeExpr((-1));
    var0.startRelationalExpr();

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test418");


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
    var0.startNameStep(10, "com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^", "com.werken.saxpath.XPathSyntaxException: 1: \norg.saxpath.SAXPathParseException: \n ^");

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test419");


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
    var0.endPathExpr();
    var0.startEqualityExpr();
    var0.number(100.0d);
    var0.endRelativeLocationPath();

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test420");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.String var5 = var3.getPositionMarker();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getXPath();
    java.lang.String var8 = var3.getXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + " ^"+ "'", var4.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + " ^"+ "'", var5.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 1: "+ "'", var6.equals("com.werken.saxpath.XPathSyntaxException: 1: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + " ^"+ "'", var7.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + " ^"+ "'", var8.equals(" ^"));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test421");


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
    var0.endOrExpr(false);
    var0.startPathExpr();

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test422");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^", 1, "");
    java.lang.String var4 = var3.getMultilineMessage();
    int var5 = var3.getPosition();
    org.saxpath.SAXPathParseException var7 = new org.saxpath.SAXPathParseException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.String var9 = var3.getXPath();
    java.lang.String var10 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "\n ^\n ^"+ "'", var4.equals("\n ^\n ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " ^"+ "'", var9.equals(" ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "\n ^\n ^"+ "'", var10.equals("\n ^\n ^"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test423");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAbsoluteLocationPath();
    var0.startEqualityExpr();
    var0.startPathExpr();
    var0.endMultiplicativeExpr((-1));
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n", "(0) endAllNodeStep()\n(1) endAllNodeStep()\n");
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(0);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test424");


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
    org.saxpath.conformance.ConformanceXPathHandler var22 = new org.saxpath.conformance.ConformanceXPathHandler();
    var22.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var22.endEqualityExpr(1);
    org.saxpath.conformance.ConformanceXPathHandler var28 = new org.saxpath.conformance.ConformanceXPathHandler();
    var28.startAbsoluteLocationPath();
    var28.endUnaryExpr(10);
    var28.number(1);
    var28.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "");
    var28.startMultiplicativeExpr();
    var28.startFilterExpr();
    boolean var39 = var22.equals((java.lang.Object)var28);
    var28.startUnionExpr();
    var28.startEqualityExpr();
    var28.endEqualityExpr(1);
    var0.setXPathHandler((org.saxpath.XPathHandler)var28);
    var0.parse("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test425");


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
    var0.startAdditiveExpr();
    var0.variableReference("org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "org.saxpath.SAXPathParseException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: \ncom.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^");

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test426");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.endAdditiveExpr(0);
    var0.endAdditiveExpr(0);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    var0.endNameStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n"+ "'", var8.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n"+ "'", var9.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n(2) startFilterExpr()\n(3) endAdditiveExpr(0)\n(4) endAdditiveExpr(0)\n"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test427");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) endAdditiveExpr(10)\n");
    var0.literal("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.startEqualityExpr();

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test428");


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
    var11.number(0.0d);
    var11.endProcessingInstructionNodeStep();
    var11.startMultiplicativeExpr();

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test429");


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
    var0.endRelativeLocationPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test430");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(0, "org.saxpath.SAXPathParseException: ");
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endProcessingInstructionNodeStep()\n(6) endOrExpr(true)\n");
    var0.endMultiplicativeExpr(10);
    var0.startRelativeLocationPath();
    var0.startAllNodeStep(0);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test431");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.startAllNodeStep(0);
    var0.endOrExpr(false);
    var0.endRelationalExpr(1);
    var0.endTextNodeStep();
    var0.startPathExpr();

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test432");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr(100);
    var0.endRelativeLocationPath();
    java.lang.String var5 = var0.toString();
    var0.startCommentNodeStep(1);
    var0.endFilterExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(100)\n(2) endRelativeLocationPath()\n"));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test433");


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
    var0.startMultiplicativeExpr();
    var0.startEqualityExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test434");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getXPath();
    int var7 = var3.getPosition();
    java.lang.String var8 = var3.getPositionMarker();
    java.lang.String var9 = var3.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "^"+ "'", var8.equals("^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var9.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test435");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    var0.startUnionExpr();
    var0.startUnionExpr();
    var0.endMultiplicativeExpr(10);
    var0.endPathExpr();
    var0.startProcessingInstructionNodeStep((-1), "(0) endUnaryExpr(-1)\n(1) endOrExpr(false)\n(2) endNameStep()\n(3) startNameStep(100, \"\n ^\n ^\", \"com.werken.saxpath.XPathSyntaxException: 1: \")\n");
    var0.endRelationalExpr((-1));
    var0.startPathExpr();

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test436");


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
    var0.endAndExpr(true);
    var0.startMultiplicativeExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test437");


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
    var0.startXPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test438");


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
    org.saxpath.helpers.DefaultXPathHandler var31 = new org.saxpath.helpers.DefaultXPathHandler();
    var31.number(10.0d);
    var31.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var31.startUnionExpr();
    var31.startUnionExpr();
    var31.startAllNodeStep(1);
    var31.variableReference("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "");
    var31.endMultiplicativeExpr(10);
    var31.startEqualityExpr();
    var0.setXPathHandler((org.saxpath.XPathHandler)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.parse("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^");
      fail("Expected exception of type org.saxpath.XPathSyntaxException");
    } catch (org.saxpath.XPathSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var23.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test439");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n"+ "'", var2.equals("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test440");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.number(0);
    var0.endFunction();
    var0.endPredicate();
    var0.startUnaryExpr();
    var0.endProcessingInstructionNodeStep();
    var0.endProcessingInstructionNodeStep();
    var0.startAndExpr();
    var0.endPathExpr();

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test441");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    java.lang.String var6 = var0.toString();
    var0.startXPath();
    var0.endCommentNodeStep();
    var0.endNameStep();
    var0.endEqualityExpr(100);
    var0.endAndExpr(false);
    var0.endAllNodeStep();
    var0.endOrExpr(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test442");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.startOrExpr();
    var0.endUnionExpr(true);
    var0.endRelativeLocationPath();
    var0.literal("com.werken.saxpath.XPathSyntaxException: 10: ^");

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test443");


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
    var0.endAdditiveExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test444");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startCommentNodeStep((-1));
    var0.startCommentNodeStep(100);
    var0.endNameStep();
    var0.endPathExpr();
    var0.startAllNodeStep((-1));
    var0.endPathExpr();

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test445");


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
    var0.startRelationalExpr();
    var0.endProcessingInstructionNodeStep();

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test446");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startFunction("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "org.saxpath.SAXPathParseException: ");
    var0.endFilterExpr();
    var0.startNameStep(0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startOrExpr();

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test447");


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
    var1.endPathExpr();

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test448");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelationalExpr((-1));
    var0.endAndExpr(true);
    var0.endAbsoluteLocationPath();
    var0.endCommentNodeStep();
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n");
    var0.endRelationalExpr(10);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test449");


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
    var0.literal("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) startProcessingInstructionNodeStep(100, \"hi!\")\n(7) startProcessingInstructionNodeStep(10, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n");
    var0.endUnaryExpr(1);
    var0.endAdditiveExpr((-1));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test450");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", 0, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getMultilineMessage();
    java.lang.String var7 = var3.getXPath();
    org.saxpath.SAXPathException var8 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var9 = var3.getPositionMarker();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var4.equals("com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var7.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "^"+ "'", var9.equals("^"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test451");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endUnionExpr(false);
    var0.endEqualityExpr(1);
    var0.endFilterExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test452");


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
    var7.startRelationalExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test453");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.startAndExpr();
    var0.endUnaryExpr(10);
    var0.startNameStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n\n(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) endTextNodeStep()\n(7) endAdditiveExpr(0)\n");
    var0.endCommentNodeStep();

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test454");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endUnaryExpr(1);
    var0.endProcessingInstructionNodeStep();
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.startPredicate();

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test455");


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
    var0.startUnaryExpr();
    var0.endPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test456");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endAdditiveExpr(1);
    var0.endAndExpr(false);
    var0.endAbsoluteLocationPath();
    var0.startUnaryExpr();
    var0.endAndExpr(true);
    var0.startAbsoluteLocationPath();

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test457");


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
    java.lang.String var17 = var7.getXPath();
    
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test458");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^", 100, "org.saxpath.SAXPathException:  ^");
    java.lang.String var4 = var3.getPositionMarker();
    java.lang.Throwable[] var5 = var3.getSuppressed();
    java.lang.String var6 = var3.getXPath();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "                                                                                                    ^"+ "'", var4.equals("                                                                                                    ^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n^"));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test459");


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
    var0.startAllNodeStep(0);
    var0.startTextNodeStep((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test460");


    int var1 = org.saxpath.Axis.lookup("(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) startAllNodeStep(0)\n(4) endOrExpr(false)\n(5) endRelationalExpr(1)\n(6) endTextNodeStep()\n(7) endNameStep()\n(8) endAbsoluteLocationPath()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test461");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.endUnaryExpr((-1));
    var0.startEqualityExpr();
    var0.startRelationalExpr();
    var0.startCommentNodeStep(0);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test462");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endMultiplicativeExpr(1);
    var0.endFunction();
    var0.number(1);
    var0.endAndExpr(true);
    var0.startEqualityExpr();
    var0.startUnionExpr();
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) startEqualityExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endCommentNodeStep()\n(4) endRelativeLocationPath()\n(5) endMultiplicativeExpr(-1)\n(6) endNameStep()\n(7) endOrExpr(true)\n(8) endAdditiveExpr(1)\n(9) startPathExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test463");


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
    var0.endAdditiveExpr(0);
    var0.endCommentNodeStep();
    var0.startPredicate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "(0) endAllNodeStep()\n(1) endAllNodeStep()\n"+ "'", var14.equals("(0) endAllNodeStep()\n(1) endAllNodeStep()\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test464");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.endUnionExpr(false);
    var0.endNameStep();

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test465");


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
    var0.endPredicate();

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test466");


    int var1 = org.saxpath.Axis.lookup("org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test467");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.startUnionExpr();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n(7) endEqualityExpr(-1)\n(8) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n(3) startMultiplicativeExpr()\n(4) variableReference(\"org.saxpath.SAXPathException:  ^:org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\")\n(5) startAllNodeStep(-1)\n(6) endPathExpr()\n(7) endPredicate()\n(8) endPathExpr()\n(9) number(-1.0)\n");
    var0.number(1.0d);
    var0.endUnionExpr(true);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test468");


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
    var0.endUnionExpr(false);
    var0.startOrExpr();

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test469");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("com.werken.saxpath.XPathSyntaxException: -1: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test470");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endCommentNodeStep();
    var0.endEqualityExpr(1);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test471");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.endNameStep();
    var0.endProcessingInstructionNodeStep();
    var0.endUnionExpr(true);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test472");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endAndExpr(true);
    boolean var5 = var0.equals((java.lang.Object)'a');
    var0.endFunction();
    var0.endRelativeLocationPath();
    var0.startXPath();
    var0.startAdditiveExpr();
    var0.variableReference("com.werken.saxpath.XPathSyntaxException: -1: child", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.variableReference("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startUnionExpr();
    var0.endEqualityExpr(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test473");


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
    var0.endRelativeLocationPath();
    var0.endRelationalExpr(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test474");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endRelativeLocationPath();
    var0.startNameStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n", "(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startEqualityExpr()\n(7) startUnaryExpr()\n(8) startCommentNodeStep(1)\n(9) endProcessingInstructionNodeStep()\n");

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test475");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endPredicate();
    var0.startAdditiveExpr();
    var0.endAbsoluteLocationPath();
    var0.startAdditiveExpr();
    var0.startProcessingInstructionNodeStep(1, "hi!");
    var0.startPredicate();
    var0.startPathExpr();
    var0.endRelationalExpr(0);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test476");


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
    var0.startOrExpr();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) endMultiplicativeExpr(10)\n(8) startOrExpr()\n"+ "'", var15.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) endXPath()\n(7) endMultiplicativeExpr(10)\n(8) startOrExpr()\n"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test477");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endPathExpr();
    var0.startUnionExpr();
    var0.startEqualityExpr();
    var0.startFilterExpr();
    var0.startUnionExpr();
    var0.startAllNodeStep(1);
    var0.startProcessingInstructionNodeStep((-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n");
    var0.startRelativeLocationPath();
    var0.startRelationalExpr();

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test478");


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
    var0.startFunction("com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n", "org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");
    var0.startPathExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test479");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endRelativeLocationPath();
    var0.startRelativeLocationPath();
    var0.endFilterExpr();
    var0.endAdditiveExpr(100);
    var0.endRelativeLocationPath();
    var0.endAndExpr(true);
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startAbsoluteLocationPath()\n(3) endMultiplicativeExpr(-1)\n(4) startOrExpr()\n(5) endTextNodeStep()\n(6) variableReference(\"org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: :(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n\")\n(7) endRelativeLocationPath()\n", "org.saxpath.SAXPathException: org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^");

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test480");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endEqualityExpr((-1));
    var0.endTextNodeStep();
    var0.endCommentNodeStep();
    var0.endRelativeLocationPath();
    var0.startNameStep(100, "org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n", "(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endAllNodeStep();
    var0.endAllNodeStep();
    var0.literal("org.saxpath.SAXPathParseException: org.saxpath.SAXPathParseException: \nhi!\n^");
    var0.startPathExpr();

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test481");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.endXPath();
    var0.startAllNodeStep(10);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test482");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var4 = var3.getSuppressed();
    java.lang.String var5 = var3.getMultilineMessage();
    java.lang.String var6 = var3.getMultilineMessage();
    org.saxpath.SAXPathException var7 = new org.saxpath.SAXPathException((java.lang.Throwable)var3);
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var8.equals("com.werken.saxpath.XPathSyntaxException: -1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test483");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endNameStep();
    var0.startUnaryExpr();
    var0.endTextNodeStep();
    var0.startCommentNodeStep(1);
    var0.endFilterExpr();

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test484");


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
    var0.endProcessingInstructionNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"+ "'", var5.equals("(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test485");


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
    var0.variableReference("org.saxpath.SAXPathException: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endTextNodeStep()\n(2) endAdditiveExpr(1)\n\n^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endEqualityExpr(-1)\n(2) endTextNodeStep()\n(3) endAdditiveExpr(1)\n(4) endOrExpr(false)\n(5) number(10.0)\n(6) endAbsoluteLocationPath()\n(7) endXPath()\n(8) startPredicate()\n(9) startRelationalExpr()\n");
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: -1: child", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endEqualityExpr(1)\n");

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test486");


    org.saxpath.SAXPathParseException var1 = new org.saxpath.SAXPathParseException("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) number(10)\n(3) endFunction()\n");

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test487");


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
    var0.startPathExpr();
    var0.endAllNodeStep();
    var0.endPredicate();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^", "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 0: com.werken.saxpath.XPathSyntaxException: 0: org.saxpath.SAXPathParseException: ");
    var0.endTextNodeStep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test488");


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
    var0.endNameStep();

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test489");


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
    var0.startPredicate();
    var0.number(10.0d);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test490");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.endFunction();
    var0.startRelationalExpr();
    var0.endAllNodeStep();
    var0.startFilterExpr();
    var0.startNameStep(100, "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startUnionExpr()\n(3) endAdditiveExpr(0)\n(4) startRelativeLocationPath()\n(5) number(1.0)\n", "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.endXPath();
    var0.startEqualityExpr();

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test491");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startRelativeLocationPath();
    var0.endOrExpr(false);
    var0.startUnaryExpr();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.endUnionExpr(false);
    var0.startAbsoluteLocationPath();
    var0.startXPath();
    var0.number(10);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test492");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.startProcessingInstructionNodeStep(0, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    var0.startAdditiveExpr();
    var0.endXPath();
    var0.literal("(0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n");
    var0.startAndExpr();
    var0.startUnionExpr();
    var0.endUnionExpr(true);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test493");


    org.saxpath.XPathSyntaxException var3 = new org.saxpath.XPathSyntaxException(" ^\n(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n                                                                                                    ^", 10, "com.werken.saxpath.XPathSyntaxException: 0: (0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    org.saxpath.XPathSyntaxException var7 = new org.saxpath.XPathSyntaxException("(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n", (-1), "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n");
    java.lang.Throwable[] var8 = var7.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var10 = var7.getSuppressed();
    java.lang.String var11 = var7.getMultilineMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"+ "'", var11.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startAllNodeStep(0)\n(5) endNameStep()\n\n^"));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test494");


    org.saxpath.helpers.DefaultXPathHandler var0 = new org.saxpath.helpers.DefaultXPathHandler();
    var0.number(10.0d);
    var0.endPathExpr();
    var0.endPathExpr();
    var0.number((-1));
    var0.endXPath();
    var0.number(10.0d);
    var0.endAdditiveExpr(100);
    var0.endXPath();

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test495");


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
    var0.endEqualityExpr((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test496");


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
    var0.endCommentNodeStep();

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test497");


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
    var0.endCommentNodeStep();
    var0.startNameStep(1, "com.werken.saxpath.XPathSyntaxException: 10: com.werken.saxpath.XPathSyntaxException: 10: (0) startRelativeLocationPath()\n(1) endOrExpr(false)\n(2) startUnaryExpr()\n", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) endPathExpr()\n(3) endTextNodeStep()\n(4) startUnaryExpr()\n(5) endUnionExpr(true)\n(6) startRelationalExpr()\n(7) number(-1.0)\n(8) endPredicate()\n");
    
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

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test498");


    org.saxpath.SAXPathException var1 = new org.saxpath.SAXPathException("org.saxpath.SAXPathParseException: org.saxpath.SAXPathException: com.werken.saxpath.XPathSyntaxException: 100: org.saxpath.SAXPathException: ");

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test499");


    org.saxpath.conformance.ConformanceXPathHandler var0 = new org.saxpath.conformance.ConformanceXPathHandler();
    var0.startAbsoluteLocationPath();
    var0.endUnaryExpr(10);
    var0.number(1);
    var0.startAllNodeStep((-1));
    var0.startOrExpr();
    var0.startOrExpr();
    var0.startProcessingInstructionNodeStep(10, "com.werken.saxpath.XPathSyntaxException: 1: (0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endUnaryExpr(0)\n(6) endFunction()\n");
    var0.endXPath();
    var0.startFunction("(0) startAbsoluteLocationPath()\n(1) endPathExpr()\n(2) startUnionExpr()\n(3) startEqualityExpr()\n(4) startFilterExpr()\n(5) startAbsoluteLocationPath()\n\n(0) startAbsoluteLocationPath()\n(1) endUnaryExpr(10)\n(2) number(1)\n(3) startAllNodeStep(-1)\n(4) startOrExpr()\n(5) endAndExpr(true)\n(6) startAndExpr()\n\n^", "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n(2) startXPath()\n(3) startPathExpr()\n(4) startNameStep(0, \"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\", \"\")\n(5) startXPath()\n(6) endAndExpr(true)\n(7) startFunction(\"          ^:hi!\")\n(8) startFilterExpr()\n(9) literal(\"(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n\n\n ^\")\n(10) endRelationalExpr(-1)\n(11) endPathExpr()\n(12) startUnionExpr()\n");

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest3.test500");


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
    var0.startRelationalExpr();
    var0.startUnaryExpr();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"+ "'", var6.equals("(0) startAbsoluteLocationPath()\n(1) endAndExpr(true)\n"));

  }

}
