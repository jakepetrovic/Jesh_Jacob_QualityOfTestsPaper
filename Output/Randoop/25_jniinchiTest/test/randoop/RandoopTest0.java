package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    net.sf.jniinchi.INCHI_BOND_TYPE[] var0 = net.sf.jniinchi.INCHI_BOND_TYPE.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("hi!", true);
      fail("Expected exception of type randoop.util.ReflectionExecutor.TimeoutExceeded");
    } catch (randoop.util.ReflectionExecutor.TimeoutExceeded e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    net.sf.jniinchi.INCHI_STATUS[] var0 = net.sf.jniinchi.INCHI_STATUS.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var9 = var7.getStereo0D((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    net.sf.jniinchi.INCHI_RADICAL[] var0 = net.sf.jniinchi.INCHI_RADICAL.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.getValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    net.sf.jniinchi.JniInchiStructure var0 = net.sf.jniinchi.Main.getTestMolecule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var2 = new net.sf.jniinchi.JniInchiInput(var0, "hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    net.sf.jniinchi.INCHI_STEREOTYPE[] var0 = net.sf.jniinchi.INCHI_STEREOTYPE.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom[] var10 = new net.sf.jniinchi.JniInchiAtom[] { };
    var9.addAtoms(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var12 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("hi!", "InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var3.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    net.sf.jniinchi.INCHI_RET[] var0 = net.sf.jniinchi.INCHI_RET.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var11 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    net.sf.jniinchi.INCHI_BOND_STEREO[] var0 = net.sf.jniinchi.INCHI_BOND_STEREO.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    net.sf.jniinchi.INCHI_KEY_STATUS[] var0 = net.sf.jniinchi.INCHI_KEY_STATUS.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    net.sf.jniinchi.Main.runChecks();

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("OK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var2 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    net.sf.jniinchi.INCHI_PARITY[] var0 = net.sf.jniinchi.INCHI_PARITY.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var3 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var3 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    net.sf.jniinchi.Main var0 = new net.sf.jniinchi.Main();

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var1 = net.sf.jniinchi.JniInchiWrapper.getInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("OK");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var23 = var9.addAtom(var16);
    java.lang.String var24 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var26 = var9.getAtom((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.ordinal();
    java.lang.Class var4 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var10 = var8.getBond(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    net.sf.jniinchi.JniInchiAtom var45 = var44.getOriginAtom();
    var45.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var12 = net.sf.jniinchi.JniInchiWrapper.getInchi(var11);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var23 = var9.addAtom(var16);
    java.lang.String var24 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var25 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var11 = var7.getStereo0D(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("hi!");

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var15 = var13.getAtom((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var4 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    net.sf.jniinchi.INCHI_KEY[] var0 = net.sf.jniinchi.INCHI_KEY.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var9 = var7.getStereo0D(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var12 = var7.getBond(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var86 = net.sf.jniinchi.JniInchiWrapper.getInchi(var10);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var12 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    int var14 = var4.getImplicitDeuterium();
    int var15 = var4.getIsotopicMass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("NONE", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiWrapper.loadLibrary();
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    net.sf.jniinchi.INCHI_RADICAL var46 = net.sf.jniinchi.INCHI_RADICAL.getValue(0);
    java.lang.Class var47 = var46.getDeclaringClass();
    var18.setRadical(var46);
    var18.setImplicitTritium(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var23 = var9.addAtom(var16);
    var23.setImplicitDeuterium(0);
    var23.setImplicitProtium((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10001, "", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "SINGLE_1UP");

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("SINGLE_2UP", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI_Output: EOF/hi!///");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var9.getNumAtoms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI_Output: EOF/hi!///", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.INCHI_RET var10 = var7.getReturnStatus();
    int var11 = var7.getNumBonds();
    net.sf.jniinchi.INCHI_RET var12 = var7.getReturnStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("SINGLE_2UP", "OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getImplicitProtium();
    var4.setIsotopicMass((-1));
    double var14 = var4.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var11.getOptions();
    net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    var58.setStereoDefinition(var80);
    net.sf.jniinchi.JniInchiBond[] var82 = new net.sf.jniinchi.JniInchiBond[] { var58};
    var11.addBonds(var82);
    net.sf.jniinchi.JniInchiInputData var86 = new net.sf.jniinchi.JniInchiInputData(1, var11, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var91 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var91.setIsotopicMassShift(1);
    int var94 = var91.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var95 = var11.addAtom(var91);
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(1, var11, (-1), "hi!");
    int var99 = var11.getNumStereo0D();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var5 = var4.getImplicitDeuterium();
    var4.setImplicitDeuterium(1);
    double var8 = var4.getX();
    int var9 = var4.getImplicitDeuterium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("SINGLE_2UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    int var13 = var7.getIndx();
    int var14 = var7.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var17 = var7.addAtom(var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var19 = var7.getAtom(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("SINGLE_1UP", "SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var11.getOptions();
    net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    var58.setStereoDefinition(var80);
    net.sf.jniinchi.JniInchiBond[] var82 = new net.sf.jniinchi.JniInchiBond[] { var58};
    var11.addBonds(var82);
    net.sf.jniinchi.JniInchiInputData var86 = new net.sf.jniinchi.JniInchiInputData(1, var11, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var91 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var91.setIsotopicMassShift(1);
    int var94 = var91.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var95 = var11.addAtom(var91);
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(1, var11, (-1), "hi!");
    net.sf.jniinchi.JniInchiInput var99 = var98.getInput();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    net.sf.jniinchi.INCHI_KEY var13 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var15 = new net.sf.jniinchi.JniInchiOutputKey(var13, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var21 = var20.getCharge();
    var20.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var31 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var32 = var31.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var34 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var35 = new net.sf.jniinchi.JniInchiBond(var20, var28, var31, var34);
    boolean var36 = var13.equals((java.lang.Object)var35);
    java.lang.String var37 = var35.getDebugString();
    var35.debug();
    net.sf.jniinchi.JniInchiBond var39 = var9.addBond(var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var41 = var9.getStereo0D(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var37.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    long[][] var14 = var13.getWarningFlags();
    long[][] var15 = var13.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var17 = var13.getAtom(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var12 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("OK");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("OK", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI_Output: EOF/hi!///");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("NONE");
    java.lang.String var2 = var1.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var3 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NONE"+ "'", var2.equals("NONE"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom[] var10 = new net.sf.jniinchi.JniInchiAtom[] { };
    var9.addAtoms(var10);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiAtom[] var22 = new net.sf.jniinchi.JniInchiAtom[] { };
    var21.addAtoms(var22);
    var9.addAtoms(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var25 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("SINGLE_2UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("SINGLE_1UP", "SINGLE_2UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom[] var10 = new net.sf.jniinchi.JniInchiAtom[] { };
    var9.addAtoms(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var12 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var11.getOptions();
    net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    var58.setStereoDefinition(var80);
    net.sf.jniinchi.JniInchiBond[] var82 = new net.sf.jniinchi.JniInchiBond[] { var58};
    var11.addBonds(var82);
    net.sf.jniinchi.JniInchiInputData var86 = new net.sf.jniinchi.JniInchiInputData(1, var11, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var91 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var91.setIsotopicMassShift(1);
    int var94 = var91.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var95 = var11.addAtom(var91);
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(1, var11, (-1), "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var99 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var11);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("VALID_STANDARD", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    int var9 = var4.getImplicitH();
    double var10 = var4.getY();
    java.lang.String var11 = var4.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "InChI_Output: WARNING///hi!/hi!", "InChI_Output: WARNING///hi!/hi!", "", "hi!");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"+ "'", var7.equals("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI_Output: EOF/hi!///");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    long[][] var10 = var7.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var24 = var23.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var26 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var27 = var26.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var29 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var30 = new net.sf.jniinchi.JniInchiBond(var15, var23, var26, var29);
    net.sf.jniinchi.JniInchiBond var31 = var7.addBond(var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var33 = var7.getStereo0D(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var15 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var16 = var15.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var18 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var19 = new net.sf.jniinchi.JniInchiBond(var4, var12, var15, var18);
    net.sf.jniinchi.JniInchiException var21 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.Throwable[] var22 = var21.getSuppressed();
    boolean var23 = var18.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    var4.setIsotopicMassShift(10);
    var4.setIsotopicMass(10);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("SINGLE_2UP");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("ODD");

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var3 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var12 = var11.getImplicitProtium();
    var11.debug();
    net.sf.jniinchi.JniInchiAtom var14 = var7.addAtom(var11);
    double var15 = var14.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var15 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var16 = var15.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var18 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var19 = new net.sf.jniinchi.JniInchiBond(var4, var12, var15, var18);
    net.sf.jniinchi.INCHI_BOND_STEREO var20 = var19.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var21 = var19.getTargetAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var22 = var19.getBondStereo();
    net.sf.jniinchi.INCHI_BOND_TYPE var23 = var19.getBondType();
    int var24 = var23.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.getAuxInfo();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(0);
    int var2 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("OK");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var15 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var16 = var15.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var18 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var19 = new net.sf.jniinchi.JniInchiBond(var4, var12, var15, var18);
    var12.setIsotopicMass(100);
    double var22 = var12.getZ();
    int var23 = var12.getImplicitDeuterium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumBonds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var11 = var7.getAtom(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    java.lang.String var86 = var85.getErrorMessage();
    java.lang.String var87 = var85.getErrorMessage();
    java.lang.String var88 = var85.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi!"+ "'", var88.equals("hi!"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 1.0d, 100.0d, "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    java.lang.String var86 = var85.getErrorMessage();
    java.lang.String var87 = var85.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var88 = var85.getInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var89 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var88);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var13 = var9.getStereo0D(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var10 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var11 = var10.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom[] var13 = new net.sf.jniinchi.JniInchiAtom[] { };
    var12.addAtoms(var13);
    boolean var15 = var1.equals((java.lang.Object)var13);
    int var16 = var1.ordinal();
    int var17 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: "+ "'", var2.equals("net.sf.jniinchi.LoadNativeLibraryException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: "+ "'", var3.equals("net.sf.jniinchi.LoadNativeLibraryException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: "+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: "));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("VALID_STANDARD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(1);
    int var2 = var1.getIndx();
    java.lang.Class var3 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var5 = java.lang.Enum.<java.lang.Enum>valueOf(var3, "net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var2 = var1.getDeclaringClass();
    java.lang.String var3 = var1.name();
    java.lang.String var4 = var1.toString();
    int var5 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "NONE"+ "'", var3.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NONE"+ "'", var4.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var2 = var1.getImplicitProtium();
    java.lang.String var3 = var1.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var9 = var7.getStereo0D((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    double var11 = var4.getZ();
    var4.setImplicitTritium((-1));
    var4.setImplicitTritium(100);
    int var16 = var4.getImplicitDeuterium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    java.lang.String var14 = var13.getLog();
    net.sf.jniinchi.JniInchiInput var15 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var23 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var24 = var23.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var25 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var23);
    var15.setStructure((net.sf.jniinchi.JniInchiStructure)var23);
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var31.setImplicitProtium(1);
    int var34 = var31.getImplicitDeuterium();
    int var35 = var31.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var37 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var42 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var43 = var42.getCharge();
    var42.setImplicitTritium(10);
    double var46 = var42.getX();
    var42.setCharge(1);
    int var49 = var42.getIsotopicMass();
    int var50 = var42.getCharge();
    net.sf.jniinchi.JniInchiAtom var55 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var56 = var55.getCharge();
    var55.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var60 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var61 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var31, var37, var42, var55, var60);
    net.sf.jniinchi.INCHI_PARITY var63 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var61.setDisconnectedParity(var63);
    net.sf.jniinchi.INCHI_PARITY var65 = var61.getParity();
    net.sf.jniinchi.INCHI_PARITY var66 = var61.getDisconnectedParity();
    java.lang.String var67 = var61.getDebugString();
    net.sf.jniinchi.JniInchiStereo0D var68 = var23.addStereo0D(var61);
    net.sf.jniinchi.JniInchiStereo0D var69 = var13.addStereo0D(var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var71 = var68.getNeighbor(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var67.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "");
    java.lang.Class var6 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "VALID_STANDARD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD", "OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    int var45 = var18.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiBond[] var22 = new net.sf.jniinchi.JniInchiBond[] { };
    var21.addBonds(var22);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var35 = var21.addAtom(var28);
    net.sf.jniinchi.JniInchiInputData var38 = new net.sf.jniinchi.JniInchiInputData(1, var21, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var39 = var38.getInput();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var41 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var5 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    var16.setImplicitDeuterium(100);
    int var25 = var16.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var31 = var30.getCharge();
    var30.setImplicitTritium(10);
    double var34 = var30.getX();
    var30.setCharge(1);
    var30.setImplicitDeuterium(100);
    int var39 = var30.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var41 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var42 = var41.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var50 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var51 = var50.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var52 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var50);
    net.sf.jniinchi.JniInchiAtom[] var53 = new net.sf.jniinchi.JniInchiAtom[] { };
    var52.addAtoms(var53);
    boolean var55 = var41.equals((java.lang.Object)var53);
    net.sf.jniinchi.JniInchiBond var56 = new net.sf.jniinchi.JniInchiBond(var16, var30, var41);
    java.lang.String var57 = var56.getDebugString();
    net.sf.jniinchi.JniInchiAtom var62 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var63 = var62.getCharge();
    var62.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var70 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var71 = var70.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var73 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var74 = var73.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var76 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var77 = new net.sf.jniinchi.JniInchiBond(var62, var70, var73, var76);
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = var77.getBondStereo();
    var56.setStereoDefinition(var78);
    net.sf.jniinchi.JniInchiBond[] var80 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var9.addBonds(var80);
    net.sf.jniinchi.JniInchiInput var82 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var83 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var57.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var9 = var7.getStereo0D(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiOutputStructure var17 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var18 = var17.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var17);
    java.lang.String var20 = var19.getOptions();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    var26.setImplicitDeuterium(100);
    int var35 = var26.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitTritium(10);
    double var44 = var40.getX();
    var40.setCharge(1);
    var40.setImplicitDeuterium(100);
    int var49 = var40.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var52 = var51.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var60 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var61 = var60.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var62 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var60);
    net.sf.jniinchi.JniInchiAtom[] var63 = new net.sf.jniinchi.JniInchiAtom[] { };
    var62.addAtoms(var63);
    boolean var65 = var51.equals((java.lang.Object)var63);
    net.sf.jniinchi.JniInchiBond var66 = new net.sf.jniinchi.JniInchiBond(var26, var40, var51);
    java.lang.String var67 = var66.getDebugString();
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    var72.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var80 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var81 = var80.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var83 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var84 = var83.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var86 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var87 = new net.sf.jniinchi.JniInchiBond(var72, var80, var83, var86);
    net.sf.jniinchi.INCHI_BOND_STEREO var88 = var87.getBondStereo();
    var66.setStereoDefinition(var88);
    net.sf.jniinchi.JniInchiBond[] var90 = new net.sf.jniinchi.JniInchiBond[] { var66};
    var19.addBonds(var90);
    net.sf.jniinchi.JniInchiInputData var94 = new net.sf.jniinchi.JniInchiInputData(1, var19, 10, "hi!");
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var97 = var7.getAtom(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var67.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var12 = var0.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var13 = net.sf.jniinchi.JniInchiWrapper.getInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.getElementType();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var11 = var10.getCharge();
    var10.setImplicitTritium(10);
    double var14 = var10.getX();
    int var15 = var10.getImplicitH();
    java.lang.String var16 = var10.getElementType();
    int var17 = var10.getImplicitProtium();
    var10.setIsotopicMass((-1));
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var24.setImplicitProtium(1);
    double var27 = var24.getY();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    var32.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var38 = var32.getRadical();
    var32.setIsotopicMassShift(1);
    var32.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var47 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var48 = var47.getCharge();
    var47.setImplicitTritium(10);
    double var51 = var47.getX();
    var47.setCharge(1);
    double var54 = var47.getZ();
    var47.setIsotopicMassShift(100);
    var47.debug();
    net.sf.jniinchi.JniInchiStructure var58 = net.sf.jniinchi.Main.getTestMolecule();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var63.setImplicitProtium(1);
    int var66 = var63.getImplicitDeuterium();
    int var67 = var63.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var69 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var74 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var75 = var74.getCharge();
    var74.setImplicitTritium(10);
    double var78 = var74.getX();
    var74.setCharge(1);
    int var81 = var74.getIsotopicMass();
    int var82 = var74.getCharge();
    net.sf.jniinchi.JniInchiAtom var87 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var88 = var87.getCharge();
    var87.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var92 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var93 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var63, var69, var74, var87, var92);
    net.sf.jniinchi.INCHI_PARITY var95 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var93.setDisconnectedParity(var95);
    net.sf.jniinchi.JniInchiStereo0D var97 = var58.addStereo0D(var93);
    net.sf.jniinchi.INCHI_PARITY var98 = var93.getParity();
    net.sf.jniinchi.JniInchiStereo0D var99 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var10, var24, var32, var47, var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(0, "net.sf.jniinchi.LoadNativeLibraryException", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "net.sf.jniinchi.LoadNativeLibraryException", "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var2 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.INCHI_KEY var10 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var12 = new net.sf.jniinchi.JniInchiOutputKey(var10, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    boolean var59 = var10.equals((java.lang.Object)var57);
    net.sf.jniinchi.INCHI_BOND_TYPE var60 = var57.getBondType();
    net.sf.jniinchi.JniInchiAtom var61 = var57.getOriginAtom();
    net.sf.jniinchi.JniInchiBond var62 = var7.addBond(var57);
    int var63 = var7.getNumAtoms();
    long[][] var64 = var7.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var66 = var7.getAtom(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiBond[] var22 = new net.sf.jniinchi.JniInchiBond[] { };
    var21.addBonds(var22);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var35 = var21.addAtom(var28);
    net.sf.jniinchi.JniInchiInputData var38 = new net.sf.jniinchi.JniInchiInputData(1, var21, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var39 = var38.getInput();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var39);
    int var41 = var9.getNumBonds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    var4.setIsotopicMassShift(1);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.INCHI_RADICAL var16 = var15.getRadical();
    var4.setRadical(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI_Output: WARNING/SINGLE_2UP/OK/InChI_Output: WARNING///hi!/hi!/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI_Output: WARNING/SINGLE_2UP/OK/InChI_Output: WARNING///hi!/hi!/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var11.getOptions();
    net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    var58.setStereoDefinition(var80);
    net.sf.jniinchi.JniInchiBond[] var82 = new net.sf.jniinchi.JniInchiBond[] { var58};
    var11.addBonds(var82);
    net.sf.jniinchi.JniInchiInputData var86 = new net.sf.jniinchi.JniInchiInputData(1, var11, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var91 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var91.setIsotopicMassShift(1);
    int var94 = var91.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var95 = var11.addAtom(var91);
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(1, var11, (-1), "hi!");
    int var99 = var11.getNumBonds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == 1);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    var4.setIsotopicMassShift(10);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var11.setImplicitH((-1));
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    int var20 = var18.getIsotopicMass();
    net.sf.jniinchi.JniInchiAtom var25 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var31 = var30.getImplicitDeuterium();
    var30.setImplicitDeuterium(1);
    net.sf.jniinchi.INCHI_STEREOTYPE var35 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(0);
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var40.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var47 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var47.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var55 = var54.getCharge();
    var54.setImplicitTritium(10);
    double var58 = var54.getX();
    int var59 = var54.getImplicitH();
    java.lang.String var60 = var54.getElementType();
    int var61 = var54.getImplicitProtium();
    int var62 = var54.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var67 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var68 = var67.getCharge();
    var67.setImplicitProtium(1);
    var67.setImplicitDeuterium(10001);
    net.sf.jniinchi.JniInchiAtom var77 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var78 = var77.getCharge();
    var77.setImplicitTritium(10);
    double var81 = var77.getX();
    var77.setCharge(1);
    int var84 = var77.getIsotopicMass();
    net.sf.jniinchi.INCHI_PARITY var86 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var87 = var86.getIndx();
    int var88 = var86.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var89 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var40, var47, var54, var67, var77, var86);
    net.sf.jniinchi.JniInchiStereo0D var90 = new net.sf.jniinchi.JniInchiStereo0D(var4, var11, var18, var25, var30, var35, var86);
    var4.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiBond[] var22 = new net.sf.jniinchi.JniInchiBond[] { };
    var21.addBonds(var22);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var35 = var21.addAtom(var28);
    net.sf.jniinchi.JniInchiInputData var38 = new net.sf.jniinchi.JniInchiInputData(1, var21, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var39 = var38.getInput();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: EOF/hi!///");

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    java.lang.String var7 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: EOF/hi!///"+ "'", var7.equals("InChI_Output: EOF/hi!///"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    var4.setImplicitTritium(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var1.setCharge(0);
    var1.setIsotopicMassShift(0);
    var1.setCharge(10001);
    var1.debug();

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var8 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var9 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    net.sf.jniinchi.LoadNativeLibraryException var10 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setIsotopicMassShift(1);
    int var7 = var4.getImplicitTritium();
    int var8 = var4.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!", "net.sf.jniinchi.LoadNativeLibraryException: OK", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "net.sf.jniinchi.LoadNativeLibraryException");

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    net.sf.jniinchi.INCHI_RADICAL var46 = net.sf.jniinchi.INCHI_RADICAL.getValue(0);
    java.lang.Class var47 = var46.getDeclaringClass();
    var18.setRadical(var46);
    int var49 = var46.ordinal();
    int var50 = var46.getIndx();
    int var51 = var46.getIndx();
    int var52 = var46.getIndx();
    int var53 = var46.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "InChI_Output: EOF/hi!///");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var9 = var8.getNumBonds();
    net.sf.jniinchi.JniInchiOutputStructure var17 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var18 = var17.getNumAtoms();
    var8.setStructure((net.sf.jniinchi.JniInchiStructure)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var21 = var8.getBond(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var4 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(0);
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var9 = var7.getAtom(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    java.lang.String var86 = var85.getErrorMessage();
    net.sf.jniinchi.INCHI_RET var87 = var85.getReturnValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiBond[] var11 = new net.sf.jniinchi.JniInchiBond[] { };
    var10.addBonds(var11);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var24 = var10.addAtom(var17);
    net.sf.jniinchi.JniInchiInputData var27 = new net.sf.jniinchi.JniInchiInputData(1, var10, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var28 = var27.getInput();
    net.sf.jniinchi.INCHI_RET var29 = var27.getReturnValue();
    int var30 = var29.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    int var7 = var4.getImplicitDeuterium();
    int var8 = var4.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    int var22 = var15.getIsotopicMass();
    int var23 = var15.getCharge();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var33 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var34 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var10, var15, var28, var33);
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    int var41 = var39.getIsotopicMass();
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitTritium(10);
    double var50 = var46.getX();
    var46.setCharge(1);
    var46.setImplicitDeuterium(100);
    int var55 = var46.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var61 = var60.getCharge();
    var60.setImplicitTritium(10);
    double var64 = var60.getX();
    var60.setCharge(1);
    var60.setImplicitDeuterium(100);
    int var69 = var60.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var71 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var72 = var71.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var80 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var81 = var80.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var82 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var80);
    net.sf.jniinchi.JniInchiAtom[] var83 = new net.sf.jniinchi.JniInchiAtom[] { };
    var82.addAtoms(var83);
    boolean var85 = var71.equals((java.lang.Object)var83);
    net.sf.jniinchi.JniInchiBond var86 = new net.sf.jniinchi.JniInchiBond(var46, var60, var71);
    net.sf.jniinchi.JniInchiAtom var87 = var86.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var89 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var89.debug();
    double var91 = var89.getZ();
    net.sf.jniinchi.INCHI_PARITY var93 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var94 = var93.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var95 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var10, var39, var87, var89, var93);
    net.sf.jniinchi.JniInchiAtom var96 = var95.getCentralAtom();
    net.sf.jniinchi.JniInchiAtom[] var97 = var95.getNeighbors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var99 = var95.getNeighbor((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var9 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var8);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var17 = var7.addAtom(var13);
    int var18 = var13.getImplicitTritium();
    double var19 = var13.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "InChI_Output: WARNING///hi!/hi!", "InChI_Output: WARNING///hi!/hi!", "", "hi!");
    java.lang.String var6 = var5.getInchi();
    java.lang.String var7 = var5.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var6.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "");
    java.lang.Class var6 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var8 = java.lang.Enum.<java.lang.Enum>valueOf(var6, "InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    var4.setIsotopicMassShift(1);
    var4.setIsotopicMassShift(1);
    int var15 = var4.getImplicitH();
    java.lang.String var16 = var4.getDebugString();
    java.lang.String var17 = var4.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"+ "'", var16.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.ordinal();
    java.lang.Class var4 = var1.getDeclaringClass();
    java.lang.Class var5 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var7 = java.lang.Enum.<java.lang.Enum>valueOf(var5, "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE", "InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("VALID_STANDARD");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    int var5 = var4.getImplicitProtium();
    java.lang.String var6 = var4.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var9.getLog();
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var17.setImplicitProtium(1);
    int var20 = var17.getImplicitDeuterium();
    int var21 = var17.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    int var35 = var28.getIsotopicMass();
    int var36 = var28.getCharge();
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var46 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var47 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var17, var23, var28, var41, var46);
    net.sf.jniinchi.JniInchiStereo0D var48 = var9.addStereo0D(var47);
    net.sf.jniinchi.JniInchiStereo0D var49 = var0.addStereo0D(var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var50 = net.sf.jniinchi.JniInchiWrapper.getInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var9 = var8.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var10 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var8);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var15.setImplicitProtium(1);
    int var18 = var15.getImplicitDeuterium();
    int var19 = var15.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    int var33 = var26.getIsotopicMass();
    int var34 = var26.getCharge();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var44 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var45 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var15, var21, var26, var39, var44);
    net.sf.jniinchi.JniInchiStereo0D var46 = var7.addStereo0D(var45);
    net.sf.jniinchi.INCHI_PARITY var47 = var45.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var49 = var45.getNeighbor(0);
    net.sf.jniinchi.INCHI_PARITY var50 = var45.getParity();
    int var51 = var50.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI_Output: WARNING/SINGLE_2UP/OK/InChI_Output: WARNING///hi!/hi!/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(0);
    int var2 = var1.getIndx();
    java.lang.Class var3 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var5 = java.lang.Enum.<java.lang.Enum>valueOf(var3, "hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(1);
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "net.sf.jniinchi.LoadNativeLibraryException", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    var4.setImplicitDeuterium(0);
    int var14 = var4.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var19.setImplicitProtium(1);
    double var22 = var19.getY();
    net.sf.jniinchi.INCHI_RADICAL var23 = var19.getRadical();
    var4.setRadical(var23);
    var4.setIsotopicMassShift((-1));
    int var27 = var4.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    net.sf.jniinchi.LoadNativeLibraryException var4 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var8 = new net.sf.jniinchi.JniInchiOutputKey(var6, "OK");
    java.lang.String var9 = var8.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "OK"+ "'", var9.equals("OK"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.INCHI_RET var10 = var7.getReturnStatus();
    int var11 = var7.getNumBonds();
    int var12 = var7.getNumStereo0D();
    int var13 = var7.getNumStereo0D();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    var1.setImplicitH(1);
    java.lang.String var4 = var1.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    var4.setImplicitDeuterium(0);
    int var14 = var4.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var19.setImplicitProtium(1);
    double var22 = var19.getY();
    net.sf.jniinchi.INCHI_RADICAL var23 = var19.getRadical();
    var4.setRadical(var23);
    net.sf.jniinchi.JniInchiOutput var30 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var31 = var30.getReturnStatus();
    java.lang.String var32 = var30.toString();
    boolean var33 = var23.equals((java.lang.Object)var30);
    int var34 = var23.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "InChI_Output: EOF/hi!///"+ "'", var32.equals("InChI_Output: EOF/hi!///"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue((-1));
    net.sf.jniinchi.JniInchiOutput var6 = new net.sf.jniinchi.JniInchiOutput(var1, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "hi!", "");
    java.lang.String var7 = var6.getInchi();
    java.lang.String var8 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/"+ "'", var8.equals("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(1, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    net.sf.jniinchi.JniInchiStructure var0 = net.sf.jniinchi.Main.getTestMolecule();
    net.sf.jniinchi.JniInchiAtom var5 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var5.setImplicitProtium(1);
    int var8 = var5.getImplicitDeuterium();
    int var9 = var5.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    int var23 = var16.getIsotopicMass();
    int var24 = var16.getCharge();
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    var29.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var34 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var35 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var5, var11, var16, var29, var34);
    net.sf.jniinchi.INCHI_PARITY var37 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var35.setDisconnectedParity(var37);
    net.sf.jniinchi.JniInchiStereo0D var39 = var0.addStereo0D(var35);
    net.sf.jniinchi.INCHI_STEREOTYPE var40 = var39.getStereoType();
    int var41 = var40.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var11 = var9.getStereo0D(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    java.lang.String var11 = var7.getLog();
    int var12 = var7.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var14 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.LoadNativeLibraryException: ", "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var3 = var1.getBond(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    int var7 = var4.getImplicitDeuterium();
    int var8 = var4.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    int var22 = var15.getIsotopicMass();
    int var23 = var15.getCharge();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var33 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var34 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var10, var15, var28, var33);
    net.sf.jniinchi.INCHI_PARITY var36 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var34.setDisconnectedParity(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var39 = var34.getNeighbor(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var4 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
    int var2 = var1.getIsotopicMass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    int var9 = var4.getImplicitH();
    double var10 = var4.getY();
    int var11 = var4.getCharge();
    double var12 = var4.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10.0d);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var90 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var90.setIsotopicMassShift(1);
    int var93 = var90.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var94 = var10.addAtom(var90);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var96 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10, "net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    int var7 = var4.getImplicitDeuterium();
    int var8 = var4.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    int var22 = var15.getIsotopicMass();
    int var23 = var15.getCharge();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var33 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var34 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var10, var15, var28, var33);
    java.lang.String var35 = var34.getDebugString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var37 = var34.getNeighbor(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var35.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var8 = var1.toString();
    net.sf.jniinchi.JniInchiException var10 = new net.sf.jniinchi.JniInchiException("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    var1.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var12 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var12.equals("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var18 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var18);
    net.sf.jniinchi.JniInchiInput var20 = new net.sf.jniinchi.JniInchiInput();
    var18.setStructure((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var22 = var20.getOptions();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var24 = net.sf.jniinchi.JniInchiWrapper.getInchi(var20);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var11.getOptions();
    net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    var58.setStereoDefinition(var80);
    net.sf.jniinchi.JniInchiBond[] var82 = new net.sf.jniinchi.JniInchiBond[] { var58};
    var11.addBonds(var82);
    net.sf.jniinchi.JniInchiInputData var86 = new net.sf.jniinchi.JniInchiInputData(1, var11, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var91 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var91.setIsotopicMassShift(1);
    int var94 = var91.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var95 = var11.addAtom(var91);
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(1, var11, (-1), "hi!");
    net.sf.jniinchi.INCHI_RET var99 = var98.getReturnValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    long[][] var8 = var7.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var10 = var7.getBond(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    var1.setCharge(0);
    net.sf.jniinchi.JniInchiAtom var8 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var8.setImplicitProtium(1);
    int var11 = var8.getImplicitDeuterium();
    int var12 = var8.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitTritium(10);
    double var23 = var19.getX();
    var19.setCharge(1);
    int var26 = var19.getIsotopicMass();
    int var27 = var19.getCharge();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var37 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var38 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var8, var14, var19, var32, var37);
    net.sf.jniinchi.JniInchiAtom var43 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var44 = var43.getCharge();
    var43.setImplicitTritium(10);
    double var47 = var43.getX();
    var43.setCharge(1);
    var43.setImplicitDeuterium(100);
    int var52 = var43.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var57 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var58 = var57.getCharge();
    var57.setImplicitTritium(10);
    double var61 = var57.getX();
    var57.setCharge(1);
    var57.setImplicitDeuterium(100);
    int var66 = var57.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var68 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var69 = var68.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var77 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var78 = var77.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var79 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var77);
    net.sf.jniinchi.JniInchiAtom[] var80 = new net.sf.jniinchi.JniInchiAtom[] { };
    var79.addAtoms(var80);
    boolean var82 = var68.equals((java.lang.Object)var80);
    net.sf.jniinchi.JniInchiBond var83 = new net.sf.jniinchi.JniInchiBond(var43, var57, var68);
    net.sf.jniinchi.INCHI_BOND_TYPE var84 = var83.getBondType();
    net.sf.jniinchi.JniInchiBond var85 = new net.sf.jniinchi.JniInchiBond(var1, var32, var84);
    int var86 = var1.getImplicitTritium();
    java.lang.String var87 = var1.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("OK");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: OK"+ "'", var3.equals("net.sf.jniinchi.LoadNativeLibraryException: OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: OK"+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: OK"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var2 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var15.setImplicitProtium(1);
    int var18 = var15.getImplicitDeuterium();
    int var19 = var15.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    int var33 = var26.getIsotopicMass();
    int var34 = var26.getCharge();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var44 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var45 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var15, var21, var26, var39, var44);
    net.sf.jniinchi.JniInchiStereo0D var46 = var7.addStereo0D(var45);
    net.sf.jniinchi.INCHI_PARITY var47 = var45.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var49 = var45.getNeighbor(0);
    net.sf.jniinchi.INCHI_PARITY var50 = var45.getParity();
    net.sf.jniinchi.INCHI_PARITY var51 = var45.getParity();
    net.sf.jniinchi.INCHI_PARITY var52 = var45.getDisconnectedParity();
    int var53 = var52.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    java.lang.String var5 = var2.getOptions();
    java.lang.String var6 = var2.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var7 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var8 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var9 = var8.getCharge();
    var8.setImplicitTritium(10);
    double var12 = var8.getX();
    var8.setCharge(1);
    var8.setImplicitDeuterium(100);
    int var17 = var8.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    var22.setImplicitTritium(10);
    double var26 = var22.getX();
    var22.setCharge(1);
    var22.setImplicitDeuterium(100);
    int var31 = var22.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var33 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var34 = var33.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var42 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var43 = var42.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var44 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var42);
    net.sf.jniinchi.JniInchiAtom[] var45 = new net.sf.jniinchi.JniInchiAtom[] { };
    var44.addAtoms(var45);
    boolean var47 = var33.equals((java.lang.Object)var45);
    net.sf.jniinchi.JniInchiBond var48 = new net.sf.jniinchi.JniInchiBond(var8, var22, var33);
    java.lang.String var49 = var48.getDebugString();
    boolean var50 = var1.equals((java.lang.Object)var48);
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = var48.getBondType();
    net.sf.jniinchi.JniInchiAtom var52 = var48.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var53 = var48.getOriginAtom();
    net.sf.jniinchi.INCHI_RADICAL var54 = var53.getRadical();
    var53.setImplicitProtium(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var49.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    var16.setImplicitDeuterium(100);
    int var25 = var16.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var31 = var30.getCharge();
    var30.setImplicitTritium(10);
    double var34 = var30.getX();
    var30.setCharge(1);
    var30.setImplicitDeuterium(100);
    int var39 = var30.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var41 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var42 = var41.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var50 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var51 = var50.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var52 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var50);
    net.sf.jniinchi.JniInchiAtom[] var53 = new net.sf.jniinchi.JniInchiAtom[] { };
    var52.addAtoms(var53);
    boolean var55 = var41.equals((java.lang.Object)var53);
    net.sf.jniinchi.JniInchiBond var56 = new net.sf.jniinchi.JniInchiBond(var16, var30, var41);
    java.lang.String var57 = var56.getDebugString();
    net.sf.jniinchi.JniInchiAtom var62 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var63 = var62.getCharge();
    var62.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var70 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var71 = var70.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var73 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var74 = var73.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var76 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var77 = new net.sf.jniinchi.JniInchiBond(var62, var70, var73, var76);
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = var77.getBondStereo();
    var56.setStereoDefinition(var78);
    net.sf.jniinchi.JniInchiBond[] var80 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var9.addBonds(var80);
    net.sf.jniinchi.JniInchiInput var82 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiInput var83 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var84 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var57.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    double var11 = var4.getZ();
    var4.setImplicitTritium((-1));
    var4.setImplicitTritium(100);
    int var16 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiBond[] var11 = new net.sf.jniinchi.JniInchiBond[] { };
    var10.addBonds(var11);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var24 = var10.addAtom(var17);
    net.sf.jniinchi.JniInchiInputData var27 = new net.sf.jniinchi.JniInchiInputData(1, var10, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var28 = var27.getInput();
    net.sf.jniinchi.JniInchiOutputStructure var36 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var37 = var36.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var38 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var36);
    java.lang.String var39 = var38.getOptions();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiOutputStructure var48 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var49 = var48.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var50 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var48);
    long[][] var51 = var48.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var56 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var57 = var56.getCharge();
    var56.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var67 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var68 = var67.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var70 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var71 = new net.sf.jniinchi.JniInchiBond(var56, var64, var67, var70);
    net.sf.jniinchi.JniInchiBond var72 = var48.addBond(var71);
    net.sf.jniinchi.JniInchiBond[] var73 = new net.sf.jniinchi.JniInchiBond[] { var72};
    var38.addBonds(var73);
    var28.addBonds(var73);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var76 = net.sf.jniinchi.JniInchiWrapper.getInchi(var28);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var1.setCharge(0);
    var1.setImplicitProtium(100);
    double var6 = var1.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var3 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var5 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var1);
    net.sf.jniinchi.JniInchiException var7 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var8 = var7.toString();
    var1.addSuppressed((java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("SINGLE_1UP", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    var4.setIsotopicMassShift(1);
    int var13 = var4.getImplicitProtium();
    var4.setIsotopicMassShift(1);
    java.lang.String var16 = var4.getElementType();
    int var17 = var4.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    java.lang.String var11 = var7.getLog();
    int var12 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutput var18 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var19 = var18.getReturnStatus();
    int var20 = var19.getIndx();
    net.sf.jniinchi.JniInchiOutput var25 = new net.sf.jniinchi.JniInchiOutput(var19, "NONE", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputStructure var26 = new net.sf.jniinchi.JniInchiOutputStructure(var19);
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var29 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    int var9 = var4.getImplicitH();
    java.lang.String var10 = var4.getElementType();
    int var11 = var4.getImplicitProtium();
    var4.setIsotopicMass((-1));
    double var14 = var4.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0d);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("SINGLE_2UP", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom[] var10 = new net.sf.jniinchi.JniInchiAtom[] { };
    var9.addAtoms(var10);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiAtom[] var22 = new net.sf.jniinchi.JniInchiAtom[] { };
    var21.addAtoms(var22);
    var9.addAtoms(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var25 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("SINGLE_2UP");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("NONE", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("OK", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var9.getLog();
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var17.setImplicitProtium(1);
    int var20 = var17.getImplicitDeuterium();
    int var21 = var17.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    int var35 = var28.getIsotopicMass();
    int var36 = var28.getCharge();
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var46 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var47 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var17, var23, var28, var41, var46);
    net.sf.jniinchi.JniInchiStereo0D var48 = var9.addStereo0D(var47);
    net.sf.jniinchi.JniInchiStereo0D var49 = var0.addStereo0D(var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var51 = var48.getNeighbor(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    int var7 = var4.getImplicitDeuterium();
    int var8 = var4.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    int var22 = var15.getIsotopicMass();
    int var23 = var15.getCharge();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var33 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var34 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var10, var15, var28, var33);
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    int var41 = var39.getIsotopicMass();
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitTritium(10);
    double var50 = var46.getX();
    var46.setCharge(1);
    var46.setImplicitDeuterium(100);
    int var55 = var46.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var61 = var60.getCharge();
    var60.setImplicitTritium(10);
    double var64 = var60.getX();
    var60.setCharge(1);
    var60.setImplicitDeuterium(100);
    int var69 = var60.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var71 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var72 = var71.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var80 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var81 = var80.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var82 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var80);
    net.sf.jniinchi.JniInchiAtom[] var83 = new net.sf.jniinchi.JniInchiAtom[] { };
    var82.addAtoms(var83);
    boolean var85 = var71.equals((java.lang.Object)var83);
    net.sf.jniinchi.JniInchiBond var86 = new net.sf.jniinchi.JniInchiBond(var46, var60, var71);
    net.sf.jniinchi.JniInchiAtom var87 = var86.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var89 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var89.debug();
    double var91 = var89.getZ();
    net.sf.jniinchi.INCHI_PARITY var93 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var94 = var93.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var95 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var10, var39, var87, var89, var93);
    net.sf.jniinchi.JniInchiAtom var96 = var95.getCentralAtom();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var98 = var95.getNeighbor(10001);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("OK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiBond[] var11 = new net.sf.jniinchi.JniInchiBond[] { };
    var10.addBonds(var11);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var24 = var10.addAtom(var17);
    net.sf.jniinchi.JniInchiInputData var27 = new net.sf.jniinchi.JniInchiInputData(1, var10, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var28 = var27.getInput();
    net.sf.jniinchi.JniInchiOutputStructure var36 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var37 = var36.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var38 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var36);
    java.lang.String var39 = var38.getOptions();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiOutputStructure var48 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var49 = var48.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var50 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var48);
    long[][] var51 = var48.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var56 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var57 = var56.getCharge();
    var56.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var67 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var68 = var67.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var70 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var71 = new net.sf.jniinchi.JniInchiBond(var56, var64, var67, var70);
    net.sf.jniinchi.JniInchiBond var72 = var48.addBond(var71);
    net.sf.jniinchi.JniInchiBond[] var73 = new net.sf.jniinchi.JniInchiBond[] { var72};
    var38.addBonds(var73);
    var28.addBonds(var73);
    net.sf.jniinchi.JniInchiInput var76 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var77 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var28);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var8 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var9 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.Throwable[] var10 = var1.getSuppressed();
    net.sf.jniinchi.LoadNativeLibraryException var11 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.Throwable[] var12 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    double var11 = var4.getZ();
    var4.setIsotopicMassShift(100);
    java.lang.String var14 = var4.getElementType();
    double var15 = var4.getX();
    var4.setCharge(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    int var7 = var4.getImplicitDeuterium();
    int var8 = var4.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    int var22 = var15.getIsotopicMass();
    int var23 = var15.getCharge();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var33 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var34 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var10, var15, var28, var33);
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    int var41 = var39.getIsotopicMass();
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitTritium(10);
    double var50 = var46.getX();
    var46.setCharge(1);
    var46.setImplicitDeuterium(100);
    int var55 = var46.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var61 = var60.getCharge();
    var60.setImplicitTritium(10);
    double var64 = var60.getX();
    var60.setCharge(1);
    var60.setImplicitDeuterium(100);
    int var69 = var60.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var71 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var72 = var71.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var80 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var81 = var80.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var82 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var80);
    net.sf.jniinchi.JniInchiAtom[] var83 = new net.sf.jniinchi.JniInchiAtom[] { };
    var82.addAtoms(var83);
    boolean var85 = var71.equals((java.lang.Object)var83);
    net.sf.jniinchi.JniInchiBond var86 = new net.sf.jniinchi.JniInchiBond(var46, var60, var71);
    net.sf.jniinchi.JniInchiAtom var87 = var86.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var89 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var89.debug();
    double var91 = var89.getZ();
    net.sf.jniinchi.INCHI_PARITY var93 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var94 = var93.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var95 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var10, var39, var87, var89, var93);
    net.sf.jniinchi.JniInchiAtom var96 = var95.getCentralAtom();
    java.lang.String var97 = var95.getDebugString();
    net.sf.jniinchi.JniInchiAtom var99 = var95.getNeighbor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE"+ "'", var97.equals("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    java.lang.String var5 = var2.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var6 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "OK"+ "'", var5.equals("OK"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    java.lang.String var11 = var7.getLog();
    int var12 = var7.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var14 = var7.getBond(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.LoadNativeLibraryException");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var20 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var22 = net.sf.jniinchi.JniInchiWrapper.getInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    java.lang.String var86 = var85.getErrorMessage();
    java.lang.String var87 = var85.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var88 = var85.getInput();
    net.sf.jniinchi.JniInchiInput var89 = var85.getInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var90 = net.sf.jniinchi.JniInchiWrapper.getInchi(var89);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "hi!"+ "'", var87.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    java.lang.String var5 = var2.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var6 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "OK"+ "'", var5.equals("OK"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "SINGLE_1UP", "net.sf.jniinchi.LoadNativeLibraryException: ", "hi!", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    java.lang.String var6 = var5.getInchi();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "SINGLE_1UP"+ "'", var6.equals("SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitTritium(10);
    double var20 = var16.getX();
    var16.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var23 = var9.addAtom(var16);
    java.lang.String var24 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var26 = var9.getStereo0D(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    var4.setImplicitProtium(0);
    var4.setIsotopicMassShift(0);
    var4.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    var4.setImplicitDeuterium(1);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var12 = var11.getCharge();
    var11.setImplicitTritium(10);
    var11.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var17 = var11.getRadical();
    var11.setIsotopicMassShift(1);
    int var20 = var11.getImplicitProtium();
    var11.setIsotopicMassShift(1);
    java.lang.String var23 = var11.getElementType();
    net.sf.jniinchi.JniInchiOutputStructure var31 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var32 = var31.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var33 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var31);
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var39 = var38.getCharge();
    var38.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var49 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var50 = var49.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var52 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var53 = new net.sf.jniinchi.JniInchiBond(var38, var46, var49, var52);
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = var53.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var55 = var53.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var56 = var31.addBond(var53);
    net.sf.jniinchi.INCHI_BOND_TYPE var57 = var56.getBondType();
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var4, var11, var57);
    java.lang.String var59 = var57.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "NONE"+ "'", var59.equals("NONE"));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!", 100L, 0L, (-1L), 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var9 = var7.getBond(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var4.setImplicitDeuterium((-1));
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var12 = var11.getCharge();
    var11.setImplicitTritium(10);
    double var15 = var11.getX();
    int var16 = var11.getImplicitH();
    java.lang.String var17 = var11.getElementType();
    int var18 = var11.getImplicitProtium();
    var11.setIsotopicMass((-1));
    net.sf.jniinchi.INCHI_BOND_TYPE var22 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var23 = var22.getIndx();
    int var24 = var22.ordinal();
    net.sf.jniinchi.JniInchiBond var25 = new net.sf.jniinchi.JniInchiBond(var4, var11, var22);
    var4.setCharge(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!", "ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitH();
    var4.setImplicitProtium(10);
    double var15 = var4.getZ();
    var4.setImplicitH(100);
    var4.setImplicitProtium(100);
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var25 = var24.getCharge();
    var24.setImplicitTritium(10);
    double var28 = var24.getX();
    var24.setCharge(1);
    var24.setImplicitDeuterium(100);
    int var33 = var24.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var39 = var38.getCharge();
    var38.setImplicitTritium(10);
    double var42 = var38.getX();
    var38.setCharge(1);
    var38.setImplicitDeuterium(100);
    int var47 = var38.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var49 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var50 = var49.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var58 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var59 = var58.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var60 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var58);
    net.sf.jniinchi.JniInchiAtom[] var61 = new net.sf.jniinchi.JniInchiAtom[] { };
    var60.addAtoms(var61);
    boolean var63 = var49.equals((java.lang.Object)var61);
    net.sf.jniinchi.JniInchiBond var64 = new net.sf.jniinchi.JniInchiBond(var24, var38, var49);
    net.sf.jniinchi.INCHI_RADICAL var66 = net.sf.jniinchi.INCHI_RADICAL.getValue(0);
    java.lang.Class var67 = var66.getDeclaringClass();
    var38.setRadical(var66);
    int var69 = var66.ordinal();
    int var70 = var66.getIndx();
    int var71 = var66.getIndx();
    int var72 = var66.getIndx();
    var4.setRadical(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var16.setImplicitProtium(1);
    int var19 = var16.getImplicitDeuterium();
    int var20 = var16.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    int var34 = var27.getIsotopicMass();
    int var35 = var27.getCharge();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var45 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var46 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var16, var22, var27, var40, var45);
    net.sf.jniinchi.INCHI_PARITY var48 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var46.setDisconnectedParity(var48);
    net.sf.jniinchi.INCHI_PARITY var50 = var46.getParity();
    net.sf.jniinchi.INCHI_PARITY var51 = var46.getDisconnectedParity();
    java.lang.String var52 = var46.getDebugString();
    net.sf.jniinchi.JniInchiStereo0D var53 = var8.addStereo0D(var46);
    net.sf.jniinchi.JniInchiAtom[] var54 = var46.getNeighbors();
    net.sf.jniinchi.INCHI_PARITY var55 = var46.getDisconnectedParity();
    int var56 = var55.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var52.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    int var45 = var4.getCharge();
    int var46 = var4.getImplicitH();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    int var2 = var1.ordinal();
    java.lang.String var3 = var1.toString();
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "VALID_STANDARD");
    int var6 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setIsotopicMassShift(1);
    int var7 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    java.lang.String var18 = var17.getOptions();
    net.sf.jniinchi.JniInchiInputData var21 = new net.sf.jniinchi.JniInchiInputData(0, var17, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var22 = var21.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var23 = var21.getInput();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    net.sf.jniinchi.JniInchiAtom var29 = var23.addAtom(var28);
    net.sf.jniinchi.INCHI_BOND_TYPE var31 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var32 = var31.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var40 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var41 = var40.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var40);
    net.sf.jniinchi.JniInchiAtom[] var43 = new net.sf.jniinchi.JniInchiAtom[] { };
    var42.addAtoms(var43);
    boolean var45 = var31.equals((java.lang.Object)var43);
    net.sf.jniinchi.JniInchiBond var46 = new net.sf.jniinchi.JniInchiBond(var4, var29, var31);
    net.sf.jniinchi.JniInchiOutputStructure var55 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var56 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var55);
    net.sf.jniinchi.JniInchiInput var57 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var55);
    net.sf.jniinchi.JniInchiInputData var60 = new net.sf.jniinchi.JniInchiInputData(0, var57, 3, "NONE");
    boolean var61 = var31.equals((java.lang.Object)3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var22.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var9.getLog();
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var17.setImplicitProtium(1);
    int var20 = var17.getImplicitDeuterium();
    int var21 = var17.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    int var35 = var28.getIsotopicMass();
    int var36 = var28.getCharge();
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var46 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var47 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var17, var23, var28, var41, var46);
    net.sf.jniinchi.JniInchiStereo0D var48 = var9.addStereo0D(var47);
    net.sf.jniinchi.JniInchiStereo0D var49 = var0.addStereo0D(var48);
    var48.debug();
    var48.debug();
    net.sf.jniinchi.INCHI_STEREOTYPE var52 = var48.getStereoType();
    net.sf.jniinchi.INCHI_PARITY var53 = var48.getParity();
    int var54 = var53.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("net.sf.jniinchi.JniInchiException: OK");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var8 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var9 = var8.getCharge();
    var8.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var19 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var20 = var19.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var22 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var23 = new net.sf.jniinchi.JniInchiBond(var8, var16, var19, var22);
    boolean var24 = var1.equals((java.lang.Object)var23);
    int var25 = var1.getIndx();
    net.sf.jniinchi.JniInchiOutputKey var27 = new net.sf.jniinchi.JniInchiOutputKey(var1, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.JniInchiOutputStructure var35 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var36 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var35);
    net.sf.jniinchi.JniInchiInput var37 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var35);
    net.sf.jniinchi.INCHI_KEY var39 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var41 = new net.sf.jniinchi.JniInchiOutputKey(var39, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitTritium(10);
    double var50 = var46.getX();
    var46.setCharge(1);
    var46.setImplicitDeuterium(100);
    int var55 = var46.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var61 = var60.getCharge();
    var60.setImplicitTritium(10);
    double var64 = var60.getX();
    var60.setCharge(1);
    var60.setImplicitDeuterium(100);
    int var69 = var60.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var71 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var72 = var71.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var80 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var81 = var80.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var82 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var80);
    net.sf.jniinchi.JniInchiAtom[] var83 = new net.sf.jniinchi.JniInchiAtom[] { };
    var82.addAtoms(var83);
    boolean var85 = var71.equals((java.lang.Object)var83);
    net.sf.jniinchi.JniInchiBond var86 = new net.sf.jniinchi.JniInchiBond(var46, var60, var71);
    java.lang.String var87 = var86.getDebugString();
    boolean var88 = var39.equals((java.lang.Object)var86);
    net.sf.jniinchi.INCHI_BOND_TYPE var89 = var86.getBondType();
    net.sf.jniinchi.JniInchiBond var90 = var37.addBond(var86);
    net.sf.jniinchi.JniInchiAtom var91 = var86.getOriginAtom();
    java.lang.String var92 = var86.getDebugString();
    boolean var93 = var1.equals((java.lang.Object)var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var87.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var92.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setIsotopicMassShift(1);
    int var7 = var4.getImplicitProtium();
    var4.setCharge(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiBond[] var10 = new net.sf.jniinchi.JniInchiBond[] { };
    var9.addBonds(var10);
    net.sf.jniinchi.INCHI_KEY var13 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var15 = new net.sf.jniinchi.JniInchiOutputKey(var13, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var21 = var20.getCharge();
    var20.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var31 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var32 = var31.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var34 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var35 = new net.sf.jniinchi.JniInchiBond(var20, var28, var31, var34);
    boolean var36 = var13.equals((java.lang.Object)var35);
    java.lang.String var37 = var35.getDebugString();
    var35.debug();
    net.sf.jniinchi.JniInchiBond var39 = var9.addBond(var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var40 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var37.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    java.lang.String var9 = var4.getElementType();
    var4.setCharge(10);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiBond[] var22 = new net.sf.jniinchi.JniInchiBond[] { };
    var21.addBonds(var22);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var35 = var21.addAtom(var28);
    net.sf.jniinchi.INCHI_BOND_TYPE var37 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var38 = var37.ordinal();
    net.sf.jniinchi.JniInchiAtom var43 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var44 = var43.getCharge();
    var43.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var51 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var52 = var51.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var54 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var55 = var54.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var57 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var43, var51, var54, var57);
    net.sf.jniinchi.INCHI_BOND_STEREO var59 = var58.getBondStereo();
    net.sf.jniinchi.JniInchiBond var60 = new net.sf.jniinchi.JniInchiBond(var4, var28, var37, var59);
    int var61 = var59.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var9 = var8.getNumBonds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8, "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    int var2 = var1.ordinal();
    java.lang.String var3 = var1.name();
    java.lang.Class var4 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    java.lang.String var2 = var1.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitDeuterium();
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    var17.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var23 = var17.getRadical();
    double var24 = var17.getZ();
    var17.setImplicitDeuterium(100);
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var46 = var45.getCharge();
    var45.setImplicitTritium(10);
    double var49 = var45.getX();
    var45.setCharge(1);
    var45.setImplicitDeuterium(100);
    int var54 = var45.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var56 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var57 = var56.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var65 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var66 = var65.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var67 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var65);
    net.sf.jniinchi.JniInchiAtom[] var68 = new net.sf.jniinchi.JniInchiAtom[] { };
    var67.addAtoms(var68);
    boolean var70 = var56.equals((java.lang.Object)var68);
    net.sf.jniinchi.JniInchiBond var71 = new net.sf.jniinchi.JniInchiBond(var31, var45, var56);
    net.sf.jniinchi.INCHI_RADICAL var73 = net.sf.jniinchi.INCHI_RADICAL.getValue(0);
    java.lang.Class var74 = var73.getDeclaringClass();
    var45.setRadical(var73);
    var17.setRadical(var73);
    var4.setRadical(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("net.sf.jniinchi.LoadNativeLibraryException: ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var12 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var12 = var11.getImplicitProtium();
    var11.debug();
    net.sf.jniinchi.JniInchiAtom var14 = var7.addAtom(var11);
    net.sf.jniinchi.JniInchiOutputStructure var22 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var23 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var22);
    net.sf.jniinchi.INCHI_KEY var25 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var27 = new net.sf.jniinchi.JniInchiOutputKey(var25, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitTritium(10);
    double var50 = var46.getX();
    var46.setCharge(1);
    var46.setImplicitDeuterium(100);
    int var55 = var46.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var57 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var58 = var57.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var66 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var67 = var66.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var68 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var66);
    net.sf.jniinchi.JniInchiAtom[] var69 = new net.sf.jniinchi.JniInchiAtom[] { };
    var68.addAtoms(var69);
    boolean var71 = var57.equals((java.lang.Object)var69);
    net.sf.jniinchi.JniInchiBond var72 = new net.sf.jniinchi.JniInchiBond(var32, var46, var57);
    java.lang.String var73 = var72.getDebugString();
    boolean var74 = var25.equals((java.lang.Object)var72);
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = var72.getBondType();
    java.lang.String var76 = var72.getDebugString();
    net.sf.jniinchi.JniInchiBond[] var77 = new net.sf.jniinchi.JniInchiBond[] { var72};
    var22.addBonds(var77);
    long[][] var79 = var22.getWarningFlags();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var82 = var22.getStereo0D(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var73.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var76.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    net.sf.jniinchi.JniInchiStructure var0 = new net.sf.jniinchi.JniInchiStructure();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiAtom[] var11 = new net.sf.jniinchi.JniInchiAtom[] { };
    var10.addAtoms(var11);
    var0.addAtoms(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var15 = new net.sf.jniinchi.JniInchiInput(var0, "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("SINGLE_2UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    net.sf.jniinchi.JniInchiStructure var0 = new net.sf.jniinchi.JniInchiStructure();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var8.getLog();
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var16.setImplicitProtium(1);
    int var19 = var16.getImplicitDeuterium();
    int var20 = var16.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    int var34 = var27.getIsotopicMass();
    int var35 = var27.getCharge();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var45 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var46 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var16, var22, var27, var40, var45);
    net.sf.jniinchi.JniInchiStereo0D var47 = var8.addStereo0D(var46);
    net.sf.jniinchi.INCHI_PARITY var48 = var46.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var50 = var46.getNeighbor(0);
    net.sf.jniinchi.INCHI_PARITY var51 = var46.getParity();
    net.sf.jniinchi.INCHI_PARITY var52 = var46.getParity();
    net.sf.jniinchi.INCHI_PARITY var53 = var46.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom[] var54 = var46.getNeighbors();
    var0.addAtoms(var54);
    int var56 = var0.getNumAtoms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 4);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var12 = var11.getOptions();
    net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    var58.setStereoDefinition(var80);
    net.sf.jniinchi.JniInchiBond[] var82 = new net.sf.jniinchi.JniInchiBond[] { var58};
    var11.addBonds(var82);
    net.sf.jniinchi.JniInchiInputData var86 = new net.sf.jniinchi.JniInchiInputData(1, var11, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var91 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var91.setIsotopicMassShift(1);
    int var94 = var91.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var95 = var11.addAtom(var91);
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(1, var11, (-1), "hi!");
    java.lang.String var99 = var98.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + "hi!"+ "'", var99.equals("hi!"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var15.setImplicitProtium(1);
    int var18 = var15.getImplicitDeuterium();
    int var19 = var15.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    int var33 = var26.getIsotopicMass();
    int var34 = var26.getCharge();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var44 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var45 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var15, var21, var26, var39, var44);
    net.sf.jniinchi.JniInchiStereo0D var46 = var7.addStereo0D(var45);
    net.sf.jniinchi.JniInchiAtom var51 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var52 = var51.getCharge();
    var51.setImplicitTritium(10);
    var51.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var57 = var51.getRadical();
    var51.setIsotopicMassShift(1);
    int var60 = var51.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var61 = var7.addAtom(var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var63 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, (-1.0d), 1.0d, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.getAuxInfo();
    java.lang.String var8 = var5.getInchi();
    java.lang.String var9 = var5.getAuxInfo();
    java.lang.String var10 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var6.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var10.equals("InChI_Output: WARNING///hi!/hi!"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitH();
    var4.setImplicitDeuterium(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    int var14 = var4.getIsotopicMass();
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    var27.setImplicitDeuterium(100);
    int var36 = var27.getImplicitProtium();
    var27.setImplicitTritium(0);
    var27.setImplicitProtium(10);
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var46 = var45.getCharge();
    var45.setImplicitTritium(10);
    double var49 = var45.getX();
    java.lang.String var50 = var45.getElementType();
    var45.setCharge(10);
    net.sf.jniinchi.JniInchiAtom var57 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.INCHI_PARITY var60 = net.sf.jniinchi.INCHI_PARITY.getValue(3);
    int var61 = var60.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var62 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var19, var27, var45, var57, var60);
    int var63 = var27.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var58.equals("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 10);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    net.sf.jniinchi.JniInchiStructure var0 = new net.sf.jniinchi.JniInchiStructure();
    int var1 = var0.getNumBonds();
    net.sf.jniinchi.JniInchiAtom var3 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var3.setCharge(0);
    var3.setIsotopicMassShift(0);
    net.sf.jniinchi.JniInchiAtom var8 = var0.addAtom(var3);
    int var9 = var3.getCharge();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    java.lang.String var45 = var44.getDebugString();
    net.sf.jniinchi.JniInchiAtom var50 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var51 = var50.getCharge();
    var50.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var58 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var59 = var58.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var61 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var62 = var61.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var64 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var65 = new net.sf.jniinchi.JniInchiBond(var50, var58, var61, var64);
    net.sf.jniinchi.INCHI_BOND_STEREO var66 = var65.getBondStereo();
    var44.setStereoDefinition(var66);
    net.sf.jniinchi.JniInchiAtom var68 = var44.getOriginAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var69 = var44.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var70 = var44.getOriginAtom();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var45.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var9 = var8.getNumBonds();
    net.sf.jniinchi.JniInchiOutputStructure var17 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var18 = var17.getNumAtoms();
    var8.setStructure((net.sf.jniinchi.JniInchiStructure)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var21 = var17.getStereo0D(4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    double var11 = var4.getX();
    var4.setImplicitDeuterium(0);
    var4.setImplicitH(0);
    var4.setImplicitTritium(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE", "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "InChI_Output: WARNING///hi!/hi!", "InChI_Output: WARNING///hi!/hi!", "", "hi!");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI Atom: InChI_Output: WARNING///hi!/hi! [-1.0,1.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    int var7 = var4.getImplicitDeuterium();
    int var8 = var4.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    int var22 = var15.getIsotopicMass();
    int var23 = var15.getCharge();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var33 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var34 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var10, var15, var28, var33);
    var34.debug();
    net.sf.jniinchi.INCHI_PARITY var36 = var34.getDisconnectedParity();
    net.sf.jniinchi.INCHI_STEREOTYPE var37 = var34.getStereoType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var39 = var34.getNeighbor(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiBond[] var22 = new net.sf.jniinchi.JniInchiBond[] { };
    var21.addBonds(var22);
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var35 = var21.addAtom(var28);
    net.sf.jniinchi.JniInchiInputData var38 = new net.sf.jniinchi.JniInchiInputData(1, var21, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var39 = var38.getInput();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var41 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var39);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var12.setImplicitProtium(1);
    int var15 = var12.getImplicitDeuterium();
    int var16 = var12.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var24 = var23.getCharge();
    var23.setImplicitTritium(10);
    double var27 = var23.getX();
    var23.setCharge(1);
    int var30 = var23.getIsotopicMass();
    int var31 = var23.getCharge();
    net.sf.jniinchi.JniInchiAtom var36 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var37 = var36.getCharge();
    var36.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var41 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var42 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var12, var18, var23, var36, var41);
    net.sf.jniinchi.JniInchiAtom[] var43 = var42.getNeighbors();
    var7.addAtoms(var43);
    int var45 = var7.getNumStereo0D();
    java.lang.String var46 = var7.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var46.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var9 = var8.getNumBonds();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var11 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var8);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var15.setImplicitProtium(1);
    int var18 = var15.getImplicitDeuterium();
    int var19 = var15.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    int var33 = var26.getIsotopicMass();
    int var34 = var26.getCharge();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var44 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var45 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var15, var21, var26, var39, var44);
    net.sf.jniinchi.JniInchiStereo0D var46 = var7.addStereo0D(var45);
    net.sf.jniinchi.INCHI_PARITY var47 = var45.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var49 = var45.getNeighbor(0);
    net.sf.jniinchi.INCHI_PARITY var50 = var45.getParity();
    net.sf.jniinchi.INCHI_PARITY var51 = var45.getParity();
    var45.debug();
    net.sf.jniinchi.JniInchiAtom[] var53 = var45.getNeighbors();
    java.lang.String var54 = var45.getDebugString();
    java.lang.String var55 = var45.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var54.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var55.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var12 = var0.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var14 = var0.getStereo0D(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.INCHI_KEY var10 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var12 = new net.sf.jniinchi.JniInchiOutputKey(var10, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    boolean var59 = var10.equals((java.lang.Object)var57);
    net.sf.jniinchi.INCHI_BOND_TYPE var60 = var57.getBondType();
    net.sf.jniinchi.JniInchiAtom var61 = var57.getOriginAtom();
    net.sf.jniinchi.JniInchiBond var62 = var7.addBond(var57);
    int var63 = var7.getNumAtoms();
    long[][] var64 = var7.getWarningFlags();
    net.sf.jniinchi.INCHI_RET var65 = var7.getReturnStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    net.sf.jniinchi.INCHI_RADICAL var8 = var4.getRadical();
    var4.setIsotopicMass(10);
    double var11 = var4.getZ();
    var4.setIsotopicMass(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    int var4 = var1.getIndx();
    java.lang.String var5 = var1.toString();
    int var6 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "VALID_STANDARD"+ "'", var5.equals("VALID_STANDARD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.String var8 = var1.toString();
    net.sf.jniinchi.JniInchiException var10 = new net.sf.jniinchi.JniInchiException("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    var1.addSuppressed((java.lang.Throwable)var10);
    net.sf.jniinchi.JniInchiException var13 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var14 = var13.toString();
    var1.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var16 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var14.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var16.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.LoadNativeLibraryException: OK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var3);
    net.sf.jniinchi.LoadNativeLibraryException var7 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var6);
    net.sf.jniinchi.LoadNativeLibraryException var8 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var7);
    net.sf.jniinchi.LoadNativeLibraryException var9 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var7);
    java.lang.Throwable[] var10 = var7.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var17 = var7.addAtom(var13);
    int var18 = var13.getCharge();
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var24 = var23.getCharge();
    var23.setImplicitTritium(10);
    double var27 = var23.getX();
    var23.setCharge(1);
    double var30 = var23.getZ();
    var23.setIsotopicMassShift(100);
    net.sf.jniinchi.JniInchiAtom var37 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var37.setImplicitDeuterium((-1));
    net.sf.jniinchi.JniInchiAtom var44 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var45 = var44.getCharge();
    var44.setImplicitTritium(10);
    double var48 = var44.getX();
    int var49 = var44.getImplicitH();
    java.lang.String var50 = var44.getElementType();
    int var51 = var44.getImplicitProtium();
    var44.setIsotopicMass((-1));
    net.sf.jniinchi.INCHI_BOND_TYPE var55 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var56 = var55.getIndx();
    int var57 = var55.ordinal();
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var37, var44, var55);
    int var59 = var55.getIndx();
    net.sf.jniinchi.JniInchiAtom var64 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var65 = var64.getCharge();
    var64.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var75 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var76 = var75.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var64, var72, var75, var78);
    net.sf.jniinchi.INCHI_BOND_STEREO var80 = var79.getBondStereo();
    int var81 = var80.ordinal();
    net.sf.jniinchi.JniInchiBond var82 = new net.sf.jniinchi.JniInchiBond(var13, var23, var55, var80);
    net.sf.jniinchi.INCHI_RADICAL var83 = var13.getRadical();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "hi!"+ "'", var50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("net.sf.jniinchi.JniInchiException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.JniInchiOutputStructure var21 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var22 = var21.getNumAtoms();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var24 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.INCHI_KEY var11 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var13 = new net.sf.jniinchi.JniInchiOutputKey(var11, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    var32.setImplicitTritium(10);
    double var36 = var32.getX();
    var32.setCharge(1);
    var32.setImplicitDeuterium(100);
    int var41 = var32.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var43 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var44 = var43.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    boolean var57 = var43.equals((java.lang.Object)var55);
    net.sf.jniinchi.JniInchiBond var58 = new net.sf.jniinchi.JniInchiBond(var18, var32, var43);
    java.lang.String var59 = var58.getDebugString();
    boolean var60 = var11.equals((java.lang.Object)var58);
    net.sf.jniinchi.INCHI_BOND_TYPE var61 = var58.getBondType();
    net.sf.jniinchi.JniInchiBond var62 = var9.addBond(var58);
    net.sf.jniinchi.INCHI_BOND_STEREO var64 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    int var65 = var64.getIndx();
    var62.setStereoDefinition(var64);
    int var67 = var64.getIndx();
    java.lang.Class var68 = var64.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var70 = java.lang.Enum.<java.lang.Enum>valueOf(var68, "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var59.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    var18.setImplicitDeuterium(100);
    int var27 = var18.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var29 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var30 = var29.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    net.sf.jniinchi.JniInchiAtom[] var41 = new net.sf.jniinchi.JniInchiAtom[] { };
    var40.addAtoms(var41);
    boolean var43 = var29.equals((java.lang.Object)var41);
    net.sf.jniinchi.JniInchiBond var44 = new net.sf.jniinchi.JniInchiBond(var4, var18, var29);
    int var45 = var4.getCharge();
    var4.setIsotopicMassShift(10);
    double var48 = var4.getY();
    var4.setImplicitProtium(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10.0d);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var11 = var10.getOptions();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom var17 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var18 = var17.getCharge();
    var17.setImplicitTritium(10);
    double var21 = var17.getX();
    var17.setCharge(1);
    var17.setImplicitDeuterium(100);
    int var26 = var17.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitTritium(10);
    double var35 = var31.getX();
    var31.setCharge(1);
    var31.setImplicitDeuterium(100);
    int var40 = var31.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var42 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var43 = var42.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiAtom[] var54 = new net.sf.jniinchi.JniInchiAtom[] { };
    var53.addAtoms(var54);
    boolean var56 = var42.equals((java.lang.Object)var54);
    net.sf.jniinchi.JniInchiBond var57 = new net.sf.jniinchi.JniInchiBond(var17, var31, var42);
    java.lang.String var58 = var57.getDebugString();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var72 = var71.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var74 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var75 = var74.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var77 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var78 = new net.sf.jniinchi.JniInchiBond(var63, var71, var74, var77);
    net.sf.jniinchi.INCHI_BOND_STEREO var79 = var78.getBondStereo();
    var57.setStereoDefinition(var79);
    net.sf.jniinchi.JniInchiBond[] var81 = new net.sf.jniinchi.JniInchiBond[] { var57};
    var10.addBonds(var81);
    net.sf.jniinchi.JniInchiInputData var85 = new net.sf.jniinchi.JniInchiInputData(1, var10, 10, "hi!");
    net.sf.jniinchi.JniInchiAtom var90 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var90.setIsotopicMassShift(1);
    int var93 = var90.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var94 = var10.addAtom(var90);
    int var95 = var94.getCharge();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var58.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var15.setImplicitProtium(1);
    int var18 = var15.getImplicitDeuterium();
    int var19 = var15.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    int var33 = var26.getIsotopicMass();
    int var34 = var26.getCharge();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var44 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var45 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var15, var21, var26, var39, var44);
    net.sf.jniinchi.JniInchiStereo0D var46 = var7.addStereo0D(var45);
    net.sf.jniinchi.JniInchiAtom var47 = var46.getCentralAtom();
    var46.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    java.lang.String var2 = var1.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var3 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "OK", 100L, 1L, (-1L), 100L);
    net.sf.jniinchi.JniInchiOutput var13 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var14 = var13.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var15 = var13.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var20 = new net.sf.jniinchi.JniInchiOutput(var15, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    int var21 = var15.getIndx();
    net.sf.jniinchi.JniInchiOutputStructure var22 = new net.sf.jniinchi.JniInchiOutputStructure(var15);
    int var23 = var22.getNumAtoms();
    net.sf.jniinchi.JniInchiOutputStructure var31 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var32 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var31);
    net.sf.jniinchi.INCHI_KEY var34 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var36 = new net.sf.jniinchi.JniInchiOutputKey(var34, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitTritium(10);
    double var45 = var41.getX();
    var41.setCharge(1);
    var41.setImplicitDeuterium(100);
    int var50 = var41.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var55 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var56 = var55.getCharge();
    var55.setImplicitTritium(10);
    double var59 = var55.getX();
    var55.setCharge(1);
    var55.setImplicitDeuterium(100);
    int var64 = var55.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var66 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var67 = var66.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var75 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var76 = var75.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var77 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var75);
    net.sf.jniinchi.JniInchiAtom[] var78 = new net.sf.jniinchi.JniInchiAtom[] { };
    var77.addAtoms(var78);
    boolean var80 = var66.equals((java.lang.Object)var78);
    net.sf.jniinchi.JniInchiBond var81 = new net.sf.jniinchi.JniInchiBond(var41, var55, var66);
    java.lang.String var82 = var81.getDebugString();
    boolean var83 = var34.equals((java.lang.Object)var81);
    net.sf.jniinchi.INCHI_BOND_TYPE var84 = var81.getBondType();
    java.lang.String var85 = var81.getDebugString();
    net.sf.jniinchi.JniInchiBond[] var86 = new net.sf.jniinchi.JniInchiBond[] { var81};
    var31.addBonds(var86);
    var22.addBonds(var86);
    var7.addBonds(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var82.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var85.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI_Output: EOF/hi!///");

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    java.lang.String var6 = var5.getKey();
    net.sf.jniinchi.INCHI_KEY var7 = var5.getReturnStatus();
    java.lang.String var8 = var5.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.JniInchiInput var14 = var13.getInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var15 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var14);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

}
