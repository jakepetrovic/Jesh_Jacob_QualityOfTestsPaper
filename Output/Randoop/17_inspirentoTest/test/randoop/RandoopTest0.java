package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    java.lang.String[] var2 = com.allenstudio.ir.util.InspirentoUtilities.tokenize("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var3 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    boolean var4 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var4 = var0.getFocusTraversalKeys((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var12 = var7.getElement((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.allenstudio.ir.ui.UIResources.getString("hi!");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var13 = var7.removeElement(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.areFocusTraversalKeysSet(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    var0.setAlignmentX(1.0f);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.ComponentOrientation var4 = var0.getComponentOrientation();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var6 = var5.getRootPane();
    java.awt.Point var7 = var5.location();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var9 = var0.add((java.awt.Component)var5, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    javax.swing.TransferHandler var2 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    var7.enable();
    boolean var9 = var7.isFocusOwner();
    var7.firePropertyChange("hi!", 10L, 0L);
    var7.layout();
    var7.removeAll();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    java.awt.Component var19 = var7.getComponentAt(var18);
    java.awt.Component var20 = var0.getComponentAt(var18);
    java.awt.Component var23 = var0.getComponentAt(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    javax.swing.JToolTip var3 = var2.createToolTip();
    java.awt.dnd.DropTarget var4 = var3.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    var0.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    java.lang.String var3 = var0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Title"+ "'", var3.equals("Title"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    java.awt.Component var6 = var3.getComponentAtIndex(10);
    java.lang.Object var7 = var0.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var8 = var0.getMaximumSize();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var4 = var0.getElement("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var6 = var4.removeElement(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    boolean var9 = var0.isFocusCycleRoot();
    boolean var10 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    com.allenstudio.ir.ui.calendar.DateChooser var0 = new com.allenstudio.ir.ui.calendar.DateChooser();
    com.allenstudio.ir.core.plugins.CommonNote var1 = new com.allenstudio.ir.core.plugins.CommonNote();
    var1.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var5 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var1);
    com.allenstudio.ir.ui.Toolbar var6 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var7 = var6.getColorModel();
    var6.setEnabled(true);
    java.awt.Component var11 = var6.getComponentAtIndex(1);
    boolean var12 = var6.isValidateRoot();
    var6.addSeparator();
    java.awt.event.FocusListener[] var14 = var6.getFocusListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var1, (java.lang.Object)var14);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    boolean var3 = var0.isPaintingTile();
    java.awt.dnd.DropTarget var4 = var0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    java.awt.Component var7 = var0.getComponentAtIndex(1);
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var10 = var9.getColorModel();
    var9.setEnabled(true);
    java.awt.Component var14 = var9.getComponentAtIndex(1);
    boolean var15 = var9.isFloatable();
    javax.swing.InputMap var16 = var9.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputMap(100, var16);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    java.awt.Component var6 = var3.getComponentAtIndex(10);
    java.lang.Object var7 = var0.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var8 = var0.getMaximumSize();
    javax.swing.TransferHandler var9 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    int var4 = var0.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    boolean var2 = var0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var4 = var0.getElement("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var6 = var4.removeElement((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    var0.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var16 = var14.getElement(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.awt.Dimension var1 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    var0.revalidate();
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    boolean var7 = var6.isBackgroundSet();
    boolean var10 = var6.contains(10, 100);
    var6.revalidate();
    javax.swing.JToolTip var12 = var6.createToolTip();
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var14 = var13.getRootPane();
    java.awt.Point var15 = var13.location();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.Toolbar var19 = new com.allenstudio.ir.ui.Toolbar();
    boolean var20 = var19.isFloatable();
    java.awt.Component var22 = var19.getComponentAtIndex(10);
    java.lang.Object var23 = var16.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var24 = var16.getMaximumSize();
    var13.setMinimumSize(var24);
    java.awt.Rectangle var26 = var13.getBounds();
    var6.scrollRectToVisible(var26);
    var0.setBounds(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    java.awt.Component var9 = var0.getComponentAtIndex(100);
    java.awt.event.ContainerListener[] var10 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.allenstudio.ir.ui.UIResources.getString("Date Picker");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    java.awt.Component var12 = var0.findComponentAt(1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    java.lang.String var7 = var0.toString();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var9 = var8.getMouseWheelListeners();
    java.awt.event.MouseListener[] var10 = var8.getMouseListeners();
    var8.firePropertyChange("", false, true);
    var0.add((java.awt.Component)var8, (java.lang.Object)10.0f);
    java.awt.event.HierarchyBoundsListener[] var17 = var0.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setMarked((-1), true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponent(0);
    java.awt.LayoutManager var5 = var0.getLayout();
    var0.setEnabled(false);
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getUIClassID();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    var3.setAutoscrolls(true);
    java.awt.event.MouseWheelListener[] var7 = var3.getMouseWheelListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var8 = var0.add("C:\\boot.ini", (java.awt.Component)var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "PanelUI"+ "'", var1.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var7 = var5.getElement((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    java.awt.event.MouseMotionListener[] var5 = var2.getMouseMotionListeners();
    var2.move(100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    boolean var3 = var0.isManagingFocus();
    java.awt.Rectangle var4 = var0.bounds();
    var0.firePropertyChange("Date Picker", 0L, (-1L));
    var0.removeAll();
    var0.setBounds(0, 0, (-1), 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    boolean var5 = var2.hasChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    boolean var2 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setMarked(0, false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    boolean var4 = var0.requestFocus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    java.lang.String[] var2 = com.allenstudio.ir.util.InspirentoUtilities.tokenize("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var10 = var5.removeElement(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    java.awt.Graphics var4 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    com.allenstudio.ir.util.InspirentoUtilities var0 = new com.allenstudio.ir.util.InspirentoUtilities();
    com.allenstudio.ir.event.NoteListDataEvent var2 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var0, 1);
    int var3 = var2.getType();
    int var4 = var2.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.show();
    boolean var3 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    javax.swing.JToolTip var3 = var2.createToolTip();
    boolean var4 = var3.isFocusable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var6 = var5.getRootPane();
    java.awt.Point var7 = var5.location();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    boolean var9 = var8.isFloatable();
    java.awt.Component var11 = var8.getComponentAtIndex(10);
    java.lang.Object var12 = var5.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var13 = var5.getMaximumSize();
    var3.resize(var13);
    int var15 = var3.getY();
    var3.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setMarked(0, true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    int var13 = var2.getBaseline(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    boolean var11 = var2.requestFocusInWindow();
    var2.setDoubleBuffered(true);
    boolean var14 = var2.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    java.awt.GraphicsConfiguration var9 = var0.getGraphicsConfiguration();
    java.awt.Toolkit var10 = var0.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.setName("Date Picker");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var5 = var0.getFocusTraversalKeys((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    java.awt.Component var3 = var0.getComponentAtIndex(10);
    boolean var4 = var0.isLightweight();
    var0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var30 = var0.getBackgroundAt(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    boolean var3 = var2.isBackgroundSet();
    boolean var6 = var2.contains(10, 100);
    var2.revalidate();
    javax.swing.JToolTip var8 = var2.createToolTip();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var10 = var9.getRootPane();
    java.awt.Point var11 = var9.location();
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var13 = var12.getRootPane();
    java.awt.Point var14 = var12.location();
    com.allenstudio.ir.ui.Toolbar var15 = new com.allenstudio.ir.ui.Toolbar();
    boolean var16 = var15.isFloatable();
    java.awt.Component var18 = var15.getComponentAtIndex(10);
    java.lang.Object var19 = var12.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var20 = var12.getMaximumSize();
    var9.setMinimumSize(var20);
    java.awt.Rectangle var22 = var9.getBounds();
    var2.scrollRectToVisible(var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var22);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var28 = var0.getTabComponentAt(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.StatusBar var28 = new com.allenstudio.ir.ui.StatusBar();
    int var29 = var28.getY();
    javax.swing.JToolTip var30 = var28.createToolTip();
    float var31 = var30.getAlignmentY();
    java.awt.Color var32 = var30.getForeground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setForegroundAt(100, var32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTitleAt((-1), "Title");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    var0.setFloatable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    javax.swing.JToolTip var4 = var3.createToolTip();
    boolean var5 = var4.isFocusable();
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var7 = var6.getRootPane();
    java.awt.Point var8 = var6.location();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    boolean var10 = var9.isFloatable();
    java.awt.Component var12 = var9.getComponentAtIndex(10);
    java.lang.Object var13 = var6.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var14 = var6.getMaximumSize();
    var4.resize(var14);
    int var16 = var4.getY();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var18 = new com.allenstudio.ir.core.plugins.CommonNote();
    var18.setFocusTraversalPolicyProvider(false);
    var17.remove((java.awt.Component)var18);
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    int var23 = var22.getY();
    javax.swing.JToolTip var24 = var22.createToolTip();
    java.awt.Insets var25 = var24.getInsets();
    java.awt.Insets var26 = var18.getInsets(var25);
    java.awt.Insets var27 = var4.getInsets(var26);
    var4.setFocusable(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Dimension var10 = var0.size();
    java.awt.Image var13 = var0.createImage((-1), (-1));
    java.awt.Component var16 = var0.locate(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var10 = var9.getRootPane();
    java.awt.Point var11 = var9.location();
    java.awt.Component var12 = var0.getComponentAt(var11);
    javax.swing.JPopupMenu var13 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var4 = var0.getFocusTraversalKeys(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    var0.setToolBar((javax.swing.JToolBar)var21);
    com.allenstudio.ir.ui.MainFrame var28 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var29 = var28.getWarningString();
    java.util.Locale var30 = var28.getLocale();
    com.allenstudio.ir.ui.calendar.DateChooser var31 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var31.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var35 = var31.getAncestorListeners();
    var28.setLocationRelativeTo((java.awt.Component)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var38 = var0.add((java.awt.Component)var28, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    java.lang.String[] var1 = com.allenstudio.ir.util.InspirentoUtilities.tokenize("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.disable();
    boolean var5 = var0.inside((-1), 100);
    boolean var6 = var0.isMaximumSizeSet();
    java.awt.dnd.DropTarget var7 = var0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    javax.swing.JToolTip var6 = var0.createToolTip();
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    boolean var3 = var0.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    javax.swing.KeyStroke[] var2 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    var3.show();
    java.awt.image.ColorModel var6 = var3.getColorModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var3, 4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    var0.resize(0, 1);
    java.awt.Rectangle var15 = var0.getBounds();
    java.awt.Point var16 = var0.location();
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    java.awt.Component var10 = var0.getComponentAt(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    boolean var11 = var2.requestFocusInWindow();
    javax.swing.ActionMap var12 = var2.getActionMap();
    boolean var13 = var2.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isValidateRoot();
    var0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    boolean var3 = var0.isManagingFocus();
    java.awt.Rectangle var4 = var0.bounds();
    var0.firePropertyChange("Date Picker", 0L, (-1L));
    var0.resize(10, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var5 = var2.getData();
    com.allenstudio.ir.util.XmlElement var7 = var2.getElement("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var9 = var2.getElement(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    var27.transferFocus();
    com.allenstudio.ir.ui.Toolbar var29 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var30 = var29.getColorModel();
    var29.setEnabled(true);
    java.awt.Component var34 = var29.getComponentAtIndex(1);
    boolean var35 = var29.isFloatable();
    var27.setContent((java.awt.Component)var29);
    java.awt.Color var37 = var29.getForeground();
    boolean var38 = var29.requestFocusInWindow();
    javax.swing.ActionMap var39 = var29.getActionMap();
    var29.repaint(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    com.allenstudio.ir.ui.DatePickerPane var31 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var32 = var31.getUIClassID();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentAt(10, (java.awt.Component)var31);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "PanelUI"+ "'", var32.equals("PanelUI"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    java.awt.Component var12 = var2.getComponentAtIndex(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    java.lang.String var17 = var5.getAttribute("Title", "ToolBarUI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var19 = var5.getElement(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "ToolBarUI"+ "'", var17.equals("ToolBarUI"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    char[] var2 = new char[] { 'a'};
    var0.ignorableWhitespace(var2, 0, (-1));
    com.allenstudio.ir.util.XmlIO var6 = new com.allenstudio.ir.util.XmlIO();
    var6.errorDialog("hi!");
    char[] var11 = new char[] { 'a', '4'};
    var6.ignorableWhitespace(var11, 100, 0);
    var0.ignorableWhitespace(var11, 10, 0);
    var0.processingInstruction("hi!", "PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    com.allenstudio.ir.util.XmlElement var15 = var14.getParent();
    com.allenstudio.ir.util.XmlIO var16 = new com.allenstudio.ir.util.XmlIO(var14);
    var16.processingInstruction("ToolBarUI", "com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    boolean var7 = var0.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement("");
    com.allenstudio.ir.util.XmlElement var2 = var1.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    int var4 = var3.getY();
    javax.swing.JToolTip var5 = var3.createToolTip();
    float var6 = var5.getAlignmentY();
    java.awt.Color var7 = var5.getForeground();
    var0.remove((java.awt.Component)var5);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    int var10 = var9.getY();
    boolean var11 = var9.isLightweight();
    java.awt.Dimension var12 = var9.getMaximumSize();
    java.awt.event.KeyListener[] var13 = var9.getKeyListeners();
    java.awt.ComponentOrientation var14 = var9.getComponentOrientation();
    var0.setComponentOrientation(var14);
    boolean var16 = var0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    var0.warningDialog("C:\\boot.ini");
    var0.notationDecl("C:\\boot.ini", "Date Picker", "hi!");
    var0.startDocument();

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    boolean var11 = var2.requestFocusInWindow();
    float var12 = var2.getAlignmentY();
    java.awt.Color var13 = var2.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Rectangle var30 = var0.getBoundsAt((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.Component var3 = var0.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    boolean var2 = var0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    var0.firePropertyChange("", false, true);
    boolean var7 = var0.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var28 = var0.getComponentAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    var0.removeAll();
    var0.firePropertyChange("", 0.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    boolean var30 = var0.isEnabledAt(0);
    com.allenstudio.ir.ui.StatusBar var32 = new com.allenstudio.ir.ui.StatusBar();
    var32.enable();
    boolean var34 = var32.isFocusOwner();
    var32.firePropertyChange("hi!", 10L, 0L);
    var32.layout();
    var32.removeAll();
    java.awt.GraphicsConfiguration var41 = var32.getGraphicsConfiguration();
    java.awt.Color var42 = var32.getBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentAt(32, (java.awt.Component)var32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    int var4 = var0.getWidth();
    com.allenstudio.ir.ui.MainFrame var5 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var6 = var5.getWarningString();
    java.lang.String var7 = var5.getWarningString();
    java.awt.Container var8 = var5.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var5.setMaximizedBounds(var29);
    var0.computeVisibleRect(var29);
    boolean var33 = var0.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCursor(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    java.lang.String var4 = var0.getOtherInfo();
    var0.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    java.lang.String[] var1 = com.allenstudio.ir.util.InspirentoUtilities.tokenize(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    int var1 = var0.getSelectedDate();
    boolean var3 = var0.isMarked(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    java.util.Locale var2 = var0.getLocale();
    var0.setUndecorated(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    int var4 = var3.getY();
    javax.swing.JToolTip var5 = var3.createToolTip();
    float var6 = var5.getAlignmentY();
    java.awt.Color var7 = var5.getForeground();
    var0.remove((java.awt.Component)var5);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    int var10 = var9.getY();
    boolean var11 = var9.isLightweight();
    java.awt.Dimension var12 = var9.getMaximumSize();
    java.awt.event.KeyListener[] var13 = var9.getKeyListeners();
    java.awt.ComponentOrientation var14 = var9.getComponentOrientation();
    var0.setComponentOrientation(var14);
    java.lang.String var16 = var0.getOtherInfoText();
    javax.swing.InputMap var17 = var0.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " "+ "'", var16.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    java.lang.String var1 = com.allenstudio.ir.util.InspirentoUtilities.escapeText("C:\\boot.ini");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "C:\\boot.ini"+ "'", var1.equals("C:\\boot.ini"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    java.util.Hashtable var6 = var5.getAttributes();
    int var7 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var11 = var0.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    com.allenstudio.ir.util.XmlElement var12 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var14 = var12.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var15 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var17 = var15.addSubElement("hi!");
    var17.notifyObservers((java.lang.Object)(byte)1);
    var12.append(var17);
    com.allenstudio.ir.util.XmlElement var21 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var23 = var21.addSubElement("hi!");
    java.lang.String var25 = var21.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var26 = var17.addSubElement(var21);
    com.allenstudio.ir.util.XmlElement var27 = var26.getParent();
    com.allenstudio.ir.util.XmlElement var30 = var26.addSubElement("ToolBarUI", "C:\\boot.ini");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.insertElement(var30, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    com.allenstudio.ir.util.XmlElement var15 = var14.getParent();
    com.allenstudio.ir.util.XmlIO var16 = new com.allenstudio.ir.util.XmlIO(var14);
    var16.endDocument();
    com.allenstudio.ir.util.XmlIO var18 = new com.allenstudio.ir.util.XmlIO();
    char[] var20 = new char[] { 'a'};
    var18.ignorableWhitespace(var20, 0, (-1));
    com.allenstudio.ir.util.XmlIO var24 = new com.allenstudio.ir.util.XmlIO();
    var24.errorDialog("hi!");
    char[] var29 = new char[] { 'a', '4'};
    var24.ignorableWhitespace(var29, 100, 0);
    var18.ignorableWhitespace(var29, 10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.characters(var29, 0, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    var2.repaint(10, (-1), 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    var0.setToolBar((javax.swing.JToolBar)var21);
    boolean var28 = var0.requestFocusInWindow();
    com.allenstudio.ir.ui.StatusBar var29 = new com.allenstudio.ir.ui.StatusBar();
    var29.enable();
    boolean var31 = var29.isFocusOwner();
    var29.firePropertyChange("hi!", 10L, 0L);
    com.allenstudio.ir.ui.StatusBar var36 = new com.allenstudio.ir.ui.StatusBar();
    var36.enable();
    boolean var38 = var36.isFocusOwner();
    var36.firePropertyChange("hi!", 10L, 0L);
    var36.layout();
    var36.removeAll();
    com.allenstudio.ir.ui.StatusBar var45 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var46 = var45.getRootPane();
    java.awt.Point var47 = var45.location();
    java.awt.Component var48 = var36.getComponentAt(var47);
    java.awt.Component var49 = var29.getComponentAt(var47);
    java.awt.Point var50 = var0.getLocation(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(10);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    var2.enable();
    boolean var4 = var2.isFocusOwner();
    var2.firePropertyChange("hi!", 10L, 0L);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    var9.enable();
    boolean var11 = var9.isFocusOwner();
    var9.firePropertyChange("hi!", 10L, 0L);
    var9.layout();
    var9.removeAll();
    com.allenstudio.ir.ui.StatusBar var18 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var19 = var18.getRootPane();
    java.awt.Point var20 = var18.location();
    java.awt.Component var21 = var9.getComponentAt(var20);
    java.awt.Component var22 = var2.getComponentAt(var20);
    var0.setLocation(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCursor(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    javax.swing.JToolTip var3 = var2.createToolTip();
    boolean var4 = var3.isFocusable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var6 = var5.getRootPane();
    java.awt.Point var7 = var5.location();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    boolean var9 = var8.isFloatable();
    java.awt.Component var11 = var8.getComponentAtIndex(10);
    java.lang.Object var12 = var5.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var13 = var5.getMaximumSize();
    var3.resize(var13);
    int var15 = var3.getY();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var17 = new com.allenstudio.ir.core.plugins.CommonNote();
    var17.setFocusTraversalPolicyProvider(false);
    var16.remove((java.awt.Component)var17);
    com.allenstudio.ir.ui.StatusBar var21 = new com.allenstudio.ir.ui.StatusBar();
    int var22 = var21.getY();
    javax.swing.JToolTip var23 = var21.createToolTip();
    java.awt.Insets var24 = var23.getInsets();
    java.awt.Insets var25 = var17.getInsets(var24);
    java.awt.Insets var26 = var3.getInsets(var25);
    boolean var27 = var3.isManagingFocus();
    var3.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    int var5 = var4.getIndexInList();
    java.awt.Dimension var6 = var4.getMaximumSize();
    java.awt.LayoutManager var7 = var4.getLayout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var8 = var4.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    var0.setEnabled(false);
    java.awt.Dimension var8 = var0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    boolean var10 = var2.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    com.allenstudio.ir.ui.MainFrame var1 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var2 = var1.getWarningString();
    java.awt.Rectangle var3 = var1.getMaximizedBounds();
    java.awt.MenuBar var4 = var1.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    var5.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var9 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var5);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    boolean var11 = var10.isBackgroundSet();
    boolean var14 = var10.contains(10, 100);
    var10.revalidate();
    javax.swing.JToolTip var16 = var10.createToolTip();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    boolean var24 = var23.isFloatable();
    java.awt.Component var26 = var23.getComponentAtIndex(10);
    java.lang.Object var27 = var20.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var28 = var20.getMaximumSize();
    var17.setMinimumSize(var28);
    java.awt.Rectangle var30 = var17.getBounds();
    var10.scrollRectToVisible(var30);
    var5.repaint(var30);
    var1.setMaximizedBounds(var30);
    com.allenstudio.ir.ui.MainFrame var34 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var35 = var34.getWarningString();
    java.awt.Rectangle var36 = var34.getMaximizedBounds();
    java.awt.MenuBar var37 = var34.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var38 = new com.allenstudio.ir.core.plugins.CommonNote();
    var38.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var42 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var38);
    com.allenstudio.ir.ui.StatusBar var43 = new com.allenstudio.ir.ui.StatusBar();
    boolean var44 = var43.isBackgroundSet();
    boolean var47 = var43.contains(10, 100);
    var43.revalidate();
    javax.swing.JToolTip var49 = var43.createToolTip();
    com.allenstudio.ir.ui.StatusBar var50 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var51 = var50.getRootPane();
    java.awt.Point var52 = var50.location();
    com.allenstudio.ir.ui.StatusBar var53 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var54 = var53.getRootPane();
    java.awt.Point var55 = var53.location();
    com.allenstudio.ir.ui.Toolbar var56 = new com.allenstudio.ir.ui.Toolbar();
    boolean var57 = var56.isFloatable();
    java.awt.Component var59 = var56.getComponentAtIndex(10);
    java.lang.Object var60 = var53.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var61 = var53.getMaximumSize();
    var50.setMinimumSize(var61);
    java.awt.Rectangle var63 = var50.getBounds();
    var43.scrollRectToVisible(var63);
    var38.repaint(var63);
    var34.setMaximizedBounds(var63);
    var1.setBounds(var63);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var63);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.addNotify();
    java.awt.Window var6 = var0.getOwner();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCursor(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    int var10 = var4.indexAtLocation(10, (-1));
    boolean var11 = var4.isDisplayable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove(32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    boolean var6 = var5.isFloatable();
    var5.show();
    java.awt.image.ColorModel var8 = var5.getColorModel();
    boolean var9 = var5.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    java.awt.Image var29 = var10.createImage(10, (-1));
    var4.add((java.awt.Component)var5, (java.lang.Object)10);
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var33 = var4.getToolTipTextAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var1 = var0.getFeature();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    var2.enable();
    boolean var4 = var2.isFocusOwner();
    var2.firePropertyChange("hi!", 10L, 0L);
    var2.layout();
    var2.removeAll();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    java.awt.Component var14 = var2.getComponentAt(var13);
    java.awt.Point var15 = var0.getLocation(var13);
    java.awt.Container var16 = var0.getParent();
    int var17 = var0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "C:\\boot.ini"+ "'", var1.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Dimension var10 = var0.size();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.Dimension var15 = var11.minimumSize();
    var0.setToolBar((javax.swing.JToolBar)var11);
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.setAutoscrolls(true);
    boolean var21 = var17.isCursorSet();
    com.allenstudio.ir.util.XmlIO var22 = new com.allenstudio.ir.util.XmlIO();
    var22.warningDialog("C:\\boot.ini");
    var22.notationDecl("C:\\boot.ini", "Date Picker", "hi!");
    com.allenstudio.ir.util.XmlIO var29 = new com.allenstudio.ir.util.XmlIO();
    char[] var31 = new char[] { 'a'};
    var29.ignorableWhitespace(var31, 0, (-1));
    var22.ignorableWhitespace(var31, 10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.add((java.awt.Component)var17, (java.lang.Object)10, 4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    var5.removeFromParent();
    com.allenstudio.ir.util.XmlElement var7 = var5.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    java.awt.Rectangle var3 = var0.getMaximizedBounds();
    java.awt.Color var4 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    boolean var3 = var0.isLocationByPlatform();
    int var4 = var0.getY();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    int var8 = var0.getBaseline(1, 100);
    java.awt.peer.ComponentPeer var9 = var0.getPeer();
    var0.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    var0.grabFocus();
    var0.addNotify();
    boolean var10 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var2 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    int var4 = var3.getY();
    javax.swing.JToolTip var5 = var3.createToolTip();
    float var6 = var5.getAlignmentY();
    java.awt.Color var7 = var5.getForeground();
    var0.remove((java.awt.Component)var5);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    int var10 = var9.getY();
    boolean var11 = var9.isLightweight();
    java.awt.Dimension var12 = var9.getMaximumSize();
    java.awt.event.KeyListener[] var13 = var9.getKeyListeners();
    java.awt.ComponentOrientation var14 = var9.getComponentOrientation();
    var0.setComponentOrientation(var14);
    java.lang.String var16 = var0.getOtherInfoText();
    boolean var17 = var0.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + " "+ "'", var16.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Dimension var10 = var0.size();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.Dimension var15 = var11.minimumSize();
    var0.setToolBar((javax.swing.JToolBar)var11);
    java.awt.Image var19 = var0.createImage(10, (-1));
    var0.setTitle("Date Picker");
    boolean var22 = var0.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    com.allenstudio.ir.ui.MainFrame var31 = new com.allenstudio.ir.ui.MainFrame();
    boolean var32 = var31.isShowing();
    int var33 = var31.countComponents();
    com.allenstudio.ir.ui.StatusBar var34 = new com.allenstudio.ir.ui.StatusBar();
    var34.enable();
    com.allenstudio.ir.ui.StatusBar var36 = new com.allenstudio.ir.ui.StatusBar();
    var36.enable();
    boolean var38 = var36.isFocusOwner();
    var36.firePropertyChange("hi!", 10L, 0L);
    var36.layout();
    var36.removeAll();
    com.allenstudio.ir.ui.StatusBar var45 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var46 = var45.getRootPane();
    java.awt.Point var47 = var45.location();
    java.awt.Point var48 = var36.getLocation(var47);
    var34.setLocation(var48);
    var31.setLocation(var48);
    java.awt.Color var51 = var31.getBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBackgroundAt(100, var51);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var1 = var0.getFeature();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    var2.enable();
    boolean var4 = var2.isFocusOwner();
    var2.firePropertyChange("hi!", 10L, 0L);
    var2.layout();
    var2.removeAll();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    java.awt.Component var14 = var2.getComponentAt(var13);
    java.awt.Point var15 = var0.getLocation(var13);
    var0.setOtherInfo("");
    var0.setFeature("Title");
    var0.removeNotify();
    var0.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "C:\\boot.ini"+ "'", var1.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    java.beans.VetoableChangeListener[] var8 = var0.getVetoableChangeListeners();
    javax.swing.InputMap var9 = var0.getInputMap();
    var0.addSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    com.allenstudio.ir.ui.NoteOperationsPane var0 = new com.allenstudio.ir.ui.NoteOperationsPane();
    var0.updateUI();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    java.lang.String var9 = var2.toString();
    var0.setToolBar((javax.swing.JToolBar)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    java.awt.Dimension var8 = var0.getMaximumSize();
    boolean var11 = var0.contains(4, (-1));
    java.awt.Rectangle var12 = var0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var4 = var0.getElement("hi!");
    java.lang.String var5 = var4.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    boolean var33 = var27.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    boolean var6 = var5.isFloatable();
    var5.show();
    java.awt.image.ColorModel var8 = var5.getColorModel();
    boolean var9 = var5.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    java.awt.Image var29 = var10.createImage(10, (-1));
    var4.add((java.awt.Component)var5, (java.lang.Object)10);
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    boolean var32 = var4.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    com.allenstudio.ir.ui.NoteListsTabPane var29 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var30 = new com.allenstudio.ir.ui.Toolbar();
    boolean var31 = var30.isFloatable();
    var30.show();
    java.awt.image.ColorModel var33 = var30.getColorModel();
    boolean var34 = var30.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var35 = new com.allenstudio.ir.ui.DatePickerPane();
    var35.transferFocus();
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var38 = var37.getColorModel();
    var37.setEnabled(true);
    java.awt.Component var42 = var37.getComponentAtIndex(1);
    boolean var43 = var37.isFloatable();
    var35.setContent((java.awt.Component)var37);
    java.awt.Dimension var45 = var35.size();
    com.allenstudio.ir.ui.Toolbar var46 = new com.allenstudio.ir.ui.Toolbar();
    boolean var47 = var46.isFloatable();
    var46.show();
    boolean var49 = var46.isRequestFocusEnabled();
    java.awt.Dimension var50 = var46.minimumSize();
    var35.setToolBar((javax.swing.JToolBar)var46);
    java.awt.Image var54 = var35.createImage(10, (-1));
    var29.add((java.awt.Component)var30, (java.lang.Object)10);
    var29.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var58 = var29.getUI();
    var0.setUI(var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var61 = var0.getForegroundAt(32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    var0.setFocusCycleRoot(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var7 = var0.getFocusTraversalKeys(32);
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
      java.lang.String var1 = com.allenstudio.ir.ui.UIResources.getString("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    java.awt.GraphicsConfiguration var9 = var0.getGraphicsConfiguration();
    java.awt.Color var10 = var0.getBackground();
    int var11 = var0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    var0.setToolBar((javax.swing.JToolBar)var21);
    var0.setTitle("Date Picker");
    java.awt.im.InputMethodRequests var30 = var0.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    java.awt.Toolkit var3 = var0.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    java.util.Hashtable var6 = var5.getAttributes();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var8 = var7.getWarningString();
    java.awt.Rectangle var9 = var7.getMaximizedBounds();
    java.awt.MenuBar var10 = var7.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var11 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var7.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var11);
    var7.dispose();
    java.lang.Object var14 = var6.get((java.lang.Object)var7);
    com.allenstudio.ir.util.XmlElement var15 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var17 = var15.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var20 = var17.addSubElement("", "hi!");
    java.util.Hashtable var21 = var20.getAttributes();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var23 = var22.getColorModel();
    var22.setEnabled(true);
    java.awt.ComponentOrientation var26 = var22.getComponentOrientation();
    java.lang.Object var27 = var6.put((java.lang.Object)var21, (java.lang.Object)var26);
    var21.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.show();
    boolean var3 = var0.isRequestFocusEnabled();
    java.awt.Dimension var4 = var0.minimumSize();
    java.awt.Dimension var5 = var0.getMinimumSize();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var1 = var0.getDescription();
    var0.reshape(10, 1, 10, (-1));
    java.awt.Font var7 = var0.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var1.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var1 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var2 = var1.getWarningString();
    java.awt.Rectangle var3 = var1.getMaximizedBounds();
    java.awt.MenuBar var4 = var1.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    var5.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var9 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var5);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    boolean var11 = var10.isBackgroundSet();
    boolean var14 = var10.contains(10, 100);
    var10.revalidate();
    javax.swing.JToolTip var16 = var10.createToolTip();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    boolean var24 = var23.isFloatable();
    java.awt.Component var26 = var23.getComponentAtIndex(10);
    java.lang.Object var27 = var20.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var28 = var20.getMaximumSize();
    var17.setMinimumSize(var28);
    java.awt.Rectangle var30 = var17.getBounds();
    var10.scrollRectToVisible(var30);
    var5.repaint(var30);
    var1.setMaximizedBounds(var30);
    int var36 = var0.getScrollableBlockIncrement(var30, 1, 4);
    int var37 = var0.getDebugGraphicsOptions();
    boolean var38 = var0.getScrollableTracksViewportHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.select((-1), false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.allenstudio.ir.ui.UIResources.getString("C:\\boot.ini");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.NoteList var1 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var2 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var3 = var2.getWarningString();
    java.awt.Rectangle var4 = var2.getMaximizedBounds();
    java.awt.MenuBar var5 = var2.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var6 = new com.allenstudio.ir.core.plugins.CommonNote();
    var6.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var10 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var6);
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    boolean var12 = var11.isBackgroundSet();
    boolean var15 = var11.contains(10, 100);
    var11.revalidate();
    javax.swing.JToolTip var17 = var11.createToolTip();
    com.allenstudio.ir.ui.StatusBar var18 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var19 = var18.getRootPane();
    java.awt.Point var20 = var18.location();
    com.allenstudio.ir.ui.StatusBar var21 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var22 = var21.getRootPane();
    java.awt.Point var23 = var21.location();
    com.allenstudio.ir.ui.Toolbar var24 = new com.allenstudio.ir.ui.Toolbar();
    boolean var25 = var24.isFloatable();
    java.awt.Component var27 = var24.getComponentAtIndex(10);
    java.lang.Object var28 = var21.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var29 = var21.getMaximumSize();
    var18.setMinimumSize(var29);
    java.awt.Rectangle var31 = var18.getBounds();
    var11.scrollRectToVisible(var31);
    var6.repaint(var31);
    var2.setMaximizedBounds(var31);
    int var37 = var1.getScrollableBlockIncrement(var31, 1, 4);
    int var40 = var0.getScrollableBlockIncrement(var31, 0, 0);
    var0.removeListEventListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    int var8 = var0.getY();
    var0.firePropertyChange("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", 4, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.disable();
    var0.firePropertyChange("hi!", (byte)(-1), (byte)10);
    float var7 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    var11.setMonth(4);
    com.allenstudio.ir.ui.Toolbar var15 = new com.allenstudio.ir.ui.Toolbar();
    boolean var16 = var15.isFloatable();
    var15.show();
    java.awt.image.ColorModel var18 = var15.getColorModel();
    boolean var19 = var15.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var20 = new com.allenstudio.ir.ui.DatePickerPane();
    var20.transferFocus();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var23 = var22.getColorModel();
    var22.setEnabled(true);
    java.awt.Component var27 = var22.getComponentAtIndex(1);
    boolean var28 = var22.isFloatable();
    var20.setContent((java.awt.Component)var22);
    java.awt.Font var30 = var20.getFont();
    java.awt.FontMetrics var31 = var15.getFontMetrics(var30);
    var11.setHeaderFont(var30);
    com.allenstudio.ir.core.plugins.CommonNote var33 = new com.allenstudio.ir.core.plugins.CommonNote();
    var33.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var37 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var33);
    java.awt.Dimension var38 = var37.getMaximumSize();
    var11.setCellDimension(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Rectangle var32 = var0.getBoundsAt(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 4);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var4 = new com.allenstudio.ir.core.plugins.CommonNote();
    var4.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var8 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var4);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var4.repaint(var29);
    var0.setMaximizedBounds(var29);
    java.util.Locale var33 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.event.WindowListener[] var8 = var0.getWindowListeners();
    java.awt.Container var9 = var0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    java.lang.String[] var2 = com.allenstudio.ir.util.InspirentoUtilities.tokenize("Title", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var1 = var0.getContentPane();
    boolean var2 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    java.awt.Component var6 = var3.getComponentAtIndex(10);
    java.lang.Object var7 = var0.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var8 = var0.getMaximumSize();
    com.allenstudio.ir.ui.DatePickerPane var9 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var10 = var9.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    int var12 = var11.getY();
    javax.swing.JToolTip var13 = var11.createToolTip();
    float var14 = var13.getAlignmentY();
    java.awt.Color var15 = var13.getForeground();
    var9.setBackground(var15);
    var0.setNextFocusableComponent((java.awt.Component)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "PanelUI"+ "'", var10.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    boolean var1 = var0.hasChanged();
    com.allenstudio.ir.util.XmlElement var3 = var0.getElement("C:\\boot.ini");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    var0.setToolBar((javax.swing.JToolBar)var21);
    boolean var28 = var0.requestFocusInWindow();
    java.lang.String var29 = var0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Date Picker"+ "'", var29.equals("Date Picker"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    java.awt.Rectangle var3 = var0.getMaximizedBounds();
    com.allenstudio.ir.ui.Toolbar var4 = new com.allenstudio.ir.ui.Toolbar();
    boolean var5 = var4.isFloatable();
    var4.setAutoscrolls(true);
    boolean var8 = var4.isCursorSet();
    var0.setGlassPane((java.awt.Component)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var10 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    com.allenstudio.ir.util.XmlElement var2 = new com.allenstudio.ir.util.XmlElement("Date Picker", "Inspirento - alpha 0.86");

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.util.Locale var2 = var0.getLocale();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var3.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var7 = var3.getAncestorListeners();
    var0.setLocationRelativeTo((java.awt.Component)var3);
    boolean var9 = var3.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    java.util.Locale var2 = javax.swing.JComponent.getDefaultLocale();
    javax.swing.JComponent.setDefaultLocale(var2);
    var0.setLocale(var2);
    boolean var5 = var0.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    java.awt.im.InputMethodRequests var7 = var0.getInputMethodRequests();
    javax.swing.border.Border var8 = var0.getBorder();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.calendar.DateChooser var2 = var0.getDateChooser();
    java.awt.Toolkit var3 = var0.getToolkit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    java.awt.dnd.DropTarget var2 = var0.getDropTarget();
    java.util.GregorianCalendar var3 = var0.reportSelectedDate();
    com.allenstudio.ir.ui.DatePickerPane var5 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var6 = var5.getContentPane();
    javax.swing.InputMap var7 = var5.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputMap(32, var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var3 = var2.getUI();
    var0.setUI(var3);
    boolean var5 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.setProperty("hi!", "ToolBarUI");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    boolean var5 = var0.isOpaque();
    int var6 = var0.getY();
    boolean var7 = var0.isEnabled();
    boolean var8 = var0.isManagingFocus();
    int var9 = var0.getWidth();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "com.allenstudio.ir.ui.StatusBar[,0,0,0var10,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]"+ "'", var10.equals("com.allenstudio.ir.ui.StatusBar[,0,0,0var10,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    var0.disable();
    var0.setBounds(100, 100, 10, 100);
    var0.displayTooltip("Date Picker");
    boolean var12 = var0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    boolean var5 = var0.isOpaque();
    int var6 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var1 = var0.getContentPane();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.isSelected();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var6 = var0.getComponent(4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    java.lang.String var71 = var34.getTitleAt(0);
    java.util.Locale var72 = var34.getLocale();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var34.setMnemonicAt((-1), 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Calendar var2 = var0.getSelectedDate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setMarked((-1), false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    java.awt.Component var7 = var0.getComponentAtIndex(1);
    java.awt.event.InputMethodListener[] var8 = var0.getInputMethodListeners();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.Dimension var10 = var9.size();
    java.awt.Dimension var11 = var0.getSize(var10);
    var0.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    var0.disable();
    var0.setBounds(100, 100, 10, 100);
    var0.displayTooltip("Date Picker");
    int var12 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    int var4 = var0.getWidth();
    var0.show(true);
    var0.revalidate();
    var0.setIgnoreRepaint(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    java.awt.im.InputMethodRequests var8 = var0.getInputMethodRequests();
    var0.transferFocus();
    java.lang.String var10 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "ToolBarUI"+ "'", var10.equals("ToolBarUI"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var3 = var1.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var6 = var3.addSubElement("", "hi!");
    java.util.Hashtable var7 = var6.getAttributes();
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.awt.Rectangle var10 = var8.getMaximizedBounds();
    java.awt.MenuBar var11 = var8.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var12 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var8.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var12);
    var8.dispose();
    java.lang.Object var15 = var7.get((java.lang.Object)var8);
    java.util.Set var16 = var7.entrySet();
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement("Title", var7);
    int var18 = var7.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    int var4 = var0.getWidth();
    com.allenstudio.ir.ui.MainFrame var5 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var6 = var5.getWarningString();
    java.lang.String var7 = var5.getWarningString();
    java.awt.Container var8 = var5.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var5.setMaximizedBounds(var29);
    var0.computeVisibleRect(var29);
    var0.resize((-1), (-1));
    com.allenstudio.ir.ui.DatePickerPane var37 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var38 = var37.getContentPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var39 = var0.add(" ", (java.awt.Component)var37);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    var0.enable();
    javax.swing.plaf.ToolBarUI var9 = var0.getUI();
    var0.setRollover(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    var5.setName("C:\\boot.ini");
    com.allenstudio.ir.ui.MainFrame var17 = new com.allenstudio.ir.ui.MainFrame();
    boolean var18 = var17.isShowing();
    int var19 = var17.countComponents();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    var20.enable();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    var22.enable();
    boolean var24 = var22.isFocusOwner();
    var22.firePropertyChange("hi!", 10L, 0L);
    var22.layout();
    var22.removeAll();
    com.allenstudio.ir.ui.StatusBar var31 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var32 = var31.getRootPane();
    java.awt.Point var33 = var31.location();
    java.awt.Point var34 = var22.getLocation(var33);
    var20.setLocation(var34);
    var17.setLocation(var34);
    java.awt.Color var37 = var17.getBackground();
    var5.notifyObservers((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.NoteListsTabPane var33 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    boolean var35 = var34.isFloatable();
    var34.show();
    java.awt.image.ColorModel var37 = var34.getColorModel();
    boolean var38 = var34.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var39 = new com.allenstudio.ir.ui.DatePickerPane();
    var39.transferFocus();
    com.allenstudio.ir.ui.Toolbar var41 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var42 = var41.getColorModel();
    var41.setEnabled(true);
    java.awt.Component var46 = var41.getComponentAtIndex(1);
    boolean var47 = var41.isFloatable();
    var39.setContent((java.awt.Component)var41);
    java.awt.Dimension var49 = var39.size();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    var50.show();
    boolean var53 = var50.isRequestFocusEnabled();
    java.awt.Dimension var54 = var50.minimumSize();
    var39.setToolBar((javax.swing.JToolBar)var50);
    java.awt.Image var58 = var39.createImage(10, (-1));
    var33.add((java.awt.Component)var34, (java.lang.Object)10);
    var33.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var62 = var33.getUI();
    javax.swing.SingleSelectionModel var63 = var33.getModel();
    var0.setModel(var63);
    javax.swing.plaf.TabbedPaneUI var65 = var0.getUI();
    com.allenstudio.ir.ui.Toolbar var66 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var67 = var66.getColorModel();
    java.awt.im.InputContext var68 = var66.getInputContext();
    java.awt.Component var70 = var66.getComponentAtIndex(0);
    boolean var71 = var66.isManagingFocus();
    boolean var73 = var66.areFocusTraversalKeysSet(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var66);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    java.lang.String var71 = var34.getTitleAt(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var73 = var34.getToolTipTextAt(32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var3 = var2.getUI();
    var0.setUI(var3);
    com.allenstudio.ir.ui.calendar.DateChooser var5 = var0.getDateChooser();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    boolean var8 = var7.isShowing();
    java.lang.String var9 = var7.getWarningString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var10 = var0.add("ToolBarUI", (java.awt.Component)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    java.util.Hashtable var6 = var5.getAttributes();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var8 = var7.getWarningString();
    java.awt.Rectangle var9 = var7.getMaximizedBounds();
    java.awt.MenuBar var10 = var7.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var11 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var7.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var11);
    var7.dispose();
    java.lang.Object var14 = var6.get((java.lang.Object)var7);
    com.allenstudio.ir.util.XmlElement var15 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var17 = var15.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var20 = var17.addSubElement("", "hi!");
    java.util.Hashtable var21 = var20.getAttributes();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var23 = var22.getColorModel();
    var22.setEnabled(true);
    java.awt.ComponentOrientation var26 = var22.getComponentOrientation();
    java.lang.Object var27 = var6.put((java.lang.Object)var21, (java.lang.Object)var26);
    var6.clear();
    java.util.Collection var29 = var6.values();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setTabLayoutPolicy(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabRunCount();
    var0.setMnemonicAt(0, 31);
    int var34 = var0.getTabPlacement();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    var0.setMarked(4, false);
    boolean var5 = var0.isMarked(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    var2.enable();
    boolean var4 = var2.isFocusOwner();
    var2.firePropertyChange("hi!", 10L, 0L);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    var9.enable();
    boolean var11 = var9.isFocusOwner();
    var9.firePropertyChange("hi!", 10L, 0L);
    var9.layout();
    var9.removeAll();
    com.allenstudio.ir.ui.StatusBar var18 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var19 = var18.getRootPane();
    java.awt.Point var20 = var18.location();
    java.awt.Component var21 = var9.getComponentAt(var20);
    java.awt.Component var22 = var2.getComponentAt(var20);
    var0.setLocation(var20);
    var0.setExtendedState(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    java.awt.Component[] var70 = var0.getComponents();
    java.awt.dnd.DropTarget var71 = var0.getDropTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var73 = var0.getTabComponentAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.pack();
    var0.setFocusCycleRoot(false);
    var0.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var14 = var13.getRootPane();
    java.awt.Point var15 = var13.location();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.Toolbar var19 = new com.allenstudio.ir.ui.Toolbar();
    boolean var20 = var19.isFloatable();
    java.awt.Component var22 = var19.getComponentAtIndex(10);
    java.lang.Object var23 = var16.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var24 = var16.getMaximumSize();
    var13.setMinimumSize(var24);
    java.awt.Rectangle var26 = var13.getBounds();
    var0.setBounds(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    boolean var0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    int var5 = var4.getIndexInList();
    java.awt.Dimension var6 = var4.getMaximumSize();
    java.awt.LayoutManager var7 = var4.getLayout();
    var4.setIndexInList(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var1 = var0.getFeature();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    var2.enable();
    boolean var4 = var2.isFocusOwner();
    var2.firePropertyChange("hi!", 10L, 0L);
    var2.layout();
    var2.removeAll();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    java.awt.Component var14 = var2.getComponentAt(var13);
    java.awt.Point var15 = var0.getLocation(var13);
    var0.setOtherInfo("");
    var0.setFeature("Title");
    var0.removeNotify();
    boolean var21 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "C:\\boot.ini"+ "'", var1.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    javax.swing.KeyStroke[] var2 = var0.getRegisteredKeyStrokes();
    var0.setAlignmentX(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isValidateRoot();
    var0.addSeparator();
    java.awt.image.ColorModel var8 = var0.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    boolean var5 = var0.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    com.allenstudio.ir.ui.calendar.DateChooser var0 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var0.doLayout();

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    com.allenstudio.ir.ui.MainFrame var2 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var3 = var2.getWarningString();
    java.lang.String var4 = var2.getWarningString();
    boolean var5 = var2.isAutoRequestFocus();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    java.awt.Dimension var8 = var6.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    int var10 = var9.getY();
    javax.swing.JToolTip var11 = var9.createToolTip();
    float var12 = var11.getAlignmentY();
    java.awt.Color var13 = var11.getForeground();
    var6.setBackground(var13);
    var2.setGlassPane((java.awt.Component)var6);
    boolean var16 = var2.isLocationByPlatform();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var17 = var0.add((java.awt.Component)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    boolean var3 = var0.isPaintingTile();
    java.awt.Graphics var4 = var0.getGraphics();
    boolean var5 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var6 = var0.contains(32, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    boolean var5 = var2.isDisplayable();
    javax.swing.ActionMap var6 = var2.getActionMap();
    boolean var7 = var2.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    java.awt.Rectangle var3 = var0.getMaximizedBounds();
    var0.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var1 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var2 = var1.getWarningString();
    java.awt.Rectangle var3 = var1.getMaximizedBounds();
    java.awt.MenuBar var4 = var1.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    var5.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var9 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var5);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    boolean var11 = var10.isBackgroundSet();
    boolean var14 = var10.contains(10, 100);
    var10.revalidate();
    javax.swing.JToolTip var16 = var10.createToolTip();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    boolean var24 = var23.isFloatable();
    java.awt.Component var26 = var23.getComponentAtIndex(10);
    java.lang.Object var27 = var20.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var28 = var20.getMaximumSize();
    var17.setMinimumSize(var28);
    java.awt.Rectangle var30 = var17.getBounds();
    var10.scrollRectToVisible(var30);
    var5.repaint(var30);
    var1.setMaximizedBounds(var30);
    int var36 = var0.getScrollableBlockIncrement(var30, 1, 4);
    var0.requestFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.select(100, false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    int var34 = var0.getTabPlacement();
    com.allenstudio.ir.ui.StatusBar var36 = new com.allenstudio.ir.ui.StatusBar();
    int var37 = var36.getY();
    var36.setIgnoreRepaint(true);
    boolean var40 = var36.requestFocusInWindow();
    boolean var41 = var36.isOpaque();
    int var42 = var36.getY();
    boolean var43 = var36.isEnabled();
    boolean var44 = var36.isManagingFocus();
    var36.setIgnoreRepaint(false);
    var0.addTab("Date Picker", (java.awt.Component)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    var34.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var63 = var34.getUI();
    var0.setUI(var63);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var66 = var0.getMnemonicAt(31);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Dimension var10 = var0.size();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.Dimension var15 = var11.minimumSize();
    var0.setToolBar((javax.swing.JToolBar)var11);
    var11.setDoubleBuffered(false);
    var11.setInheritsPopupMenu(true);
    boolean var21 = var11.isFloatable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    java.awt.Insets var3 = var2.getInsets();
    boolean var4 = var2.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    var0.errorDialog("hi!");
    char[] var5 = new char[] { 'a', '4'};
    var0.ignorableWhitespace(var5, 100, 0);
    com.allenstudio.ir.util.XmlElement var9 = var0.getRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 556);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    int var3 = var0.indexAtLocation(100, 32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var5 = var0.getTabComponentAt(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var4 = new com.allenstudio.ir.core.plugins.CommonNote();
    var4.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var8 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var4);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var4.repaint(var29);
    var0.setMaximizedBounds(var29);
    com.allenstudio.ir.ui.MainFrame var33 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var34 = var33.getWarningString();
    java.awt.Rectangle var35 = var33.getMaximizedBounds();
    java.awt.MenuBar var36 = var33.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var37 = new com.allenstudio.ir.core.plugins.CommonNote();
    var37.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var41 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var37);
    com.allenstudio.ir.ui.StatusBar var42 = new com.allenstudio.ir.ui.StatusBar();
    boolean var43 = var42.isBackgroundSet();
    boolean var46 = var42.contains(10, 100);
    var42.revalidate();
    javax.swing.JToolTip var48 = var42.createToolTip();
    com.allenstudio.ir.ui.StatusBar var49 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var50 = var49.getRootPane();
    java.awt.Point var51 = var49.location();
    com.allenstudio.ir.ui.StatusBar var52 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var53 = var52.getRootPane();
    java.awt.Point var54 = var52.location();
    com.allenstudio.ir.ui.Toolbar var55 = new com.allenstudio.ir.ui.Toolbar();
    boolean var56 = var55.isFloatable();
    java.awt.Component var58 = var55.getComponentAtIndex(10);
    java.lang.Object var59 = var52.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var60 = var52.getMaximumSize();
    var49.setMinimumSize(var60);
    java.awt.Rectangle var62 = var49.getBounds();
    var42.scrollRectToVisible(var62);
    var37.repaint(var62);
    var33.setMaximizedBounds(var62);
    var0.setBounds(var62);
    boolean var67 = var0.isValidateRoot();
    java.awt.Dialog.ModalExclusionType var68 = var0.getModalExclusionType();
    com.allenstudio.ir.ui.MainFrame var70 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var71 = var70.getWarningString();
    boolean var72 = var70.isAlwaysOnTopSupported();
    java.awt.Color var73 = var70.getBackground();
    var70.show();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var75 = var0.add("Date Picker", (java.awt.Component)var70);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    var0.resize(0, 1);
    java.awt.Rectangle var15 = var0.getBounds();
    java.awt.Point var16 = var0.location();
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var19 = var17.addSubElement("hi!");
    var19.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var22 = var19.getData();
    com.allenstudio.ir.util.XmlElement var24 = var19.getElement("Date Picker");
    var19.removeAllElements();
    java.lang.Object var26 = var0.getClientProperty((java.lang.Object)var19);
    var0.repaint(0L, 1, 32, 0, 100);
    java.lang.String var33 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "PanelUI"+ "'", var33.equals("PanelUI"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    boolean var5 = var4.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    com.allenstudio.ir.ui.calendar.DateChooser var0 = new com.allenstudio.ir.ui.calendar.DateChooser();
    boolean var2 = var0.requestFocus(false);
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    boolean var4 = var3.isBackgroundSet();
    var3.repaint(100L);
    int var7 = var3.getWidth();
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.lang.String var10 = var8.getWarningString();
    java.awt.Container var11 = var8.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    boolean var13 = var12.isBackgroundSet();
    boolean var16 = var12.contains(10, 100);
    var12.revalidate();
    javax.swing.JToolTip var18 = var12.createToolTip();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var23 = var22.getRootPane();
    java.awt.Point var24 = var22.location();
    com.allenstudio.ir.ui.Toolbar var25 = new com.allenstudio.ir.ui.Toolbar();
    boolean var26 = var25.isFloatable();
    java.awt.Component var28 = var25.getComponentAtIndex(10);
    java.lang.Object var29 = var22.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var30 = var22.getMaximumSize();
    var19.setMinimumSize(var30);
    java.awt.Rectangle var32 = var19.getBounds();
    var12.scrollRectToVisible(var32);
    var8.setMaximizedBounds(var32);
    var3.computeVisibleRect(var32);
    var0.paintImmediately(var32);
    com.allenstudio.ir.event.DateChooserListener var37 = var0.getDateChooserListener();
    var0.firePropertyChange("PanelUI", '#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    java.awt.GraphicsConfiguration var9 = var0.getGraphicsConfiguration();
    var0.requestFocus();
    var0.repaint(0L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var15 = var0.getBaseline(10, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    var2.setVisible(true);
    com.allenstudio.ir.ui.DatePickerPane var13 = new com.allenstudio.ir.ui.DatePickerPane();
    var13.transferFocus();
    com.allenstudio.ir.ui.Toolbar var15 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var16 = var15.getColorModel();
    var15.setEnabled(true);
    java.awt.Component var20 = var15.getComponentAtIndex(1);
    boolean var21 = var15.isFloatable();
    var13.setContent((java.awt.Component)var15);
    var13.setSelected(true);
    var13.resize(0, 1);
    java.awt.Rectangle var28 = var13.getBounds();
    java.awt.Point var29 = var13.location();
    java.awt.Point var30 = var2.getLocation(var29);
    boolean var31 = var2.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.setAlignmentX(0.0f);
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    int var4 = var3.getY();
    var3.setIgnoreRepaint(true);
    boolean var7 = var3.requestFocusInWindow();
    boolean var8 = var3.isOpaque();
    int var9 = var3.getY();
    boolean var10 = var3.isEnabled();
    boolean var11 = var3.isManagingFocus();
    var3.setIgnoreRepaint(false);
    com.allenstudio.ir.util.InspirentoUtilities var14 = new com.allenstudio.ir.util.InspirentoUtilities();
    com.allenstudio.ir.event.NoteListDataEvent var16 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var14, 1);
    int var17 = var16.getIndex();
    int var18 = var16.getType();
    int var19 = var16.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var3, (java.lang.Object)var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.Container var8 = var0.getFocusCycleRootAncestor();
    int var9 = var0.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    boolean var13 = var11.getWeekStartOnSunday();
    int var14 = var11.getSelectedDay();
    javax.swing.JComponent var15 = var11.getHeaderComponent();
    com.allenstudio.ir.ui.calendar.IMonthlyCalendarModel var16 = var11.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.deleteObservers();
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("C:\\boot.ini");
    java.util.Enumeration var6 = var5.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.awt.Component var1 = var0.getNextFocusableComponent();
    java.lang.String var2 = var0.getDescription();
    var0.setDoubleBuffered(true);
    java.awt.im.InputContext var5 = var0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var2.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.lang.String var2 = var0.getWarningString();
    var0.setAutoRequestFocus(true);
    var0.removeAll();
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var7 = var6.getWarningString();
    java.awt.Container var8 = var6.getFocusCycleRootAncestor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var10 = var0.add((java.awt.Component)var6, 32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    var6.setSelected(true);
    boolean var18 = var6.isFocusTraversalPolicySet();
    java.awt.Dimension var19 = var6.getPreferredSize();
    java.awt.Dimension var20 = var0.getSize(var19);
    java.awt.Image var21 = var0.getIconImage();
    var0.createBufferStrategy(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var3 = var2.getUI();
    var0.setUI(var3);
    com.allenstudio.ir.ui.calendar.DateChooser var5 = var0.getDateChooser();
    boolean var6 = var0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    java.lang.String var13 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "ToolBarUI"+ "'", var13.equals("ToolBarUI"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    java.lang.String var4 = var0.getAttribute("C:\\boot.ini");
    var0.setName("hi!");
    com.allenstudio.ir.util.XmlIO var7 = new com.allenstudio.ir.util.XmlIO();
    char[] var9 = new char[] { 'a'};
    var7.ignorableWhitespace(var9, 0, (-1));
    var7.endPrefixMapping("PanelUI");
    var7.startDocument();
    var0.notifyObservers((java.lang.Object)var7);
    var7.skippedEntity("");
    var7.errorDialog(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    java.awt.Rectangle var34 = var27.getBounds();
    javax.swing.Icon var35 = var27.getFrameIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.getInheritsPopupMenu();
    var0.firePropertyChange("", 100, (-1));
    int var12 = var0.getBaseline(31, 31);
    var0.setToolTipText("TabbedPaneUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    boolean var6 = var5.isFloatable();
    var5.show();
    java.awt.image.ColorModel var8 = var5.getColorModel();
    boolean var9 = var5.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    java.awt.Image var29 = var10.createImage(10, (-1));
    var4.add((java.awt.Component)var5, (java.lang.Object)10);
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    java.awt.event.ComponentListener[] var32 = var4.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var33 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var34 = var33.getDateBackground();
    var33.setYearMonth(1, (-1));
    java.util.Calendar var38 = var33.getSelectedDate();
    var4.remove((java.awt.Component)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setMnemonicAt(32, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    boolean var2 = var0.isFocusTraversalPolicySet();
    var0.setFocusCycleRoot(false);
    java.awt.Dimension var5 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    boolean var2 = var0.isManagingFocus();
    java.awt.LayoutManager var3 = var0.getLayout();
    var0.setDebugGraphicsOptions(1);
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    com.allenstudio.ir.ui.MainFrame var9 = new com.allenstudio.ir.ui.MainFrame();
    boolean var10 = var9.isShowing();
    int var11 = var9.countComponents();
    var9.setAutoRequestFocus(false);
    javax.swing.JMenuBar var14 = var9.getJMenuBar();
    boolean var15 = var14.isBorderPainted();
    var14.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var17 = new com.allenstudio.ir.ui.DatePickerPane();
    var17.transferFocus();
    java.awt.Dimension var19 = var17.getMinimumSize();
    java.awt.Dimension var20 = var14.getSize(var19);
    javax.swing.plaf.MenuBarUI var21 = var14.getUI();
    var5.setUI(var21);
    com.allenstudio.ir.ui.NoteListsTabPane var23 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var24 = new com.allenstudio.ir.ui.Toolbar();
    boolean var25 = var24.isFloatable();
    var24.show();
    java.awt.image.ColorModel var27 = var24.getColorModel();
    boolean var28 = var24.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var29 = new com.allenstudio.ir.ui.DatePickerPane();
    var29.transferFocus();
    com.allenstudio.ir.ui.Toolbar var31 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var32 = var31.getColorModel();
    var31.setEnabled(true);
    java.awt.Component var36 = var31.getComponentAtIndex(1);
    boolean var37 = var31.isFloatable();
    var29.setContent((java.awt.Component)var31);
    java.awt.Dimension var39 = var29.size();
    com.allenstudio.ir.ui.Toolbar var40 = new com.allenstudio.ir.ui.Toolbar();
    boolean var41 = var40.isFloatable();
    var40.show();
    boolean var43 = var40.isRequestFocusEnabled();
    java.awt.Dimension var44 = var40.minimumSize();
    var29.setToolBar((javax.swing.JToolBar)var40);
    java.awt.Image var48 = var29.createImage(10, (-1));
    var23.add((java.awt.Component)var24, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    java.awt.Component var53 = var50.getComponentAtIndex(10);
    boolean var54 = var50.isLightweight();
    java.awt.Component var55 = var23.add((java.awt.Component)var50);
    com.allenstudio.ir.ui.NoteListsTabPane var56 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var57 = new com.allenstudio.ir.ui.Toolbar();
    boolean var58 = var57.isFloatable();
    var57.show();
    java.awt.image.ColorModel var60 = var57.getColorModel();
    boolean var61 = var57.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var62 = new com.allenstudio.ir.ui.DatePickerPane();
    var62.transferFocus();
    com.allenstudio.ir.ui.Toolbar var64 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var65 = var64.getColorModel();
    var64.setEnabled(true);
    java.awt.Component var69 = var64.getComponentAtIndex(1);
    boolean var70 = var64.isFloatable();
    var62.setContent((java.awt.Component)var64);
    java.awt.Dimension var72 = var62.size();
    com.allenstudio.ir.ui.Toolbar var73 = new com.allenstudio.ir.ui.Toolbar();
    boolean var74 = var73.isFloatable();
    var73.show();
    boolean var76 = var73.isRequestFocusEnabled();
    java.awt.Dimension var77 = var73.minimumSize();
    var62.setToolBar((javax.swing.JToolBar)var73);
    java.awt.Image var81 = var62.createImage(10, (-1));
    var56.add((java.awt.Component)var57, (java.lang.Object)10);
    var56.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var85 = var56.getUI();
    javax.swing.SingleSelectionModel var86 = var56.getModel();
    var23.setModel(var86);
    var5.setSelectionModel(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    var0.firePropertyChange("", false, true);
    java.awt.Component var8 = var0.getComponentAtIndex(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    java.awt.Color var9 = var0.getForeground();
    java.awt.Rectangle var10 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    int var10 = var4.indexAtLocation(10, (-1));
    boolean var11 = var4.isDisplayable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Rectangle var13 = var4.getBoundsAt((-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    java.lang.String var5 = var0.getOtherInfo();
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var7 = var6.getRootPane();
    var6.layout();
    javax.swing.ActionMap var9 = var6.getActionMap();
    var0.setActionMap(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.show();
    boolean var3 = var0.isRequestFocusEnabled();
    java.awt.Dimension var4 = var0.minimumSize();
    var0.enable(true);
    com.allenstudio.ir.ui.DatePickerPane var7 = new com.allenstudio.ir.ui.DatePickerPane();
    var7.transferFocus();
    java.awt.Dimension var9 = var7.getMinimumSize();
    var0.setMaximumSize(var9);
    java.awt.Insets var11 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var8 = new com.allenstudio.ir.ui.DatePickerPane();
    var8.transferFocus();
    java.awt.Dimension var10 = var8.getMinimumSize();
    java.awt.Dimension var11 = var5.getSize(var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JMenu var12 = var5.getHelpMenu();
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    java.lang.String var3 = var0.getToolTipText();
    var0.layout();
    var0.paintImmediately(31, 100, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    var0.setFocusable(false);
    boolean var14 = var0.getInheritsPopupMenu();
    com.allenstudio.ir.ui.StatusBar var15 = new com.allenstudio.ir.ui.StatusBar();
    var15.enable();
    boolean var17 = var15.isFocusOwner();
    var15.repaint(100L, 32, 4, 32, 4);
    java.awt.Rectangle var24 = var15.getVisibleRect();
    java.awt.Rectangle var25 = var0.getBounds(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    boolean var1 = var0.hasChanged();
    boolean var2 = var0.hasChanged();
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.deleteObservers();
    var0.append(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.NoteListsTabPane var33 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    boolean var35 = var34.isFloatable();
    var34.show();
    java.awt.image.ColorModel var37 = var34.getColorModel();
    boolean var38 = var34.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var39 = new com.allenstudio.ir.ui.DatePickerPane();
    var39.transferFocus();
    com.allenstudio.ir.ui.Toolbar var41 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var42 = var41.getColorModel();
    var41.setEnabled(true);
    java.awt.Component var46 = var41.getComponentAtIndex(1);
    boolean var47 = var41.isFloatable();
    var39.setContent((java.awt.Component)var41);
    java.awt.Dimension var49 = var39.size();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    var50.show();
    boolean var53 = var50.isRequestFocusEnabled();
    java.awt.Dimension var54 = var50.minimumSize();
    var39.setToolBar((javax.swing.JToolBar)var50);
    java.awt.Image var58 = var39.createImage(10, (-1));
    var33.add((java.awt.Component)var34, (java.lang.Object)10);
    var33.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var62 = var33.getUI();
    javax.swing.SingleSelectionModel var63 = var33.getModel();
    var0.setModel(var63);
    javax.accessibility.AccessibleContext var65 = var0.getAccessibleContext();
    com.allenstudio.ir.ui.Toolbar var66 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var67 = var66.getColorModel();
    var66.setEnabled(true);
    java.awt.Component var71 = var66.getComponentAtIndex(1);
    boolean var72 = var66.isValidateRoot();
    boolean var73 = var66.isPaintingTile();
    int var74 = var0.indexOfTabComponent((java.awt.Component)var66);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    int var4 = var0.getWidth();
    com.allenstudio.ir.ui.MainFrame var5 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var6 = var5.getWarningString();
    java.lang.String var7 = var5.getWarningString();
    java.awt.Container var8 = var5.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var5.setMaximizedBounds(var29);
    var0.computeVisibleRect(var29);
    java.lang.String var33 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    boolean var5 = var0.isOpaque();
    int var6 = var0.getY();
    boolean var7 = var0.isEnabled();
    boolean var8 = var0.isManagingFocus();
    int var9 = var0.getWidth();
    boolean var10 = var0.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var28 = var27.getColorModel();
    var27.setEnabled(true);
    var0.add((java.awt.Component)var27, (java.lang.Object)100L, 0);
    com.allenstudio.ir.ui.MainFrame var34 = new com.allenstudio.ir.ui.MainFrame();
    boolean var35 = var34.isShowing();
    int var36 = var34.countComponents();
    com.allenstudio.ir.ui.StatusBar var37 = new com.allenstudio.ir.ui.StatusBar();
    var37.enable();
    com.allenstudio.ir.ui.StatusBar var39 = new com.allenstudio.ir.ui.StatusBar();
    var39.enable();
    boolean var41 = var39.isFocusOwner();
    var39.firePropertyChange("hi!", 10L, 0L);
    var39.layout();
    var39.removeAll();
    com.allenstudio.ir.ui.StatusBar var48 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var49 = var48.getRootPane();
    java.awt.Point var50 = var48.location();
    java.awt.Point var51 = var39.getLocation(var50);
    var37.setLocation(var51);
    var34.setLocation(var51);
    java.awt.Color var54 = var34.getBackground();
    boolean var55 = var34.isShowing();
    var34.firePropertyChange(" ", 100L, (-1L));
    int var60 = var27.getComponentIndex((java.awt.Component)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    java.awt.ComponentOrientation var5 = var0.getComponentOrientation();
    javax.swing.JRootPane var6 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    boolean var3 = var0.isPaintingTile();
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    com.allenstudio.ir.ui.MainFrame var4 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var5 = var4.getWarningString();
    boolean var6 = var4.isAlwaysOnTopSupported();
    java.awt.Color var7 = var4.getBackground();
    var0.setBackground(var7);
    var0.transferFocusDownCycle();
    boolean var10 = var0.isFocusCycleRoot();
    var0.toBack();
    com.allenstudio.ir.ui.MainFrame var12 = new com.allenstudio.ir.ui.MainFrame();
    boolean var13 = var12.isShowing();
    int var14 = var12.countComponents();
    var12.setAutoRequestFocus(false);
    javax.swing.JMenuBar var17 = var12.getJMenuBar();
    boolean var18 = var17.isBorderPainted();
    var17.menuSelectionChanged(true);
    var0.setJMenuBar(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    java.lang.String var17 = var9.getAttribute("", "Title");
    var9.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Title"+ "'", var17.equals("Title"));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Component var2 = var0.getFocusOwner();
    java.awt.MenuBar var3 = var0.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    java.util.Locale var2 = var0.getLocale();
    java.awt.MenuBar var3 = var0.getMenuBar();
    java.awt.ComponentOrientation var4 = var0.getComponentOrientation();
    var0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    boolean var5 = var2.isDisplayable();
    javax.swing.ActionMap var6 = var2.getActionMap();
    boolean var7 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.pack();
    var0.setFocusCycleRoot(false);
    com.allenstudio.ir.event.NoteListDataEvent var9 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)false, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    boolean var3 = var0.isManagingFocus();
    java.awt.Rectangle var4 = var0.bounds();
    java.awt.GraphicsConfiguration var5 = var0.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    javax.swing.SingleSelectionModel var30 = var0.getModel();
    int var31 = var0.getTabPlacement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var33 = var0.getComponentAt(32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var4 = new com.allenstudio.ir.core.plugins.CommonNote();
    var4.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var8 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var4);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var4.repaint(var29);
    var0.setMaximizedBounds(var29);
    com.allenstudio.ir.ui.MainFrame var33 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var34 = var33.getWarningString();
    java.awt.Rectangle var35 = var33.getMaximizedBounds();
    java.awt.MenuBar var36 = var33.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var37 = new com.allenstudio.ir.core.plugins.CommonNote();
    var37.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var41 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var37);
    com.allenstudio.ir.ui.StatusBar var42 = new com.allenstudio.ir.ui.StatusBar();
    boolean var43 = var42.isBackgroundSet();
    boolean var46 = var42.contains(10, 100);
    var42.revalidate();
    javax.swing.JToolTip var48 = var42.createToolTip();
    com.allenstudio.ir.ui.StatusBar var49 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var50 = var49.getRootPane();
    java.awt.Point var51 = var49.location();
    com.allenstudio.ir.ui.StatusBar var52 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var53 = var52.getRootPane();
    java.awt.Point var54 = var52.location();
    com.allenstudio.ir.ui.Toolbar var55 = new com.allenstudio.ir.ui.Toolbar();
    boolean var56 = var55.isFloatable();
    java.awt.Component var58 = var55.getComponentAtIndex(10);
    java.lang.Object var59 = var52.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var60 = var52.getMaximumSize();
    var49.setMinimumSize(var60);
    java.awt.Rectangle var62 = var49.getBounds();
    var42.scrollRectToVisible(var62);
    var37.repaint(var62);
    var33.setMaximizedBounds(var62);
    var0.setBounds(var62);
    boolean var67 = var0.isValidateRoot();
    com.allenstudio.ir.ui.MainFrame var68 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var69 = var68.getWarningString();
    java.lang.String var70 = var68.getWarningString();
    var68.toFront();
    java.awt.im.InputContext var72 = var68.getInputContext();
    java.awt.Graphics var73 = var68.getGraphics();
    java.awt.Dialog.ModalExclusionType var74 = var68.getModalExclusionType();
    var0.setModalExclusionType(var74);
    com.allenstudio.ir.ui.StatusBar var76 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var77 = var76.getRootPane();
    java.awt.Point var78 = var76.location();
    com.allenstudio.ir.ui.StatusBar var79 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var80 = var79.getRootPane();
    java.awt.Point var81 = var79.location();
    com.allenstudio.ir.ui.Toolbar var82 = new com.allenstudio.ir.ui.Toolbar();
    boolean var83 = var82.isFloatable();
    java.awt.Component var85 = var82.getComponentAtIndex(10);
    java.lang.Object var86 = var79.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var87 = var79.getMaximumSize();
    var76.setMinimumSize(var87);
    java.awt.Rectangle var89 = var76.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var89);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    java.awt.Component var6 = var3.getComponentAtIndex(10);
    java.lang.Object var7 = var0.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var8 = var0.getMaximumSize();
    javax.swing.InputMap var9 = var0.getInputMap();
    com.allenstudio.ir.util.XmlElement var11 = new com.allenstudio.ir.util.XmlElement("");
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    java.awt.im.InputContext var14 = var12.getInputContext();
    java.awt.Component var16 = var12.getComponent(0);
    boolean var19 = var12.contains((-1), 1);
    var11.notifyObservers((java.lang.Object)var12);
    var12.resetKeyboardActions();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var23 = var22.getRootPane();
    java.awt.Point var24 = var22.location();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var12, (java.lang.Object)var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.calendar.DateChooser var2 = var0.getDateChooser();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = var0.getDateChooser();
    var0.transferFocusBackward();
    java.lang.String var5 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PanelUI"+ "'", var5.equals("PanelUI"));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    java.lang.String var4 = var0.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var12 = var10.addSubElement("hi!");
    var12.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var15 = var7.removeElement(var12);
    com.allenstudio.ir.util.XmlElement var16 = var12.getParent();
    var0.append(var12);
    var0.deleteObservers();
    java.util.List var19 = var0.getElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    java.awt.Component var20 = var17.getComponentAtIndex(10);
    java.lang.Object var21 = var14.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var22 = var14.getMaximumSize();
    var11.setMinimumSize(var22);
    java.awt.Rectangle var24 = var11.getBounds();
    var4.scrollRectToVisible(var24);
    var0.setMaximizedBounds(var24);
    float var27 = var0.getAlignmentX();
    var0.revalidate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(4);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.5f);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabRunCount();
    com.allenstudio.ir.ui.DatePickerPane var31 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var32 = var31.getContentPane();
    int var33 = var0.indexOfTabComponent((java.awt.Component)var31);
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    boolean var62 = var61.isFloatable();
    java.awt.Component var64 = var61.getComponentAtIndex(10);
    boolean var65 = var61.isLightweight();
    java.awt.Component var66 = var34.add((java.awt.Component)var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var34);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var4 = var0.getElement("hi!");
    com.allenstudio.ir.ui.MainFrame var5 = new com.allenstudio.ir.ui.MainFrame();
    boolean var6 = var5.isShowing();
    int var7 = var5.countComponents();
    com.allenstudio.ir.ui.StatusBar var8 = new com.allenstudio.ir.ui.StatusBar();
    var8.enable();
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    var10.enable();
    boolean var12 = var10.isFocusOwner();
    var10.firePropertyChange("hi!", 10L, 0L);
    var10.layout();
    var10.removeAll();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    java.awt.Point var22 = var10.getLocation(var21);
    var8.setLocation(var22);
    var5.setLocation(var22);
    java.awt.Container var25 = var5.getContentPane();
    java.awt.event.WindowFocusListener[] var26 = var5.getWindowFocusListeners();
    boolean var27 = var4.equals((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var1 = var0.getDateBackground();
    var0.setYearMonth(1, (-1));
    com.allenstudio.ir.ui.MainFrame var5 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var6 = var5.getWarningString();
    boolean var7 = var5.isAlwaysOnTopSupported();
    java.awt.Color var8 = var5.getBackground();
    var0.setDateForeground(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    boolean var6 = var5.isFloatable();
    var5.show();
    java.awt.image.ColorModel var8 = var5.getColorModel();
    boolean var9 = var5.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    java.awt.Image var29 = var10.createImage(10, (-1));
    var4.add((java.awt.Component)var5, (java.lang.Object)10);
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    java.awt.event.ComponentListener[] var32 = var4.getComponentListeners();
    java.lang.String var33 = var4.getUIClassID();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var35 = var4.getComponentAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "TabbedPaneUI"+ "'", var33.equals("TabbedPaneUI"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    var34.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var63 = var34.getUI();
    var0.setUI(var63);
    com.allenstudio.ir.ui.MainFrame var65 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var66 = var65.getWarningString();
    java.awt.Rectangle var67 = var65.getMaximizedBounds();
    java.awt.MenuBar var68 = var65.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var69 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var65.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var69);
    var65.toBack();
    boolean var72 = var65.getFocusableWindowState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var65);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.disable();
    boolean var5 = var0.inside((-1), 100);
    var0.transferFocusUpCycle();
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.setSelectedIndex(1);
    com.allenstudio.ir.core.plugins.CommonNote var3 = new com.allenstudio.ir.core.plugins.CommonNote();
    var3.setFocusTraversalPolicyProvider(false);
    int var6 = var3.getY();
    int var7 = var0.indexOfComponent((java.awt.Component)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var9 = var0.getForegroundAt(556);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    java.awt.Container var12 = var0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    var0.toFront();
    java.awt.im.InputContext var4 = var0.getInputContext();
    java.awt.Graphics var5 = var0.getGraphics();
    java.awt.Dialog.ModalExclusionType var6 = var0.getModalExclusionType();
    boolean var7 = var0.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    javax.swing.SingleSelectionModel var30 = var0.getModel();
    com.allenstudio.ir.ui.MainFrame var31 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var32 = var31.getWarningString();
    java.awt.Rectangle var33 = var31.getMaximizedBounds();
    java.awt.MenuBar var34 = var31.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var35 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var31.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var35);
    var31.dispose();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var39 = var0.add((java.awt.Component)var31, 32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.setDebugGraphicsOptions(0);
    var0.firePropertyChange("hi!", 100, 10);
    var0.firePropertyChange("ToolBarUI", false, true);
    boolean var12 = var0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement("ToolBarUI");

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    java.awt.event.KeyListener[] var33 = var0.getKeyListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDisplayedMnemonicIndexAt(4, 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    java.lang.String var4 = var0.getOtherInfo();
    java.lang.String var5 = var0.getDescription();
    float var6 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var5.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    java.awt.Component var20 = var17.getComponentAtIndex(10);
    java.lang.Object var21 = var14.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var22 = var14.getMaximumSize();
    var11.setMinimumSize(var22);
    java.awt.Rectangle var24 = var11.getBounds();
    var4.scrollRectToVisible(var24);
    var0.setMaximizedBounds(var24);
    var0.nextFocus();
    var0.resize(1, 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    java.lang.String var4 = var0.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var12 = var10.addSubElement("hi!");
    var12.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var15 = var7.removeElement(var12);
    com.allenstudio.ir.util.XmlElement var16 = var12.getParent();
    java.util.List var17 = var16.getElements();
    int var18 = var16.countObservers();
    java.lang.Object var21 = var16.addAttribute("hi!", "C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var22 = var0.addSubElement(var16);
    com.allenstudio.ir.util.XmlElement var23 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var25 = var23.addSubElement("hi!");
    var25.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    var30.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var33 = var25.removeElement(var30);
    com.allenstudio.ir.util.XmlElement var34 = var30.getParent();
    java.util.List var35 = var34.getElements();
    int var36 = var34.countObservers();
    java.lang.Object var39 = var34.addAttribute("hi!", "C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var40 = var16.removeElement(var34);
    java.lang.String var41 = var16.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    boolean var9 = var0.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var10 = var0.getContentPaneBorder();
    com.allenstudio.ir.ui.MainFrame var11 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var12 = var11.getWarningString();
    java.lang.String var13 = var11.getWarningString();
    java.awt.Container var14 = var11.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var15 = new com.allenstudio.ir.ui.StatusBar();
    boolean var16 = var15.isBackgroundSet();
    boolean var19 = var15.contains(10, 100);
    var15.revalidate();
    javax.swing.JToolTip var21 = var15.createToolTip();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var23 = var22.getRootPane();
    java.awt.Point var24 = var22.location();
    com.allenstudio.ir.ui.StatusBar var25 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var26 = var25.getRootPane();
    java.awt.Point var27 = var25.location();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    boolean var29 = var28.isFloatable();
    java.awt.Component var31 = var28.getComponentAtIndex(10);
    java.lang.Object var32 = var25.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var33 = var25.getMaximumSize();
    var22.setMinimumSize(var33);
    java.awt.Rectangle var35 = var22.getBounds();
    var15.scrollRectToVisible(var35);
    var11.setMaximizedBounds(var35);
    float var38 = var11.getAlignmentX();
    com.allenstudio.ir.ui.StatusBar var39 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var40 = var39.getRootPane();
    java.awt.Point var41 = var39.location();
    boolean var42 = var39.isManagingFocus();
    java.awt.Rectangle var43 = var39.bounds();
    var11.setMaximizedBounds(var43);
    java.awt.Rectangle var45 = var0.getBounds(var43);
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.awt.Rectangle var10 = var8.getMaximizedBounds();
    java.awt.MenuBar var11 = var8.getMenuBar();
    var8.removeNotify();
    var8.addNotify();
    boolean var14 = var8.getFocusableWindowState();
    java.awt.Image var15 = var8.getIconImage();
    com.allenstudio.ir.ui.NoteListsTabPane var16 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    java.awt.image.ColorModel var20 = var17.getColorModel();
    boolean var21 = var17.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var22 = new com.allenstudio.ir.ui.DatePickerPane();
    var22.transferFocus();
    com.allenstudio.ir.ui.Toolbar var24 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var25 = var24.getColorModel();
    var24.setEnabled(true);
    java.awt.Component var29 = var24.getComponentAtIndex(1);
    boolean var30 = var24.isFloatable();
    var22.setContent((java.awt.Component)var24);
    java.awt.Dimension var32 = var22.size();
    com.allenstudio.ir.ui.Toolbar var33 = new com.allenstudio.ir.ui.Toolbar();
    boolean var34 = var33.isFloatable();
    var33.show();
    boolean var36 = var33.isRequestFocusEnabled();
    java.awt.Dimension var37 = var33.minimumSize();
    var22.setToolBar((javax.swing.JToolBar)var33);
    java.awt.Image var41 = var22.createImage(10, (-1));
    var16.add((java.awt.Component)var17, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var43 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var44 = var43.getColorModel();
    var43.setEnabled(true);
    var16.add((java.awt.Component)var43, (java.lang.Object)100L, 0);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var50 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var51 = var50.getDateBackground();
    var50.setYearMonth(1, (-1));
    java.util.Calendar var55 = var50.getSelectedDate();
    var43.addMouseListener((java.awt.event.MouseListener)var50);
    var8.removeMouseListener((java.awt.event.MouseListener)var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setSelectedComponent((java.awt.Component)var50);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var10 = var9.getRootPane();
    java.awt.Point var11 = var9.location();
    java.awt.Component var12 = var0.getComponentAt(var11);
    javax.swing.event.AncestorListener[] var13 = var0.getAncestorListeners();
    boolean var14 = var0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    com.allenstudio.ir.ui.StatusBar var30 = new com.allenstudio.ir.ui.StatusBar();
    int var31 = var30.getY();
    javax.swing.JToolTip var32 = var30.createToolTip();
    javax.swing.JToolTip var33 = var32.createToolTip();
    boolean var34 = var33.isFocusable();
    com.allenstudio.ir.ui.StatusBar var35 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var36 = var35.getRootPane();
    java.awt.Point var37 = var35.location();
    com.allenstudio.ir.ui.Toolbar var38 = new com.allenstudio.ir.ui.Toolbar();
    boolean var39 = var38.isFloatable();
    java.awt.Component var41 = var38.getComponentAtIndex(10);
    java.lang.Object var42 = var35.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var43 = var35.getMaximumSize();
    var33.resize(var43);
    int var45 = var33.getY();
    com.allenstudio.ir.ui.StatusBar var46 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var47 = new com.allenstudio.ir.core.plugins.CommonNote();
    var47.setFocusTraversalPolicyProvider(false);
    var46.remove((java.awt.Component)var47);
    com.allenstudio.ir.ui.StatusBar var51 = new com.allenstudio.ir.ui.StatusBar();
    int var52 = var51.getY();
    javax.swing.JToolTip var53 = var51.createToolTip();
    java.awt.Insets var54 = var53.getInsets();
    java.awt.Insets var55 = var47.getInsets(var54);
    java.awt.Insets var56 = var33.getInsets(var55);
    boolean var57 = var33.isManagingFocus();
    var33.setIgnoreRepaint(true);
    int var60 = var0.indexOfTabComponent((java.awt.Component)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Rectangle var62 = var0.getBoundsAt(4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    java.beans.PropertyChangeListener[] var6 = var0.getPropertyChangeListeners("Title");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    var0.removeAll();
    javax.swing.KeyStroke[] var6 = var0.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    var6.setSelected(true);
    boolean var18 = var6.isFocusTraversalPolicySet();
    java.awt.Dimension var19 = var6.getPreferredSize();
    java.awt.Dimension var20 = var0.getSize(var19);
    java.awt.Image var21 = var0.getIconImage();
    var0.reshape(4, 556, 4, 32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    java.lang.String var5 = var0.getOtherInfo();
    boolean var6 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.setWeekStartOnSunday(true);
    int var3 = var0.getMonth();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setYear(31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 6);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    java.awt.Rectangle var3 = var0.getMaximizedBounds();
    com.allenstudio.ir.ui.Toolbar var4 = new com.allenstudio.ir.ui.Toolbar();
    boolean var5 = var4.isFloatable();
    var4.setAutoscrolls(true);
    boolean var8 = var4.isCursorSet();
    var0.setGlassPane((java.awt.Component)var4);
    javax.swing.plaf.ToolBarUI var10 = var4.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    boolean var5 = var0.isOpaque();
    var0.firePropertyChange("Title", 100, 556);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var3 = var1.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var6 = var3.addSubElement("", "hi!");
    java.util.Hashtable var7 = var6.getAttributes();
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.awt.Rectangle var10 = var8.getMaximizedBounds();
    java.awt.MenuBar var11 = var8.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var12 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var8.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var12);
    var8.dispose();
    java.lang.Object var15 = var7.get((java.lang.Object)var8);
    java.util.Set var16 = var7.entrySet();
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement("Title", var7);
    java.util.Set var18 = var7.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    boolean var3 = var0.isManagingFocus();
    java.awt.Rectangle var4 = var0.bounds();
    boolean var5 = var0.requestFocusInWindow();
    var0.setFocusTraversalPolicyProvider(true);
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var10 = var9.getColorModel();
    java.awt.im.InputContext var11 = var9.getInputContext();
    java.awt.Component var13 = var9.getComponent(0);
    java.awt.Container var14 = var13.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var15 = var0.add("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", var13);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    var3.enable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    boolean var7 = var5.isFocusOwner();
    var5.firePropertyChange("hi!", 10L, 0L);
    var5.layout();
    var5.removeAll();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    java.awt.Point var17 = var5.getLocation(var16);
    var3.setLocation(var17);
    var0.setLocation(var17);
    java.awt.Color var20 = var0.getBackground();
    boolean var21 = var0.isShowing();
    var0.firePropertyChange(" ", 100L, (-1L));
    boolean var26 = var0.getFocusableWindowState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    var7.setData("Date Picker");
    java.lang.String var14 = var7.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    boolean var1 = var0.hasChanged();
    boolean var2 = var0.hasChanged();
    com.allenstudio.ir.util.XmlElement var4 = var0.addSubElement("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");
    boolean var5 = var0.hasChanged();
    java.lang.String var6 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    java.lang.String var3 = var0.getToolTipText();
    var0.layout();
    int var5 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    java.lang.String var7 = var0.toString();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var9 = var8.getMouseWheelListeners();
    java.awt.event.MouseListener[] var10 = var8.getMouseListeners();
    var8.firePropertyChange("", false, true);
    var0.add((java.awt.Component)var8, (java.lang.Object)10.0f);
    java.awt.event.HierarchyBoundsListener[] var17 = var8.getHierarchyBoundsListeners();
    com.allenstudio.ir.ui.Toolbar var18 = new com.allenstudio.ir.ui.Toolbar();
    boolean var19 = var18.isFloatable();
    var18.show();
    boolean var21 = var18.isRequestFocusEnabled();
    java.awt.Dimension var22 = var18.minimumSize();
    java.awt.Dimension var23 = var18.getMinimumSize();
    var8.resize(var23);
    var8.setSize(10, 1);
    var8.revalidate();
    var8.setLocation(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    java.util.Hashtable var6 = var5.getAttributes();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var8 = var7.getWarningString();
    java.awt.Rectangle var9 = var7.getMaximizedBounds();
    java.awt.MenuBar var10 = var7.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var11 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var7.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var11);
    var7.dispose();
    java.lang.Object var14 = var6.get((java.lang.Object)var7);
    boolean var15 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getUIClassID();
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "PanelUI"+ "'", var1.equals("PanelUI"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    var0.setTabLayoutPolicy(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    com.allenstudio.ir.ui.calendar.DateChooser var0 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var0.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.removeDateChooserListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    java.util.Hashtable var6 = var5.getAttributes();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var8 = var7.getWarningString();
    java.awt.Rectangle var9 = var7.getMaximizedBounds();
    java.awt.MenuBar var10 = var7.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var11 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var7.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var11);
    var7.dispose();
    java.lang.Object var14 = var6.get((java.lang.Object)var7);
    com.allenstudio.ir.util.XmlElement var15 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var17 = var15.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var20 = var17.addSubElement("", "hi!");
    java.util.Hashtable var21 = var20.getAttributes();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var23 = var22.getColorModel();
    var22.setEnabled(true);
    java.awt.ComponentOrientation var26 = var22.getComponentOrientation();
    java.lang.Object var27 = var6.put((java.lang.Object)var21, (java.lang.Object)var26);
    boolean var28 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    java.awt.event.KeyListener[] var33 = var0.getKeyListeners();
    com.allenstudio.ir.ui.StatusBar var34 = new com.allenstudio.ir.ui.StatusBar();
    int var35 = var34.getY();
    var34.disable();
    boolean var39 = var34.inside((-1), 100);
    boolean var40 = var34.isMaximumSizeSet();
    boolean var41 = var34.isFontSet();
    java.awt.Dimension var42 = var34.getMinimumSize();
    var0.remove((java.awt.Component)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var45 = var0.getTabComponentAt(32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    java.lang.String var1 = com.allenstudio.ir.util.InspirentoUtilities.escapeText("PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "PanelUI"+ "'", var1.equals("PanelUI"));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    boolean var5 = var2.isDisplayable();
    java.awt.Dimension var6 = var2.getPreferredSize();
    int var7 = var2.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    var0.toFront();
    java.awt.im.InputContext var4 = var0.getInputContext();
    java.awt.Graphics var5 = var0.getGraphics();
    float var6 = var0.getOpacity();
    float var7 = var0.getOpacity();
    java.awt.Point var8 = var0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    com.allenstudio.ir.ui.MainFrame var10 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var11 = var10.getWarningString();
    java.lang.String var12 = var10.getWarningString();
    java.awt.Container var13 = var10.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    boolean var15 = var14.isBackgroundSet();
    boolean var18 = var14.contains(10, 100);
    var14.revalidate();
    javax.swing.JToolTip var20 = var14.createToolTip();
    com.allenstudio.ir.ui.StatusBar var21 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var22 = var21.getRootPane();
    java.awt.Point var23 = var21.location();
    com.allenstudio.ir.ui.StatusBar var24 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var25 = var24.getRootPane();
    java.awt.Point var26 = var24.location();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    java.lang.Object var31 = var24.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var32 = var24.getMaximumSize();
    var21.setMinimumSize(var32);
    java.awt.Rectangle var34 = var21.getBounds();
    var14.scrollRectToVisible(var34);
    var10.setMaximizedBounds(var34);
    java.awt.Image var37 = var10.getIconImage();
    var2.setNextFocusableComponent((java.awt.Component)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    var3.enable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    boolean var7 = var5.isFocusOwner();
    var5.firePropertyChange("hi!", 10L, 0L);
    var5.layout();
    var5.removeAll();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    java.awt.Point var17 = var5.getLocation(var16);
    var3.setLocation(var17);
    var0.setLocation(var17);
    java.awt.Color var20 = var0.getBackground();
    boolean var21 = var0.isShowing();
    var0.firePropertyChange(" ", 100L, (-1L));
    var0.setTitle("Date Picker");
    int var28 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.event.WindowFocusListener[] var8 = var0.getWindowFocusListeners();
    boolean var9 = var0.isFocused();
    var0.repaint(100L, 31, 100, 1, 1);
    java.awt.Shape var16 = var0.getShape();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    java.awt.Component var20 = var17.getComponentAtIndex(10);
    java.lang.Object var21 = var14.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var22 = var14.getMaximumSize();
    var11.setMinimumSize(var22);
    java.awt.Rectangle var24 = var11.getBounds();
    var4.scrollRectToVisible(var24);
    var0.setMaximizedBounds(var24);
    javax.swing.TransferHandler var27 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var4 = new com.allenstudio.ir.core.plugins.CommonNote();
    var4.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var8 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var4);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var17 = var16.getRootPane();
    java.awt.Point var18 = var16.location();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    boolean var23 = var22.isFloatable();
    java.awt.Component var25 = var22.getComponentAtIndex(10);
    java.lang.Object var26 = var19.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var27 = var19.getMaximumSize();
    var16.setMinimumSize(var27);
    java.awt.Rectangle var29 = var16.getBounds();
    var9.scrollRectToVisible(var29);
    var4.repaint(var29);
    var0.setMaximizedBounds(var29);
    com.allenstudio.ir.ui.MainFrame var33 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var34 = var33.getWarningString();
    java.awt.Rectangle var35 = var33.getMaximizedBounds();
    java.awt.MenuBar var36 = var33.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var37 = new com.allenstudio.ir.core.plugins.CommonNote();
    var37.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var41 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var37);
    com.allenstudio.ir.ui.StatusBar var42 = new com.allenstudio.ir.ui.StatusBar();
    boolean var43 = var42.isBackgroundSet();
    boolean var46 = var42.contains(10, 100);
    var42.revalidate();
    javax.swing.JToolTip var48 = var42.createToolTip();
    com.allenstudio.ir.ui.StatusBar var49 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var50 = var49.getRootPane();
    java.awt.Point var51 = var49.location();
    com.allenstudio.ir.ui.StatusBar var52 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var53 = var52.getRootPane();
    java.awt.Point var54 = var52.location();
    com.allenstudio.ir.ui.Toolbar var55 = new com.allenstudio.ir.ui.Toolbar();
    boolean var56 = var55.isFloatable();
    java.awt.Component var58 = var55.getComponentAtIndex(10);
    java.lang.Object var59 = var52.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var60 = var52.getMaximumSize();
    var49.setMinimumSize(var60);
    java.awt.Rectangle var62 = var49.getBounds();
    var42.scrollRectToVisible(var62);
    var37.repaint(var62);
    var33.setMaximizedBounds(var62);
    var0.setBounds(var62);
    boolean var67 = var0.isValidateRoot();
    com.allenstudio.ir.ui.MainFrame var68 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var69 = var68.getWarningString();
    java.lang.String var70 = var68.getWarningString();
    var68.toFront();
    java.awt.im.InputContext var72 = var68.getInputContext();
    java.awt.Graphics var73 = var68.getGraphics();
    java.awt.Dialog.ModalExclusionType var74 = var68.getModalExclusionType();
    var0.setModalExclusionType(var74);
    com.allenstudio.ir.ui.StatusBar var76 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var77 = var76.getRootPane();
    java.awt.Point var78 = var76.location();
    var0.setLocation(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var1 = var0.getDateBackground();
    var0.setYearMonth(1, (-1));
    java.util.Calendar var5 = var0.getSelectedDate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setMarked(0, false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.StatusBar var34 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var35 = new com.allenstudio.ir.core.plugins.CommonNote();
    var35.setFocusTraversalPolicyProvider(false);
    var34.remove((java.awt.Component)var35);
    var35.setFeature("ToolBarUI");
    javax.swing.Icon var41 = var35.getIcon();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setIconAt(32, var41);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    boolean var6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.event.HierarchyBoundsListener[] var7 = var0.getHierarchyBoundsListeners();
    var0.firePropertyChange("Inspirento - alpha 0.86", (byte)1, (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    com.allenstudio.ir.util.InspirentoUtilities var0 = new com.allenstudio.ir.util.InspirentoUtilities();
    com.allenstudio.ir.event.NoteListDataEvent var2 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var0, 1);
    int var3 = var2.getIndex();
    int var4 = var2.getType();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    var7.setData("Date Picker");
    com.allenstudio.ir.util.XmlElement var16 = var7.addSubElement("hi!", "hi!");
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement();
    boolean var18 = var17.hasChanged();
    boolean var19 = var17.hasChanged();
    java.util.Hashtable var20 = var17.getAttributes();
    boolean var21 = var16.addElement(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    char[] var2 = new char[] { 'a'};
    var0.ignorableWhitespace(var2, 0, (-1));
    var0.notationDecl("hi!", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", "PanelUI");
    var0.processingInstruction("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", "com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var11 = var0.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    java.lang.String var13 = var0.getAttribute("TabbedPaneUI");
    com.allenstudio.ir.ui.MainFrame var14 = new com.allenstudio.ir.ui.MainFrame();
    boolean var15 = var14.isShowing();
    var14.setAutoRequestFocus(false);
    var14.setTitle("PanelUI");
    var0.notifyObservers((java.lang.Object)"PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.pack();
    var0.setFocusCycleRoot(false);
    var0.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var13 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var14 = var13.getWarningString();
    java.lang.String var15 = var13.getWarningString();
    boolean var16 = var13.isAutoRequestFocus();
    boolean var17 = var13.isResizable();
    javax.swing.JLayeredPane var18 = var13.getLayeredPane();
    int var19 = var18.getX();
    var0.setGlassPane((java.awt.Component)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUndecorated(false);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.event.WindowListener[] var8 = var0.getWindowListeners();
    boolean var9 = var0.isShowing();
    boolean var10 = var0.isResizable();
    java.awt.Dimension var11 = var0.minimumSize();
    java.awt.Window.Type var12 = var0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    int var1 = var0.getCellCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 5);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    java.awt.Component[] var70 = var0.getComponents();
    java.awt.dnd.DropTarget var71 = var0.getDropTarget();
    java.awt.Component var73 = var0.getTabComponentAt(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isValidateRoot();
    var0.addSeparator();
    java.awt.event.FocusListener[] var8 = var0.getFocusListeners();
    javax.accessibility.AccessibleContext var9 = var0.getAccessibleContext();
    var0.setLocation((-1), 100);
    var0.addSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var1 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var2 = var1.getWarningString();
    java.awt.Rectangle var3 = var1.getMaximizedBounds();
    java.awt.MenuBar var4 = var1.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    var5.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var9 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var5);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    boolean var11 = var10.isBackgroundSet();
    boolean var14 = var10.contains(10, 100);
    var10.revalidate();
    javax.swing.JToolTip var16 = var10.createToolTip();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    boolean var24 = var23.isFloatable();
    java.awt.Component var26 = var23.getComponentAtIndex(10);
    java.lang.Object var27 = var20.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var28 = var20.getMaximumSize();
    var17.setMinimumSize(var28);
    java.awt.Rectangle var30 = var17.getBounds();
    var10.scrollRectToVisible(var30);
    var5.repaint(var30);
    var1.setMaximizedBounds(var30);
    int var36 = var0.getScrollableBlockIncrement(var30, 1, 4);
    var0.updateUI();
    int var38 = var0.getCellCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    javax.swing.SingleSelectionModel var30 = var0.getModel();
    int var31 = var0.getTabPlacement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var33 = var0.getTabComponentAt(32);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    com.allenstudio.ir.ui.calendar.DateChooser var0 = new com.allenstudio.ir.ui.calendar.DateChooser();
    boolean var2 = var0.requestFocus(false);
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    boolean var4 = var3.isBackgroundSet();
    var3.repaint(100L);
    int var7 = var3.getWidth();
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.lang.String var10 = var8.getWarningString();
    java.awt.Container var11 = var8.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    boolean var13 = var12.isBackgroundSet();
    boolean var16 = var12.contains(10, 100);
    var12.revalidate();
    javax.swing.JToolTip var18 = var12.createToolTip();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var20 = var19.getRootPane();
    java.awt.Point var21 = var19.location();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var23 = var22.getRootPane();
    java.awt.Point var24 = var22.location();
    com.allenstudio.ir.ui.Toolbar var25 = new com.allenstudio.ir.ui.Toolbar();
    boolean var26 = var25.isFloatable();
    java.awt.Component var28 = var25.getComponentAtIndex(10);
    java.lang.Object var29 = var22.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var30 = var22.getMaximumSize();
    var19.setMinimumSize(var30);
    java.awt.Rectangle var32 = var19.getBounds();
    var12.scrollRectToVisible(var32);
    var8.setMaximizedBounds(var32);
    var3.computeVisibleRect(var32);
    var0.paintImmediately(var32);
    float var37 = var0.getAlignmentY();
    boolean var38 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    java.awt.Component var20 = var17.getComponentAtIndex(10);
    java.lang.Object var21 = var14.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var22 = var14.getMaximumSize();
    var11.setMinimumSize(var22);
    java.awt.Rectangle var24 = var11.getBounds();
    var4.scrollRectToVisible(var24);
    var0.setMaximizedBounds(var24);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var28 = var27.getColorModel();
    var27.setEnabled(true);
    java.awt.ComponentOrientation var31 = var27.getComponentOrientation();
    boolean var32 = var27.isFloatable();
    com.allenstudio.ir.core.plugins.CommonNote var33 = new com.allenstudio.ir.core.plugins.CommonNote();
    var33.resize(0, 1);
    java.lang.String var37 = var33.getOtherInfo();
    com.allenstudio.ir.core.plugins.CommonNote var38 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var39 = var38.getFeature();
    com.allenstudio.ir.ui.StatusBar var40 = new com.allenstudio.ir.ui.StatusBar();
    var40.enable();
    boolean var42 = var40.isFocusOwner();
    var40.firePropertyChange("hi!", 10L, 0L);
    var40.layout();
    var40.removeAll();
    com.allenstudio.ir.ui.StatusBar var49 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var50 = var49.getRootPane();
    java.awt.Point var51 = var49.location();
    java.awt.Component var52 = var40.getComponentAt(var51);
    java.awt.Point var53 = var38.getLocation(var51);
    java.awt.Component var54 = var33.getComponentAt(var53);
    java.awt.Point var55 = var27.getLocation(var53);
    var0.setLocation(var53);
    boolean var57 = var0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "C:\\boot.ini"+ "'", var39.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    boolean var9 = var0.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var10 = var0.getContentPaneBorder();
    var0.setName("ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponent(0);
    java.awt.Font var5 = var0.getFont();
    var0.setFloatable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    java.awt.event.InputMethodListener[] var8 = var0.getInputMethodListeners();
    var0.addSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    javax.swing.border.Border var8 = var0.getContentPaneBorder();
    javax.swing.KeyStroke[] var9 = var0.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    com.allenstudio.ir.ui.MainFrame var9 = new com.allenstudio.ir.ui.MainFrame();
    boolean var10 = var9.isShowing();
    int var11 = var9.countComponents();
    var9.setAutoRequestFocus(false);
    javax.swing.JMenuBar var14 = var9.getJMenuBar();
    boolean var15 = var14.isBorderPainted();
    var14.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var17 = new com.allenstudio.ir.ui.DatePickerPane();
    var17.transferFocus();
    java.awt.Dimension var19 = var17.getMinimumSize();
    java.awt.Dimension var20 = var14.getSize(var19);
    javax.swing.plaf.MenuBarUI var21 = var14.getUI();
    var5.setUI(var21);
    boolean var23 = var5.isBorderPainted();
    java.awt.Component var24 = var5.getComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    char[] var2 = new char[] { 'a'};
    var0.ignorableWhitespace(var2, 0, (-1));
    com.allenstudio.ir.util.XmlIO var6 = new com.allenstudio.ir.util.XmlIO();
    var6.errorDialog("hi!");
    char[] var11 = new char[] { 'a', '4'};
    var6.ignorableWhitespace(var11, 100, 0);
    var0.ignorableWhitespace(var11, 10, 0);
    var0.startPrefixMapping("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    boolean var4 = var0.isCursorSet();
    java.awt.Image var7 = var0.createImage(0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    boolean var3 = var0.isLocationByPlatform();
    int var4 = var0.getY();
    var0.setSize(100, 10);
    var0.firePropertyChange("MenuBarUI", 'a', ' ');
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    java.awt.im.InputContext var14 = var12.getInputContext();
    java.awt.Component var16 = var12.getComponent(0);
    java.awt.Font var17 = var12.getFont();
    var0.setFont(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    java.awt.Color var3 = var0.getBackground();
    java.awt.event.ComponentListener[] var4 = var0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var1 = var0.getUI();
    var0.enable();
    java.util.GregorianCalendar var3 = var0.reportSelectedDate();
    javax.swing.JToolBar var4 = var0.getToolBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    int var10 = var4.indexAtLocation(10, (-1));
    boolean var11 = var4.isDisplayable();
    var4.setSize(4, 0);
    var4.setSelectedIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    com.allenstudio.ir.util.XmlElement var15 = var14.getParent();
    boolean var17 = var14.equals((java.lang.Object)0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    boolean var12 = var0.isFocusTraversalPolicySet();
    boolean var13 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.firePropertyChange("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", ' ', ' ');
    var0.setSize(1, 31);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var5 = var2.getData();
    com.allenstudio.ir.ui.Toolbar var6 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var7 = var6.getColorModel();
    var6.setEnabled(true);
    java.awt.Component var11 = var6.getComponentAtIndex(1);
    boolean var12 = var6.isValidateRoot();
    boolean var13 = var2.equals((java.lang.Object)var12);
    com.allenstudio.ir.util.XmlElement var15 = var2.getElement("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    var11.setMonth(4);
    com.allenstudio.ir.ui.Toolbar var15 = new com.allenstudio.ir.ui.Toolbar();
    boolean var16 = var15.isFloatable();
    var15.show();
    java.awt.image.ColorModel var18 = var15.getColorModel();
    boolean var19 = var15.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var20 = new com.allenstudio.ir.ui.DatePickerPane();
    var20.transferFocus();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var23 = var22.getColorModel();
    var22.setEnabled(true);
    java.awt.Component var27 = var22.getComponentAtIndex(1);
    boolean var28 = var22.isFloatable();
    var20.setContent((java.awt.Component)var22);
    java.awt.Font var30 = var20.getFont();
    java.awt.FontMetrics var31 = var15.getFontMetrics(var30);
    var11.setHeaderFont(var30);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var33 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    javax.swing.JComponent var34 = var33.getHeaderComponent();
    java.awt.Color var35 = var33.getDateForeground();
    var11.setHeaderForeground(var35);
    boolean var37 = var11.getWeekStartOnSunday();
    com.allenstudio.ir.ui.calendar.IMonthlyCalendarModel var38 = var11.getModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setYear(32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.event.WindowListener[] var8 = var0.getWindowListeners();
    boolean var9 = var0.isShowing();
    boolean var10 = var0.isResizable();
    java.awt.Dimension var11 = var0.minimumSize();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var19 = var12.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var21 = var12.getPropertyChangeListeners("Date Picker");
    boolean var22 = var12.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var23 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var12.removeMouseListener((java.awt.event.MouseListener)var23);
    com.allenstudio.ir.ui.MainFrame var25 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var26 = var25.getWarningString();
    java.lang.String var27 = var25.getWarningString();
    boolean var28 = var25.isAutoRequestFocus();
    com.allenstudio.ir.ui.DatePickerPane var29 = new com.allenstudio.ir.ui.DatePickerPane();
    var29.transferFocus();
    java.awt.Dimension var31 = var29.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var32 = new com.allenstudio.ir.ui.StatusBar();
    int var33 = var32.getY();
    javax.swing.JToolTip var34 = var32.createToolTip();
    float var35 = var34.getAlignmentY();
    java.awt.Color var36 = var34.getForeground();
    var29.setBackground(var36);
    var25.setGlassPane((java.awt.Component)var29);
    com.allenstudio.ir.ui.StatusBar var39 = new com.allenstudio.ir.ui.StatusBar();
    int var40 = var39.getY();
    javax.swing.JToolTip var41 = var39.createToolTip();
    float var42 = var41.getAlignmentY();
    java.awt.Color var43 = var41.getForeground();
    var25.setBackground(var43);
    var23.setDateBackground(var43);
    var0.setForeground(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabRunCount();
    var0.setMnemonicAt(0, 31);
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var0.setTabComponentAt(0, (java.awt.Component)var35);
    com.allenstudio.ir.ui.StatusBar var39 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var40 = var39.getRootPane();
    java.awt.Point var41 = var39.location();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    boolean var43 = var42.isFloatable();
    java.awt.Component var45 = var42.getComponentAtIndex(10);
    java.lang.Object var46 = var39.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var47 = var39.getMaximumSize();
    javax.swing.InputMap var48 = var39.getInputMap();
    var0.setInputMap(1, var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    var0.setFocusTraversalKeysEnabled(true);
    com.allenstudio.ir.ui.MainFrame var32 = new com.allenstudio.ir.ui.MainFrame();
    java.awt.Component var33 = var32.getGlassPane();
    java.awt.Component var34 = var0.add(var33);
    var34.setFocusTraversalKeysEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isValidateRoot();
    java.awt.LayoutManager var7 = var0.getLayout();
    boolean var8 = var0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Font var10 = var0.getFont();
    java.awt.Component.BaselineResizeBehavior var11 = var0.getBaselineResizeBehavior();
    boolean var12 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    boolean var11 = var2.requestFocusInWindow();
    var2.setDoubleBuffered(true);
    boolean var14 = var2.requestDefaultFocus();
    java.beans.PropertyChangeListener[] var15 = var2.getPropertyChangeListeners();
    var2.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    java.lang.String var71 = var34.getTitleAt(0);
    java.util.Locale var72 = var34.getLocale();
    com.allenstudio.ir.ui.StatusBar var73 = new com.allenstudio.ir.ui.StatusBar();
    var73.enable();
    boolean var75 = var73.isFocusOwner();
    var73.repaint(100L, 32, 4, 32, 4);
    var34.remove((java.awt.Component)var73);
    var34.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    var0.disable();
    java.awt.Dimension var5 = var0.getSize();
    java.beans.PropertyChangeListener[] var7 = var0.getPropertyChangeListeners("Title");
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var15 = var8.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var17 = var8.getPropertyChangeListeners("Date Picker");
    boolean var18 = var8.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var19 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var8.removeMouseListener((java.awt.event.MouseListener)var19);
    var19.setMonth(4);
    boolean var23 = var19.getMouseListeningEnabled();
    var0.addMouseMotionListener((java.awt.event.MouseMotionListener)var19);
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    var0.pack();
    boolean var6 = var0.isFocusOwner();
    boolean var7 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    var3.enable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    boolean var7 = var5.isFocusOwner();
    var5.firePropertyChange("hi!", 10L, 0L);
    var5.layout();
    var5.removeAll();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    java.awt.Point var17 = var5.getLocation(var16);
    var3.setLocation(var17);
    var0.setLocation(var17);
    java.awt.Color var20 = var0.getBackground();
    java.awt.Component var21 = var0.getFocusOwner();
    float var22 = var0.getOpacity();
    java.awt.Component var23 = var0.getGlassPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var1 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var2 = var1.getWarningString();
    java.awt.Rectangle var3 = var1.getMaximizedBounds();
    java.awt.MenuBar var4 = var1.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    var5.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var9 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var5);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    boolean var11 = var10.isBackgroundSet();
    boolean var14 = var10.contains(10, 100);
    var10.revalidate();
    javax.swing.JToolTip var16 = var10.createToolTip();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    boolean var24 = var23.isFloatable();
    java.awt.Component var26 = var23.getComponentAtIndex(10);
    java.lang.Object var27 = var20.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var28 = var20.getMaximumSize();
    var17.setMinimumSize(var28);
    java.awt.Rectangle var30 = var17.getBounds();
    var10.scrollRectToVisible(var30);
    var5.repaint(var30);
    var1.setMaximizedBounds(var30);
    int var36 = var0.getScrollableBlockIncrement(var30, 1, 4);
    var0.requestFocus();
    int var38 = var0.getCellCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 5);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var28 = var27.getColorModel();
    var27.setEnabled(true);
    var0.add((java.awt.Component)var27, (java.lang.Object)100L, 0);
    boolean var34 = var27.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    var0.resetHighlight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setYear(31);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    var0.unparsedEntityDecl("", "hi!", "", "");
    com.allenstudio.ir.util.XmlIO var6 = new com.allenstudio.ir.util.XmlIO();
    char[] var8 = new char[] { 'a'};
    var6.ignorableWhitespace(var8, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var8, 4, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    char[] var2 = new char[] { 'a'};
    var0.ignorableWhitespace(var2, 0, (-1));
    var0.endPrefixMapping("PanelUI");
    var0.startDocument();
    org.xml.sax.InputSource var11 = var0.resolveEntity("PanelUI", "com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var5 = var4.getRootPane();
    java.awt.Point var6 = var4.location();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var8 = var7.getRootPane();
    java.awt.Point var9 = var7.location();
    com.allenstudio.ir.ui.Toolbar var10 = new com.allenstudio.ir.ui.Toolbar();
    boolean var11 = var10.isFloatable();
    java.awt.Component var13 = var10.getComponentAtIndex(10);
    java.lang.Object var14 = var7.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var15 = var7.getMaximumSize();
    var4.setMinimumSize(var15);
    var0.addSeparator(var15);
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.setDebugGraphicsOptions(0);
    var0.firePropertyChange("hi!", 100, 10);
    var0.firePropertyChange("ToolBarUI", false, true);
    java.awt.event.ComponentListener[] var12 = var0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    java.awt.Color var3 = var0.getBackground();
    var0.repaint(100L, 100, 1, 1, 0);
    java.awt.im.InputContext var10 = var0.getInputContext();
    javax.swing.TransferHandler var11 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    boolean var9 = var0.areFocusTraversalKeysSet(0);
    java.lang.String var10 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.repaint(100L, 32, 4, 32, 4);
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    boolean var10 = var9.isBackgroundSet();
    boolean var13 = var9.contains(10, 100);
    var9.revalidate();
    javax.swing.JToolTip var15 = var9.createToolTip();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    var16.enable();
    boolean var18 = var16.isFocusOwner();
    var16.firePropertyChange("hi!", 10L, 0L);
    var16.layout();
    java.awt.Dimension var24 = var16.getMaximumSize();
    java.awt.Dimension var25 = var9.getSize(var24);
    var0.setSize(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    boolean var5 = var2.isMaximumSizeSet();
    java.awt.event.ComponentListener[] var6 = var2.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    int var3 = var0.indexAtLocation(100, 32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getMnemonicAt(556);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isValidateRoot();
    var0.addSeparator();
    boolean var10 = var0.contains(4, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    var0.setAutoRequestFocus(true);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    int var11 = var10.getY();
    javax.swing.JToolTip var12 = var10.createToolTip();
    java.awt.Insets var13 = var12.getInsets();
    var0.setGlassPane((java.awt.Component)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.NoteListsTabPane var33 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    boolean var35 = var34.isFloatable();
    var34.show();
    java.awt.image.ColorModel var37 = var34.getColorModel();
    boolean var38 = var34.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var39 = new com.allenstudio.ir.ui.DatePickerPane();
    var39.transferFocus();
    com.allenstudio.ir.ui.Toolbar var41 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var42 = var41.getColorModel();
    var41.setEnabled(true);
    java.awt.Component var46 = var41.getComponentAtIndex(1);
    boolean var47 = var41.isFloatable();
    var39.setContent((java.awt.Component)var41);
    java.awt.Dimension var49 = var39.size();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    var50.show();
    boolean var53 = var50.isRequestFocusEnabled();
    java.awt.Dimension var54 = var50.minimumSize();
    var39.setToolBar((javax.swing.JToolBar)var50);
    java.awt.Image var58 = var39.createImage(10, (-1));
    var33.add((java.awt.Component)var34, (java.lang.Object)10);
    var33.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var62 = var33.getUI();
    javax.swing.SingleSelectionModel var63 = var33.getModel();
    var0.setModel(var63);
    javax.swing.event.ChangeListener[] var65 = var0.getChangeListeners();
    java.awt.Component var67 = var0.getTabComponentAt(4);
    java.awt.Insets var68 = var0.getInsets();
    javax.accessibility.AccessibleContext var69 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    java.lang.String var71 = var34.getTitleAt(0);
    var34.transferFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var74 = var34.getTitleAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    java.awt.Color var3 = var0.getBackground();
    java.awt.Component var4 = var0.getGlassPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    com.allenstudio.ir.util.InspirentoUtilities var0 = new com.allenstudio.ir.util.InspirentoUtilities();
    com.allenstudio.ir.event.NoteListDataEvent var2 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var0, 1);
    int var3 = var2.getIndex();
    java.lang.Object var4 = var2.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var5 = var2.getData();
    java.lang.String var8 = var2.getAttribute("", "");
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    var11.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var14 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var16 = var14.addSubElement("hi!");
    var16.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var19 = var11.removeElement(var16);
    com.allenstudio.ir.util.XmlElement var20 = var2.removeElement(var16);
    boolean var21 = var2.hasChanged();
    com.allenstudio.ir.util.XmlElement var22 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var24 = var22.addSubElement("hi!");
    var24.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var27 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var29 = var27.addSubElement("hi!");
    var29.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var32 = var24.removeElement(var29);
    com.allenstudio.ir.util.XmlElement var33 = var29.getParent();
    com.allenstudio.ir.util.XmlElement var34 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var36 = var34.addSubElement("hi!");
    var36.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var39 = var36.getData();
    com.allenstudio.ir.util.XmlElement var40 = var29.addSubElement(var36);
    var2.append(var40);
    com.allenstudio.ir.util.XmlElement.printNode(var40, " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    boolean var34 = var27.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    boolean var5 = var0.isManagingFocus();
    boolean var7 = var0.areFocusTraversalKeysSet(0);
    var0.setOpaque(true);
    var0.setRequestFocusEnabled(true);
    var0.setRollover(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var10 = var9.getRootPane();
    java.awt.Point var11 = var9.location();
    java.awt.Point var12 = var0.getLocation(var11);
    boolean var13 = var0.isDoubleBuffered();
    com.allenstudio.ir.ui.DatePickerPane var14 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var15 = var14.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    int var17 = var16.getY();
    javax.swing.JToolTip var18 = var16.createToolTip();
    float var19 = var18.getAlignmentY();
    java.awt.Color var20 = var18.getForeground();
    var14.setBackground(var20);
    com.allenstudio.ir.ui.MainFrame var22 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var23 = var22.getWarningString();
    boolean var24 = var22.isAlwaysOnTopSupported();
    com.allenstudio.ir.ui.StatusBar var25 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var26 = var25.getRootPane();
    java.awt.Point var27 = var25.location();
    com.allenstudio.ir.ui.StatusBar var28 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var29 = var28.getRootPane();
    java.awt.Point var30 = var28.location();
    com.allenstudio.ir.ui.Toolbar var31 = new com.allenstudio.ir.ui.Toolbar();
    boolean var32 = var31.isFloatable();
    java.awt.Component var34 = var31.getComponentAtIndex(10);
    java.lang.Object var35 = var28.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var36 = var28.getMaximumSize();
    var25.setMinimumSize(var36);
    java.awt.Rectangle var38 = var25.getBounds();
    java.awt.Rectangle var39 = var22.getBounds(var38);
    java.awt.Rectangle var40 = var14.getBounds(var38);
    var0.setBounds(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "PanelUI"+ "'", var15.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.pack();
    var0.setFocusCycleRoot(false);
    var0.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var13 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var14 = var13.getWarningString();
    java.lang.String var15 = var13.getWarningString();
    boolean var16 = var13.isAutoRequestFocus();
    boolean var17 = var13.isResizable();
    javax.swing.JLayeredPane var18 = var13.getLayeredPane();
    int var19 = var18.getX();
    var0.setGlassPane((java.awt.Component)var18);
    java.lang.String var21 = var0.getTitle();
    java.awt.Shape var22 = var0.getShape();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Inspirento - alpha 0.86"+ "'", var21.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    boolean var6 = var5.isFloatable();
    var5.show();
    java.awt.image.ColorModel var8 = var5.getColorModel();
    boolean var9 = var5.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    java.awt.Image var29 = var10.createImage(10, (-1));
    var4.add((java.awt.Component)var5, (java.lang.Object)10);
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.Icon var33 = var4.getDisabledIconAt(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var11 = var0.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    java.lang.String var14 = var0.getAttribute("Title", "Date Picker");
    java.lang.String var17 = var0.getAttribute("", "ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Date Picker"+ "'", var14.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "ToolBarUI"+ "'", var17.equals("ToolBarUI"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    var34.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var63 = var34.getUI();
    var0.setUI(var63);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Rectangle var66 = var0.getBoundsAt(556);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.event.WindowFocusListener[] var8 = var0.getWindowFocusListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var10 = var0.getFocusTraversalKeys(6);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    boolean var3 = var0.isLocationByPlatform();
    int var4 = var0.getY();
    java.awt.Component var5 = var0.getMostRecentFocusOwner();
    float var6 = var0.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0f);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.NoteListsTabPane var33 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    boolean var35 = var34.isFloatable();
    var34.show();
    java.awt.image.ColorModel var37 = var34.getColorModel();
    boolean var38 = var34.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var39 = new com.allenstudio.ir.ui.DatePickerPane();
    var39.transferFocus();
    com.allenstudio.ir.ui.Toolbar var41 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var42 = var41.getColorModel();
    var41.setEnabled(true);
    java.awt.Component var46 = var41.getComponentAtIndex(1);
    boolean var47 = var41.isFloatable();
    var39.setContent((java.awt.Component)var41);
    java.awt.Dimension var49 = var39.size();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    var50.show();
    boolean var53 = var50.isRequestFocusEnabled();
    java.awt.Dimension var54 = var50.minimumSize();
    var39.setToolBar((javax.swing.JToolBar)var50);
    java.awt.Image var58 = var39.createImage(10, (-1));
    var33.add((java.awt.Component)var34, (java.lang.Object)10);
    var33.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var62 = var33.getUI();
    javax.swing.SingleSelectionModel var63 = var33.getModel();
    var0.setModel(var63);
    javax.swing.event.ChangeListener[] var65 = var0.getChangeListeners();
    java.awt.Component var67 = var0.getTabComponentAt(4);
    java.awt.Insets var68 = var0.getInsets();
    com.allenstudio.ir.ui.StatusBar var69 = new com.allenstudio.ir.ui.StatusBar();
    int var70 = var69.getY();
    boolean var71 = var69.isLightweight();
    java.awt.Dimension var72 = var69.getMaximumSize();
    java.awt.event.KeyListener[] var73 = var69.getKeyListeners();
    boolean var74 = var69.getInheritsPopupMenu();
    var69.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var69.repaint(100L, 100, 1, 100, (-1));
    boolean var85 = var69.isOpaque();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var69);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabRunCount();
    com.allenstudio.ir.ui.DatePickerPane var32 = new com.allenstudio.ir.ui.DatePickerPane();
    var32.transferFocus();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var35 = var34.getColorModel();
    var34.setEnabled(true);
    java.awt.Component var39 = var34.getComponentAtIndex(1);
    boolean var40 = var34.isFloatable();
    var32.setContent((java.awt.Component)var34);
    java.awt.Color var42 = var34.getForeground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBackgroundAt(10, var42);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    java.awt.Component var7 = var0.getComponentAtIndex(1);
    java.awt.event.InputMethodListener[] var8 = var0.getInputMethodListeners();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.Dimension var10 = var9.size();
    java.awt.Dimension var11 = var0.getSize(var10);
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    int var13 = var12.getY();
    javax.swing.JToolTip var14 = var12.createToolTip();
    javax.swing.JToolTip var15 = var14.createToolTip();
    boolean var16 = var15.isFocusable();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.Toolbar var20 = new com.allenstudio.ir.ui.Toolbar();
    boolean var21 = var20.isFloatable();
    java.awt.Component var23 = var20.getComponentAtIndex(10);
    java.lang.Object var24 = var17.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var25 = var17.getMaximumSize();
    var15.resize(var25);
    int var27 = var15.getY();
    com.allenstudio.ir.ui.StatusBar var28 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var29 = new com.allenstudio.ir.core.plugins.CommonNote();
    var29.setFocusTraversalPolicyProvider(false);
    var28.remove((java.awt.Component)var29);
    com.allenstudio.ir.ui.StatusBar var33 = new com.allenstudio.ir.ui.StatusBar();
    int var34 = var33.getY();
    javax.swing.JToolTip var35 = var33.createToolTip();
    java.awt.Insets var36 = var35.getInsets();
    java.awt.Insets var37 = var29.getInsets(var36);
    java.awt.Insets var38 = var15.getInsets(var37);
    boolean var39 = var15.isManagingFocus();
    javax.swing.ActionMap var40 = var15.getActionMap();
    var0.setActionMap(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    javax.swing.JToolTip var3 = var2.createToolTip();
    boolean var4 = var3.isFocusable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var6 = var5.getRootPane();
    java.awt.Point var7 = var5.location();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    boolean var9 = var8.isFloatable();
    java.awt.Component var11 = var8.getComponentAtIndex(10);
    java.lang.Object var12 = var5.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var13 = var5.getMaximumSize();
    var3.resize(var13);
    int var15 = var3.getY();
    java.awt.Insets var16 = var3.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    var3.enable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    boolean var7 = var5.isFocusOwner();
    var5.firePropertyChange("hi!", 10L, 0L);
    var5.layout();
    var5.removeAll();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    java.awt.Point var17 = var5.getLocation(var16);
    var3.setLocation(var17);
    var0.setLocation(var17);
    java.awt.Color var20 = var0.getBackground();
    java.awt.Component var21 = var0.getFocusOwner();
    javax.accessibility.AccessibleContext var22 = var0.getAccessibleContext();
    java.lang.String var23 = var0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Inspirento - alpha 0.86"+ "'", var23.equals("Inspirento - alpha 0.86"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabRunCount();
    com.allenstudio.ir.ui.DatePickerPane var31 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var32 = var31.getContentPane();
    int var33 = var0.indexOfTabComponent((java.awt.Component)var31);
    javax.swing.JToolBar var34 = var31.getToolBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    javax.swing.JToolTip var3 = var2.createToolTip();
    boolean var4 = var3.isFocusable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var6 = var5.getRootPane();
    java.awt.Point var7 = var5.location();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    boolean var9 = var8.isFloatable();
    java.awt.Component var11 = var8.getComponentAtIndex(10);
    java.lang.Object var12 = var5.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var13 = var5.getMaximumSize();
    var3.resize(var13);
    int var15 = var3.getY();
    com.allenstudio.ir.ui.StatusBar var16 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var17 = new com.allenstudio.ir.core.plugins.CommonNote();
    var17.setFocusTraversalPolicyProvider(false);
    var16.remove((java.awt.Component)var17);
    com.allenstudio.ir.ui.StatusBar var21 = new com.allenstudio.ir.ui.StatusBar();
    int var22 = var21.getY();
    javax.swing.JToolTip var23 = var21.createToolTip();
    java.awt.Insets var24 = var23.getInsets();
    java.awt.Insets var25 = var17.getInsets(var24);
    java.awt.Insets var26 = var3.getInsets(var25);
    boolean var27 = var3.isManagingFocus();
    boolean var28 = var3.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    java.awt.Dimension var2 = var0.getMinimumSize();
    com.allenstudio.ir.core.plugins.CommonNote var3 = new com.allenstudio.ir.core.plugins.CommonNote();
    var3.setFocusTraversalPolicyProvider(false);
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    int var7 = var6.getY();
    javax.swing.JToolTip var8 = var6.createToolTip();
    float var9 = var8.getAlignmentY();
    java.awt.Color var10 = var8.getForeground();
    var3.remove((java.awt.Component)var8);
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    int var13 = var12.getY();
    boolean var14 = var12.isLightweight();
    java.awt.Dimension var15 = var12.getMaximumSize();
    java.awt.event.KeyListener[] var16 = var12.getKeyListeners();
    java.awt.ComponentOrientation var17 = var12.getComponentOrientation();
    var3.setComponentOrientation(var17);
    var0.setComponentOrientation(var17);
    int var20 = var0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = com.allenstudio.ir.ui.UIResources.getString("");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponent(0);
    var0.setEnabled(true);
    int var7 = var0.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    java.awt.Window[] var3 = var0.getOwnedWindows();
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.firePropertyChange("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", ' ', ' ');
    javax.swing.event.AncestorListener[] var5 = var0.getAncestorListeners();
    boolean var6 = var0.requestDefaultFocus();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    boolean var8 = var7.isBackgroundSet();
    var7.repaint(100L);
    var7.disable();
    java.awt.Dimension var12 = var7.getSize();
    java.beans.PropertyChangeListener[] var14 = var7.getPropertyChangeListeners("Title");
    var0.setNextFocusableComponent((java.awt.Component)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    var0.dispose();
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    var0.resize(0, 1);
    boolean var15 = var0.isFocusTraversalPolicySet();
    javax.accessibility.AccessibleContext var16 = var0.getAccessibleContext();
    com.allenstudio.ir.ui.MainFrame var17 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var18 = var17.getWarningString();
    java.awt.Rectangle var19 = var17.getMaximizedBounds();
    java.awt.MenuBar var20 = var17.getMenuBar();
    var17.removeNotify();
    var17.addNotify();
    var17.setState((-1));
    java.awt.event.WindowStateListener[] var25 = var17.getWindowStateListeners();
    com.allenstudio.ir.ui.NoteListsTabPane var26 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    var27.show();
    java.awt.image.ColorModel var30 = var27.getColorModel();
    boolean var31 = var27.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var32 = new com.allenstudio.ir.ui.DatePickerPane();
    var32.transferFocus();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var35 = var34.getColorModel();
    var34.setEnabled(true);
    java.awt.Component var39 = var34.getComponentAtIndex(1);
    boolean var40 = var34.isFloatable();
    var32.setContent((java.awt.Component)var34);
    java.awt.Dimension var42 = var32.size();
    com.allenstudio.ir.ui.Toolbar var43 = new com.allenstudio.ir.ui.Toolbar();
    boolean var44 = var43.isFloatable();
    var43.show();
    boolean var46 = var43.isRequestFocusEnabled();
    java.awt.Dimension var47 = var43.minimumSize();
    var32.setToolBar((javax.swing.JToolBar)var43);
    java.awt.Image var51 = var32.createImage(10, (-1));
    var26.add((java.awt.Component)var27, (java.lang.Object)10);
    var26.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var55 = var26.getUI();
    int var56 = var26.getTabCount();
    javax.accessibility.AccessibleContext var57 = var26.getAccessibleContext();
    com.allenstudio.ir.ui.StatusBar var58 = new com.allenstudio.ir.ui.StatusBar();
    int var59 = var58.getY();
    boolean var60 = var58.isLightweight();
    java.awt.Dimension var61 = var58.getMaximumSize();
    java.awt.event.KeyListener[] var62 = var58.getKeyListeners();
    boolean var63 = var58.getInheritsPopupMenu();
    var58.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var58.repaint(100L, 100, 1, 100, (-1));
    javax.swing.InputMap var74 = var58.getInputMap();
    java.awt.Dimension var75 = var58.getMinimumSize();
    var26.resize(var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var17, (java.lang.Object)var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JMenu var7 = var5.getHelpMenu();
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    com.allenstudio.ir.util.InspirentoUtilities var0 = new com.allenstudio.ir.util.InspirentoUtilities();
    com.allenstudio.ir.event.NoteListDataEvent var2 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var0, 1);
    int var3 = var2.getIndex();
    int var4 = var2.getType();
    int var5 = var2.getIndex();
    int var6 = var2.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    var0.setTitle("Title");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    java.lang.String var9 = var5.getUIClassID();
    java.awt.Component var11 = var5.getComponentAtIndex((-1));
    boolean var12 = var5.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MenuBarUI"+ "'", var9.equals("MenuBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    java.awt.Component var6 = var5.getComponent();
    java.awt.Insets var7 = var5.getMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    int var9 = var5.getMenuCount();
    javax.swing.SingleSelectionModel var10 = var5.getSelectionModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    java.lang.String var7 = var0.toString();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var9 = var8.getMouseWheelListeners();
    java.awt.event.MouseListener[] var10 = var8.getMouseListeners();
    var8.firePropertyChange("", false, true);
    var0.add((java.awt.Component)var8, (java.lang.Object)10.0f);
    java.awt.event.HierarchyBoundsListener[] var17 = var8.getHierarchyBoundsListeners();
    boolean var19 = var8.areFocusTraversalKeysSet(1);
    com.allenstudio.ir.ui.StatusBar var21 = new com.allenstudio.ir.ui.StatusBar();
    int var22 = var21.getY();
    java.awt.Dimension var23 = var21.getMaximumSize();
    javax.swing.InputMap var24 = var21.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.setInputMap(32, var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    var0.toFront();
    java.awt.im.InputContext var4 = var0.getInputContext();
    java.awt.Graphics var5 = var0.getGraphics();
    float var6 = var0.getOpacity();
    float var7 = var0.getOpacity();
    boolean var8 = var0.isAutoRequestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    var11.setMonth(4);
    com.allenstudio.ir.ui.Toolbar var15 = new com.allenstudio.ir.ui.Toolbar();
    boolean var16 = var15.isFloatable();
    var15.show();
    java.awt.image.ColorModel var18 = var15.getColorModel();
    boolean var19 = var15.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var20 = new com.allenstudio.ir.ui.DatePickerPane();
    var20.transferFocus();
    com.allenstudio.ir.ui.Toolbar var22 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var23 = var22.getColorModel();
    var22.setEnabled(true);
    java.awt.Component var27 = var22.getComponentAtIndex(1);
    boolean var28 = var22.isFloatable();
    var20.setContent((java.awt.Component)var22);
    java.awt.Font var30 = var20.getFont();
    java.awt.FontMetrics var31 = var15.getFontMetrics(var30);
    var11.setHeaderFont(var30);
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    var33.transferFocus();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.isFloatable();
    var33.setContent((java.awt.Component)var35);
    java.awt.Color var43 = var35.getForeground();
    boolean var44 = var35.requestFocusInWindow();
    javax.swing.ActionMap var45 = var35.getActionMap();
    var35.repaint(1L);
    var35.validate();
    com.allenstudio.ir.core.plugins.CommonNote var49 = new com.allenstudio.ir.core.plugins.CommonNote();
    boolean var50 = var49.isPaintingTile();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var52 = var51.getColorModel();
    java.awt.im.InputContext var53 = var51.getInputContext();
    java.awt.Component var55 = var51.getComponent(0);
    java.awt.Font var56 = var51.getFont();
    java.awt.FontMetrics var57 = var49.getFontMetrics(var56);
    java.awt.FontMetrics var58 = var35.getFontMetrics(var56);
    var11.setHeaderFont(var56);
    var11.resetHighlight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    var0.setFocusCycleRoot(false);
    java.lang.String var6 = var0.getFeature();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "C:\\boot.ini"+ "'", var6.equals("C:\\boot.ini"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    var0.setExtendedState(31);
    java.awt.Rectangle var10 = var0.getMaximizedBounds();
    boolean var11 = var0.isActive();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Inspirento - alpha 0.86"+ "'", var7.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.util.Locale var2 = var0.getLocale();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var3.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var7 = var3.getAncestorListeners();
    var0.setLocationRelativeTo((java.awt.Component)var3);
    com.allenstudio.ir.event.DateChooserListener var9 = var3.getDateChooserListener();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var10 = var3.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var0.toBack();
    javax.accessibility.AccessibleContext var7 = var0.getAccessibleContext();
    boolean var8 = var0.isResizable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var13 = var11.removeElement((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var3 = var2.getUI();
    var0.setUI(var3);
    com.allenstudio.ir.ui.calendar.DateChooser var5 = var0.getDateChooser();
    boolean var8 = var0.inside(4, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    java.lang.String var4 = var0.getAttribute("C:\\boot.ini");
    java.util.Hashtable var5 = var0.getAttributes();
    com.allenstudio.ir.util.XmlElement var6 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var8 = var6.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var11 = var8.addSubElement("", "hi!");
    java.util.Hashtable var12 = var11.getAttributes();
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    int var14 = var13.getY();
    boolean var15 = var13.isLightweight();
    java.awt.Dimension var16 = var13.getMaximumSize();
    java.awt.event.KeyListener[] var17 = var13.getKeyListeners();
    boolean var18 = var13.getInheritsPopupMenu();
    var13.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var13.repaint(100L, 100, 1, 100, (-1));
    boolean var29 = var13.isOpaque();
    boolean var30 = var12.equals((java.lang.Object)var13);
    boolean var31 = var5.containsKey((java.lang.Object)var13);
    var13.enableInputMethods(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var28 = var27.getTitle();
    java.awt.dnd.DropTarget var29 = var27.getDropTarget();
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    boolean var31 = var30.hasChanged();
    var0.add((java.awt.Component)var27, (java.lang.Object)var31, (-1));
    com.allenstudio.ir.ui.NoteListsTabPane var34 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    var35.show();
    java.awt.image.ColorModel var38 = var35.getColorModel();
    boolean var39 = var35.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var40 = new com.allenstudio.ir.ui.DatePickerPane();
    var40.transferFocus();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isFloatable();
    var40.setContent((java.awt.Component)var42);
    java.awt.Dimension var50 = var40.size();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    boolean var54 = var51.isRequestFocusEnabled();
    java.awt.Dimension var55 = var51.minimumSize();
    var40.setToolBar((javax.swing.JToolBar)var51);
    java.awt.Image var59 = var40.createImage(10, (-1));
    var34.add((java.awt.Component)var35, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var62 = var61.getColorModel();
    var61.setEnabled(true);
    var34.add((java.awt.Component)var61, (java.lang.Object)100L, 0);
    java.awt.Component var69 = var0.add((java.awt.Component)var34, 1);
    com.allenstudio.ir.core.plugins.CommonNote var70 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var71 = var70.getDescription();
    int var72 = var34.indexOfComponent((java.awt.Component)var70);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var34.setSelectedIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Date Picker"+ "'", var28.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var71.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.setOpaque(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    java.awt.Component var20 = var17.getComponentAtIndex(10);
    java.lang.Object var21 = var14.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var22 = var14.getMaximumSize();
    var11.setMinimumSize(var22);
    java.awt.Rectangle var24 = var11.getBounds();
    var4.scrollRectToVisible(var24);
    var0.setMaximizedBounds(var24);
    float var27 = var0.getAlignmentX();
    var0.revalidate();
    int var29 = var0.getState();
    var0.setCursor(4);
    com.allenstudio.ir.ui.MainFrame var32 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var33 = var32.getWarningString();
    boolean var34 = var32.isAlwaysOnTopSupported();
    com.allenstudio.ir.ui.StatusBar var35 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var36 = var35.getRootPane();
    java.awt.Point var37 = var35.location();
    com.allenstudio.ir.ui.StatusBar var38 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var39 = var38.getRootPane();
    java.awt.Point var40 = var38.location();
    com.allenstudio.ir.ui.Toolbar var41 = new com.allenstudio.ir.ui.Toolbar();
    boolean var42 = var41.isFloatable();
    java.awt.Component var44 = var41.getComponentAtIndex(10);
    java.lang.Object var45 = var38.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var46 = var38.getMaximumSize();
    var35.setMinimumSize(var46);
    java.awt.Rectangle var48 = var35.getBounds();
    java.awt.Rectangle var49 = var32.getBounds(var48);
    var0.setBounds(var48);
    java.awt.Window[] var51 = var0.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    java.awt.Color var13 = var11.getHeaderForeground();
    var11.repaint(5, 6, 3, 556);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.Insets var2 = var0.insets();
    var0.setAlignmentY(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    javax.swing.JComponent var1 = var0.getHeaderComponent();
    var0.setWeekStartOnSunday(true);
    var0.resetHighlight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    boolean var7 = var4.contains(6, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.NoteListsTabPane var33 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var34 = new com.allenstudio.ir.ui.Toolbar();
    boolean var35 = var34.isFloatable();
    var34.show();
    java.awt.image.ColorModel var37 = var34.getColorModel();
    boolean var38 = var34.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var39 = new com.allenstudio.ir.ui.DatePickerPane();
    var39.transferFocus();
    com.allenstudio.ir.ui.Toolbar var41 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var42 = var41.getColorModel();
    var41.setEnabled(true);
    java.awt.Component var46 = var41.getComponentAtIndex(1);
    boolean var47 = var41.isFloatable();
    var39.setContent((java.awt.Component)var41);
    java.awt.Dimension var49 = var39.size();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    var50.show();
    boolean var53 = var50.isRequestFocusEnabled();
    java.awt.Dimension var54 = var50.minimumSize();
    var39.setToolBar((javax.swing.JToolBar)var50);
    java.awt.Image var58 = var39.createImage(10, (-1));
    var33.add((java.awt.Component)var34, (java.lang.Object)10);
    var33.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var62 = var33.getUI();
    javax.swing.SingleSelectionModel var63 = var33.getModel();
    var0.setModel(var63);
    javax.swing.event.ChangeListener[] var65 = var0.getChangeListeners();
    java.awt.Component var67 = var0.getTabComponentAt(4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTabPlacement(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    boolean var9 = var0.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var10 = var0.getContentPaneBorder();
    java.awt.Container var11 = var0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var5 = var4.getRootPane();
    java.awt.Point var6 = var4.location();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var8 = var7.getRootPane();
    java.awt.Point var9 = var7.location();
    com.allenstudio.ir.ui.Toolbar var10 = new com.allenstudio.ir.ui.Toolbar();
    boolean var11 = var10.isFloatable();
    java.awt.Component var13 = var10.getComponentAtIndex(10);
    java.lang.Object var14 = var7.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var15 = var7.getMaximumSize();
    var4.setMinimumSize(var15);
    var0.addSeparator(var15);
    boolean var20 = var0.contains(3, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    var0.setEnabled(false);
    java.awt.dnd.DropTarget var8 = var0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    java.awt.event.WindowFocusListener[] var8 = var0.getWindowFocusListeners();
    com.allenstudio.ir.ui.MainMenu var9 = new com.allenstudio.ir.ui.MainMenu((com.allenstudio.ir.core.InspirentoMediator)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    java.awt.event.MouseMotionListener[] var5 = var2.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var6 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var7 = var6.getFeature();
    com.allenstudio.ir.ui.StatusBar var8 = new com.allenstudio.ir.ui.StatusBar();
    var8.enable();
    boolean var10 = var8.isFocusOwner();
    var8.firePropertyChange("hi!", 10L, 0L);
    var8.layout();
    var8.removeAll();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    java.awt.Component var20 = var8.getComponentAt(var19);
    java.awt.Point var21 = var6.getLocation(var19);
    var6.setOtherInfo("");
    var6.setFeature("Title");
    var6.removeNotify();
    com.allenstudio.ir.util.XmlElement var27 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var29 = var27.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var32 = var30.addSubElement("hi!");
    var32.notifyObservers((java.lang.Object)(byte)1);
    var27.append(var32);
    com.allenstudio.ir.util.XmlElement var36 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var38 = var36.addSubElement("hi!");
    java.lang.String var40 = var36.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var41 = var32.addSubElement(var36);
    java.lang.String var44 = var32.getAttribute("Title", "ToolBarUI");
    var2.putClientProperty((java.lang.Object)var6, (java.lang.Object)"Title");
    boolean var46 = var6.isFocusTraversalPolicyProvider();
    java.awt.Point var47 = var6.getLocation();
    javax.accessibility.AccessibleContext var48 = var6.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "C:\\boot.ini"+ "'", var7.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "ToolBarUI"+ "'", var44.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    com.allenstudio.ir.ui.MainFrame var9 = new com.allenstudio.ir.ui.MainFrame();
    boolean var10 = var9.isShowing();
    int var11 = var9.countComponents();
    var9.setAutoRequestFocus(false);
    javax.swing.JMenuBar var14 = var9.getJMenuBar();
    boolean var15 = var14.isBorderPainted();
    var14.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var17 = new com.allenstudio.ir.ui.DatePickerPane();
    var17.transferFocus();
    java.awt.Dimension var19 = var17.getMinimumSize();
    java.awt.Dimension var20 = var14.getSize(var19);
    javax.swing.plaf.MenuBarUI var21 = var14.getUI();
    var5.setUI(var21);
    boolean var23 = var5.isBorderPainted();
    javax.accessibility.AccessibleContext var24 = var5.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.addNotify();
    java.awt.Color var6 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    boolean var3 = var0.isLocationByPlatform();
    int var4 = var0.getY();
    java.awt.Component var5 = var0.getMostRecentFocusOwner();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    com.allenstudio.ir.ui.MainFrame var13 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var14 = var13.getWarningString();
    java.lang.String var15 = var13.getWarningString();
    boolean var16 = var13.isAutoRequestFocus();
    com.allenstudio.ir.ui.DatePickerPane var17 = new com.allenstudio.ir.ui.DatePickerPane();
    var17.transferFocus();
    java.awt.Dimension var19 = var17.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    int var21 = var20.getY();
    javax.swing.JToolTip var22 = var20.createToolTip();
    float var23 = var22.getAlignmentY();
    java.awt.Color var24 = var22.getForeground();
    var17.setBackground(var24);
    var13.setGlassPane((java.awt.Component)var17);
    com.allenstudio.ir.ui.StatusBar var27 = new com.allenstudio.ir.ui.StatusBar();
    int var28 = var27.getY();
    javax.swing.JToolTip var29 = var27.createToolTip();
    float var30 = var29.getAlignmentY();
    java.awt.Color var31 = var29.getForeground();
    var13.setBackground(var31);
    var11.setDateBackground(var31);
    int var34 = var11.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 2015);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.getInheritsPopupMenu();
    java.awt.Component var6 = var0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    int var10 = var4.indexAtLocation(10, (-1));
    boolean var11 = var4.isDisplayable();
    var4.setSize(4, 0);
    com.allenstudio.ir.ui.StatusBar var15 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var16 = new com.allenstudio.ir.core.plugins.CommonNote();
    var16.setFocusTraversalPolicyProvider(false);
    var15.remove((java.awt.Component)var16);
    var16.setFeature("ToolBarUI");
    javax.swing.Icon var22 = var16.getIcon();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var24 = var4.add((java.awt.Component)var16, 6);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    float var4 = var0.getAlignmentX();
    int var5 = var0.getOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    var0.toFront();
    var0.reshape(2015, 31, 31, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    int var3 = var0.getY();
    var0.setAlignmentX(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.setSelectedIndex(1);
    java.awt.Component var3 = var0.getSelectedComponent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.Icon var5 = var0.getIconAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    var3.enable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    boolean var7 = var5.isFocusOwner();
    var5.firePropertyChange("hi!", 10L, 0L);
    var5.layout();
    var5.removeAll();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    java.awt.Point var17 = var5.getLocation(var16);
    var3.setLocation(var17);
    var0.setLocation(var17);
    java.awt.Color var20 = var0.getBackground();
    java.awt.Component var21 = var0.getFocusOwner();
    float var22 = var0.getOpacity();
    java.awt.im.InputContext var23 = var0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    int var3 = var2.getY();
    javax.swing.JToolTip var4 = var2.createToolTip();
    float var5 = var4.getAlignmentY();
    java.awt.Color var6 = var4.getForeground();
    var0.setBackground(var6);
    var0.move(10, 10);
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var12 = var11.getColorModel();
    java.awt.im.InputContext var13 = var11.getInputContext();
    java.awt.Component var15 = var11.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var11);
    java.awt.im.InputContext var17 = var0.getInputContext();
    boolean var18 = var0.isDoubleBuffered();
    boolean var19 = var0.isCursorSet();
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "PanelUI"+ "'", var1.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement("TabbedPaneUI");

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    java.awt.Component var20 = var17.getComponentAtIndex(10);
    java.lang.Object var21 = var14.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var22 = var14.getMaximumSize();
    var11.setMinimumSize(var22);
    java.awt.Rectangle var24 = var11.getBounds();
    var4.scrollRectToVisible(var24);
    var0.setMaximizedBounds(var24);
    var0.pack();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var4 = var0.getElement("hi!");
    java.lang.Object var7 = var0.addAttribute("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", "Inspirento - alpha 0.86");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var9 = var0.removeElement(32);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    int var30 = var0.getTabRunCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var32 = var0.isEnabledAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.lang.String var2 = var0.getWarningString();
    var0.setAutoRequestFocus(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.areFocusTraversalKeysSet(556);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    int var3 = var0.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    javax.swing.JToolTip var6 = var0.createToolTip();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var8 = var7.getRootPane();
    java.awt.Point var9 = var7.location();
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var11 = var10.getRootPane();
    java.awt.Point var12 = var10.location();
    com.allenstudio.ir.ui.Toolbar var13 = new com.allenstudio.ir.ui.Toolbar();
    boolean var14 = var13.isFloatable();
    java.awt.Component var16 = var13.getComponentAtIndex(10);
    java.lang.Object var17 = var10.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var18 = var10.getMaximumSize();
    var7.setMinimumSize(var18);
    java.awt.Rectangle var20 = var7.getBounds();
    var0.scrollRectToVisible(var20);
    boolean var22 = var0.isOpaque();
    com.allenstudio.ir.ui.DatePickerPane var23 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var24 = var23.getContentPane();
    javax.swing.InputMap var25 = var23.getInputMap();
    var23.setToolTipText("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var23, 4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.NoteList var1 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var2 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var3 = var2.getWarningString();
    java.awt.Rectangle var4 = var2.getMaximizedBounds();
    java.awt.MenuBar var5 = var2.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var6 = new com.allenstudio.ir.core.plugins.CommonNote();
    var6.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var10 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var6);
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    boolean var12 = var11.isBackgroundSet();
    boolean var15 = var11.contains(10, 100);
    var11.revalidate();
    javax.swing.JToolTip var17 = var11.createToolTip();
    com.allenstudio.ir.ui.StatusBar var18 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var19 = var18.getRootPane();
    java.awt.Point var20 = var18.location();
    com.allenstudio.ir.ui.StatusBar var21 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var22 = var21.getRootPane();
    java.awt.Point var23 = var21.location();
    com.allenstudio.ir.ui.Toolbar var24 = new com.allenstudio.ir.ui.Toolbar();
    boolean var25 = var24.isFloatable();
    java.awt.Component var27 = var24.getComponentAtIndex(10);
    java.lang.Object var28 = var21.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var29 = var21.getMaximumSize();
    var18.setMinimumSize(var29);
    java.awt.Rectangle var31 = var18.getBounds();
    var11.scrollRectToVisible(var31);
    var6.repaint(var31);
    var2.setMaximizedBounds(var31);
    int var37 = var1.getScrollableBlockIncrement(var31, 1, 4);
    int var40 = var0.getScrollableBlockIncrement(var31, 0, 0);
    java.awt.Dimension var41 = var0.getMaximumSize();
    java.awt.Dimension var42 = var0.getPreferredScrollableViewportSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.select(31, true);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    var4.setIndexInList((-1));
    java.awt.Dimension var7 = var4.getMaximumSize();
    boolean var8 = var4.isSelected();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    boolean var15 = var0.contains(4, 1);
    java.awt.Insets var16 = var0.getMargin();
    java.awt.Font var17 = var0.getFont();
    java.awt.Insets var18 = var0.getMargin();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    int var33 = var0.getTabLayoutPolicy();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var42 = var35.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var44 = var35.getPropertyChangeListeners("Date Picker");
    boolean var45 = var35.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var46 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var35.removeMouseListener((java.awt.event.MouseListener)var46);
    boolean var48 = var46.getWeekStartOnSunday();
    int var49 = var46.getSelectedDay();
    javax.swing.JComponent var50 = var46.getHeaderComponent();
    java.awt.Color var51 = var46.getHighlightBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setForegroundAt(10, var51);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    var0.toFront();
    java.awt.im.InputContext var4 = var0.getInputContext();
    var0.removeNotify();
    java.util.List var6 = var0.getIconImages();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("Inspirento - alpha 0.86");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("", "hi!");
    var5.removeFromParent();
    java.lang.String var7 = var5.getData();
    var5.removeFromParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    var0.firePropertyChange("", false, true);
    com.allenstudio.ir.ui.Toolbar var7 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var8 = var7.getColorModel();
    var7.setEnabled(true);
    java.awt.Component var12 = var7.getComponentAtIndex(1);
    boolean var13 = var7.isValidateRoot();
    com.allenstudio.ir.ui.Toolbar var14 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var15 = var14.getColorModel();
    var14.setEnabled(true);
    java.awt.ComponentOrientation var18 = var14.getComponentOrientation();
    boolean var19 = var14.isFloatable();
    com.allenstudio.ir.core.plugins.CommonNote var20 = new com.allenstudio.ir.core.plugins.CommonNote();
    var20.resize(0, 1);
    java.lang.String var24 = var20.getOtherInfo();
    com.allenstudio.ir.core.plugins.CommonNote var25 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var26 = var25.getFeature();
    com.allenstudio.ir.ui.StatusBar var27 = new com.allenstudio.ir.ui.StatusBar();
    var27.enable();
    boolean var29 = var27.isFocusOwner();
    var27.firePropertyChange("hi!", 10L, 0L);
    var27.layout();
    var27.removeAll();
    com.allenstudio.ir.ui.StatusBar var36 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var37 = var36.getRootPane();
    java.awt.Point var38 = var36.location();
    java.awt.Component var39 = var27.getComponentAt(var38);
    java.awt.Point var40 = var25.getLocation(var38);
    java.awt.Component var41 = var20.getComponentAt(var40);
    java.awt.Point var42 = var14.getLocation(var40);
    boolean var43 = var7.contains(var42);
    var0.setLocation(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "C:\\boot.ini"+ "'", var26.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    boolean var5 = var0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var11 = var0.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    java.lang.String var14 = var0.getAttribute("Title", "Date Picker");
    java.lang.String var15 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Date Picker"+ "'", var14.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    javax.swing.KeyStroke[] var2 = var0.getRegisteredKeyStrokes();
    java.awt.event.MouseWheelListener[] var3 = var0.getMouseWheelListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.areFocusTraversalKeysSet(2015);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.getInheritsPopupMenu();
    var0.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var0.repaint(100L, 100, 1, 100, (-1));
    javax.swing.InputMap var16 = var0.getInputMap();
    java.awt.Rectangle var17 = var0.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    boolean var10 = var0.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var11 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.removeMouseListener((java.awt.event.MouseListener)var11);
    javax.swing.JComponent var13 = var11.getHeaderComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    com.allenstudio.ir.ui.StatusBar var34 = new com.allenstudio.ir.ui.StatusBar();
    int var35 = var34.getY();
    var34.disable();
    var34.firePropertyChange("hi!", (byte)(-1), (byte)10);
    var0.setComponentAt(0, (java.awt.Component)var34);
    var0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var4 = var3.getRootPane();
    java.awt.Point var5 = var3.location();
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var7 = var6.getRootPane();
    java.awt.Point var8 = var6.location();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    boolean var10 = var9.isFloatable();
    java.awt.Component var12 = var9.getComponentAtIndex(10);
    java.lang.Object var13 = var6.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var14 = var6.getMaximumSize();
    var3.setMinimumSize(var14);
    java.awt.Rectangle var16 = var3.getBounds();
    java.awt.Rectangle var17 = var0.getBounds(var16);
    java.awt.Container var18 = var0.getFocusCycleRootAncestor();
    int var19 = var0.getExtendedState();
    java.awt.Window[] var20 = var0.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    char[] var2 = new char[] { 'a'};
    var0.ignorableWhitespace(var2, 0, (-1));
    com.allenstudio.ir.util.XmlIO var6 = new com.allenstudio.ir.util.XmlIO();
    var6.errorDialog("hi!");
    char[] var11 = new char[] { 'a', '4'};
    var6.ignorableWhitespace(var11, 100, 0);
    var0.ignorableWhitespace(var11, 10, 0);
    var0.startPrefixMapping("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    boolean var3 = var0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    java.awt.event.HierarchyBoundsListener[] var6 = var5.getHierarchyBoundsListeners();
    boolean var7 = var5.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    var3.enable();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    boolean var7 = var5.isFocusOwner();
    var5.firePropertyChange("hi!", 10L, 0L);
    var5.layout();
    var5.removeAll();
    com.allenstudio.ir.ui.StatusBar var14 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var15 = var14.getRootPane();
    java.awt.Point var16 = var14.location();
    java.awt.Point var17 = var5.getLocation(var16);
    var3.setLocation(var17);
    var0.setLocation(var17);
    java.awt.Container var20 = var0.getContentPane();
    java.awt.event.WindowFocusListener[] var21 = var0.getWindowFocusListeners();
    var0.setFocusCycleRoot(true);
    com.allenstudio.ir.ui.StatusBar var24 = new com.allenstudio.ir.ui.StatusBar();
    int var25 = var24.getY();
    javax.swing.JToolTip var26 = var24.createToolTip();
    float var27 = var26.getAlignmentY();
    java.awt.Color var28 = var26.getForeground();
    java.awt.event.MouseMotionListener[] var29 = var26.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var30 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var31 = var30.getFeature();
    com.allenstudio.ir.ui.StatusBar var32 = new com.allenstudio.ir.ui.StatusBar();
    var32.enable();
    boolean var34 = var32.isFocusOwner();
    var32.firePropertyChange("hi!", 10L, 0L);
    var32.layout();
    var32.removeAll();
    com.allenstudio.ir.ui.StatusBar var41 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var42 = var41.getRootPane();
    java.awt.Point var43 = var41.location();
    java.awt.Component var44 = var32.getComponentAt(var43);
    java.awt.Point var45 = var30.getLocation(var43);
    var30.setOtherInfo("");
    var30.setFeature("Title");
    var30.removeNotify();
    com.allenstudio.ir.util.XmlElement var51 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var53 = var51.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var54 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var56 = var54.addSubElement("hi!");
    var56.notifyObservers((java.lang.Object)(byte)1);
    var51.append(var56);
    com.allenstudio.ir.util.XmlElement var60 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var62 = var60.addSubElement("hi!");
    java.lang.String var64 = var60.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var65 = var56.addSubElement(var60);
    java.lang.String var68 = var56.getAttribute("Title", "ToolBarUI");
    var26.putClientProperty((java.lang.Object)var30, (java.lang.Object)"Title");
    var30.doLayout();
    java.lang.String var71 = var30.getDescription();
    float var72 = var30.getAlignmentY();
    var0.remove((java.awt.Component)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "C:\\boot.ini"+ "'", var31.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "ToolBarUI"+ "'", var68.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var71.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0.5f);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    com.allenstudio.ir.util.XmlElement var2 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var4 = var2.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var7 = var4.addSubElement("", "hi!");
    java.util.Hashtable var8 = var7.getAttributes();
    com.allenstudio.ir.ui.MainFrame var9 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var10 = var9.getWarningString();
    java.awt.Rectangle var11 = var9.getMaximizedBounds();
    java.awt.MenuBar var12 = var9.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var13 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var9.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var13);
    var9.dispose();
    java.lang.Object var16 = var8.get((java.lang.Object)var9);
    java.util.Set var17 = var8.entrySet();
    com.allenstudio.ir.util.XmlElement var18 = new com.allenstudio.ir.util.XmlElement("Title", var8);
    java.util.Enumeration var19 = var8.elements();
    com.allenstudio.ir.util.XmlElement var20 = new com.allenstudio.ir.util.XmlElement("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", var8);
    com.allenstudio.ir.ui.DatePickerPane var21 = new com.allenstudio.ir.ui.DatePickerPane();
    var21.transferFocus();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var24 = var23.getColorModel();
    var23.setEnabled(true);
    java.awt.Component var28 = var23.getComponentAtIndex(1);
    boolean var29 = var23.isFloatable();
    var21.setContent((java.awt.Component)var23);
    java.awt.Dimension var31 = var21.size();
    com.allenstudio.ir.ui.Toolbar var32 = new com.allenstudio.ir.ui.Toolbar();
    boolean var33 = var32.isFloatable();
    var32.show();
    boolean var35 = var32.isRequestFocusEnabled();
    java.awt.Dimension var36 = var32.minimumSize();
    var21.setToolBar((javax.swing.JToolBar)var32);
    java.awt.Image var40 = var21.createImage(10, (-1));
    javax.swing.Icon var41 = var21.getFrameIcon();
    var21.setEnabled(false);
    boolean var44 = var8.containsKey((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setState(4);
    boolean var4 = var0.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    boolean var5 = var0.isOpaque();
    var0.setAlignmentX(0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    boolean var6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.event.InputMethodListener[] var7 = var0.getInputMethodListeners();
    int var8 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    var0.setAlwaysOnTop(true);
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    var0.firePropertyChange("", false, true);
    com.allenstudio.ir.ui.calendar.DateChooser var7 = new com.allenstudio.ir.ui.calendar.DateChooser();
    boolean var9 = var7.requestFocus(false);
    var7.updateUI();
    com.allenstudio.ir.ui.NoteList var11 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.NoteList var12 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var13 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var14 = var13.getWarningString();
    java.awt.Rectangle var15 = var13.getMaximizedBounds();
    java.awt.MenuBar var16 = var13.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var17 = new com.allenstudio.ir.core.plugins.CommonNote();
    var17.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var21 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var17);
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    boolean var23 = var22.isBackgroundSet();
    boolean var26 = var22.contains(10, 100);
    var22.revalidate();
    javax.swing.JToolTip var28 = var22.createToolTip();
    com.allenstudio.ir.ui.StatusBar var29 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var30 = var29.getRootPane();
    java.awt.Point var31 = var29.location();
    com.allenstudio.ir.ui.StatusBar var32 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var33 = var32.getRootPane();
    java.awt.Point var34 = var32.location();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    boolean var36 = var35.isFloatable();
    java.awt.Component var38 = var35.getComponentAtIndex(10);
    java.lang.Object var39 = var32.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var40 = var32.getMaximumSize();
    var29.setMinimumSize(var40);
    java.awt.Rectangle var42 = var29.getBounds();
    var22.scrollRectToVisible(var42);
    var17.repaint(var42);
    var13.setMaximizedBounds(var42);
    int var48 = var12.getScrollableBlockIncrement(var42, 1, 4);
    int var51 = var11.getScrollableBlockIncrement(var42, 0, 0);
    java.awt.Dimension var52 = var11.getMaximumSize();
    var7.setMaximumSize(var52);
    var0.addSeparator(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    boolean var4 = var3.isBackgroundSet();
    boolean var7 = var3.contains(10, 100);
    var3.revalidate();
    javax.swing.JToolTip var9 = var3.createToolTip();
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var11 = var10.getRootPane();
    java.awt.Point var12 = var10.location();
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var14 = var13.getRootPane();
    java.awt.Point var15 = var13.location();
    com.allenstudio.ir.ui.Toolbar var16 = new com.allenstudio.ir.ui.Toolbar();
    boolean var17 = var16.isFloatable();
    java.awt.Component var19 = var16.getComponentAtIndex(10);
    java.lang.Object var20 = var13.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var21 = var13.getMaximumSize();
    var10.setMinimumSize(var21);
    java.awt.Rectangle var23 = var10.getBounds();
    var3.scrollRectToVisible(var23);
    var0.setMaximizedBounds(var23);
    boolean var26 = var0.isForegroundSet();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    var27.show();
    java.awt.image.ColorModel var30 = var27.getColorModel();
    boolean var31 = var27.isFocusCycleRoot();
    com.allenstudio.ir.ui.Toolbar var32 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var33 = var32.getColorModel();
    var32.setEnabled(true);
    java.awt.Component var37 = var32.getComponentAtIndex(1);
    boolean var38 = var32.isFloatable();
    java.lang.String var39 = var32.toString();
    com.allenstudio.ir.ui.Toolbar var40 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var41 = var40.getMouseWheelListeners();
    java.awt.event.MouseListener[] var42 = var40.getMouseListeners();
    var40.firePropertyChange("", false, true);
    var32.add((java.awt.Component)var40, (java.lang.Object)10.0f);
    java.awt.event.HierarchyBoundsListener[] var49 = var40.getHierarchyBoundsListeners();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    var50.show();
    boolean var53 = var50.isRequestFocusEnabled();
    java.awt.Dimension var54 = var50.minimumSize();
    java.awt.Dimension var55 = var50.getMinimumSize();
    var40.resize(var55);
    var27.resize(var55);
    var0.resize(var55);
    boolean var59 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    boolean var6 = var5.isFloatable();
    var5.show();
    java.awt.image.ColorModel var8 = var5.getColorModel();
    boolean var9 = var5.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    var10.transferFocus();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.Component var17 = var12.getComponentAtIndex(1);
    boolean var18 = var12.isFloatable();
    var10.setContent((java.awt.Component)var12);
    java.awt.Dimension var20 = var10.size();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    boolean var24 = var21.isRequestFocusEnabled();
    java.awt.Dimension var25 = var21.minimumSize();
    var10.setToolBar((javax.swing.JToolBar)var21);
    java.awt.Image var29 = var10.createImage(10, (-1));
    var4.add((java.awt.Component)var5, (java.lang.Object)10);
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    java.awt.event.ComponentListener[] var32 = var4.getComponentListeners();
    java.awt.GraphicsConfiguration var33 = var4.getGraphicsConfiguration();
    var4.setDebugGraphicsOptions(30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    com.allenstudio.ir.ui.MainFrame var3 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var4 = var3.getWarningString();
    java.lang.String var5 = var3.getWarningString();
    boolean var6 = var3.isAutoRequestFocus();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var8 = var7.getWarningString();
    boolean var9 = var7.isAlwaysOnTopSupported();
    java.awt.Color var10 = var7.getBackground();
    var3.setBackground(var10);
    com.allenstudio.ir.util.XmlElement var12 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var14 = var12.addSubElement("hi!");
    var14.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var19 = var17.addSubElement("hi!");
    var19.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var22 = var14.removeElement(var19);
    com.allenstudio.ir.util.XmlElement var23 = var19.getParent();
    java.util.List var24 = var23.getElements();
    var3.setIconImages(var24);
    var0.setIconImages(var24);
    java.lang.String var27 = var0.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    java.lang.String[] var1 = com.allenstudio.ir.util.InspirentoUtilities.tokenize("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var1 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var2 = var1.getWarningString();
    java.awt.Rectangle var3 = var1.getMaximizedBounds();
    java.awt.MenuBar var4 = var1.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    var5.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var9 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var5);
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    boolean var11 = var10.isBackgroundSet();
    boolean var14 = var10.contains(10, 100);
    var10.revalidate();
    javax.swing.JToolTip var16 = var10.createToolTip();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var18 = var17.getRootPane();
    java.awt.Point var19 = var17.location();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    boolean var24 = var23.isFloatable();
    java.awt.Component var26 = var23.getComponentAtIndex(10);
    java.lang.Object var27 = var20.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var28 = var20.getMaximumSize();
    var17.setMinimumSize(var28);
    java.awt.Rectangle var30 = var17.getBounds();
    var10.scrollRectToVisible(var30);
    var5.repaint(var30);
    var1.setMaximizedBounds(var30);
    int var36 = var0.getScrollableBlockIncrement(var30, 1, 4);
    com.allenstudio.ir.core.plugins.CommonNote var37 = new com.allenstudio.ir.core.plugins.CommonNote();
    var37.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var41 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var37);
    int var42 = var41.getIndexInList();
    var0.addCell(var41);
    com.allenstudio.ir.core.plugins.CommonNote var44 = new com.allenstudio.ir.core.plugins.CommonNote();
    var44.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var48 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var44);
    int var49 = var48.getIndexInList();
    java.awt.Dimension var50 = var48.getMaximumSize();
    java.awt.LayoutManager var51 = var48.getLayout();
    var0.addCell(var48);
    var48.setIndexInList(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    boolean var30 = var0.isEnabled();
    com.allenstudio.ir.ui.MainFrame var31 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var32 = var31.getWarningString();
    java.awt.Rectangle var33 = var31.getMaximizedBounds();
    java.awt.MenuBar var34 = var31.getMenuBar();
    var31.removeNotify();
    var31.addNotify();
    boolean var37 = var31.getFocusableWindowState();
    java.awt.Image var38 = var31.getIconImage();
    com.allenstudio.ir.ui.NoteListsTabPane var39 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var40 = new com.allenstudio.ir.ui.Toolbar();
    boolean var41 = var40.isFloatable();
    var40.show();
    java.awt.image.ColorModel var43 = var40.getColorModel();
    boolean var44 = var40.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var45 = new com.allenstudio.ir.ui.DatePickerPane();
    var45.transferFocus();
    com.allenstudio.ir.ui.Toolbar var47 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var48 = var47.getColorModel();
    var47.setEnabled(true);
    java.awt.Component var52 = var47.getComponentAtIndex(1);
    boolean var53 = var47.isFloatable();
    var45.setContent((java.awt.Component)var47);
    java.awt.Dimension var55 = var45.size();
    com.allenstudio.ir.ui.Toolbar var56 = new com.allenstudio.ir.ui.Toolbar();
    boolean var57 = var56.isFloatable();
    var56.show();
    boolean var59 = var56.isRequestFocusEnabled();
    java.awt.Dimension var60 = var56.minimumSize();
    var45.setToolBar((javax.swing.JToolBar)var56);
    java.awt.Image var64 = var45.createImage(10, (-1));
    var39.add((java.awt.Component)var40, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var66 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var67 = var66.getColorModel();
    var66.setEnabled(true);
    var39.add((java.awt.Component)var66, (java.lang.Object)100L, 0);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var73 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var74 = var73.getDateBackground();
    var73.setYearMonth(1, (-1));
    java.util.Calendar var78 = var73.getSelectedDate();
    var66.addMouseListener((java.awt.event.MouseListener)var73);
    var31.removeMouseListener((java.awt.event.MouseListener)var73);
    var0.addMouseListener((java.awt.event.MouseListener)var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    com.allenstudio.ir.util.XmlElement var12 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var14 = var12.addSubElement("hi!");
    var14.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var17 = var14.getData();
    com.allenstudio.ir.util.XmlElement var18 = var7.addSubElement(var14);
    java.lang.String var20 = var7.getAttribute("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.addNotify();
    boolean var6 = var0.getFocusableWindowState();
    java.awt.Image var7 = var0.getIconImage();
    com.allenstudio.ir.ui.NoteListsTabPane var8 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    boolean var10 = var9.isFloatable();
    var9.show();
    java.awt.image.ColorModel var12 = var9.getColorModel();
    boolean var13 = var9.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var14 = new com.allenstudio.ir.ui.DatePickerPane();
    var14.transferFocus();
    com.allenstudio.ir.ui.Toolbar var16 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var17 = var16.getColorModel();
    var16.setEnabled(true);
    java.awt.Component var21 = var16.getComponentAtIndex(1);
    boolean var22 = var16.isFloatable();
    var14.setContent((java.awt.Component)var16);
    java.awt.Dimension var24 = var14.size();
    com.allenstudio.ir.ui.Toolbar var25 = new com.allenstudio.ir.ui.Toolbar();
    boolean var26 = var25.isFloatable();
    var25.show();
    boolean var28 = var25.isRequestFocusEnabled();
    java.awt.Dimension var29 = var25.minimumSize();
    var14.setToolBar((javax.swing.JToolBar)var25);
    java.awt.Image var33 = var14.createImage(10, (-1));
    var8.add((java.awt.Component)var9, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    var8.add((java.awt.Component)var35, (java.lang.Object)100L, 0);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var42 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var43 = var42.getDateBackground();
    var42.setYearMonth(1, (-1));
    java.util.Calendar var47 = var42.getSelectedDate();
    var35.addMouseListener((java.awt.event.MouseListener)var42);
    var0.removeMouseListener((java.awt.event.MouseListener)var42);
    var0.setState(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    boolean var9 = var0.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var10 = var0.getContentPaneBorder();
    com.allenstudio.ir.ui.MainFrame var11 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var12 = var11.getWarningString();
    java.lang.String var13 = var11.getWarningString();
    java.awt.Container var14 = var11.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var15 = new com.allenstudio.ir.ui.StatusBar();
    boolean var16 = var15.isBackgroundSet();
    boolean var19 = var15.contains(10, 100);
    var15.revalidate();
    javax.swing.JToolTip var21 = var15.createToolTip();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var23 = var22.getRootPane();
    java.awt.Point var24 = var22.location();
    com.allenstudio.ir.ui.StatusBar var25 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var26 = var25.getRootPane();
    java.awt.Point var27 = var25.location();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    boolean var29 = var28.isFloatable();
    java.awt.Component var31 = var28.getComponentAtIndex(10);
    java.lang.Object var32 = var25.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var33 = var25.getMaximumSize();
    var22.setMinimumSize(var33);
    java.awt.Rectangle var35 = var22.getBounds();
    var15.scrollRectToVisible(var35);
    var11.setMaximizedBounds(var35);
    float var38 = var11.getAlignmentX();
    com.allenstudio.ir.ui.StatusBar var39 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var40 = var39.getRootPane();
    java.awt.Point var41 = var39.location();
    boolean var42 = var39.isManagingFocus();
    java.awt.Rectangle var43 = var39.bounds();
    var11.setMaximizedBounds(var43);
    java.awt.Rectangle var45 = var0.getBounds(var43);
    com.allenstudio.ir.ui.DatePickerPane var46 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var47 = var46.getContentPane();
    var46.setIgnoreRepaint(true);
    boolean var50 = var46.isSelected();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var52 = var51.getMouseWheelListeners();
    java.awt.event.MouseListener[] var53 = var51.getMouseListeners();
    com.allenstudio.ir.ui.MainFrame var54 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var55 = var54.getWarningString();
    java.lang.String var56 = var54.getWarningString();
    java.awt.Container var57 = var54.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var58 = new com.allenstudio.ir.ui.StatusBar();
    boolean var59 = var58.isBackgroundSet();
    boolean var62 = var58.contains(10, 100);
    var58.revalidate();
    javax.swing.JToolTip var64 = var58.createToolTip();
    com.allenstudio.ir.ui.StatusBar var65 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var66 = var65.getRootPane();
    java.awt.Point var67 = var65.location();
    com.allenstudio.ir.ui.StatusBar var68 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var69 = var68.getRootPane();
    java.awt.Point var70 = var68.location();
    com.allenstudio.ir.ui.Toolbar var71 = new com.allenstudio.ir.ui.Toolbar();
    boolean var72 = var71.isFloatable();
    java.awt.Component var74 = var71.getComponentAtIndex(10);
    java.lang.Object var75 = var68.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var76 = var68.getMaximumSize();
    var65.setMinimumSize(var76);
    java.awt.Rectangle var78 = var65.getBounds();
    var58.scrollRectToVisible(var78);
    var54.setMaximizedBounds(var78);
    float var81 = var54.getAlignmentX();
    com.allenstudio.ir.ui.StatusBar var82 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var83 = var82.getRootPane();
    java.awt.Point var84 = var82.location();
    boolean var85 = var82.isManagingFocus();
    java.awt.Rectangle var86 = var82.bounds();
    var54.setMaximizedBounds(var86);
    java.awt.Rectangle var88 = var51.getBounds(var86);
    var46.paintImmediately(var86);
    java.awt.Rectangle var90 = var0.getBounds(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Dimension var10 = var0.size();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    boolean var14 = var11.isRequestFocusEnabled();
    java.awt.Dimension var15 = var11.minimumSize();
    var0.setToolBar((javax.swing.JToolBar)var11);
    var11.setDoubleBuffered(false);
    var11.addSeparator();
    var11.paintImmediately(32, 556, 31, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    var0.unparsedEntityDecl("", "hi!", "", "");
    var0.startDocument();

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    javax.swing.JMenu var10 = var5.getMenu(30);
    javax.swing.plaf.MenuBarUI var11 = var5.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    java.awt.Component var30 = var27.getComponentAtIndex(10);
    boolean var31 = var27.isLightweight();
    java.awt.Component var32 = var0.add((java.awt.Component)var27);
    float var33 = var0.getAlignmentX();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTabPlacement(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    boolean var2 = var0.isManagingFocus();
    java.awt.LayoutManager var3 = var0.getLayout();
    var0.setDebugGraphicsOptions(1);
    java.awt.Dimension var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    boolean var3 = var0.isManagingFocus();
    com.allenstudio.ir.core.plugins.CommonNote var4 = new com.allenstudio.ir.core.plugins.CommonNote();
    var4.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var8 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var4);
    int var9 = var8.getIndexInList();
    java.awt.Dimension var10 = var8.getMaximumSize();
    java.awt.LayoutManager var11 = var8.getLayout();
    var0.setLayout(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var1 = new com.allenstudio.ir.ui.Toolbar();
    boolean var2 = var1.isFloatable();
    var1.show();
    java.awt.image.ColorModel var4 = var1.getColorModel();
    boolean var5 = var1.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    var6.transferFocus();
    com.allenstudio.ir.ui.Toolbar var8 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var9 = var8.getColorModel();
    var8.setEnabled(true);
    java.awt.Component var13 = var8.getComponentAtIndex(1);
    boolean var14 = var8.isFloatable();
    var6.setContent((java.awt.Component)var8);
    java.awt.Dimension var16 = var6.size();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    boolean var18 = var17.isFloatable();
    var17.show();
    boolean var20 = var17.isRequestFocusEnabled();
    java.awt.Dimension var21 = var17.minimumSize();
    var6.setToolBar((javax.swing.JToolBar)var17);
    java.awt.Image var25 = var6.createImage(10, (-1));
    var0.add((java.awt.Component)var1, (java.lang.Object)10);
    var0.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var29 = var0.getUI();
    javax.swing.SingleSelectionModel var30 = var0.getModel();
    int var31 = var0.getTabPlacement();
    var0.setLocation(4, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var36 = var0.getForegroundAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    javax.swing.JToolTip var6 = var0.createToolTip();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var8 = var7.getRootPane();
    java.awt.Point var9 = var7.location();
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var11 = var10.getRootPane();
    java.awt.Point var12 = var10.location();
    com.allenstudio.ir.ui.Toolbar var13 = new com.allenstudio.ir.ui.Toolbar();
    boolean var14 = var13.isFloatable();
    java.awt.Component var16 = var13.getComponentAtIndex(10);
    java.lang.Object var17 = var10.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var18 = var10.getMaximumSize();
    var7.setMinimumSize(var18);
    java.awt.Rectangle var20 = var7.getBounds();
    var0.scrollRectToVisible(var20);
    var0.setAlignmentX((-1.0f));
    var0.setEnabled(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var27 = var0.getInputMap(32);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var9 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var11 = var9.addSubElement("hi!");
    java.lang.String var13 = var9.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var14 = var5.addSubElement(var9);
    com.allenstudio.ir.util.XmlElement var15 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var17 = var15.addSubElement("hi!");
    var17.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var20 = var17.getData();
    com.allenstudio.ir.util.XmlElement var22 = var17.getElement("hi!");
    com.allenstudio.ir.util.XmlElement var23 = var5.removeElement(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponent(0);
    var0.firePropertyChange("Inspirento - alpha 0.86", (short)10, (short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var6 = var5.getRootPane();
    java.awt.Point var7 = var5.location();
    com.allenstudio.ir.ui.StatusBar var8 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var9 = var8.getRootPane();
    java.awt.Point var10 = var8.location();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    java.awt.Component var14 = var11.getComponentAtIndex(10);
    java.lang.Object var15 = var8.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var16 = var8.getMaximumSize();
    var5.setMinimumSize(var16);
    java.awt.Rectangle var18 = var5.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var18);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    int var10 = var4.indexAtLocation(10, (-1));
    boolean var11 = var4.isDisplayable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setTabLayoutPolicy(5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    var0.unparsedEntityDecl("", "hi!", "", "");
    var0.skippedEntity("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    var0.notationDecl("Date Picker", "Title", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    var0.warningDialog("TabbedPaneUI");

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    com.allenstudio.ir.ui.MainFrame var4 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var5 = var4.getWarningString();
    boolean var6 = var4.isAlwaysOnTopSupported();
    java.awt.Color var7 = var4.getBackground();
    var0.setBackground(var7);
    var0.transferFocusDownCycle();
    var0.disable();
    var0.setLocation(1, 4);
    boolean var14 = var0.isLocationByPlatform();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    var0.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    java.lang.String var5 = var2.getData();
    var2.setName("MenuBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

}
