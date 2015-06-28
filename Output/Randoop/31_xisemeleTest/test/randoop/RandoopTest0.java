package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    java.lang.Object[] var2 = new java.lang.Object[] { 0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    net.sf.xisemele.impl.XisemeleFactory var0 = new net.sf.xisemele.impl.XisemeleFactory();

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    net.sf.xisemele.api.Xisemele var0 = net.sf.xisemele.impl.XisemeleFactory.newXisemele();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.InvalidNameException var1 = new net.sf.xisemele.exception.InvalidNameException("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("", 10);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ChildNotFoundException var2 = new net.sf.xisemele.exception.ChildNotFoundException("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementNotFoundException var1 = new net.sf.xisemele.exception.ElementNotFoundException("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.RootDuplicateException var2 = new net.sf.xisemele.exception.RootDuplicateException("hi!", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.RootDuplicateException var2 = new net.sf.xisemele.exception.RootDuplicateException("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.AttributeNotPermittedException var0 = new net.sf.xisemele.exception.AttributeNotPermittedException();
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ValueNotPermittedException var1 = new net.sf.xisemele.exception.ValueNotPermittedException("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.RootDuplicateException var2 = new net.sf.xisemele.exception.RootDuplicateException("", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("", 0);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    java.lang.Object[] var2 = new java.lang.Object[] { 10.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.WithinContextDuplicateException var0 = new net.sf.xisemele.exception.WithinContextDuplicateException();
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.InvalidNameException var1 = new net.sf.xisemele.exception.InvalidNameException("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ChildNotFoundException var2 = new net.sf.xisemele.exception.ChildNotFoundException("hi!", "");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ChildNotFoundException var2 = new net.sf.xisemele.exception.ChildNotFoundException("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.NotWithinContextException var0 = new net.sf.xisemele.exception.NotWithinContextException();
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("hi!", 0);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.RootDuplicateException var2 = new net.sf.xisemele.exception.RootDuplicateException("", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.RemoveRootNotPermittedException var1 = new net.sf.xisemele.exception.RemoveRootNotPermittedException("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.WithinContextNotPermittedException var1 = new net.sf.xisemele.exception.WithinContextNotPermittedException("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.WithinContextNotPermittedException var1 = new net.sf.xisemele.exception.WithinContextNotPermittedException("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.RemoveRootNotPermittedException var1 = new net.sf.xisemele.exception.RemoveRootNotPermittedException("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ChildNotFoundException var2 = new net.sf.xisemele.exception.ChildNotFoundException("hi!", "hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("", 1);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("", (-1));
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementNotFoundException var1 = new net.sf.xisemele.exception.ElementNotFoundException("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("hi!", 10);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("", 100);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    java.lang.Object[] var2 = new java.lang.Object[] { 1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    java.lang.Object[] var2 = new java.lang.Object[] { 100.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    java.lang.Object var1 = new java.lang.Object();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    java.lang.Object[] var2 = new java.lang.Object[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    java.lang.Object var1 = new java.lang.Object();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0d)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    net.sf.xisemele.impl.XisemeleFactory var1 = new net.sf.xisemele.impl.XisemeleFactory();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    java.lang.Object[] var2 = new java.lang.Object[] { 1.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    java.lang.Object[] var2 = new java.lang.Object[] { ""};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    java.lang.Object[] var2 = new java.lang.Object[] { 10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    java.lang.Object[] var2 = new java.lang.Object[] { 0L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    java.lang.Object[] var2 = new java.lang.Object[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ValueNotPermittedException var1 = new net.sf.xisemele.exception.ValueNotPermittedException("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    java.lang.Object[] var2 = new java.lang.Object[] { false};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    java.lang.Object[] var2 = new java.lang.Object[] { 1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    java.lang.Object[] var2 = new java.lang.Object[] { true};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    java.lang.Object[] var2 = new java.lang.Object[] { 10.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    java.lang.Object[] var2 = new java.lang.Object[] { "hi!"};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("hi!", 1);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    java.lang.Object[] var2 = new java.lang.Object[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0d)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("hi!", (-1));
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    java.lang.Object[] var2 = new java.lang.Object[] { 100L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    java.lang.Object[] var2 = new java.lang.Object[] { '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    java.lang.Object[] var2 = new java.lang.Object[] { 1L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    java.lang.Object[] var2 = new java.lang.Object[] { false};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.ElementIndexOutOfBoundsException var2 = new net.sf.xisemele.exception.ElementIndexOutOfBoundsException("hi!", 100);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    java.lang.Object[] var2 = new java.lang.Object[] { 10L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    java.lang.Object[] var2 = new java.lang.Object[] { 0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    java.lang.Object[] var2 = new java.lang.Object[] { 10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1L)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    java.lang.Object[] var2 = new java.lang.Object[] { true};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    java.lang.Object[] var2 = new java.lang.Object[] { 100L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    java.lang.Object[] var2 = new java.lang.Object[] { 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    java.lang.Object[] var2 = new java.lang.Object[] { '#'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    java.lang.Object[] var2 = new java.lang.Object[] { 0L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    java.lang.Object[] var2 = new java.lang.Object[] { 0.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    net.sf.xisemele.api.Xisemele var1 = net.sf.xisemele.impl.XisemeleFactory.newXisemele();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    java.lang.Object[] var2 = new java.lang.Object[] { 0.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    java.lang.Object[] var2 = new java.lang.Object[] { 100.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    java.lang.Object[] var2 = new java.lang.Object[] { 10.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    java.lang.Object[] var2 = new java.lang.Object[] { 1L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    java.lang.Object[] var2 = new java.lang.Object[] { 1.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    java.lang.Object[] var2 = new java.lang.Object[] { 10L};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    java.lang.Object[] var2 = new java.lang.Object[] { 100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    java.lang.Object[] var2 = new java.lang.Object[] { 1.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    java.lang.Object[] var2 = new java.lang.Object[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    net.sf.xisemele.api.Xisemele var1 = net.sf.xisemele.impl.XisemeleFactory.newXisemele();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    java.lang.Object[] var2 = new java.lang.Object[] { 1.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    java.lang.Object[] var2 = new java.lang.Object[] { 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    java.lang.Object[] var2 = new java.lang.Object[] { 100.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    net.sf.xisemele.impl.XisemeleFactory var1 = new net.sf.xisemele.impl.XisemeleFactory();
    java.lang.Object[] var2 = new java.lang.Object[] { var1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)100};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    java.lang.Object[] var2 = new java.lang.Object[] { 'a'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    java.lang.Object[] var2 = new java.lang.Object[] { 100.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    java.lang.Object[] var2 = new java.lang.Object[] { 0.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1.0f)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)0};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    java.lang.Object[] var2 = new java.lang.Object[] { 10.0d};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    java.lang.Object[] var2 = new java.lang.Object[] { '4'};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    java.lang.Object[] var2 = new java.lang.Object[] { (byte)10};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    java.lang.Object[] var2 = new java.lang.Object[] { 0.0f};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)1};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    java.lang.Object[] var2 = new java.lang.Object[] { (short)(-1)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("hi!", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    java.lang.Object[] var2 = new java.lang.Object[] { (-1L)};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.xisemele.exception.XisemeleException var3 = new net.sf.xisemele.exception.XisemeleException("", var2);
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

}
