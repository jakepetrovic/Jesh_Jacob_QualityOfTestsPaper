package randoop;

import junit.framework.*;

public class RandoopTest16 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test1");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var2.repaint(1L, (-1), (-1), 0, 100);
    boolean var9 = var2.isFocusTraversable();
    bierse.view.RunningMessagePanel var12 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var13 = var12.getPreferredSize();
    boolean var16 = var12.contains(10, 1);
    java.awt.im.InputMethodRequests var17 = var12.getInputMethodRequests();
    var12.revalidate();
    var12.firePropertyChange("hi!", (short)100, (short)0);
    var2.setNextFocusableComponent((java.awt.Component)var12);
    java.awt.event.HierarchyBoundsListener[] var24 = var12.getHierarchyBoundsListeners();
    boolean var25 = var12.isCursorSet();
    bierse.view.RunningMessagePanel var28 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var29 = var28.isMaximumSizeSet();
    boolean var30 = var28.isOpaque();
    java.awt.event.HierarchyListener[] var31 = var28.getHierarchyListeners();
    int var32 = var28.countComponents();
    java.awt.event.HierarchyBoundsListener[] var33 = var28.getHierarchyBoundsListeners();
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var37 = var36.getPreferredSize();
    boolean var38 = var36.isPreferredSizeSet();
    var36.enable();
    javax.accessibility.AccessibleContext var40 = var36.getAccessibleContext();
    bierse.view.RunningMessagePanel var43 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var43.transferFocus();
    var43.show();
    float var46 = var43.getAlignmentX();
    var43.repaint(0L, 10, 0, 10, (-1));
    boolean var53 = var43.isEnabled();
    bierse.view.RunningMessagePanel var56 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var57 = var56.getPreferredSize();
    javax.swing.JPopupMenu var58 = var56.getComponentPopupMenu();
    java.awt.Rectangle var59 = var56.bounds();
    java.awt.Rectangle var60 = var43.getBounds(var59);
    var36.computeVisibleRect(var60);
    var28.scrollRectToVisible(var60);
    var12.computeVisibleRect(var60);
    javax.swing.TransferHandler var64 = var12.getTransferHandler();
    boolean var65 = var12.isCursorSet();
    var12.setOpaque(true);
    boolean var68 = var12.getFocusTraversalKeysEnabled();
    java.awt.Container var69 = var12.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test2");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    boolean var8 = var2.isFocusTraversalPolicySet();
    java.awt.event.FocusListener[] var9 = var2.getFocusListeners();
    boolean var10 = var2.isFontSet();
    bierse.view.RunningMessagePanel var13 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var14 = var13.isMaximumSizeSet();
    boolean var15 = var13.isOpaque();
    java.awt.event.HierarchyListener[] var16 = var13.getHierarchyListeners();
    int var17 = var13.getWidth();
    int var18 = var13.countComponents();
    java.awt.Point var20 = var13.getMousePosition(true);
    var13.setName("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD");
    java.lang.String var23 = var13.toString();
    java.awt.Font var24 = var13.getFont();
    java.awt.FontMetrics var25 = var2.getFontMetrics(var24);
    java.awt.Dimension var26 = var2.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var23,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var23.equals("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var23,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test3");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var4 = var2.isPreferredSizeSet();
    var2.enable();
    int var6 = var2.getY();
    java.awt.Insets var7 = var2.insets();
    var2.setOpaque(false);
    var2.revalidate();
    bierse.view.RunningMessagePanel var13 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var14 = var13.getPreferredSize();
    boolean var17 = var13.contains(10, 1);
    java.awt.event.HierarchyBoundsListener[] var18 = var13.getHierarchyBoundsListeners();
    var13.firePropertyChange("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (short)(-1), (short)100);
    boolean var23 = var13.requestDefaultFocus();
    bierse.view.RunningMessagePanel var26 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var26.transferFocus();
    var26.show();
    float var29 = var26.getAlignmentX();
    var26.repaint(0L, 10, 0, 10, (-1));
    boolean var36 = var26.isEnabled();
    java.lang.Object var37 = var26.getTreeLock();
    var26.firePropertyChange("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (byte)100, (byte)100);
    javax.swing.JPopupMenu var42 = var26.getComponentPopupMenu();
    java.awt.ComponentOrientation var43 = var26.getComponentOrientation();
    var13.applyComponentOrientation(var43);
    var2.applyComponentOrientation(var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var46 = var2.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test4");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    var2.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var12 = var2.getPreferredSize();
    java.awt.ComponentOrientation var13 = var2.getComponentOrientation();
    bierse.view.RunningMessagePanel var16 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var17 = var16.isMaximumSizeSet();
    var16.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var22 = var16.getTransferHandler();
    boolean var23 = var16.hasFocus();
    var16.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var26 = var16.getPreferredSize();
    java.awt.Dimension var27 = var2.getSize(var26);
    var2.repaint(100L, 1, 0, 100, 24);
    var2.updateUI();
    javax.swing.KeyStroke[] var35 = var2.getRegisteredKeyStrokes();
    var2.paintImmediately(13, 0, (-1), 0);
    java.awt.image.ColorModel var41 = var2.getColorModel();
    var2.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test5");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    int var6 = var2.getWidth();
    int var7 = var2.countComponents();
    java.awt.Point var9 = var2.getMousePosition(true);
    var2.setName("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD");
    java.lang.String var12 = var2.toString();
    var2.repaint(0L, 996, 12, 0, (-1));
    bierse.view.RunningMessagePanel var21 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var22 = var21.isMaximumSizeSet();
    var21.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var27 = var21.getTransferHandler();
    boolean var28 = var21.hasFocus();
    var21.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var31 = var21.getPreferredSize();
    javax.swing.JRootPane var32 = var21.getRootPane();
    var21.setRequestFocusEnabled(false);
    java.awt.Dimension var35 = var21.preferredSize();
    java.awt.Dimension var36 = var21.getPreferredSize();
    bierse.view.RunningMessagePanel var39 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var40 = var39.isMaximumSizeSet();
    boolean var41 = var39.isOpaque();
    javax.swing.InputMap var42 = var39.getInputMap();
    java.lang.String var43 = var39.getName();
    var39.setFocusTraversalPolicyProvider(true);
    bierse.view.RunningMessagePanel var48 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var48.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var55 = var48.location();
    java.awt.Component var56 = var39.findComponentAt(var55);
    java.awt.Point var57 = var21.getLocation(var55);
    java.awt.Component var58 = var2.findComponentAt(var57);
    var2.enableInputMethods(false);
    javax.swing.border.Border var61 = var2.getBorder();
    int var62 = var2.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var12,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var12.equals("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var12,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test6");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    int var6 = var2.getWidth();
    int var7 = var2.countComponents();
    java.awt.Point var9 = var2.getMousePosition(true);
    var2.setName("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD");
    java.lang.String var12 = var2.toString();
    java.awt.Font var13 = var2.getFont();
    bierse.view.RunningMessagePanel var16 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var17 = var16.getPreferredSize();
    boolean var20 = var16.contains(10, 1);
    java.awt.im.InputMethodRequests var21 = var16.getInputMethodRequests();
    boolean var22 = var16.getInheritsPopupMenu();
    java.lang.String var23 = var16.toString();
    java.awt.Rectangle var24 = var16.bounds();
    var2.setBounds(var24);
    var2.setSize(0, 13);
    var2.setFocusable(false);
    var2.removeNotify();
    java.awt.Rectangle var32 = var2.bounds();
    java.awt.Dimension var33 = var2.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var12,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var12.equals("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var12,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "bierse.view.RunningMessagePanel[,0,0,0var23,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var23.equals("bierse.view.RunningMessagePanel[,0,0,0var23,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test7");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.Insets var7 = var2.getInsets();
    javax.swing.JToolTip var8 = var2.createToolTip();
    bierse.view.RunningMessagePanel var11 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var12 = var11.isMaximumSizeSet();
    var11.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var17 = var11.getTransferHandler();
    boolean var18 = var11.hasFocus();
    var11.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var21 = var11.getPreferredSize();
    java.awt.ComponentOrientation var22 = var11.getComponentOrientation();
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var26 = var25.isMaximumSizeSet();
    var25.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var31 = var25.getTransferHandler();
    boolean var32 = var25.hasFocus();
    javax.swing.event.AncestorListener[] var33 = var25.getAncestorListeners();
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var37 = var36.isMaximumSizeSet();
    var36.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var42 = var36.getTransferHandler();
    boolean var43 = var36.hasFocus();
    var36.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var46 = var36.getPreferredSize();
    java.awt.ComponentOrientation var47 = var36.getComponentOrientation();
    var11.add((java.awt.Component)var25, (java.lang.Object)var36);
    bierse.view.RunningMessagePanel var51 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var52 = var51.getPreferredSize();
    java.awt.Dimension var53 = var51.getMaximumSize();
    var36.resize(var53);
    var8.setPreferredSize(var53);
    bierse.view.RunningMessagePanel var58 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var59 = var58.isMaximumSizeSet();
    boolean var60 = var58.isOpaque();
    java.awt.event.HierarchyListener[] var61 = var58.getHierarchyListeners();
    int var62 = var58.getWidth();
    java.awt.event.ContainerListener[] var63 = var58.getContainerListeners();
    java.awt.Dimension var64 = var58.getMaximumSize();
    boolean var65 = var58.isBackgroundSet();
    var8.remove((java.awt.Component)var58);
    boolean var67 = var8.isFocusTraversable();
    boolean var68 = var8.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test8");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    javax.swing.event.AncestorListener[] var10 = var2.getAncestorListeners();
    var2.enable(false);
    java.awt.Dimension var13 = var2.minimumSize();
    java.awt.GraphicsConfiguration var14 = var2.getGraphicsConfiguration();
    bierse.view.RunningMessagePanel var17 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var18 = var17.isMaximumSizeSet();
    var17.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var23 = var17.getTransferHandler();
    boolean var24 = var17.hasFocus();
    javax.swing.event.AncestorListener[] var25 = var17.getAncestorListeners();
    java.awt.Dimension var26 = var17.getMinimumSize();
    bierse.view.RunningMessagePanel var30 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var31 = var30.getPreferredSize();
    java.awt.Dimension var32 = var30.getMaximumSize();
    var30.disable();
    var17.putClientProperty((java.lang.Object)100, (java.lang.Object)var30);
    java.awt.image.VolatileImage var37 = var30.createVolatileImage(100, 24);
    bierse.view.RunningMessagePanel var40 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var41 = var40.getPreferredSize();
    var30.setMinimumSize(var41);
    var2.setMinimumSize(var41);
    var2.setFocusTraversalKeysEnabled(false);
    var2.setToolTipText("PanelUI");
    var2.setEnabled(false);
    bierse.view.RunningMessagePanel var52 = new bierse.view.RunningMessagePanel("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 24);
    java.awt.LayoutManager var53 = var52.getLayout();
    boolean var54 = var52.isMaximumSizeSet();
    javax.swing.plaf.PanelUI var55 = var52.getUI();
    var2.setUI(var55);
    java.awt.event.KeyListener[] var57 = var2.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test9");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    boolean var8 = var2.isFocusTraversalPolicySet();
    bierse.view.RunningMessagePanel var11 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var12 = var11.getPreferredSize();
    boolean var13 = var11.isPreferredSizeSet();
    var11.enable();
    var11.transferFocusBackward();
    int var16 = var2.getComponentZOrder((java.awt.Component)var11);
    var2.setEnabled(false);
    java.awt.Graphics var19 = var2.getGraphics();
    bierse.view.RunningMessagePanel var22 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var23 = var22.isMaximumSizeSet();
    var22.layout();
    bierse.view.RunningMessagePanel var27 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var28 = var27.isMaximumSizeSet();
    var27.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    boolean var33 = var27.isFocusTraversalPolicySet();
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var37 = var36.getPreferredSize();
    boolean var38 = var36.isPreferredSizeSet();
    var36.enable();
    var36.transferFocusBackward();
    int var41 = var27.getComponentZOrder((java.awt.Component)var36);
    var27.setEnabled(false);
    java.awt.Graphics var44 = var27.getGraphics();
    var22.remove((java.awt.Component)var27);
    bierse.view.RunningMessagePanel var48 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var49 = var48.getPreferredSize();
    boolean var52 = var48.contains(10, 1);
    java.awt.Insets var53 = var48.getInsets();
    javax.swing.JToolTip var54 = var48.createToolTip();
    var48.invalidate();
    var22.remove((java.awt.Component)var48);
    bierse.view.RunningMessagePanel var59 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var60 = var59.isMaximumSizeSet();
    boolean var61 = var59.isOpaque();
    java.awt.event.HierarchyListener[] var62 = var59.getHierarchyListeners();
    int var63 = var59.countComponents();
    java.awt.event.HierarchyBoundsListener[] var64 = var59.getHierarchyBoundsListeners();
    boolean var66 = var59.areFocusTraversalKeysSet(1);
    bierse.view.RunningMessagePanel var69 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var70 = var69.getPreferredSize();
    javax.swing.JPopupMenu var71 = var69.getComponentPopupMenu();
    bierse.view.RunningMessagePanel var74 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var75 = var74.getPreferredSize();
    javax.swing.JPopupMenu var76 = var74.getComponentPopupMenu();
    java.awt.Rectangle var77 = var74.bounds();
    var69.computeVisibleRect(var77);
    var59.setBounds(var77);
    var2.putClientProperty((java.lang.Object)var48, (java.lang.Object)var77);
    var48.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test10");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    javax.swing.JPopupMenu var4 = var2.getComponentPopupMenu();
    bierse.view.RunningMessagePanel var7 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var8 = var7.getPreferredSize();
    javax.swing.JPopupMenu var9 = var7.getComponentPopupMenu();
    java.awt.Rectangle var10 = var7.bounds();
    var2.computeVisibleRect(var10);
    java.awt.event.ComponentListener[] var12 = var2.getComponentListeners();
    var2.setDebugGraphicsOptions(10);
    var2.setAlignmentY(0.5f);
    bierse.view.RunningMessagePanel var19 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var19.repaint(1L, (-1), (-1), 0, 100);
    boolean var26 = var19.isFocusTraversable();
    bierse.view.RunningMessagePanel var29 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var30 = var29.isMaximumSizeSet();
    boolean var31 = var29.isOpaque();
    java.awt.event.HierarchyListener[] var32 = var29.getHierarchyListeners();
    boolean var33 = var29.isValid();
    var2.add((java.awt.Component)var19, (java.lang.Object)var33, 0);
    java.awt.event.MouseListener[] var36 = var2.getMouseListeners();
    var2.move((-1), 0);
    var2.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test11");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    java.awt.event.FocusListener[] var8 = var2.getFocusListeners();
    java.awt.Font var9 = var2.getFont();
    var2.enable();
    boolean var11 = var2.getIgnoreRepaint();
    var2.setName("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]");
    var2.setFocusCycleRoot(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test12");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    var2.setVerifyInputWhenFocusTarget(false);
    int var12 = var2.getDebugGraphicsOptions();
    java.awt.Component var15 = var2.locate(24, 100);
    bierse.view.RunningMessagePanel var18 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var19 = var18.getPreferredSize();
    boolean var22 = var18.contains(10, 1);
    java.awt.im.InputMethodRequests var23 = var18.getInputMethodRequests();
    java.awt.event.FocusListener[] var24 = var18.getFocusListeners();
    java.awt.Font var25 = var18.getFont();
    javax.swing.plaf.PanelUI var26 = var18.getUI();
    var2.setUI(var26);
    bierse.view.RunningMessagePanel var30 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var31 = var30.isMaximumSizeSet();
    boolean var32 = var30.isOpaque();
    java.awt.event.HierarchyListener[] var33 = var30.getHierarchyListeners();
    int var34 = var30.getWidth();
    int var35 = var30.countComponents();
    java.awt.Point var37 = var30.getMousePosition(true);
    var30.setName("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD");
    java.lang.String var40 = var30.toString();
    java.awt.Font var41 = var30.getFont();
    bierse.view.RunningMessagePanel var44 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var45 = var44.getPreferredSize();
    boolean var48 = var44.contains(10, 1);
    java.awt.im.InputMethodRequests var49 = var44.getInputMethodRequests();
    boolean var50 = var44.getInheritsPopupMenu();
    java.lang.String var51 = var44.toString();
    java.awt.Rectangle var52 = var44.bounds();
    var30.setBounds(var52);
    var2.paintImmediately(var52);
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", (short)1, (short)(-1));
    var2.setRequestFocusEnabled(false);
    var2.setEnabled(true);
    var2.setFocusCycleRoot(true);
    javax.swing.InputMap var65 = var2.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var40,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var40.equals("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0var40,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "bierse.view.RunningMessagePanel[,0,0,0var51,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var51.equals("bierse.view.RunningMessagePanel[,0,0,0var51,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test13");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    java.awt.Point var4 = var2.getMousePosition();
    var2.revalidate();
    bierse.view.RunningMessagePanel var8 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var9 = var8.isMaximumSizeSet();
    var8.layout();
    var8.invalidate();
    var2.setNextFocusableComponent((java.awt.Component)var8);
    boolean var13 = var2.isValidateRoot();
    var2.show();
    boolean var15 = var2.isFocusTraversalPolicySet();
    bierse.view.RunningMessagePanel var18 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var19 = var18.getPreferredSize();
    java.awt.Dimension var20 = var18.getMaximumSize();
    java.awt.event.FocusListener[] var21 = var18.getFocusListeners();
    bierse.view.RunningMessagePanel var24 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var25 = var24.getPreferredSize();
    boolean var28 = var24.contains(10, 1);
    java.awt.im.InputMethodRequests var29 = var24.getInputMethodRequests();
    java.awt.Font var30 = var24.getFont();
    var18.setFont(var30);
    java.beans.VetoableChangeListener[] var32 = var18.getVetoableChangeListeners();
    boolean var33 = var18.isMaximumSizeSet();
    var18.firePropertyChange("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]", (short)0, (short)10);
    java.awt.dnd.DropTarget var38 = var18.getDropTarget();
    java.awt.LayoutManager var39 = var18.getLayout();
    var2.setLayout(var39);
    boolean var41 = var2.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test14");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    var2.setVerifyInputWhenFocusTarget(false);
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var15 = var14.isMaximumSizeSet();
    boolean var16 = var14.isOpaque();
    javax.swing.InputMap var17 = var14.getInputMap();
    java.beans.PropertyChangeListener[] var19 = var14.getPropertyChangeListeners("");
    java.awt.ComponentOrientation var20 = var14.getComponentOrientation();
    var2.applyComponentOrientation(var20);
    java.awt.Dimension var22 = var2.getMinimumSize();
    int var23 = var2.getY();
    bierse.view.RunningMessagePanel var26 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var27 = var26.getPreferredSize();
    boolean var30 = var26.contains(10, 1);
    var26.setAlignmentX((-1.0f));
    java.awt.Point var33 = var26.getLocation();
    java.awt.Component var34 = var2.getComponentAt(var33);
    float var35 = var2.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.5f);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test15");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.beans.PropertyChangeListener[] var5 = var2.getPropertyChangeListeners();
    boolean var6 = var2.isFocusCycleRoot();
    int var7 = var2.getWidth();
    var2.setToolTipText("PanelUI");
    var2.firePropertyChange("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]", false, true);
    var2.nextFocus();
    bierse.view.RunningMessagePanel var17 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var17.setDebugGraphicsOptions(10);
    java.lang.Object var20 = var17.getTreeLock();
    java.awt.Cursor var21 = var17.getCursor();
    java.awt.Dimension var22 = var17.getMaximumSize();
    int var23 = var17.getWidth();
    java.awt.Dimension var24 = var17.getMaximumSize();
    var2.setMinimumSize(var24);
    javax.swing.ActionMap var26 = var2.getActionMap();
    java.awt.Insets var27 = var2.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test16");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.layout();
    bierse.view.RunningMessagePanel var7 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var8 = var7.isMaximumSizeSet();
    boolean var9 = var7.isOpaque();
    java.awt.event.HierarchyListener[] var10 = var7.getHierarchyListeners();
    int var11 = var7.countComponents();
    java.awt.event.HierarchyBoundsListener[] var12 = var7.getHierarchyBoundsListeners();
    boolean var14 = var7.areFocusTraversalKeysSet(1);
    bierse.view.RunningMessagePanel var17 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var18 = var17.getPreferredSize();
    javax.swing.JPopupMenu var19 = var17.getComponentPopupMenu();
    bierse.view.RunningMessagePanel var22 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var23 = var22.getPreferredSize();
    javax.swing.JPopupMenu var24 = var22.getComponentPopupMenu();
    java.awt.Rectangle var25 = var22.bounds();
    var17.computeVisibleRect(var25);
    var7.setBounds(var25);
    var2.repaint(var25);
    java.awt.Component var31 = var2.getComponentAt(1, 100);
    int var32 = var2.getY();
    java.awt.Toolkit var33 = var2.getToolkit();
    java.awt.Container var34 = var2.getParent();
    int var35 = var2.getDebugGraphicsOptions();
    var2.setRequestFocusEnabled(true);
    float var38 = var2.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.5f);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test17");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    int var6 = var2.getWidth();
    java.awt.Toolkit var7 = var2.getToolkit();
    javax.swing.KeyStroke[] var8 = var2.getRegisteredKeyStrokes();
    var2.doLayout();
    java.awt.FocusTraversalPolicy var10 = var2.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test18");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    var2.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var12 = var2.getPreferredSize();
    java.awt.ComponentOrientation var13 = var2.getComponentOrientation();
    bierse.view.RunningMessagePanel var16 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var17 = var16.isMaximumSizeSet();
    var16.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var22 = var16.getTransferHandler();
    boolean var23 = var16.hasFocus();
    javax.swing.event.AncestorListener[] var24 = var16.getAncestorListeners();
    bierse.view.RunningMessagePanel var27 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var28 = var27.isMaximumSizeSet();
    var27.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var33 = var27.getTransferHandler();
    boolean var34 = var27.hasFocus();
    var27.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var37 = var27.getPreferredSize();
    java.awt.ComponentOrientation var38 = var27.getComponentOrientation();
    var2.add((java.awt.Component)var16, (java.lang.Object)var27);
    boolean var40 = var27.isDoubleBuffered();
    var27.setEnabled(true);
    var27.disable();
    var27.hide();
    var27.setName("PanelUI");
    var27.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test19");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    javax.swing.InputMap var5 = var2.getInputMap();
    java.beans.PropertyChangeListener[] var7 = var2.getPropertyChangeListeners("");
    java.awt.ComponentOrientation var8 = var2.getComponentOrientation();
    var2.resetKeyboardActions();
    var2.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test20");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    int var6 = var2.countComponents();
    java.awt.FocusTraversalPolicy var7 = var2.getFocusTraversalPolicy();
    var2.setDebugGraphicsOptions(11);
    java.awt.Rectangle var10 = var2.bounds();
    java.awt.Color var11 = var2.getForeground();
    java.util.Locale var12 = var2.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test21");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.Insets var7 = var2.getInsets();
    javax.swing.JToolTip var8 = var2.createToolTip();
    var2.invalidate();
    var2.firePropertyChange("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", false, true);
    var2.setToolTipText("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    boolean var16 = var2.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test22");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    javax.swing.event.AncestorListener[] var10 = var2.getAncestorListeners();
    var2.enable(false);
    java.awt.Dimension var13 = var2.minimumSize();
    java.awt.GraphicsConfiguration var14 = var2.getGraphicsConfiguration();
    bierse.view.RunningMessagePanel var17 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var18 = var17.isMaximumSizeSet();
    var17.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var23 = var17.getTransferHandler();
    boolean var24 = var17.hasFocus();
    javax.swing.event.AncestorListener[] var25 = var17.getAncestorListeners();
    java.awt.Dimension var26 = var17.getMinimumSize();
    bierse.view.RunningMessagePanel var30 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var31 = var30.getPreferredSize();
    java.awt.Dimension var32 = var30.getMaximumSize();
    var30.disable();
    var17.putClientProperty((java.lang.Object)100, (java.lang.Object)var30);
    java.awt.image.VolatileImage var37 = var30.createVolatileImage(100, 24);
    bierse.view.RunningMessagePanel var40 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var41 = var40.getPreferredSize();
    var30.setMinimumSize(var41);
    var2.setMinimumSize(var41);
    int var44 = var2.getStringHeight();
    var2.setToolTipText("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]");
    boolean var47 = var2.requestFocusInWindow();
    java.lang.String var48 = var2.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "bierse.view.RunningMessagePanel[,0,0,0var48,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]"+ "'", var48.equals("bierse.view.RunningMessagePanel[,0,0,0var48,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test23");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    bierse.view.RunningMessagePanel var6 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var7 = var6.isMaximumSizeSet();
    boolean var8 = var6.isOpaque();
    java.awt.event.HierarchyListener[] var9 = var6.getHierarchyListeners();
    int var10 = var6.countComponents();
    java.awt.event.HierarchyBoundsListener[] var11 = var6.getHierarchyBoundsListeners();
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var15 = var14.isMaximumSizeSet();
    boolean var16 = var14.isOpaque();
    java.awt.event.HierarchyListener[] var17 = var14.getHierarchyListeners();
    int var18 = var14.getWidth();
    java.awt.event.ContainerListener[] var19 = var14.getContainerListeners();
    java.awt.Dimension var20 = var14.getMaximumSize();
    var6.setMinimumSize(var20);
    java.awt.Dimension var22 = var2.getSize(var20);
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var25.repaint(1L, (-1), (-1), 0, 100);
    boolean var32 = var25.isFocusTraversable();
    javax.swing.ActionMap var33 = var25.getActionMap();
    var2.setActionMap(var33);
    var2.move(996, 24);
    java.awt.Graphics var38 = var2.getGraphics();
    bierse.view.RunningMessagePanel var41 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var42 = var41.getPreferredSize();
    javax.swing.JPopupMenu var43 = var41.getComponentPopupMenu();
    java.awt.Rectangle var44 = var41.bounds();
    java.awt.Insets var45 = var41.insets();
    java.awt.Point var46 = var41.location();
    java.awt.Point var47 = var2.getLocation(var46);
    bierse.view.RunningMessagePanel var50 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var51 = var50.isMaximumSizeSet();
    boolean var52 = var50.isOpaque();
    java.awt.event.HierarchyListener[] var53 = var50.getHierarchyListeners();
    java.awt.peer.ComponentPeer var54 = var50.getPeer();
    var50.setAutoscrolls(false);
    bierse.view.RunningMessagePanel var59 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var60 = var59.isMaximumSizeSet();
    boolean var61 = var59.isOpaque();
    java.beans.PropertyChangeListener[] var62 = var59.getPropertyChangeListeners();
    var59.setOpaque(true);
    java.awt.Insets var65 = var59.insets();
    boolean var66 = var59.isOptimizedDrawingEnabled();
    var59.setEnabled(true);
    java.awt.Font var69 = var59.getFont();
    var50.setFont(var69);
    java.awt.FontMetrics var71 = var2.getFontMetrics(var69);
    java.awt.Component var74 = var2.getComponentAt(996, 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test24");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.layout();
    var2.revalidate();
    boolean var6 = var2.isFocusOwner();
    float var7 = var2.getAlignmentX();
    javax.swing.JToolTip var8 = var2.createToolTip();
    java.awt.event.MouseMotionListener[] var9 = var2.getMouseMotionListeners();
    bierse.view.RunningMessagePanel var12 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var12.transferFocus();
    var12.show();
    float var15 = var12.getAlignmentX();
    var12.repaint(0L, 10, 0, 10, (-1));
    boolean var22 = var12.isEnabled();
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var26 = var25.getPreferredSize();
    javax.swing.JPopupMenu var27 = var25.getComponentPopupMenu();
    java.awt.Rectangle var28 = var25.bounds();
    java.awt.Rectangle var29 = var12.getBounds(var28);
    var2.computeVisibleRect(var28);
    var2.setAlignmentY((-1.0f));
    var2.setFocusTraversalKeysEnabled(false);
    boolean var37 = var2.contains(11, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test25");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    bierse.view.RunningMessagePanel var6 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var7 = var6.isMaximumSizeSet();
    boolean var8 = var6.isOpaque();
    java.awt.event.HierarchyListener[] var9 = var6.getHierarchyListeners();
    int var10 = var6.countComponents();
    java.awt.event.HierarchyBoundsListener[] var11 = var6.getHierarchyBoundsListeners();
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var15 = var14.isMaximumSizeSet();
    boolean var16 = var14.isOpaque();
    java.awt.event.HierarchyListener[] var17 = var14.getHierarchyListeners();
    int var18 = var14.getWidth();
    java.awt.event.ContainerListener[] var19 = var14.getContainerListeners();
    java.awt.Dimension var20 = var14.getMaximumSize();
    var6.setMinimumSize(var20);
    java.awt.Dimension var22 = var2.getSize(var20);
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var25.repaint(1L, (-1), (-1), 0, 100);
    boolean var32 = var25.isFocusTraversable();
    javax.swing.ActionMap var33 = var25.getActionMap();
    var2.setActionMap(var33);
    boolean var35 = var2.isMaximumSizeSet();
    var2.setEnabled(false);
    bierse.view.RunningMessagePanel var40 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var41 = var40.isMaximumSizeSet();
    var40.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    int var46 = var40.getWidth();
    boolean var49 = var40.inside(24, 1);
    bierse.view.RunningMessagePanel var52 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var53 = var52.isMaximumSizeSet();
    var52.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var58 = var52.getTransferHandler();
    boolean var59 = var52.hasFocus();
    var52.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var62 = var52.getPreferredSize();
    java.awt.ComponentOrientation var63 = var52.getComponentOrientation();
    var40.setComponentOrientation(var63);
    var2.applyComponentOrientation(var63);
    java.lang.String var66 = var2.getUIClassID();
    boolean var67 = var2.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "PanelUI"+ "'", var66.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test26");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    var2.setAlignmentX((-1.0f));
    java.awt.Toolkit var9 = var2.getToolkit();
    java.lang.String var10 = var2.toString();
    boolean var11 = var2.isFocusTraversalPolicySet();
    var2.move(12, 1);
    var2.hide();
    bierse.view.RunningMessagePanel var19 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var20 = var19.getPreferredSize();
    boolean var23 = var19.contains(10, 1);
    java.awt.Insets var24 = var19.getInsets();
    javax.swing.JToolTip var25 = var19.createToolTip();
    var19.invalidate();
    bierse.view.RunningMessagePanel var29 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var30 = var29.getPreferredSize();
    java.awt.Point var31 = var29.getMousePosition();
    var29.revalidate();
    boolean var33 = var19.isFocusCycleRoot((java.awt.Container)var29);
    java.awt.Point var34 = var19.location();
    javax.swing.InputMap var35 = var19.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setInputMap(15, var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "bierse.view.RunningMessagePanel[,0,0,0var10,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var10.equals("bierse.view.RunningMessagePanel[,0,0,0var10,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test27");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    java.awt.event.FocusListener[] var8 = var2.getFocusListeners();
    java.awt.Font var9 = var2.getFont();
    java.awt.Cursor var10 = var2.getCursor();
    boolean var11 = var2.isValidateRoot();
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var15 = var14.getPreferredSize();
    java.awt.Point var16 = var14.getMousePosition();
    var14.setDoubleBuffered(false);
    javax.swing.InputMap var20 = var14.getInputMap(1);
    java.awt.Point var21 = var14.location();
    java.awt.Point var22 = var2.getLocation(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test28");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var2.setDebugGraphicsOptions(10);
    java.lang.Object var5 = var2.getTreeLock();
    bierse.view.RunningMessagePanel var8 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var9 = var8.isMaximumSizeSet();
    var8.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var14 = var8.getTransferHandler();
    boolean var15 = var8.hasFocus();
    javax.swing.event.AncestorListener[] var16 = var8.getAncestorListeners();
    java.awt.Dimension var17 = var8.getMinimumSize();
    var2.setPreferredSize(var17);
    int var19 = var2.getDebugGraphicsOptions();
    var2.revalidate();
    var2.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test29");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    var2.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var12 = var2.getPreferredSize();
    java.awt.ComponentOrientation var13 = var2.getComponentOrientation();
    bierse.view.RunningMessagePanel var16 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var17 = var16.isMaximumSizeSet();
    var16.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var22 = var16.getTransferHandler();
    boolean var23 = var16.hasFocus();
    javax.swing.event.AncestorListener[] var24 = var16.getAncestorListeners();
    bierse.view.RunningMessagePanel var27 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var28 = var27.isMaximumSizeSet();
    var27.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var33 = var27.getTransferHandler();
    boolean var34 = var27.hasFocus();
    var27.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var37 = var27.getPreferredSize();
    java.awt.ComponentOrientation var38 = var27.getComponentOrientation();
    var2.add((java.awt.Component)var16, (java.lang.Object)var27);
    boolean var40 = var2.isDoubleBuffered();
    var2.addNotify();
    bierse.view.RunningMessagePanel var44 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var45 = var44.isMaximumSizeSet();
    boolean var46 = var44.isOpaque();
    java.beans.PropertyChangeListener[] var47 = var44.getPropertyChangeListeners();
    var44.setOpaque(true);
    java.awt.Insets var50 = var44.insets();
    boolean var51 = var44.isOptimizedDrawingEnabled();
    var44.disable();
    java.awt.peer.ComponentPeer var53 = var44.getPeer();
    var44.setRequestFocusEnabled(true);
    bierse.view.RunningMessagePanel var59 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var60 = var59.getPreferredSize();
    boolean var63 = var59.contains(10, 1);
    java.awt.im.InputMethodRequests var64 = var59.getInputMethodRequests();
    javax.swing.InputMap var65 = var59.getInputMap();
    var44.setInputMap(1, var65);
    java.awt.LayoutManager var67 = var44.getLayout();
    var2.setLayout(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test30");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    int var6 = var2.countComponents();
    java.awt.event.HierarchyBoundsListener[] var7 = var2.getHierarchyBoundsListeners();
    java.util.Locale var8 = var2.getLocale();
    javax.swing.JComponent.setDefaultLocale(var8);
    javax.swing.JComponent.setDefaultLocale(var8);
    javax.swing.JComponent.setDefaultLocale(var8);
    javax.swing.JComponent.setDefaultLocale(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test31");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isLightweight();
    java.awt.event.KeyListener[] var4 = var2.getKeyListeners();
    var2.enable(true);
    boolean var7 = var2.isFontSet();
    boolean var8 = var2.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test32");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 10);
    java.awt.event.MouseWheelListener[] var3 = var2.getMouseWheelListeners();
    bierse.view.RunningMessagePanel var6 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var6.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var13 = var6.location();
    java.awt.Component var14 = var2.findComponentAt(var13);
    var2.setEnabled(true);
    bierse.view.RunningMessagePanel var19 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var19.transferFocus();
    var19.show();
    float var22 = var19.getAlignmentX();
    boolean var25 = var19.contains(0, 24);
    bierse.view.RunningMessagePanel var28 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var29 = var28.getPreferredSize();
    java.awt.Dimension var30 = var28.getMaximumSize();
    java.awt.event.FocusListener[] var31 = var28.getFocusListeners();
    bierse.view.RunningMessagePanel var34 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var35 = var34.getPreferredSize();
    boolean var38 = var34.contains(10, 1);
    java.awt.im.InputMethodRequests var39 = var34.getInputMethodRequests();
    java.awt.Font var40 = var34.getFont();
    var28.setFont(var40);
    java.awt.FontMetrics var42 = var19.getFontMetrics(var40);
    java.awt.FontMetrics var43 = var2.getFontMetrics(var40);
    float var44 = var2.getAlignmentX();
    float var45 = var2.getAlignmentY();
    var2.firePropertyChange("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,disabled,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", '#', '#');
    var2.enable();
    java.awt.event.ContainerListener[] var51 = var2.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test33");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    bierse.view.RunningMessagePanel var6 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var7 = var6.isMaximumSizeSet();
    boolean var8 = var6.isOpaque();
    java.awt.event.HierarchyListener[] var9 = var6.getHierarchyListeners();
    int var10 = var6.countComponents();
    java.awt.event.HierarchyBoundsListener[] var11 = var6.getHierarchyBoundsListeners();
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var15 = var14.isMaximumSizeSet();
    boolean var16 = var14.isOpaque();
    java.awt.event.HierarchyListener[] var17 = var14.getHierarchyListeners();
    int var18 = var14.getWidth();
    java.awt.event.ContainerListener[] var19 = var14.getContainerListeners();
    java.awt.Dimension var20 = var14.getMaximumSize();
    var6.setMinimumSize(var20);
    java.awt.Dimension var22 = var2.getSize(var20);
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var25.repaint(1L, (-1), (-1), 0, 100);
    boolean var32 = var25.isFocusTraversable();
    javax.swing.ActionMap var33 = var25.getActionMap();
    var2.setActionMap(var33);
    boolean var35 = var2.isMaximumSizeSet();
    var2.setEnabled(false);
    bierse.view.RunningMessagePanel var40 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var41 = var40.isLightweight();
    java.beans.VetoableChangeListener[] var42 = var40.getVetoableChangeListeners();
    float var43 = var40.getAlignmentY();
    bierse.view.RunningMessagePanel var46 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var47 = var46.isMaximumSizeSet();
    var46.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    var46.invalidate();
    bierse.view.RunningMessagePanel var55 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var56 = var55.isMaximumSizeSet();
    var55.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    bierse.view.RunningMessagePanel var63 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var64 = var63.isMaximumSizeSet();
    var63.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    int var69 = var63.getWidth();
    java.awt.Component[] var70 = var63.getComponents();
    var46.putClientProperty((java.lang.Object)var55, (java.lang.Object)var70);
    java.util.Locale var72 = var55.getLocale();
    javax.swing.JComponent.setDefaultLocale(var72);
    var40.setLocale(var72);
    var40.setMessage("hi!");
    java.awt.Color var77 = var40.getBackground();
    var2.setForeground(var77);
    java.awt.Container var79 = var2.getParent();
    java.awt.Insets var80 = var2.insets();
    javax.swing.KeyStroke[] var81 = var2.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test34");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    java.awt.event.FocusListener[] var8 = var2.getFocusListeners();
    java.awt.Font var9 = var2.getFont();
    var2.enable();
    int var11 = var2.getY();
    var2.setFocusTraversalKeysEnabled(false);
    bierse.view.RunningMessagePanel var17 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var18 = var17.isMaximumSizeSet();
    var17.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var23 = var17.getTransferHandler();
    boolean var24 = var17.hasFocus();
    javax.swing.event.AncestorListener[] var25 = var17.getAncestorListeners();
    java.awt.Dimension var26 = var17.getMinimumSize();
    bierse.view.RunningMessagePanel var30 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var31 = var30.getPreferredSize();
    java.awt.Dimension var32 = var30.getMaximumSize();
    var30.disable();
    var17.putClientProperty((java.lang.Object)100, (java.lang.Object)var30);
    javax.swing.InputVerifier var35 = var30.getInputVerifier();
    boolean var36 = var30.getInheritsPopupMenu();
    var30.setLocation(0, 100);
    boolean var40 = var30.isFocusTraversalPolicyProvider();
    var30.list();
    javax.swing.event.AncestorListener[] var42 = var30.getAncestorListeners();
    java.util.Set var44 = var30.getFocusTraversalKeys(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setFocusTraversalKeys(14, var44);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test35");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    var2.revalidate();
    java.awt.event.HierarchyListener[] var9 = var2.getHierarchyListeners();
    var2.invalidate();
    java.awt.dnd.DropTarget var11 = var2.getDropTarget();
    java.awt.Dimension var12 = var2.getMaximumSize();
    javax.swing.JToolTip var13 = var2.createToolTip();
    boolean var14 = var2.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test36");


    bierse.view.MyKeyMap var2 = new bierse.view.MyKeyMap("hi!", 1);
    java.lang.String var3 = var2.getText();
    int var4 = var2.getCode();
    int var5 = var2.getCode();
    int var6 = var2.getCode();
    java.lang.String var7 = var2.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test37");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    var2.invalidate();
    java.awt.Dimension var9 = var2.getPreferredSize();
    int var10 = var2.getWidth();
    java.awt.event.ContainerListener[] var11 = var2.getContainerListeners();
    boolean var12 = var2.isFocusOwner();
    int var15 = var2.getBaseline(15, 12);
    var2.setInheritsPopupMenu(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test38");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    java.awt.Point var4 = var2.getMousePosition();
    var2.revalidate();
    bierse.view.RunningMessagePanel var8 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var9 = var8.isMaximumSizeSet();
    var8.layout();
    var8.invalidate();
    var2.setNextFocusableComponent((java.awt.Component)var8);
    bierse.view.RunningMessagePanel var15 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var16 = var15.getPreferredSize();
    boolean var19 = var15.contains(10, 1);
    java.awt.Insets var20 = var15.getInsets();
    javax.swing.JToolTip var21 = var15.createToolTip();
    bierse.view.RunningMessagePanel var24 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var25 = var24.isMaximumSizeSet();
    var24.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var30 = var24.getTransferHandler();
    boolean var31 = var24.hasFocus();
    var24.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var34 = var24.getPreferredSize();
    java.awt.ComponentOrientation var35 = var24.getComponentOrientation();
    bierse.view.RunningMessagePanel var38 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var39 = var38.isMaximumSizeSet();
    var38.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var44 = var38.getTransferHandler();
    boolean var45 = var38.hasFocus();
    javax.swing.event.AncestorListener[] var46 = var38.getAncestorListeners();
    bierse.view.RunningMessagePanel var49 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var50 = var49.isMaximumSizeSet();
    var49.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var55 = var49.getTransferHandler();
    boolean var56 = var49.hasFocus();
    var49.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var59 = var49.getPreferredSize();
    java.awt.ComponentOrientation var60 = var49.getComponentOrientation();
    var24.add((java.awt.Component)var38, (java.lang.Object)var49);
    bierse.view.RunningMessagePanel var64 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var65 = var64.getPreferredSize();
    java.awt.Dimension var66 = var64.getMaximumSize();
    var49.resize(var66);
    var21.setPreferredSize(var66);
    java.awt.Dimension var69 = var2.getSize(var66);
    boolean var70 = var2.isCursorSet();
    var2.setAlignmentY(1.0f);
    float var73 = var2.getAlignmentY();
    java.awt.Component[] var74 = var2.getComponents();
    javax.swing.InputVerifier var75 = var2.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test39");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    int var8 = var2.getWidth();
    java.awt.Image var11 = var2.createImage(24, 24);
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var15 = var14.getPreferredSize();
    java.awt.Dimension var16 = var14.getMaximumSize();
    var14.repaint();
    var14.disable();
    java.awt.Rectangle var19 = var14.getBounds();
    java.awt.Rectangle var20 = var2.getBounds(var19);
    var2.removeAll();
    boolean var22 = var2.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test40");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var2.setDebugGraphicsOptions(10);
    java.lang.Object var5 = var2.getTreeLock();
    bierse.view.RunningMessagePanel var8 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var9 = var8.isMaximumSizeSet();
    var8.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var14 = var8.getTransferHandler();
    boolean var15 = var8.hasFocus();
    javax.swing.event.AncestorListener[] var16 = var8.getAncestorListeners();
    java.awt.Dimension var17 = var8.getMinimumSize();
    var2.setPreferredSize(var17);
    int var19 = var2.getDebugGraphicsOptions();
    var2.revalidate();
    java.awt.Dimension var21 = var2.getPreferredSize();
    java.awt.Rectangle var22 = var2.getBounds();
    var2.setFocusTraversalKeysEnabled(true);
    boolean var25 = var2.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test41");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    javax.swing.event.AncestorListener[] var10 = var2.getAncestorListeners();
    java.awt.Dimension var11 = var2.getMinimumSize();
    bierse.view.RunningMessagePanel var15 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var16 = var15.getPreferredSize();
    java.awt.Dimension var17 = var15.getMaximumSize();
    var15.disable();
    var2.putClientProperty((java.lang.Object)100, (java.lang.Object)var15);
    var15.setEnabled(false);
    bierse.view.RunningMessagePanel var24 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var24.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var31 = var24.location();
    java.awt.Font var32 = var24.getFont();
    var15.setNextFocusableComponent((java.awt.Component)var24);
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var37 = var36.isMaximumSizeSet();
    var36.layout();
    bierse.view.RunningMessagePanel var41 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var42 = var41.isMaximumSizeSet();
    boolean var43 = var41.isOpaque();
    java.awt.event.HierarchyListener[] var44 = var41.getHierarchyListeners();
    int var45 = var41.countComponents();
    java.awt.event.HierarchyBoundsListener[] var46 = var41.getHierarchyBoundsListeners();
    boolean var48 = var41.areFocusTraversalKeysSet(1);
    bierse.view.RunningMessagePanel var51 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var52 = var51.getPreferredSize();
    javax.swing.JPopupMenu var53 = var51.getComponentPopupMenu();
    bierse.view.RunningMessagePanel var56 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var57 = var56.getPreferredSize();
    javax.swing.JPopupMenu var58 = var56.getComponentPopupMenu();
    java.awt.Rectangle var59 = var56.bounds();
    var51.computeVisibleRect(var59);
    var41.setBounds(var59);
    var36.repaint(var59);
    var36.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", (byte)(-1), (byte)(-1));
    java.awt.Insets var67 = var36.insets();
    var24.remove((java.awt.Component)var36);
    var36.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test42");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    java.awt.event.FocusListener[] var8 = var2.getFocusListeners();
    java.awt.Font var9 = var2.getFont();
    var2.enable();
    bierse.view.RunningMessagePanel var13 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var14 = var13.isMaximumSizeSet();
    var13.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var19 = var13.getTransferHandler();
    boolean var20 = var13.hasFocus();
    javax.swing.event.AncestorListener[] var21 = var13.getAncestorListeners();
    java.awt.Dimension var22 = var13.getMinimumSize();
    bierse.view.RunningMessagePanel var26 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var27 = var26.getPreferredSize();
    java.awt.Dimension var28 = var26.getMaximumSize();
    var26.disable();
    var13.putClientProperty((java.lang.Object)100, (java.lang.Object)var26);
    java.awt.image.VolatileImage var33 = var26.createVolatileImage(100, 24);
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var37 = var36.getPreferredSize();
    var26.setMinimumSize(var37);
    boolean var39 = var26.isValid();
    bierse.view.RunningMessagePanel var42 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var43 = var42.getPreferredSize();
    boolean var46 = var42.contains(10, 1);
    java.awt.im.InputMethodRequests var47 = var42.getInputMethodRequests();
    boolean var50 = var42.inside((-1), 100);
    bierse.view.RunningMessagePanel var53 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var54 = var53.getPreferredSize();
    boolean var57 = var53.contains(10, 1);
    var53.setAlignmentX((-1.0f));
    java.awt.Point var60 = var53.getLocation();
    java.awt.Point var61 = var42.getLocation(var60);
    boolean var64 = var42.contains(100, 0);
    var2.add((java.awt.Component)var26, (java.lang.Object)var42);
    var2.setAutoscrolls(false);
    boolean var68 = var2.isFocusCycleRoot();
    javax.accessibility.AccessibleContext var69 = var2.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test43");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    bierse.view.RunningMessagePanel var6 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var7 = var6.isMaximumSizeSet();
    boolean var8 = var6.isOpaque();
    java.awt.event.HierarchyListener[] var9 = var6.getHierarchyListeners();
    int var10 = var6.countComponents();
    java.awt.event.HierarchyBoundsListener[] var11 = var6.getHierarchyBoundsListeners();
    bierse.view.RunningMessagePanel var14 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var15 = var14.isMaximumSizeSet();
    boolean var16 = var14.isOpaque();
    java.awt.event.HierarchyListener[] var17 = var14.getHierarchyListeners();
    int var18 = var14.getWidth();
    java.awt.event.ContainerListener[] var19 = var14.getContainerListeners();
    java.awt.Dimension var20 = var14.getMaximumSize();
    var6.setMinimumSize(var20);
    java.awt.Dimension var22 = var2.getSize(var20);
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var25.repaint(1L, (-1), (-1), 0, 100);
    boolean var32 = var25.isFocusTraversable();
    javax.swing.ActionMap var33 = var25.getActionMap();
    var2.setActionMap(var33);
    boolean var35 = var2.isMaximumSizeSet();
    java.awt.event.HierarchyListener[] var36 = var2.getHierarchyListeners();
    boolean var37 = var2.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test44");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.beans.PropertyChangeListener[] var5 = var2.getPropertyChangeListeners();
    boolean var6 = var2.isFocusCycleRoot();
    java.awt.Toolkit var7 = var2.getToolkit();
    java.awt.Dimension var8 = var2.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test45");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    var2.disable();
    boolean var8 = var2.isDoubleBuffered();
    bierse.view.RunningMessagePanel var11 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var12 = var11.isMaximumSizeSet();
    bierse.view.RunningMessagePanel var15 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var16 = var15.isMaximumSizeSet();
    boolean var17 = var15.isOpaque();
    java.awt.event.HierarchyListener[] var18 = var15.getHierarchyListeners();
    int var19 = var15.countComponents();
    java.awt.event.HierarchyBoundsListener[] var20 = var15.getHierarchyBoundsListeners();
    bierse.view.RunningMessagePanel var23 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var24 = var23.isMaximumSizeSet();
    boolean var25 = var23.isOpaque();
    java.awt.event.HierarchyListener[] var26 = var23.getHierarchyListeners();
    int var27 = var23.getWidth();
    java.awt.event.ContainerListener[] var28 = var23.getContainerListeners();
    java.awt.Dimension var29 = var23.getMaximumSize();
    var15.setMinimumSize(var29);
    java.awt.Dimension var31 = var11.getSize(var29);
    bierse.view.RunningMessagePanel var34 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var34.repaint(1L, (-1), (-1), 0, 100);
    boolean var41 = var34.isFocusTraversable();
    javax.swing.ActionMap var42 = var34.getActionMap();
    var11.setActionMap(var42);
    boolean var44 = var11.isMaximumSizeSet();
    java.awt.Dimension var45 = var11.size();
    var2.setSize(var45);
    int var47 = var2.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test46");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    javax.swing.InputMap var5 = var2.getInputMap();
    java.lang.String var6 = var2.getName();
    var2.setFocusTraversalPolicyProvider(true);
    bierse.view.RunningMessagePanel var11 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var11.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var18 = var11.location();
    java.awt.Component var19 = var2.findComponentAt(var18);
    java.awt.LayoutManager var20 = var2.getLayout();
    bierse.view.RunningMessagePanel var23 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var24 = var23.isMaximumSizeSet();
    boolean var25 = var23.isOpaque();
    javax.swing.InputMap var26 = var23.getInputMap();
    java.beans.PropertyChangeListener[] var28 = var23.getPropertyChangeListeners("");
    java.lang.String var29 = var23.toString();
    boolean var30 = var2.isFocusCycleRoot((java.awt.Container)var23);
    var2.setFocusTraversalPolicyProvider(true);
    bierse.view.RunningMessagePanel var35 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var36 = var35.isMaximumSizeSet();
    boolean var37 = var35.isOpaque();
    javax.swing.InputMap var38 = var35.getInputMap();
    java.beans.PropertyChangeListener[] var40 = var35.getPropertyChangeListeners("");
    java.awt.ComponentOrientation var41 = var35.getComponentOrientation();
    java.awt.peer.ComponentPeer var42 = var35.getPeer();
    java.awt.Dimension var43 = var35.getMaximumSize();
    var35.setSpeed(13);
    boolean var46 = var35.getInheritsPopupMenu();
    boolean var47 = var35.isDoubleBuffered();
    boolean var48 = var2.isFocusCycleRoot((java.awt.Container)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "bierse.view.RunningMessagePanel[,0,0,0var29,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]"+ "'", var29.equals("bierse.view.RunningMessagePanel[,0,0,0var29,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test47");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    var2.firePropertyChange("bierse.view.RunningMessagePanel[,0,0,32767x32767,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 0.0f, 100.0f);
    java.awt.FocusTraversalPolicy var10 = var2.getFocusTraversalPolicy();
    bierse.view.RunningMessagePanel var13 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var14 = var13.isMaximumSizeSet();
    var13.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var19 = var13.getTransferHandler();
    boolean var20 = var13.hasFocus();
    var13.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var23 = var13.getPreferredSize();
    java.awt.ComponentOrientation var24 = var13.getComponentOrientation();
    bierse.view.RunningMessagePanel var27 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var28 = var27.isMaximumSizeSet();
    var27.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var33 = var27.getTransferHandler();
    boolean var34 = var27.hasFocus();
    var27.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var37 = var27.getPreferredSize();
    java.awt.Dimension var38 = var13.getSize(var37);
    var13.repaint(100L, 1, 0, 100, 24);
    var13.updateUI();
    var13.removeNotify();
    bierse.view.RunningMessagePanel var49 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var50 = var49.isMaximumSizeSet();
    var49.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var55 = var49.getTransferHandler();
    boolean var56 = var49.hasFocus();
    javax.swing.event.AncestorListener[] var57 = var49.getAncestorListeners();
    java.awt.Dimension var58 = var49.getMinimumSize();
    var49.setVisible(true);
    boolean var61 = var49.getAutoscrolls();
    var2.add((java.awt.Component)var13, (java.lang.Object)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test48");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    boolean var8 = var2.getInheritsPopupMenu();
    java.awt.Dimension var9 = var2.getSize();
    boolean var10 = var2.isFontSet();
    var2.setName("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=8,maximumSize=,minimumSize=,preferredSize=]");
    var2.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test49");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    var2.disable();
    java.awt.Container var8 = var2.getFocusCycleRootAncestor();
    boolean var9 = var2.requestDefaultFocus();
    java.awt.Component[] var10 = var2.getComponents();
    bierse.view.RunningMessagePanel var13 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var14 = var13.isMaximumSizeSet();
    boolean var15 = var13.isOpaque();
    java.awt.event.HierarchyListener[] var16 = var13.getHierarchyListeners();
    int var17 = var13.getWidth();
    java.awt.event.ContainerListener[] var18 = var13.getContainerListeners();
    java.awt.Dimension var19 = var13.getMaximumSize();
    boolean var20 = var13.isRequestFocusEnabled();
    boolean var21 = var13.isCursorSet();
    bierse.view.RunningMessagePanel var25 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var26 = var25.isMaximumSizeSet();
    boolean var27 = var25.isOpaque();
    java.beans.PropertyChangeListener[] var28 = var25.getPropertyChangeListeners();
    var25.setOpaque(true);
    java.awt.Component var31 = var13.add("bierse.view.RunningMessagePanel[NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (java.awt.Component)var25);
    bierse.view.RunningMessagePanel var34 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var34.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var41 = var34.location();
    java.awt.Font var42 = var34.getFont();
    boolean var43 = var34.requestFocusInWindow();
    bierse.view.RunningMessagePanel var46 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var47 = var46.isMaximumSizeSet();
    var46.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var52 = var46.getTransferHandler();
    boolean var53 = var46.hasFocus();
    javax.swing.event.AncestorListener[] var54 = var46.getAncestorListeners();
    java.awt.Dimension var55 = var46.getMinimumSize();
    bierse.view.RunningMessagePanel var59 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var60 = var59.getPreferredSize();
    java.awt.Dimension var61 = var59.getMaximumSize();
    var59.disable();
    var46.putClientProperty((java.lang.Object)100, (java.lang.Object)var59);
    int var64 = var46.getHeight();
    bierse.view.RunningMessagePanel var67 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var67.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var74 = var67.location();
    boolean var75 = var46.contains(var74);
    java.awt.Component var76 = var34.getComponentAt(var74);
    java.awt.Component var77 = var13.getComponentAt(var74);
    java.awt.Component var78 = var2.findComponentAt(var74);
    java.lang.String var79 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test50");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    var2.invalidate();
    bierse.view.RunningMessagePanel var11 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var12 = var11.isMaximumSizeSet();
    var11.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    bierse.view.RunningMessagePanel var19 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var20 = var19.isMaximumSizeSet();
    var19.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    int var25 = var19.getWidth();
    java.awt.Component[] var26 = var19.getComponents();
    var2.putClientProperty((java.lang.Object)var11, (java.lang.Object)var26);
    var11.transferFocus();
    var11.setToolTipText("");
    var11.show();
    int var32 = var11.getStringWidth();
    java.awt.Point var33 = var11.getLocation();
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var37 = var36.isMaximumSizeSet();
    boolean var38 = var36.isOpaque();
    javax.swing.InputMap var39 = var36.getInputMap();
    java.beans.PropertyChangeListener[] var41 = var36.getPropertyChangeListeners("");
    java.awt.ComponentOrientation var42 = var36.getComponentOrientation();
    java.awt.peer.ComponentPeer var43 = var36.getPeer();
    var36.transferFocusDownCycle();
    bierse.view.RunningMessagePanel var47 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 10);
    java.awt.event.MouseWheelListener[] var48 = var47.getMouseWheelListeners();
    bierse.view.RunningMessagePanel var51 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var51.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var58 = var51.location();
    java.awt.Component var59 = var47.findComponentAt(var58);
    bierse.view.RunningMessagePanel var62 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var62.transferFocus();
    var62.show();
    bierse.view.RunningMessagePanel var67 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var68 = var67.getPreferredSize();
    boolean var71 = var67.contains(10, 1);
    java.awt.im.InputMethodRequests var72 = var67.getInputMethodRequests();
    java.awt.Font var73 = var67.getFont();
    var62.setFont(var73);
    var47.setFont(var73);
    var36.setFont(var73);
    var11.setFont(var73);
    java.awt.event.HierarchyBoundsListener[] var78 = var11.getHierarchyBoundsListeners();
    java.awt.Rectangle var79 = var11.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 996);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test51");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    var2.invalidate();
    java.awt.Dimension var9 = var2.getPreferredSize();
    bierse.view.RunningMessagePanel var12 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var12.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var19 = var12.location();
    java.awt.Point var20 = var2.getLocation(var19);
    var2.transferFocusBackward();
    java.awt.Color var22 = var2.getBackground();
    java.lang.String var23 = var2.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "PanelUI"+ "'", var23.equals("PanelUI"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test52");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var8 = var2.getTransferHandler();
    boolean var9 = var2.hasFocus();
    javax.swing.event.AncestorListener[] var10 = var2.getAncestorListeners();
    javax.accessibility.AccessibleContext var11 = var2.getAccessibleContext();
    javax.swing.ActionMap var12 = var2.getActionMap();
    boolean var13 = var2.isEnabled();
    boolean var14 = var2.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test53");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    var2.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    int var8 = var2.getWidth();
    java.awt.im.InputMethodRequests var9 = var2.getInputMethodRequests();
    java.awt.im.InputContext var10 = var2.getInputContext();
    java.awt.Dimension var11 = var2.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test54");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var4 = var2.isPreferredSizeSet();
    var2.setOpaque(true);
    bierse.view.RunningMessagePanel var9 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var10 = var9.isMaximumSizeSet();
    var9.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var15 = var9.getTransferHandler();
    boolean var16 = var9.hasFocus();
    javax.swing.event.AncestorListener[] var17 = var9.getAncestorListeners();
    java.awt.Dimension var18 = var9.getMinimumSize();
    bierse.view.RunningMessagePanel var22 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var23 = var22.getPreferredSize();
    java.awt.Dimension var24 = var22.getMaximumSize();
    var22.disable();
    var9.putClientProperty((java.lang.Object)100, (java.lang.Object)var22);
    javax.swing.InputVerifier var27 = var22.getInputVerifier();
    boolean var28 = var22.getInheritsPopupMenu();
    var22.setLocation(0, 100);
    boolean var32 = var22.isFocusTraversalPolicyProvider();
    var22.list();
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var36.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var43 = var36.location();
    java.awt.Font var44 = var36.getFont();
    var22.setFont(var44);
    java.awt.FontMetrics var46 = var2.getFontMetrics(var44);
    var2.setVerifyInputWhenFocusTarget(true);
    boolean var49 = var2.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test55");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var3 = var2.isMaximumSizeSet();
    boolean var4 = var2.isOpaque();
    java.awt.event.HierarchyListener[] var5 = var2.getHierarchyListeners();
    int var6 = var2.getWidth();
    int var7 = var2.countComponents();
    var2.firePropertyChange("bierse.view.RunningMessagePanel[,0,0,0x0,invalid,layout=java.awt.FlowLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=41,maximumSize=,minimumSize=,preferredSize=]", (short)1, (short)10);
    java.lang.String var12 = var2.getUIClassID();
    bierse.view.RunningMessagePanel var15 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var16 = var15.isMaximumSizeSet();
    boolean var17 = var15.isOpaque();
    javax.swing.InputMap var18 = var15.getInputMap();
    java.lang.String var19 = var15.getName();
    var15.setFocusTraversalPolicyProvider(true);
    bierse.view.RunningMessagePanel var24 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var24.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var31 = var24.location();
    java.awt.Component var32 = var15.findComponentAt(var31);
    int var33 = var15.getX();
    boolean var34 = var15.isShowing();
    bierse.view.RunningMessagePanel var37 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var38 = var37.getPreferredSize();
    boolean var41 = var37.contains(10, 1);
    java.awt.im.InputMethodRequests var42 = var37.getInputMethodRequests();
    var37.revalidate();
    java.awt.event.HierarchyListener[] var44 = var37.getHierarchyListeners();
    javax.swing.JRootPane var45 = var37.getRootPane();
    var37.validate();
    var37.setAlignmentY(100.0f);
    java.awt.Point var49 = var37.location();
    java.awt.Component var50 = var15.findComponentAt(var49);
    java.awt.Component var51 = var2.getComponentAt(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "PanelUI"+ "'", var12.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test56");


    bierse.view.KeyMapComboBoxModel var0 = new bierse.view.KeyMapComboBoxModel();
    bierse.view.RunningMessagePanel var3 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var4 = var3.isMaximumSizeSet();
    boolean var5 = var3.isOpaque();
    java.beans.PropertyChangeListener[] var6 = var3.getPropertyChangeListeners();
    var3.setOpaque(true);
    var3.setRequestFocusEnabled(false);
    var0.insertElementAt((java.lang.Object)var3, 1);
    bierse.view.RunningMessagePanel var15 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 10);
    java.awt.event.MouseWheelListener[] var16 = var15.getMouseWheelListeners();
    bierse.view.RunningMessagePanel var19 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var19.repaint(1L, (-1), (-1), 0, 100);
    java.awt.Point var26 = var19.location();
    java.awt.Component var27 = var15.findComponentAt(var26);
    var15.setEnabled(true);
    bierse.view.RunningMessagePanel var32 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var32.transferFocus();
    var32.show();
    float var35 = var32.getAlignmentX();
    boolean var38 = var32.contains(0, 24);
    bierse.view.RunningMessagePanel var41 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var42 = var41.getPreferredSize();
    java.awt.Dimension var43 = var41.getMaximumSize();
    java.awt.event.FocusListener[] var44 = var41.getFocusListeners();
    bierse.view.RunningMessagePanel var47 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var48 = var47.getPreferredSize();
    boolean var51 = var47.contains(10, 1);
    java.awt.im.InputMethodRequests var52 = var47.getInputMethodRequests();
    java.awt.Font var53 = var47.getFont();
    var41.setFont(var53);
    java.awt.FontMetrics var55 = var32.getFontMetrics(var53);
    java.awt.FontMetrics var56 = var15.getFontMetrics(var53);
    int var57 = var15.getWidth();
    var0.addElement((java.lang.Object)var57);
    var0.removeAllElements();
    java.lang.Object var60 = var0.getSelectedItem();
    var0.removeAllElements();
    java.lang.Object var62 = var0.getSelectedItem();
    var0.removeAllElements();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test57");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var4 = var2.isPreferredSizeSet();
    var2.enable();
    javax.accessibility.AccessibleContext var6 = var2.getAccessibleContext();
    bierse.view.RunningMessagePanel var9 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    var9.transferFocus();
    var9.show();
    float var12 = var9.getAlignmentX();
    var9.repaint(0L, 10, 0, 10, (-1));
    boolean var19 = var9.isEnabled();
    bierse.view.RunningMessagePanel var22 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var23 = var22.getPreferredSize();
    javax.swing.JPopupMenu var24 = var22.getComponentPopupMenu();
    java.awt.Rectangle var25 = var22.bounds();
    java.awt.Rectangle var26 = var9.getBounds(var25);
    var2.computeVisibleRect(var26);
    java.awt.Color var28 = var2.getForeground();
    bierse.view.RunningMessagePanel var31 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var32 = var31.isMaximumSizeSet();
    var31.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var37 = var31.getTransferHandler();
    boolean var38 = var31.hasFocus();
    var31.setVerifyInputWhenFocusTarget(false);
    java.awt.Dimension var41 = var31.getPreferredSize();
    java.awt.GraphicsConfiguration var42 = var31.getGraphicsConfiguration();
    java.awt.Dimension var43 = var31.getSize();
    java.awt.ComponentOrientation var44 = var31.getComponentOrientation();
    var2.setComponentOrientation(var44);
    boolean var46 = var2.isShowing();
    java.awt.Graphics var47 = var2.getGraphics();
    java.awt.Point var48 = var2.location();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test58");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    java.awt.Dimension var4 = var2.getMaximumSize();
    java.awt.event.FocusListener[] var5 = var2.getFocusListeners();
    bierse.view.RunningMessagePanel var8 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var9 = var8.getPreferredSize();
    boolean var12 = var8.contains(10, 1);
    java.awt.im.InputMethodRequests var13 = var8.getInputMethodRequests();
    java.awt.Font var14 = var8.getFont();
    var2.setFont(var14);
    java.beans.VetoableChangeListener[] var16 = var2.getVetoableChangeListeners();
    var2.setVerifyInputWhenFocusTarget(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test59");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var3 = var2.getPreferredSize();
    boolean var6 = var2.contains(10, 1);
    java.awt.im.InputMethodRequests var7 = var2.getInputMethodRequests();
    java.awt.event.FocusListener[] var8 = var2.getFocusListeners();
    java.awt.Font var9 = var2.getFont();
    var2.enable();
    bierse.view.RunningMessagePanel var13 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    boolean var14 = var13.isMaximumSizeSet();
    var13.firePropertyChange("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100.0d, 1.0d);
    javax.swing.TransferHandler var19 = var13.getTransferHandler();
    boolean var20 = var13.hasFocus();
    javax.swing.event.AncestorListener[] var21 = var13.getAncestorListeners();
    java.awt.Dimension var22 = var13.getMinimumSize();
    bierse.view.RunningMessagePanel var26 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var27 = var26.getPreferredSize();
    java.awt.Dimension var28 = var26.getMaximumSize();
    var26.disable();
    var13.putClientProperty((java.lang.Object)100, (java.lang.Object)var26);
    java.awt.image.VolatileImage var33 = var26.createVolatileImage(100, 24);
    bierse.view.RunningMessagePanel var36 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var37 = var36.getPreferredSize();
    var26.setMinimumSize(var37);
    boolean var39 = var26.isValid();
    bierse.view.RunningMessagePanel var42 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var43 = var42.getPreferredSize();
    boolean var46 = var42.contains(10, 1);
    java.awt.im.InputMethodRequests var47 = var42.getInputMethodRequests();
    boolean var50 = var42.inside((-1), 100);
    bierse.view.RunningMessagePanel var53 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Dimension var54 = var53.getPreferredSize();
    boolean var57 = var53.contains(10, 1);
    var53.setAlignmentX((-1.0f));
    java.awt.Point var60 = var53.getLocation();
    java.awt.Point var61 = var42.getLocation(var60);
    boolean var64 = var42.contains(100, 0);
    var2.add((java.awt.Component)var26, (java.lang.Object)var42);
    boolean var66 = var42.isRequestFocusEnabled();
    boolean var67 = var42.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest16.test60");


    bierse.view.RunningMessagePanel var2 = new bierse.view.RunningMessagePanel("NAME;MIN_PRICE;START_PRICE;MAX_PRICE;AVG_AMOUNT;AVG_PRICE;AVG_SOLD_PRICE;TOTAL_SOLD", 100);
    java.awt.Component.BaselineResizeBehavior var3 = var2.getBaselineResizeBehavior();
    java.awt.Container var4 = var2.getParent();
    float var5 = var2.getAlignmentX();
    java.awt.Color var6 = var2.getForeground();
    var2.show();
    var2.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

}
