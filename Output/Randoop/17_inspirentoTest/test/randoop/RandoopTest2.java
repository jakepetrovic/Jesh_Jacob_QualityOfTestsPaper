package randoop;

import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test1");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    java.awt.Image var4 = var0.getIconImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test2");


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
    boolean var43 = var0.getScrollableTracksViewportWidth();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test3");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    var0.setEnabled(false);
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    var6.enable();
    boolean var8 = var6.isFocusOwner();
    var6.repaint(100L, 32, 4, 32, 4);
    javax.swing.ActionMap var15 = var6.getActionMap();
    var0.setActionMap(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test4");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    java.awt.image.VolatileImage var5 = var0.createVolatileImage(100, 32);
    java.awt.Component var6 = var0.getGlassPane();
    com.allenstudio.ir.ui.Toolbar var7 = new com.allenstudio.ir.ui.Toolbar();
    boolean var8 = var7.isFloatable();
    var7.show();
    boolean var10 = var7.isRequestFocusEnabled();
    java.awt.Dimension var11 = var7.minimumSize();
    var7.enable(true);
    com.allenstudio.ir.ui.DatePickerPane var14 = new com.allenstudio.ir.ui.DatePickerPane();
    var14.transferFocus();
    java.awt.Dimension var16 = var14.getMinimumSize();
    var7.setMaximumSize(var16);
    var0.setMinimumSize(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test5");


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
    com.allenstudio.ir.ui.MainFrame var35 = new com.allenstudio.ir.ui.MainFrame();
    boolean var36 = var35.isShowing();
    int var37 = var35.countComponents();
    com.allenstudio.ir.ui.StatusBar var38 = new com.allenstudio.ir.ui.StatusBar();
    var38.enable();
    com.allenstudio.ir.ui.StatusBar var40 = new com.allenstudio.ir.ui.StatusBar();
    var40.enable();
    boolean var42 = var40.isFocusOwner();
    var40.firePropertyChange("hi!", 10L, 0L);
    var40.layout();
    var40.removeAll();
    com.allenstudio.ir.ui.StatusBar var49 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var50 = var49.getRootPane();
    java.awt.Point var51 = var49.location();
    java.awt.Point var52 = var40.getLocation(var51);
    var38.setLocation(var52);
    var35.setLocation(var52);
    java.awt.Color var55 = var35.getBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setForegroundAt(100, var55);
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
    assertTrue(var33 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test6");


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
      javax.swing.Icon var61 = var0.getIconAt(10);
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

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test7");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    javax.swing.border.Border var8 = var0.getContentPaneBorder();
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
    assertNull(var8);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test8");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var3 = var2.getUI();
    var0.setUI(var3);
    com.allenstudio.ir.ui.DatePickerPane var5 = new com.allenstudio.ir.ui.DatePickerPane();
    var5.transferFocus();
    com.allenstudio.ir.ui.Toolbar var7 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var8 = var7.getColorModel();
    var7.setEnabled(true);
    java.awt.Component var12 = var7.getComponentAtIndex(1);
    boolean var13 = var7.isFloatable();
    var5.setContent((java.awt.Component)var7);
    java.awt.Color var15 = var7.getForeground();
    boolean var16 = var7.requestFocusInWindow();
    javax.swing.ActionMap var17 = var7.getActionMap();
    var7.repaint(1L);
    var0.setToolBar((javax.swing.JToolBar)var7);
    javax.swing.JToolBar var21 = var0.getToolBar();
    int var22 = var21.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test9");


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
    boolean var15 = var11.getMouseListeningEnabled();
    boolean var16 = var11.getMouseListeningEnabled();
    var11.setDebugGraphicsOptions(30);
    
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
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test10");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    java.awt.Component var3 = var0.getComponentAtIndex(10);
    boolean var4 = var0.isLightweight();
    java.awt.event.MouseWheelListener[] var5 = var0.getMouseWheelListeners();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var7 = var6.getTitle();
    boolean var8 = var6.isManagingFocus();
    java.awt.LayoutManager var9 = var6.getLayout();
    var0.setLayout(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Date Picker"+ "'", var7.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test11");


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
    javax.accessibility.AccessibleContext var31 = var0.getAccessibleContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTitleAt(31, "TabbedPaneUI");
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
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test12");


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
    com.allenstudio.ir.ui.MainFrame var22 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var23 = var22.getWarningString();
    java.awt.Rectangle var24 = var22.getMaximizedBounds();
    java.awt.MenuBar var25 = var22.getMenuBar();
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
    var22.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var26);
    java.awt.event.ComponentListener[] var54 = var26.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var55 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var56 = var55.getDateBackground();
    var55.setYearMonth(1, (-1));
    java.util.Calendar var60 = var55.getSelectedDate();
    var26.remove((java.awt.Component)var55);
    var55.setMarked(1, true);
    var0.addMouseMotionListener((java.awt.event.MouseMotionListener)var55);
    javax.swing.JToolBar var66 = var0.getToolBar();
    java.awt.Dimension var67 = var66.getMinimumSize();
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test13");


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
    com.allenstudio.ir.util.XmlElement var13 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var15 = var13.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var18 = var15.addSubElement("", "hi!");
    java.util.Hashtable var19 = var18.getAttributes();
    com.allenstudio.ir.ui.MainFrame var20 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var21 = var20.getWarningString();
    java.awt.Rectangle var22 = var20.getMaximizedBounds();
    java.awt.MenuBar var23 = var20.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var24 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var20.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var24);
    var20.dispose();
    java.lang.Object var27 = var19.get((java.lang.Object)var20);
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var33 = var30.addSubElement("", "hi!");
    java.util.Hashtable var34 = var33.getAttributes();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.ComponentOrientation var39 = var35.getComponentOrientation();
    java.lang.Object var40 = var19.put((java.lang.Object)var34, (java.lang.Object)var39);
    var0.setComponentOrientation(var39);
    java.awt.Dimension var42 = var0.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test14");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.enable();
    var0.setFocusCycleRoot(true);
    var0.repaint(10L, 3, 761, (-1), 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test15");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    var0.setDoubleBuffered(false);
    boolean var14 = var0.contains(2015, (-1));
    var0.transferFocusDownCycle();
    
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
    assertTrue(var14 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test16");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var3 = var1.addSubElement("hi!");
    var3.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var6 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var8 = var6.addSubElement("hi!");
    var8.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var11 = var3.removeElement(var8);
    com.allenstudio.ir.util.XmlElement var13 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var15 = var13.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var18 = var15.addSubElement("", "hi!");
    java.util.Hashtable var19 = var18.getAttributes();
    com.allenstudio.ir.ui.MainFrame var20 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var21 = var20.getWarningString();
    java.awt.Rectangle var22 = var20.getMaximizedBounds();
    java.awt.MenuBar var23 = var20.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var24 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var20.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var24);
    var20.dispose();
    java.lang.Object var27 = var19.get((java.lang.Object)var20);
    java.util.Set var28 = var19.entrySet();
    com.allenstudio.ir.util.XmlElement var29 = new com.allenstudio.ir.util.XmlElement("Title", var19);
    boolean var30 = var19.isEmpty();
    var3.setAttributes(var19);
    com.allenstudio.ir.util.XmlElement var32 = new com.allenstudio.ir.util.XmlElement("{}", var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test17");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    var0.setEnabled(false);
    java.awt.Insets var6 = var0.getMargin();
    var0.show();
    javax.swing.JToolTip var8 = var0.createToolTip();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test18");


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
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var28 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var29 = var28.getDateBackground();
    com.allenstudio.ir.ui.Toolbar var30 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var31 = var30.getColorModel();
    java.awt.im.InputContext var32 = var30.getInputContext();
    java.awt.Component var34 = var30.getComponent(0);
    java.awt.Font var35 = var30.getFont();
    var28.setHeaderFont(var35);
    boolean var37 = var0.isFocusCycleRoot((java.awt.Container)var28);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test19");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.awt.Container var1 = var0.getContentPane();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.awt.Dimension var3 = var0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test20");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
    java.awt.event.MouseWheelListener[] var4 = var0.getMouseWheelListeners();
    boolean var5 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test21");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.deleteObservers();
    com.allenstudio.ir.util.XmlElement var5 = var2.addSubElement("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var6 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var8 = var6.addSubElement("hi!");
    var8.deleteObservers();
    com.allenstudio.ir.util.XmlElement var11 = var8.addSubElement("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var12 = var5.removeElement(var8);
    java.lang.String var13 = var8.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.util.XmlElement var15 = var8.getElement(30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test22");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var1 = var0.getDescription();
    var0.reshape(10, 1, 10, (-1));
    var0.setFeature("Title");
    java.lang.String var9 = var0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var1.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Title"+ "'", var9.equals("Title"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test23");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    com.allenstudio.ir.ui.DatePickerPane var8 = new com.allenstudio.ir.ui.DatePickerPane();
    var8.transferFocus();
    com.allenstudio.ir.ui.Toolbar var10 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var11 = var10.getColorModel();
    var10.setEnabled(true);
    java.awt.Component var15 = var10.getComponentAtIndex(1);
    boolean var16 = var10.isFloatable();
    var8.setContent((java.awt.Component)var10);
    java.awt.Dimension var18 = var8.size();
    com.allenstudio.ir.ui.Toolbar var19 = new com.allenstudio.ir.ui.Toolbar();
    boolean var20 = var19.isFloatable();
    var19.show();
    boolean var22 = var19.isRequestFocusEnabled();
    java.awt.Dimension var23 = var19.minimumSize();
    var8.setToolBar((javax.swing.JToolBar)var19);
    var19.setDoubleBuffered(false);
    var19.addSeparator();
    int var28 = var0.getComponentZOrder((java.awt.Component)var19);
    int var29 = var19.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test24");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var8 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var9 = var8.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var10 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var11 = var10.getColorModel();
    java.awt.im.InputContext var12 = var10.getInputContext();
    java.awt.Component var14 = var10.getComponentAtIndex(0);
    var8.setToolBar((javax.swing.JToolBar)var10);
    boolean var17 = var8.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var18 = var8.getContentPaneBorder();
    com.allenstudio.ir.ui.MainFrame var19 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var20 = var19.getWarningString();
    java.awt.Rectangle var21 = var19.getMaximizedBounds();
    java.awt.MenuBar var22 = var19.getMenuBar();
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
    var19.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var23);
    java.awt.event.ComponentListener[] var51 = var23.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var52 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var53 = var52.getDateBackground();
    var52.setYearMonth(1, (-1));
    java.util.Calendar var57 = var52.getSelectedDate();
    var23.remove((java.awt.Component)var52);
    var8.removeMouseListener((java.awt.event.MouseListener)var52);
    var5.addMouseMotionListener((java.awt.event.MouseMotionListener)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test25");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.addNotify();
    var0.setState((-1));
    java.awt.Shape var8 = var0.getShape();
    java.awt.im.InputContext var9 = var0.getInputContext();
    com.allenstudio.ir.ui.MainFrame var10 = new com.allenstudio.ir.ui.MainFrame();
    boolean var11 = var10.isShowing();
    int var12 = var10.countComponents();
    var10.setAutoRequestFocus(false);
    javax.swing.JMenuBar var15 = var10.getJMenuBar();
    boolean var16 = var15.isBorderPainted();
    var15.menuSelectionChanged(true);
    com.allenstudio.ir.ui.MainFrame var19 = new com.allenstudio.ir.ui.MainFrame();
    boolean var20 = var19.isShowing();
    int var21 = var19.countComponents();
    var19.setAutoRequestFocus(false);
    javax.swing.JMenuBar var24 = var19.getJMenuBar();
    boolean var25 = var24.isBorderPainted();
    var24.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    var27.transferFocus();
    java.awt.Dimension var29 = var27.getMinimumSize();
    java.awt.Dimension var30 = var24.getSize(var29);
    javax.swing.plaf.MenuBarUI var31 = var24.getUI();
    var15.setUI(var31);
    boolean var33 = var15.isBorderPainted();
    var15.invalidate();
    java.awt.Cursor var35 = var15.getCursor();
    var0.setCursor(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test26");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(556);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test27");


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
    com.allenstudio.ir.ui.Toolbar var60 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var61 = var60.getColorModel();
    var60.setEnabled(true);
    java.awt.ComponentOrientation var64 = var60.getComponentOrientation();
    boolean var65 = var60.isFloatable();
    java.lang.String var66 = var60.getUIClassID();
    var0.remove((java.awt.Component)var60);
    java.awt.Point var68 = var0.location();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "ToolBarUI"+ "'", var66.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test28");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    javax.swing.JMenu var10 = var5.getMenu(30);
    boolean var11 = var5.isBorderPainted();
    
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
    assertTrue(var11 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test29");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    boolean var2 = var0.isPreferredSizeSet();
    var0.layout();
    boolean var4 = var0.isBorderPainted();
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test30");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    java.awt.Window var4 = var0.getOwner();
    var0.setTitle("hi!");
    var0.pack();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test31");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    float var3 = var0.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1.0f);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test32");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    boolean var2 = var0.isFocusTraversalPolicySet();
    boolean var3 = var0.isDisplayable();
    var0.setAutoscrolls(false);
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test33");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var9 = var2.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var11 = var2.getPropertyChangeListeners("Date Picker");
    boolean var12 = var2.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var13 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var2.removeMouseListener((java.awt.event.MouseListener)var13);
    boolean var15 = var13.getWeekStartOnSunday();
    int var16 = var13.getSelectedDay();
    int var17 = var13.getYear();
    java.awt.Color var18 = var13.getDateBackground();
    var0.setDateBackground(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2015);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test34");


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
    java.awt.Rectangle var13 = var11.getMaximizedBounds();
    java.awt.MenuBar var14 = var11.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var15 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var16 = new com.allenstudio.ir.ui.Toolbar();
    boolean var17 = var16.isFloatable();
    var16.show();
    java.awt.image.ColorModel var19 = var16.getColorModel();
    boolean var20 = var16.isFocusCycleRoot();
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
    var15.add((java.awt.Component)var16, (java.lang.Object)10);
    var11.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var15);
    java.awt.event.ComponentListener[] var43 = var15.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var44 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var45 = var44.getDateBackground();
    var44.setYearMonth(1, (-1));
    java.util.Calendar var49 = var44.getSelectedDate();
    var15.remove((java.awt.Component)var44);
    var0.removeMouseListener((java.awt.event.MouseListener)var44);
    boolean var52 = var44.getMouseListeningEnabled();
    int var53 = var44.getSelectedDay();
    var44.setMouseListeningEnabled(true);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 30);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test35");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    java.awt.Component var6 = var5.getComponent();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    boolean var8 = var7.isShowing();
    int var9 = var7.countComponents();
    var7.setAutoRequestFocus(false);
    javax.swing.JMenuBar var12 = var7.getJMenuBar();
    boolean var13 = var12.isBorderPainted();
    var12.menuSelectionChanged(true);
    com.allenstudio.ir.ui.MainFrame var16 = new com.allenstudio.ir.ui.MainFrame();
    boolean var17 = var16.isShowing();
    int var18 = var16.countComponents();
    var16.setAutoRequestFocus(false);
    javax.swing.JMenuBar var21 = var16.getJMenuBar();
    boolean var22 = var21.isBorderPainted();
    var21.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var24 = new com.allenstudio.ir.ui.DatePickerPane();
    var24.transferFocus();
    java.awt.Dimension var26 = var24.getMinimumSize();
    java.awt.Dimension var27 = var21.getSize(var26);
    javax.swing.plaf.MenuBarUI var28 = var21.getUI();
    var12.setUI(var28);
    boolean var30 = var12.isBorderPainted();
    com.allenstudio.ir.ui.MainFrame var31 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var32 = var31.getWarningString();
    java.awt.Rectangle var33 = var31.getMaximizedBounds();
    java.awt.MenuBar var34 = var31.getMenuBar();
    var31.removeNotify();
    var31.pack();
    var31.setFocusCycleRoot(false);
    var31.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var44 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var45 = var44.getWarningString();
    java.lang.String var46 = var44.getWarningString();
    boolean var47 = var44.isAutoRequestFocus();
    boolean var48 = var44.isResizable();
    javax.swing.JLayeredPane var49 = var44.getLayeredPane();
    int var50 = var49.getX();
    var31.setGlassPane((java.awt.Component)var49);
    int var52 = var12.getComponentIndex((java.awt.Component)var31);
    javax.swing.JToolTip var53 = var12.createToolTip();
    javax.swing.JMenu var55 = var12.getMenu((-1));
    java.lang.String var56 = var12.getUIClassID();
    com.allenstudio.ir.ui.MainFrame var57 = new com.allenstudio.ir.ui.MainFrame();
    boolean var58 = var57.isShowing();
    int var59 = var57.countComponents();
    var57.setAutoRequestFocus(false);
    javax.swing.JMenuBar var62 = var57.getJMenuBar();
    boolean var63 = var62.isBorderPainted();
    var62.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var65 = new com.allenstudio.ir.ui.DatePickerPane();
    var65.transferFocus();
    java.awt.Dimension var67 = var65.getMinimumSize();
    java.awt.Dimension var68 = var62.getSize(var67);
    javax.swing.plaf.MenuBarUI var69 = var62.getUI();
    var12.setUI(var69);
    var5.setUI(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "MenuBarUI"+ "'", var56.equals("MenuBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test36");


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
    java.awt.image.VolatileImage var48 = var2.createVolatileImage(556, 1);
    var2.enable();
    
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
    assertNull(var48);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test37");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    var0.readIn();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var3 = var2.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    int var5 = var4.getY();
    javax.swing.JToolTip var6 = var4.createToolTip();
    float var7 = var6.getAlignmentY();
    java.awt.Color var8 = var6.getForeground();
    var2.setBackground(var8);
    var2.move(10, 10);
    com.allenstudio.ir.ui.Toolbar var13 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var14 = var13.getColorModel();
    java.awt.im.InputContext var15 = var13.getInputContext();
    java.awt.Component var17 = var13.getComponentAtIndex(0);
    var2.setToolBar((javax.swing.JToolBar)var13);
    java.awt.im.InputContext var19 = var2.getInputContext();
    boolean var20 = var2.isDoubleBuffered();
    java.awt.Rectangle var21 = var2.bounds();
    boolean var22 = var0.containsValue((java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = var0.getProperty("Date Picker");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "PanelUI"+ "'", var3.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test38");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.calendar.DateChooser var2 = var0.getDateChooser();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = var0.getDateChooser();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove(31);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test39");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    boolean var3 = var0.isLocationByPlatform();
    boolean var4 = var0.getFocusableWindowState();
    var0.setExtendedState(6);
    var0.removeNotify();
    com.allenstudio.ir.ui.StatusBar var8 = new com.allenstudio.ir.ui.StatusBar();
    var8.enable();
    boolean var10 = var8.isFocusOwner();
    var8.firePropertyChange("hi!", 10L, 0L);
    var8.layout();
    var8.removeAll();
    boolean var17 = var8.isFocusCycleRoot();
    var8.requestFocus();
    java.awt.Dimension var19 = var8.getMinimumSize();
    var0.setMinimumSize(var19);
    com.allenstudio.ir.ui.DatePickerPane var21 = new com.allenstudio.ir.ui.DatePickerPane();
    var21.transferFocus();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var24 = var23.getColorModel();
    var23.setEnabled(true);
    java.awt.Component var28 = var23.getComponentAtIndex(1);
    boolean var29 = var23.isFloatable();
    var21.setContent((java.awt.Component)var23);
    java.awt.Dimension var31 = var21.size();
    boolean var32 = var21.isBackgroundSet();
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var34 = var33.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var35 = new com.allenstudio.ir.ui.StatusBar();
    int var36 = var35.getY();
    javax.swing.JToolTip var37 = var35.createToolTip();
    float var38 = var37.getAlignmentY();
    java.awt.Color var39 = var37.getForeground();
    var33.setBackground(var39);
    com.allenstudio.ir.ui.MainFrame var41 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var42 = var41.getWarningString();
    boolean var43 = var41.isAlwaysOnTopSupported();
    com.allenstudio.ir.ui.StatusBar var44 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var45 = var44.getRootPane();
    java.awt.Point var46 = var44.location();
    com.allenstudio.ir.ui.StatusBar var47 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var48 = var47.getRootPane();
    java.awt.Point var49 = var47.location();
    com.allenstudio.ir.ui.Toolbar var50 = new com.allenstudio.ir.ui.Toolbar();
    boolean var51 = var50.isFloatable();
    java.awt.Component var53 = var50.getComponentAtIndex(10);
    java.lang.Object var54 = var47.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var55 = var47.getMaximumSize();
    var44.setMinimumSize(var55);
    java.awt.Rectangle var57 = var44.getBounds();
    java.awt.Rectangle var58 = var41.getBounds(var57);
    java.awt.Rectangle var59 = var33.getBounds(var57);
    var21.paintImmediately(var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var59);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
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
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "PanelUI"+ "'", var34.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test40");


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
    com.allenstudio.ir.ui.Toolbar var32 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var33 = var32.getColorModel();
    var32.setEnabled(true);
    java.awt.Component var37 = var32.getComponentAtIndex(1);
    java.awt.Component var39 = var32.getComponentAtIndex(1);
    var0.remove((java.awt.Component)var32);
    var0.nextFocus();
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test41");


    com.allenstudio.ir.util.InspirentoUtilities var0 = new com.allenstudio.ir.util.InspirentoUtilities();
    com.allenstudio.ir.event.NoteListDataEvent var2 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var0, 1);
    int var3 = var2.getIndex();
    int var4 = var2.getType();
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getIndex();
    int var8 = var2.getIndex();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test42");


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
    boolean var34 = var27.isFontSet();
    var27.setVerifyInputWhenFocusTarget(false);
    var27.removeNotify();
    java.lang.String var38 = var27.getUIClassID();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "ToolBarUI"+ "'", var38.equals("ToolBarUI"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test43");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    var5.updateUI();
    java.awt.Insets var10 = var5.getMargin();
    var5.removeNotify();
    javax.swing.SingleSelectionModel var12 = var5.getSelectionModel();
    
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
    assertNotNull(var12);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test44");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.disable();
    var0.setSize(10, 3);
    int var8 = var0.getDefaultCloseOperation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test45");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var2 = new com.allenstudio.ir.core.plugins.CommonNote();
    var2.setFocusTraversalPolicyProvider(false);
    var1.remove((java.awt.Component)var2);
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    int var7 = var6.getY();
    javax.swing.JToolTip var8 = var6.createToolTip();
    java.awt.Insets var9 = var8.getInsets();
    java.awt.Insets var10 = var2.getInsets(var9);
    int var11 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.core.plugins.AbstractNote var13 = var0.getElementAt(30);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test46");


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
    com.allenstudio.ir.ui.DatePickerPane var34 = new com.allenstudio.ir.ui.DatePickerPane();
    var34.transferFocus();
    com.allenstudio.ir.ui.Toolbar var36 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var37 = var36.getColorModel();
    var36.setEnabled(true);
    java.awt.Component var41 = var36.getComponentAtIndex(1);
    boolean var42 = var36.isFloatable();
    var34.setContent((java.awt.Component)var36);
    var34.setSelected(true);
    boolean var46 = var34.isFocusTraversalPolicySet();
    java.awt.Dimension var47 = var34.getPreferredSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var34, 4);
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test47");


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
    boolean var28 = var0.getFocusableWindowState();
    
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
    assertTrue(var28 == true);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test48");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    boolean var5 = var0.isManagingFocus();
    boolean var7 = var0.areFocusTraversalKeysSet(0);
    boolean var8 = var0.isPreferredSizeSet();
    java.awt.Component var9 = var0.getNextFocusableComponent();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test49");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    var0.grabFocus();
    com.allenstudio.ir.ui.DatePickerPane var9 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var10 = var9.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var12 = var11.getColorModel();
    java.awt.im.InputContext var13 = var11.getInputContext();
    java.awt.Component var15 = var11.getComponentAtIndex(0);
    var9.setToolBar((javax.swing.JToolBar)var11);
    boolean var18 = var9.areFocusTraversalKeysSet(0);
    java.awt.Rectangle var19 = var9.bounds();
    int var20 = var0.getComponentZOrder((java.awt.Component)var9);
    java.lang.String var21 = var0.getUIClassID();
    java.awt.Component.BaselineResizeBehavior var22 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "ToolBarUI"+ "'", var21.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test50");


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
    com.allenstudio.ir.ui.MainFrame var30 = new com.allenstudio.ir.ui.MainFrame();
    boolean var31 = var30.isShowing();
    int var32 = var30.countComponents();
    var30.setAutoRequestFocus(false);
    javax.swing.JMenuBar var35 = var30.getJMenuBar();
    boolean var36 = var35.isBorderPainted();
    var35.menuSelectionChanged(true);
    int var39 = var35.getMenuCount();
    java.awt.Component var40 = var0.add("ToolBarUI", (java.awt.Component)var35);
    
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
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test51");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.changed();
    com.allenstudio.ir.ui.DatePickerPane var8 = new com.allenstudio.ir.ui.DatePickerPane();
    var8.transferFocus();
    com.allenstudio.ir.ui.Toolbar var10 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var11 = var10.getColorModel();
    var10.setEnabled(true);
    java.awt.Component var15 = var10.getComponentAtIndex(1);
    boolean var16 = var10.isFloatable();
    var8.setContent((java.awt.Component)var10);
    var8.setSelected(true);
    var8.resize(0, 1);
    java.awt.Rectangle var23 = var8.getBounds();
    java.awt.Point var24 = var8.location();
    com.allenstudio.ir.ui.Toolbar var25 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var26 = var25.getColorModel();
    java.awt.im.InputContext var27 = var25.getInputContext();
    java.awt.Component var29 = var25.getComponent(0);
    java.awt.Font var30 = var25.getFont();
    java.awt.FontMetrics var31 = var8.getFontMetrics(var30);
    var4.addTab("", (java.awt.Component)var8);
    var4.requestFocus();
    javax.swing.event.ChangeListener[] var34 = var4.getChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test52");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    java.lang.String var5 = var0.getOtherInfo();
    var0.paintImmediately(10, 4, 30, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test53");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    var0.writeBack();
    var0.writeBack();
    java.util.Enumeration var3 = var0.propertyNames();
    var0.readIn();
    java.util.Enumeration var5 = var0.propertyNames();
    var0.writeBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test54");


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
    var0.setAutoRequestFocus(false);
    
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

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test55");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    boolean var12 = var0.isFocusable();
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var14 = new com.allenstudio.ir.core.plugins.CommonNote();
    var14.setFocusTraversalPolicyProvider(false);
    var13.remove((java.awt.Component)var14);
    var14.setFeature("ToolBarUI");
    javax.swing.Icon var20 = var14.getIcon();
    var0.setFrameIcon(var20);
    java.util.GregorianCalendar var22 = var0.reportSelectedDate();
    com.allenstudio.ir.ui.DatePickerPane var23 = new com.allenstudio.ir.ui.DatePickerPane();
    var23.transferFocus();
    com.allenstudio.ir.ui.Toolbar var25 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var26 = var25.getColorModel();
    var25.setEnabled(true);
    java.awt.Component var30 = var25.getComponentAtIndex(1);
    boolean var31 = var25.isFloatable();
    var23.setContent((java.awt.Component)var25);
    java.awt.Color var33 = var25.getForeground();
    boolean var34 = var25.requestFocusInWindow();
    var25.setDoubleBuffered(true);
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var38 = var37.getColorModel();
    var37.setEnabled(true);
    java.awt.Component var42 = var37.getComponentAtIndex(1);
    java.awt.Component var44 = var37.getComponentAtIndex(1);
    java.awt.event.InputMethodListener[] var45 = var37.getInputMethodListeners();
    com.allenstudio.ir.ui.Toolbar var46 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.Dimension var47 = var46.size();
    java.awt.Dimension var48 = var37.getSize(var47);
    var25.addSeparator(var48);
    javax.swing.border.Border var50 = var25.getBorder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBorder(var50);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test56");


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
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    var33.transferFocus();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.isFloatable();
    var33.setContent((java.awt.Component)var35);
    java.awt.Dimension var43 = var33.size();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    boolean var45 = var44.isFloatable();
    var44.show();
    boolean var47 = var44.isRequestFocusEnabled();
    java.awt.Dimension var48 = var44.minimumSize();
    var33.setToolBar((javax.swing.JToolBar)var44);
    java.awt.Image var52 = var33.createImage(10, (-1));
    var33.setTitle("Date Picker");
    var0.addTab("C:\\boot.ini", (java.awt.Component)var33);
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
    boolean var86 = var56.isEnabledAt(0);
    com.allenstudio.ir.ui.StatusBar var87 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var88 = var87.getRootPane();
    java.awt.Point var89 = var87.location();
    boolean var90 = var87.isManagingFocus();
    java.awt.Rectangle var91 = var87.bounds();
    boolean var92 = var87.requestFocusInWindow();
    java.awt.Component var93 = var56.add((java.awt.Component)var87);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSelectedComponent((java.awt.Component)var87);
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
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
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test57");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.show();
    boolean var5 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test58");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    var0.pack();
    boolean var6 = var0.isFocusOwner();
    com.allenstudio.ir.ui.MainMenu var7 = new com.allenstudio.ir.ui.MainMenu((com.allenstudio.ir.core.InspirentoMediator)var0);
    var7.removeNotify();
    boolean var9 = var7.requestDefaultFocus();
    java.awt.Insets var10 = var7.getMargin();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test59");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    java.awt.im.InputMethodRequests var1 = var0.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test60");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.updateUI();
    var5.addNotify();
    boolean var9 = var5.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test61");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var1 = var0.getDateBackground();
    var0.setWeekStartOnSunday(true);
    java.awt.Font var4 = var0.getHeaderFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test62");


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
    var0.show(true);
    
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

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test63");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    int var8 = var0.getY();
    var0.updateUI();
    java.awt.Graphics var10 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test64");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    com.allenstudio.ir.ui.StatusBar var51 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var52 = new com.allenstudio.ir.core.plugins.CommonNote();
    var52.setFocusTraversalPolicyProvider(false);
    var51.remove((java.awt.Component)var52);
    com.allenstudio.ir.ui.StatusBar var56 = new com.allenstudio.ir.ui.StatusBar();
    int var57 = var56.getY();
    javax.swing.JToolTip var58 = var56.createToolTip();
    java.awt.Insets var59 = var58.getInsets();
    java.awt.Insets var60 = var52.getInsets(var59);
    var52.setFeature("PanelUI");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var64 = var0.lastIndexOf((com.allenstudio.ir.core.plugins.AbstractNote)var52, 30);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test65");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.Dimension var5 = var0.size();
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    var6.firePropertyChange("com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", ' ', ' ');
    javax.swing.event.AncestorListener[] var11 = var6.getAncestorListeners();
    boolean var12 = var6.requestDefaultFocus();
    int var13 = var6.getX();
    com.allenstudio.ir.ui.NoteListsTabPane var14 = new com.allenstudio.ir.ui.NoteListsTabPane();
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
    java.awt.Dimension var30 = var20.size();
    com.allenstudio.ir.ui.Toolbar var31 = new com.allenstudio.ir.ui.Toolbar();
    boolean var32 = var31.isFloatable();
    var31.show();
    boolean var34 = var31.isRequestFocusEnabled();
    java.awt.Dimension var35 = var31.minimumSize();
    var20.setToolBar((javax.swing.JToolBar)var31);
    java.awt.Image var39 = var20.createImage(10, (-1));
    var14.add((java.awt.Component)var15, (java.lang.Object)10);
    com.allenstudio.ir.ui.DatePickerPane var41 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var42 = var41.getTitle();
    java.awt.dnd.DropTarget var43 = var41.getDropTarget();
    com.allenstudio.ir.util.XmlElement var44 = new com.allenstudio.ir.util.XmlElement();
    boolean var45 = var44.hasChanged();
    var14.add((java.awt.Component)var41, (java.lang.Object)var45, (-1));
    java.awt.Rectangle var48 = var41.getBounds();
    java.awt.Rectangle var49 = var6.getBounds(var48);
    var0.setBounds(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Date Picker"+ "'", var42.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test66");


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
    com.allenstudio.ir.ui.MainFrame var24 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var25 = var24.getWarningString();
    java.awt.Rectangle var26 = var24.getMaximizedBounds();
    java.awt.MenuBar var27 = var24.getMenuBar();
    var24.removeNotify();
    var24.pack();
    var24.setFocusCycleRoot(false);
    var24.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var37 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var38 = var37.getWarningString();
    java.lang.String var39 = var37.getWarningString();
    boolean var40 = var37.isAutoRequestFocus();
    boolean var41 = var37.isResizable();
    javax.swing.JLayeredPane var42 = var37.getLayeredPane();
    int var43 = var42.getX();
    var24.setGlassPane((java.awt.Component)var42);
    int var45 = var5.getComponentIndex((java.awt.Component)var24);
    javax.swing.JToolTip var46 = var5.createToolTip();
    java.awt.Component var48 = var5.getComponentAtIndex(5);
    com.allenstudio.ir.ui.StatusBar var49 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var50 = var49.getRootPane();
    java.awt.Point var51 = var49.location();
    com.allenstudio.ir.ui.Toolbar var52 = new com.allenstudio.ir.ui.Toolbar();
    boolean var53 = var52.isFloatable();
    java.awt.Component var55 = var52.getComponentAtIndex(10);
    java.lang.Object var56 = var49.getClientProperty((java.lang.Object)10);
    var49.setFocusTraversalPolicyProvider(false);
    boolean var59 = var49.isManagingFocus();
    int var60 = var49.getHeight();
    var49.grabFocus();
    com.allenstudio.ir.ui.Toolbar var62 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var63 = var62.getColorModel();
    var62.setEnabled(true);
    java.awt.Component var67 = var62.getComponentAtIndex(1);
    boolean var68 = var62.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var69 = var62.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var71 = var62.getPropertyChangeListeners("Date Picker");
    boolean var72 = var62.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var73 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var62.removeMouseListener((java.awt.event.MouseListener)var73);
    var73.setMonth(4);
    var49.addMouseListener((java.awt.event.MouseListener)var73);
    int var78 = var73.getMonth();
    var5.removeMouseListener((java.awt.event.MouseListener)var73);
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 4);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test67");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    boolean var4 = var0.getAutoscrolls();
    java.awt.ComponentOrientation var5 = var0.getComponentOrientation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test68");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.enable();
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    boolean var7 = var6.isShowing();
    int var8 = var6.countComponents();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    var9.enable();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    var11.enable();
    boolean var13 = var11.isFocusOwner();
    var11.firePropertyChange("hi!", 10L, 0L);
    var11.layout();
    var11.removeAll();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    java.awt.Point var23 = var11.getLocation(var22);
    var9.setLocation(var23);
    var6.setLocation(var23);
    java.awt.Color var26 = var6.getBackground();
    var0.setForeground(var26);
    com.allenstudio.ir.ui.NoteListsTabPane var28 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var29 = new com.allenstudio.ir.ui.Toolbar();
    boolean var30 = var29.isFloatable();
    var29.show();
    java.awt.image.ColorModel var32 = var29.getColorModel();
    boolean var33 = var29.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var34 = new com.allenstudio.ir.ui.DatePickerPane();
    var34.transferFocus();
    com.allenstudio.ir.ui.Toolbar var36 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var37 = var36.getColorModel();
    var36.setEnabled(true);
    java.awt.Component var41 = var36.getComponentAtIndex(1);
    boolean var42 = var36.isFloatable();
    var34.setContent((java.awt.Component)var36);
    java.awt.Dimension var44 = var34.size();
    com.allenstudio.ir.ui.Toolbar var45 = new com.allenstudio.ir.ui.Toolbar();
    boolean var46 = var45.isFloatable();
    var45.show();
    boolean var48 = var45.isRequestFocusEnabled();
    java.awt.Dimension var49 = var45.minimumSize();
    var34.setToolBar((javax.swing.JToolBar)var45);
    java.awt.Image var53 = var34.createImage(10, (-1));
    var28.add((java.awt.Component)var29, (java.lang.Object)10);
    var28.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var57 = var28.getUI();
    int var58 = var28.getTabRunCount();
    com.allenstudio.ir.ui.StatusBar var59 = new com.allenstudio.ir.ui.StatusBar();
    var59.enable();
    boolean var61 = var59.isFocusOwner();
    var59.firePropertyChange("hi!", 10L, 0L);
    com.allenstudio.ir.ui.StatusBar var66 = new com.allenstudio.ir.ui.StatusBar();
    var66.enable();
    boolean var68 = var66.isFocusOwner();
    var66.firePropertyChange("hi!", 10L, 0L);
    var66.layout();
    var66.removeAll();
    com.allenstudio.ir.ui.StatusBar var75 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var76 = var75.getRootPane();
    java.awt.Point var77 = var75.location();
    java.awt.Component var78 = var66.getComponentAt(var77);
    java.awt.Component var79 = var59.getComponentAt(var77);
    java.awt.Point var80 = var28.getLocation(var77);
    var0.setLocation(var80);
    boolean var82 = var0.requestFocusInWindow();
    java.awt.Rectangle var83 = var0.getMaximizedBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test69");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    java.awt.Component var6 = var0.getFocusOwner();
    javax.accessibility.AccessibleContext var7 = var0.getAccessibleContext();
    java.awt.event.WindowListener[] var8 = var0.getWindowListeners();
    var0.hide();
    var0.setUndecorated(false);
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test70");


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
    com.allenstudio.ir.ui.DatePickerPane var67 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var68 = var67.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var69 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var70 = var69.getUI();
    var67.setUI(var70);
    com.allenstudio.ir.ui.calendar.DateChooser var72 = var67.getDateChooser();
    java.awt.Container var73 = var67.getContentPane();
    com.allenstudio.ir.event.NoteListDataEvent var75 = new com.allenstudio.ir.event.NoteListDataEvent((java.lang.Object)var73, 10);
    var0.addTab("", (java.awt.Component)var73);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test71");


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
    boolean var24 = var0.isAutoRequestFocus();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test72");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    var0.dispose();
    com.allenstudio.ir.ui.StatusBar var8 = new com.allenstudio.ir.ui.StatusBar();
    var8.enable();
    boolean var10 = var8.isFocusOwner();
    var8.firePropertyChange("hi!", 10L, 0L);
    var8.layout();
    var8.removeAll();
    java.awt.Point var17 = var8.getLocation();
    boolean var18 = var0.contains(var17);
    com.allenstudio.ir.ui.MainFrame var19 = new com.allenstudio.ir.ui.MainFrame();
    boolean var20 = var19.isShowing();
    java.lang.String var21 = var19.getWarningString();
    var19.setAutoRequestFocus(true);
    java.awt.image.ColorModel var24 = var19.getColorModel();
    var19.setLocation(31, 100);
    com.allenstudio.ir.ui.MainFrame var28 = new com.allenstudio.ir.ui.MainFrame();
    boolean var29 = var28.isShowing();
    int var30 = var28.countComponents();
    var28.setAutoRequestFocus(false);
    javax.swing.JMenuBar var33 = var28.getJMenuBar();
    boolean var34 = var33.isBorderPainted();
    var33.menuSelectionChanged(true);
    com.allenstudio.ir.ui.MainFrame var37 = new com.allenstudio.ir.ui.MainFrame();
    boolean var38 = var37.isShowing();
    int var39 = var37.countComponents();
    var37.setAutoRequestFocus(false);
    javax.swing.JMenuBar var42 = var37.getJMenuBar();
    boolean var43 = var42.isBorderPainted();
    var42.updateUI();
    com.allenstudio.ir.ui.DatePickerPane var45 = new com.allenstudio.ir.ui.DatePickerPane();
    var45.transferFocus();
    java.awt.Dimension var47 = var45.getMinimumSize();
    java.awt.Dimension var48 = var42.getSize(var47);
    javax.swing.plaf.MenuBarUI var49 = var42.getUI();
    var33.setUI(var49);
    boolean var51 = var33.isBorderPainted();
    var33.invalidate();
    java.awt.Cursor var53 = var33.getCursor();
    var19.setCursor(var53);
    var0.setCursor(var53);
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test73");


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
    var33.setMonth(5);
    
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

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test74");


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
    int var49 = var6.getBaseline(100, 2015);
    java.awt.Image var52 = var6.createImage(10, 761);
    
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
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test75");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    var0.setFocusTraversalKeysEnabled(false);
    var0.addNotify();

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test76");


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
    int var24 = var5.getMenuCount();
    java.lang.String var25 = var5.getUIClassID();
    var5.addNotify();
    
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
    assertTrue(var24 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "MenuBarUI"+ "'", var25.equals("MenuBarUI"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test77");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    java.awt.Rectangle var3 = var0.getMaximizedBounds();
    com.allenstudio.ir.ui.Toolbar var4 = new com.allenstudio.ir.ui.Toolbar();
    boolean var5 = var4.isFloatable();
    var4.setAutoscrolls(true);
    boolean var8 = var4.isCursorSet();
    var0.setGlassPane((java.awt.Component)var4);
    java.awt.Font var10 = var0.getFont();
    
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
    assertNull(var10);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test78");


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
    int var15 = var11.getYear();
    var11.setAutoscrolls(true);
    java.util.Calendar var18 = var11.getSelectedDate();
    
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
    assertTrue(var15 == 2015);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test79");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setLocation(100, 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test80");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    int var8 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test81");


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
    boolean var32 = var0.isFocusCycleRoot();
    
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
    assertTrue(var32 == true);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test82");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    var0.disable();
    java.awt.Dimension var5 = var0.getSize();
    java.beans.PropertyChangeListener[] var7 = var0.getPropertyChangeListeners("Title");
    boolean var8 = var0.hasFocus();
    var0.layout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var11 = var0.getFocusTraversalKeys(30);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test83");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    var0.repaint(100L);
    int var4 = var0.getWidth();
    java.awt.FocusTraversalPolicy var5 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test84");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.setWeekStartOnSunday(true);
    java.awt.Color var3 = var0.getHighlightBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test85");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    int var8 = var0.getBaseline(1, 100);
    java.awt.peer.ComponentPeer var9 = var0.getPeer();
    boolean var10 = var0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test86");


    com.allenstudio.ir.ui.NoteOperationsPane var0 = new com.allenstudio.ir.ui.NoteOperationsPane();
    var0.doLayout();
    float var2 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0.5f);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test87");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    var0.addNotify();
    int var3 = var0.getWidth();
    var0.firePropertyChange("MenuBarUI", 0.0f, 10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test88");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test89");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.setFocusTraversalPolicyProvider(false);
    float var3 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test90");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isValidateRoot();
    var0.addSeparator();
    java.awt.event.FocusListener[] var8 = var0.getFocusListeners();
    javax.accessibility.AccessibleContext var9 = var0.getAccessibleContext();
    var0.setLocation((-1), 100);
    boolean var13 = var0.isFloatable();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test91");


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
    javax.swing.Icon var20 = var0.getFrameIcon();
    var0.doLayout();
    
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
    assertNull(var20);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test92");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    boolean var2 = var0.isPreferredSizeSet();
    var0.layout();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var4 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var5 = var4.getDateBackground();
    int var6 = var0.getComponentZOrder((java.awt.Component)var4);
    com.allenstudio.ir.ui.DatePickerPane var7 = new com.allenstudio.ir.ui.DatePickerPane();
    var7.transferFocus();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var10 = var9.getColorModel();
    var9.setEnabled(true);
    java.awt.Component var14 = var9.getComponentAtIndex(1);
    boolean var15 = var9.isFloatable();
    var7.setContent((java.awt.Component)var9);
    java.awt.Dimension var17 = var7.size();
    boolean var18 = var7.isBackgroundSet();
    javax.swing.KeyStroke[] var19 = var7.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var20 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var21 = var20.getColorModel();
    var20.setEnabled(true);
    java.awt.ComponentOrientation var24 = var20.getComponentOrientation();
    var7.applyComponentOrientation(var24);
    var4.applyComponentOrientation(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test93");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    var0.layout();
    var0.enable(false);
    float var5 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test94");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var1 = new com.allenstudio.ir.core.plugins.CommonNote();
    var1.setFocusTraversalPolicyProvider(false);
    var0.remove((java.awt.Component)var1);
    var1.setFeature("ToolBarUI");
    float var7 = var1.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test95");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    com.allenstudio.ir.ui.DatePickerPane var2 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var3 = var2.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    int var5 = var4.getY();
    javax.swing.JToolTip var6 = var4.createToolTip();
    float var7 = var6.getAlignmentY();
    java.awt.Color var8 = var6.getForeground();
    var2.setBackground(var8);
    var2.move(10, 10);
    com.allenstudio.ir.ui.Toolbar var13 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var14 = var13.getColorModel();
    java.awt.im.InputContext var15 = var13.getInputContext();
    java.awt.Component var17 = var13.getComponentAtIndex(0);
    var2.setToolBar((javax.swing.JToolBar)var13);
    com.allenstudio.ir.util.XmlElement var20 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var22 = var20.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var25 = var22.addSubElement("", "hi!");
    java.util.Hashtable var26 = var25.getAttributes();
    com.allenstudio.ir.ui.MainFrame var27 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var28 = var27.getWarningString();
    java.awt.Rectangle var29 = var27.getMaximizedBounds();
    java.awt.MenuBar var30 = var27.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var31 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var27.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var31);
    var27.dispose();
    java.lang.Object var34 = var26.get((java.lang.Object)var27);
    java.util.Set var35 = var26.entrySet();
    var2.setFocusTraversalKeys(0, var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(100, var35);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "PanelUI"+ "'", var3.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test96");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.util.Locale var2 = var0.getLocale();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var3.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var7 = var3.getAncestorListeners();
    var0.setLocationRelativeTo((java.awt.Component)var3);
    com.allenstudio.ir.event.DateChooserListener var9 = var3.getDateChooserListener();
    java.util.Calendar var10 = var3.getCurrent();
    boolean var11 = var3.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test97");


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
    java.awt.image.VolatileImage var48 = var2.createVolatileImage(556, 1);
    boolean var49 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var2);
    java.awt.image.ColorModel var50 = var2.getColorModel();
    
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
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test98");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var12 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var14 = var12.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var17 = var14.addSubElement("", "hi!");
    java.util.Hashtable var18 = var17.getAttributes();
    com.allenstudio.ir.ui.MainFrame var19 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var20 = var19.getWarningString();
    java.awt.Rectangle var21 = var19.getMaximizedBounds();
    java.awt.MenuBar var22 = var19.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var23 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var19.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var23);
    var19.dispose();
    java.lang.Object var26 = var18.get((java.lang.Object)var19);
    java.util.Set var27 = var18.entrySet();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement("Title", var18);
    boolean var29 = var18.isEmpty();
    var2.setAttributes(var18);
    java.lang.Object var31 = var18.clone();
    java.lang.Object var32 = var18.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test99");


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
    com.allenstudio.ir.ui.NoteListsTabPane var27 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    boolean var29 = var28.isFloatable();
    var28.show();
    java.awt.image.ColorModel var31 = var28.getColorModel();
    boolean var32 = var28.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    var33.transferFocus();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.isFloatable();
    var33.setContent((java.awt.Component)var35);
    java.awt.Dimension var43 = var33.size();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    boolean var45 = var44.isFloatable();
    var44.show();
    boolean var47 = var44.isRequestFocusEnabled();
    java.awt.Dimension var48 = var44.minimumSize();
    var33.setToolBar((javax.swing.JToolBar)var44);
    java.awt.Image var52 = var33.createImage(10, (-1));
    var27.add((java.awt.Component)var28, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var54 = new com.allenstudio.ir.ui.Toolbar();
    boolean var55 = var54.isFloatable();
    java.awt.Component var57 = var54.getComponentAtIndex(10);
    boolean var58 = var54.isLightweight();
    java.awt.Component var59 = var27.add((java.awt.Component)var54);
    com.allenstudio.ir.ui.NoteListsTabPane var60 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    boolean var62 = var61.isFloatable();
    var61.show();
    java.awt.image.ColorModel var64 = var61.getColorModel();
    boolean var65 = var61.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var66 = new com.allenstudio.ir.ui.DatePickerPane();
    var66.transferFocus();
    com.allenstudio.ir.ui.Toolbar var68 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var69 = var68.getColorModel();
    var68.setEnabled(true);
    java.awt.Component var73 = var68.getComponentAtIndex(1);
    boolean var74 = var68.isFloatable();
    var66.setContent((java.awt.Component)var68);
    java.awt.Dimension var76 = var66.size();
    com.allenstudio.ir.ui.Toolbar var77 = new com.allenstudio.ir.ui.Toolbar();
    boolean var78 = var77.isFloatable();
    var77.show();
    boolean var80 = var77.isRequestFocusEnabled();
    java.awt.Dimension var81 = var77.minimumSize();
    var66.setToolBar((javax.swing.JToolBar)var77);
    java.awt.Image var85 = var66.createImage(10, (-1));
    var60.add((java.awt.Component)var61, (java.lang.Object)10);
    var60.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var89 = var60.getUI();
    javax.swing.SingleSelectionModel var90 = var60.getModel();
    var27.setModel(var90);
    var0.setModel(var90);
    var0.reshape(6, 556, 10, 4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var99 = var0.getForegroundAt(32);
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test100");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    var0.firePropertyChange("", false, true);
    javax.swing.plaf.ToolBarUI var7 = var0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test101");


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
    javax.swing.border.Border var22 = var0.getContentPaneBorder();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var23 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    javax.swing.JComponent var24 = var23.getHeaderComponent();
    var23.setWeekStartOnSunday(true);
    java.awt.Font var27 = var23.getHeaderFont();
    var0.setFont(var27);
    
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test102");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    java.lang.Object var12 = var0.getTreeLock();
    boolean var13 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test103");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.core.plugins.CommonNote var2 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var3 = var2.getFeature();
    var2.setFeature("Date Picker");
    float var6 = var2.getAlignmentY();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add(761, (com.allenstudio.ir.core.plugins.AbstractNote)var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "C:\\boot.ini"+ "'", var3.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test104");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    int var1 = var0.getSelectedDate();
    boolean var3 = var0.isMarked(31);
    var0.setMarked(10, true);
    boolean var8 = var0.isMarked(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test105");


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
    boolean var18 = var0.isOptimizedDrawingEnabled();
    
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
    assertTrue(var18 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test106");


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
    com.allenstudio.ir.ui.StatusBar var15 = new com.allenstudio.ir.ui.StatusBar();
    int var16 = var15.getY();
    boolean var17 = var15.isLightweight();
    java.awt.Dimension var18 = var15.getMaximumSize();
    var11.setCellDimension(var18);
    java.awt.Color var20 = var11.getHeaderForeground();
    
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
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test107");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.show();
    java.lang.Object var3 = var0.getTreeLock();
    java.lang.String var4 = var0.getName();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var5 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    javax.swing.JComponent var6 = var5.getHeaderComponent();
    var5.setWeekStartOnSunday(true);
    java.awt.Font var9 = var5.getHeaderFont();
    var0.removeMouseMotionListener((java.awt.event.MouseMotionListener)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test108");


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
    int var66 = var0.indexOfTab("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.Icon var68 = var0.getDisabledIconAt(2015);
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
    assertTrue(var66 == (-1));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test109");


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
      var7.insertElement(var30, 761);
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

    if (debug) System.out.printf("%nRandoopTest2.test110");


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
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var52 = var51.getColorModel();
    java.awt.im.InputContext var53 = var51.getInputContext();
    java.awt.Component var55 = var51.getComponentAtIndex(0);
    boolean var56 = var51.isManagingFocus();
    var0.setGlassPane((java.awt.Component)var51);
    java.awt.Window var58 = var0.getOwner();
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test111");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.ComponentOrientation var4 = var0.getComponentOrientation();
    boolean var5 = var0.isFloatable();
    java.lang.String var6 = var0.getUIClassID();
    boolean var7 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ToolBarUI"+ "'", var6.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test112");


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
    com.allenstudio.ir.ui.MainFrame var39 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var40 = var39.getWarningString();
    java.lang.String var41 = var39.getWarningString();
    java.awt.Container var42 = var39.getFocusCycleRootAncestor();
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
    var39.setMaximizedBounds(var63);
    float var66 = var39.getAlignmentX();
    var39.revalidate();
    int var68 = var39.getState();
    var39.setCursor(4);
    com.allenstudio.ir.ui.MainFrame var71 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var72 = var71.getWarningString();
    boolean var73 = var71.isAlwaysOnTopSupported();
    com.allenstudio.ir.ui.StatusBar var74 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var75 = var74.getRootPane();
    java.awt.Point var76 = var74.location();
    com.allenstudio.ir.ui.StatusBar var77 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var78 = var77.getRootPane();
    java.awt.Point var79 = var77.location();
    com.allenstudio.ir.ui.Toolbar var80 = new com.allenstudio.ir.ui.Toolbar();
    boolean var81 = var80.isFloatable();
    java.awt.Component var83 = var80.getComponentAtIndex(10);
    java.lang.Object var84 = var77.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var85 = var77.getMaximumSize();
    var74.setMinimumSize(var85);
    java.awt.Rectangle var87 = var74.getBounds();
    java.awt.Rectangle var88 = var71.getBounds(var87);
    var39.setBounds(var87);
    int var92 = var0.getScrollableBlockIncrement(var87, 0, 6);
    int var93 = var0.getSelectedIndex();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 761);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == 0);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test113");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var7 = var6.getWarningString();
    java.awt.Rectangle var8 = var6.getMaximizedBounds();
    java.awt.MenuBar var9 = var6.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var10 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    java.awt.image.ColorModel var14 = var11.getColorModel();
    boolean var15 = var11.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var16 = new com.allenstudio.ir.ui.DatePickerPane();
    var16.transferFocus();
    com.allenstudio.ir.ui.Toolbar var18 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var19 = var18.getColorModel();
    var18.setEnabled(true);
    java.awt.Component var23 = var18.getComponentAtIndex(1);
    boolean var24 = var18.isFloatable();
    var16.setContent((java.awt.Component)var18);
    java.awt.Dimension var26 = var16.size();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    var27.show();
    boolean var30 = var27.isRequestFocusEnabled();
    java.awt.Dimension var31 = var27.minimumSize();
    var16.setToolBar((javax.swing.JToolBar)var27);
    java.awt.Image var35 = var16.createImage(10, (-1));
    var10.add((java.awt.Component)var11, (java.lang.Object)10);
    var6.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var10);
    java.awt.event.ComponentListener[] var38 = var10.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var39 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var40 = var39.getDateBackground();
    var39.setYearMonth(1, (-1));
    java.util.Calendar var44 = var39.getSelectedDate();
    var10.remove((java.awt.Component)var39);
    var4.removeMouseListener((java.awt.event.MouseListener)var39);
    java.awt.Container var47 = var4.getFocusCycleRootAncestor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var49 = var4.getTitleAt(30);
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test114");


    com.allenstudio.ir.util.XmlElement var2 = new com.allenstudio.ir.util.XmlElement("", "com.allenstudio.ir.ui.StatusBar[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]");

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test115");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.Container var8 = var0.getFocusCycleRootAncestor();
    var0.setResizable(true);
    java.awt.event.WindowListener[] var11 = var0.getWindowListeners();
    boolean var12 = var0.isFocusableWindow();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test116");


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
    int var24 = var5.getMenuCount();
    java.lang.String var25 = var5.getUIClassID();
    java.awt.Component var26 = var5.getComponent();
    
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
    assertTrue(var24 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "MenuBarUI"+ "'", var25.equals("MenuBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test117");


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
    com.allenstudio.ir.ui.MainFrame var14 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var15 = var14.getWarningString();
    java.awt.Rectangle var16 = var14.getMaximizedBounds();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    boolean var18 = var17.isBackgroundSet();
    boolean var21 = var17.contains(10, 100);
    var17.revalidate();
    javax.swing.JToolTip var23 = var17.createToolTip();
    com.allenstudio.ir.ui.StatusBar var24 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var25 = var24.getRootPane();
    java.awt.Point var26 = var24.location();
    com.allenstudio.ir.ui.StatusBar var27 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var28 = var27.getRootPane();
    java.awt.Point var29 = var27.location();
    com.allenstudio.ir.ui.Toolbar var30 = new com.allenstudio.ir.ui.Toolbar();
    boolean var31 = var30.isFloatable();
    java.awt.Component var33 = var30.getComponentAtIndex(10);
    java.lang.Object var34 = var27.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var35 = var27.getMaximumSize();
    var24.setMinimumSize(var35);
    java.awt.Rectangle var37 = var24.getBounds();
    var17.scrollRectToVisible(var37);
    var14.setMaximizedBounds(var37);
    boolean var40 = var14.isForegroundSet();
    java.awt.Dimension var41 = var14.getSize();
    var11.setPreferredSize(var41);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test118");


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
    com.allenstudio.ir.ui.MainFrame var24 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var25 = var24.getWarningString();
    java.awt.Rectangle var26 = var24.getMaximizedBounds();
    java.awt.MenuBar var27 = var24.getMenuBar();
    var24.removeNotify();
    var24.pack();
    var24.setFocusCycleRoot(false);
    var24.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var37 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var38 = var37.getWarningString();
    java.lang.String var39 = var37.getWarningString();
    boolean var40 = var37.isAutoRequestFocus();
    boolean var41 = var37.isResizable();
    javax.swing.JLayeredPane var42 = var37.getLayeredPane();
    int var43 = var42.getX();
    var24.setGlassPane((java.awt.Component)var42);
    int var45 = var5.getComponentIndex((java.awt.Component)var24);
    javax.swing.JToolTip var46 = var5.createToolTip();
    java.awt.Component var48 = var5.getComponentAtIndex(5);
    var5.addNotify();
    java.lang.String var50 = var5.getUIClassID();
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "MenuBarUI"+ "'", var50.equals("MenuBarUI"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test119");


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
    var0.setBounds(31, (-1), 32, 0);
    com.allenstudio.ir.ui.StatusBar var15 = new com.allenstudio.ir.ui.StatusBar();
    boolean var16 = var15.isBackgroundSet();
    var15.setDebugGraphicsOptions(0);
    var15.firePropertyChange("hi!", 100, 10);
    var15.firePropertyChange("ToolBarUI", false, true);
    com.allenstudio.ir.ui.DatePickerPane var27 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var28 = var27.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var29 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var30 = var29.getColorModel();
    java.awt.im.InputContext var31 = var29.getInputContext();
    java.awt.Component var33 = var29.getComponentAtIndex(0);
    var27.setToolBar((javax.swing.JToolBar)var29);
    boolean var36 = var27.areFocusTraversalKeysSet(0);
    java.awt.Rectangle var37 = var27.bounds();
    var15.scrollRectToVisible(var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var37);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test120");


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
    boolean var34 = var0.getAutoscrolls();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDisplayedMnemonicIndexAt(2015, 31);
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test121");


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
    javax.swing.event.ChangeListener[] var33 = var0.getChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var35 = var0.isEnabledAt(2015);
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

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test122");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponentAtIndex(0);
    boolean var5 = var0.isManagingFocus();
    boolean var7 = var0.areFocusTraversalKeysSet(0);
    var0.validate();
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var10 = var9.getColorModel();
    var9.setEnabled(true);
    java.awt.Component var14 = var9.getComponentAtIndex(1);
    boolean var15 = var9.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var16 = var9.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var18 = var9.getPropertyChangeListeners("Date Picker");
    boolean var19 = var9.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var20 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var9.removeMouseListener((java.awt.event.MouseListener)var20);
    var20.setMonth(4);
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
    java.awt.Font var39 = var29.getFont();
    java.awt.FontMetrics var40 = var24.getFontMetrics(var39);
    var20.setHeaderFont(var39);
    var20.setMonth(4);
    com.allenstudio.ir.core.plugins.CommonNote var44 = new com.allenstudio.ir.core.plugins.CommonNote();
    var44.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var48 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var44);
    int var49 = var48.getIndexInList();
    java.awt.Dimension var50 = var48.getMaximumSize();
    var20.setPreferredSize(var50);
    var0.addSeparator(var50);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test123");


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
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    int var14 = var13.getY();
    javax.swing.JToolTip var15 = var13.createToolTip();
    javax.swing.JToolTip var16 = var15.createToolTip();
    float var17 = var15.getAlignmentX();
    int var18 = var0.getComponentIndex((java.awt.Component)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var20 = var15.getComponent(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test124");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    java.lang.Object var14 = var11.addAttribute("ToolBarUI", "C:\\boot.ini");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test125");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    int var8 = var0.getY();
    var0.updateUI();
    com.allenstudio.ir.core.plugins.CommonNote var10 = new com.allenstudio.ir.core.plugins.CommonNote();
    var10.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var14 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var10);
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
    var10.repaint(var35);
    var0.computeVisibleRect(var35);
    java.awt.Rectangle var39 = var0.getBounds();
    java.awt.event.ContainerListener[] var40 = var0.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
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
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test126");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    java.lang.Object var12 = var0.getTreeLock();
    var0.setTitle("Title");
    com.allenstudio.ir.ui.Toolbar var15 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var16 = var15.getColorModel();
    var15.setEnabled(true);
    java.awt.Component var20 = var15.getComponentAtIndex(1);
    boolean var21 = var15.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var22 = var15.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var24 = var15.getPropertyChangeListeners("Date Picker");
    boolean var25 = var15.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var26 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var15.removeMouseListener((java.awt.event.MouseListener)var26);
    var26.setMonth(4);
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
    java.awt.Font var45 = var35.getFont();
    java.awt.FontMetrics var46 = var30.getFontMetrics(var45);
    var26.setHeaderFont(var45);
    var0.setFont(var45);
    var0.firePropertyChange("ToolBarUI", false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
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
    assertNotNull(var46);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test127");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "com.allenstudio.ir.ui.NoteListsTabPane[,0,0,0var1,invalid,layout=com.apple.laf.AquaTabbedPaneUI$AquaTruncatingTabbedPaneLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777568,maximumSize=,minimumSize=,preferredSize=,haveRegistered=false,tabPlacement=TOP]"+ "'", var1.equals("com.allenstudio.ir.ui.NoteListsTabPane[,0,0,0var1,invalid,layout=com.apple.laf.AquaTabbedPaneUI$AquaTruncatingTabbedPaneLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777568,maximumSize=,minimumSize=,preferredSize=,haveRegistered=false,tabPlacement=TOP]"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test128");


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
    java.awt.Container var40 = var33.getTopLevelAncestor();
    com.allenstudio.ir.ui.MainFrame var41 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var42 = var41.getWarningString();
    java.lang.String var43 = var41.getWarningString();
    boolean var44 = var41.isAutoRequestFocus();
    boolean var45 = var41.isResizable();
    javax.swing.JLayeredPane var46 = var41.getLayeredPane();
    javax.swing.TransferHandler var47 = var41.getTransferHandler();
    java.lang.String var48 = var41.getTitle();
    java.awt.event.WindowListener[] var49 = var41.getWindowListeners();
    boolean var50 = var41.isShowing();
    boolean var51 = var41.isResizable();
    java.awt.Dimension var52 = var41.minimumSize();
    var33.setPreferredSize(var52);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Inspirento - alpha 0.86"+ "'", var48.equals("Inspirento - alpha 0.86"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test129");


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
    java.awt.Component.BaselineResizeBehavior var13 = var0.getBaselineResizeBehavior();
    javax.swing.ActionMap var14 = var0.getActionMap();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test130");


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
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    var33.transferFocus();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.isFloatable();
    var33.setContent((java.awt.Component)var35);
    java.awt.Dimension var43 = var33.size();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    boolean var45 = var44.isFloatable();
    var44.show();
    boolean var47 = var44.isRequestFocusEnabled();
    java.awt.Dimension var48 = var44.minimumSize();
    var33.setToolBar((javax.swing.JToolBar)var44);
    java.awt.Image var52 = var33.createImage(10, (-1));
    var33.setTitle("Date Picker");
    var0.addTab("C:\\boot.ini", (java.awt.Component)var33);
    boolean var58 = var33.inside(0, 4);
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test131");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    boolean var7 = var0.isVisible();
    boolean var8 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test132");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    int var7 = var6.getY();
    javax.swing.JToolTip var8 = var6.createToolTip();
    javax.swing.JToolTip var9 = var8.createToolTip();
    boolean var10 = var9.isFocusable();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var12 = var11.getRootPane();
    java.awt.Point var13 = var11.location();
    com.allenstudio.ir.ui.Toolbar var14 = new com.allenstudio.ir.ui.Toolbar();
    boolean var15 = var14.isFloatable();
    java.awt.Component var17 = var14.getComponentAtIndex(10);
    java.lang.Object var18 = var11.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var19 = var11.getMaximumSize();
    var9.resize(var19);
    int var21 = var9.getY();
    com.allenstudio.ir.ui.StatusBar var22 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var23 = new com.allenstudio.ir.core.plugins.CommonNote();
    var23.setFocusTraversalPolicyProvider(false);
    var22.remove((java.awt.Component)var23);
    com.allenstudio.ir.ui.StatusBar var27 = new com.allenstudio.ir.ui.StatusBar();
    int var28 = var27.getY();
    javax.swing.JToolTip var29 = var27.createToolTip();
    java.awt.Insets var30 = var29.getInsets();
    java.awt.Insets var31 = var23.getInsets(var30);
    java.awt.Insets var32 = var9.getInsets(var31);
    boolean var33 = var9.isManagingFocus();
    var9.setIgnoreRepaint(true);
    com.allenstudio.ir.ui.MainFrame var36 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var37 = var36.getWarningString();
    java.lang.String var38 = var36.getWarningString();
    boolean var39 = var36.isAutoRequestFocus();
    boolean var40 = var36.isResizable();
    javax.swing.JLayeredPane var41 = var36.getLayeredPane();
    com.allenstudio.ir.ui.DatePickerPane var42 = new com.allenstudio.ir.ui.DatePickerPane();
    var42.transferFocus();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var45 = var44.getColorModel();
    var44.setEnabled(true);
    java.awt.Component var49 = var44.getComponentAtIndex(1);
    boolean var50 = var44.isFloatable();
    var42.setContent((java.awt.Component)var44);
    var42.setSelected(true);
    boolean var54 = var42.isFocusTraversalPolicySet();
    java.awt.Dimension var55 = var42.getPreferredSize();
    java.awt.Dimension var56 = var36.getSize(var55);
    java.awt.Image var57 = var36.getIconImage();
    com.allenstudio.ir.ui.Toolbar var58 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var59 = var58.getColorModel();
    java.awt.im.InputContext var60 = var58.getInputContext();
    java.awt.Component var62 = var58.getComponent(0);
    java.awt.LayoutManager var63 = var58.getLayout();
    var9.putClientProperty((java.lang.Object)var36, (java.lang.Object)var63);
    var0.setLayout(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test133");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    var0.enable();
    javax.swing.plaf.ToolBarUI var9 = var0.getUI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOrientation((-1));
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

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test134");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.lang.String var2 = var0.getWarningString();
    var0.setAutoRequestFocus(true);
    var0.removeAll();
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var7 = var6.getWarningString();
    java.awt.Rectangle var8 = var6.getMaximizedBounds();
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
    var6.setMaximizedBounds(var29);
    var0.setMaximizedBounds(var29);
    java.util.List var33 = var0.getIconImages();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
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
    assertNotNull(var33);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test135");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    boolean var8 = var0.isValidateRoot();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var9 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var9.setWeekStartOnSunday(true);
    java.awt.Color var12 = var9.getDateForeground();
    var0.setBackground(var12);
    boolean var14 = var0.isCursorSet();
    javax.accessibility.AccessibleContext var15 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test136");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    var1.disable();
    boolean var6 = var1.inside((-1), 100);
    boolean var7 = var1.isMaximumSizeSet();
    boolean var8 = var1.isFontSet();
    java.awt.Dimension var9 = var1.getMinimumSize();
    var0.setSize(var9);
    java.awt.Component var13 = var0.getComponentAt(0, 31);
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test137");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var1 = var0.getContentPane();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    boolean var3 = var2.isBackgroundSet();
    var2.setDebugGraphicsOptions(0);
    var2.firePropertyChange("hi!", 100, 10);
    var2.firePropertyChange("ToolBarUI", false, true);
    com.allenstudio.ir.ui.DatePickerPane var14 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var15 = var14.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var16 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var17 = var16.getColorModel();
    java.awt.im.InputContext var18 = var16.getInputContext();
    java.awt.Component var20 = var16.getComponentAtIndex(0);
    var14.setToolBar((javax.swing.JToolBar)var16);
    boolean var23 = var14.areFocusTraversalKeysSet(0);
    java.awt.Rectangle var24 = var14.bounds();
    var2.scrollRectToVisible(var24);
    java.awt.Rectangle var26 = var0.getBounds(var24);
    java.awt.Color var27 = var0.getHeaderBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test138");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    java.lang.String var4 = var0.getAttribute("C:\\boot.ini");
    java.util.Hashtable var5 = var0.getAttributes();
    java.util.Enumeration var6 = var5.keys();
    int var7 = var5.size();
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.lang.String var10 = var8.getWarningString();
    boolean var11 = var8.isAutoRequestFocus();
    com.allenstudio.ir.ui.MainFrame var12 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var13 = var12.getWarningString();
    boolean var14 = var12.isAlwaysOnTopSupported();
    java.awt.Color var15 = var12.getBackground();
    var8.setBackground(var15);
    var8.transferFocusDownCycle();
    boolean var18 = var8.isFocusCycleRoot();
    var8.toBack();
    var8.toFront();
    javax.accessibility.AccessibleContext var21 = var8.getAccessibleContext();
    boolean var22 = var5.containsValue((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test139");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    boolean var3 = var0.isLocationByPlatform();
    int var4 = var0.getY();
    var0.setSize(100, 10);
    var0.firePropertyChange("MenuBarUI", 'a', ' ');
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    var12.setEnabled(true);
    java.awt.ComponentOrientation var16 = var12.getComponentOrientation();
    boolean var17 = var12.isFloatable();
    com.allenstudio.ir.core.plugins.CommonNote var18 = new com.allenstudio.ir.core.plugins.CommonNote();
    var18.resize(0, 1);
    java.lang.String var22 = var18.getOtherInfo();
    com.allenstudio.ir.core.plugins.CommonNote var23 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var24 = var23.getFeature();
    com.allenstudio.ir.ui.StatusBar var25 = new com.allenstudio.ir.ui.StatusBar();
    var25.enable();
    boolean var27 = var25.isFocusOwner();
    var25.firePropertyChange("hi!", 10L, 0L);
    var25.layout();
    var25.removeAll();
    com.allenstudio.ir.ui.StatusBar var34 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var35 = var34.getRootPane();
    java.awt.Point var36 = var34.location();
    java.awt.Component var37 = var25.getComponentAt(var36);
    java.awt.Point var38 = var23.getLocation(var36);
    java.awt.Component var39 = var18.getComponentAt(var38);
    java.awt.Point var40 = var12.getLocation(var38);
    var0.setLocation(var38);
    boolean var42 = var0.isUndecorated();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "C:\\boot.ini"+ "'", var24.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test140");


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
    java.lang.String var18 = var15.getAttribute("", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    var15.removeFromParent();
    
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
    assertTrue("'" + var18 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var18.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test141");


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
    var34.validate();
    
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

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test142");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    var6.enable();
    boolean var8 = var6.isFocusOwner();
    var6.firePropertyChange("hi!", 10L, 0L);
    var6.layout();
    java.awt.Dimension var14 = var6.getMaximumSize();
    var0.setPreferredSize(var14);
    var0.setInheritsPopupMenu(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test143");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    com.allenstudio.ir.core.plugins.CommonNote var51 = new com.allenstudio.ir.core.plugins.CommonNote();
    var51.resize(0, 1);
    java.lang.String var55 = var51.getOtherInfo();
    int var57 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var51, 10);
    int var58 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test144");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponent(0);
    java.awt.Font var5 = var0.getFont();
    com.allenstudio.ir.ui.Toolbar var6 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var7 = var6.getColorModel();
    var6.setEnabled(true);
    java.awt.Component var11 = var6.getComponentAtIndex(1);
    boolean var12 = var6.isFloatable();
    javax.swing.InputMap var13 = var6.getInputMap();
    java.awt.im.InputMethodRequests var14 = var6.getInputMethodRequests();
    java.awt.Toolkit var15 = var6.getToolkit();
    var6.setLocation((-1), 0);
    java.awt.event.ContainerListener[] var19 = var6.getContainerListeners();
    int var20 = var0.getComponentIndex((java.awt.Component)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test145");


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
    var0.repaint(1L, 30, 1, 556, 32);
    java.awt.Component var38 = var0.getMostRecentFocusOwner();
    
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
    assertNotNull(var38);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test146");


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
    com.allenstudio.ir.ui.StatusBar var66 = new com.allenstudio.ir.ui.StatusBar();
    var66.enable();
    boolean var68 = var66.isFocusOwner();
    var66.firePropertyChange("hi!", 10L, 0L);
    var66.layout();
    var66.removeAll();
    com.allenstudio.ir.ui.StatusBar var75 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var76 = var75.getRootPane();
    java.awt.Point var77 = var75.location();
    java.awt.Point var78 = var66.getLocation(var77);
    java.awt.Component var79 = var0.getComponentAt(var77);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Color var81 = var0.getForegroundAt(6);
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
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test147");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.setSelectedIndex(1);
    com.allenstudio.ir.core.plugins.CommonNote var3 = new com.allenstudio.ir.core.plugins.CommonNote();
    var3.setFocusTraversalPolicyProvider(false);
    int var6 = var3.getY();
    int var7 = var0.indexOfComponent((java.awt.Component)var3);
    java.awt.Point var8 = var0.getMousePosition();
    var0.setAlignmentY(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test148");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement.printNode(var0, "ToolBarUI");
    com.allenstudio.ir.ui.DatePickerPane var5 = new com.allenstudio.ir.ui.DatePickerPane();
    var5.transferFocus();
    com.allenstudio.ir.ui.Toolbar var7 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var8 = var7.getColorModel();
    var7.setEnabled(true);
    java.awt.Component var12 = var7.getComponentAtIndex(1);
    boolean var13 = var7.isFloatable();
    var5.setContent((java.awt.Component)var7);
    java.awt.Dimension var15 = var5.size();
    com.allenstudio.ir.ui.Toolbar var16 = new com.allenstudio.ir.ui.Toolbar();
    boolean var17 = var16.isFloatable();
    var16.show();
    boolean var19 = var16.isRequestFocusEnabled();
    java.awt.Dimension var20 = var16.minimumSize();
    var5.setToolBar((javax.swing.JToolBar)var16);
    java.awt.Image var24 = var5.createImage(10, (-1));
    var5.setTitle("Date Picker");
    com.allenstudio.ir.ui.MainFrame var27 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var28 = var27.getWarningString();
    java.awt.Rectangle var29 = var27.getMaximizedBounds();
    java.awt.MenuBar var30 = var27.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var31 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var32 = new com.allenstudio.ir.ui.Toolbar();
    boolean var33 = var32.isFloatable();
    var32.show();
    java.awt.image.ColorModel var35 = var32.getColorModel();
    boolean var36 = var32.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var37 = new com.allenstudio.ir.ui.DatePickerPane();
    var37.transferFocus();
    com.allenstudio.ir.ui.Toolbar var39 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var40 = var39.getColorModel();
    var39.setEnabled(true);
    java.awt.Component var44 = var39.getComponentAtIndex(1);
    boolean var45 = var39.isFloatable();
    var37.setContent((java.awt.Component)var39);
    java.awt.Dimension var47 = var37.size();
    com.allenstudio.ir.ui.Toolbar var48 = new com.allenstudio.ir.ui.Toolbar();
    boolean var49 = var48.isFloatable();
    var48.show();
    boolean var51 = var48.isRequestFocusEnabled();
    java.awt.Dimension var52 = var48.minimumSize();
    var37.setToolBar((javax.swing.JToolBar)var48);
    java.awt.Image var56 = var37.createImage(10, (-1));
    var31.add((java.awt.Component)var32, (java.lang.Object)10);
    var27.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var31);
    java.awt.event.ComponentListener[] var59 = var31.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var60 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var61 = var60.getDateBackground();
    var60.setYearMonth(1, (-1));
    java.util.Calendar var65 = var60.getSelectedDate();
    var31.remove((java.awt.Component)var60);
    var60.setMarked(1, true);
    var5.addMouseMotionListener((java.awt.event.MouseMotionListener)var60);
    javax.swing.JToolBar var71 = var5.getToolBar();
    var0.notifyObservers((java.lang.Object)var71);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test149");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    boolean var2 = var0.isManagingFocus();
    java.awt.LayoutManager var3 = var0.getLayout();
    var0.setDebugGraphicsOptions(1);
    java.awt.Color var6 = var0.getHeaderBackground();
    com.allenstudio.ir.ui.DatePickerPane var7 = new com.allenstudio.ir.ui.DatePickerPane();
    var7.transferFocus();
    java.awt.Dimension var9 = var7.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var10 = new com.allenstudio.ir.ui.StatusBar();
    int var11 = var10.getY();
    javax.swing.JToolTip var12 = var10.createToolTip();
    float var13 = var12.getAlignmentY();
    java.awt.Color var14 = var12.getForeground();
    var7.setBackground(var14);
    java.awt.Component.BaselineResizeBehavior var16 = var7.getBaselineResizeBehavior();
    var0.setContent((java.awt.Component)var7);
    java.awt.Color var18 = var7.getHeaderBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test150");


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
    java.awt.Dimension var15 = var11.getCellDimension();
    java.util.Calendar var16 = var11.getSelectedDate();
    int var17 = var11.getHeight();
    
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test151");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    var0.requestFocus();
    javax.swing.JRootPane var3 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test152");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    var0.invalidate();
    java.lang.String var13 = var0.getToolTipText();
    java.util.Locale var14 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test153");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    java.awt.event.WindowListener[] var8 = var0.getWindowListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var10 = var0.getFocusTraversalKeys(30);
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

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test154");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    var0.readIn();
    var0.writeBack();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.setProperty("Title", " ");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test155");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    javax.swing.JComponent var1 = var0.getHeaderComponent();
    var0.setWeekStartOnSunday(true);
    com.allenstudio.ir.ui.Toolbar var4 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var5 = var4.getColorModel();
    var4.setEnabled(true);
    java.awt.ComponentOrientation var8 = var4.getComponentOrientation();
    boolean var9 = var4.isFloatable();
    com.allenstudio.ir.core.plugins.CommonNote var10 = new com.allenstudio.ir.core.plugins.CommonNote();
    var10.resize(0, 1);
    java.lang.String var14 = var10.getOtherInfo();
    com.allenstudio.ir.core.plugins.CommonNote var15 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var16 = var15.getFeature();
    com.allenstudio.ir.ui.StatusBar var17 = new com.allenstudio.ir.ui.StatusBar();
    var17.enable();
    boolean var19 = var17.isFocusOwner();
    var17.firePropertyChange("hi!", 10L, 0L);
    var17.layout();
    var17.removeAll();
    com.allenstudio.ir.ui.StatusBar var26 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var27 = var26.getRootPane();
    java.awt.Point var28 = var26.location();
    java.awt.Component var29 = var17.getComponentAt(var28);
    java.awt.Point var30 = var15.getLocation(var28);
    java.awt.Component var31 = var10.getComponentAt(var30);
    java.awt.Point var32 = var4.getLocation(var30);
    var0.setLocation(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "C:\\boot.ini"+ "'", var16.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test156");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    com.allenstudio.ir.ui.NoteListsTabPane var6 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.MainFrame var7 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var8 = var7.getWarningString();
    java.awt.Rectangle var9 = var7.getMaximizedBounds();
    java.awt.MenuBar var10 = var7.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var11 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    boolean var13 = var12.isFloatable();
    var12.show();
    java.awt.image.ColorModel var15 = var12.getColorModel();
    boolean var16 = var12.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var17 = new com.allenstudio.ir.ui.DatePickerPane();
    var17.transferFocus();
    com.allenstudio.ir.ui.Toolbar var19 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var20 = var19.getColorModel();
    var19.setEnabled(true);
    java.awt.Component var24 = var19.getComponentAtIndex(1);
    boolean var25 = var19.isFloatable();
    var17.setContent((java.awt.Component)var19);
    java.awt.Dimension var27 = var17.size();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    boolean var29 = var28.isFloatable();
    var28.show();
    boolean var31 = var28.isRequestFocusEnabled();
    java.awt.Dimension var32 = var28.minimumSize();
    var17.setToolBar((javax.swing.JToolBar)var28);
    java.awt.Image var36 = var17.createImage(10, (-1));
    var11.add((java.awt.Component)var12, (java.lang.Object)10);
    var7.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var11);
    java.awt.event.ComponentListener[] var39 = var11.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var40 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var41 = var40.getDateBackground();
    var40.setYearMonth(1, (-1));
    java.util.Calendar var45 = var40.getSelectedDate();
    var11.remove((java.awt.Component)var40);
    int var47 = var11.getTabLayoutPolicy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var6, (java.lang.Object)var11);
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test157");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    java.awt.Image var8 = var0.getIconImage();
    com.allenstudio.ir.ui.MainFrame var9 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var10 = var9.getWarningString();
    java.lang.String var11 = var9.getWarningString();
    boolean var12 = var9.isAutoRequestFocus();
    boolean var13 = var9.isResizable();
    javax.swing.JLayeredPane var14 = var9.getLayeredPane();
    int var15 = var14.getX();
    var14.setEnabled(false);
    com.allenstudio.ir.core.plugins.CommonNote var18 = new com.allenstudio.ir.core.plugins.CommonNote();
    var18.resize(0, 1);
    java.lang.String var22 = var18.getOtherInfo();
    com.allenstudio.ir.core.plugins.CommonNote var23 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var24 = var23.getFeature();
    com.allenstudio.ir.ui.StatusBar var25 = new com.allenstudio.ir.ui.StatusBar();
    var25.enable();
    boolean var27 = var25.isFocusOwner();
    var25.firePropertyChange("hi!", 10L, 0L);
    var25.layout();
    var25.removeAll();
    com.allenstudio.ir.ui.StatusBar var34 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var35 = var34.getRootPane();
    java.awt.Point var36 = var34.location();
    java.awt.Component var37 = var25.getComponentAt(var36);
    java.awt.Point var38 = var23.getLocation(var36);
    java.awt.Component var39 = var18.getComponentAt(var38);
    java.awt.Point var40 = var14.getLocation(var38);
    var0.setLocation(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "C:\\boot.ini"+ "'", var24.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test158");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var1 = var0.getDateBackground();
    var0.setWeekStartOnSunday(true);
    boolean var4 = var0.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test159");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.isEnabledAt(3);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test160");


    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    int var1 = var0.getSelectedDate();
    var0.setSelectedDate(1);
    boolean var5 = var0.isMarked(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test161");


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
    java.lang.String var75 = var0.getUIClassID();
    java.awt.event.KeyListener[] var76 = var0.getKeyListeners();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "TabbedPaneUI"+ "'", var75.equals("TabbedPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test162");


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
    javax.swing.event.ChangeListener[] var75 = var0.getChangeListeners();
    com.allenstudio.ir.ui.MainFrame var77 = new com.allenstudio.ir.ui.MainFrame();
    boolean var78 = var77.isShowing();
    var77.setAutoRequestFocus(false);
    var77.setTitle("PanelUI");
    var77.setVisible(true);
    boolean var85 = var77.isValidateRoot();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var86 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var86.setWeekStartOnSunday(true);
    java.awt.Color var89 = var86.getDateForeground();
    var77.setBackground(var89);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setForegroundAt(32, var89);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test163");


    com.allenstudio.ir.core.ConfigurationManager var1 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    var1.writeBack();
    var1.writeBack();
    java.util.Enumeration var4 = var1.propertyNames();
    var1.readIn();
    java.util.Enumeration var6 = var1.propertyNames();
    com.allenstudio.ir.util.XmlElement var7 = new com.allenstudio.ir.util.XmlElement("Inspirento - alpha 0.86", (java.util.Hashtable)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test164");


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
    com.allenstudio.ir.ui.MainFrame var38 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var39 = var38.getWarningString();
    java.awt.Rectangle var40 = var38.getMaximizedBounds();
    java.awt.MenuBar var41 = var38.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var42 = new com.allenstudio.ir.core.plugins.CommonNote();
    var42.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var46 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var42);
    com.allenstudio.ir.ui.StatusBar var47 = new com.allenstudio.ir.ui.StatusBar();
    boolean var48 = var47.isBackgroundSet();
    boolean var51 = var47.contains(10, 100);
    var47.revalidate();
    javax.swing.JToolTip var53 = var47.createToolTip();
    com.allenstudio.ir.ui.StatusBar var54 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var55 = var54.getRootPane();
    java.awt.Point var56 = var54.location();
    com.allenstudio.ir.ui.StatusBar var57 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var58 = var57.getRootPane();
    java.awt.Point var59 = var57.location();
    com.allenstudio.ir.ui.Toolbar var60 = new com.allenstudio.ir.ui.Toolbar();
    boolean var61 = var60.isFloatable();
    java.awt.Component var63 = var60.getComponentAtIndex(10);
    java.lang.Object var64 = var57.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var65 = var57.getMaximumSize();
    var54.setMinimumSize(var65);
    java.awt.Rectangle var67 = var54.getBounds();
    var47.scrollRectToVisible(var67);
    var42.repaint(var67);
    var38.setMaximizedBounds(var67);
    var0.scrollRectToVisible(var67);
    java.util.Calendar var72 = var0.getCurrent();
    java.awt.Container var73 = var0.getTopLevelAncestor();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test165");


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
    var12.setData("Date Picker");
    var0.notifyObservers((java.lang.Object)var12);
    com.allenstudio.ir.util.XmlElement var21 = var12.addSubElement("com.allenstudio.ir.ui.NoteListsTabPane[,0,0,0x0,invalid,layout=com.apple.laf.AquaTabbedPaneUI$AquaTruncatingTabbedPaneLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777568,maximumSize=,minimumSize=,preferredSize=,haveRegistered=false,tabPlacement=TOP]");
    
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
    assertNotNull(var21);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test166");


    com.allenstudio.ir.util.XmlElement var1 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var3 = var1.addSubElement("hi!");
    java.lang.String var5 = var1.getAttribute("C:\\boot.ini");
    java.util.Hashtable var6 = var1.getAttributes();
    com.allenstudio.ir.util.XmlElement var7 = new com.allenstudio.ir.util.XmlElement("PanelUI", var6);
    java.util.Set var8 = var6.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test167");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    var0.invalidate();
    java.lang.String var13 = var0.getToolTipText();
    com.allenstudio.ir.ui.calendar.DateChooser var14 = var0.getDateChooser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test168");


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
    var0.setVisible(false);
    java.lang.String var19 = var0.getOtherInfoText();
    java.awt.Component.BaselineResizeBehavior var20 = var0.getBaselineResizeBehavior();
    
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
    assertTrue("'" + var19 + "' != '" + " "+ "'", var19.equals(" "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test169");


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
    java.awt.Color var21 = var0.getBackground();
    var0.setState(5);
    
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
    assertNotNull(var21);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test170");


    java.lang.String[] var2 = com.allenstudio.ir.util.InspirentoUtilities.tokenize("{}", "ToolBarUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test171");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    java.util.Enumeration var12 = var7.getAttributeNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test172");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var4.setTabPlacement(1);
    int var10 = var4.indexAtLocation(10, (-1));
    com.allenstudio.ir.ui.calendar.DateChooser var11 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var11.setSize(0, (-1));
    com.allenstudio.ir.event.DateChooserListener var15 = var11.getDateChooserListener();
    var11.removeDateChooserListener();
    java.awt.Component var18 = var4.add((java.awt.Component)var11, 0);
    java.awt.Dimension var19 = var11.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test173");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    java.util.Set var1 = var0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test174");


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
    boolean var15 = var11.getMouseListeningEnabled();
    boolean var16 = var11.getMouseListeningEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setMarked(32, false);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test175");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    var0.setOpaque(false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test176");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getUIClassID();
    com.allenstudio.ir.ui.StatusBar var2 = new com.allenstudio.ir.ui.StatusBar();
    int var3 = var2.getY();
    javax.swing.JToolTip var4 = var2.createToolTip();
    float var5 = var4.getAlignmentY();
    java.awt.Color var6 = var4.getForeground();
    var0.setBackground(var6);
    var0.move(10, 10);
    com.allenstudio.ir.ui.calendar.DateChooser var11 = var0.getDateChooser();
    
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
    assertNotNull(var11);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test177");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.core.plugins.CommonNote var1 = new com.allenstudio.ir.core.plugins.CommonNote();
    var1.resize(0, 1);
    java.lang.String var5 = var1.getOtherInfo();
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
    java.awt.Component var22 = var1.getComponentAt(var21);
    com.allenstudio.ir.ui.DatePickerPane var23 = new com.allenstudio.ir.ui.DatePickerPane();
    var23.transferFocus();
    java.awt.Dimension var25 = var23.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var26 = new com.allenstudio.ir.ui.StatusBar();
    int var27 = var26.getY();
    javax.swing.JToolTip var28 = var26.createToolTip();
    float var29 = var28.getAlignmentY();
    java.awt.Color var30 = var28.getForeground();
    var23.setBackground(var30);
    com.allenstudio.ir.ui.MainFrame var32 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var33 = var32.getWarningString();
    java.lang.String var34 = var32.getWarningString();
    var32.toFront();
    java.awt.im.InputContext var36 = var32.getInputContext();
    var1.putClientProperty((java.lang.Object)var23, (java.lang.Object)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setElementAt((com.allenstudio.ir.core.plugins.AbstractNote)var1, 4);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test178");


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
    com.allenstudio.ir.util.XmlElement var16 = var15.getParent();
    
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
    assertNotNull(var16);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test179");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var2 = new com.allenstudio.ir.core.plugins.CommonNote();
    var2.setFocusTraversalPolicyProvider(false);
    var1.remove((java.awt.Component)var2);
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    int var7 = var6.getY();
    javax.swing.JToolTip var8 = var6.createToolTip();
    java.awt.Insets var9 = var8.getInsets();
    java.awt.Insets var10 = var2.getInsets(var9);
    int var11 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var2);
    java.lang.String var12 = var2.getFeature();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "C:\\boot.ini"+ "'", var12.equals("C:\\boot.ini"));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test180");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Dimension var10 = var0.size();
    boolean var11 = var0.isBackgroundSet();
    javax.swing.KeyStroke[] var12 = var0.getRegisteredKeyStrokes();
    java.beans.PropertyChangeListener[] var14 = var0.getPropertyChangeListeners("PanelUI");
    var0.updateUI();
    java.awt.Component.BaselineResizeBehavior var16 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test181");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    var4.setIndexInList((-1));
    com.allenstudio.ir.ui.DatePickerPane var7 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var8 = var7.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var9 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var10 = var9.getUI();
    var7.setUI(var10);
    var4.setUI(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test182");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var1 = var0.getRootPane();
    java.awt.Point var2 = var0.location();
    com.allenstudio.ir.ui.Toolbar var3 = new com.allenstudio.ir.ui.Toolbar();
    boolean var4 = var3.isFloatable();
    java.awt.Component var6 = var3.getComponentAtIndex(10);
    java.lang.Object var7 = var0.getClientProperty((java.lang.Object)10);
    var0.setFocusTraversalPolicyProvider(false);
    boolean var10 = var0.isManagingFocus();
    int var11 = var0.getHeight();
    var0.grabFocus();
    com.allenstudio.ir.ui.Toolbar var13 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var14 = var13.getColorModel();
    var13.setEnabled(true);
    java.awt.Component var18 = var13.getComponentAtIndex(1);
    boolean var19 = var13.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var20 = var13.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var22 = var13.getPropertyChangeListeners("Date Picker");
    boolean var23 = var13.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var24 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var13.removeMouseListener((java.awt.event.MouseListener)var24);
    var24.setMonth(4);
    var0.addMouseListener((java.awt.event.MouseListener)var24);
    int var29 = var24.getMonth();
    var24.setAlignmentY(0.0f);
    
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
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 4);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test183");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    java.awt.event.InputMethodListener[] var8 = var0.getInputMethodListeners();
    var0.setFloatable(true);
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var12 = var11.getColorModel();
    var11.setEnabled(true);
    java.awt.Component var16 = var11.getComponentAtIndex(1);
    boolean var17 = var11.isFloatable();
    java.lang.String var18 = var11.toString();
    com.allenstudio.ir.ui.Toolbar var19 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var20 = var19.getMouseWheelListeners();
    java.awt.event.MouseListener[] var21 = var19.getMouseListeners();
    var19.firePropertyChange("", false, true);
    var11.add((java.awt.Component)var19, (java.lang.Object)10.0f);
    java.awt.event.HierarchyBoundsListener[] var28 = var19.getHierarchyBoundsListeners();
    com.allenstudio.ir.ui.Toolbar var29 = new com.allenstudio.ir.ui.Toolbar();
    boolean var30 = var29.isFloatable();
    var29.show();
    boolean var32 = var29.isRequestFocusEnabled();
    java.awt.Dimension var33 = var29.minimumSize();
    java.awt.Dimension var34 = var29.getMinimumSize();
    var19.resize(var34);
    java.awt.Dimension var36 = var0.getSize(var34);
    javax.swing.KeyStroke[] var37 = var0.getRegisteredKeyStrokes();
    boolean var38 = var0.isValidateRoot();
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test184");


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
    java.awt.Component var55 = var0.getComponentAt(1, 5);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test185");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    javax.swing.InputMap var9 = var2.getInputMap();
    java.awt.Component var11 = var2.getComponentAtIndex(100);
    com.allenstudio.ir.ui.MainFrame var12 = new com.allenstudio.ir.ui.MainFrame();
    boolean var13 = var12.isShowing();
    var12.setAutoRequestFocus(false);
    var12.setTitle("PanelUI");
    var12.setVisible(true);
    java.awt.Image var20 = var12.getIconImage();
    java.awt.Dimension var21 = var12.getMinimumSize();
    java.awt.Dimension var22 = var2.getSize(var21);
    var0.resize(var22);
    boolean var24 = var0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test186");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.setSelectedIndex(1);
    java.awt.Component var3 = var0.getSelectedComponent();
    java.awt.Component var4 = var0.getSelectedComponent();
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
    boolean var18 = var5.isLightweight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var20 = var0.add((java.awt.Component)var5, 4);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
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
    assertTrue(var18 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test187");


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
    java.awt.im.InputMethodRequests var41 = var0.getInputMethodRequests();
    boolean var42 = var0.requestFocusInWindow();
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test188");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var3 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var5 = var3.addSubElement("hi!");
    var5.notifyObservers((java.lang.Object)(byte)1);
    var0.append(var5);
    com.allenstudio.ir.util.XmlElement var11 = var0.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    java.lang.String var13 = var0.getAttribute("TabbedPaneUI");
    java.lang.Object var14 = var0.clone();
    java.util.Enumeration var15 = var0.getAttributeNames();
    
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

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test189");


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
    javax.swing.JToolTip var34 = var31.createToolTip();
    
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
    assertNotNull(var34);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test190");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    com.allenstudio.ir.ui.Toolbar var6 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var7 = var6.getColorModel();
    var6.setEnabled(true);
    java.awt.Component var11 = var6.getComponentAtIndex(1);
    boolean var12 = var6.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var13 = var6.getFocusTraversalPolicy();
    var6.grabFocus();
    var6.addNotify();
    com.allenstudio.ir.ui.calendar.MonthlyCalendarModel var16 = new com.allenstudio.ir.ui.calendar.MonthlyCalendarModel();
    var16.setMarked(4, false);
    boolean var21 = var16.isMarked(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.add((java.awt.Component)var6, (java.lang.Object)1, 100);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test191");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.show();
    boolean var3 = var0.isRequestFocusEnabled();
    java.awt.event.MouseWheelListener[] var4 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test192");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    java.util.Hashtable var11 = var2.getAttributes();
    com.allenstudio.ir.util.XmlElement var12 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var14 = var12.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var15 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var17 = var15.addSubElement("hi!");
    var17.notifyObservers((java.lang.Object)(byte)1);
    var12.append(var17);
    com.allenstudio.ir.util.XmlElement var23 = var12.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    java.lang.Object var26 = var12.addAttribute("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    com.allenstudio.ir.util.XmlElement var28 = var12.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var29 = var2.addSubElement(var28);
    java.util.Hashtable var30 = var29.getAttributes();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test193");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.enable();
    var0.setFocusCycleRoot(true);
    var0.show(true);
    boolean var10 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test194");


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
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var29 = var28.getColorModel();
    var28.setEnabled(true);
    java.awt.Component var33 = var28.getComponentAtIndex(1);
    java.awt.Component var35 = var28.getComponentAtIndex(1);
    java.awt.event.InputMethodListener[] var36 = var28.getInputMethodListeners();
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.Dimension var38 = var37.size();
    java.awt.Dimension var39 = var28.getSize(var38);
    var0.setSize(var38);
    boolean var43 = var0.inside(556, 5);
    var0.setLocationByPlatform(true);
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test195");


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
    var27.setSelected(false);
    var27.setTitle("hi!");
    
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

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test196");


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
    int var60 = var11.getSelectedDay();
    java.awt.event.InputMethodListener[] var61 = var11.getInputMethodListeners();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test197");


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
    var0.setData("ToolBarUI");
    
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

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test198");


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
    javax.swing.plaf.MenuBarUI var12 = var5.getUI();
    var5.setBorderPainted(true);
    java.awt.Insets var15 = var5.getMargin();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test199");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    int var5 = var4.getIndexInList();
    java.awt.Dimension var6 = var4.getMaximumSize();
    var4.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test200");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    var0.enable();
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    boolean var7 = var6.isShowing();
    int var8 = var6.countComponents();
    com.allenstudio.ir.ui.StatusBar var9 = new com.allenstudio.ir.ui.StatusBar();
    var9.enable();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    var11.enable();
    boolean var13 = var11.isFocusOwner();
    var11.firePropertyChange("hi!", 10L, 0L);
    var11.layout();
    var11.removeAll();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var21 = var20.getRootPane();
    java.awt.Point var22 = var20.location();
    java.awt.Point var23 = var11.getLocation(var22);
    var9.setLocation(var23);
    var6.setLocation(var23);
    java.awt.Color var26 = var6.getBackground();
    var0.setForeground(var26);
    java.awt.Image var28 = var0.getIconImage();
    com.allenstudio.ir.ui.MainFrame var29 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var30 = var29.getWarningString();
    java.lang.String var31 = var29.getWarningString();
    boolean var32 = var29.isAutoRequestFocus();
    boolean var33 = var29.isResizable();
    javax.swing.JRootPane var34 = var29.getRootPane();
    boolean var35 = var34.isOpaque();
    java.awt.Point var36 = var34.location();
    var0.setLocation(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test201");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    java.awt.Container var3 = var0.getFocusCycleRootAncestor();
    java.awt.Rectangle var4 = var0.getMaximizedBounds();
    java.awt.Dimension var5 = var0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test202");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    boolean var51 = var0.isEmpty();
    java.util.Enumeration var52 = var0.elements();
    com.allenstudio.ir.core.plugins.CommonNote var53 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var54 = var53.getFeature();
    var53.setFeature("Date Picker");
    float var57 = var53.getAlignmentY();
    boolean var58 = var0.removeElement((com.allenstudio.ir.core.plugins.AbstractNote)var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "C:\\boot.ini"+ "'", var54.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test203");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    var0.disable();
    var0.setSize(1, 761);
    var0.displayTooltip("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test204");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var1 = var0.getContentPane();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.isSelected();
    java.awt.Color var5 = var0.getHeaderBackground();
    var0.setDoubleBuffered(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test205");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.lang.String var2 = var0.getWarningString();
    com.allenstudio.ir.core.ConfigurationManager var4 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    java.util.Set var5 = var4.stringPropertyNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(3, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test206");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    java.lang.String var4 = var0.getOtherInfo();
    com.allenstudio.ir.core.plugins.CommonNote var5 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var6 = var5.getFeature();
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
    java.awt.Point var20 = var5.getLocation(var18);
    java.awt.Component var21 = var0.getComponentAt(var20);
    com.allenstudio.ir.ui.DatePickerPane var22 = new com.allenstudio.ir.ui.DatePickerPane();
    var22.transferFocus();
    java.awt.Dimension var24 = var22.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var25 = new com.allenstudio.ir.ui.StatusBar();
    int var26 = var25.getY();
    javax.swing.JToolTip var27 = var25.createToolTip();
    float var28 = var27.getAlignmentY();
    java.awt.Color var29 = var27.getForeground();
    var22.setBackground(var29);
    com.allenstudio.ir.ui.MainFrame var31 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var32 = var31.getWarningString();
    java.lang.String var33 = var31.getWarningString();
    var31.toFront();
    java.awt.im.InputContext var35 = var31.getInputContext();
    var0.putClientProperty((java.lang.Object)var22, (java.lang.Object)var35);
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var38 = var37.getColorModel();
    var37.setEnabled(true);
    java.awt.Component var42 = var37.getComponentAtIndex(1);
    var22.setToolBar((javax.swing.JToolBar)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "C:\\boot.ini"+ "'", var6.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test207");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    var5.updateUI();
    java.awt.Insets var10 = var5.getMargin();
    var5.removeNotify();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    java.awt.im.InputContext var14 = var12.getInputContext();
    java.awt.Component var16 = var12.getComponent(0);
    var12.setEnabled(true);
    boolean var19 = var12.isRollover();
    com.allenstudio.ir.ui.StatusBar var20 = new com.allenstudio.ir.ui.StatusBar();
    int var21 = var20.getY();
    javax.swing.JToolTip var22 = var20.createToolTip();
    java.awt.Insets var23 = var22.getInsets();
    var12.setMargin(var23);
    var5.setMargin(var23);
    
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test208");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var1 = var0.getDateBackground();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponent(0);
    java.awt.Font var7 = var2.getFont();
    var0.setHeaderFont(var7);
    com.allenstudio.ir.ui.Toolbar var9 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var10 = var9.getColorModel();
    java.awt.im.InputContext var11 = var9.getInputContext();
    java.awt.Component var13 = var9.getComponentAtIndex(0);
    var9.revalidate();
    com.allenstudio.ir.ui.MainFrame var15 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var16 = var15.getWarningString();
    boolean var17 = var15.isAlwaysOnTopSupported();
    java.awt.Color var18 = var15.getBackground();
    var9.setForeground(var18);
    var0.setDateBackground(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test209");


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
    java.awt.Container var15 = var0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test210");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    boolean var2 = var0.isManagingFocus();
    java.awt.LayoutManager var3 = var0.getLayout();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test211");


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
    java.awt.im.InputMethodRequests var41 = var0.getInputMethodRequests();
    int var42 = var0.getCellCount();
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 5);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test212");


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
    java.util.Calendar var13 = var11.getSelectedDate();
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
    assertNotNull(var13);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test213");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    var0.setEnabled(false);
    com.allenstudio.ir.ui.DatePickerPane var8 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var9 = var8.getTitle();
    boolean var10 = var8.isManagingFocus();
    java.awt.LayoutManager var11 = var8.getLayout();
    var0.setLayout(var11);
    var0.setRequestFocusEnabled(true);
    java.awt.GraphicsConfiguration var15 = var0.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Date Picker"+ "'", var9.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test214");


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
    java.awt.Dimension var43 = var0.getPreferredScrollableViewportSize();
    var0.repaint(100L, 100, 5, 100, 556);
    int var50 = var0.getSelectedIndex();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test215");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    int var8 = var7.getY();
    boolean var9 = var7.isLightweight();
    java.awt.Dimension var10 = var7.getMaximumSize();
    java.awt.event.KeyListener[] var11 = var7.getKeyListeners();
    boolean var12 = var7.getInheritsPopupMenu();
    var7.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var7.repaint(100L, 100, 1, 100, (-1));
    boolean var23 = var7.isOpaque();
    var5.setSelected((java.awt.Component)var7);
    int var25 = var5.getMenuCount();
    javax.swing.JMenu var27 = var5.getMenu(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test216");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.util.Locale var2 = var0.getLocale();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var3.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var7 = var3.getAncestorListeners();
    var0.setLocationRelativeTo((java.awt.Component)var3);
    var0.setExtendedState(556);
    var0.setSize(556, 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test217");


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
    int var27 = var0.getTabLayoutPolicy();
    
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
    assertTrue(var27 == 0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test218");


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
    javax.accessibility.AccessibleContext var37 = var0.getAccessibleContext();
    
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
    assertNotNull(var37);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test219");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    java.awt.Point var7 = var0.getMousePosition(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test220");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.getInheritsPopupMenu();
    var0.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var0.repaint(100L, 100, 1, 100, (-1));
    java.awt.im.InputMethodRequests var16 = var0.getInputMethodRequests();
    var0.setAlignmentX(0.5f);
    
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
    assertNull(var16);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test221");


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
    javax.swing.JToolTip var16 = var0.createToolTip();
    var0.setRollover(false);
    
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

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test222");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var0.dispose();
    var0.setAlwaysOnTop(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test223");


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
    java.awt.event.ContainerListener[] var38 = var0.getContainerListeners();
    java.lang.String var39 = var0.getUIClassID();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "PanelUI"+ "'", var39.equals("PanelUI"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test224");


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
    java.awt.Rectangle var18 = var0.getMaximizedBounds();
    java.awt.Image var19 = var0.getIconImage();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(556);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var19);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test225");


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
    int var40 = var4.getTabLayoutPolicy();
    int var41 = var4.getTabPlacement();
    com.allenstudio.ir.ui.Toolbar var43 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var44 = var43.getColorModel();
    var43.setEnabled(true);
    java.awt.Component var48 = var43.getComponentAtIndex(1);
    boolean var49 = var43.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var50 = var43.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var52 = var43.getPropertyChangeListeners("Date Picker");
    boolean var53 = var43.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var54 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var43.removeMouseListener((java.awt.event.MouseListener)var54);
    boolean var56 = var54.getWeekStartOnSunday();
    int var57 = var54.getSelectedDay();
    int var58 = var54.getYear();
    java.awt.Color var59 = var54.getDateBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.setForegroundAt(30, var59);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2015);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test226");


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
    com.allenstudio.ir.util.XmlElement var16 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var18 = var16.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var21 = var18.addSubElement("", "hi!");
    java.util.Hashtable var22 = var21.getAttributes();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var24 = var23.getColorModel();
    var23.setEnabled(true);
    java.awt.ComponentOrientation var27 = var23.getComponentOrientation();
    java.lang.Object var28 = var7.put((java.lang.Object)var22, (java.lang.Object)var27);
    com.allenstudio.ir.util.XmlElement var29 = new com.allenstudio.ir.util.XmlElement(" ", var7);
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var32 = var30.addSubElement("hi!");
    var32.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var35 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var37 = var35.addSubElement("hi!");
    var37.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var40 = var32.removeElement(var37);
    com.allenstudio.ir.util.XmlElement var41 = var37.getParent();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.isValidateRoot();
    java.awt.Dimension var49 = var42.getMinimumSize();
    java.lang.Object var50 = var7.put((java.lang.Object)var37, (java.lang.Object)var49);
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test227");


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
    boolean var44 = var0.isFocusOwner();
    com.allenstudio.ir.ui.NoteListsTabPane var46 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var47 = new com.allenstudio.ir.ui.Toolbar();
    boolean var48 = var47.isFloatable();
    var47.show();
    java.awt.image.ColorModel var50 = var47.getColorModel();
    boolean var51 = var47.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var52 = new com.allenstudio.ir.ui.DatePickerPane();
    var52.transferFocus();
    com.allenstudio.ir.ui.Toolbar var54 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var55 = var54.getColorModel();
    var54.setEnabled(true);
    java.awt.Component var59 = var54.getComponentAtIndex(1);
    boolean var60 = var54.isFloatable();
    var52.setContent((java.awt.Component)var54);
    java.awt.Dimension var62 = var52.size();
    com.allenstudio.ir.ui.Toolbar var63 = new com.allenstudio.ir.ui.Toolbar();
    boolean var64 = var63.isFloatable();
    var63.show();
    boolean var66 = var63.isRequestFocusEnabled();
    java.awt.Dimension var67 = var63.minimumSize();
    var52.setToolBar((javax.swing.JToolBar)var63);
    java.awt.Image var71 = var52.createImage(10, (-1));
    var46.add((java.awt.Component)var47, (java.lang.Object)10);
    var46.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var75 = var46.getUI();
    javax.swing.SingleSelectionModel var76 = var46.getModel();
    int var77 = var46.getTabPlacement();
    com.allenstudio.ir.ui.StatusBar var79 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var80 = new com.allenstudio.ir.core.plugins.CommonNote();
    var80.setFocusTraversalPolicyProvider(false);
    var79.remove((java.awt.Component)var80);
    var80.setFeature("ToolBarUI");
    javax.swing.Icon var86 = var80.getIcon();
    var46.setDisabledIconAt(0, var86);
    com.allenstudio.ir.ui.StatusBar var88 = new com.allenstudio.ir.ui.StatusBar();
    int var89 = var88.getY();
    javax.swing.JToolTip var90 = var88.createToolTip();
    float var91 = var90.getAlignmentY();
    java.awt.Color var92 = var90.getForeground();
    boolean var93 = var90.isDisplayable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.insertTab("PanelUI", var86, (java.awt.Component)var90, "TabbedPaneUI", 556);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test228");


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
    com.allenstudio.ir.ui.NoteListsTabPane var36 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    boolean var38 = var37.isFloatable();
    var37.show();
    java.awt.image.ColorModel var40 = var37.getColorModel();
    boolean var41 = var37.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var42 = new com.allenstudio.ir.ui.DatePickerPane();
    var42.transferFocus();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var45 = var44.getColorModel();
    var44.setEnabled(true);
    java.awt.Component var49 = var44.getComponentAtIndex(1);
    boolean var50 = var44.isFloatable();
    var42.setContent((java.awt.Component)var44);
    java.awt.Dimension var52 = var42.size();
    com.allenstudio.ir.ui.Toolbar var53 = new com.allenstudio.ir.ui.Toolbar();
    boolean var54 = var53.isFloatable();
    var53.show();
    boolean var56 = var53.isRequestFocusEnabled();
    java.awt.Dimension var57 = var53.minimumSize();
    var42.setToolBar((javax.swing.JToolBar)var53);
    java.awt.Image var61 = var42.createImage(10, (-1));
    var36.add((java.awt.Component)var37, (java.lang.Object)10);
    var36.setSelectedIndex(1);
    var0.addTab("Inspirento - alpha 0.86", (java.awt.Component)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var67 = var0.getTabComponentAt(32);
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
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test229");


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
    java.awt.Component var21 = var0.getGlassPane();
    boolean var22 = var0.isAlwaysOnTop();
    
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
    assertTrue(var22 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test230");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var1 = var0.getMouseWheelListeners();
    java.awt.LayoutManager var2 = var0.getLayout();
    boolean var3 = var0.isOpaque();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    com.allenstudio.ir.ui.DatePickerPane var6 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var7 = var6.getTitle();
    boolean var8 = var6.isManagingFocus();
    java.awt.LayoutManager var9 = var6.getLayout();
    java.awt.Component var10 = var0.add("Title", (java.awt.Component)var6);
    java.awt.Dimension var11 = var6.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Date Picker"+ "'", var7.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test231");


    com.allenstudio.ir.ui.NoteList var0 = new com.allenstudio.ir.ui.NoteList();
    var0.removeListEventListener();
    com.allenstudio.ir.ui.NoteList var2 = new com.allenstudio.ir.ui.NoteList();
    com.allenstudio.ir.ui.MainFrame var3 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var4 = var3.getWarningString();
    java.awt.Rectangle var5 = var3.getMaximizedBounds();
    java.awt.MenuBar var6 = var3.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    var7.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var11 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var7);
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
    var7.repaint(var32);
    var3.setMaximizedBounds(var32);
    int var38 = var2.getScrollableBlockIncrement(var32, 1, 4);
    com.allenstudio.ir.core.plugins.CommonNote var39 = new com.allenstudio.ir.core.plugins.CommonNote();
    var39.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var43 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var39);
    int var44 = var43.getIndexInList();
    var2.addCell(var43);
    var43.setIndexInList(0);
    int var48 = var43.getIndexInList();
    var0.addCell(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
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
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test232");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    boolean var51 = var0.isEmpty();
    java.util.Enumeration var52 = var0.elements();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.core.plugins.AbstractNote var54 = var0.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test233");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.setWeekStartOnSunday(true);
    java.awt.Color var3 = var0.getDateForeground();
    java.awt.Color var4 = var0.getHeaderBackground();
    float var5 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test234");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setToolTipTextAt(2015, "hi!");
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

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test235");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    boolean var6 = var0.isFocusable();
    com.allenstudio.ir.ui.StatusBar var7 = new com.allenstudio.ir.ui.StatusBar();
    var7.enable();
    boolean var9 = var7.isFocusOwner();
    var7.firePropertyChange("hi!", 10L, 0L);
    var7.layout();
    java.awt.Dimension var15 = var7.getMaximumSize();
    com.allenstudio.ir.ui.calendar.DateChooser var16 = new com.allenstudio.ir.ui.calendar.DateChooser();
    boolean var18 = var16.requestFocus(false);
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    boolean var20 = var19.isBackgroundSet();
    var19.repaint(100L);
    int var23 = var19.getWidth();
    com.allenstudio.ir.ui.MainFrame var24 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var25 = var24.getWarningString();
    java.lang.String var26 = var24.getWarningString();
    java.awt.Container var27 = var24.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var28 = new com.allenstudio.ir.ui.StatusBar();
    boolean var29 = var28.isBackgroundSet();
    boolean var32 = var28.contains(10, 100);
    var28.revalidate();
    javax.swing.JToolTip var34 = var28.createToolTip();
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
    var28.scrollRectToVisible(var48);
    var24.setMaximizedBounds(var48);
    var19.computeVisibleRect(var48);
    var16.paintImmediately(var48);
    com.allenstudio.ir.event.DateChooserListener var53 = var16.getDateChooserListener();
    com.allenstudio.ir.ui.MainFrame var54 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var55 = var54.getWarningString();
    java.awt.Rectangle var56 = var54.getMaximizedBounds();
    java.awt.MenuBar var57 = var54.getMenuBar();
    com.allenstudio.ir.core.plugins.CommonNote var58 = new com.allenstudio.ir.core.plugins.CommonNote();
    var58.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var62 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var58);
    com.allenstudio.ir.ui.StatusBar var63 = new com.allenstudio.ir.ui.StatusBar();
    boolean var64 = var63.isBackgroundSet();
    boolean var67 = var63.contains(10, 100);
    var63.revalidate();
    javax.swing.JToolTip var69 = var63.createToolTip();
    com.allenstudio.ir.ui.StatusBar var70 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var71 = var70.getRootPane();
    java.awt.Point var72 = var70.location();
    com.allenstudio.ir.ui.StatusBar var73 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var74 = var73.getRootPane();
    java.awt.Point var75 = var73.location();
    com.allenstudio.ir.ui.Toolbar var76 = new com.allenstudio.ir.ui.Toolbar();
    boolean var77 = var76.isFloatable();
    java.awt.Component var79 = var76.getComponentAtIndex(10);
    java.lang.Object var80 = var73.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var81 = var73.getMaximumSize();
    var70.setMinimumSize(var81);
    java.awt.Rectangle var83 = var70.getBounds();
    var63.scrollRectToVisible(var83);
    var58.repaint(var83);
    var54.setMaximizedBounds(var83);
    var16.scrollRectToVisible(var83);
    var7.scrollRectToVisible(var83);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var83);
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
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
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
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test236");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    boolean var2 = var0.isLightweight();
    java.awt.Dimension var3 = var0.getMaximumSize();
    java.awt.event.KeyListener[] var4 = var0.getKeyListeners();
    boolean var5 = var0.getInheritsPopupMenu();
    var0.firePropertyChange("", 100, (-1));
    java.awt.Dimension var10 = var0.size();
    
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
    assertNotNull(var10);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test237");


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
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var52 = var51.getColorModel();
    java.awt.im.InputContext var53 = var51.getInputContext();
    java.awt.Component var55 = var51.getComponentAtIndex(0);
    boolean var56 = var51.isManagingFocus();
    var0.setGlassPane((java.awt.Component)var51);
    float var58 = var0.getOpacity();
    com.allenstudio.ir.ui.MainFrame var59 = new com.allenstudio.ir.ui.MainFrame();
    boolean var60 = var59.isShowing();
    int var61 = var59.countComponents();
    var59.setAutoRequestFocus(false);
    javax.swing.JMenuBar var64 = var59.getJMenuBar();
    boolean var65 = var64.isBorderPainted();
    com.allenstudio.ir.ui.StatusBar var66 = new com.allenstudio.ir.ui.StatusBar();
    int var67 = var66.getY();
    boolean var68 = var66.isLightweight();
    java.awt.Dimension var69 = var66.getMaximumSize();
    java.awt.event.KeyListener[] var70 = var66.getKeyListeners();
    boolean var71 = var66.getInheritsPopupMenu();
    var66.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var66.repaint(100L, 100, 1, 100, (-1));
    boolean var82 = var66.isOpaque();
    var64.setSelected((java.awt.Component)var66);
    var0.setJMenuBar(var64);
    var0.setBounds(6, 556, 5, 6);
    java.awt.event.WindowStateListener[] var90 = var0.getWindowStateListeners();
    
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test238");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    var0.writeBack();
    var0.writeBack();
    java.util.Enumeration var3 = var0.propertyNames();
    var0.readIn();
    com.allenstudio.ir.ui.StatusBar var5 = new com.allenstudio.ir.ui.StatusBar();
    var5.enable();
    javax.swing.KeyStroke[] var7 = var5.getRegisteredKeyStrokes();
    boolean var8 = var0.equals((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test239");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    int var5 = var4.getIndexInList();
    java.awt.Dimension var6 = var4.getMaximumSize();
    java.awt.LayoutManager var7 = var4.getLayout();
    java.awt.event.ContainerListener[] var8 = var4.getContainerListeners();
    var4.transferFocusBackward();
    var4.setSelected(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test240");


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
    int var41 = var16.count();
    
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
    assertTrue(var41 == 1);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test241");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    boolean var2 = var0.isAlwaysOnTopSupported();
    java.awt.Color var3 = var0.getBackground();
    var0.repaint(100L, 100, 1, 1, 0);
    java.awt.im.InputContext var10 = var0.getInputContext();
    boolean var11 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test242");


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
    com.allenstudio.ir.ui.MainFrame var22 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var23 = var22.getWarningString();
    java.awt.Rectangle var24 = var22.getMaximizedBounds();
    java.awt.MenuBar var25 = var22.getMenuBar();
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
    var22.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var26);
    java.awt.event.ComponentListener[] var54 = var26.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var55 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var56 = var55.getDateBackground();
    var55.setYearMonth(1, (-1));
    java.util.Calendar var60 = var55.getSelectedDate();
    var26.remove((java.awt.Component)var55);
    var55.setMarked(1, true);
    var0.addMouseMotionListener((java.awt.event.MouseMotionListener)var55);
    javax.accessibility.AccessibleContext var66 = var0.getAccessibleContext();
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test243");


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
    java.awt.Dimension var41 = var0.getPreferredScrollableViewportSize();
    com.allenstudio.ir.ui.Toolbar var42 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var43 = var42.getColorModel();
    var42.setEnabled(true);
    java.awt.Component var47 = var42.getComponentAtIndex(1);
    boolean var48 = var42.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var49 = var42.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var51 = var42.getPropertyChangeListeners("Date Picker");
    boolean var52 = var42.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var53 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var42.removeMouseListener((java.awt.event.MouseListener)var53);
    boolean var57 = var42.contains(4, 1);
    javax.swing.JToolTip var58 = var42.createToolTip();
    com.allenstudio.ir.ui.StatusBar var59 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var60 = var59.getRootPane();
    java.awt.Point var61 = var59.location();
    com.allenstudio.ir.ui.Toolbar var62 = new com.allenstudio.ir.ui.Toolbar();
    boolean var63 = var62.isFloatable();
    java.awt.Component var65 = var62.getComponentAtIndex(10);
    java.lang.Object var66 = var59.getClientProperty((java.lang.Object)10);
    var59.setFocusTraversalPolicyProvider(false);
    boolean var69 = var59.isManagingFocus();
    java.awt.Rectangle var70 = var59.bounds();
    var42.repaint(var70);
    var0.repaint(var70);
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test244");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.awt.event.FocusListener[] var2 = var0.getFocusListeners();
    java.awt.Rectangle var3 = var0.getMaximizedBounds();
    com.allenstudio.ir.ui.Toolbar var4 = new com.allenstudio.ir.ui.Toolbar();
    boolean var5 = var4.isFloatable();
    var4.setAutoscrolls(true);
    boolean var8 = var4.isCursorSet();
    var0.setGlassPane((java.awt.Component)var4);
    var4.invalidate();
    java.awt.peer.ComponentPeer var11 = var4.getPeer();
    
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
    assertNull(var11);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test245");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    com.allenstudio.ir.core.plugins.CommonNote var51 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var52 = var51.getDescription();
    int var54 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var51, 4);
    int var55 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var52.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test246");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    char[] var2 = new char[] { 'a'};
    var0.ignorableWhitespace(var2, 0, (-1));
    com.allenstudio.ir.util.XmlIO var6 = new com.allenstudio.ir.util.XmlIO();
    var6.errorDialog("hi!");
    char[] var11 = new char[] { 'a', '4'};
    var6.ignorableWhitespace(var11, 100, 0);
    var0.ignorableWhitespace(var11, 10, 0);
    var0.errorDialog("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    var0.errorDialog("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    var0.endPrefixMapping("frame2");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test247");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.setWeekStartOnSunday(true);
    java.awt.Color var3 = var0.getDateForeground();
    java.awt.Color var4 = var0.getHeaderBackground();
    var0.move(4, 556);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var8 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var8.setWeekStartOnSunday(true);
    int var11 = var8.getMonth();
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    boolean var13 = var12.isBackgroundSet();
    boolean var16 = var12.contains(10, 100);
    var12.revalidate();
    javax.swing.JToolTip var18 = var12.createToolTip();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    var19.enable();
    boolean var21 = var19.isFocusOwner();
    var19.firePropertyChange("hi!", 10L, 0L);
    var19.layout();
    java.awt.Dimension var27 = var19.getMaximumSize();
    java.awt.Dimension var28 = var12.getSize(var27);
    var8.setPreferredSize(var28);
    var0.setCellDimension(var28);
    com.allenstudio.ir.ui.Toolbar var31 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var32 = var31.getColorModel();
    var31.setEnabled(true);
    java.awt.Component var36 = var31.getComponentAtIndex(1);
    boolean var37 = var31.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var38 = var31.getFocusTraversalPolicy();
    var31.enable();
    java.awt.Dimension var40 = var31.getMinimumSize();
    var0.setCellDimension(var40);
    java.awt.Dimension var42 = var0.getCellDimension();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test248");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    boolean var1 = var0.isBackgroundSet();
    boolean var4 = var0.contains(10, 100);
    var0.revalidate();
    javax.swing.JToolTip var6 = var0.createToolTip();
    var6.move(556, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test249");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
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
    boolean var32 = var0.isAncestorOf((java.awt.Component)var4);
    var0.setRollover(false);
    java.awt.LayoutManager var35 = var0.getLayout();
    com.allenstudio.ir.ui.Toolbar var36 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var37 = var36.getColorModel();
    var36.setEnabled(true);
    java.awt.Component var41 = var36.getComponentAtIndex(1);
    boolean var42 = var36.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var43 = var36.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var45 = var36.getPropertyChangeListeners("Date Picker");
    boolean var46 = var36.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var47 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var36.removeMouseListener((java.awt.event.MouseListener)var47);
    var47.setMonth(4);
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    boolean var52 = var51.isFloatable();
    var51.show();
    java.awt.image.ColorModel var54 = var51.getColorModel();
    boolean var55 = var51.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var56 = new com.allenstudio.ir.ui.DatePickerPane();
    var56.transferFocus();
    com.allenstudio.ir.ui.Toolbar var58 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var59 = var58.getColorModel();
    var58.setEnabled(true);
    java.awt.Component var63 = var58.getComponentAtIndex(1);
    boolean var64 = var58.isFloatable();
    var56.setContent((java.awt.Component)var58);
    java.awt.Font var66 = var56.getFont();
    java.awt.FontMetrics var67 = var51.getFontMetrics(var66);
    var47.setHeaderFont(var66);
    com.allenstudio.ir.ui.DatePickerPane var69 = new com.allenstudio.ir.ui.DatePickerPane();
    var69.transferFocus();
    com.allenstudio.ir.ui.Toolbar var71 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var72 = var71.getColorModel();
    var71.setEnabled(true);
    java.awt.Component var76 = var71.getComponentAtIndex(1);
    boolean var77 = var71.isFloatable();
    var69.setContent((java.awt.Component)var71);
    java.awt.Color var79 = var71.getForeground();
    boolean var80 = var71.requestFocusInWindow();
    javax.swing.ActionMap var81 = var71.getActionMap();
    var71.repaint(1L);
    var71.validate();
    com.allenstudio.ir.core.plugins.CommonNote var85 = new com.allenstudio.ir.core.plugins.CommonNote();
    boolean var86 = var85.isPaintingTile();
    com.allenstudio.ir.ui.Toolbar var87 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var88 = var87.getColorModel();
    java.awt.im.InputContext var89 = var87.getInputContext();
    java.awt.Component var91 = var87.getComponent(0);
    java.awt.Font var92 = var87.getFont();
    java.awt.FontMetrics var93 = var85.getFontMetrics(var92);
    java.awt.FontMetrics var94 = var71.getFontMetrics(var92);
    var47.setHeaderFont(var92);
    var0.setNextFocusableComponent((java.awt.Component)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test250");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    java.awt.Image var8 = var0.getIconImage();
    java.awt.Dimension var9 = var0.getMinimumSize();
    java.awt.Dialog.ModalExclusionType var10 = var0.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test251");


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
    javax.swing.JPopupMenu var15 = var11.getComponentPopupMenu();
    java.awt.Color var16 = var11.getDateBackground();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test252");


    com.allenstudio.ir.core.ConfigurationManager var0 = com.allenstudio.ir.core.ConfigurationManager.getInstance();
    var0.readIn();
    var0.writeBack();
    java.util.Enumeration var3 = var0.propertyNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test253");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    int var1 = var0.getY();
    javax.swing.JToolTip var2 = var0.createToolTip();
    float var3 = var2.getAlignmentY();
    java.awt.Color var4 = var2.getForeground();
    boolean var5 = var2.isMaximumSizeSet();
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var7 = var6.getWarningString();
    java.lang.String var8 = var6.getWarningString();
    var6.toFront();
    java.awt.im.InputContext var10 = var6.getInputContext();
    java.awt.Graphics var11 = var6.getGraphics();
    var6.setAutoRequestFocus(true);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var14 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.event.MouseMotionListener[] var15 = var14.getMouseMotionListeners();
    var6.addMouseMotionListener((java.awt.event.MouseMotionListener)var14);
    var2.removeMouseMotionListener((java.awt.event.MouseMotionListener)var14);
    var2.transferFocusUpCycle();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test254");


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
    boolean var17 = var11.requestDefaultFocus();
    com.allenstudio.ir.ui.Toolbar var18 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var19 = var18.getColorModel();
    var18.setEnabled(true);
    java.awt.Component var23 = var18.getComponentAtIndex(1);
    boolean var24 = var18.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var25 = var18.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var27 = var18.getPropertyChangeListeners("Date Picker");
    boolean var28 = var18.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var29 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var18.removeMouseListener((java.awt.event.MouseListener)var29);
    boolean var31 = var29.getWeekStartOnSunday();
    int var32 = var29.getSelectedDay();
    javax.swing.JComponent var33 = var29.getHeaderComponent();
    java.awt.Color var34 = var29.getHighlightBackground();
    java.awt.Color var35 = var29.getDateBackground();
    var11.setForeground(var35);
    
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
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test255");


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
      java.lang.String var9 = var4.getTitleAt(556);
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

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test256");


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
    com.allenstudio.ir.ui.NoteListsTabPane var27 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    boolean var29 = var28.isFloatable();
    var28.show();
    java.awt.image.ColorModel var31 = var28.getColorModel();
    boolean var32 = var28.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    var33.transferFocus();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.isFloatable();
    var33.setContent((java.awt.Component)var35);
    java.awt.Dimension var43 = var33.size();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    boolean var45 = var44.isFloatable();
    var44.show();
    boolean var47 = var44.isRequestFocusEnabled();
    java.awt.Dimension var48 = var44.minimumSize();
    var33.setToolBar((javax.swing.JToolBar)var44);
    java.awt.Image var52 = var33.createImage(10, (-1));
    var27.add((java.awt.Component)var28, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var54 = new com.allenstudio.ir.ui.Toolbar();
    boolean var55 = var54.isFloatable();
    java.awt.Component var57 = var54.getComponentAtIndex(10);
    boolean var58 = var54.isLightweight();
    java.awt.Component var59 = var27.add((java.awt.Component)var54);
    com.allenstudio.ir.ui.NoteListsTabPane var60 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    boolean var62 = var61.isFloatable();
    var61.show();
    java.awt.image.ColorModel var64 = var61.getColorModel();
    boolean var65 = var61.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var66 = new com.allenstudio.ir.ui.DatePickerPane();
    var66.transferFocus();
    com.allenstudio.ir.ui.Toolbar var68 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var69 = var68.getColorModel();
    var68.setEnabled(true);
    java.awt.Component var73 = var68.getComponentAtIndex(1);
    boolean var74 = var68.isFloatable();
    var66.setContent((java.awt.Component)var68);
    java.awt.Dimension var76 = var66.size();
    com.allenstudio.ir.ui.Toolbar var77 = new com.allenstudio.ir.ui.Toolbar();
    boolean var78 = var77.isFloatable();
    var77.show();
    boolean var80 = var77.isRequestFocusEnabled();
    java.awt.Dimension var81 = var77.minimumSize();
    var66.setToolBar((javax.swing.JToolBar)var77);
    java.awt.Image var85 = var66.createImage(10, (-1));
    var60.add((java.awt.Component)var61, (java.lang.Object)10);
    var60.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var89 = var60.getUI();
    javax.swing.SingleSelectionModel var90 = var60.getModel();
    var27.setModel(var90);
    var0.setModel(var90);
    var0.reshape(6, 556, 10, 4);
    boolean var98 = var0.isForegroundSet();
    
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == true);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test257");


    com.allenstudio.ir.util.XmlIO var0 = new com.allenstudio.ir.util.XmlIO();
    var0.unparsedEntityDecl("", "hi!", "", "");
    var0.skippedEntity("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    var0.endDocument();

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test258");


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
    com.allenstudio.ir.ui.StatusBar var13 = new com.allenstudio.ir.ui.StatusBar();
    int var14 = var13.getY();
    javax.swing.JToolTip var15 = var13.createToolTip();
    javax.swing.JToolTip var16 = var15.createToolTip();
    float var17 = var15.getAlignmentX();
    int var18 = var0.getComponentIndex((java.awt.Component)var15);
    boolean var19 = var0.isFocusTraversalPolicySet();
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test259");


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
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var19 = var17.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var22 = var19.addSubElement("", "hi!");
    java.util.Hashtable var23 = var22.getAttributes();
    com.allenstudio.ir.ui.Toolbar var24 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var25 = var24.getColorModel();
    var24.setEnabled(true);
    java.awt.ComponentOrientation var28 = var24.getComponentOrientation();
    java.lang.Object var29 = var8.put((java.lang.Object)var23, (java.lang.Object)var28);
    com.allenstudio.ir.util.XmlElement var30 = new com.allenstudio.ir.util.XmlElement(" ", var8);
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement("frame2", var8);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test260");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    var0.show();
    java.awt.Dimension var9 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test261");


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
    java.awt.Component var21 = var0.getGlassPane();
    int var24 = var0.getBaseline(100, 2015);
    
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
    assertTrue(var24 == (-1));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test262");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    java.awt.Component var3 = var0.getComponentAtIndex(10);
    var0.transferFocusUpCycle();
    var0.repaint(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test263");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    boolean var7 = var0.isVisible();
    java.util.Set var9 = var0.getFocusTraversalKeys(0);
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var11 = var10.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var12 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var13 = var12.getColorModel();
    java.awt.im.InputContext var14 = var12.getInputContext();
    java.awt.Component var16 = var12.getComponentAtIndex(0);
    var10.setToolBar((javax.swing.JToolBar)var12);
    javax.swing.border.Border var18 = var10.getContentPaneBorder();
    java.awt.Dimension var19 = var10.preferredSize();
    var0.setPreferredSize(var19);
    var0.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test264");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    boolean var1 = var0.isFloatable();
    var0.setAutoscrolls(true);
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
    boolean var32 = var0.isAncestorOf((java.awt.Component)var4);
    var0.setRollover(false);
    java.awt.im.InputContext var35 = var0.getInputContext();
    java.lang.Object var36 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test265");


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
    javax.accessibility.AccessibleContext var31 = var0.getAccessibleContext();
    com.allenstudio.ir.ui.StatusBar var32 = new com.allenstudio.ir.ui.StatusBar();
    int var33 = var32.getY();
    boolean var34 = var32.isLightweight();
    java.awt.Dimension var35 = var32.getMaximumSize();
    java.awt.event.KeyListener[] var36 = var32.getKeyListeners();
    boolean var37 = var32.getInheritsPopupMenu();
    var32.firePropertyChange("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", 100.0d, 100.0d);
    var32.repaint(100L, 100, 1, 100, (-1));
    javax.swing.InputMap var48 = var32.getInputMap();
    java.awt.Dimension var49 = var32.getMinimumSize();
    var0.resize(var49);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(2015);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test266");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    int var2 = var0.countComponents();
    var0.setAutoRequestFocus(false);
    javax.swing.JMenuBar var5 = var0.getJMenuBar();
    boolean var6 = var5.isBorderPainted();
    var5.menuSelectionChanged(true);
    java.lang.String var9 = var5.getUIClassID();
    com.allenstudio.ir.ui.NoteListsTabPane var10 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    java.awt.image.ColorModel var14 = var11.getColorModel();
    boolean var15 = var11.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var16 = new com.allenstudio.ir.ui.DatePickerPane();
    var16.transferFocus();
    com.allenstudio.ir.ui.Toolbar var18 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var19 = var18.getColorModel();
    var18.setEnabled(true);
    java.awt.Component var23 = var18.getComponentAtIndex(1);
    boolean var24 = var18.isFloatable();
    var16.setContent((java.awt.Component)var18);
    java.awt.Dimension var26 = var16.size();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    var27.show();
    boolean var30 = var27.isRequestFocusEnabled();
    java.awt.Dimension var31 = var27.minimumSize();
    var16.setToolBar((javax.swing.JToolBar)var27);
    java.awt.Image var35 = var16.createImage(10, (-1));
    var10.add((java.awt.Component)var11, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    boolean var38 = var37.isFloatable();
    java.awt.Component var40 = var37.getComponentAtIndex(10);
    boolean var41 = var37.isLightweight();
    java.awt.Component var42 = var10.add((java.awt.Component)var37);
    com.allenstudio.ir.ui.NoteListsTabPane var43 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    boolean var45 = var44.isFloatable();
    var44.show();
    java.awt.image.ColorModel var47 = var44.getColorModel();
    boolean var48 = var44.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var49 = new com.allenstudio.ir.ui.DatePickerPane();
    var49.transferFocus();
    com.allenstudio.ir.ui.Toolbar var51 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var52 = var51.getColorModel();
    var51.setEnabled(true);
    java.awt.Component var56 = var51.getComponentAtIndex(1);
    boolean var57 = var51.isFloatable();
    var49.setContent((java.awt.Component)var51);
    java.awt.Dimension var59 = var49.size();
    com.allenstudio.ir.ui.Toolbar var60 = new com.allenstudio.ir.ui.Toolbar();
    boolean var61 = var60.isFloatable();
    var60.show();
    boolean var63 = var60.isRequestFocusEnabled();
    java.awt.Dimension var64 = var60.minimumSize();
    var49.setToolBar((javax.swing.JToolBar)var60);
    java.awt.Image var68 = var49.createImage(10, (-1));
    var43.add((java.awt.Component)var44, (java.lang.Object)10);
    var43.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var72 = var43.getUI();
    javax.swing.SingleSelectionModel var73 = var43.getModel();
    var10.setModel(var73);
    javax.accessibility.AccessibleContext var75 = var10.getAccessibleContext();
    var10.setDoubleBuffered(false);
    int var78 = var5.getComponentIndex((java.awt.Component)var10);
    int var80 = var10.indexOfTab("ToolBarUI");
    
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
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test267");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.event.AncestorListener[] var1 = var0.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test268");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.beans.VetoableChangeListener[] var1 = var0.getVetoableChangeListeners();
    boolean var2 = var0.isPreferredSizeSet();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    int var4 = var3.getY();
    javax.swing.JToolTip var5 = var3.createToolTip();
    float var6 = var5.getAlignmentY();
    java.awt.Color var7 = var5.getForeground();
    boolean var8 = var5.isDisplayable();
    java.awt.Dimension var9 = var5.getPreferredSize();
    java.awt.Dimension var10 = var0.getSize(var9);
    int var11 = var0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test269");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    java.awt.Color var10 = var2.getForeground();
    boolean var11 = var2.isRollover();
    
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

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test270");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var12 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var14 = var12.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var17 = var14.addSubElement("", "hi!");
    java.util.Hashtable var18 = var17.getAttributes();
    com.allenstudio.ir.ui.MainFrame var19 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var20 = var19.getWarningString();
    java.awt.Rectangle var21 = var19.getMaximizedBounds();
    java.awt.MenuBar var22 = var19.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var23 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var19.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var23);
    var19.dispose();
    java.lang.Object var26 = var18.get((java.lang.Object)var19);
    java.util.Set var27 = var18.entrySet();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement("Title", var18);
    boolean var29 = var18.isEmpty();
    var2.setAttributes(var18);
    java.lang.String var31 = var18.toString();
    boolean var32 = var18.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "{}"+ "'", var31.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test271");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.util.Locale var2 = var0.getLocale();
    com.allenstudio.ir.ui.calendar.DateChooser var3 = new com.allenstudio.ir.ui.calendar.DateChooser();
    var3.setSize(0, (-1));
    javax.swing.event.AncestorListener[] var7 = var3.getAncestorListeners();
    var0.setLocationRelativeTo((java.awt.Component)var3);
    com.allenstudio.ir.ui.DatePickerPane var9 = new com.allenstudio.ir.ui.DatePickerPane();
    var9.transferFocus();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var12 = var11.getColorModel();
    var11.setEnabled(true);
    java.awt.Component var16 = var11.getComponentAtIndex(1);
    boolean var17 = var11.isFloatable();
    var9.setContent((java.awt.Component)var11);
    java.awt.Dimension var19 = var9.size();
    var0.setSize(var19);
    com.allenstudio.ir.ui.DatePickerPane var21 = new com.allenstudio.ir.ui.DatePickerPane();
    var21.transferFocus();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var24 = var23.getColorModel();
    var23.setEnabled(true);
    java.awt.Component var28 = var23.getComponentAtIndex(1);
    boolean var29 = var23.isFloatable();
    var21.setContent((java.awt.Component)var23);
    var21.setSelected(true);
    var21.resize(0, 1);
    boolean var36 = var21.isFocusTraversalPolicySet();
    com.allenstudio.ir.ui.StatusBar var37 = new com.allenstudio.ir.ui.StatusBar();
    var37.enable();
    com.allenstudio.ir.ui.StatusBar var39 = new com.allenstudio.ir.ui.StatusBar();
    int var40 = var39.getY();
    javax.swing.JToolTip var41 = var39.createToolTip();
    javax.swing.JToolTip var42 = var41.createToolTip();
    boolean var43 = var42.isFocusable();
    com.allenstudio.ir.ui.StatusBar var44 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var45 = var44.getRootPane();
    java.awt.Point var46 = var44.location();
    com.allenstudio.ir.ui.Toolbar var47 = new com.allenstudio.ir.ui.Toolbar();
    boolean var48 = var47.isFloatable();
    java.awt.Component var50 = var47.getComponentAtIndex(10);
    java.lang.Object var51 = var44.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var52 = var44.getMaximumSize();
    var42.resize(var52);
    int var54 = var42.getY();
    com.allenstudio.ir.ui.StatusBar var55 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var56 = new com.allenstudio.ir.core.plugins.CommonNote();
    var56.setFocusTraversalPolicyProvider(false);
    var55.remove((java.awt.Component)var56);
    com.allenstudio.ir.ui.StatusBar var60 = new com.allenstudio.ir.ui.StatusBar();
    int var61 = var60.getY();
    javax.swing.JToolTip var62 = var60.createToolTip();
    java.awt.Insets var63 = var62.getInsets();
    java.awt.Insets var64 = var56.getInsets(var63);
    java.awt.Insets var65 = var42.getInsets(var64);
    java.awt.Insets var66 = var37.getInsets(var65);
    com.allenstudio.ir.ui.DatePickerPane var67 = new com.allenstudio.ir.ui.DatePickerPane();
    var67.transferFocus();
    com.allenstudio.ir.ui.Toolbar var69 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var70 = var69.getColorModel();
    var69.setEnabled(true);
    java.awt.Component var74 = var69.getComponentAtIndex(1);
    boolean var75 = var69.isFloatable();
    var67.setContent((java.awt.Component)var69);
    var67.setSelected(true);
    var67.resize(0, 1);
    java.awt.Rectangle var82 = var67.getBounds();
    java.awt.Point var83 = var67.location();
    java.awt.Point var84 = var37.getLocation(var83);
    java.awt.Point var85 = var21.getLocation(var84);
    java.awt.Point var86 = var0.getLocation(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test272");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var0.toBack();
    java.awt.Dimension var7 = var0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test273");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    boolean var10 = var8.isAlwaysOnTopSupported();
    var8.setTitle("ToolBarUI");
    java.awt.Container var13 = var8.getContentPane();
    var8.toBack();
    com.allenstudio.ir.ui.MainFrame var15 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var16 = var15.getWarningString();
    java.lang.String var17 = var15.getWarningString();
    var15.toFront();
    java.awt.im.InputContext var19 = var15.getInputContext();
    java.awt.Graphics var20 = var15.getGraphics();
    javax.swing.JLayeredPane var21 = var15.getLayeredPane();
    var8.setLayeredPane(var21);
    boolean var23 = var8.isEnabled();
    int var24 = var0.getComponentIndex((java.awt.Component)var8);
    boolean var25 = var8.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test274");


    com.allenstudio.ir.core.PluginManager var0 = com.allenstudio.ir.core.PluginManager.getInstance();
    java.lang.String[] var1 = var0.getAllPluginNames();
    java.lang.String[] var2 = var0.getPlugins();
    java.lang.String[] var3 = var0.getPlugins();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test275");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.calendar.DateChooser var2 = var0.getDateChooser();
    var0.setOpaque(true);
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var6 = var5.getColorModel();
    var5.setEnabled(true);
    java.awt.Component var10 = var5.getComponentAtIndex(1);
    boolean var11 = var5.isFloatable();
    java.lang.String var12 = var5.toString();
    com.allenstudio.ir.ui.Toolbar var13 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var14 = var13.getMouseWheelListeners();
    java.awt.event.MouseListener[] var15 = var13.getMouseListeners();
    var13.firePropertyChange("", false, true);
    var5.add((java.awt.Component)var13, (java.lang.Object)10.0f);
    var0.setToolBar((javax.swing.JToolBar)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test276");


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
    java.awt.event.MouseWheelListener[] var16 = var15.getMouseWheelListeners();
    java.awt.event.MouseListener[] var17 = var15.getMouseListeners();
    com.allenstudio.ir.ui.MainFrame var18 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var19 = var18.getWarningString();
    java.lang.String var20 = var18.getWarningString();
    java.awt.Container var21 = var18.getFocusCycleRootAncestor();
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
    var18.setMaximizedBounds(var42);
    float var45 = var18.getAlignmentX();
    com.allenstudio.ir.ui.StatusBar var46 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var47 = var46.getRootPane();
    java.awt.Point var48 = var46.location();
    boolean var49 = var46.isManagingFocus();
    java.awt.Rectangle var50 = var46.bounds();
    var18.setMaximizedBounds(var50);
    java.awt.Rectangle var52 = var15.getBounds(var50);
    var11.setBounds(var50);
    javax.swing.InputMap var54 = var11.getInputMap();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
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
    assertTrue(var45 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test277");


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
    java.awt.Dimension var41 = var0.getPreferredScrollableViewportSize();
    int var42 = var0.getSelectedIndex();
    
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
    assertTrue(var42 == 0);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test278");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    java.lang.String var4 = var0.getOtherInfo();
    javax.swing.event.AncestorListener[] var5 = var0.getAncestorListeners();
    var0.setDebugGraphicsOptions(32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test279");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var1 = var0.getContentPane();
    var0.setIgnoreRepaint(true);
    boolean var4 = var0.isSelected();
    java.lang.String var5 = var0.getUIClassID();
    javax.swing.Icon var6 = var0.getFrameIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "PanelUI"+ "'", var5.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test280");


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
    var2.removeAllElements();
    java.lang.String var24 = var2.getAttribute("Inspirento - alpha 0.86");
    
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
    assertNull(var24);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test281");


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
    boolean var21 = var0.isAlwaysOnTopSupported();
    java.awt.Component var24 = var0.findComponentAt(0, 0);
    
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
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test282");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    boolean var2 = var0.isFocusTraversalPolicySet();
    var0.setFocusCycleRoot(false);
    float var5 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test283");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var2 = new com.allenstudio.ir.core.plugins.CommonNote();
    var2.setFocusTraversalPolicyProvider(false);
    var1.remove((java.awt.Component)var2);
    com.allenstudio.ir.ui.StatusBar var6 = new com.allenstudio.ir.ui.StatusBar();
    int var7 = var6.getY();
    javax.swing.JToolTip var8 = var6.createToolTip();
    java.awt.Insets var9 = var8.getInsets();
    java.awt.Insets var10 = var2.getInsets(var9);
    int var11 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var2);
    com.allenstudio.ir.core.plugins.CommonNote var12 = new com.allenstudio.ir.core.plugins.CommonNote();
    var12.resize(0, 1);
    var12.setFocusCycleRoot(false);
    float var18 = var12.getAlignmentY();
    int var19 = var0.lastIndexOf((com.allenstudio.ir.core.plugins.AbstractNote)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.core.plugins.AbstractNote var21 = var0.getElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test284");


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
    com.allenstudio.ir.util.XmlElement var18 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var20 = var18.addSubElement("hi!");
    java.lang.String var22 = var18.getAttribute("C:\\boot.ini");
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
    com.allenstudio.ir.util.XmlElement var40 = var18.addSubElement(var34);
    boolean var41 = var0.addElement(var40);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
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
    assertTrue(var41 == true);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test285");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.setWeekStartOnSunday(true);
    com.allenstudio.ir.ui.DatePickerPane var3 = new com.allenstudio.ir.ui.DatePickerPane();
    var3.transferFocus();
    com.allenstudio.ir.ui.Toolbar var5 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var6 = var5.getColorModel();
    var5.setEnabled(true);
    java.awt.Component var10 = var5.getComponentAtIndex(1);
    boolean var11 = var5.isFloatable();
    var3.setContent((java.awt.Component)var5);
    java.awt.Color var13 = var5.getForeground();
    boolean var14 = var5.requestFocusInWindow();
    javax.swing.ActionMap var15 = var5.getActionMap();
    var5.repaint(1L);
    var5.validate();
    com.allenstudio.ir.core.plugins.CommonNote var19 = new com.allenstudio.ir.core.plugins.CommonNote();
    boolean var20 = var19.isPaintingTile();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var22 = var21.getColorModel();
    java.awt.im.InputContext var23 = var21.getInputContext();
    java.awt.Component var25 = var21.getComponent(0);
    java.awt.Font var26 = var21.getFont();
    java.awt.FontMetrics var27 = var19.getFontMetrics(var26);
    java.awt.FontMetrics var28 = var5.getFontMetrics(var26);
    var0.setHeaderFont(var26);
    var0.setYearMonth(100, (-1));
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
    var35.setDoubleBuffered(true);
    com.allenstudio.ir.ui.Toolbar var47 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var48 = var47.getColorModel();
    var47.setEnabled(true);
    java.awt.Component var52 = var47.getComponentAtIndex(1);
    java.awt.Component var54 = var47.getComponentAtIndex(1);
    java.awt.event.InputMethodListener[] var55 = var47.getInputMethodListeners();
    com.allenstudio.ir.ui.Toolbar var56 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.Dimension var57 = var56.size();
    java.awt.Dimension var58 = var47.getSize(var57);
    var35.addSeparator(var58);
    javax.swing.border.Border var60 = var35.getBorder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setBorder(var60);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
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
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test286");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    com.allenstudio.ir.core.plugins.CommonNote var51 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var52 = var51.getDescription();
    int var54 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var51, 4);
    com.allenstudio.ir.core.plugins.AbstractNote[] var55 = var0.toArray();
    com.allenstudio.ir.core.plugins.CommonNote var57 = new com.allenstudio.ir.core.plugins.CommonNote();
    var57.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var61 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var57);
    java.lang.String var62 = var57.getFeature();
    java.lang.String var63 = var57.getFeature();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.core.plugins.AbstractNote var64 = var0.set(31, (com.allenstudio.ir.core.plugins.AbstractNote)var57);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var52.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "C:\\boot.ini"+ "'", var62.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "C:\\boot.ini"+ "'", var63.equals("C:\\boot.ini"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test287");


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
    int var24 = var5.getMenuCount();
    java.awt.Component var25 = var5.getComponent();
    var5.addNotify();
    var5.removeNotify();
    
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
    assertTrue(var24 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test288");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    var0.setAutoRequestFocus(false);
    var0.setTitle("PanelUI");
    var0.setVisible(true);
    java.awt.Image var8 = var0.getIconImage();
    javax.accessibility.AccessibleContext var9 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test289");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var7 = var0.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners("Date Picker");
    var0.setDoubleBuffered(false);
    boolean var14 = var0.contains(2015, (-1));
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var15 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    boolean var16 = var15.isMaximumSizeSet();
    var15.setMarked(5, true);
    boolean var20 = var0.isFocusCycleRoot((java.awt.Container)var15);
    
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
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test290");


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
    java.awt.Image var27 = var0.getIconImage();
    java.awt.Font var28 = var0.getFont();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test291");


    com.allenstudio.ir.ui.NoteListsTabPane var0 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.setSelectedIndex(1);
    com.allenstudio.ir.core.plugins.CommonNote var3 = new com.allenstudio.ir.core.plugins.CommonNote();
    var3.setFocusTraversalPolicyProvider(false);
    int var6 = var3.getY();
    int var7 = var0.indexOfComponent((java.awt.Component)var3);
    com.allenstudio.ir.ui.MainFrame var8 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var9 = var8.getWarningString();
    java.awt.Rectangle var10 = var8.getMaximizedBounds();
    java.awt.MenuBar var11 = var8.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var12 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var8.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var12);
    var12.setTabPlacement(1);
    int var18 = var12.indexAtLocation(10, (-1));
    boolean var19 = var12.isDisplayable();
    com.allenstudio.ir.ui.NoteListsTabPane var20 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var21 = new com.allenstudio.ir.ui.Toolbar();
    boolean var22 = var21.isFloatable();
    var21.show();
    java.awt.image.ColorModel var24 = var21.getColorModel();
    boolean var25 = var21.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var26 = new com.allenstudio.ir.ui.DatePickerPane();
    var26.transferFocus();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var29 = var28.getColorModel();
    var28.setEnabled(true);
    java.awt.Component var33 = var28.getComponentAtIndex(1);
    boolean var34 = var28.isFloatable();
    var26.setContent((java.awt.Component)var28);
    java.awt.Dimension var36 = var26.size();
    com.allenstudio.ir.ui.Toolbar var37 = new com.allenstudio.ir.ui.Toolbar();
    boolean var38 = var37.isFloatable();
    var37.show();
    boolean var40 = var37.isRequestFocusEnabled();
    java.awt.Dimension var41 = var37.minimumSize();
    var26.setToolBar((javax.swing.JToolBar)var37);
    java.awt.Image var45 = var26.createImage(10, (-1));
    var20.add((java.awt.Component)var21, (java.lang.Object)10);
    var20.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var49 = var20.getUI();
    javax.swing.SingleSelectionModel var50 = var20.getModel();
    var12.setModel(var50);
    var0.setModel(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test292");


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
    var0.repaint((-1L));
    var0.enable();
    
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

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test293");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    javax.swing.JComponent var1 = var0.getHeaderComponent();
    var0.setWeekStartOnSunday(true);
    com.allenstudio.ir.ui.Toolbar var4 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var5 = var4.getColorModel();
    var4.setEnabled(true);
    java.awt.Component var9 = var4.getComponentAtIndex(1);
    boolean var10 = var4.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var11 = var4.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var13 = var4.getPropertyChangeListeners("Date Picker");
    boolean var14 = var4.isFontSet();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var15 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var4.removeMouseListener((java.awt.event.MouseListener)var15);
    boolean var17 = var15.getWeekStartOnSunday();
    int var18 = var15.getSelectedDay();
    int var19 = var15.getYear();
    java.awt.Color var20 = var15.getDateBackground();
    var0.setHeaderForeground(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2015);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test294");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    int var8 = var0.getY();
    var0.updateUI();
    com.allenstudio.ir.ui.Toolbar var10 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var11 = var10.getColorModel();
    java.awt.im.InputContext var12 = var10.getInputContext();
    java.awt.Component var14 = var10.getComponentAtIndex(0);
    com.allenstudio.ir.ui.MainFrame var15 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var16 = var15.getWarningString();
    java.lang.String var17 = var15.getWarningString();
    java.awt.Container var18 = var15.getFocusCycleRootAncestor();
    com.allenstudio.ir.ui.StatusBar var19 = new com.allenstudio.ir.ui.StatusBar();
    boolean var20 = var19.isBackgroundSet();
    boolean var23 = var19.contains(10, 100);
    var19.revalidate();
    javax.swing.JToolTip var25 = var19.createToolTip();
    com.allenstudio.ir.ui.StatusBar var26 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var27 = var26.getRootPane();
    java.awt.Point var28 = var26.location();
    com.allenstudio.ir.ui.StatusBar var29 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var30 = var29.getRootPane();
    java.awt.Point var31 = var29.location();
    com.allenstudio.ir.ui.Toolbar var32 = new com.allenstudio.ir.ui.Toolbar();
    boolean var33 = var32.isFloatable();
    java.awt.Component var35 = var32.getComponentAtIndex(10);
    java.lang.Object var36 = var29.getClientProperty((java.lang.Object)10);
    java.awt.Dimension var37 = var29.getMaximumSize();
    var26.setMinimumSize(var37);
    java.awt.Rectangle var39 = var26.getBounds();
    var19.scrollRectToVisible(var39);
    var15.setMaximizedBounds(var39);
    float var42 = var15.getAlignmentX();
    com.allenstudio.ir.ui.StatusBar var43 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var44 = var43.getRootPane();
    java.awt.Point var45 = var43.location();
    boolean var46 = var43.isManagingFocus();
    java.awt.Rectangle var47 = var43.bounds();
    var15.setMaximizedBounds(var47);
    java.awt.Rectangle var49 = var10.getBounds(var47);
    var0.paintImmediately(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test295");


    com.allenstudio.ir.ui.calendar.DateChooser var0 = new com.allenstudio.ir.ui.calendar.DateChooser();
    boolean var2 = var0.requestFocus(false);
    var0.updateUI();
    boolean var4 = var0.getFocusTraversalKeysEnabled();
    com.allenstudio.ir.event.DateChooserListener var5 = var0.getDateChooserListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test296");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    com.allenstudio.ir.core.plugins.CommonNote var51 = new com.allenstudio.ir.core.plugins.CommonNote();
    var51.resize(0, 1);
    java.lang.String var55 = var51.getOtherInfo();
    javax.swing.event.AncestorListener[] var56 = var51.getAncestorListeners();
    boolean var57 = var0.removeElement((com.allenstudio.ir.core.plugins.AbstractNote)var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.core.plugins.AbstractNote var58 = var0.firstElement();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test297");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var0.toBack();
    java.awt.Color var7 = var0.getForeground();
    var0.setLocationByPlatform(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test298");


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
    int var35 = var4.indexOfTab("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test299");


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
    javax.swing.border.Border var42 = var34.getBorder();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test300");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    boolean var1 = var0.isShowing();
    java.lang.String var2 = var0.getWarningString();
    var0.setAutoRequestFocus(true);
    int var5 = var0.getDefaultCloseOperation();
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    boolean var7 = var6.isShowing();
    java.lang.String var8 = var6.getWarningString();
    java.awt.event.WindowFocusListener[] var9 = var6.getWindowFocusListeners();
    java.util.List var10 = var6.getIconImages();
    var0.setIconImages(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test301");


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
    com.allenstudio.ir.ui.StatusBar var68 = new com.allenstudio.ir.ui.StatusBar();
    int var69 = var68.getY();
    var68.setIgnoreRepaint(true);
    boolean var72 = var68.requestFocusInWindow();
    var68.removeAll();
    int var74 = var0.indexOfTabComponent((java.awt.Component)var68);
    int var75 = var0.getSelectedIndex();
    
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
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test302");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    com.allenstudio.ir.core.plugins.CommonNote var1 = new com.allenstudio.ir.core.plugins.CommonNote();
    var1.setFocusTraversalPolicyProvider(false);
    var0.remove((java.awt.Component)var1);
    java.awt.Graphics var5 = var1.getGraphics();
    java.lang.String var6 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var6.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test303");


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
    var0.firePropertyChange("frame3", 0.0f, 100.0f);
    com.allenstudio.ir.ui.MainFrame var18 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var19 = var18.getWarningString();
    java.awt.Rectangle var20 = var18.getMaximizedBounds();
    java.awt.MenuBar var21 = var18.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var22 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var18.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var22);
    javax.swing.JLayeredPane var24 = var18.getLayeredPane();
    var0.setContent((java.awt.Component)var24);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test304");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    java.awt.im.InputContext var2 = var0.getInputContext();
    java.awt.Component var4 = var0.getComponent(0);
    java.awt.LayoutManager var5 = var0.getLayout();
    var0.setEnabled(false);
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
    boolean var21 = var19.getWeekStartOnSunday();
    int var22 = var19.getSelectedDay();
    java.awt.Dimension var23 = var19.getCellDimension();
    java.awt.Dimension var24 = var0.getSize(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
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
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test305");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    var0.toFront();
    java.awt.im.InputContext var4 = var0.getInputContext();
    java.awt.Graphics var5 = var0.getGraphics();
    var0.setAutoRequestFocus(true);
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var8 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.event.MouseMotionListener[] var9 = var8.getMouseMotionListeners();
    var0.addMouseMotionListener((java.awt.event.MouseMotionListener)var8);
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.setAutoscrolls(true);
    com.allenstudio.ir.ui.DatePickerPane var15 = new com.allenstudio.ir.ui.DatePickerPane();
    var15.transferFocus();
    com.allenstudio.ir.ui.Toolbar var17 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var18 = var17.getColorModel();
    var17.setEnabled(true);
    java.awt.Component var22 = var17.getComponentAtIndex(1);
    boolean var23 = var17.isFloatable();
    var15.setContent((java.awt.Component)var17);
    java.awt.Font var25 = var15.getFont();
    java.awt.FontMetrics var26 = var11.getFontMetrics(var25);
    var8.setHeaderFont(var25);
    java.awt.Color var28 = var8.getHeaderForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test306");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    boolean var7 = var0.isVisible();
    java.util.Set var9 = var0.getFocusTraversalKeys(0);
    var0.firePropertyChange("Title", 1.0f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test307");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.allenstudio.ir.core.plugins.AbstractNote var2 = var0.getElementAt(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test308");


    com.allenstudio.ir.core.plugins.CommonNote var0 = new com.allenstudio.ir.core.plugins.CommonNote();
    var0.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var4 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var0);
    int var5 = var4.getIndexInList();
    java.awt.Dimension var6 = var4.getMaximumSize();
    java.awt.LayoutManager var7 = var4.getLayout();
    java.awt.event.ContainerListener[] var8 = var4.getContainerListeners();
    int var9 = var4.getIndexInList();
    com.allenstudio.ir.ui.DatePickerPane var10 = new com.allenstudio.ir.ui.DatePickerPane();
    java.awt.Container var11 = var10.getContentPane();
    java.awt.Container var12 = var10.getContentPane();
    boolean var13 = var4.isFocusCycleRoot((java.awt.Container)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test309");


    com.allenstudio.ir.ui.StatusBar var0 = new com.allenstudio.ir.ui.StatusBar();
    var0.enable();
    boolean var2 = var0.isFocusOwner();
    var0.firePropertyChange("hi!", 10L, 0L);
    var0.layout();
    var0.removeAll();
    java.awt.Color var9 = var0.getForeground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.areFocusTraversalKeysSet(4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test310");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    javax.swing.TransferHandler var6 = var0.getTransferHandler();
    java.lang.String var7 = var0.getTitle();
    com.allenstudio.ir.ui.StatusBar var8 = new com.allenstudio.ir.ui.StatusBar();
    int var9 = var8.getY();
    javax.swing.JToolTip var10 = var8.createToolTip();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.firePropertyChange("Date Picker", (byte)0, (byte)(-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var10, (java.lang.Object)var11);
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
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test311");


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
    var2.addSeparator(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
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

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test312");


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
    com.allenstudio.ir.ui.NoteListsTabPane var27 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var28 = new com.allenstudio.ir.ui.Toolbar();
    boolean var29 = var28.isFloatable();
    var28.show();
    java.awt.image.ColorModel var31 = var28.getColorModel();
    boolean var32 = var28.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var33 = new com.allenstudio.ir.ui.DatePickerPane();
    var33.transferFocus();
    com.allenstudio.ir.ui.Toolbar var35 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var36 = var35.getColorModel();
    var35.setEnabled(true);
    java.awt.Component var40 = var35.getComponentAtIndex(1);
    boolean var41 = var35.isFloatable();
    var33.setContent((java.awt.Component)var35);
    java.awt.Dimension var43 = var33.size();
    com.allenstudio.ir.ui.Toolbar var44 = new com.allenstudio.ir.ui.Toolbar();
    boolean var45 = var44.isFloatable();
    var44.show();
    boolean var47 = var44.isRequestFocusEnabled();
    java.awt.Dimension var48 = var44.minimumSize();
    var33.setToolBar((javax.swing.JToolBar)var44);
    java.awt.Image var52 = var33.createImage(10, (-1));
    var27.add((java.awt.Component)var28, (java.lang.Object)10);
    com.allenstudio.ir.ui.Toolbar var54 = new com.allenstudio.ir.ui.Toolbar();
    boolean var55 = var54.isFloatable();
    java.awt.Component var57 = var54.getComponentAtIndex(10);
    boolean var58 = var54.isLightweight();
    java.awt.Component var59 = var27.add((java.awt.Component)var54);
    com.allenstudio.ir.ui.NoteListsTabPane var60 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var61 = new com.allenstudio.ir.ui.Toolbar();
    boolean var62 = var61.isFloatable();
    var61.show();
    java.awt.image.ColorModel var64 = var61.getColorModel();
    boolean var65 = var61.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var66 = new com.allenstudio.ir.ui.DatePickerPane();
    var66.transferFocus();
    com.allenstudio.ir.ui.Toolbar var68 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var69 = var68.getColorModel();
    var68.setEnabled(true);
    java.awt.Component var73 = var68.getComponentAtIndex(1);
    boolean var74 = var68.isFloatable();
    var66.setContent((java.awt.Component)var68);
    java.awt.Dimension var76 = var66.size();
    com.allenstudio.ir.ui.Toolbar var77 = new com.allenstudio.ir.ui.Toolbar();
    boolean var78 = var77.isFloatable();
    var77.show();
    boolean var80 = var77.isRequestFocusEnabled();
    java.awt.Dimension var81 = var77.minimumSize();
    var66.setToolBar((javax.swing.JToolBar)var77);
    java.awt.Image var85 = var66.createImage(10, (-1));
    var60.add((java.awt.Component)var61, (java.lang.Object)10);
    var60.setSelectedIndex(1);
    javax.swing.plaf.TabbedPaneUI var89 = var60.getUI();
    javax.swing.SingleSelectionModel var90 = var60.getModel();
    var27.setModel(var90);
    var0.setModel(var90);
    java.awt.Rectangle var93 = var0.bounds();
    
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
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test313");


    com.allenstudio.ir.core.PluginManager var0 = com.allenstudio.ir.core.PluginManager.getInstance();
    java.lang.String[] var1 = var0.getAllPluginNames();
    java.lang.String[] var2 = var0.getAllPluginNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test314");


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
    com.allenstudio.ir.util.XmlElement var16 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var18 = var16.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var21 = var18.addSubElement("", "hi!");
    java.util.Hashtable var22 = var21.getAttributes();
    com.allenstudio.ir.ui.Toolbar var23 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var24 = var23.getColorModel();
    var23.setEnabled(true);
    java.awt.ComponentOrientation var27 = var23.getComponentOrientation();
    java.lang.Object var28 = var7.put((java.lang.Object)var22, (java.lang.Object)var27);
    com.allenstudio.ir.util.XmlElement var29 = new com.allenstudio.ir.util.XmlElement(" ", var7);
    com.allenstudio.ir.ui.DatePickerPane var30 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var31 = var30.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var32 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var33 = var32.getColorModel();
    java.awt.im.InputContext var34 = var32.getInputContext();
    java.awt.Component var36 = var32.getComponentAtIndex(0);
    var30.setToolBar((javax.swing.JToolBar)var32);
    boolean var39 = var30.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var40 = var30.getContentPaneBorder();
    com.allenstudio.ir.ui.MainFrame var41 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var42 = var41.getWarningString();
    java.awt.Rectangle var43 = var41.getMaximizedBounds();
    java.awt.MenuBar var44 = var41.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var45 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var46 = new com.allenstudio.ir.ui.Toolbar();
    boolean var47 = var46.isFloatable();
    var46.show();
    java.awt.image.ColorModel var49 = var46.getColorModel();
    boolean var50 = var46.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var51 = new com.allenstudio.ir.ui.DatePickerPane();
    var51.transferFocus();
    com.allenstudio.ir.ui.Toolbar var53 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var54 = var53.getColorModel();
    var53.setEnabled(true);
    java.awt.Component var58 = var53.getComponentAtIndex(1);
    boolean var59 = var53.isFloatable();
    var51.setContent((java.awt.Component)var53);
    java.awt.Dimension var61 = var51.size();
    com.allenstudio.ir.ui.Toolbar var62 = new com.allenstudio.ir.ui.Toolbar();
    boolean var63 = var62.isFloatable();
    var62.show();
    boolean var65 = var62.isRequestFocusEnabled();
    java.awt.Dimension var66 = var62.minimumSize();
    var51.setToolBar((javax.swing.JToolBar)var62);
    java.awt.Image var70 = var51.createImage(10, (-1));
    var45.add((java.awt.Component)var46, (java.lang.Object)10);
    var41.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var45);
    java.awt.event.ComponentListener[] var73 = var45.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var74 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var75 = var74.getDateBackground();
    var74.setYearMonth(1, (-1));
    java.util.Calendar var79 = var74.getSelectedDate();
    var45.remove((java.awt.Component)var74);
    var30.removeMouseListener((java.awt.event.MouseListener)var74);
    com.allenstudio.ir.ui.Toolbar var82 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var83 = var82.getColorModel();
    java.awt.im.InputContext var84 = var82.getInputContext();
    java.awt.Component var86 = var82.getComponentAtIndex(0);
    var82.revalidate();
    com.allenstudio.ir.ui.MainFrame var88 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var89 = var88.getWarningString();
    boolean var90 = var88.isAlwaysOnTopSupported();
    java.awt.Color var91 = var88.getBackground();
    var82.setForeground(var91);
    var74.setHeaderBackground(var91);
    boolean var94 = var7.containsKey((java.lang.Object)var91);
    java.lang.String var95 = var7.toString();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test315");


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
    int var41 = var16.countObservers();
    var16.deleteObservers();
    
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
    assertTrue(var41 == 0);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test316");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    var0.removeNotify();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var6 = var0.getFocusTraversalKeys(10);
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

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test317");


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
    com.allenstudio.ir.ui.StatusBar var31 = new com.allenstudio.ir.ui.StatusBar();
    var31.enable();
    boolean var33 = var31.isFocusOwner();
    var31.firePropertyChange("hi!", 10L, 0L);
    var31.layout();
    var31.removeAll();
    boolean var40 = var31.isFocusCycleRoot();
    boolean var41 = var2.isFocusCycleRoot((java.awt.Container)var31);
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test318");


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
    java.lang.String var18 = var0.getUIClassID();
    
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
    assertTrue("'" + var18 + "' != '" + "ComponentUI"+ "'", var18.equals("ComponentUI"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test319");


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
    com.allenstudio.ir.util.XmlElement var17 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var19 = var17.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var20 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var22 = var20.addSubElement("hi!");
    var22.notifyObservers((java.lang.Object)(byte)1);
    var17.append(var22);
    com.allenstudio.ir.util.XmlElement var28 = var17.addSubElement("C:\\boot.ini", "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    int var29 = var17.countObservers();
    com.allenstudio.ir.util.XmlElement var30 = var5.addSubElement(var17);
    var30.setData("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
    com.allenstudio.ir.util.XmlElement var33 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var35 = var33.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var36 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var38 = var36.addSubElement("hi!");
    var38.notifyObservers((java.lang.Object)(byte)1);
    var33.append(var38);
    com.allenstudio.ir.util.XmlElement var42 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var44 = var42.addSubElement("hi!");
    java.lang.String var46 = var42.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var47 = var38.addSubElement(var42);
    com.allenstudio.ir.util.XmlElement var48 = var47.getParent();
    com.allenstudio.ir.util.XmlIO var49 = new com.allenstudio.ir.util.XmlIO(var47);
    var49.endDocument();
    com.allenstudio.ir.util.XmlElement var51 = var49.getRoot();
    var30.setParent(var51);
    
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test320");


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
    java.awt.Insets var30 = var0.insets();
    var0.firePropertyChange(" ", '#', '#');
    int var36 = var0.indexOfTab("com.allenstudio.ir.ui.NoteListsTabPane[,0,0,0x0,invalid,layout=com.apple.laf.AquaTabbedPaneUI$AquaTruncatingTabbedPaneLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777568,maximumSize=,minimumSize=,preferredSize=,haveRegistered=false,tabPlacement=TOP]");
    
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
    assertTrue(var36 == (-1));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test321");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.core.plugins.CommonNote var1 = new com.allenstudio.ir.core.plugins.CommonNote();
    var1.resize(0, 1);
    com.allenstudio.ir.ui.NoteListCell var5 = new com.allenstudio.ir.ui.NoteListCell((com.allenstudio.ir.core.plugins.AbstractNote)var1);
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
    var1.repaint(var26);
    boolean var29 = var0.removeElement((com.allenstudio.ir.core.plugins.AbstractNote)var1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test322");


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
    com.allenstudio.ir.ui.MainFrame var24 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var25 = var24.getWarningString();
    java.awt.Rectangle var26 = var24.getMaximizedBounds();
    java.awt.MenuBar var27 = var24.getMenuBar();
    var24.removeNotify();
    var24.pack();
    var24.setFocusCycleRoot(false);
    var24.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var37 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var38 = var37.getWarningString();
    java.lang.String var39 = var37.getWarningString();
    boolean var40 = var37.isAutoRequestFocus();
    boolean var41 = var37.isResizable();
    javax.swing.JLayeredPane var42 = var37.getLayeredPane();
    int var43 = var42.getX();
    var24.setGlassPane((java.awt.Component)var42);
    int var45 = var5.getComponentIndex((java.awt.Component)var24);
    boolean var46 = var24.hasFocus();
    com.allenstudio.ir.ui.StatusBar var47 = new com.allenstudio.ir.ui.StatusBar();
    var47.enable();
    boolean var49 = var47.isFocusOwner();
    var47.firePropertyChange("hi!", 10L, 0L);
    var47.layout();
    var47.removeAll();
    java.awt.Point var56 = var47.getLocation();
    var24.setLocation(var56);
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test323");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    var2.setEnabled(true);
    java.awt.Component var7 = var2.getComponentAtIndex(1);
    boolean var8 = var2.isFloatable();
    var0.setContent((java.awt.Component)var2);
    var0.setSelected(true);
    java.lang.Object var12 = var0.getTreeLock();
    javax.accessibility.AccessibleContext var13 = var0.getAccessibleContext();
    java.beans.VetoableChangeListener[] var14 = var0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test324");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    var0.transferFocus();
    java.awt.Dimension var2 = var0.getMinimumSize();
    com.allenstudio.ir.ui.StatusBar var3 = new com.allenstudio.ir.ui.StatusBar();
    int var4 = var3.getY();
    javax.swing.JToolTip var5 = var3.createToolTip();
    float var6 = var5.getAlignmentY();
    java.awt.Color var7 = var5.getForeground();
    var0.setBackground(var7);
    java.awt.Component.BaselineResizeBehavior var9 = var0.getBaselineResizeBehavior();
    var0.setVerifyInputWhenFocusTarget(false);
    int var12 = var0.getDebugGraphicsOptions();
    javax.swing.border.Border var13 = var0.getContentPaneBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test325");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.lang.String var2 = var0.getWarningString();
    boolean var3 = var0.isAutoRequestFocus();
    boolean var4 = var0.isResizable();
    javax.swing.JRootPane var5 = var0.getRootPane();
    java.util.List var6 = var0.getIconImages();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var8 = var0.getFocusTraversalKeys(5);
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
    assertNotNull(var6);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test326");


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
    java.awt.Insets var30 = var0.insets();
    boolean var31 = var0.isBackgroundSet();
    var0.remove(3);
    int var34 = var0.getTabCount();
    
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
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 3);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test327");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    java.lang.String var1 = var0.getTitle();
    javax.swing.ActionMap var2 = var0.getActionMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Date Picker"+ "'", var1.equals("Date Picker"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test328");


    com.allenstudio.ir.ui.DefaultNoteListModel var0 = new com.allenstudio.ir.ui.DefaultNoteListModel();
    com.allenstudio.ir.ui.StatusBar var1 = new com.allenstudio.ir.ui.StatusBar();
    int var2 = var1.getY();
    javax.swing.JToolTip var3 = var1.createToolTip();
    float var4 = var3.getAlignmentY();
    java.awt.Color var5 = var3.getForeground();
    java.awt.event.MouseMotionListener[] var6 = var3.getMouseMotionListeners();
    com.allenstudio.ir.core.plugins.CommonNote var7 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var8 = var7.getFeature();
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
    java.awt.Point var22 = var7.getLocation(var20);
    var7.setOtherInfo("");
    var7.setFeature("Title");
    var7.removeNotify();
    com.allenstudio.ir.util.XmlElement var28 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var30 = var28.addSubElement("hi!");
    com.allenstudio.ir.util.XmlElement var31 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var33 = var31.addSubElement("hi!");
    var33.notifyObservers((java.lang.Object)(byte)1);
    var28.append(var33);
    com.allenstudio.ir.util.XmlElement var37 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var39 = var37.addSubElement("hi!");
    java.lang.String var41 = var37.getAttribute("C:\\boot.ini");
    com.allenstudio.ir.util.XmlElement var42 = var33.addSubElement(var37);
    java.lang.String var45 = var33.getAttribute("Title", "ToolBarUI");
    var3.putClientProperty((java.lang.Object)var7, (java.lang.Object)"Title");
    var7.doLayout();
    java.lang.String var48 = var7.getDescription();
    int var50 = var0.indexOf((com.allenstudio.ir.core.plugins.AbstractNote)var7, 556);
    boolean var51 = var0.isEmpty();
    java.util.Enumeration var52 = var0.elements();
    com.allenstudio.ir.core.plugins.CommonNote var53 = new com.allenstudio.ir.core.plugins.CommonNote();
    java.lang.String var54 = var53.getFeature();
    com.allenstudio.ir.ui.StatusBar var55 = new com.allenstudio.ir.ui.StatusBar();
    var55.enable();
    boolean var57 = var55.isFocusOwner();
    var55.firePropertyChange("hi!", 10L, 0L);
    var55.layout();
    var55.removeAll();
    com.allenstudio.ir.ui.StatusBar var64 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var65 = var64.getRootPane();
    java.awt.Point var66 = var64.location();
    java.awt.Component var67 = var55.getComponentAt(var66);
    java.awt.Point var68 = var53.getLocation(var66);
    java.awt.Container var69 = var53.getParent();
    java.lang.String var70 = var53.getFeature();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var72 = var0.lastIndexOf((com.allenstudio.ir.core.plugins.AbstractNote)var53, 6);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "C:\\boot.ini"+ "'", var8.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "ToolBarUI"+ "'", var45.equals("ToolBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"+ "'", var48.equals("This is a testing description. \u03E3\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\u073F\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "C:\\boot.ini"+ "'", var54.equals("C:\\boot.ini"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "C:\\boot.ini"+ "'", var70.equals("C:\\boot.ini"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test329");


    com.allenstudio.ir.ui.DatePickerPane var0 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var1 = var0.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.Toolbar var2 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var3 = var2.getColorModel();
    java.awt.im.InputContext var4 = var2.getInputContext();
    java.awt.Component var6 = var2.getComponentAtIndex(0);
    var0.setToolBar((javax.swing.JToolBar)var2);
    boolean var9 = var0.areFocusTraversalKeysSet(0);
    javax.swing.border.Border var10 = var0.getContentPaneBorder();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var12 = var11.getColorModel();
    var11.setEnabled(true);
    java.awt.Component var16 = var11.getComponentAtIndex(1);
    boolean var17 = var11.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var18 = var11.getFocusTraversalPolicy();
    java.beans.PropertyChangeListener[] var20 = var11.getPropertyChangeListeners("Date Picker");
    var11.setDoubleBuffered(false);
    boolean var25 = var11.contains(2015, (-1));
    com.allenstudio.ir.ui.Toolbar var26 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.event.MouseWheelListener[] var27 = var26.getMouseWheelListeners();
    java.awt.LayoutManager var28 = var26.getLayout();
    var11.setLayout(var28);
    var0.setLayout(var28);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test330");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    var0.dispose();
    java.awt.event.WindowStateListener[] var7 = var0.getWindowStateListeners();
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test331");


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
    com.allenstudio.ir.ui.Toolbar var60 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var61 = var60.getColorModel();
    var60.setEnabled(true);
    java.awt.ComponentOrientation var64 = var60.getComponentOrientation();
    boolean var65 = var60.isFloatable();
    java.lang.String var66 = var60.getUIClassID();
    var0.remove((java.awt.Component)var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTabPlacement(5);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "ToolBarUI"+ "'", var66.equals("ToolBarUI"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test332");


    com.allenstudio.ir.ui.calendar.MonthlyCalendar var0 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    var0.setWeekStartOnSunday(true);
    int var3 = var0.getMonth();
    com.allenstudio.ir.ui.StatusBar var4 = new com.allenstudio.ir.ui.StatusBar();
    boolean var5 = var4.isBackgroundSet();
    boolean var8 = var4.contains(10, 100);
    var4.revalidate();
    javax.swing.JToolTip var10 = var4.createToolTip();
    com.allenstudio.ir.ui.StatusBar var11 = new com.allenstudio.ir.ui.StatusBar();
    var11.enable();
    boolean var13 = var11.isFocusOwner();
    var11.firePropertyChange("hi!", 10L, 0L);
    var11.layout();
    java.awt.Dimension var19 = var11.getMaximumSize();
    java.awt.Dimension var20 = var4.getSize(var19);
    var0.setPreferredSize(var20);
    java.awt.Color var22 = var0.getDateBackground();
    java.awt.Color var23 = var0.getHighlightForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test333");


    com.allenstudio.ir.util.XmlElement var0 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var2 = var0.addSubElement("hi!");
    var2.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var5 = new com.allenstudio.ir.util.XmlElement();
    com.allenstudio.ir.util.XmlElement var7 = var5.addSubElement("hi!");
    var7.notifyObservers((java.lang.Object)(byte)1);
    com.allenstudio.ir.util.XmlElement var10 = var2.removeElement(var7);
    com.allenstudio.ir.util.XmlElement var11 = var7.getParent();
    com.allenstudio.ir.ui.StatusBar var12 = new com.allenstudio.ir.ui.StatusBar();
    var12.enable();
    boolean var14 = var12.isFocusOwner();
    var12.firePropertyChange("hi!", 10L, 0L);
    var12.layout();
    var12.removeAll();
    java.awt.GraphicsConfiguration var21 = var12.getGraphicsConfiguration();
    java.awt.Color var22 = var12.getBackground();
    boolean var23 = var11.equals((java.lang.Object)var12);
    java.awt.Insets var24 = var12.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test334");


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
    int var16 = var0.getExtendedState();
    java.awt.event.HierarchyListener[] var17 = var0.getHierarchyListeners();
    
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
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test335");


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
    com.allenstudio.ir.ui.StatusBar var31 = new com.allenstudio.ir.ui.StatusBar();
    var31.enable();
    boolean var33 = var31.isFocusOwner();
    var31.firePropertyChange("hi!", 10L, 0L);
    com.allenstudio.ir.ui.StatusBar var38 = new com.allenstudio.ir.ui.StatusBar();
    var38.enable();
    boolean var40 = var38.isFocusOwner();
    var38.firePropertyChange("hi!", 10L, 0L);
    var38.layout();
    var38.removeAll();
    com.allenstudio.ir.ui.StatusBar var47 = new com.allenstudio.ir.ui.StatusBar();
    javax.swing.JRootPane var48 = var47.getRootPane();
    java.awt.Point var49 = var47.location();
    java.awt.Component var50 = var38.getComponentAt(var49);
    java.awt.Component var51 = var31.getComponentAt(var49);
    java.awt.Point var52 = var0.getLocation(var49);
    int var53 = var0.getTabLayoutPolicy();
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test336");


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
    var11.resetHighlight();
    com.allenstudio.ir.ui.DatePickerPane var16 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.KeyStroke[] var17 = var16.getRegisteredKeyStrokes();
    com.allenstudio.ir.ui.DatePickerPane var18 = new com.allenstudio.ir.ui.DatePickerPane();
    javax.swing.plaf.PanelUI var19 = var18.getUI();
    var16.setUI(var19);
    com.allenstudio.ir.ui.calendar.DateChooser var21 = var16.getDateChooser();
    var21.removeDateChooserListener();
    var11.setHeaderComponent((javax.swing.JComponent)var21);
    javax.swing.JComponent var24 = var11.getHeaderComponent();
    com.allenstudio.ir.ui.DatePickerPane var25 = new com.allenstudio.ir.ui.DatePickerPane();
    var25.transferFocus();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var28 = var27.getColorModel();
    var27.setEnabled(true);
    java.awt.Component var32 = var27.getComponentAtIndex(1);
    boolean var33 = var27.isFloatable();
    var25.setContent((java.awt.Component)var27);
    java.awt.Dimension var35 = var25.size();
    com.allenstudio.ir.ui.Toolbar var36 = new com.allenstudio.ir.ui.Toolbar();
    boolean var37 = var36.isFloatable();
    var36.show();
    boolean var39 = var36.isRequestFocusEnabled();
    java.awt.Dimension var40 = var36.minimumSize();
    var25.setToolBar((javax.swing.JToolBar)var36);
    java.awt.Image var44 = var25.createImage(10, (-1));
    var25.setTitle("Date Picker");
    javax.swing.border.Border var47 = var25.getContentPaneBorder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.setBorder(var47);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test337");


    com.allenstudio.ir.ui.Toolbar var0 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var1 = var0.getColorModel();
    var0.setEnabled(true);
    java.awt.Component var5 = var0.getComponentAtIndex(1);
    boolean var6 = var0.isFloatable();
    javax.swing.InputMap var7 = var0.getInputMap();
    java.awt.event.InputMethodListener[] var8 = var0.getInputMethodListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOrientation(5);
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test338");


    com.allenstudio.ir.ui.MainFrame var0 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var1 = var0.getWarningString();
    java.awt.Rectangle var2 = var0.getMaximizedBounds();
    java.awt.MenuBar var3 = var0.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var4 = new com.allenstudio.ir.ui.NoteListsTabPane();
    var0.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var4);
    com.allenstudio.ir.ui.MainFrame var6 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var7 = var6.getWarningString();
    java.awt.Rectangle var8 = var6.getMaximizedBounds();
    java.awt.MenuBar var9 = var6.getMenuBar();
    com.allenstudio.ir.ui.NoteListsTabPane var10 = new com.allenstudio.ir.ui.NoteListsTabPane();
    com.allenstudio.ir.ui.Toolbar var11 = new com.allenstudio.ir.ui.Toolbar();
    boolean var12 = var11.isFloatable();
    var11.show();
    java.awt.image.ColorModel var14 = var11.getColorModel();
    boolean var15 = var11.isFocusCycleRoot();
    com.allenstudio.ir.ui.DatePickerPane var16 = new com.allenstudio.ir.ui.DatePickerPane();
    var16.transferFocus();
    com.allenstudio.ir.ui.Toolbar var18 = new com.allenstudio.ir.ui.Toolbar();
    java.awt.image.ColorModel var19 = var18.getColorModel();
    var18.setEnabled(true);
    java.awt.Component var23 = var18.getComponentAtIndex(1);
    boolean var24 = var18.isFloatable();
    var16.setContent((java.awt.Component)var18);
    java.awt.Dimension var26 = var16.size();
    com.allenstudio.ir.ui.Toolbar var27 = new com.allenstudio.ir.ui.Toolbar();
    boolean var28 = var27.isFloatable();
    var27.show();
    boolean var30 = var27.isRequestFocusEnabled();
    java.awt.Dimension var31 = var27.minimumSize();
    var16.setToolBar((javax.swing.JToolBar)var27);
    java.awt.Image var35 = var16.createImage(10, (-1));
    var10.add((java.awt.Component)var11, (java.lang.Object)10);
    var6.widgetChanged((com.allenstudio.ir.core.InspirentoWidget)var10);
    java.awt.event.ComponentListener[] var38 = var10.getComponentListeners();
    com.allenstudio.ir.ui.calendar.MonthlyCalendar var39 = new com.allenstudio.ir.ui.calendar.MonthlyCalendar();
    java.awt.Color var40 = var39.getDateBackground();
    var39.setYearMonth(1, (-1));
    java.util.Calendar var44 = var39.getSelectedDate();
    var10.remove((java.awt.Component)var39);
    var4.removeMouseListener((java.awt.event.MouseListener)var39);
    java.awt.Container var47 = var4.getFocusCycleRootAncestor();
    javax.swing.plaf.TabbedPaneUI var48 = var4.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test339");


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
    com.allenstudio.ir.ui.MainFrame var24 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var25 = var24.getWarningString();
    java.awt.Rectangle var26 = var24.getMaximizedBounds();
    java.awt.MenuBar var27 = var24.getMenuBar();
    var24.removeNotify();
    var24.pack();
    var24.setFocusCycleRoot(false);
    var24.reshape(32, 100, 0, 0);
    com.allenstudio.ir.ui.MainFrame var37 = new com.allenstudio.ir.ui.MainFrame();
    java.lang.String var38 = var37.getWarningString();
    java.lang.String var39 = var37.getWarningString();
    boolean var40 = var37.isAutoRequestFocus();
    boolean var41 = var37.isResizable();
    javax.swing.JLayeredPane var42 = var37.getLayeredPane();
    int var43 = var42.getX();
    var24.setGlassPane((java.awt.Component)var42);
    int var45 = var5.getComponentIndex((java.awt.Component)var24);
    javax.swing.JToolTip var46 = var5.createToolTip();
    javax.swing.JMenu var48 = var5.getMenu((-1));
    java.lang.String var49 = var5.getUIClassID();
    boolean var50 = var5.isSelected();
    boolean var51 = var5.isSelected();
    int var54 = var5.getBaseline(0, 100);
    
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "MenuBarUI"+ "'", var49.equals("MenuBarUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));

  }

}
