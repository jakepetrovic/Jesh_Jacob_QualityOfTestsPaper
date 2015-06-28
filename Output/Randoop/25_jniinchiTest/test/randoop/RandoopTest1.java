package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    var1.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    var1.setStructure((net.sf.jniinchi.JniInchiStructure)var20);
    net.sf.jniinchi.JniInchiInputData var25 = new net.sf.jniinchi.JniInchiInputData((-1), var1, (-1), "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var27 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var1, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getInchi();
    java.lang.String var4 = var1.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var5 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var4.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI_Output: EOF/hi!///");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


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
      net.sf.jniinchi.JniInchiInput var97 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19, "InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getInchi();
    java.lang.String var4 = var1.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var5 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var4.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var11.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    int var23 = var18.getImplicitH();
    java.lang.String var24 = var18.getElementType();
    int var25 = var18.getImplicitProtium();
    int var26 = var18.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitProtium(1);
    var31.setImplicitDeuterium(10001);
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitTritium(10);
    double var45 = var41.getX();
    var41.setCharge(1);
    int var48 = var41.getIsotopicMass();
    net.sf.jniinchi.INCHI_PARITY var50 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var51 = var50.getIndx();
    int var52 = var50.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var53 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var11, var18, var31, var41, var50);
    var11.setImplicitTritium(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var2 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var15 = var13.getInput();
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    net.sf.jniinchi.JniInchiAtom var21 = var15.addAtom(var20);
    java.lang.String var22 = var21.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var1.getSuppressed();
    java.lang.String var9 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var11 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var13 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    var11.addSuppressed((java.lang.Throwable)var13);
    net.sf.jniinchi.JniInchiException var15 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var9.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


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
    int var25 = var23.getIndx();
    java.lang.Class var26 = var23.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var28 = java.lang.Enum.<java.lang.Enum>valueOf(var26, "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var4.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var11.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    int var23 = var18.getImplicitH();
    java.lang.String var24 = var18.getElementType();
    int var25 = var18.getImplicitProtium();
    int var26 = var18.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitProtium(1);
    var31.setImplicitDeuterium(10001);
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitTritium(10);
    double var45 = var41.getX();
    var41.setCharge(1);
    int var48 = var41.getIsotopicMass();
    net.sf.jniinchi.INCHI_PARITY var50 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var51 = var50.getIndx();
    int var52 = var50.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var53 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var11, var18, var31, var41, var50);
    net.sf.jniinchi.JniInchiAtom var54 = var53.getCentralAtom();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var56 = var53.getNeighbor(4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom[] var10 = new net.sf.jniinchi.JniInchiAtom[] { };
    var9.addAtoms(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "SINGLE_2UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "InChI_Output: WARNING///hi!/hi!", "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var11 = new net.sf.jniinchi.JniInchiOutput(var6, "net.sf.jniinchi.LoadNativeLibraryException: ", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
    java.lang.String var12 = var11.getAuxInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"+ "'", var12.equals("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    var4.setImplicitH((-1));
    var4.setCharge(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(10, "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 100L, 1L, (-1L), 100L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var17 = var16.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    net.sf.jniinchi.JniInchiBond[] var19 = new net.sf.jniinchi.JniInchiBond[] { };
    var18.addBonds(var19);
    net.sf.jniinchi.JniInchiAtom var25 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var26 = var25.getCharge();
    var25.setImplicitTritium(10);
    double var29 = var25.getX();
    var25.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var32 = var18.addAtom(var25);
    java.lang.String var33 = var18.getOptions();
    int var34 = var18.getNumBonds();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitTritium(10);
    double var43 = var39.getX();
    java.lang.String var44 = var39.getElementType();
    var39.setCharge(10);
    net.sf.jniinchi.JniInchiOutputStructure var54 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var55 = var54.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var56 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var54);
    net.sf.jniinchi.JniInchiBond[] var57 = new net.sf.jniinchi.JniInchiBond[] { };
    var56.addBonds(var57);
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitTritium(10);
    double var67 = var63.getX();
    var63.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var70 = var56.addAtom(var63);
    net.sf.jniinchi.INCHI_BOND_TYPE var72 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var73 = var72.ordinal();
    net.sf.jniinchi.JniInchiAtom var78 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var79 = var78.getCharge();
    var78.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var86 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var87 = var86.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var89 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var90 = var89.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var92 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var93 = new net.sf.jniinchi.JniInchiBond(var78, var86, var89, var92);
    net.sf.jniinchi.INCHI_BOND_STEREO var94 = var93.getBondStereo();
    net.sf.jniinchi.JniInchiBond var95 = new net.sf.jniinchi.JniInchiBond(var39, var63, var72, var94);
    int var96 = var63.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom[] var97 = new net.sf.jniinchi.JniInchiAtom[] { var63};
    var18.addAtoms(var97);
    var7.addAtoms(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiStructure var9 = new net.sf.jniinchi.JniInchiStructure();
    net.sf.jniinchi.JniInchiOutputStructure var17 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var18 = var17.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var17);
    net.sf.jniinchi.JniInchiAtom[] var20 = new net.sf.jniinchi.JniInchiAtom[] { };
    var19.addAtoms(var20);
    var9.addAtoms(var20);
    var7.setStructure(var9);
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput(var9);
    int var25 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiOutputStructure var33 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var34 = var33.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var35 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var33);
    net.sf.jniinchi.JniInchiBond[] var36 = new net.sf.jniinchi.JniInchiBond[] { };
    var35.addBonds(var36);
    var9.addBonds(var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var40 = var9.getAtom(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(0);
    java.lang.Class var2 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var4 = java.lang.Enum.<java.lang.Enum>valueOf(var2, "EOF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


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
    int var41 = var39.getNumBonds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var42 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var39);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var2 = var1.getImplicitProtium();
    var1.debug();
    double var4 = var1.getX();
    double var5 = var1.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "EOF");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


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
    net.sf.jniinchi.JniInchiAtom var63 = var58.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var64 = var58.getTargetAtom();
    var58.debug();
    java.lang.String var66 = var58.getDebugString();
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var66.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    long[][] var22 = var19.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var38 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var39 = var38.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var41 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var42 = new net.sf.jniinchi.JniInchiBond(var27, var35, var38, var41);
    net.sf.jniinchi.JniInchiBond var43 = var19.addBond(var42);
    net.sf.jniinchi.JniInchiBond var44 = var9.addBond(var42);
    int var45 = var9.getNumAtoms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var5 = var4.getImplicitTritium();
    var4.setImplicitProtium((-1));
    java.lang.String var8 = var4.getDebugString();
    var4.setCharge(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE"+ "'", var8.equals("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(100, "OK", "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:10 // Radical: NONE");

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(10, "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "DOUBLEBOND", 100L, (-1L), 10L, (-1L));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("net.sf.jniinchi.JniInchiException: OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.getValue(3);
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:3 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.getValue(1);
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    int var4 = var1.getIndx();
    int var5 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.ordinal();
    java.lang.Class var4 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "DOUBLEBOND");
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

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


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
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var48 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var49 = var48.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var51 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var52 = new net.sf.jniinchi.JniInchiBond(var18, var46, var48, var51);
    net.sf.jniinchi.JniInchiAtom var53 = var52.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var54 = var52.getTargetAtom();
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    int var13 = var4.getImplicitProtium();
    var4.setImplicitTritium(0);
    var4.setImplicitProtium(10);
    var4.setIsotopicMass(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    long[][] var14 = var13.getWarningFlags();
    long[][] var15 = var13.getWarningFlags();
    net.sf.jniinchi.JniInchiOutputStructure var23 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var24 = var23.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var25 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var23);
    java.lang.String var26 = var25.getOptions();
    net.sf.jniinchi.JniInchiInput var27 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var25);
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
    net.sf.jniinchi.JniInchiAtom var78 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var79 = var78.getCharge();
    var78.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var86 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var87 = var86.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var89 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var90 = var89.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var92 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var93 = new net.sf.jniinchi.JniInchiBond(var78, var86, var89, var92);
    net.sf.jniinchi.INCHI_BOND_STEREO var94 = var93.getBondStereo();
    var72.setStereoDefinition(var94);
    net.sf.jniinchi.JniInchiBond[] var96 = new net.sf.jniinchi.JniInchiBond[] { var72};
    var25.addBonds(var96);
    var13.addBonds(var96);
    long[][] var99 = var13.getWarningFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
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
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    int var33 = var7.getNumBonds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var15 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var16 = var15.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var18 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var19 = new net.sf.jniinchi.JniInchiBond(var4, var12, var15, var18);
    var12.setIsotopicMass(1);
    java.lang.String var22 = var12.getElementType();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


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
    int var25 = var9.getNumBonds();
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var31 = var30.getCharge();
    var30.setImplicitTritium(10);
    double var34 = var30.getX();
    java.lang.String var35 = var30.getElementType();
    var30.setCharge(10);
    net.sf.jniinchi.JniInchiOutputStructure var45 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var46 = var45.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var47 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var45);
    net.sf.jniinchi.JniInchiBond[] var48 = new net.sf.jniinchi.JniInchiBond[] { };
    var47.addBonds(var48);
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var55 = var54.getCharge();
    var54.setImplicitTritium(10);
    double var58 = var54.getX();
    var54.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var61 = var47.addAtom(var54);
    net.sf.jniinchi.INCHI_BOND_TYPE var63 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var64 = var63.ordinal();
    net.sf.jniinchi.JniInchiAtom var69 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var70 = var69.getCharge();
    var69.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var77 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var78 = var77.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var80 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var81 = var80.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var83 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var84 = new net.sf.jniinchi.JniInchiBond(var69, var77, var80, var83);
    net.sf.jniinchi.INCHI_BOND_STEREO var85 = var84.getBondStereo();
    net.sf.jniinchi.JniInchiBond var86 = new net.sf.jniinchi.JniInchiBond(var30, var54, var63, var85);
    int var87 = var54.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom[] var88 = new net.sf.jniinchi.JniInchiAtom[] { var54};
    var9.addAtoms(var88);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var91 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: InChI_Output: WARNING///hi!/hi! [-1.0,1.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


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
    int var48 = var4.getImplicitProtium();
    
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
    assertTrue(var48 == 0);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:3 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_RADICAL var8 = var4.getRadical();
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    var13.setImplicitDeuterium(100);
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var20.setImplicitDeuterium(100);
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    var35.setImplicitTritium(10);
    double var39 = var35.getX();
    var35.setCharge(1);
    double var42 = var35.getZ();
    var35.setImplicitTritium((-1));
    java.lang.String var45 = var35.getElementType();
    var35.setImplicitDeuterium((-1));
    var35.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var54.setImplicitProtium(1);
    int var57 = var54.getImplicitDeuterium();
    int var58 = var54.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var65 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var66 = var65.getCharge();
    var65.setImplicitTritium(10);
    double var69 = var65.getX();
    var65.setCharge(1);
    int var72 = var65.getIsotopicMass();
    int var73 = var65.getCharge();
    net.sf.jniinchi.JniInchiAtom var78 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var79 = var78.getCharge();
    var78.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var83 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var84 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var54, var60, var65, var78, var83);
    net.sf.jniinchi.INCHI_PARITY var86 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var84.setDisconnectedParity(var86);
    net.sf.jniinchi.INCHI_PARITY var88 = var84.getParity();
    net.sf.jniinchi.JniInchiAtom[] var89 = var84.getNeighbors();
    net.sf.jniinchi.JniInchiAtom var90 = var84.getCentralAtom();
    net.sf.jniinchi.INCHI_PARITY var91 = var84.getParity();
    net.sf.jniinchi.JniInchiStereo0D var92 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var13, var20, var27, var35, var91);
    var27.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(1);
    net.sf.jniinchi.JniInchiOutput var6 = new net.sf.jniinchi.JniInchiOutput(var1, "OK", "InChI_Output: EOF/hi!///", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///");
    net.sf.jniinchi.JniInchiOutput var11 = new net.sf.jniinchi.JniInchiOutput(var1, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE", "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    java.lang.String var12 = var11.getInchi();
    java.lang.String var13 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE"+ "'", var12.equals("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var13.equals("InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


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
    net.sf.jniinchi.JniInchiAtom var50 = new net.sf.jniinchi.JniInchiAtom(0.0d, 100.0d, (-1.0d), "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_RADICAL var51 = var50.getRadical();
    var45.setRadical(var51);
    int var53 = var45.getImplicitTritium();
    var45.setCharge(4);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 10);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    java.lang.String var5 = var2.getOptions();
    java.lang.String var6 = var2.getOptions();
    java.lang.String var7 = var2.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "OK"+ "'", var7.equals("OK"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    var4.setImplicitProtium(0);
    var4.setIsotopicMassShift(0);
    var4.setImplicitDeuterium(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE [1.0,-1.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    int var8 = var6.getIndx();
    int var9 = var6.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


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
    java.lang.Class var52 = var46.getDeclaringClass();
    java.lang.Class var53 = var46.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var55 = java.lang.Enum.<java.lang.Enum>valueOf(var53, "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


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
    java.lang.String var65 = var7.getLog();
    net.sf.jniinchi.JniInchiOutputStructure var73 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var74 = var73.getNumAtoms();
    net.sf.jniinchi.JniInchiStructure var75 = new net.sf.jniinchi.JniInchiStructure();
    net.sf.jniinchi.JniInchiOutputStructure var83 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var84 = var83.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var85 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var83);
    net.sf.jniinchi.JniInchiAtom[] var86 = new net.sf.jniinchi.JniInchiAtom[] { };
    var85.addAtoms(var86);
    var75.addAtoms(var86);
    var73.setStructure(var75);
    net.sf.jniinchi.JniInchiInput var90 = new net.sf.jniinchi.JniInchiInput(var75);
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var90);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var93 = var90.getBond(10);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var13 = var8.getStereo0D(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, (-1.0d), 1.0d, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
    int var5 = var4.getImplicitProtium();
    var4.setImplicitH((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    java.lang.String var5 = var2.getOptions();
    java.lang.String var6 = var2.getOptions();
    java.lang.String var7 = var2.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var8 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var2);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    java.lang.String var12 = var9.getOptions();
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var21 = var20.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var22 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var23 = var22.getOptions();
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var22);
    net.sf.jniinchi.JniInchiOutputStructure var32 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var33 = var32.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var34 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var32);
    long[][] var35 = var32.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var52 = var51.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var40, var48, var51, var54);
    net.sf.jniinchi.JniInchiBond var56 = var32.addBond(var55);
    net.sf.jniinchi.JniInchiBond[] var57 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var22.addBonds(var57);
    var9.addBonds(var57);
    java.lang.String var60 = var9.getOptions();
    net.sf.jniinchi.JniInchiAtom var65 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var65.setImplicitProtium(1);
    int var68 = var65.getImplicitDeuterium();
    int var69 = var65.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var76 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var77 = var76.getCharge();
    var76.setImplicitTritium(10);
    double var80 = var76.getX();
    var76.setCharge(1);
    int var83 = var76.getIsotopicMass();
    int var84 = var76.getCharge();
    net.sf.jniinchi.JniInchiAtom var89 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var90 = var89.getCharge();
    var89.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var94 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var95 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var65, var71, var76, var89, var94);
    net.sf.jniinchi.JniInchiAtom[] var96 = var95.getNeighbors();
    java.lang.String var97 = var95.getDebugString();
    net.sf.jniinchi.JniInchiStereo0D var98 = var9.addStereo0D(var95);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var99 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var97.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    double var11 = var4.getZ();
    var4.setIsotopicMassShift(100);
    java.lang.String var14 = var4.getElementType();
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitTritium(10);
    var19.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var25 = var19.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var26 = var19.getRadical();
    var4.setRadical(var26);
    net.sf.jniinchi.INCHI_RADICAL var28 = var4.getRadical();
    int var29 = var4.getIsotopicMass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 10100);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var14 = var13.getCharge();
    var13.setImplicitTritium(10);
    double var17 = var13.getX();
    var13.setCharge(1);
    var13.setImplicitDeuterium(100);
    int var22 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    var27.setImplicitDeuterium(100);
    int var36 = var27.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var38 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var39 = var38.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var47 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var48 = var47.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var49 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var47);
    net.sf.jniinchi.JniInchiAtom[] var50 = new net.sf.jniinchi.JniInchiAtom[] { };
    var49.addAtoms(var50);
    boolean var52 = var38.equals((java.lang.Object)var50);
    net.sf.jniinchi.JniInchiBond var53 = new net.sf.jniinchi.JniInchiBond(var13, var27, var38);
    net.sf.jniinchi.JniInchiBond var54 = var7.addBond(var53);
    java.lang.String var55 = var54.getDebugString();
    java.lang.String var56 = var54.getDebugString();
    net.sf.jniinchi.INCHI_BOND_TYPE var57 = var54.getBondType();
    java.lang.String var58 = var57.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var55.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var56.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "NONE"+ "'", var58.equals("NONE"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.ordinal();
    java.lang.Class var4 = var1.getDeclaringClass();
    java.lang.Class var5 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var7 = java.lang.Enum.<java.lang.Enum>valueOf(var5, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
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

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [-1.0,1.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Atom: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE [1.0,-1.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    double var5 = var4.getX();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var10.setImplicitProtium(1);
    double var13 = var10.getY();
    net.sf.jniinchi.INCHI_RADICAL var14 = var10.getRadical();
    var4.setRadical(var14);
    int var16 = var14.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


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
      net.sf.jniinchi.JniInchiOutput var83 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var82);
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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(1);
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    boolean var11 = var1.equals((java.lang.Object)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", (-1L), 10L, 10L, 0L);
    boolean var20 = var1.equals((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI_Output: EOF/hi!///");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(1);
    int var2 = var1.getIndx();
    net.sf.jniinchi.JniInchiAtom var7 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var8 = var7.getCharge();
    var7.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var18 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var19 = var18.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var21 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var22 = new net.sf.jniinchi.JniInchiBond(var7, var15, var18, var21);
    var15.setIsotopicMass(100);
    double var25 = var15.getZ();
    boolean var26 = var1.equals((java.lang.Object)var25);
    int var27 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    double var11 = var4.getZ();
    var4.setImplicitDeuterium(100);
    net.sf.jniinchi.INCHI_RADICAL var14 = var4.getRadical();
    double var15 = var4.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100.0d);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(3, "net.sf.jniinchi.LoadNativeLibraryException");

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "net.sf.jniinchi.LoadNativeLibraryException", "ODD", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE", "");

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


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
    var18.setCharge(4);
    
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

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(0);
    int var2 = var1.getIndx();
    java.lang.Class var3 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var5 = java.lang.Enum.<java.lang.Enum>valueOf(var3, "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
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

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


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
    double var23 = var12.getY();
    java.lang.String var24 = var12.getElementType();
    
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
    assertTrue(var23 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(3);
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    int var4 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


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
    var30.setImplicitDeuterium(2);
    
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

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.LoadNativeLibraryException: OK");
    java.lang.String var2 = var1.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var3 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var18 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var18);
    int var20 = var19.getNumBonds();
    java.lang.String var21 = var19.getOptions();
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
    net.sf.jniinchi.JniInchiBond var68 = var19.addBond(var66);
    net.sf.jniinchi.JniInchiBond var69 = var9.addBond(var66);
    java.lang.String var70 = var66.getDebugString();
    net.sf.jniinchi.INCHI_BOND_TYPE var71 = var66.getBondType();
    int var72 = var71.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var70.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitH();
    var4.setImplicitProtium(10);
    double var15 = var4.getZ();
    double var16 = var4.getX();
    int var17 = var4.getCharge();
    int var18 = var4.getImplicitH();
    
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
    assertTrue(var16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


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
    net.sf.jniinchi.INCHI_RET var45 = var7.getReturnStatus();
    long[][] var46 = var7.getWarningFlags();
    
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
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(1);
    int var2 = var1.getIndx();
    java.lang.Class var3 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var5 = java.lang.Enum.<java.lang.Enum>valueOf(var3, "InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///");
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

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    int var2 = var0.getNumBonds();
    int var3 = var0.getNumAtoms();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var4 = net.sf.jniinchi.JniInchiWrapper.getInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


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
    int var96 = var10.getImplicitDeuterium();
    
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
    assertTrue(var96 == 0);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(1);
    net.sf.jniinchi.JniInchiAtom var6 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var7 = var6.getImplicitTritium();
    var6.setImplicitProtium((-1));
    java.lang.String var10 = var6.getDebugString();
    boolean var11 = var1.equals((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE"+ "'", var10.equals("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI Atom: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE [1.0,-1.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


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
    int var91 = var35.getIndx();
    java.lang.String var92 = var35.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "NONE"+ "'", var92.equals("NONE"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var4.setIsotopicMassShift(100);
    var4.setImplicitDeuterium(2);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    long[][] var10 = var7.getWarningFlags();
    int var11 = var7.getNumAtoms();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var13 = var7.getStereo0D(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
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
    net.sf.jniinchi.JniInchiAtom var37 = var35.getOriginAtom();
    net.sf.jniinchi.JniInchiBond var38 = var9.addBond(var35);
    net.sf.jniinchi.JniInchiOutputStructure var46 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var47 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var46);
    net.sf.jniinchi.JniInchiAtom var52 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var53 = var52.getCharge();
    var52.setImplicitTritium(10);
    double var56 = var52.getX();
    var52.setCharge(1);
    var52.setImplicitDeuterium(100);
    int var61 = var52.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var66 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var67 = var66.getCharge();
    var66.setImplicitTritium(10);
    double var70 = var66.getX();
    var66.setCharge(1);
    var66.setImplicitDeuterium(100);
    int var75 = var66.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var77 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var78 = var77.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var86 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var87 = var86.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var88 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var86);
    net.sf.jniinchi.JniInchiAtom[] var89 = new net.sf.jniinchi.JniInchiAtom[] { };
    var88.addAtoms(var89);
    boolean var91 = var77.equals((java.lang.Object)var89);
    net.sf.jniinchi.JniInchiBond var92 = new net.sf.jniinchi.JniInchiBond(var52, var66, var77);
    net.sf.jniinchi.JniInchiBond var93 = var46.addBond(var92);
    var92.debug();
    net.sf.jniinchi.JniInchiAtom var95 = var92.getTargetAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var96 = var92.getBondStereo();
    var38.setStereoDefinition(var96);
    net.sf.jniinchi.INCHI_OPTION[] var98 = net.sf.jniinchi.INCHI_OPTION.values();
    boolean var99 = var96.equals((java.lang.Object)var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    double var11 = var4.getZ();
    var4.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var14 = var13.getCharge();
    var13.setImplicitTritium(10);
    double var17 = var13.getX();
    var13.setCharge(1);
    var13.setImplicitDeuterium(100);
    int var22 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    var27.setImplicitDeuterium(100);
    int var36 = var27.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var38 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var39 = var38.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var47 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var48 = var47.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var49 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var47);
    net.sf.jniinchi.JniInchiAtom[] var50 = new net.sf.jniinchi.JniInchiAtom[] { };
    var49.addAtoms(var50);
    boolean var52 = var38.equals((java.lang.Object)var50);
    net.sf.jniinchi.JniInchiBond var53 = new net.sf.jniinchi.JniInchiBond(var13, var27, var38);
    net.sf.jniinchi.JniInchiBond var54 = var7.addBond(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var56 = var7.getBond(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    int var2 = var1.ordinal();
    java.lang.String var3 = var1.name();
    java.lang.Class var4 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
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

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


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
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var48 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var49 = var48.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var51 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var52 = new net.sf.jniinchi.JniInchiBond(var18, var46, var48, var51);
    java.lang.Class var53 = var51.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var55 = java.lang.Enum.<java.lang.Enum>valueOf(var53, "net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


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
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    var29.setImplicitTritium(10);
    double var33 = var29.getX();
    var29.setCharge(1);
    int var36 = var29.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    java.lang.String var42 = var41.getElementType();
    net.sf.jniinchi.INCHI_RADICAL var43 = var41.getRadical();
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var48.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var55 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var55.setImplicitProtium(1);
    int var58 = var55.getImplicitDeuterium();
    int var59 = var55.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var61 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var66 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var67 = var66.getCharge();
    var66.setImplicitTritium(10);
    double var70 = var66.getX();
    var66.setCharge(1);
    int var73 = var66.getIsotopicMass();
    int var74 = var66.getCharge();
    net.sf.jniinchi.JniInchiAtom var79 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var80 = var79.getCharge();
    var79.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var84 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var85 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var55, var61, var66, var79, var84);
    net.sf.jniinchi.INCHI_PARITY var87 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var85.setDisconnectedParity(var87);
    net.sf.jniinchi.INCHI_PARITY var89 = var85.getParity();
    java.lang.String var90 = var89.toString();
    net.sf.jniinchi.JniInchiStereo0D var91 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var29, var41, var48, var89);
    net.sf.jniinchi.INCHI_STEREOTYPE var92 = var91.getStereoType();
    int var93 = var92.getIndx();
    
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
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var42.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "ODD"+ "'", var90.equals("ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 1);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", (-1L), 10L, 10L, 0L);
    java.lang.String var8 = var7.getLog();
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput();
    var16.setStructure((net.sf.jniinchi.JniInchiStructure)var18);
    net.sf.jniinchi.JniInchiOutputStructure var27 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var28 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var27);
    int var29 = var28.getNumBonds();
    java.lang.String var30 = var28.getOptions();
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    var35.setImplicitTritium(10);
    double var39 = var35.getX();
    var35.setCharge(1);
    var35.setImplicitDeuterium(100);
    int var44 = var35.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var49 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var50 = var49.getCharge();
    var49.setImplicitTritium(10);
    double var53 = var49.getX();
    var49.setCharge(1);
    var49.setImplicitDeuterium(100);
    int var58 = var49.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var60 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var61 = var60.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var69 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var70 = var69.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var71 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var69);
    net.sf.jniinchi.JniInchiAtom[] var72 = new net.sf.jniinchi.JniInchiAtom[] { };
    var71.addAtoms(var72);
    boolean var74 = var60.equals((java.lang.Object)var72);
    net.sf.jniinchi.JniInchiBond var75 = new net.sf.jniinchi.JniInchiBond(var35, var49, var60);
    java.lang.String var76 = var75.getDebugString();
    net.sf.jniinchi.JniInchiBond var77 = var28.addBond(var75);
    net.sf.jniinchi.JniInchiBond var78 = var18.addBond(var75);
    net.sf.jniinchi.JniInchiBond var79 = var7.addBond(var75);
    net.sf.jniinchi.INCHI_BOND_TYPE var80 = var79.getBondType();
    java.lang.String var81 = var80.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var76.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "NONE"+ "'", var81.equals("NONE"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var12 = var11.getImplicitProtium();
    var11.debug();
    net.sf.jniinchi.JniInchiAtom var14 = var7.addAtom(var11);
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitTritium(10);
    var19.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var25 = var19.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var26 = var19.getRadical();
    var19.setImplicitDeuterium(0);
    int var29 = var19.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var34.setImplicitProtium(1);
    double var37 = var34.getY();
    net.sf.jniinchi.INCHI_RADICAL var38 = var34.getRadical();
    var19.setRadical(var38);
    int var40 = var38.getIndx();
    var14.setRadical(var38);
    int var42 = var14.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


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
    java.lang.String var30 = var27.getErrorMessage();
    net.sf.jniinchi.INCHI_RET var31 = var27.getReturnValue();
    net.sf.jniinchi.INCHI_RET var32 = var27.getReturnValue();
    net.sf.jniinchi.JniInchiInput var33 = var27.getInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var34 = net.sf.jniinchi.JniInchiWrapper.getInchi(var33);
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var30.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


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
    net.sf.jniinchi.JniInchiAtom var63 = var58.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var64 = var58.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var65 = var58.getOriginAtom();
    java.lang.String var66 = var58.getDebugString();
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var66.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


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
    net.sf.jniinchi.INCHI_BOND_TYPE var61 = var60.getBondType();
    net.sf.jniinchi.INCHI_BOND_TYPE var62 = var60.getBondType();
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


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
    int var25 = var23.getIndx();
    java.lang.Class var26 = var23.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var28 = java.lang.Enum.<java.lang.Enum>valueOf(var26, "net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


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
    var4.setImplicitDeuterium(1);
    
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

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("SINGLE_2UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    net.sf.jniinchi.JniInchiOutputStructure var40 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var41 = var40.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var40);
    net.sf.jniinchi.JniInchiAtom[] var43 = new net.sf.jniinchi.JniInchiAtom[] { };
    var42.addAtoms(var43);
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    var42.addAtoms(var55);
    var7.addAtoms(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var60 = var7.getStereo0D(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var7 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var6);
    net.sf.jniinchi.LoadNativeLibraryException var8 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var6);
    java.lang.String var9 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var9.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
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
    net.sf.jniinchi.JniInchiAtom var80 = var56.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var81 = var8.addBond(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var83 = var8.getAtom(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    java.lang.String var12 = var9.getOptions();
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var21 = var20.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var22 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var23 = var22.getOptions();
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var22);
    net.sf.jniinchi.JniInchiOutputStructure var32 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var33 = var32.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var34 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var32);
    long[][] var35 = var32.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var52 = var51.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var40, var48, var51, var54);
    net.sf.jniinchi.JniInchiBond var56 = var32.addBond(var55);
    net.sf.jniinchi.JniInchiBond[] var57 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var22.addBonds(var57);
    var9.addBonds(var57);
    java.lang.String var60 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var62 = var9.getAtom(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var8 = new net.sf.jniinchi.JniInchiOutputKey(var6, "OK");
    net.sf.jniinchi.INCHI_KEY var9 = var8.getReturnStatus();
    int var10 = var9.ordinal();
    net.sf.jniinchi.JniInchiOutputKey var12 = new net.sf.jniinchi.JniInchiOutputKey(var9, "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:10 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(1, "InChI_Output: EOF/hi!///", "InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", 10L, 100L, 100L, (-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var9 = var7.getBond(10100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
    var1.setImplicitProtium(1);
    java.lang.String var4 = var1.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE"+ "'", var4.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var1.setImplicitDeuterium(10100);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(10.0d, 1.0d, (-1.0d), "InChI_Output: EOF/hi!///");
    var4.setCharge(0);
    int var7 = var4.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
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
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
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
    net.sf.jniinchi.JniInchiAtom var80 = var56.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var81 = var8.addBond(var56);
    java.lang.String var82 = var81.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var82.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("net.sf.jniinchi.LoadNativeLibraryException");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var12 = var7.getBond(10100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    var1.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    var1.setStructure((net.sf.jniinchi.JniInchiStructure)var20);
    net.sf.jniinchi.JniInchiInputData var25 = new net.sf.jniinchi.JniInchiInputData((-1), var1, (-1), "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
    java.lang.String var26 = var25.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"+ "'", var26.equals("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(10, "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 100L, 1L, (-1L), 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var9 = var7.getBond(4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var34 = var7.getBond((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("DOUBLEBOND", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    net.sf.jniinchi.JniInchiOutputStructure var40 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var41 = var40.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var40);
    net.sf.jniinchi.JniInchiAtom[] var43 = new net.sf.jniinchi.JniInchiAtom[] { };
    var42.addAtoms(var43);
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    var42.addAtoms(var55);
    var7.addAtoms(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var60 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:3 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var82 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
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

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var11 = new net.sf.jniinchi.JniInchiOutput(var6, "net.sf.jniinchi.LoadNativeLibraryException: ", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
    net.sf.jniinchi.INCHI_RET var12 = var11.getReturnStatus();
    java.lang.String var13 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "InChI_Output: EOF/net.sf.jniinchi.LoadNativeLibraryException: /InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"+ "'", var13.equals("InChI_Output: EOF/net.sf.jniinchi.LoadNativeLibraryException: /InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var2 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(9999);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumAtoms();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var11 = var7.getBond(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


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
    java.lang.String var61 = var60.getDebugString();
    net.sf.jniinchi.INCHI_BOND_STEREO var62 = var60.getBondStereo();
    net.sf.jniinchi.INCHI_BOND_TYPE var63 = var60.getBondType();
    
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
    assertTrue("'" + var61 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var61.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI_Output: EOF/hi!///");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    long[][] var8 = var7.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var10 = var7.getStereo0D(9999);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var70 = var69.getStereoType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var72 = var69.getNeighbor(100);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.INCHI_RET var9 = var8.getReturnStatus();
    long[][] var10 = var8.getWarningFlags();
    int var11 = var8.getNumBonds();
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    net.sf.jniinchi.JniInchiBond[] var22 = new net.sf.jniinchi.JniInchiBond[] { };
    var21.addBonds(var22);
    var8.addBonds(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var26 = var8.getStereo0D(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


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
      net.sf.jniinchi.JniInchiOutput var84 = net.sf.jniinchi.JniInchiWrapper.getInchi(var83);
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

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    net.sf.jniinchi.JniInchiException var8 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var4);
    java.lang.String var9 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var9.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    int var12 = var11.getNumBonds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var14 = var11.getAtom(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var3 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var0, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("EOF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    int var11 = var7.getNumStereo0D();
    net.sf.jniinchi.INCHI_RET var12 = var7.getReturnStatus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var14 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.toString();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var6.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("InChI_Output: WARNING///hi!/hi!"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    long[][] var14 = var13.getWarningFlags();
    long[][] var15 = var13.getWarningFlags();
    java.lang.String var16 = var13.getLog();
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var13);
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var26 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var27 = var26.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var28 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var26);
    var18.setStructure((net.sf.jniinchi.JniInchiStructure)var26);
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var34.setImplicitProtium(1);
    int var37 = var34.getImplicitDeuterium();
    int var38 = var34.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var46 = var45.getCharge();
    var45.setImplicitTritium(10);
    double var49 = var45.getX();
    var45.setCharge(1);
    int var52 = var45.getIsotopicMass();
    int var53 = var45.getCharge();
    net.sf.jniinchi.JniInchiAtom var58 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var59 = var58.getCharge();
    var58.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var63 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var64 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var34, var40, var45, var58, var63);
    net.sf.jniinchi.INCHI_PARITY var66 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var64.setDisconnectedParity(var66);
    net.sf.jniinchi.INCHI_PARITY var68 = var64.getParity();
    net.sf.jniinchi.INCHI_PARITY var69 = var64.getDisconnectedParity();
    java.lang.String var70 = var64.getDebugString();
    net.sf.jniinchi.JniInchiStereo0D var71 = var26.addStereo0D(var64);
    net.sf.jniinchi.JniInchiAtom[] var72 = var64.getNeighbors();
    net.sf.jniinchi.INCHI_PARITY var73 = var64.getDisconnectedParity();
    net.sf.jniinchi.JniInchiStereo0D var74 = var13.addStereo0D(var64);
    java.lang.String var75 = var64.getDebugString();
    java.lang.String var76 = var64.getDebugString();
    var64.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var70.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var75.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var76.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:100 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var1.debug();
    int var3 = var1.getCharge();
    java.lang.String var4 = var1.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var4.equals("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


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
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var48 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var49 = var48.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var51 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var52 = new net.sf.jniinchi.JniInchiBond(var18, var46, var48, var51);
    net.sf.jniinchi.JniInchiAtom var53 = var52.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var54 = var52.getOriginAtom();
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var11 = var7.getBond((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.toString();
    net.sf.jniinchi.LoadNativeLibraryException var5 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var6 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitH();
    var4.setImplicitProtium(10);
    double var15 = var4.getZ();
    var4.setCharge(10001);
    
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

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var3 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("DOUBLEBOND");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(1, "InChI_Output: EOF/hi!///", "InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", 10L, 100L, 100L, (-1L));
    long[][] var8 = var7.getWarningFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


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
    java.lang.Class var52 = var46.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var54 = java.lang.Enum.<java.lang.Enum>valueOf(var52, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var52);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    var4.setCharge(10001);
    java.lang.String var7 = var4.getElementType();
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    var12.setImplicitTritium(10);
    double var16 = var12.getX();
    var12.setCharge(1);
    var12.setImplicitDeuterium(100);
    int var21 = var12.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    double var30 = var26.getX();
    var26.setCharge(1);
    var26.setImplicitDeuterium(100);
    int var35 = var26.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var37 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var38 = var37.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var46 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var47 = var46.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var48 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var46);
    net.sf.jniinchi.JniInchiAtom[] var49 = new net.sf.jniinchi.JniInchiAtom[] { };
    var48.addAtoms(var49);
    boolean var51 = var37.equals((java.lang.Object)var49);
    net.sf.jniinchi.JniInchiBond var52 = new net.sf.jniinchi.JniInchiBond(var12, var26, var37);
    java.lang.String var53 = var52.getDebugString();
    net.sf.jniinchi.JniInchiAtom var58 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var59 = var58.getCharge();
    var58.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var66 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var67 = var66.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var69 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var70 = var69.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var72 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var73 = new net.sf.jniinchi.JniInchiBond(var58, var66, var69, var72);
    net.sf.jniinchi.INCHI_BOND_STEREO var74 = var73.getBondStereo();
    var52.setStereoDefinition(var74);
    net.sf.jniinchi.JniInchiAtom var76 = var52.getOriginAtom();
    var76.setCharge(100);
    var76.setIsotopicMass(1);
    net.sf.jniinchi.INCHI_BOND_TYPE var82 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var83 = var82.getIndx();
    net.sf.jniinchi.JniInchiBond var84 = new net.sf.jniinchi.JniInchiBond(var4, var76, var82);
    int var85 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var53.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(3);
    int var2 = var1.getIndx();
    net.sf.jniinchi.JniInchiOutputStructure var3 = new net.sf.jniinchi.JniInchiOutputStructure(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var5 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var3, "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 3);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


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
    java.lang.String var67 = var62.getDebugString();
    
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
    assertTrue("'" + var67 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var67.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


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
    int var76 = var28.getNumBonds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var78 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var28, "net.sf.jniinchi.LoadNativeLibraryException");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var47 = var7.getBond(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", (-1L), 10L, 10L, 0L);
    net.sf.jniinchi.INCHI_RET var8 = var7.getReturnStatus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var10 = var7.getBond(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var8 = new net.sf.jniinchi.JniInchiOutputKey(var6, "OK");
    int var9 = var6.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


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
      net.sf.jniinchi.JniInchiInput var26 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
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

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("DOUBLEBOND");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    java.lang.String var9 = var4.getElementType();
    var4.setCharge(10);
    var4.setImplicitDeuterium(0);
    var4.setImplicitProtium(1);
    int var16 = var4.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    java.lang.String var12 = var9.getOptions();
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var21 = var20.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var22 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var23 = var22.getOptions();
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var22);
    net.sf.jniinchi.JniInchiOutputStructure var32 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var33 = var32.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var34 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var32);
    long[][] var35 = var32.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var52 = var51.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var40, var48, var51, var54);
    net.sf.jniinchi.JniInchiBond var56 = var32.addBond(var55);
    net.sf.jniinchi.JniInchiBond[] var57 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var22.addBonds(var57);
    var9.addBonds(var57);
    java.lang.String var60 = var9.getOptions();
    java.lang.String var61 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var62 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


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
    int var25 = var9.getNumStereo0D();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var27 = var9.getBond(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    int var2 = var0.getNumAtoms();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var3 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    int var2 = var0.getNumBonds();
    int var3 = var0.getNumAtoms();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var4 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var10 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var11 = var10.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiAtom[] var13 = new net.sf.jniinchi.JniInchiAtom[] { };
    var12.addAtoms(var13);
    boolean var15 = var1.equals((java.lang.Object)var13);
    int var16 = var1.getIndx();
    
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

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(3);
    net.sf.jniinchi.JniInchiOutput var6 = new net.sf.jniinchi.JniInchiOutput(var1, "InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///", "InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///", "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    java.lang.String var7 = var6.getAuxInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///"+ "'", var7.equals("InChI_Output: EOF/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: EOF/hi!///"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


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
    int var23 = var12.getImplicitH();
    
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
    assertTrue(var23 == (-1));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


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
    var68.setCharge(100);
    net.sf.jniinchi.JniInchiAtom var75 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var76 = var75.getCharge();
    var75.setImplicitTritium(10);
    double var79 = var75.getX();
    var75.setCharge(1);
    double var82 = var75.getZ();
    var75.setIsotopicMassShift(100);
    java.lang.String var85 = var75.getElementType();
    net.sf.jniinchi.INCHI_BOND_TYPE var87 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var88 = var87.getDeclaringClass();
    java.lang.String var89 = var87.name();
    net.sf.jniinchi.JniInchiBond var90 = new net.sf.jniinchi.JniInchiBond(var68, var75, var87);
    net.sf.jniinchi.INCHI_RADICAL var91 = var68.getRadical();
    
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
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "hi!"+ "'", var85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "NONE"+ "'", var89.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(9999);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


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
    java.lang.String var32 = var7.getLog();
    int var33 = var7.getNumBonds();
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var39 = var38.getCharge();
    var38.setImplicitTritium(10);
    double var42 = var38.getX();
    var38.setCharge(1);
    int var45 = var38.getIsotopicMass();
    int var46 = var38.getImplicitH();
    var38.setImplicitProtium(10);
    double var49 = var38.getZ();
    net.sf.jniinchi.JniInchiAtom var50 = var7.addAtom(var38);
    int var51 = var50.getImplicitTritium();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 10);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:100 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var5 = var4.getImplicitTritium();
    var4.setImplicitProtium((-1));
    java.lang.String var8 = var4.getDebugString();
    int var9 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE"+ "'", var8.equals("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:-1 D:0 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var15 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var16 = var15.getCharge();
    var15.setImplicitTritium(10);
    double var19 = var15.getX();
    var15.setCharge(1);
    var15.setImplicitDeuterium(100);
    int var24 = var15.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    var29.setImplicitTritium(10);
    double var33 = var29.getX();
    var29.setCharge(1);
    var29.setImplicitDeuterium(100);
    int var38 = var29.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var40 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var41 = var40.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var49 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var50 = var49.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var51 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var49);
    net.sf.jniinchi.JniInchiAtom[] var52 = new net.sf.jniinchi.JniInchiAtom[] { };
    var51.addAtoms(var52);
    boolean var54 = var40.equals((java.lang.Object)var52);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var15, var29, var40);
    java.lang.String var56 = var55.getDebugString();
    net.sf.jniinchi.INCHI_BOND_STEREO var57 = var55.getBondStereo();
    net.sf.jniinchi.JniInchiBond var58 = var7.addBond(var55);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var60 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var56.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


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
    java.lang.Class var52 = var46.getDeclaringClass();
    java.lang.Class var53 = var46.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var55 = java.lang.Enum.<java.lang.Enum>valueOf(var53, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


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
    net.sf.jniinchi.INCHI_RET var46 = var7.getReturnStatus();
    
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
    assertNull(var46);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(1, "InChI_Output: EOF/hi!///");

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputStructure var12 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var13 = var12.getNumAtoms();
    int var14 = var12.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var17 = var16.getImplicitProtium();
    var16.debug();
    net.sf.jniinchi.JniInchiAtom var19 = var12.addAtom(var16);
    net.sf.jniinchi.INCHI_BOND_TYPE var21 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var22 = var21.getIndx();
    int var23 = var21.ordinal();
    java.lang.Class var24 = var21.getDeclaringClass();
    java.lang.Class var25 = var21.getDeclaringClass();
    java.lang.String var26 = var21.toString();
    int var27 = var21.ordinal();
    net.sf.jniinchi.JniInchiBond var28 = new net.sf.jniinchi.JniInchiBond(var4, var19, var21);
    var19.setImplicitH((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "NONE"+ "'", var26.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var2 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    var1.setCharge(0);
    net.sf.jniinchi.JniInchiOutputStructure var11 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
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
    net.sf.jniinchi.JniInchiBond var58 = var11.addBond(var57);
    var57.debug();
    net.sf.jniinchi.JniInchiAtom var60 = var57.getOriginAtom();
    net.sf.jniinchi.INCHI_BOND_TYPE var62 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var63 = var62.ordinal();
    java.lang.String var64 = var62.name();
    net.sf.jniinchi.JniInchiBond var65 = new net.sf.jniinchi.JniInchiBond(var1, var60, var62);
    var1.setImplicitDeuterium(3);
    var1.setImplicitProtium(9999);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "NONE"+ "'", var64.equals("NONE"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var6, "NONE", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutput var18 = new net.sf.jniinchi.JniInchiOutput(var6, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    net.sf.jniinchi.INCHI_RET var19 = var18.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var24 = new net.sf.jniinchi.JniInchiOutput(var19, "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


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
    var25.setIsotopicMass(3);
    
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

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var1.setImplicitDeuterium(100);
    java.lang.String var4 = var1.getElementType();
    double var5 = var1.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NONE"+ "'", var4.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("hi!", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    net.sf.jniinchi.LoadNativeLibraryException var0 = new net.sf.jniinchi.LoadNativeLibraryException();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    java.lang.Throwable[] var3 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var1.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var2.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI_Output: WARNING///hi!/hi!", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var9 = var8.getNumBonds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var10 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var8);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiOutputStructure var25 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var26 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var25);
    java.lang.String var27 = var26.getOptions();
    net.sf.jniinchi.JniInchiInputData var30 = new net.sf.jniinchi.JniInchiInputData(0, var26, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var31 = var30.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var32 = var30.getInput();
    net.sf.jniinchi.JniInchiAtom var37 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    net.sf.jniinchi.JniInchiAtom var38 = var32.addAtom(var37);
    net.sf.jniinchi.INCHI_BOND_TYPE var40 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var41 = var40.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var49 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var50 = var49.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var51 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var49);
    net.sf.jniinchi.JniInchiAtom[] var52 = new net.sf.jniinchi.JniInchiAtom[] { };
    var51.addAtoms(var52);
    boolean var54 = var40.equals((java.lang.Object)var52);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var13, var38, var40);
    net.sf.jniinchi.JniInchiAtom var56 = var7.addAtom(var38);
    var38.setIsotopicMassShift(100);
    java.lang.String var59 = var38.getElementType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var31.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    var4.setImplicitDeuterium(10);
    int var14 = var4.getCharge();
    double var15 = var4.getY();
    double var16 = var4.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(10, "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 100L, 1L, (-1L), 100L);
    long[][] var8 = var7.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var10 = var7.getAtom(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.INCHI_RET var14 = var13.getReturnValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    java.lang.String var8 = var6.name();
    net.sf.jniinchi.JniInchiOutputKey var10 = new net.sf.jniinchi.JniInchiOutputKey(var6, "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "OK"+ "'", var8.equals("OK"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var17 = var7.addAtom(var13);
    int var18 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var26 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var27 = var26.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var28 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var26);
    java.lang.String var29 = var26.getLog();
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var34.setImplicitProtium(1);
    int var37 = var34.getImplicitDeuterium();
    int var38 = var34.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var46 = var45.getCharge();
    var45.setImplicitTritium(10);
    double var49 = var45.getX();
    var45.setCharge(1);
    int var52 = var45.getIsotopicMass();
    int var53 = var45.getCharge();
    net.sf.jniinchi.JniInchiAtom var58 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var59 = var58.getCharge();
    var58.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var63 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var64 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var34, var40, var45, var58, var63);
    net.sf.jniinchi.JniInchiStereo0D var65 = var26.addStereo0D(var64);
    net.sf.jniinchi.JniInchiStereo0D var66 = var7.addStereo0D(var64);
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    java.lang.String var72 = var71.getElementType();
    net.sf.jniinchi.JniInchiAtom var73 = var7.addAtom(var71);
    java.lang.String var74 = var7.getLog();
    java.lang.String var75 = var7.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var77 = var7.getAtom(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var72.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "hi!"+ "'", var74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "hi!"+ "'", var75.equals("hi!"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue((-1));
    net.sf.jniinchi.JniInchiOutput var6 = new net.sf.jniinchi.JniInchiOutput(var1, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "hi!", "");
    int var7 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


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
    net.sf.jniinchi.INCHI_PARITY var38 = var34.getParity();
    net.sf.jniinchi.JniInchiAtom[] var39 = var34.getNeighbors();
    net.sf.jniinchi.JniInchiAtom var40 = var34.getCentralAtom();
    net.sf.jniinchi.INCHI_PARITY var41 = var34.getParity();
    net.sf.jniinchi.INCHI_STEREOTYPE var42 = var34.getStereoType();
    net.sf.jniinchi.JniInchiAtom var43 = var34.getCentralAtom();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var45 = var34.getNeighbor(10100);
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


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
    int var63 = var60.getIndx();
    
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
    assertTrue(var63 == 3);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


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
    var4.debug();
    int var47 = var4.getImplicitH();
    var4.setCharge(2);
    
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
    assertTrue(var47 == (-1));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("EOF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    net.sf.jniinchi.JniInchiOutputStructure var40 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var41 = var40.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var40);
    net.sf.jniinchi.JniInchiAtom[] var43 = new net.sf.jniinchi.JniInchiAtom[] { };
    var42.addAtoms(var43);
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    var42.addAtoms(var55);
    var7.addAtoms(var55);
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
    net.sf.jniinchi.INCHI_STEREOTYPE var94 = var93.getStereoType();
    net.sf.jniinchi.JniInchiStereo0D var95 = var7.addStereo0D(var93);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var97 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "OKAY");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
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
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiBond[] var12 = new net.sf.jniinchi.JniInchiBond[] { };
    var11.addBonds(var12);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var25 = var11.addAtom(var18);
    net.sf.jniinchi.JniInchiInputData var28 = new net.sf.jniinchi.JniInchiInputData(1, var11, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var29 = var28.getInput();
    net.sf.jniinchi.JniInchiOutputStructure var37 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var38 = var37.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var39 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var37);
    java.lang.String var40 = var39.getOptions();
    net.sf.jniinchi.JniInchiInput var41 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var39);
    net.sf.jniinchi.JniInchiOutputStructure var49 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var50 = var49.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var51 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var49);
    long[][] var52 = var49.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var57 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var58 = var57.getCharge();
    var57.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var65 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var66 = var65.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var68 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var69 = var68.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var71 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var72 = new net.sf.jniinchi.JniInchiBond(var57, var65, var68, var71);
    net.sf.jniinchi.JniInchiBond var73 = var49.addBond(var72);
    net.sf.jniinchi.JniInchiBond[] var74 = new net.sf.jniinchi.JniInchiBond[] { var73};
    var39.addBonds(var74);
    var29.addBonds(var74);
    net.sf.jniinchi.JniInchiInput var77 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var29);
    net.sf.jniinchi.JniInchiInputData var80 = new net.sf.jniinchi.JniInchiInputData(10, var77, 9999, "VALID_STANDARD");
    int var81 = var77.getNumAtoms();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


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
    long[][] var46 = var7.getWarningFlags();
    
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
    assertNotNull(var46);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.LoadNativeLibraryException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    java.lang.String var9 = var4.getElementType();
    var4.setCharge(10);
    var4.setImplicitDeuterium(0);
    double var14 = var4.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


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
    java.lang.Class var52 = var46.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var54 = java.lang.Enum.<java.lang.Enum>valueOf(var52, "ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var52);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.getAuxInfo();
    java.lang.String var7 = var5.toString();
    net.sf.jniinchi.INCHI_RET var8 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(var8);
    net.sf.jniinchi.JniInchiOutputStructure var10 = new net.sf.jniinchi.JniInchiOutputStructure(var8);
    long[][] var11 = var10.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var13 = var10.getStereo0D(9999);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


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
    java.lang.String var53 = var48.getDebugString();
    net.sf.jniinchi.INCHI_BOND_STEREO var55 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    var48.setStereoDefinition(var55);
    var48.debug();
    net.sf.jniinchi.JniInchiAtom var58 = var48.getTargetAtom();
    var58.setCharge(10);
    
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
    assertTrue("'" + var53 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var53.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var6, "NONE", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    java.lang.String var14 = var6.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "EOF"+ "'", var14.equals("EOF"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var14 = var13.getCharge();
    var13.setImplicitTritium(10);
    double var17 = var13.getX();
    var13.setCharge(1);
    var13.setImplicitDeuterium(100);
    int var22 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    var27.setImplicitDeuterium(100);
    int var36 = var27.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var38 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var39 = var38.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var47 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var48 = var47.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var49 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var47);
    net.sf.jniinchi.JniInchiAtom[] var50 = new net.sf.jniinchi.JniInchiAtom[] { };
    var49.addAtoms(var50);
    boolean var52 = var38.equals((java.lang.Object)var50);
    net.sf.jniinchi.JniInchiBond var53 = new net.sf.jniinchi.JniInchiBond(var13, var27, var38);
    net.sf.jniinchi.JniInchiBond var54 = var7.addBond(var53);
    java.lang.String var55 = var54.getDebugString();
    java.lang.String var56 = var54.getDebugString();
    net.sf.jniinchi.INCHI_BOND_TYPE var57 = var54.getBondType();
    boolean var59 = var57.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var55.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var56.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


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
    net.sf.jniinchi.JniInchiAtom var53 = var48.getNeighbor(1);
    int var54 = var53.getImplicitTritium();
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var70 = var69.getStereoType();
    net.sf.jniinchi.INCHI_STEREOTYPE var71 = var69.getStereoType();
    int var72 = var71.getIndx();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    var4.setImplicitProtium(0);
    var4.setIsotopicMassShift(0);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var16.setImplicitProtium(1);
    double var19 = var16.getY();
    net.sf.jniinchi.INCHI_RADICAL var20 = var16.getRadical();
    var4.setRadical(var20);
    int var22 = var20.getIndx();
    net.sf.jniinchi.INCHI_STATUS var24 = net.sf.jniinchi.INCHI_STATUS.getValue(1);
    int var25 = var24.getIndx();
    int var26 = var24.getIndx();
    int var27 = var24.getIndx();
    boolean var28 = var20.equals((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var10 = var9.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiBond[] var12 = new net.sf.jniinchi.JniInchiBond[] { };
    var11.addBonds(var12);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    var18.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var25 = var11.addAtom(var18);
    net.sf.jniinchi.JniInchiInputData var28 = new net.sf.jniinchi.JniInchiInputData(0, var11, 1, "InChI_Output: WARNING/SINGLE_2UP/OK/InChI_Output: WARNING///hi!/hi!/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInputData var31 = new net.sf.jniinchi.JniInchiInputData(4, var11, 4, "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    net.sf.jniinchi.INCHI_RET var32 = var31.getReturnValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI_Output: EOF/hi!///");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    net.sf.jniinchi.JniInchiException var8 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var4);
    java.lang.Throwable[] var9 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


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
    net.sf.jniinchi.JniInchiAtom var63 = var58.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var64 = var58.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var65 = var58.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var66 = var58.getOriginAtom();
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 0.0d, 100.0d, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


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
    net.sf.jniinchi.INCHI_RET var64 = var7.getReturnStatus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var66 = var7.getAtom(3);
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
    assertNull(var64);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var9 = var8.getNumBonds();
    net.sf.jniinchi.JniInchiOutputStructure var17 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var18 = var17.getNumAtoms();
    var8.setStructure((net.sf.jniinchi.JniInchiStructure)var17);
    int var20 = var8.getNumBonds();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput();
    int var22 = var21.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var30 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var31 = var30.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var32 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var30);
    java.lang.String var33 = var30.getLog();
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var38.setImplicitProtium(1);
    int var41 = var38.getImplicitDeuterium();
    int var42 = var38.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var44 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var49 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var50 = var49.getCharge();
    var49.setImplicitTritium(10);
    double var53 = var49.getX();
    var49.setCharge(1);
    int var56 = var49.getIsotopicMass();
    int var57 = var49.getCharge();
    net.sf.jniinchi.JniInchiAtom var62 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var63 = var62.getCharge();
    var62.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var67 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var68 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var38, var44, var49, var62, var67);
    net.sf.jniinchi.JniInchiStereo0D var69 = var30.addStereo0D(var68);
    net.sf.jniinchi.JniInchiStereo0D var70 = var21.addStereo0D(var69);
    net.sf.jniinchi.INCHI_STEREOTYPE var71 = var70.getStereoType();
    net.sf.jniinchi.INCHI_PARITY var72 = var70.getParity();
    net.sf.jniinchi.JniInchiAtom[] var73 = var70.getNeighbors();
    var8.addAtoms(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var53 = var48.getStereoType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var55 = var48.getNeighbor(9999);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(0, "NONE");
    net.sf.jniinchi.INCHI_KEY var3 = var2.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var3, "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    java.lang.String var7 = var5.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var7.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


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
    int var47 = var4.getImplicitDeuterium();
    int var48 = var4.getImplicitProtium();
    
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
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


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
    int var26 = var4.getCharge();
    var4.setImplicitTritium(10100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    long[][] var9 = var7.getWarningFlags();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


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
    net.sf.jniinchi.JniInchiOutputStructure var31 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var32 = var31.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var33 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var31);
    net.sf.jniinchi.JniInchiAtom[] var34 = new net.sf.jniinchi.JniInchiAtom[] { };
    var33.addAtoms(var34);
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var33);
    int var37 = var33.getNumBonds();
    int var38 = var33.getNumStereo0D();
    
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
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


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
    net.sf.jniinchi.INCHI_PARITY var96 = var95.getDisconnectedParity();
    
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
    assertNotNull(var96);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("VALID_STANDARD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 1.0d, 10.0d, "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    net.sf.jniinchi.INCHI_RADICAL var2 = var1.getRadical();
    int var3 = var1.getImplicitProtium();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    int var10 = var7.getNumStereo0D();
    java.lang.String var11 = var7.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var13 = var7.getBond((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    long[][] var22 = var19.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var38 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var39 = var38.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var41 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var42 = new net.sf.jniinchi.JniInchiBond(var27, var35, var38, var41);
    net.sf.jniinchi.JniInchiBond var43 = var19.addBond(var42);
    net.sf.jniinchi.JniInchiBond var44 = var9.addBond(var42);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var45 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
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
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("net.sf.jniinchi.LoadNativeLibraryException");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    int var9 = var4.getImplicitH();
    java.lang.String var10 = var4.getElementType();
    int var11 = var4.getImplicitProtium();
    var4.setIsotopicMass((-1));
    var4.setImplicitDeuterium(3);
    var4.setIsotopicMass((-1));
    
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

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    var0.setStructure((net.sf.jniinchi.JniInchiStructure)var8);
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
    net.sf.jniinchi.JniInchiAtom var80 = var56.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var81 = var8.addBond(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var83 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    net.sf.jniinchi.INCHI_RADICAL var8 = var4.getRadical();
    var4.setIsotopicMass(10);
    var4.setIsotopicMass(4);
    int var13 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "EOF", "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", 10L, (-1L), 100L, 1L);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.INCHI_RADICAL var2 = var1.getRadical();
    var1.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var47 = var46.getStereoType();
    boolean var49 = var47.equals((java.lang.Object)"InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
    
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
    assertTrue(var49 == false);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var3 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var1);
    java.lang.Throwable[] var4 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, (-1.0d), 1.0d, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
    int var5 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE [1.0,-1.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


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
    java.lang.String var50 = var45.getDebugString();
    net.sf.jniinchi.JniInchiAtom[] var51 = var45.getNeighbors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var53 = var45.getNeighbor(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var50.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    var12.setImplicitDeuterium(1);
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitTritium(10);
    var19.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var25 = var19.getRadical();
    var19.setIsotopicMassShift(1);
    int var28 = var19.getImplicitProtium();
    var19.setIsotopicMassShift(1);
    java.lang.String var31 = var19.getElementType();
    net.sf.jniinchi.JniInchiOutputStructure var39 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var40 = var39.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var41 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var39);
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var55 = var54.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var57 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var58 = var57.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var60 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var61 = new net.sf.jniinchi.JniInchiBond(var46, var54, var57, var60);
    net.sf.jniinchi.INCHI_BOND_STEREO var62 = var61.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var63 = var61.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var64 = var39.addBond(var61);
    net.sf.jniinchi.INCHI_BOND_TYPE var65 = var64.getBondType();
    net.sf.jniinchi.JniInchiBond var66 = new net.sf.jniinchi.JniInchiBond(var12, var19, var65);
    net.sf.jniinchi.JniInchiAtom var67 = var66.getOriginAtom();
    net.sf.jniinchi.JniInchiBond var68 = var7.addBond(var66);
    net.sf.jniinchi.JniInchiAtom var69 = var66.getOriginAtom();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


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
    net.sf.jniinchi.INCHI_PARITY var98 = var95.getParity();
    net.sf.jniinchi.INCHI_STEREOTYPE var99 = var95.getStereoType();
    
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
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: EOF/net.sf.jniinchi.LoadNativeLibraryException: /InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.ordinal();
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
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    int var10 = var4.getIsotopicMass();
    net.sf.jniinchi.INCHI_KEY var12 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var14 = new net.sf.jniinchi.JniInchiOutputKey(var12, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitTritium(10);
    double var23 = var19.getX();
    var19.setCharge(1);
    var19.setImplicitDeuterium(100);
    int var28 = var19.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var33 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var34 = var33.getCharge();
    var33.setImplicitTritium(10);
    double var37 = var33.getX();
    var33.setCharge(1);
    var33.setImplicitDeuterium(100);
    int var42 = var33.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var44 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var45 = var44.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var53 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var54 = var53.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var55 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var53);
    net.sf.jniinchi.JniInchiAtom[] var56 = new net.sf.jniinchi.JniInchiAtom[] { };
    var55.addAtoms(var56);
    boolean var58 = var44.equals((java.lang.Object)var56);
    net.sf.jniinchi.JniInchiBond var59 = new net.sf.jniinchi.JniInchiBond(var19, var33, var44);
    java.lang.String var60 = var59.getDebugString();
    boolean var61 = var12.equals((java.lang.Object)var59);
    net.sf.jniinchi.INCHI_BOND_TYPE var62 = var59.getBondType();
    net.sf.jniinchi.JniInchiAtom var63 = var59.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var64 = var59.getOriginAtom();
    var64.setImplicitH(0);
    net.sf.jniinchi.JniInchiAtom var68 = new net.sf.jniinchi.JniInchiAtom("NONE");
    var68.debug();
    net.sf.jniinchi.JniInchiAtom var74 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 1.0d, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    net.sf.jniinchi.INCHI_PARITY var76 = net.sf.jniinchi.INCHI_PARITY.valueOf("ODD");
    net.sf.jniinchi.JniInchiStereo0D var77 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var64, var68, var74, var76);
    var68.setImplicitH(10001);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var60.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.LoadNativeLibraryException var2 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    int var2 = var1.ordinal();
    java.lang.String var3 = var1.name();
    java.lang.Class var4 = var1.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var6 = java.lang.Enum.<java.lang.Enum>valueOf(var4, "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
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

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    int var9 = var4.getImplicitH();
    double var10 = var4.getY();
    int var11 = var4.getCharge();
    int var12 = var4.getImplicitH();
    
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
    assertTrue(var12 == (-1));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var2 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var1);
    java.lang.String var3 = var2.toString();
    net.sf.jniinchi.LoadNativeLibraryException var4 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var2);
    java.lang.Throwable[] var5 = var2.getSuppressed();
    net.sf.jniinchi.JniInchiException var7 = new net.sf.jniinchi.JniInchiException("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    var2.addSuppressed((java.lang.Throwable)var7);
    net.sf.jniinchi.LoadNativeLibraryException var9 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var3.equals("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.INCHI_KEY var9 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var11 = new net.sf.jniinchi.JniInchiOutputKey(var9, "InChI_Output: WARNING///hi!/hi!");
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
    boolean var58 = var9.equals((java.lang.Object)var56);
    net.sf.jniinchi.INCHI_BOND_TYPE var59 = var56.getBondType();
    net.sf.jniinchi.JniInchiAtom var60 = var56.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var61 = var56.getOriginAtom();
    net.sf.jniinchi.INCHI_RADICAL var62 = var61.getRadical();
    net.sf.jniinchi.JniInchiAtom var63 = var7.addAtom(var61);
    net.sf.jniinchi.JniInchiOutputStructure var71 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var72 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var71);
    net.sf.jniinchi.JniInchiAtom var77 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var77.setIsotopicMassShift(1);
    int var80 = var77.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var81 = var71.addAtom(var77);
    double var82 = var77.getZ();
    net.sf.jniinchi.INCHI_RADICAL var84 = net.sf.jniinchi.INCHI_RADICAL.getValue(1);
    int var85 = var84.getIndx();
    var77.setRadical(var84);
    net.sf.jniinchi.JniInchiAtom var87 = var7.addAtom(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
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
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    double var11 = var4.getZ();
    var4.setImplicitDeuterium(100);
    net.sf.jniinchi.INCHI_RADICAL var14 = var4.getRadical();
    int var15 = var14.getIndx();
    java.lang.String var16 = var14.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NONE"+ "'", var16.equals("NONE"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


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
    net.sf.jniinchi.INCHI_RET var30 = var27.getReturnValue();
    int var31 = var30.getIndx();
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    net.sf.jniinchi.INCHI_RADICAL var2 = var1.getRadical();
    int var3 = var2.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    net.sf.jniinchi.INCHI_RADICAL var8 = var4.getRadical();
    var4.setIsotopicMass(10);
    double var11 = var4.getZ();
    int var12 = var4.getImplicitTritium();
    var4.setImplicitH(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var15 = var13.getInput();
    net.sf.jniinchi.INCHI_RET var16 = var13.getReturnValue();
    net.sf.jniinchi.JniInchiInput var17 = var13.getInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var18 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var17);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    var1.setCharge(0);
    net.sf.jniinchi.JniInchiOutputStructure var11 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
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
    net.sf.jniinchi.JniInchiBond var58 = var11.addBond(var57);
    var57.debug();
    net.sf.jniinchi.JniInchiAtom var60 = var57.getOriginAtom();
    net.sf.jniinchi.INCHI_BOND_TYPE var62 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var63 = var62.ordinal();
    java.lang.String var64 = var62.name();
    net.sf.jniinchi.JniInchiBond var65 = new net.sf.jniinchi.JniInchiBond(var1, var60, var62);
    var1.setIsotopicMass(10100);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "NONE"+ "'", var64.equals("NONE"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


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
    net.sf.jniinchi.INCHI_BOND_TYPE var45 = var44.getBondType();
    int var46 = var45.ordinal();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue(0);
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    int var4 = var1.getIndx();
    int var5 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("OKAY");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var30 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var28, "ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
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

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 1.0d, 0.0d, "InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
    var4.debug();

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    java.lang.String var12 = var9.getOptions();
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var21 = var20.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var22 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var23 = var22.getOptions();
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var22);
    net.sf.jniinchi.JniInchiOutputStructure var32 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var33 = var32.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var34 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var32);
    long[][] var35 = var32.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var52 = var51.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var40, var48, var51, var54);
    net.sf.jniinchi.JniInchiBond var56 = var32.addBond(var55);
    net.sf.jniinchi.JniInchiBond[] var57 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var22.addBonds(var57);
    var9.addBonds(var57);
    java.lang.String var60 = var9.getOptions();
    net.sf.jniinchi.JniInchiAtom var65 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var65.setImplicitProtium(1);
    int var68 = var65.getImplicitDeuterium();
    int var69 = var65.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var71 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var76 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var77 = var76.getCharge();
    var76.setImplicitTritium(10);
    double var80 = var76.getX();
    var76.setCharge(1);
    int var83 = var76.getIsotopicMass();
    int var84 = var76.getCharge();
    net.sf.jniinchi.JniInchiAtom var89 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var90 = var89.getCharge();
    var89.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var94 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var95 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var65, var71, var76, var89, var94);
    net.sf.jniinchi.JniInchiAtom[] var96 = var95.getNeighbors();
    java.lang.String var97 = var95.getDebugString();
    net.sf.jniinchi.JniInchiStereo0D var98 = var9.addStereo0D(var95);
    net.sf.jniinchi.INCHI_STEREOTYPE var99 = var95.getStereoType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var97 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var97.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


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
    var45.setImplicitProtium(0);
    java.lang.String var48 = var45.getElementType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
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

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("net.sf.jniinchi.LoadNativeLibraryException");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


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
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var48 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var49 = var48.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var51 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var52 = new net.sf.jniinchi.JniInchiBond(var18, var46, var48, var51);
    net.sf.jniinchi.JniInchiAtom var53 = var52.getOriginAtom();
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutputStructure var18 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var18);
    int var20 = var19.getNumBonds();
    java.lang.String var21 = var19.getOptions();
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
    net.sf.jniinchi.JniInchiBond var68 = var19.addBond(var66);
    net.sf.jniinchi.JniInchiBond var69 = var9.addBond(var66);
    int var70 = var9.getNumStereo0D();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:100 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(2, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", 10L, 10L, (-1L), (-1L));
    net.sf.jniinchi.JniInchiOutputStructure var15 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var16 = var15.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var15);
    java.lang.String var18 = var15.getLog();
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var23.setImplicitProtium(1);
    int var26 = var23.getImplicitDeuterium();
    int var27 = var23.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var35 = var34.getCharge();
    var34.setImplicitTritium(10);
    double var38 = var34.getX();
    var34.setCharge(1);
    int var41 = var34.getIsotopicMass();
    int var42 = var34.getCharge();
    net.sf.jniinchi.JniInchiAtom var47 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var48 = var47.getCharge();
    var47.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var52 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var53 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var23, var29, var34, var47, var52);
    net.sf.jniinchi.JniInchiStereo0D var54 = var15.addStereo0D(var53);
    net.sf.jniinchi.JniInchiAtom var59 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var60 = var59.getCharge();
    var59.setImplicitTritium(10);
    var59.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var65 = var59.getRadical();
    var59.setIsotopicMassShift(1);
    int var68 = var59.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var69 = var15.addAtom(var59);
    var59.setIsotopicMass(10);
    var59.setIsotopicMassShift(10001);
    net.sf.jniinchi.JniInchiAtom var74 = var7.addAtom(var59);
    var59.debug();
    double var76 = var59.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 10.0d);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var15 = var13.getInput();
    net.sf.jniinchi.INCHI_RET var16 = var13.getReturnValue();
    int var17 = var16.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    net.sf.jniinchi.INCHI_RADICAL var8 = var4.getRadical();
    int var9 = var4.getIsotopicMass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    java.lang.String var11 = var7.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("net.sf.jniinchi.LoadNativeLibraryException");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    var1.setCharge(0);
    var1.setIsotopicMassShift(0);
    java.lang.String var6 = var1.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:10000 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var6.equals("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:10000 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("OK", "");
    java.lang.String var3 = var2.getInchi();
    java.lang.String var4 = var2.getInchi();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputStructure var5 = net.sf.jniinchi.JniInchiWrapper.getStructureFromInchi(var2);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "OK"+ "'", var3.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


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
    net.sf.jniinchi.JniInchiInput var87 = var85.getInput();
    net.sf.jniinchi.JniInchiInput var88 = var85.getInput();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var11.setCharge(0);
    var11.setImplicitProtium(100);
    net.sf.jniinchi.INCHI_BOND_TYPE var17 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var18 = var17.ordinal();
    java.lang.String var19 = var17.name();
    net.sf.jniinchi.JniInchiBond var20 = new net.sf.jniinchi.JniInchiBond(var4, var11, var17);
    net.sf.jniinchi.INCHI_KEY var22 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var24 = new net.sf.jniinchi.JniInchiOutputKey(var22, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    var29.setImplicitTritium(10);
    double var33 = var29.getX();
    var29.setCharge(1);
    var29.setImplicitDeuterium(100);
    int var38 = var29.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var43 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var44 = var43.getCharge();
    var43.setImplicitTritium(10);
    double var47 = var43.getX();
    var43.setCharge(1);
    var43.setImplicitDeuterium(100);
    int var52 = var43.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var54 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var55 = var54.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var63 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var64 = var63.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var65 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var63);
    net.sf.jniinchi.JniInchiAtom[] var66 = new net.sf.jniinchi.JniInchiAtom[] { };
    var65.addAtoms(var66);
    boolean var68 = var54.equals((java.lang.Object)var66);
    net.sf.jniinchi.JniInchiBond var69 = new net.sf.jniinchi.JniInchiBond(var29, var43, var54);
    java.lang.String var70 = var69.getDebugString();
    boolean var71 = var22.equals((java.lang.Object)var69);
    net.sf.jniinchi.INCHI_BOND_TYPE var72 = var69.getBondType();
    net.sf.jniinchi.JniInchiAtom var73 = var69.getTargetAtom();
    net.sf.jniinchi.JniInchiAtom var74 = var69.getOriginAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var75 = var69.getBondStereo();
    var20.setStereoDefinition(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "NONE"+ "'", var19.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var70.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


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
    net.sf.jniinchi.JniInchiAtom var32 = var31.getOriginAtom();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getOptions();
    java.lang.String var4 = var1.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "NONE"+ "'", var2.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "NONE"+ "'", var4.equals("NONE"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var15 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var16 = var15.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var18 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var19 = new net.sf.jniinchi.JniInchiBond(var4, var12, var15, var18);
    int var20 = var12.getIsotopicMass();
    double var21 = var12.getZ();
    
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
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100.0d);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    int var2 = var1.getIndx();
    net.sf.jniinchi.JniInchiOutputKey var4 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    net.sf.jniinchi.JniInchiOutputKey var6 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


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
    var18.setImplicitH(100);
    
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

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "NONE", "SINGLE_1UP", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:100 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "OK", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    java.lang.String var6 = var5.getInchi();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    java.lang.String var8 = var5.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "OK"+ "'", var6.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "OK"+ "'", var8.equals("OK"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 0.0d, 10.0d, "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


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
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    var29.setImplicitTritium(10);
    double var33 = var29.getX();
    var29.setCharge(1);
    int var36 = var29.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    java.lang.String var42 = var41.getElementType();
    net.sf.jniinchi.INCHI_RADICAL var43 = var41.getRadical();
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var48.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var55 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var55.setImplicitProtium(1);
    int var58 = var55.getImplicitDeuterium();
    int var59 = var55.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var61 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var66 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var67 = var66.getCharge();
    var66.setImplicitTritium(10);
    double var70 = var66.getX();
    var66.setCharge(1);
    int var73 = var66.getIsotopicMass();
    int var74 = var66.getCharge();
    net.sf.jniinchi.JniInchiAtom var79 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var80 = var79.getCharge();
    var79.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var84 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var85 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var55, var61, var66, var79, var84);
    net.sf.jniinchi.INCHI_PARITY var87 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var85.setDisconnectedParity(var87);
    net.sf.jniinchi.INCHI_PARITY var89 = var85.getParity();
    java.lang.String var90 = var89.toString();
    net.sf.jniinchi.JniInchiStereo0D var91 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var29, var41, var48, var89);
    var91.debug();
    net.sf.jniinchi.INCHI_STEREOTYPE var93 = var91.getStereoType();
    net.sf.jniinchi.JniInchiAtom[] var94 = var91.getNeighbors();
    
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
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var42.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "ODD"+ "'", var90.equals("ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("net.sf.jniinchi.JniInchiException: OK", true);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


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
    double var46 = var4.getX();
    var4.setImplicitH((-1));
    
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
    assertTrue(var46 == 1.0d);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    var1.setCharge(0);
    var1.setIsotopicMass((-1));
    var1.debug();

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.JniInchiOutputStructure var21 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var22 = var21.getNumAtoms();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var21);
    net.sf.jniinchi.JniInchiOutputStructure var31 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var32 = var31.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var33 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var31);
    java.lang.String var34 = var31.getLog();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var39.setImplicitProtium(1);
    int var42 = var39.getImplicitDeuterium();
    int var43 = var39.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var50 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var51 = var50.getCharge();
    var50.setImplicitTritium(10);
    double var54 = var50.getX();
    var50.setCharge(1);
    int var57 = var50.getIsotopicMass();
    int var58 = var50.getCharge();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var68 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var69 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var39, var45, var50, var63, var68);
    net.sf.jniinchi.JniInchiStereo0D var70 = var31.addStereo0D(var69);
    net.sf.jniinchi.INCHI_PARITY var71 = var69.getDisconnectedParity();
    net.sf.jniinchi.JniInchiStereo0D var72 = var9.addStereo0D(var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var74 = var72.getNeighbor(4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


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
    net.sf.jniinchi.INCHI_PARITY var38 = var34.getParity();
    net.sf.jniinchi.INCHI_PARITY var39 = var34.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var41 = var34.getNeighbor(2);
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var46.setImplicitProtium(1);
    int var49 = var46.getImplicitDeuterium();
    int var50 = var46.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var52 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var57 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var58 = var57.getCharge();
    var57.setImplicitTritium(10);
    double var61 = var57.getX();
    var57.setCharge(1);
    int var64 = var57.getIsotopicMass();
    int var65 = var57.getCharge();
    net.sf.jniinchi.JniInchiAtom var70 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var71 = var70.getCharge();
    var70.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var75 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var76 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var46, var52, var57, var70, var75);
    net.sf.jniinchi.INCHI_PARITY var78 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var76.setDisconnectedParity(var78);
    net.sf.jniinchi.INCHI_PARITY var80 = var76.getParity();
    net.sf.jniinchi.JniInchiAtom[] var81 = var76.getNeighbors();
    net.sf.jniinchi.INCHI_PARITY var82 = var76.getParity();
    net.sf.jniinchi.INCHI_PARITY var83 = var76.getParity();
    var34.setDisconnectedParity(var83);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var47 = var46.getStereoType();
    net.sf.jniinchi.INCHI_STEREOTYPE var48 = var46.getStereoType();
    int var49 = var48.getIndx();
    int var50 = var48.getIndx();
    java.lang.Class var51 = var48.getDeclaringClass();
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    var4.setImplicitProtium(0);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    double var11 = var4.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1.0d);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiStructure var9 = new net.sf.jniinchi.JniInchiStructure();
    net.sf.jniinchi.JniInchiOutputStructure var17 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var18 = var17.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var17);
    net.sf.jniinchi.JniInchiAtom[] var20 = new net.sf.jniinchi.JniInchiAtom[] { };
    var19.addAtoms(var20);
    var9.addAtoms(var20);
    var7.setStructure(var9);
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput(var9);
    int var25 = var9.getNumAtoms();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var27 = var9.getBond(10001);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Stereo0D: - [hi!,hi!,NONE,InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


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
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    var29.setImplicitTritium(10);
    double var33 = var29.getX();
    var29.setCharge(1);
    int var36 = var29.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    java.lang.String var42 = var41.getElementType();
    net.sf.jniinchi.INCHI_RADICAL var43 = var41.getRadical();
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var48.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var55 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var55.setImplicitProtium(1);
    int var58 = var55.getImplicitDeuterium();
    int var59 = var55.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var61 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var66 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var67 = var66.getCharge();
    var66.setImplicitTritium(10);
    double var70 = var66.getX();
    var66.setCharge(1);
    int var73 = var66.getIsotopicMass();
    int var74 = var66.getCharge();
    net.sf.jniinchi.JniInchiAtom var79 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var80 = var79.getCharge();
    var79.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var84 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var85 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var55, var61, var66, var79, var84);
    net.sf.jniinchi.INCHI_PARITY var87 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var85.setDisconnectedParity(var87);
    net.sf.jniinchi.INCHI_PARITY var89 = var85.getParity();
    java.lang.String var90 = var89.toString();
    net.sf.jniinchi.JniInchiStereo0D var91 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var4, var29, var41, var48, var89);
    int var92 = var89.getIndx();
    
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
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var42.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "ODD"+ "'", var90.equals("ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 1);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


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
    double var50 = var49.getY();
    double var51 = var49.getY();
    int var52 = var49.getIsotopicMass();
    
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
    assertTrue(var50 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    long[][] var8 = var7.getWarningFlags();
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput();
    var16.setStructure((net.sf.jniinchi.JniInchiStructure)var18);
    net.sf.jniinchi.JniInchiOutputStructure var27 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var28 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var27);
    int var29 = var28.getNumBonds();
    java.lang.String var30 = var28.getOptions();
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    var35.setImplicitTritium(10);
    double var39 = var35.getX();
    var35.setCharge(1);
    var35.setImplicitDeuterium(100);
    int var44 = var35.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var49 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var50 = var49.getCharge();
    var49.setImplicitTritium(10);
    double var53 = var49.getX();
    var49.setCharge(1);
    var49.setImplicitDeuterium(100);
    int var58 = var49.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var60 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var61 = var60.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var69 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var70 = var69.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var71 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var69);
    net.sf.jniinchi.JniInchiAtom[] var72 = new net.sf.jniinchi.JniInchiAtom[] { };
    var71.addAtoms(var72);
    boolean var74 = var60.equals((java.lang.Object)var72);
    net.sf.jniinchi.JniInchiBond var75 = new net.sf.jniinchi.JniInchiBond(var35, var49, var60);
    java.lang.String var76 = var75.getDebugString();
    net.sf.jniinchi.JniInchiBond var77 = var28.addBond(var75);
    net.sf.jniinchi.JniInchiBond var78 = var18.addBond(var75);
    java.lang.String var79 = var75.getDebugString();
    net.sf.jniinchi.INCHI_BOND_TYPE var80 = var75.getBondType();
    net.sf.jniinchi.JniInchiBond var81 = var7.addBond(var75);
    java.lang.String var82 = var7.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var76.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var79.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


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
    var19.debug();
    
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

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


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
    java.lang.String var69 = var44.getDebugString();
    
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
    assertTrue("'" + var69 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var69.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    java.lang.String var9 = var6.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "EOF"+ "'", var9.equals("EOF"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue((-1));
    net.sf.jniinchi.JniInchiOutputStructure var2 = new net.sf.jniinchi.JniInchiOutputStructure(var1);
    int var3 = var2.getNumAtoms();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    int var2 = var0.getNumBonds();
    int var3 = var0.getNumAtoms();
    int var4 = var0.getNumBonds();
    net.sf.jniinchi.JniInchiAtom var9 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    var9.setIsotopicMassShift(10);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var16.setImplicitH((-1));
    net.sf.jniinchi.JniInchiAtom var23 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var24 = var23.getCharge();
    int var25 = var23.getIsotopicMass();
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom((-1.0d), 1.0d, 0.0d, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var36 = var35.getImplicitDeuterium();
    var35.setImplicitDeuterium(1);
    net.sf.jniinchi.INCHI_STEREOTYPE var40 = net.sf.jniinchi.INCHI_STEREOTYPE.getValue(0);
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var45.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var52 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var52.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var59 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var60 = var59.getCharge();
    var59.setImplicitTritium(10);
    double var63 = var59.getX();
    int var64 = var59.getImplicitH();
    java.lang.String var65 = var59.getElementType();
    int var66 = var59.getImplicitProtium();
    int var67 = var59.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    var72.setImplicitProtium(1);
    var72.setImplicitDeuterium(10001);
    net.sf.jniinchi.JniInchiAtom var82 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var83 = var82.getCharge();
    var82.setImplicitTritium(10);
    double var86 = var82.getX();
    var82.setCharge(1);
    int var89 = var82.getIsotopicMass();
    net.sf.jniinchi.INCHI_PARITY var91 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var92 = var91.getIndx();
    int var93 = var91.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var94 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var45, var52, var59, var72, var82, var91);
    net.sf.jniinchi.JniInchiStereo0D var95 = new net.sf.jniinchi.JniInchiStereo0D(var9, var16, var23, var30, var35, var40, var91);
    net.sf.jniinchi.JniInchiAtom[] var96 = var95.getNeighbors();
    var0.addAtoms(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "hi!"+ "'", var65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


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
    net.sf.jniinchi.JniInchiAtom var87 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var87.setImplicitProtium(1);
    double var90 = var87.getY();
    var87.setImplicitProtium(0);
    net.sf.jniinchi.INCHI_BOND_TYPE var94 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("NONE");
    net.sf.jniinchi.JniInchiBond var95 = new net.sf.jniinchi.JniInchiBond(var23, var87, var94);
    net.sf.jniinchi.INCHI_RADICAL var96 = var23.getRadical();
    int var97 = var96.getIndx();
    
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
    assertTrue(var90 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 0);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    net.sf.jniinchi.JniInchiOutput var16 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var17 = var16.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var18 = new net.sf.jniinchi.JniInchiOutputStructure(var17);
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(var17);
    net.sf.jniinchi.INCHI_RET var20 = var19.getReturnStatus();
    int var21 = var19.getNumStereo0D();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var24 = var9.getBond(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(10.0d, 10.0d, 100.0d, "hi!");
    var4.setIsotopicMassShift(10);
    java.lang.String var7 = var4.getElementType();
    int var8 = var4.getIsotopicMass();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10010);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue((-1));
    net.sf.jniinchi.JniInchiOutput var6 = new net.sf.jniinchi.JniInchiOutput(var1, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "hi!", "");
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var1);
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var17 = var16.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    net.sf.jniinchi.JniInchiBond[] var19 = new net.sf.jniinchi.JniInchiBond[] { };
    var18.addBonds(var19);
    net.sf.jniinchi.JniInchiAtom var25 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var26 = var25.getCharge();
    var25.setImplicitTritium(10);
    double var29 = var25.getX();
    var25.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var32 = var18.addAtom(var25);
    net.sf.jniinchi.JniInchiInputData var35 = new net.sf.jniinchi.JniInchiInputData(1, var18, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var36 = var35.getInput();
    net.sf.jniinchi.JniInchiInput var37 = var35.getInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var37);
    net.sf.jniinchi.JniInchiOutputStructure var46 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var47 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var46);
    net.sf.jniinchi.JniInchiInput var48 = new net.sf.jniinchi.JniInchiInput();
    var46.setStructure((net.sf.jniinchi.JniInchiStructure)var48);
    java.lang.String var50 = var48.getOptions();
    java.lang.String var51 = var48.getOptions();
    net.sf.jniinchi.JniInchiOutputStructure var59 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var60 = var59.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var61 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var59);
    java.lang.String var62 = var61.getOptions();
    net.sf.jniinchi.JniInchiInput var63 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var61);
    net.sf.jniinchi.JniInchiOutputStructure var71 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var72 = var71.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var73 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var71);
    long[][] var74 = var71.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var79 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var80 = var79.getCharge();
    var79.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var87 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var88 = var87.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var90 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var91 = var90.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var93 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var94 = new net.sf.jniinchi.JniInchiBond(var79, var87, var90, var93);
    net.sf.jniinchi.JniInchiBond var95 = var71.addBond(var94);
    net.sf.jniinchi.JniInchiBond[] var96 = new net.sf.jniinchi.JniInchiBond[] { var95};
    var61.addBonds(var96);
    var48.addBonds(var96);
    var37.addBonds(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.getAuxInfo();
    java.lang.String var7 = var5.toString();
    net.sf.jniinchi.INCHI_RET var8 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(var8);
    net.sf.jniinchi.JniInchiOutputStructure var10 = new net.sf.jniinchi.JniInchiOutputStructure(var8);
    long[][] var11 = var10.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var13 = var10.getStereo0D(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


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
    int var91 = var11.getCharge();
    var11.debug();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("SINGLE_2UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    var4.setImplicitDeuterium(100);
    var4.setImplicitProtium(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var4.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var11.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    int var23 = var18.getImplicitH();
    java.lang.String var24 = var18.getElementType();
    int var25 = var18.getImplicitProtium();
    int var26 = var18.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitProtium(1);
    var31.setImplicitDeuterium(10001);
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitTritium(10);
    double var45 = var41.getX();
    var41.setCharge(1);
    int var48 = var41.getIsotopicMass();
    net.sf.jniinchi.INCHI_PARITY var50 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var51 = var50.getIndx();
    int var52 = var50.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var53 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var11, var18, var31, var41, var50);
    var18.setIsotopicMassShift(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


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
    double var45 = var18.getZ();
    
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
    assertTrue(var45 == 100.0d);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom[] var10 = new net.sf.jniinchi.JniInchiAtom[] { };
    var9.addAtoms(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var13 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var5 = var4.getImplicitTritium();
    var4.setImplicitProtium((-1));
    var4.debug();
    net.sf.jniinchi.INCHI_RADICAL var9 = var4.getRadical();
    boolean var11 = var9.equals((java.lang.Object)"net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var99 = var95.getNeighbor(4);
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
    assertTrue("'" + var97 + "' != '" + "InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE"+ "'", var97.equals("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("InChI_Output: EOF/net.sf.jniinchi.LoadNativeLibraryException: /InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.JniInchiWrapper.checkInchiKey("SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("net.sf.jniinchi.JniInchiException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    var4.setImplicitDeuterium(10);
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var11.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var18 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var19 = var18.getCharge();
    var18.setImplicitTritium(10);
    double var22 = var18.getX();
    int var23 = var18.getImplicitH();
    java.lang.String var24 = var18.getElementType();
    int var25 = var18.getImplicitProtium();
    int var26 = var18.getImplicitTritium();
    net.sf.jniinchi.JniInchiAtom var31 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var32 = var31.getCharge();
    var31.setImplicitProtium(1);
    var31.setImplicitDeuterium(10001);
    net.sf.jniinchi.JniInchiAtom var41 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var42 = var41.getCharge();
    var41.setImplicitTritium(10);
    double var45 = var41.getX();
    var41.setCharge(1);
    int var48 = var41.getIsotopicMass();
    net.sf.jniinchi.INCHI_PARITY var50 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var51 = var50.getIndx();
    int var52 = var50.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var53 = net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(var4, var11, var18, var31, var41, var50);
    int var54 = var50.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


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
    java.lang.String var50 = var45.getDebugString();
    net.sf.jniinchi.JniInchiAtom[] var51 = var45.getNeighbors();
    net.sf.jniinchi.INCHI_PARITY var52 = var45.getParity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var54 = var45.getNeighbor((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var50.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", (-1L), 10L, 10L, 0L);
    java.lang.String var8 = var7.getLog();
    net.sf.jniinchi.INCHI_RET var9 = var7.getReturnStatus();
    int var10 = var9.ordinal();
    int var11 = var9.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    net.sf.jniinchi.JniInchiOutputStructure var14 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var16 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var14, "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:10000 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    java.lang.String var4 = var1.toString();
    int var5 = var1.getIndx();
    int var6 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "OK"+ "'", var4.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Stereo0D: - [hi!,hi!,NONE,InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var15 = var13.getInput();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var16 = net.sf.jniinchi.JniInchiWrapper.getStdInchi(var15);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, (-1.0d), 1.0d, "net.sf.jniinchi.LoadNativeLibraryException: ");
    var4.setImplicitDeuterium(100);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:100 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.getValue(10010);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.getValue((-1));
    int var2 = var1.getIndx();
    int var3 = var1.getIndx();
    int var4 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.getValue(9999);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.JniInchiOutputStructure var21 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var22 = var21.getNumAtoms();
    var9.setStructure((net.sf.jniinchi.JniInchiStructure)var21);
    net.sf.jniinchi.JniInchiOutputStructure var31 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var32 = var31.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var33 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var31);
    java.lang.String var34 = var31.getLog();
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var39.setImplicitProtium(1);
    int var42 = var39.getImplicitDeuterium();
    int var43 = var39.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var45 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var50 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var51 = var50.getCharge();
    var50.setImplicitTritium(10);
    double var54 = var50.getX();
    var50.setCharge(1);
    int var57 = var50.getIsotopicMass();
    int var58 = var50.getCharge();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var64 = var63.getCharge();
    var63.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var68 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var69 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var39, var45, var50, var63, var68);
    net.sf.jniinchi.JniInchiStereo0D var70 = var31.addStereo0D(var69);
    net.sf.jniinchi.INCHI_PARITY var71 = var69.getDisconnectedParity();
    net.sf.jniinchi.JniInchiStereo0D var72 = var9.addStereo0D(var69);
    java.lang.String var73 = var9.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!", "InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(1, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", 10L, 100L, 1L, 100L);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


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
    var68.setCharge(100);
    var68.setIsotopicMass(1);
    var68.setImplicitH(0);
    
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

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


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
    java.lang.String var98 = var95.getDebugString();
    
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
    assertTrue("'" + var98 + "' != '" + "InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE"+ "'", var98.equals("InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var34 = var7.getBond(10010);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    java.lang.String var12 = var4.getDebugString();
    int var13 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"+ "'", var12.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputData var1 = net.sf.jniinchi.JniInchiWrapper.getInputFromAuxInfo("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("EOF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var6, "", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "net.sf.jniinchi.LoadNativeLibraryException", "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    java.lang.String var13 = var12.getAuxInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var13.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiOutputKey var4 = new net.sf.jniinchi.JniInchiOutputKey(var1, "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    java.lang.String var5 = var4.getKey();
    net.sf.jniinchi.INCHI_KEY var6 = var4.getReturnStatus();
    java.lang.String var7 = var4.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "OK"+ "'", var2.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var7.equals("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput();
    var7.setStructure((net.sf.jniinchi.JniInchiStructure)var9);
    java.lang.String var11 = var9.getOptions();
    java.lang.String var12 = var9.getOptions();
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var21 = var20.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var22 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var23 = var22.getOptions();
    net.sf.jniinchi.JniInchiInput var24 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var22);
    net.sf.jniinchi.JniInchiOutputStructure var32 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var33 = var32.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var34 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var32);
    long[][] var35 = var32.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var40 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var41 = var40.getCharge();
    var40.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var52 = var51.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var55 = new net.sf.jniinchi.JniInchiBond(var40, var48, var51, var54);
    net.sf.jniinchi.JniInchiBond var56 = var32.addBond(var55);
    net.sf.jniinchi.JniInchiBond[] var57 = new net.sf.jniinchi.JniInchiBond[] { var56};
    var22.addBonds(var57);
    var9.addBonds(var57);
    java.lang.String var60 = var9.getOptions();
    java.lang.String var61 = var9.getOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var63 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var9, "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


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
    net.sf.jniinchi.INCHI_RET var70 = var13.getReturnStatus();
    java.lang.String var71 = var70.name();
    net.sf.jniinchi.JniInchiOutputStructure var72 = new net.sf.jniinchi.JniInchiOutputStructure(var70);
    net.sf.jniinchi.JniInchiOutputStructure var73 = new net.sf.jniinchi.JniInchiOutputStructure(var70);
    java.lang.String var74 = var70.name();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "EOF"+ "'", var71.equals("EOF"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "EOF"+ "'", var74.equals("EOF"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var63 = net.sf.jniinchi.JniInchiWrapper.getInchi(var9);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
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

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    long[][] var14 = var13.getWarningFlags();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var16 = var13.getAtom(10001);
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

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(2, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", 10L, 10L, (-1L), (-1L));
    net.sf.jniinchi.JniInchiOutputStructure var15 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var16 = var15.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var15);
    long[][] var18 = var15.getWarningFlags();
    int var19 = var15.getNumAtoms();
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var25 = var24.getCharge();
    var24.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var32 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var33 = var32.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var35 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var36 = var35.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var38 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var39 = new net.sf.jniinchi.JniInchiBond(var24, var32, var35, var38);
    net.sf.jniinchi.INCHI_BOND_STEREO var40 = var39.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var41 = var39.getTargetAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var42 = var39.getBondStereo();
    net.sf.jniinchi.JniInchiBond var43 = var15.addBond(var39);
    net.sf.jniinchi.JniInchiBond var44 = var7.addBond(var39);
    net.sf.jniinchi.JniInchiAtom var45 = var44.getOriginAtom();
    net.sf.jniinchi.INCHI_BOND_TYPE var46 = var44.getBondType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setIsotopicMassShift(1);
    int var7 = var4.getImplicitProtium();
    var4.setCharge((-1));
    int var10 = var4.getCharge();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    var4.setImplicitDeuterium(10001);
    int var10 = var4.getCharge();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


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
    var45.debug();
    
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

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    double var11 = var4.getZ();
    var4.setImplicitDeuterium(100);
    net.sf.jniinchi.INCHI_RADICAL var14 = var4.getRadical();
    int var15 = var14.getIndx();
    int var16 = var14.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


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
    net.sf.jniinchi.JniInchiAtom var87 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var87.setImplicitProtium(1);
    double var90 = var87.getY();
    var87.setImplicitProtium(0);
    net.sf.jniinchi.INCHI_BOND_TYPE var94 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("NONE");
    net.sf.jniinchi.JniInchiBond var95 = new net.sf.jniinchi.JniInchiBond(var23, var87, var94);
    var23.setImplicitProtium(1);
    
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
    assertTrue(var90 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


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
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var48 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var49 = var48.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var51 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var52 = new net.sf.jniinchi.JniInchiBond(var18, var46, var48, var51);
    var46.setImplicitTritium(2);
    int var55 = var46.getImplicitProtium();
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    net.sf.jniinchi.INCHI_BOND_STEREO var33 = var32.getBondStereo();
    int var34 = var33.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.getInchi();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var9 = var5.getReturnStatus();
    java.lang.String var10 = var5.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var15 = var13.getInput();
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    net.sf.jniinchi.JniInchiAtom var21 = var15.addAtom(var20);
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    var26.setImplicitTritium(10);
    var26.setImplicitTritium(1);
    net.sf.jniinchi.JniInchiAtom var36 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var37 = var36.getCharge();
    var36.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_RADICAL var40 = var36.getRadical();
    java.lang.String var41 = var36.getElementType();
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var46.setImplicitProtium(1);
    int var49 = var46.getImplicitDeuterium();
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var54.setImplicitProtium(1);
    int var57 = var54.getImplicitDeuterium();
    int var58 = var54.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var65 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var66 = var65.getCharge();
    var65.setImplicitTritium(10);
    double var69 = var65.getX();
    var65.setCharge(1);
    int var72 = var65.getIsotopicMass();
    int var73 = var65.getCharge();
    net.sf.jniinchi.JniInchiAtom var78 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var79 = var78.getCharge();
    var78.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var83 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var84 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var54, var60, var65, var78, var83);
    java.lang.String var85 = var84.getDebugString();
    net.sf.jniinchi.INCHI_PARITY var86 = var84.getParity();
    net.sf.jniinchi.JniInchiStereo0D var87 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var20, var26, var36, var46, var86);
    var36.debug();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var85.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("SINGLE_1UP", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


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
    var11.setImplicitH(9999);
    
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

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("DOUBLEBOND");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(1);
    net.sf.jniinchi.JniInchiOutput var6 = new net.sf.jniinchi.JniInchiOutput(var1, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
    int var7 = var1.getIndx();
    int var8 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var3);
    net.sf.jniinchi.LoadNativeLibraryException var7 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var6);
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var9.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "InChI_Output: WARNING///hi!/hi!", "InChI_Output: WARNING///hi!/hi!", "", "hi!");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    java.lang.String var8 = var5.getAuxInfo();
    java.lang.String var9 = var5.getAuxInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var6.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var9.equals("InChI_Output: WARNING///hi!/hi!"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    int var6 = var4.getIsotopicMass();
    double var7 = var4.getZ();
    double var8 = var4.getY();
    var4.setImplicitProtium(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10.0d);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


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
    net.sf.jniinchi.INCHI_PARITY var36 = var34.getParity();
    java.lang.String var37 = var36.toString();
    int var38 = var36.getIndx();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "ODD"+ "'", var37.equals("ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


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
    net.sf.jniinchi.INCHI_BOND_STEREO var54 = var48.getBondStereo();
    int var55 = var54.getIndx();
    int var56 = var54.getIndx();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI_Output: WARNING///hi!/hi!");

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


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
    java.lang.String var25 = var23.getDebugString();
    var23.debug();
    net.sf.jniinchi.INCHI_BOND_STEREO var27 = var23.getBondStereo();
    
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
    assertTrue("'" + var25 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var25.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


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
    int var47 = var4.getImplicitDeuterium();
    double var48 = var4.getY();
    
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
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 10.0d);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(0, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.LoadNativeLibraryException", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    int var8 = var7.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getInchi();
    java.lang.String var4 = var1.getInchi();
    java.lang.String var5 = var1.getInchi();
    java.lang.String var6 = var1.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var4.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var5.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"+ "'", var6.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


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
    var45.setImplicitProtium(0);
    var45.setCharge(100);
    
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

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    double var5 = var4.getX();
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var10.setImplicitProtium(1);
    double var13 = var10.getY();
    net.sf.jniinchi.INCHI_RADICAL var14 = var10.getRadical();
    var4.setRadical(var14);
    java.lang.String var16 = var14.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "NONE"+ "'", var16.equals("NONE"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    var1.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var1.getSuppressed();
    net.sf.jniinchi.LoadNativeLibraryException var10 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var11 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var10);
    java.lang.String var12 = var11.toString();
    net.sf.jniinchi.LoadNativeLibraryException var13 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var15 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var12.equals("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var15.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiOutputKey var4 = new net.sf.jniinchi.JniInchiOutputKey(var1, "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    java.lang.String var5 = var4.getKey();
    net.sf.jniinchi.INCHI_KEY var6 = var4.getReturnStatus();
    net.sf.jniinchi.INCHI_KEY var7 = var4.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var9 = new net.sf.jniinchi.JniInchiOutputKey(var7, "InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "OK"+ "'", var2.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(10.0d, (-1.0d), 100.0d, "DOUBLEBOND");

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var14 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var15 = var14.getCharge();
    var14.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var22 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var23 = var22.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var25 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var26 = var25.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var28 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var29 = new net.sf.jniinchi.JniInchiBond(var14, var22, var25, var28);
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = var29.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var31 = var29.getTargetAtom();
    net.sf.jniinchi.JniInchiBond var32 = var7.addBond(var29);
    net.sf.jniinchi.JniInchiOutputStructure var40 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var41 = var40.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var40);
    net.sf.jniinchi.JniInchiAtom[] var43 = new net.sf.jniinchi.JniInchiAtom[] { };
    var42.addAtoms(var43);
    net.sf.jniinchi.JniInchiOutputStructure var52 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var53 = var52.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var54 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var52);
    net.sf.jniinchi.JniInchiAtom[] var55 = new net.sf.jniinchi.JniInchiAtom[] { };
    var54.addAtoms(var55);
    var42.addAtoms(var55);
    var7.addAtoms(var55);
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
    net.sf.jniinchi.INCHI_STEREOTYPE var94 = var93.getStereoType();
    net.sf.jniinchi.JniInchiStereo0D var95 = var7.addStereo0D(var93);
    net.sf.jniinchi.JniInchiAtom[] var96 = var93.getNeighbors();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
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
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("EOF");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI_Output: EOF/hi!///");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitH();
    var4.setImplicitProtium(10);
    double var15 = var4.getZ();
    net.sf.jniinchi.INCHI_RADICAL var16 = var4.getRadical();
    
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
    assertNotNull(var16);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiOutputKey var4 = new net.sf.jniinchi.JniInchiOutputKey(var1, "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.INCHI_KEY var5 = var4.getReturnStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "OK"+ "'", var2.equals("OK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


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
    java.lang.String var32 = var7.getLog();
    net.sf.jniinchi.JniInchiAtom var37 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var38 = var37.getCharge();
    var37.setImplicitTritium(10);
    double var41 = var37.getX();
    var37.setCharge(1);
    var37.setImplicitDeuterium(100);
    var37.setIsotopicMassShift(100);
    net.sf.jniinchi.JniInchiAtom var48 = var7.addAtom(var37);
    net.sf.jniinchi.JniInchiInput var49 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var51 = var7.getBond((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutputKey var1 = net.sf.jniinchi.JniInchiWrapper.getInchiKey("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.LoadNativeLibraryException: OK");
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

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


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
    java.lang.String var63 = var7.getLog();
    net.sf.jniinchi.JniInchiInput var64 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
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
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(4, "InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", 100L, 0L, 1L, 1L);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 0.0d, 100.0d, "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
    var4.setCharge(0);
    int var7 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


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
    var45.debug();
    net.sf.jniinchi.INCHI_PARITY var54 = var45.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom[] var55 = var45.getNeighbors();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var57 = var45.getNeighbor(10001);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    var4.setImplicitProtium(0);
    var4.setIsotopicMassShift(0);
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var16.setImplicitProtium(1);
    double var19 = var16.getY();
    net.sf.jniinchi.INCHI_RADICAL var20 = var16.getRadical();
    var4.setRadical(var20);
    int var22 = var4.getImplicitProtium();
    var4.setCharge(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_TYPE var1 = net.sf.jniinchi.INCHI_BOND_TYPE.valueOf("net.sf.jniinchi.LoadNativeLibraryException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(2, "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "net.sf.jniinchi.LoadNativeLibraryException: OK", 10L, 10L, (-1L), (-1L));
    net.sf.jniinchi.JniInchiOutputStructure var15 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var16 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var15);
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var21.setIsotopicMassShift(1);
    int var24 = var21.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var25 = var15.addAtom(var21);
    int var26 = var25.getImplicitH();
    java.lang.String var27 = var25.getElementType();
    net.sf.jniinchi.JniInchiAtom var28 = var7.addAtom(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var30 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7, "InChI_Output: EOF/net.sf.jniinchi.LoadNativeLibraryException: /InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var27.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    int var2 = var0.getNumBonds();
    net.sf.jniinchi.JniInchiOutputStructure var10 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.INCHI_KEY var13 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var15 = new net.sf.jniinchi.JniInchiOutputKey(var13, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var21 = var20.getCharge();
    var20.setImplicitTritium(10);
    double var24 = var20.getX();
    var20.setCharge(1);
    var20.setImplicitDeuterium(100);
    int var29 = var20.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var35 = var34.getCharge();
    var34.setImplicitTritium(10);
    double var38 = var34.getX();
    var34.setCharge(1);
    var34.setImplicitDeuterium(100);
    int var43 = var34.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var45 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var46 = var45.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var54 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var55 = var54.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var56 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var54);
    net.sf.jniinchi.JniInchiAtom[] var57 = new net.sf.jniinchi.JniInchiAtom[] { };
    var56.addAtoms(var57);
    boolean var59 = var45.equals((java.lang.Object)var57);
    net.sf.jniinchi.JniInchiBond var60 = new net.sf.jniinchi.JniInchiBond(var20, var34, var45);
    java.lang.String var61 = var60.getDebugString();
    boolean var62 = var13.equals((java.lang.Object)var60);
    net.sf.jniinchi.INCHI_BOND_TYPE var63 = var60.getBondType();
    java.lang.String var64 = var60.getDebugString();
    net.sf.jniinchi.JniInchiBond[] var65 = new net.sf.jniinchi.JniInchiBond[] { var60};
    var10.addBonds(var65);
    var0.addBonds(var65);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var68 = net.sf.jniinchi.JniInchiWrapper.getInchi(var0);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var61.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"+ "'", var64.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitProtium(1);
    double var7 = var4.getY();
    var4.setImplicitProtium(0);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    var4.setIsotopicMass(10010);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var12 = var11.getImplicitProtium();
    var11.debug();
    net.sf.jniinchi.JniInchiAtom var14 = var7.addAtom(var11);
    long[][] var15 = var7.getWarningFlags();
    long[][] var16 = var7.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var21 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var22 = var21.getCharge();
    var21.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var29 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var30 = var29.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var32 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var33 = var32.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var35 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var36 = new net.sf.jniinchi.JniInchiBond(var21, var29, var32, var35);
    net.sf.jniinchi.INCHI_BOND_STEREO var37 = var36.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var38 = var36.getTargetAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var39 = var36.getBondStereo();
    net.sf.jniinchi.INCHI_BOND_TYPE var40 = var36.getBondType();
    net.sf.jniinchi.JniInchiBond var41 = var7.addBond(var36);
    net.sf.jniinchi.JniInchiAtom var46 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var47 = var46.getCharge();
    var46.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var55 = var54.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var57 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var58 = var57.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var60 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var61 = new net.sf.jniinchi.JniInchiBond(var46, var54, var57, var60);
    net.sf.jniinchi.INCHI_BOND_STEREO var62 = var61.getBondStereo();
    int var63 = var62.getIndx();
    var41.setStereoDefinition(var62);
    net.sf.jniinchi.INCHI_BOND_TYPE var65 = var41.getBondType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


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
    net.sf.jniinchi.INCHI_PARITY var40 = var35.getParity();
    net.sf.jniinchi.INCHI_PARITY var42 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    int var43 = var42.getIndx();
    var35.setDisconnectedParity(var42);
    int var45 = var42.getIndx();
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var14 = var13.getCharge();
    var13.setImplicitTritium(10);
    double var17 = var13.getX();
    var13.setCharge(1);
    var13.setImplicitDeuterium(100);
    int var22 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var28 = var27.getCharge();
    var27.setImplicitTritium(10);
    double var31 = var27.getX();
    var27.setCharge(1);
    var27.setImplicitDeuterium(100);
    int var36 = var27.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var38 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var39 = var38.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var47 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var48 = var47.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var49 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var47);
    net.sf.jniinchi.JniInchiAtom[] var50 = new net.sf.jniinchi.JniInchiAtom[] { };
    var49.addAtoms(var50);
    boolean var52 = var38.equals((java.lang.Object)var50);
    net.sf.jniinchi.JniInchiBond var53 = new net.sf.jniinchi.JniInchiBond(var13, var27, var38);
    net.sf.jniinchi.JniInchiBond var54 = var7.addBond(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiAtom var56 = var7.getAtom(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(3, "net.sf.jniinchi.LoadNativeLibraryException", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", 0L, 0L, (-1L), 100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var9 = var7.getBond(4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var2 = var1.getImplicitProtium();
    int var3 = var1.getImplicitTritium();
    int var4 = var1.getImplicitTritium();
    net.sf.jniinchi.INCHI_RADICAL var5 = var1.getRadical();
    int var6 = var1.getImplicitTritium();
    int var7 = var1.getIsotopicMass();
    java.lang.String var8 = var1.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var8.equals("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    net.sf.jniinchi.INCHI_RET var1 = net.sf.jniinchi.INCHI_RET.getValue(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

}
