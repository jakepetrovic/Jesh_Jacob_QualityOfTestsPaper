package randoop;

import junit.framework.*;

public class RandoopTest10 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test1");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.JniInchiException var4 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var5 = var4.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var4);
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.toString();
    net.sf.jniinchi.LoadNativeLibraryException var9 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var6);
    net.sf.jniinchi.JniInchiException var10 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var9);
    net.sf.jniinchi.LoadNativeLibraryException var12 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.String var13 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var13.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test2");


    net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.getValue(0);
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test3");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE");
    java.lang.String var2 = var1.getOptions();
    java.lang.String var3 = var1.getOptions();
    java.lang.String var4 = var1.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE"+ "'", var4.equals("InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test4");


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
    net.sf.jniinchi.INCHI_PARITY var48 = var46.getParity();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test5");


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
    net.sf.jniinchi.JniInchiInput var86 = var85.getInput();
    net.sf.jniinchi.JniInchiInput var87 = var85.getInput();
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
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "hi!"+ "'", var88.equals("hi!"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_BOND_STEREO var1 = net.sf.jniinchi.INCHI_BOND_STEREO.valueOf("InChI_Output: EOF/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/OK/InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: OK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test7");


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
    var81.debug();
    net.sf.jniinchi.JniInchiAtom var83 = var81.getTargetAtom();
    
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
    assertNotNull(var83);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test8");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("DOUBLET");

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test9");


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
    net.sf.jniinchi.JniInchiAtom[] var98 = var95.getNeighbors();
    
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

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test10");


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
    net.sf.jniinchi.JniInchiAtom[] var53 = var45.getNeighbors();
    net.sf.jniinchi.INCHI_STEREOTYPE var54 = var45.getStereoType();
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test11");


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
    var45.debug();
    net.sf.jniinchi.INCHI_PARITY var54 = var45.getParity();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test12");


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
    int var32 = var7.getNumStereo0D();
    net.sf.jniinchi.INCHI_RET var33 = var7.getReturnStatus();
    int var34 = var7.getNumAtoms();
    int var35 = var7.getNumAtoms();
    
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
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Bond: hi!-InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE // Type: NONE // Stereo: SINGLE_1UP");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test14");


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
    net.sf.jniinchi.INCHI_RADICAL var78 = var68.getRadical();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test15");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("net.sf.jniinchi.JniInchiException: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test16");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:9999 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test17");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(9999, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:10 T:1 // Radical: NONE", "InChI_Output: EOF/net.sf.jniinchi.LoadNativeLibraryException: /InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!", 10L, 0L, 1L, 0L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput();
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var17 = var16.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    var8.setStructure((net.sf.jniinchi.JniInchiStructure)var16);
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var24.setImplicitProtium(1);
    int var27 = var24.getImplicitDeuterium();
    int var28 = var24.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    var35.setImplicitTritium(10);
    double var39 = var35.getX();
    var35.setCharge(1);
    int var42 = var35.getIsotopicMass();
    int var43 = var35.getCharge();
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    var48.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var53 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var54 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var24, var30, var35, var48, var53);
    net.sf.jniinchi.INCHI_PARITY var56 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var54.setDisconnectedParity(var56);
    net.sf.jniinchi.INCHI_PARITY var58 = var54.getParity();
    net.sf.jniinchi.INCHI_PARITY var59 = var54.getDisconnectedParity();
    java.lang.String var60 = var54.getDebugString();
    net.sf.jniinchi.JniInchiStereo0D var61 = var16.addStereo0D(var54);
    net.sf.jniinchi.JniInchiAtom[] var62 = var54.getNeighbors();
    var7.addAtoms(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var60.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test18");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var9 = var8.getNumAtoms();
    int var10 = var8.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var13 = var12.getImplicitProtium();
    var12.debug();
    net.sf.jniinchi.JniInchiAtom var15 = var8.addAtom(var12);
    int var16 = var8.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var25 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var26 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var25);
    net.sf.jniinchi.JniInchiInput var27 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var25);
    net.sf.jniinchi.JniInchiInputData var30 = new net.sf.jniinchi.JniInchiInputData(0, var27, 3, "NONE");
    var8.setStructure((net.sf.jniinchi.JniInchiStructure)var27);
    net.sf.jniinchi.JniInchiAtom var36 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var37 = var36.getCharge();
    var36.setImplicitTritium(10);
    double var40 = var36.getX();
    var36.setCharge(1);
    var36.setImplicitDeuterium(100);
    int var45 = var36.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var50 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var51 = var50.getCharge();
    var50.setImplicitTritium(10);
    double var54 = var50.getX();
    var50.setCharge(1);
    var50.setImplicitDeuterium(100);
    int var59 = var50.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var61 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var62 = var61.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var70 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var71 = var70.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var72 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var70);
    net.sf.jniinchi.JniInchiAtom[] var73 = new net.sf.jniinchi.JniInchiAtom[] { };
    var72.addAtoms(var73);
    boolean var75 = var61.equals((java.lang.Object)var73);
    net.sf.jniinchi.JniInchiBond var76 = new net.sf.jniinchi.JniInchiBond(var36, var50, var61);
    net.sf.jniinchi.INCHI_BOND_TYPE var77 = var76.getBondType();
    net.sf.jniinchi.INCHI_BOND_STEREO var78 = var76.getBondStereo();
    net.sf.jniinchi.JniInchiBond var79 = var27.addBond(var76);
    net.sf.jniinchi.JniInchiInputData var82 = new net.sf.jniinchi.JniInchiInputData(0, var27, 10001, "net.sf.jniinchi.LoadNativeLibraryException");
    net.sf.jniinchi.JniInchiInput var83 = var82.getInput();
    java.lang.String var84 = var82.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var84.equals("net.sf.jniinchi.LoadNativeLibraryException"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test19");


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
    java.lang.String var21 = var19.getDebugString();
    net.sf.jniinchi.INCHI_KEY var23 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var25 = new net.sf.jniinchi.JniInchiOutputKey(var23, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var31 = var30.getCharge();
    var30.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var39 = var38.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var41 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var42 = var41.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var44 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var45 = new net.sf.jniinchi.JniInchiBond(var30, var38, var41, var44);
    boolean var46 = var23.equals((java.lang.Object)var45);
    java.lang.String var47 = var45.getDebugString();
    var45.debug();
    net.sf.jniinchi.JniInchiAtom var53 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var54 = var53.getCharge();
    var53.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var61 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var62 = var61.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var64 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var65 = var64.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var67 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var68 = new net.sf.jniinchi.JniInchiBond(var53, var61, var64, var67);
    net.sf.jniinchi.INCHI_BOND_STEREO var69 = var68.getBondStereo();
    var45.setStereoDefinition(var69);
    var19.setStereoDefinition(var69);
    net.sf.jniinchi.INCHI_BOND_STEREO var72 = var19.getBondStereo();
    var19.debug();
    net.sf.jniinchi.JniInchiAtom var74 = var19.getOriginAtom();
    net.sf.jniinchi.JniInchiAtom var75 = var19.getOriginAtom();
    
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
    assertTrue("'" + var21 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var21.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"+ "'", var47.equals("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test20");


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
    net.sf.jniinchi.JniInchiInputData var27 = new net.sf.jniinchi.JniInchiInputData(0, var10, 1, "InChI_Output: WARNING/SINGLE_2UP/OK/InChI_Output: WARNING///hi!/hi!/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.INCHI_RET var28 = var27.getReturnValue();
    net.sf.jniinchi.JniInchiOutput var33 = new net.sf.jniinchi.JniInchiOutput(var28, "INVALID_PREFIX", "InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI_Output: EOF/OK/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1 D:0 T:0 // Radical: NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "");
    net.sf.jniinchi.INCHI_RET var34 = var33.getReturnStatus();
    java.lang.String var35 = var33.getAuxInfo();
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var35.equals("InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test21");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(3, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "SINGLE_2UP", 10L, 1L, (-1L), (-1L));
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiOutputStructure var16 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var17 = var16.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var18 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var16);
    java.lang.String var19 = var16.getLog();
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var24.setImplicitProtium(1);
    int var27 = var24.getImplicitDeuterium();
    int var28 = var24.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var30 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    var35.setImplicitTritium(10);
    double var39 = var35.getX();
    var35.setCharge(1);
    int var42 = var35.getIsotopicMass();
    int var43 = var35.getCharge();
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var49 = var48.getCharge();
    var48.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var53 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var54 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var24, var30, var35, var48, var53);
    net.sf.jniinchi.JniInchiStereo0D var55 = var16.addStereo0D(var54);
    net.sf.jniinchi.INCHI_PARITY var56 = var54.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var58 = var54.getNeighbor(0);
    net.sf.jniinchi.INCHI_PARITY var59 = var54.getParity();
    net.sf.jniinchi.INCHI_PARITY var60 = var54.getParity();
    var54.debug();
    var54.debug();
    net.sf.jniinchi.INCHI_PARITY var63 = var54.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom[] var64 = var54.getNeighbors();
    var7.addAtoms(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test22");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var8 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiAtom var13 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var13.setIsotopicMassShift(1);
    int var16 = var13.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var17 = var7.addAtom(var13);
    int var18 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiOutputStructure var26 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var27 = var26.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var28 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var26);
    long[][] var29 = var26.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var35 = var34.getCharge();
    var34.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var42 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var43 = var42.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var45 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var46 = var45.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var48 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var49 = new net.sf.jniinchi.JniInchiBond(var34, var42, var45, var48);
    net.sf.jniinchi.JniInchiBond var50 = var26.addBond(var49);
    net.sf.jniinchi.INCHI_BOND_TYPE var51 = var50.getBondType();
    var50.debug();
    net.sf.jniinchi.JniInchiBond var53 = var7.addBond(var50);
    net.sf.jniinchi.JniInchiAtom var54 = var53.getTargetAtom();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test23");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var50 = var49.getStereoType();
    net.sf.jniinchi.JniInchiAtom var51 = var49.getCentralAtom();
    net.sf.jniinchi.INCHI_STEREOTYPE var52 = var49.getStereoType();
    net.sf.jniinchi.INCHI_STEREOTYPE var53 = var49.getStereoType();
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test24");


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
    net.sf.jniinchi.INCHI_PARITY var40 = net.sf.jniinchi.INCHI_PARITY.getValue(0);
    var34.setDisconnectedParity(var40);
    net.sf.jniinchi.JniInchiOutputStructure var49 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var50 = var49.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var51 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var49);
    java.lang.String var52 = var49.getLog();
    net.sf.jniinchi.JniInchiAtom var57 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var57.setImplicitProtium(1);
    int var60 = var57.getImplicitDeuterium();
    int var61 = var57.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var63 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var68 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var69 = var68.getCharge();
    var68.setImplicitTritium(10);
    double var72 = var68.getX();
    var68.setCharge(1);
    int var75 = var68.getIsotopicMass();
    int var76 = var68.getCharge();
    net.sf.jniinchi.JniInchiAtom var81 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var82 = var81.getCharge();
    var81.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var86 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var87 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var57, var63, var68, var81, var86);
    net.sf.jniinchi.JniInchiStereo0D var88 = var49.addStereo0D(var87);
    net.sf.jniinchi.INCHI_PARITY var89 = var87.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var91 = var87.getNeighbor(0);
    java.lang.String var92 = var87.getDebugString();
    net.sf.jniinchi.JniInchiAtom[] var93 = var87.getNeighbors();
    net.sf.jniinchi.INCHI_PARITY var94 = var87.getDisconnectedParity();
    var34.setDisconnectedParity(var94);
    net.sf.jniinchi.INCHI_PARITY var96 = var34.getDisconnectedParity();
    net.sf.jniinchi.INCHI_PARITY var97 = var34.getParity();
    net.sf.jniinchi.INCHI_PARITY var98 = var34.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom[] var99 = var34.getNeighbors();
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var92 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var92.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test25");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: ", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 100L, 1L, 10L, 1L);
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
    net.sf.jniinchi.INCHI_PARITY var55 = var53.getDisconnectedParity();
    net.sf.jniinchi.JniInchiAtom var57 = var53.getNeighbor(0);
    net.sf.jniinchi.JniInchiAtom var59 = var53.getNeighbor(0);
    java.lang.String var60 = var53.getDebugString();
    net.sf.jniinchi.INCHI_PARITY var61 = var53.getDisconnectedParity();
    net.sf.jniinchi.JniInchiStereo0D var62 = var7.addStereo0D(var53);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var60.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var2 = net.sf.jniinchi.JniInchiWrapper.checkInchi("InChI_Output: null/InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/NONE/net.sf.jniinchi.JniInchiException", false);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test28");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test29");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var35 = var34.getStereoType();
    net.sf.jniinchi.JniInchiAtom var37 = var34.getNeighbor(3);
    double var38 = var37.getY();
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 10.0d);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test30");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var4.setIsotopicMassShift(1);
    int var7 = var4.getImplicitProtium();
    var4.setImplicitDeuterium(100);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    var4.setIsotopicMassShift(10001);
    int var13 = var4.getImplicitTritium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STATUS var1 = net.sf.jniinchi.INCHI_STATUS.valueOf("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test32");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("OK");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    net.sf.jniinchi.JniInchiException var5 = new net.sf.jniinchi.JniInchiException("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    java.lang.String var6 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"+ "'", var6.equals("net.sf.jniinchi.JniInchiException: InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:9999 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test34");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("net.sf.jniinchi.JniInchiException: InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test35");


    net.sf.jniinchi.JniInchiException var1 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var2 = var1.toString();
    net.sf.jniinchi.LoadNativeLibraryException var3 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var3);
    java.lang.String var7 = var6.toString();
    net.sf.jniinchi.JniInchiException var8 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var6);
    net.sf.jniinchi.JniInchiException var9 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var8);
    net.sf.jniinchi.LoadNativeLibraryException var10 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var2.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var5.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test36");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    int var13 = var7.getIndx();
    net.sf.jniinchi.JniInchiOutput var18 = new net.sf.jniinchi.JniInchiOutput(var7, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE", "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "InChI_Output: EOF/hi!///");
    int var19 = var7.getIndx();
    int var20 = var7.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test37");


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
    net.sf.jniinchi.JniInchiAtom var43 = var34.getNeighbor(1);
    net.sf.jniinchi.INCHI_RADICAL var44 = var43.getRadical();
    var43.setCharge(10001);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test38");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 100.0d, (-1.0d), "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    var4.setImplicitDeuterium(10);
    java.lang.String var7 = var4.getElementType();
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var12.setImplicitProtium(1);
    double var15 = var12.getY();
    var12.setImplicitProtium(0);
    var12.setIsotopicMassShift(0);
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var25 = var24.getCharge();
    var24.setImplicitTritium(10);
    var24.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var30 = var24.getRadical();
    var24.setIsotopicMassShift(1);
    net.sf.jniinchi.INCHI_BOND_TYPE var34 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var35 = var34.getDeclaringClass();
    net.sf.jniinchi.JniInchiBond var36 = new net.sf.jniinchi.JniInchiBond(var12, var24, var34);
    net.sf.jniinchi.INCHI_RADICAL var37 = var24.getRadical();
    var4.setRadical(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test39");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:9999 // Implicit H:-1 P:0 D:1 T:0 // Radical: NONE");

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test40");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    double var11 = var4.getZ();
    var4.setIsotopicMassShift(100);
    java.lang.String var14 = var4.getElementType();
    int var15 = var4.getImplicitProtium();
    net.sf.jniinchi.INCHI_RADICAL var16 = var4.getRadical();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test41");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    boolean var3 = var1.equals((java.lang.Object)0);
    int var4 = var1.getIndx();
    net.sf.jniinchi.JniInchiOutputKey var6 = new net.sf.jniinchi.JniInchiOutputKey(var1, "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_KEY var7 = var6.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var9 = new net.sf.jniinchi.JniInchiOutputKey(var7, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10000 // Implicit H:0 P:0 D:0 T:1 // Radical: NONE");
    net.sf.jniinchi.INCHI_KEY var10 = var9.getReturnStatus();
    java.lang.String var11 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "OK"+ "'", var11.equals("OK"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test42");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", (-1L), 10L, 10L, 0L);
    java.lang.String var8 = var7.getLog();
    int var9 = var7.getNumBonds();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput();
    int var12 = var11.getNumStereo0D();
    net.sf.jniinchi.JniInchiOutputStructure var20 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var21 = var20.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var22 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var20);
    java.lang.String var23 = var20.getLog();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var28.setImplicitProtium(1);
    int var31 = var28.getImplicitDeuterium();
    int var32 = var28.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitTritium(10);
    double var43 = var39.getX();
    var39.setCharge(1);
    int var46 = var39.getIsotopicMass();
    int var47 = var39.getCharge();
    net.sf.jniinchi.JniInchiAtom var52 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var53 = var52.getCharge();
    var52.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var57 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var58 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var28, var34, var39, var52, var57);
    net.sf.jniinchi.JniInchiStereo0D var59 = var20.addStereo0D(var58);
    net.sf.jniinchi.JniInchiStereo0D var60 = var11.addStereo0D(var59);
    net.sf.jniinchi.INCHI_STEREOTYPE var61 = var60.getStereoType();
    net.sf.jniinchi.INCHI_PARITY var62 = var60.getParity();
    net.sf.jniinchi.JniInchiAtom[] var63 = var60.getNeighbors();
    var10.addAtoms(var63);
    net.sf.jniinchi.JniInchiInput var65 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
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

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test43");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    int var5 = var4.getImplicitTritium();
    var4.setImplicitDeuterium(0);
    net.sf.jniinchi.JniInchiAtom var9 = new net.sf.jniinchi.JniInchiAtom("");
    int var10 = var9.getImplicitTritium();
    net.sf.jniinchi.INCHI_BOND_TYPE var12 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var13 = var12.getDeclaringClass();
    int var14 = var12.getIndx();
    int var15 = var12.ordinal();
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
    net.sf.jniinchi.JniInchiAtom var62 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var64 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var65 = var64.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var67 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var68 = new net.sf.jniinchi.JniInchiBond(var34, var62, var64, var67);
    java.lang.Class var69 = var67.getDeclaringClass();
    net.sf.jniinchi.JniInchiBond var70 = new net.sf.jniinchi.JniInchiBond(var4, var9, var12, var67);
    java.lang.String var71 = var12.name();
    int var72 = var12.getIndx();
    int var73 = var12.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "NONE"+ "'", var71.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test44");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.INCHI_RET var10 = var7.getReturnStatus();
    long[][] var11 = var7.getWarningFlags();
    net.sf.jniinchi.JniInchiOutputStructure var19 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var20 = var19.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var19);
    java.lang.String var22 = var19.getLog();
    net.sf.jniinchi.JniInchiAtom var27 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var27.setImplicitProtium(1);
    int var30 = var27.getImplicitDeuterium();
    int var31 = var27.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var33 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var39 = var38.getCharge();
    var38.setImplicitTritium(10);
    double var42 = var38.getX();
    var38.setCharge(1);
    int var45 = var38.getIsotopicMass();
    int var46 = var38.getCharge();
    net.sf.jniinchi.JniInchiAtom var51 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var52 = var51.getCharge();
    var51.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var56 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var57 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var27, var33, var38, var51, var56);
    net.sf.jniinchi.JniInchiStereo0D var58 = var19.addStereo0D(var57);
    net.sf.jniinchi.INCHI_STEREOTYPE var59 = var58.getStereoType();
    net.sf.jniinchi.INCHI_STEREOTYPE var60 = var58.getStereoType();
    net.sf.jniinchi.JniInchiAtom[] var61 = var58.getNeighbors();
    var7.addAtoms(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test45");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    int var8 = var6.getIndx();
    net.sf.jniinchi.JniInchiOutputStructure var9 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    int var10 = var6.ordinal();
    int var11 = var6.getIndx();
    int var12 = var6.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test46");


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
    int var42 = var7.getNumAtoms();
    
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
    assertTrue(var42 == 1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("INVALID_PREFIX");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test48");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    java.lang.String var10 = var7.getLog();
    long[][] var11 = var7.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    var16.setIsotopicMassShift(10);
    var16.setImplicitDeuterium(10001);
    var16.setIsotopicMassShift(1);
    net.sf.jniinchi.JniInchiAtom var23 = var7.addAtom(var16);
    net.sf.jniinchi.JniInchiOutput var29 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var30 = var29.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var31 = new net.sf.jniinchi.JniInchiOutputStructure(var30);
    net.sf.jniinchi.JniInchiOutputStructure var32 = new net.sf.jniinchi.JniInchiOutputStructure(var30);
    net.sf.jniinchi.INCHI_RET var33 = var32.getReturnStatus();
    long[][] var34 = var32.getWarningFlags();
    int var35 = var32.getNumBonds();
    net.sf.jniinchi.JniInchiOutputStructure var43 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var44 = var43.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var45 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var43);
    net.sf.jniinchi.JniInchiBond[] var46 = new net.sf.jniinchi.JniInchiBond[] { };
    var45.addBonds(var46);
    var32.addBonds(var46);
    var7.addBonds(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test49");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("InChI_Output: OKAY/InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD/OK/InChI Stereo0D: - [hi!,hi!,NONE,InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE] Type::DOUBLEBOND // Parity:ODD/InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test50");


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
    net.sf.jniinchi.JniInchiAtom[] var73 = var69.getNeighbors();
    
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
    assertNotNull(var73);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test51");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(0.0d, 100.0d, 1.0d, "net.sf.jniinchi.JniInchiException: OK");

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test52");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test53");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    var4.setImplicitDeuterium(10);
    var4.setImplicitDeuterium(9999);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test54");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var1.setCharge(0);
    var1.setImplicitDeuterium(0);
    var1.setImplicitH(3);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test55");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10001, "SINGLE_1UP", "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE", "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!");
    java.lang.String var6 = var5.toString();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    java.lang.String var8 = var5.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "InChI_Output: null/SINGLE_1UP/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"+ "'", var6.equals("InChI_Output: null/SINGLE_1UP/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"+ "'", var8.equals("InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test56");


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
    net.sf.jniinchi.INCHI_BOND_STEREO var63 = var57.getBondStereo();
    net.sf.jniinchi.JniInchiOutput var69 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var70 = var69.getInchi();
    java.lang.String var71 = var69.toString();
    net.sf.jniinchi.INCHI_RET var72 = var69.getReturnStatus();
    java.lang.String var73 = var69.getLog();
    boolean var74 = var63.equals((java.lang.Object)var73);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + ""+ "'", var70.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var71.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test57");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    java.lang.String var2 = var1.getOptions();
    java.lang.String var3 = var1.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test58");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    net.sf.jniinchi.INCHI_RET var10 = var7.getReturnStatus();
    int var11 = var7.getNumAtoms();
    java.lang.String var12 = var7.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test59");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    long[][] var10 = var7.getWarningFlags();
    int var11 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var25 = var24.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var27 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var28 = var27.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var31 = new net.sf.jniinchi.JniInchiBond(var16, var24, var27, var30);
    net.sf.jniinchi.INCHI_BOND_STEREO var32 = var31.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var33 = var31.getTargetAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var34 = var31.getBondStereo();
    net.sf.jniinchi.JniInchiBond var35 = var7.addBond(var31);
    net.sf.jniinchi.INCHI_BOND_STEREO var36 = var31.getBondStereo();
    var31.debug();
    net.sf.jniinchi.JniInchiAtom var38 = var31.getTargetAtom();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test60");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", (-1L), 10L, 10L, 0L);
    java.lang.String var8 = var7.getLog();
    net.sf.jniinchi.INCHI_RET var9 = var7.getReturnStatus();
    java.lang.Class var10 = var9.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var12 = java.lang.Enum.<java.lang.Enum>valueOf(var10, "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:9999 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test61");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var3 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var5 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var1);
    net.sf.jniinchi.LoadNativeLibraryException var6 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var5);
    net.sf.jniinchi.LoadNativeLibraryException var8 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiException var10 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    var8.addSuppressed((java.lang.Throwable)var10);
    net.sf.jniinchi.JniInchiException var12 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var8);
    var5.addSuppressed((java.lang.Throwable)var8);
    net.sf.jniinchi.JniInchiException var14 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var8);
    net.sf.jniinchi.JniInchiException var15 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var14);
    net.sf.jniinchi.JniInchiException var17 = new net.sf.jniinchi.JniInchiException("InChI_Output: EOF/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/OK/InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: OK");
    net.sf.jniinchi.LoadNativeLibraryException var18 = new net.sf.jniinchi.LoadNativeLibraryException((java.lang.Throwable)var17);
    var14.addSuppressed((java.lang.Throwable)var17);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test62");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test63");


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
    int var88 = var36.getImplicitH();
    int var89 = var36.getImplicitDeuterium();
    double var90 = var36.getZ();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 100.0d);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test64");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("VALID_NON_STANDARD");

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test65");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(10, "OK", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "", "InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    java.lang.String var7 = var5.getAuxInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test66");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiOutput var2 = net.sf.jniinchi.JniInchiWrapper.getInchiFromInchi(var1);
      fail("Expected exception of type net.sf.jniinchi.LoadNativeLibraryException");
    } catch (net.sf.jniinchi.LoadNativeLibraryException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test67");


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
    net.sf.jniinchi.JniInchiOutputStructure var33 = new net.sf.jniinchi.JniInchiOutputStructure(var32);
    net.sf.jniinchi.JniInchiOutput var38 = new net.sf.jniinchi.JniInchiOutput(var32, "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "InChI_Output: null/InChI_Output: null/SINGLE_1UP/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE [1.0,-1.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "SINGLE_2UP");
    net.sf.jniinchi.JniInchiOutputStructure var39 = new net.sf.jniinchi.JniInchiOutputStructure(var32);
    net.sf.jniinchi.INCHI_RET var40 = var39.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var45 = new net.sf.jniinchi.JniInchiOutput(var40, "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "net.sf.jniinchi.JniInchiException: InChI_Output: EOF/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/OK/InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: OK", "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "OK");
    
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
    assertNotNull(var40);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test68");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    net.sf.jniinchi.JniInchiInput var15 = var13.getInput();
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 100.0d, "hi!");
    net.sf.jniinchi.JniInchiAtom var21 = var15.addAtom(var20);
    var21.setImplicitH(9999);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test69");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("net.sf.jniinchi.JniInchiException: InChI_Output: EOF/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/OK/InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: OK", "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:10100 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test70");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    long[][] var11 = var8.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var16 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var17 = var16.getCharge();
    var16.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var25 = var24.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var27 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var28 = var27.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var30 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var31 = new net.sf.jniinchi.JniInchiBond(var16, var24, var27, var30);
    net.sf.jniinchi.JniInchiBond var32 = var8.addBond(var31);
    java.lang.String var33 = var8.getLog();
    net.sf.jniinchi.JniInchiAtom var38 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var39 = var38.getCharge();
    var38.setImplicitTritium(10);
    double var42 = var38.getX();
    var38.setCharge(1);
    var38.setImplicitDeuterium(100);
    var38.setIsotopicMassShift(100);
    net.sf.jniinchi.JniInchiAtom var49 = var8.addAtom(var38);
    net.sf.jniinchi.JniInchiInput var50 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiOutputStructure var58 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var59 = var58.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var60 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var58);
    net.sf.jniinchi.JniInchiBond[] var61 = new net.sf.jniinchi.JniInchiBond[] { };
    var60.addBonds(var61);
    var50.addBonds(var61);
    net.sf.jniinchi.JniInchiInputData var66 = new net.sf.jniinchi.JniInchiInputData(4, var50, 4, "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    java.lang.String var67 = var66.getErrorMessage();
    net.sf.jniinchi.INCHI_RET var68 = var66.getReturnValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var67.equals("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test71");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(6, "InChI Atom: InChI_Output: WARNING///hi!/hi! [-1.0,1.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "SINGLE_1UP", 0L, (-1L), 100L, 0L);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test72");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    java.lang.String var10 = var9.getOptions();
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var9, 0, "net.sf.jniinchi.LoadNativeLibraryException");
    java.lang.String var14 = var13.getErrorMessage();
    java.lang.String var15 = var13.getErrorMessage();
    net.sf.jniinchi.INCHI_RET var16 = var13.getReturnValue();
    int var17 = var16.getIndx();
    net.sf.jniinchi.JniInchiOutputStructure var18 = new net.sf.jniinchi.JniInchiOutputStructure(var16);
    net.sf.jniinchi.JniInchiOutput var23 = new net.sf.jniinchi.JniInchiOutput(var16, "InChI_Output: OKAY/InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD/OK/InChI Stereo0D: - [hi!,hi!,NONE,InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE] Type::DOUBLEBOND // Parity:ODD/InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var14.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "net.sf.jniinchi.LoadNativeLibraryException"+ "'", var15.equals("net.sf.jniinchi.LoadNativeLibraryException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test73");


    net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("DOUBLEBOND");
    int var2 = var1.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test74");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiInput var10 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiInputData var13 = new net.sf.jniinchi.JniInchiInputData(0, var10, 3, "NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var15 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10, "net.sf.jniinchi.JniInchiException: OK");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test75");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("net.sf.jniinchi.LoadNativeLibraryException: OK");
    net.sf.jniinchi.JniInchiException var3 = new net.sf.jniinchi.JniInchiException("InChI_Output: WARNING///hi!/hi!");
    java.lang.String var4 = var3.toString();
    net.sf.jniinchi.JniInchiException var5 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var3);
    var1.addSuppressed((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var7 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var8 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var3);
    net.sf.jniinchi.JniInchiException var9 = new net.sf.jniinchi.JniInchiException((java.lang.Throwable)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var4.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_PARITY var1 = net.sf.jniinchi.INCHI_PARITY.valueOf("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test77");


    net.sf.jniinchi.INCHI_OPTION var1 = net.sf.jniinchi.INCHI_OPTION.valueOfIgnoreCase("net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test78");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", 10L, 0L, 1L, (-1L));
    int var8 = var7.getNumBonds();
    net.sf.jniinchi.INCHI_RET var9 = var7.getReturnStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test79");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(10.0d, 1.0d, (-1.0d), "InChI_Output: EOF/hi!///");
    int var5 = var4.getImplicitH();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test80");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    int var9 = var6.getIndx();
    net.sf.jniinchi.JniInchiOutput var14 = new net.sf.jniinchi.JniInchiOutput(var6, "InChI_Output: EOF/hi!///", "SINGLE_2UP", "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "net.sf.jniinchi.LoadNativeLibraryException: ");
    net.sf.jniinchi.JniInchiOutputStructure var15 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    int var16 = var6.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test81");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    java.lang.String var2 = var1.getInchi();
    java.lang.String var3 = var1.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"+ "'", var2.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test82");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(3, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1 D:0 T:0 // Radical: NONE", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", (-1L), 1L, (-1L), 10L);
    net.sf.jniinchi.JniInchiOutputStructure var15 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var16 = var15.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var17 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var15);
    java.lang.String var18 = var17.getOptions();
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var17);
    net.sf.jniinchi.JniInchiOutputStructure var27 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var28 = var27.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var29 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var27);
    long[][] var30 = var27.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var35 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var36 = var35.getCharge();
    var35.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var43 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var44 = var43.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var46 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var47 = var46.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var49 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var50 = new net.sf.jniinchi.JniInchiBond(var35, var43, var46, var49);
    net.sf.jniinchi.JniInchiBond var51 = var27.addBond(var50);
    net.sf.jniinchi.JniInchiBond[] var52 = new net.sf.jniinchi.JniInchiBond[] { var51};
    var17.addBonds(var52);
    var7.addBonds(var52);
    net.sf.jniinchi.JniInchiInput var55 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test83");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_2UP");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test84");


    net.sf.jniinchi.JniInchiInput var0 = new net.sf.jniinchi.JniInchiInput();
    int var1 = var0.getNumStereo0D();
    int var2 = var0.getNumAtoms();
    int var3 = var0.getNumBonds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test85");


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
    int var83 = var23.getImplicitH();
    var23.setCharge(4);
    
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
    assertTrue(var83 == (-1));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test86");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var8 = var7.getNumAtoms();
    int var9 = var7.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var11 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var12 = var11.getImplicitProtium();
    var11.debug();
    net.sf.jniinchi.JniInchiAtom var14 = var7.addAtom(var11);
    java.lang.String var15 = var7.getLog();
    int var16 = var7.getNumAtoms();
    int var17 = var7.getNumBonds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"+ "'", var15.equals("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test87");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.LoadNativeLibraryException: InChI_Output: null/InChI_Output: null/SINGLE_1UP/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP/InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/InChI Atom: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE [1.0,-1.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test88");


    net.sf.jniinchi.LoadNativeLibraryException var1 = new net.sf.jniinchi.LoadNativeLibraryException("InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test89");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var6, "", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "net.sf.jniinchi.LoadNativeLibraryException", "net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var6);
    net.sf.jniinchi.JniInchiOutputKey var16 = new net.sf.jniinchi.JniInchiOutputKey(1, "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
    net.sf.jniinchi.INCHI_KEY var17 = var16.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var19 = new net.sf.jniinchi.JniInchiOutputKey(var17, "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var21 = new net.sf.jniinchi.JniInchiOutputKey(var17, "NONE");
    net.sf.jniinchi.INCHI_KEY var22 = var21.getReturnStatus();
    boolean var23 = var6.equals((java.lang.Object)var22);
    int var24 = var6.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test90");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.getInchi();
    java.lang.String var7 = var5.toString();
    net.sf.jniinchi.INCHI_RET var8 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var13 = new net.sf.jniinchi.JniInchiOutput(var8, "NONE", "net.sf.jniinchi.JniInchiException: OK", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE", "SINGLE_2UP");
    net.sf.jniinchi.JniInchiOutput var18 = new net.sf.jniinchi.JniInchiOutput(var8, "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: InChI_Output: WARNING///hi!/hi! [-1.0,1.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "OKAY", "net.sf.jniinchi.LoadNativeLibraryException: OK");
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom("hi!");
    int var21 = var20.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var26 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var27 = var26.getCharge();
    int var28 = var26.getIsotopicMass();
    int var29 = var26.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var34 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(0.0d, 1.0d, 0.0d, "");
    var39.setIsotopicMassShift(10);
    int var42 = var39.getCharge();
    net.sf.jniinchi.JniInchiStructure var43 = net.sf.jniinchi.Main.getTestMolecule();
    net.sf.jniinchi.JniInchiAtom var48 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var48.setImplicitProtium(1);
    int var51 = var48.getImplicitDeuterium();
    int var52 = var48.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var54 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var59 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var60 = var59.getCharge();
    var59.setImplicitTritium(10);
    double var63 = var59.getX();
    var59.setCharge(1);
    int var66 = var59.getIsotopicMass();
    int var67 = var59.getCharge();
    net.sf.jniinchi.JniInchiAtom var72 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var73 = var72.getCharge();
    var72.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var77 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var78 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var48, var54, var59, var72, var77);
    net.sf.jniinchi.INCHI_PARITY var80 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var78.setDisconnectedParity(var80);
    net.sf.jniinchi.JniInchiStereo0D var82 = var43.addStereo0D(var78);
    net.sf.jniinchi.INCHI_PARITY var83 = var78.getParity();
    int var84 = var83.getIndx();
    net.sf.jniinchi.JniInchiStereo0D var85 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var20, var26, var34, var39, var83);
    int var86 = var83.getIndx();
    boolean var87 = var8.equals((java.lang.Object)var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test91");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(20001);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test92");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    java.lang.String var2 = var1.getOptions();
    java.lang.String var3 = var1.getInchi();
    java.lang.String var4 = var1.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"+ "'", var3.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test93");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutput var12 = new net.sf.jniinchi.JniInchiOutput(var7, "OK", "", "InChI_Output: WARNING///hi!/hi!", "hi!");
    net.sf.jniinchi.JniInchiOutputStructure var13 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    long[][] var14 = var13.getWarningFlags();
    long[][] var15 = var13.getWarningFlags();
    int var16 = var13.getNumAtoms();
    int var17 = var13.getNumStereo0D();
    net.sf.jniinchi.INCHI_RET var18 = var13.getReturnStatus();
    net.sf.jniinchi.JniInchiInput var19 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var21 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var13, "ODD");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test94");


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
    double var91 = var18.getZ();
    var18.setImplicitDeuterium(3);
    
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
    assertTrue(var91 == 100.0d);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test95");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(1, "", "", "hi!", "hi!");
    java.lang.String var6 = var5.getInchi();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var7.equals("InChI_Output: WARNING///hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "InChI_Output: WARNING///hi!/hi!"+ "'", var8.equals("InChI_Output: WARNING///hi!/hi!"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test96");


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
    net.sf.jniinchi.JniInchiAtom var80 = var75.getOriginAtom();
    var80.setCharge(10000);
    
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

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test97");


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
    net.sf.jniinchi.JniInchiAtom var48 = var46.getCentralAtom();
    java.lang.String var49 = var46.getDebugString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var49.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test98");


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
    net.sf.jniinchi.JniInchiAtom var36 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var37 = var36.getCharge();
    var36.setImplicitTritium(10);
    double var40 = var36.getX();
    java.lang.String var41 = var36.getElementType();
    var36.setCharge(10);
    net.sf.jniinchi.JniInchiOutputStructure var51 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var52 = var51.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var53 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var51);
    net.sf.jniinchi.JniInchiBond[] var54 = new net.sf.jniinchi.JniInchiBond[] { };
    var53.addBonds(var54);
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var61 = var60.getCharge();
    var60.setImplicitTritium(10);
    double var64 = var60.getX();
    var60.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var67 = var53.addAtom(var60);
    net.sf.jniinchi.INCHI_BOND_TYPE var69 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var70 = var69.ordinal();
    net.sf.jniinchi.JniInchiAtom var75 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var76 = var75.getCharge();
    var75.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var83 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var84 = var83.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var86 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var87 = var86.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var89 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var90 = new net.sf.jniinchi.JniInchiBond(var75, var83, var86, var89);
    net.sf.jniinchi.INCHI_BOND_STEREO var91 = var90.getBondStereo();
    net.sf.jniinchi.JniInchiBond var92 = new net.sf.jniinchi.JniInchiBond(var36, var60, var69, var91);
    var31.setStereoDefinition(var91);
    int var94 = var91.getIndx();
    java.lang.String var95 = var91.name();
    
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
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "SINGLE_1UP"+ "'", var95.equals("SINGLE_1UP"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test99");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var1.setCharge(0);
    var1.setIsotopicMassShift(0);
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var11 = var10.getCharge();
    var10.setImplicitTritium(10);
    var10.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var16 = var10.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var17 = var10.getRadical();
    java.lang.String var18 = var10.getDebugString();
    net.sf.jniinchi.JniInchiOutputStructure var26 = new net.sf.jniinchi.JniInchiOutputStructure(100, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", 10L, (-1L), (-1L), 1L);
    int var27 = var26.getNumAtoms();
    int var28 = var26.getNumStereo0D();
    net.sf.jniinchi.JniInchiAtom var33 = new net.sf.jniinchi.JniInchiAtom(10.0d, 10.0d, 100.0d, "hi!");
    net.sf.jniinchi.JniInchiAtom var34 = var26.addAtom(var33);
    net.sf.jniinchi.JniInchiAtom var39 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var40 = var39.getCharge();
    var39.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var47 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var48 = var47.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var50 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var51 = var50.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var53 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var54 = new net.sf.jniinchi.JniInchiBond(var39, var47, var50, var53);
    net.sf.jniinchi.INCHI_BOND_STEREO var55 = var54.getBondStereo();
    net.sf.jniinchi.JniInchiAtom var56 = var54.getTargetAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var58 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    var54.setStereoDefinition(var58);
    net.sf.jniinchi.JniInchiBond var60 = var26.addBond(var54);
    net.sf.jniinchi.INCHI_BOND_TYPE var61 = var54.getBondType();
    int var62 = var61.getIndx();
    net.sf.jniinchi.JniInchiBond var63 = new net.sf.jniinchi.JniInchiBond(var1, var10, var61);
    int var64 = var10.getCharge();
    var10.setImplicitTritium((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"+ "'", var18.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test100");


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
    int var51 = var1.getIndx();
    net.sf.jniinchi.JniInchiOutputKey var53 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    java.lang.String var54 = var53.getKey();
    net.sf.jniinchi.INCHI_KEY var55 = var53.getReturnStatus();
    java.lang.Class var56 = var55.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var58 = java.lang.Enum.<java.lang.Enum>valueOf(var56, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"+ "'", var54.equals("InChI Atom: InChI_Output: WARNING///hi!/hi! [100.0,10.0,1.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test101");


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
    double var91 = var18.getX();
    int var92 = var18.getImplicitTritium();
    
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
    assertTrue(var91 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test102");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 100.0d, 10.0d, "InChI_Output: WARNING/SINGLE_2UP/OK/InChI_Output: WARNING///hi!/hi!/InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    var4.setImplicitH((-1));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test103");


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
    net.sf.jniinchi.JniInchiInputData var98 = new net.sf.jniinchi.JniInchiInputData(0, var11, (-1), "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:100 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    java.lang.String var99 = var11.getOptions();
    
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
    assertTrue("'" + var99 + "' != '" + ""+ "'", var99.equals(""));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test104");


    net.sf.jniinchi.JniInchiInputInchi var1 = new net.sf.jniinchi.JniInchiInputInchi("InChI_Output: EOF/OK/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1 D:0 T:0 // Radical: NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test105");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.INCHI_RET var9 = var7.getReturnStatus();
    net.sf.jniinchi.JniInchiStructure var10 = net.sf.jniinchi.Main.getTestMolecule();
    var7.setStructure(var10);
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
    net.sf.jniinchi.JniInchiAtom[] var51 = var46.getNeighbors();
    net.sf.jniinchi.INCHI_PARITY var52 = var46.getParity();
    net.sf.jniinchi.INCHI_PARITY var53 = var46.getParity();
    net.sf.jniinchi.JniInchiStereo0D var54 = var7.addStereo0D(var46);
    var46.debug();
    var46.debug();
    net.sf.jniinchi.JniInchiAtom[] var57 = var46.getNeighbors();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test106");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test107");


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
    net.sf.jniinchi.JniInchiAtom[] var91 = var90.getNeighbors();
    net.sf.jniinchi.JniInchiAtom var92 = var90.getCentralAtom();
    var92.setIsotopicMass(10001);
    
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
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI_Output: OKAY/INVALID_PREFIX/InChI_Output: WARNING/InChI_Output: EOF/net.sf.jniinchi.JniInchiException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/SINGLE_1UP/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/InChI_Output: EOF/OK/InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1 D:0 T:0 // Radical: NONE/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test109");


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
    int var65 = var62.getIndx();
    
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
    assertTrue(var65 == 1);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test110");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    net.sf.jniinchi.INCHI_RET var6 = var5.getReturnStatus();
    java.lang.String var7 = var5.getInchi();
    java.lang.String var8 = var5.getInchi();
    java.lang.String var9 = var5.getLog();
    java.lang.String var10 = var5.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test111");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.valueOf("NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test112");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(4, "ODD", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10001 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE");
    java.lang.String var6 = var5.getInchi();
    java.lang.String var7 = var5.getLog();
    java.lang.String var8 = var5.getInchi();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ODD"+ "'", var6.equals("ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE"+ "'", var7.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:1 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "ODD"+ "'", var8.equals("ODD"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test113");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getIsotopicMass();
    int var12 = var4.getImplicitDeuterium();
    java.lang.String var13 = var4.getDebugString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"+ "'", var13.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test114");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    var4.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var10 = var4.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var11 = var4.getRadical();
    var4.setImplicitH(0);
    var4.setIsotopicMassShift(0);
    net.sf.jniinchi.JniInchiAtom var20 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var21 = var20.getCharge();
    var20.setImplicitTritium(10);
    double var24 = var20.getX();
    int var25 = var20.getImplicitH();
    java.lang.String var26 = var20.getElementType();
    int var27 = var20.getImplicitProtium();
    int var28 = var20.getImplicitTritium();
    net.sf.jniinchi.INCHI_BOND_TYPE var30 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var31 = var30.getDeclaringClass();
    int var32 = var30.getIndx();
    int var33 = var30.getIndx();
    net.sf.jniinchi.JniInchiBond var34 = new net.sf.jniinchi.JniInchiBond(var4, var20, var30);
    java.lang.String var35 = var4.getDebugString();
    int var36 = var4.getImplicitH();
    var4.setImplicitDeuterium(10100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10000 // Implicit H:0 P:0 D:0 T:1 // Radical: NONE"+ "'", var35.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10000 // Implicit H:0 P:0 D:0 T:1 // Radical: NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test115");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: EOF/InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/OK/InChI Atom: hi! [100.0,100.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE/net.sf.jniinchi.JniInchiException: OK");

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test116");


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
    net.sf.jniinchi.JniInchiAtom var32 = var30.getOriginAtom();
    net.sf.jniinchi.INCHI_BOND_STEREO var33 = var30.getBondStereo();
    java.lang.String var34 = var33.name();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "SINGLE_1UP"+ "'", var34.equals("SINGLE_1UP"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_STEREOTYPE var1 = net.sf.jniinchi.INCHI_STEREOTYPE.valueOf("net.sf.jniinchi.JniInchiException");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInput var1 = new net.sf.jniinchi.JniInchiInput("InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:-1 T:0 // Radical: NONE");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test119");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitTritium(10);
    double var8 = var4.getX();
    var4.setCharge(1);
    int var11 = var4.getImplicitProtium();
    double var12 = var4.getX();
    java.lang.String var13 = var4.getDebugString();
    var4.setIsotopicMassShift(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"+ "'", var13.equals("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test120");


    net.sf.jniinchi.INCHI_KEY var1 = net.sf.jniinchi.INCHI_KEY.getValue(0);
    net.sf.jniinchi.JniInchiOutputKey var3 = new net.sf.jniinchi.JniInchiOutputKey(var1, "InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var1, "hi!");
    net.sf.jniinchi.INCHI_KEY var6 = var5.getReturnStatus();
    int var7 = var6.getIndx();
    java.lang.String var8 = var6.name();
    net.sf.jniinchi.JniInchiOutputKey var10 = new net.sf.jniinchi.JniInchiOutputKey(var6, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "OK"+ "'", var8.equals("OK"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test121");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(1, "InChI Bond: hi!-hi! // Type: NONE // Stereo: NONE");
    net.sf.jniinchi.INCHI_KEY var3 = var2.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var5 = new net.sf.jniinchi.JniInchiOutputKey(var3, "InChI_Output: EOF/SINGLE_1UP/net.sf.jniinchi.LoadNativeLibraryException: /hi!/net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.JniInchiOutputKey var7 = new net.sf.jniinchi.JniInchiOutputKey(var3, "NONE");
    net.sf.jniinchi.INCHI_KEY var8 = var7.getReturnStatus();
    net.sf.jniinchi.INCHI_KEY var9 = var7.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputKey var11 = new net.sf.jniinchi.JniInchiOutputKey(var9, "INVALID_VERSION");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test122");


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
    net.sf.jniinchi.JniInchiAtom[] var40 = var35.getNeighbors();
    var35.debug();
    
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test123");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var9 = var8.getNumAtoms();
    int var10 = var8.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var11 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiInputData var14 = new net.sf.jniinchi.JniInchiInputData(9999, var11, 1, "net.sf.jniinchi.LoadNativeLibraryException: OK");
    net.sf.jniinchi.JniInchiInput var15 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var11);
    java.lang.String var16 = var15.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test124");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var5 = var4.getCharge();
    var4.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var12 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var13 = var12.getCharge();
    int var14 = var12.getIsotopicMass();
    int var15 = var12.getImplicitH();
    net.sf.jniinchi.INCHI_BOND_TYPE var17 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var18 = var17.getIndx();
    int var19 = var17.ordinal();
    java.lang.Class var20 = var17.getDeclaringClass();
    java.lang.Class var21 = var17.getDeclaringClass();
    java.lang.String var22 = var17.toString();
    int var23 = var17.ordinal();
    net.sf.jniinchi.JniInchiAtom var28 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var29 = var28.getCharge();
    var28.setImplicitTritium(10);
    double var32 = var28.getX();
    var28.setCharge(1);
    var28.setImplicitDeuterium(100);
    int var37 = var28.getImplicitProtium();
    net.sf.jniinchi.JniInchiAtom var42 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var43 = var42.getCharge();
    var42.setImplicitTritium(10);
    double var46 = var42.getX();
    var42.setCharge(1);
    var42.setImplicitDeuterium(100);
    int var51 = var42.getImplicitProtium();
    net.sf.jniinchi.INCHI_BOND_TYPE var53 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var54 = var53.ordinal();
    net.sf.jniinchi.JniInchiOutputStructure var62 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var63 = var62.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var64 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var62);
    net.sf.jniinchi.JniInchiAtom[] var65 = new net.sf.jniinchi.JniInchiAtom[] { };
    var64.addAtoms(var65);
    boolean var67 = var53.equals((java.lang.Object)var65);
    net.sf.jniinchi.JniInchiBond var68 = new net.sf.jniinchi.JniInchiBond(var28, var42, var53);
    net.sf.jniinchi.JniInchiAtom var70 = new net.sf.jniinchi.JniInchiAtom("net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!");
    net.sf.jniinchi.INCHI_BOND_TYPE var72 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var73 = var72.ordinal();
    net.sf.jniinchi.INCHI_BOND_STEREO var75 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var76 = new net.sf.jniinchi.JniInchiBond(var42, var70, var72, var75);
    java.lang.Class var77 = var75.getDeclaringClass();
    int var78 = var75.getIndx();
    net.sf.jniinchi.JniInchiBond var79 = new net.sf.jniinchi.JniInchiBond(var4, var12, var17, var75);
    java.lang.String var80 = var75.name();
    int var81 = var75.getIndx();
    int var82 = var75.getIndx();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "NONE"+ "'", var22.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "SINGLE_1UP"+ "'", var80.equals("SINGLE_1UP"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 1);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test125");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE");
    var1.setCharge(0);
    var1.setImplicitProtium(100);
    net.sf.jniinchi.JniInchiAtom var10 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var11 = var10.getCharge();
    var10.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_RADICAL var14 = var10.getRadical();
    int var15 = var14.getIndx();
    var1.setRadical(var14);
    int var17 = var1.getCharge();
    var1.setImplicitH(10000);
    net.sf.jniinchi.JniInchiAtom var24 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var25 = var24.getCharge();
    var24.setImplicitTritium(10);
    var24.setImplicitTritium(1);
    net.sf.jniinchi.INCHI_RADICAL var30 = var24.getRadical();
    net.sf.jniinchi.INCHI_RADICAL var31 = var24.getRadical();
    var24.setImplicitDeuterium(10);
    var24.setIsotopicMassShift(100);
    net.sf.jniinchi.INCHI_BOND_TYPE var37 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    int var38 = var37.getIndx();
    java.lang.String var39 = var37.toString();
    java.lang.String var40 = var37.toString();
    net.sf.jniinchi.JniInchiBond var41 = new net.sf.jniinchi.JniInchiBond(var1, var24, var37);
    java.lang.String var42 = var37.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "NONE"+ "'", var39.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "NONE"+ "'", var40.equals("NONE"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "NONE"+ "'", var42.equals("NONE"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test126");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(2, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test127");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput((-1), "hi!", "", "", "");
    java.lang.String var6 = var5.getAuxInfo();
    net.sf.jniinchi.INCHI_RET var7 = var5.getReturnStatus();
    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(var7);
    java.lang.String var9 = var8.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test128");


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
    net.sf.jniinchi.INCHI_STEREOTYPE var96 = var95.getStereoType();
    net.sf.jniinchi.INCHI_STEREOTYPE var97 = var95.getStereoType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiInputInchi var2 = new net.sf.jniinchi.JniInchiInputInchi("InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "net.sf.jniinchi.JniInchiException: InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/");
      fail("Expected exception of type net.sf.jniinchi.JniInchiException");
    } catch (net.sf.jniinchi.JniInchiException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test130");


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
    net.sf.jniinchi.JniInchiAtom var54 = var45.getCentralAtom();
    net.sf.jniinchi.INCHI_PARITY var55 = var45.getParity();
    net.sf.jniinchi.JniInchiAtom[] var56 = var45.getNeighbors();
    
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
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test131");


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
    net.sf.jniinchi.JniInchiStereo0D var63 = var7.getStereo0D(0);
    net.sf.jniinchi.JniInchiStructure var64 = new net.sf.jniinchi.JniInchiStructure();
    net.sf.jniinchi.JniInchiOutputStructure var72 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var73 = var72.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var74 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var72);
    net.sf.jniinchi.JniInchiAtom[] var75 = new net.sf.jniinchi.JniInchiAtom[] { };
    var74.addAtoms(var75);
    var64.addAtoms(var75);
    var7.addAtoms(var75);
    int var79 = var7.getNumStereo0D();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test132");


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
    net.sf.jniinchi.JniInchiAtom var48 = var45.getCentralAtom();
    net.sf.jniinchi.INCHI_STEREOTYPE var49 = var45.getStereoType();
    net.sf.jniinchi.JniInchiOutputStructure var57 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var58 = var57.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var59 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var57);
    java.lang.String var60 = var57.getLog();
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
    net.sf.jniinchi.JniInchiStereo0D var96 = var57.addStereo0D(var95);
    net.sf.jniinchi.INCHI_PARITY var97 = var95.getDisconnectedParity();
    boolean var98 = var49.equals((java.lang.Object)var97);
    
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
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
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
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test133");


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
    net.sf.jniinchi.INCHI_BOND_STEREO var46 = var44.getBondStereo();
    net.sf.jniinchi.INCHI_BOND_STEREO var47 = var44.getBondStereo();
    var44.debug();
    net.sf.jniinchi.JniInchiAtom var49 = var44.getOriginAtom();
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test134");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_RADICAL var1 = net.sf.jniinchi.INCHI_RADICAL.valueOf("InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test135");


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
    java.lang.String var49 = var46.getDebugString();
    net.sf.jniinchi.INCHI_STEREOTYPE var50 = var46.getStereoType();
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"+ "'", var49.equals("InChI Stereo0D: - [InChI_Output: WARNING///hi!/hi!,,hi!,hi!] Type::DOUBLEBOND // Parity:ODD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.INCHI_KEY_STATUS var1 = net.sf.jniinchi.INCHI_KEY_STATUS.valueOf("InChI Atom: InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:100 T:0 // Radical: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:100 D:0 T:0 // Radical: NONE");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test137");


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
      java.lang.Enum var70 = java.lang.Enum.<java.lang.Enum>valueOf(var68, "InChI_Output: EOF/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE/InChI_Output: null/InChI_Output: WARNING///hi!/hi!/InChI_Output: WARNING///hi!/hi!//hi!/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
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

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test138");


    net.sf.jniinchi.JniInchiOutputStructure var10 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var11 = var10.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var12 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var10);
    net.sf.jniinchi.JniInchiBond[] var13 = new net.sf.jniinchi.JniInchiBond[] { };
    var12.addBonds(var13);
    net.sf.jniinchi.JniInchiAtom var19 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var20 = var19.getCharge();
    var19.setImplicitTritium(10);
    double var23 = var19.getX();
    var19.setCharge(1);
    net.sf.jniinchi.JniInchiAtom var26 = var12.addAtom(var19);
    net.sf.jniinchi.JniInchiInputData var29 = new net.sf.jniinchi.JniInchiInputData(1, var12, 100, "InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP");
    net.sf.jniinchi.JniInchiInput var30 = var29.getInput();
    net.sf.jniinchi.JniInchiOutputStructure var38 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var39 = var38.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var40 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var38);
    java.lang.String var41 = var40.getOptions();
    net.sf.jniinchi.JniInchiInput var42 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var40);
    net.sf.jniinchi.JniInchiOutputStructure var50 = new net.sf.jniinchi.JniInchiOutputStructure(100, "", "hi!", 100L, (-1L), (-1L), 10L);
    int var51 = var50.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var52 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var50);
    long[][] var53 = var50.getWarningFlags();
    net.sf.jniinchi.JniInchiAtom var58 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var59 = var58.getCharge();
    var58.setImplicitProtium(1);
    net.sf.jniinchi.JniInchiAtom var66 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var67 = var66.getCharge();
    net.sf.jniinchi.INCHI_BOND_TYPE var69 = net.sf.jniinchi.INCHI_BOND_TYPE.getValue(0);
    java.lang.Class var70 = var69.getDeclaringClass();
    net.sf.jniinchi.INCHI_BOND_STEREO var72 = net.sf.jniinchi.INCHI_BOND_STEREO.getValue(1);
    net.sf.jniinchi.JniInchiBond var73 = new net.sf.jniinchi.JniInchiBond(var58, var66, var69, var72);
    net.sf.jniinchi.JniInchiBond var74 = var50.addBond(var73);
    net.sf.jniinchi.JniInchiBond[] var75 = new net.sf.jniinchi.JniInchiBond[] { var74};
    var40.addBonds(var75);
    var30.addBonds(var75);
    net.sf.jniinchi.JniInchiInput var78 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var30);
    net.sf.jniinchi.JniInchiInputData var81 = new net.sf.jniinchi.JniInchiInputData(10001, var78, 0, "InChI Stereo0D: - [,hi!,hi!,NONE] Type::DOUBLEBOND // Parity:NONE");
    net.sf.jniinchi.JniInchiInputData var84 = new net.sf.jniinchi.JniInchiInputData(10100, var78, 3, "InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!");
    net.sf.jniinchi.INCHI_RET var85 = var84.getReturnValue();
    java.lang.String var86 = var84.getErrorMessage();
    java.lang.String var87 = var84.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
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
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!"+ "'", var86.equals("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!"+ "'", var87.equals("InChI_Output: EOF/OK//InChI_Output: WARNING///hi!/hi!/hi!"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test139");


    net.sf.jniinchi.JniInchiOutputKey var2 = new net.sf.jniinchi.JniInchiOutputKey(3, "SINGLE_2UP");

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test140");


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
    net.sf.jniinchi.INCHI_RET var28 = var27.getReturnValue();
    net.sf.jniinchi.JniInchiInput var29 = var27.getInput();
    net.sf.jniinchi.INCHI_RET var30 = var27.getReturnValue();
    net.sf.jniinchi.INCHI_RET var31 = var27.getReturnValue();
    int var32 = var31.getIndx();
    net.sf.jniinchi.JniInchiOutput var37 = new net.sf.jniinchi.JniInchiOutput(var31, "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.LoadNativeLibraryException: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!", "InChI Atom: net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test141");


    net.sf.jniinchi.JniInchiOutput var5 = new net.sf.jniinchi.JniInchiOutput(3, "InChI Atom: InChI_Output: WARNING///hi!/hi! [-1.0,1.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", "net.sf.jniinchi.LoadNativeLibraryException: InChI Atom: hi! [1.0,10.0,100.0] Charge:10 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE", "INVALID_LAYOUT", "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test142");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(3, "InChI_Output: EOF/net.sf.jniinchi.JniInchiException: InChI_Output: WARNING///hi!/hi!/InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:10 // Radical: NONE/hi!/", "SINGLE_2UP", 10L, 1L, (-1L), (-1L));
    int var8 = var7.getNumAtoms();
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test143");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(0, "InChI Atom: hi! [1.0,10.0,100.0] Charge:1 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:-1 // Radical: NONE", "InChI Atom: hi! [1.0,10.0,100.0] Charge:10001 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:1 // Radical: NONE", 100L, 100L, 0L, 1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiStereo0D var9 = var7.getStereo0D(9999);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test144");


    net.sf.jniinchi.JniInchiAtom var1 = new net.sf.jniinchi.JniInchiAtom("hi!");
    var1.setCharge(0);
    int var4 = var1.getImplicitDeuterium();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test145");


    net.sf.jniinchi.JniInchiOutputStructure var7 = new net.sf.jniinchi.JniInchiOutputStructure(3, "net.sf.jniinchi.LoadNativeLibraryException: OK", "InChI Atom: hi! [1.0,10.0,100.0] Charge:0 // Iso Mass:10000 // Implicit H:0 P:0 D:0 T:1 // Radical: NONE", 1L, 100L, 10L, 1L);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test146");


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
    net.sf.jniinchi.JniInchiAtom var49 = new net.sf.jniinchi.JniInchiAtom(100.0d, 10.0d, 1.0d, "InChI_Output: WARNING///hi!/hi!");
    var49.setImplicitProtium(1);
    int var52 = var49.getImplicitDeuterium();
    int var53 = var49.getImplicitH();
    net.sf.jniinchi.JniInchiAtom var55 = new net.sf.jniinchi.JniInchiAtom("");
    net.sf.jniinchi.JniInchiAtom var60 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var61 = var60.getCharge();
    var60.setImplicitTritium(10);
    double var64 = var60.getX();
    var60.setCharge(1);
    int var67 = var60.getIsotopicMass();
    int var68 = var60.getCharge();
    net.sf.jniinchi.JniInchiAtom var73 = new net.sf.jniinchi.JniInchiAtom(1.0d, 10.0d, 100.0d, "hi!");
    int var74 = var73.getCharge();
    var73.setImplicitProtium(1);
    net.sf.jniinchi.INCHI_PARITY var78 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    net.sf.jniinchi.JniInchiStereo0D var79 = net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(var49, var55, var60, var73, var78);
    net.sf.jniinchi.INCHI_PARITY var81 = net.sf.jniinchi.INCHI_PARITY.getValue(1);
    var79.setDisconnectedParity(var81);
    net.sf.jniinchi.INCHI_PARITY var83 = var79.getParity();
    net.sf.jniinchi.JniInchiAtom[] var84 = var79.getNeighbors();
    net.sf.jniinchi.JniInchiAtom var85 = var79.getCentralAtom();
    net.sf.jniinchi.INCHI_PARITY var86 = var79.getParity();
    net.sf.jniinchi.JniInchiAtom var88 = var79.getNeighbor(1);
    net.sf.jniinchi.JniInchiAtom[] var89 = var79.getNeighbors();
    net.sf.jniinchi.JniInchiStereo0D var90 = var7.addStereo0D(var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var92 = var7.getBond(10010);
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
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test147");


    net.sf.jniinchi.JniInchiOutputStructure var8 = new net.sf.jniinchi.JniInchiOutputStructure(2, "net.sf.jniinchi.JniInchiException: InChI Bond: hi!-hi! // Type: NONE // Stereo: SINGLE_1UP", "net.sf.jniinchi.LoadNativeLibraryException: OK", 10L, 10L, (-1L), (-1L));
    net.sf.jniinchi.JniInchiInput var9 = new net.sf.jniinchi.JniInchiInput((net.sf.jniinchi.JniInchiStructure)var8);
    net.sf.jniinchi.JniInchiInputData var12 = new net.sf.jniinchi.JniInchiInputData(10, var9, 100, "InChI Atom: hi! [10.0,10.0,100.0] Charge:0 // Iso Mass:10010 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sf.jniinchi.JniInchiBond var14 = var9.getBond(5);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test148");


    net.sf.jniinchi.JniInchiAtom var4 = new net.sf.jniinchi.JniInchiAtom(100.0d, 1.0d, (-1.0d), "InChI Atom: hi! [0.0,0.0,0.0] Charge:0 // Iso Mass:10000 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE");
    int var5 = var4.getImplicitProtium();
    double var6 = var4.getZ();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1.0d));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest10.test149");


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
    net.sf.jniinchi.INCHI_BOND_TYPE var53 = var48.getBondType();
    net.sf.jniinchi.INCHI_BOND_TYPE var54 = var48.getBondType();
    net.sf.jniinchi.INCHI_BOND_TYPE var55 = var48.getBondType();
    
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
    assertNotNull(var55);

  }

}
