package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    boolean var0 = client.view.GameView.displayNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    messages.round.RoundTimeOneSecondLeftMsg var1 = new messages.round.RoundTimeOneSecondLeftMsg(10L);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    javax.swing.text.Keymap var1 = javax.swing.text.JTextComponent.removeKeymap("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    messages.global.GlobalChatMsg var2 = new messages.global.GlobalChatMsg("Project Chewbacca", "");

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    messages.global.InfoRequestMsg var1 = new messages.global.InfoRequestMsg((-1));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    client.GameWindow var1 = new client.GameWindow(true);
    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Rectangle var4 = var3.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var6 = var1.add((java.awt.Component)var3, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    db.DBGameUser var0 = new db.DBGameUser();
    java.lang.String var1 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "DBGameUser: null \tScore: null"+ "'", var1.equals("DBGameUser: null \tScore: null"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    java.awt.Frame[] var0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      client.gui.components.MyButton var1 = new client.gui.components.MyButton("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      client.gui.StartFrame var0 = client.gui.StartFrame.getInstance();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    boolean var3 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var1);
    client.GameWindow var4 = new client.GameWindow();
    client.GameWindow var6 = new client.GameWindow(true);
    java.awt.Dimension var7 = var6.minimumSize();
    var4.setMaximumSize(var7);
    var1.setMinimumSize(var7);
    boolean var10 = var1.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      client.gui.SessionLobby var0 = new client.gui.SessionLobby();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    client.GameWindow var1 = new client.GameWindow(true);
    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Rectangle var4 = var3.getBounds();
    boolean var5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    var1.remove((java.awt.Component)var3);
    client.GameWindow var8 = new client.GameWindow(true);
    java.awt.Font var9 = var8.getFont();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setComponentZOrder((java.awt.Component)var8, 1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    messages.session.SessionChatMsg var1 = new messages.session.SessionChatMsg("frame1");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    messages.global.SessionListMsg var0 = new messages.global.SessionListMsg();

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Font var2 = var1.getFont();
    var1.setResizable(true);
    boolean var5 = var1.isShowing();
    javax.accessibility.AccessibleContext var6 = var1.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.setExtendedState(1);
    var1.transferFocus();
    boolean var6 = var1.isMinimumSizeSet();
    boolean var7 = var1.isUndecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    boolean var3 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var1);
    client.GameWindow var4 = new client.GameWindow();
    client.GameWindow var6 = new client.GameWindow(true);
    java.awt.Dimension var7 = var6.minimumSize();
    var4.setMaximumSize(var7);
    var1.setMinimumSize(var7);
    var1.setResizable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      client.gui.ServerSelectionDialog var0 = new client.gui.ServerSelectionDialog();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.setExtendedState(1);
    var1.transferFocus();
    boolean var6 = var1.isMinimumSizeSet();
    java.lang.String var7 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "client.GameWindow[frame4,0,23,800x600,layout=java.awt.BorderLayout,title=Project Chewbacca,resizable,iconified,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,800x600,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", var7.equals("client.GameWindow[frame4,0,23,800x600,layout=java.awt.BorderLayout,title=Project Chewbacca,resizable,iconified,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,800x600,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.setExtendedState(1);
    var1.transferFocus();
    boolean var6 = var1.isMinimumSizeSet();
    java.awt.Dimension var7 = var1.preferredSize();
    var1.reshape(0, (-1), (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    client.GameWindow var1 = new client.GameWindow(true);
    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Rectangle var4 = var3.getBounds();
    boolean var5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    var1.remove((java.awt.Component)var3);
    boolean var7 = var3.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    int var1 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    client.GameWindow var1 = new client.GameWindow(true);
    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Rectangle var4 = var3.getBounds();
    boolean var5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    var1.remove((java.awt.Component)var3);
    java.awt.LayoutManager var7 = var1.getLayout();
    java.awt.Dimension var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.setRequestFocusEnabled(true);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.enable();
    java.awt.Dimension var4 = var1.preferredSize();
    var1.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    boolean var1 = var0.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.requestFocus();
    var1.layout();
    boolean var5 = var1.isLocationByPlatform();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.setAutoscrolls(true);
    boolean var3 = var0.isManagingFocus();
    int var4 = var0.getWidth();
    var0.setBounds((-1), 10, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.setAutoscrolls(true);
    java.awt.Component var3 = var0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    db.UserTest var0 = new db.UserTest();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.awt.Point var3 = var1.getLocationOnScreen();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.lang.String var7 = var5.getTitle();
    client.GameWindow var9 = new client.GameWindow(true);
    java.awt.Dimension var10 = var9.minimumSize();
    java.awt.Point var11 = var9.getLocationOnScreen();
    var5.setLocation(var11);
    java.awt.Point var13 = var1.getLocation(var11);
    client.GameWindow var15 = new client.GameWindow(true);
    java.awt.Dimension var16 = var15.minimumSize();
    java.lang.String var17 = var15.getTitle();
    client.GameWindow var19 = new client.GameWindow(true);
    java.awt.Dimension var20 = var19.minimumSize();
    java.awt.Point var21 = var19.getLocationOnScreen();
    var15.setLocation(var21);
    common.Bomb var23 = new common.Bomb(var21);
    client.ClientBomb var24 = new client.ClientBomb(var13, (common.GameObject)var23);
    int[] var25 = new int[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.setSpread(var25);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Project Chewbacca"+ "'", var7.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Project Chewbacca"+ "'", var17.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.awt.Point var3 = var1.getLocationOnScreen();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.lang.String var7 = var5.getTitle();
    client.GameWindow var9 = new client.GameWindow(true);
    java.awt.Dimension var10 = var9.minimumSize();
    java.awt.Point var11 = var9.getLocationOnScreen();
    var5.setLocation(var11);
    java.awt.Point var13 = var1.getLocation(var11);
    common.Player var14 = new common.Player(var13);
    client.GameWindow var16 = new client.GameWindow(true);
    java.awt.Dimension var17 = var16.minimumSize();
    java.awt.Point var18 = var16.getLocationOnScreen();
    client.GameWindow var20 = new client.GameWindow(true);
    java.awt.Dimension var21 = var20.minimumSize();
    java.lang.String var22 = var20.getTitle();
    client.GameWindow var24 = new client.GameWindow(true);
    java.awt.Dimension var25 = var24.minimumSize();
    java.awt.Point var26 = var24.getLocationOnScreen();
    var20.setLocation(var26);
    java.awt.Point var28 = var16.getLocation(var26);
    common.Player var29 = new common.Player(var28);
    boolean var30 = var14.collide((common.GameObject)var29);
    var29.setVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Project Chewbacca"+ "'", var7.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Project Chewbacca"+ "'", var22.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.requestFocus();
    boolean var2 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.enable();
    java.awt.Dimension var4 = var1.preferredSize();
    java.awt.Color var5 = var1.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      client.gui.GlobalLobby var0 = new client.gui.GlobalLobby();
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.hide();
    var1.setTitle("Project Chewbacca");
    var1.layout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var9 = var1.getBaseline((-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    client.GameWindow var1 = new client.GameWindow(true);
    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Rectangle var4 = var3.getBounds();
    boolean var5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    var1.remove((java.awt.Component)var3);
    java.awt.LayoutManager var7 = var1.getLayout();
    java.beans.PropertyChangeListener[] var8 = var1.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    java.lang.String var9 = var1.getName();
    client.GameWindow var10 = new client.GameWindow();
    client.GameWindow var12 = new client.GameWindow(true);
    java.awt.Dimension var13 = var12.minimumSize();
    var10.setMaximumSize(var13);
    var1.setSize(var13);
    java.awt.Dimension var16 = var1.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "frame5"+ "'", var9.equals("frame5"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    client.gui.Cash var0 = new client.gui.Cash();

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    java.awt.Dimension var3 = var1.getMinimumSize();
    var1.setFocusableWindowState(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    messages.round.TileHitPlayerMsg var1 = new messages.round.TileHitPlayerMsg(0);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.requestFocus();
    var1.layout();
    var1.setState(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    messages.global.GlobalChatMsg var1 = new messages.global.GlobalChatMsg("frame5");

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.nextFocus();
    var1.validate();
    java.awt.dnd.DropTarget var5 = var1.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    messages.round.PowerUpHitMsg var3 = new messages.round.PowerUpHitMsg(0, 10, 10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    client.GameWindow var1 = new client.GameWindow(true);
    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Rectangle var4 = var3.getBounds();
    boolean var5 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var3);
    var1.remove((java.awt.Component)var3);
    java.awt.LayoutManager var7 = var1.getLayout();
    java.awt.Component var10 = var1.getComponentAt((-1), 0);
    java.awt.Dimension var11 = var1.getSize();
    java.awt.event.MouseWheelListener[] var12 = var1.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.setEditable(true);
    var1.firePropertyChange("frame3", ' ', 'a');
    java.awt.Rectangle var9 = var1.modelToView(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.enable();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Rectangle var6 = var5.getBounds();
    java.awt.Insets var7 = var5.getInsets();
    java.util.Locale var8 = var5.getLocale();
    var1.setLocale(var8);
    var1.show();
    var1.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.enable();
    var1.enable(false);
    java.awt.Component var8 = var1.findComponentAt((-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Font var2 = var1.getFont();
    var1.toBack();
    java.awt.event.WindowStateListener[] var4 = var1.getWindowStateListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    client.GameWindow var0 = new client.GameWindow();
    client.GameWindow var2 = new client.GameWindow(true);
    java.awt.Dimension var3 = var2.minimumSize();
    var0.setMaximumSize(var3);
    javax.swing.JLayeredPane var5 = var0.getLayeredPane();
    boolean var6 = var5.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    db.DBException var1 = new db.DBException();
    db.DBException var2 = new db.DBException("", (java.lang.Throwable)var1);
    db.DBException var3 = new db.DBException();
    var2.addSuppressed((java.lang.Throwable)var3);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Font var2 = var1.getFont();
    var1.setResizable(true);
    client.GameWindow var6 = new client.GameWindow(true);
    java.awt.Dimension var7 = var6.minimumSize();
    var6.enable();
    java.awt.Dimension var9 = var6.preferredSize();
    var1.resize(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    boolean var3 = var1.isFocusable();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    var5.enable();
    client.GameWindow var9 = new client.GameWindow(true);
    java.awt.Rectangle var10 = var9.getBounds();
    java.awt.Insets var11 = var9.getInsets();
    java.util.Locale var12 = var9.getLocale();
    var5.setLocale(var12);
    var5.reshape(0, 0, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setContentPane((java.awt.Container)var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.setRequestFocusEnabled(true);
    javax.swing.JToolTip var4 = var1.createToolTip();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.setExtendedState(1);
    var1.transferFocus();
    boolean var6 = var1.isMinimumSizeSet();
    var1.firePropertyChange("", 1.0d, 100.0d);
    java.awt.Component.BaselineResizeBehavior var11 = var1.getBaselineResizeBehavior();
    var1.toFront();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    common.Bomb var9 = new common.Bomb(var7);
    var9.moveLeft();
    var9.setStopped(true);
    client.GameWindow var14 = new client.GameWindow(true);
    java.awt.Dimension var15 = var14.minimumSize();
    java.lang.String var16 = var14.getTitle();
    client.GameWindow var18 = new client.GameWindow(true);
    java.awt.Dimension var19 = var18.minimumSize();
    java.awt.Point var20 = var18.getLocationOnScreen();
    var14.setLocation(var20);
    common.Bomb var22 = new common.Bomb(var20);
    var22.moveLeft();
    var22.setStopped(true);
    var9.notifyObservers((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Project Chewbacca"+ "'", var16.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.setCursor(10);
    client.GameWindow var6 = new client.GameWindow(true);
    java.awt.Dimension var7 = var6.getMinimumSize();
    java.awt.Dimension var8 = var1.getSize(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    java.awt.Color var2 = var1.getDisabledTextColor();
    var1.setDragEnabled(true);
    javax.swing.InputMap var6 = var1.getInputMap(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.setEditable(true);
    var1.firePropertyChange("frame3", ' ', 'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var9 = var1.getInputMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    messages.global.JoinSessionMsg var2 = new messages.global.JoinSessionMsg("DBGameUser: null \tScore: null", "frame0");

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    messages.global.LoginMsg var2 = new messages.global.LoginMsg("client.GameWindow[frame4,0,23,800x600,layout=java.awt.BorderLayout,title=Project Chewbacca,resizable,iconified,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,800x600,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 1);
    var2.setUsername("DBGameUser: null \tScore: null");

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.awt.Point var3 = var1.getLocationOnScreen();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.lang.String var7 = var5.getTitle();
    client.GameWindow var9 = new client.GameWindow(true);
    java.awt.Dimension var10 = var9.minimumSize();
    java.awt.Point var11 = var9.getLocationOnScreen();
    var5.setLocation(var11);
    java.awt.Point var13 = var1.getLocation(var11);
    var1.setAutoRequestFocus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Project Chewbacca"+ "'", var7.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    client.GameWindow var3 = new client.GameWindow(true);
    java.awt.Dimension var4 = var3.minimumSize();
    java.awt.Point var5 = var3.getLocationOnScreen();
    client.GameWindow var7 = new client.GameWindow(true);
    java.awt.Dimension var8 = var7.minimumSize();
    java.lang.String var9 = var7.getTitle();
    client.GameWindow var11 = new client.GameWindow(true);
    java.awt.Dimension var12 = var11.minimumSize();
    java.awt.Point var13 = var11.getLocationOnScreen();
    var7.setLocation(var13);
    java.awt.Point var15 = var3.getLocation(var13);
    messages.round.NewTileMsg var20 = new messages.round.NewTileMsg(1, var15, "DBGameUser: null \tScore: null", false, true, false);
    messages.round.NewTileMsg var25 = new messages.round.NewTileMsg((-1), var15, "frame3", true, false, true);
    common.Player var26 = new common.Player(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Project Chewbacca"+ "'", var9.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    messages.global.JoinAckMsg var2 = new messages.global.JoinAckMsg(false, 100);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.setEditable(true);
    var1.firePropertyChange("frame3", ' ', 'a');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setColumns((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    java.lang.String var9 = var1.getName();
    client.GameWindow var10 = new client.GameWindow();
    client.GameWindow var12 = new client.GameWindow(true);
    java.awt.Dimension var13 = var12.minimumSize();
    var10.setMaximumSize(var13);
    var1.setSize(var13);
    client.GameWindow var17 = new client.GameWindow(true);
    java.awt.Dimension var18 = var17.minimumSize();
    java.lang.String var19 = var17.getTitle();
    client.GameWindow var21 = new client.GameWindow(true);
    java.awt.Dimension var22 = var21.minimumSize();
    java.awt.Point var23 = var21.getLocationOnScreen();
    var17.setLocation(var23);
    java.lang.String var25 = var17.getName();
    var17.show();
    boolean var27 = var17.isActive();
    var17.repaint(0, 10, 10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setGlassPane((java.awt.Component)var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "frame7"+ "'", var9.equals("frame7"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Project Chewbacca"+ "'", var19.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "frame8"+ "'", var25.equals("frame8"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.awt.Point var3 = var1.getLocationOnScreen();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.lang.String var7 = var5.getTitle();
    client.GameWindow var9 = new client.GameWindow(true);
    java.awt.Dimension var10 = var9.minimumSize();
    java.awt.Point var11 = var9.getLocationOnScreen();
    var5.setLocation(var11);
    java.awt.Point var13 = var1.getLocation(var11);
    client.GameWindow var15 = new client.GameWindow(true);
    java.awt.Dimension var16 = var15.minimumSize();
    java.lang.String var17 = var15.getTitle();
    client.GameWindow var19 = new client.GameWindow(true);
    java.awt.Dimension var20 = var19.minimumSize();
    java.awt.Point var21 = var19.getLocationOnScreen();
    var15.setLocation(var21);
    common.Bomb var23 = new common.Bomb(var21);
    client.ClientBomb var24 = new client.ClientBomb(var13, (common.GameObject)var23);
    boolean var25 = var23.isExploded();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Project Chewbacca"+ "'", var7.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Project Chewbacca"+ "'", var17.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Font var2 = var1.getFont();
    var1.toBack();
    boolean var4 = var1.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    common.Bomb var9 = new common.Bomb(var7);
    int var10 = var9.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    boolean var3 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var1);
    var1.firePropertyChange("Project Chewbacca", 0L, 0L);
    var1.firePropertyChange("frame6", (short)10, (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Image var1 = common.ResourceService.getImage("hi!");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    boolean var9 = var1.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.setAutoscrolls(true);
    boolean var3 = var0.isManagingFocus();
    int var4 = var0.getWidth();
    java.awt.Rectangle var5 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.hide();
    var1.setTitle("Project Chewbacca");
    var1.layout();
    boolean var7 = var1.isUndecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    common.Bomb var9 = new common.Bomb(var7);
    client.GameWindow var11 = new client.GameWindow(true);
    java.awt.Dimension var12 = var11.minimumSize();
    java.awt.Point var13 = var11.getLocationOnScreen();
    client.GameWindow var15 = new client.GameWindow(true);
    java.awt.Dimension var16 = var15.minimumSize();
    java.lang.String var17 = var15.getTitle();
    client.GameWindow var19 = new client.GameWindow(true);
    java.awt.Dimension var20 = var19.minimumSize();
    java.awt.Point var21 = var19.getLocationOnScreen();
    var15.setLocation(var21);
    java.awt.Point var23 = var11.getLocation(var21);
    client.GameWindow var25 = new client.GameWindow(true);
    java.awt.Dimension var26 = var25.minimumSize();
    java.lang.String var27 = var25.getTitle();
    client.GameWindow var29 = new client.GameWindow(true);
    java.awt.Dimension var30 = var29.minimumSize();
    java.awt.Point var31 = var29.getLocationOnScreen();
    var25.setLocation(var31);
    common.Bomb var33 = new common.Bomb(var31);
    client.ClientBomb var34 = new client.ClientBomb(var23, (common.GameObject)var33);
    common.Bomb var35 = new common.Bomb(var7, (common.GameObject)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Project Chewbacca"+ "'", var17.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Project Chewbacca"+ "'", var27.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.getMinimumSize();
    boolean var3 = var1.isMinimumSizeSet();
    var1.toFront();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    java.lang.String var9 = var1.getName();
    var1.show();
    boolean var11 = var1.isActive();
    java.awt.Dimension var12 = var1.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "frame9"+ "'", var9.equals("frame9"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.removeNotify();
    var1.setOpaque(false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.enable();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Rectangle var6 = var5.getBounds();
    java.awt.Insets var7 = var5.getInsets();
    java.util.Locale var8 = var5.getLocale();
    var1.setLocale(var8);
    var1.reshape(0, 0, 0, (-1));
    var1.enable(false);
    client.gui.components.MyTextField var18 = new client.gui.components.MyTextField("frame3");
    java.awt.Color var19 = var18.getDisabledTextColor();
    var18.setDragEnabled(true);
    boolean var22 = var1.isFocusCycleRoot((java.awt.Container)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    java.awt.Color var2 = var1.getDisabledTextColor();
    javax.swing.KeyStroke[] var3 = var1.getRegisteredKeyStrokes();
    var1.setFocusAccelerator('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.requestFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.image.VolatileImage var6 = var1.createVolatileImage(0, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    messages.global.StopServerMsg var0 = new messages.global.StopServerMsg();

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.setAutoscrolls(true);
    boolean var3 = var0.isManagingFocus();
    var0.setVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    db.BombermanDBService var0 = db.DBServiceFactory.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ArrayList var1 = var0.getTopTenGameUser();
      fail("Expected exception of type javax.persistence.PersistenceException");
    } catch (javax.persistence.PersistenceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Rectangle var2 = var1.getBounds();
    var1.setExtendedState(1);
    var1.transferFocus();
    boolean var6 = var1.isMinimumSizeSet();
    java.awt.Dimension var7 = var1.preferredSize();
    boolean var8 = var1.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.setEditable(true);
    var1.setEditable(false);
    client.gui.components.MyTextField var7 = new client.gui.components.MyTextField("frame3");
    var7.setEditable(true);
    javax.swing.DropMode var10 = var7.getDropMode();
    var1.setDropMode(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.removeNotify();
    var1.postActionEvent();
    int var4 = var1.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    var1.hide();
    var1.setTitle("Project Chewbacca");
    var1.layout();
    var1.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    var1.setEditable(true);
    java.awt.Dimension var4 = var1.getPreferredScrollableViewportSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    client.GameWindow var2 = new client.GameWindow(true);
    java.awt.Dimension var3 = var2.minimumSize();
    java.lang.String var4 = var2.getTitle();
    client.GameWindow var6 = new client.GameWindow(true);
    java.awt.Dimension var7 = var6.minimumSize();
    java.awt.Point var8 = var6.getLocationOnScreen();
    var2.setLocation(var8);
    client.GameWindow var11 = new client.GameWindow(true);
    java.awt.Dimension var12 = var11.minimumSize();
    java.lang.String var13 = var11.getTitle();
    client.GameWindow var15 = new client.GameWindow(true);
    java.awt.Dimension var16 = var15.minimumSize();
    java.awt.Point var17 = var15.getLocationOnScreen();
    var11.setLocation(var17);
    common.Bomb var19 = new common.Bomb(var17);
    messages.round.PlayerStateMsg var20 = new messages.round.PlayerStateMsg(100, var8, var17);
    client.ClientPlayer var22 = new client.ClientPlayer(var17, 10);
    client.GameWindow var24 = new client.GameWindow(true);
    java.awt.Dimension var25 = var24.minimumSize();
    java.lang.String var26 = var24.getTitle();
    client.GameWindow var28 = new client.GameWindow(true);
    java.awt.Dimension var29 = var28.minimumSize();
    java.awt.Point var30 = var28.getLocationOnScreen();
    var24.setLocation(var30);
    var22.setMoveVector(var30);
    var22.deleteObservers();
    client.view.GfxFactory var34 = new client.view.GfxFactory();
    client.view.PlayerView var35 = new client.view.PlayerView((common.Player)var22, var34);
    boolean var36 = var35.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Project Chewbacca"+ "'", var4.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Project Chewbacca"+ "'", var13.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Project Chewbacca"+ "'", var26.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    javax.accessibility.AccessibleContext var1 = var0.getAccessibleContext();
    java.beans.PropertyChangeListener[] var3 = var0.getPropertyChangeListeners("frame5");
    java.awt.Component var4 = var0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.awt.Point var3 = var1.getLocationOnScreen();
    var1.setName("frame3");
    boolean var6 = var1.isActive();
    var1.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    client.gui.components.MyTextField var0 = new client.gui.components.MyTextField();

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.setBounds(0, 100, 100, (-1));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.awt.Point var3 = var1.getLocationOnScreen();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.lang.String var7 = var5.getTitle();
    client.GameWindow var9 = new client.GameWindow(true);
    java.awt.Dimension var10 = var9.minimumSize();
    java.awt.Point var11 = var9.getLocationOnScreen();
    var5.setLocation(var11);
    java.awt.Point var13 = var1.getLocation(var11);
    client.GameWindow var15 = new client.GameWindow(true);
    java.awt.Dimension var16 = var15.minimumSize();
    java.lang.String var17 = var15.getTitle();
    client.GameWindow var19 = new client.GameWindow(true);
    java.awt.Dimension var20 = var19.minimumSize();
    java.awt.Point var21 = var19.getLocationOnScreen();
    var15.setLocation(var21);
    common.Bomb var23 = new common.Bomb(var21);
    client.ClientBomb var24 = new client.ClientBomb(var13, (common.GameObject)var23);
    client.GameWindow var26 = new client.GameWindow(true);
    java.awt.Dimension var27 = var26.minimumSize();
    java.lang.String var28 = var26.getTitle();
    client.GameWindow var30 = new client.GameWindow(true);
    java.awt.Dimension var31 = var30.minimumSize();
    java.awt.Point var32 = var30.getLocationOnScreen();
    var26.setLocation(var32);
    var24.notifyObservers((java.lang.Object)var32);
    var24.stop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Project Chewbacca"+ "'", var7.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Project Chewbacca"+ "'", var17.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "Project Chewbacca"+ "'", var28.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    client.gui.components.MyPanel var0 = new client.gui.components.MyPanel();
    var0.requestFocus();
    javax.swing.JRootPane var2 = var0.getRootPane();
    boolean var4 = var0.requestFocus(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    db.DBGameUser var0 = new db.DBGameUser();
    java.lang.String var1 = var0.getName();
    var0.setName("frame9");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    client.GameWindow var1 = new client.GameWindow(true);
    java.awt.Dimension var2 = var1.minimumSize();
    java.lang.String var3 = var1.getTitle();
    client.GameWindow var5 = new client.GameWindow(true);
    java.awt.Dimension var6 = var5.minimumSize();
    java.awt.Point var7 = var5.getLocationOnScreen();
    var1.setLocation(var7);
    common.Bomb var9 = new common.Bomb(var7);
    var9.moveLeft();
    var9.setStopped(true);
    boolean var13 = var9.isExploded();
    client.GameWindow var16 = new client.GameWindow(true);
    java.awt.Dimension var17 = var16.minimumSize();
    java.lang.String var18 = var16.getTitle();
    client.GameWindow var20 = new client.GameWindow(true);
    java.awt.Dimension var21 = var20.minimumSize();
    java.awt.Point var22 = var20.getLocationOnScreen();
    var16.setLocation(var22);
    client.GameWindow var25 = new client.GameWindow(true);
    java.awt.Dimension var26 = var25.minimumSize();
    java.lang.String var27 = var25.getTitle();
    client.GameWindow var29 = new client.GameWindow(true);
    java.awt.Dimension var30 = var29.minimumSize();
    java.awt.Point var31 = var29.getLocationOnScreen();
    var25.setLocation(var31);
    common.Bomb var33 = new common.Bomb(var31);
    messages.round.PlayerStateMsg var34 = new messages.round.PlayerStateMsg(100, var22, var31);
    client.ClientPlayer var36 = new client.ClientPlayer(var31, 10);
    client.GameWindow var38 = new client.GameWindow(true);
    java.awt.Dimension var39 = var38.minimumSize();
    java.lang.String var40 = var38.getTitle();
    client.GameWindow var42 = new client.GameWindow(true);
    java.awt.Dimension var43 = var42.minimumSize();
    java.awt.Point var44 = var42.getLocationOnScreen();
    var38.setLocation(var44);
    var36.setMoveVector(var44);
    var36.deleteObservers();
    client.view.GfxFactory var48 = new client.view.GfxFactory();
    client.view.PlayerView var49 = new client.view.PlayerView((common.Player)var36, var48);
    client.view.StatusView var50 = new client.view.StatusView((common.GameObject)var9, var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Project Chewbacca"+ "'", var3.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Project Chewbacca"+ "'", var18.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Project Chewbacca"+ "'", var27.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "Project Chewbacca"+ "'", var40.equals("Project Chewbacca"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    client.gui.components.MyTextField var1 = new client.gui.components.MyTextField("frame3");
    java.awt.Color var2 = var1.getDisabledTextColor();
    var1.setDragEnabled(true);
    client.GameWindow var6 = new client.GameWindow(true);
    client.GameWindow var8 = new client.GameWindow(true);
    java.awt.Rectangle var9 = var8.getBounds();
    boolean var10 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var8);
    var6.remove((java.awt.Component)var8);
    client.GameWindow var13 = new client.GameWindow(true);
    java.awt.Dimension var14 = var13.minimumSize();
    java.awt.Dimension var15 = var8.getSize(var14);
    client.GameWindow var17 = new client.GameWindow(true);
    java.awt.Rectangle var18 = var17.getBounds();
    var17.setExtendedState(1);
    var17.transferFocus();
    int var22 = var8.getComponentZOrder((java.awt.Component)var17);
    client.GameWindow var24 = new client.GameWindow(true);
    java.awt.Dimension var25 = var24.minimumSize();
    var24.enable();
    client.GameWindow var28 = new client.GameWindow(true);
    java.awt.Rectangle var29 = var28.getBounds();
    java.awt.Rectangle var30 = var24.getBounds(var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.add((java.awt.Component)var8, (java.lang.Object)var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

}
